package org.dew.test;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.InputStream;

import java.lang.reflect.Method;

import java.net.URL;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.dew.fhir.json.JSON;
import org.dew.fhir.model.*;

import org.dew.fhir.util.FHIRUtil;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public 
class TestWFHIR extends TestCase 
{
  public static final String[] ALL_OBJECTS = {"Account","ActivityDefinition","AdverseEvent","AllergyIntolerance","Appointment","AppointmentResponse","AuditEvent","Basic",
      "Binary","BiologicallyDerivedProduct","BodyStructure","Bundle","CapabilityStatement","CarePlan","CareTeam","CatalogEntry","ChargeItem",
      "ChargeItemDefinition","Claim","ClaimResponse","ClinicalImpression","CodeSystem","Communication","CommunicationRequest",
      "CompartmentDefinition","Composition","ConceptMap","Condition","Consent","Contract","Coverage","CoverageEligibilityRequest",
      "CoverageEligibilityResponse","DetectedIssue","Device","DeviceDefinition","DeviceMetric","DeviceRequest","DeviceUseStatement",
      "DiagnosticReport","DocumentManifest","DocumentReference","EffectEvidenceSynthesis","Encounter","Endpoint","EnrollmentRequest",
      "EnrollmentResponse","EpisodeOfCare","EventDefinition","Evidence","EvidenceVariable","ExampleScenario","ExplanationOfBenefit",
      "FamilyMemberHistory","Flag","Goal","GraphDefinition","Group","GuidanceResponse","HealthcareService","ImagingStudy","Immunization",
      "ImmunizationEvaluation","ImmunizationRecommendation","ImplementationGuide","InsurancePlan","Invoice","Library","Linkage","List",
      "Location","Measure","MeasureReport","Media","Medication","MedicationAdministration","MedicationDispense","MedicationKnowledge",
      "MedicationRequest","MedicationStatement","MedicinalProduct","MedicinalProductAuthorization","MedicinalProductContraindication",
      "MedicinalProductIndication","MedicinalProductIngredient","MedicinalProductInteraction","MedicinalProductManufactured","MedicinalProductPackaged",
      "MedicinalProductPharmaceutical","MedicinalProductUndesirableEffect","MessageDefinition","MessageHeader","MolecularSequence","NamingSystem",
      "NutritionOrder","Observation","ObservationDefinition","OperationDefinition","OperationOutcome","Organization","OrganizationAffiliation",
      "Parameters","Patient","PaymentNotice","PaymentReconciliation","Person","PlanDefinition","Practitioner","PractitionerRole","Procedure",
      "Provenance","Questionnaire","QuestionnaireResponse","RelatedPerson","RequestGroup","ResearchDefinition","ResearchElementDefinition",
      "ResearchStudy","ResearchSubject","RiskAssessment","RiskEvidenceSynthesis","Schedule","SearchParameter","ServiceRequest","Slot",
      "Specimen","SpecimenDefinition","StructureDefinition","StructureMap","Subscription","Substance","SubstanceNucleicAcid","SubstancePolymer",
      "SubstanceProtein","SubstanceReferenceInformation","SubstanceSourceMaterial","SubstanceSpecification","SupplyDelivery","SupplyRequest","Task",
      "TerminologyCapabilities","TestReport","TestScript","ValueSet","VerificationResult","VisionPrescription"};
  
  //                                           DomainResource                                         Resource
  public static final String[] BASE_FIELDS = {"text", "contained", "extension", "modifierExtension", "id", "meta", "implicitRules", "language", "resourceType"};

  public static final String[] KEYWORDS = {"class", "abstract", "for"};

  public TestWFHIR(String testName) {
    super(testName);
  }
  
  public static Test suite() {
    return new TestSuite(TestWFHIR.class);
  }
  
  public 
  void testApp() 
  {
    // example();
    
    checkModel();
  }
  
  public 
  void example() 
  {
    try {
      Organization res = new Organization("asl-120201", "http://hl7.it/sid/fls", "120201", "ASL ROMA 1");
      System.out.println(res);
      
      String json = FHIRUtil.serialize(res, "application/fhir+json");
      System.out.println(json);
      
      String xml  = FHIRUtil.serialize(res, "application/fhir+xml");
      System.out.println(xml);
      
      Organization o1 = FHIRUtil.deserialize(json, Organization.class);
      System.out.println(o1);
      
      Organization o2 = FHIRUtil.deserialize(xml, Organization.class);
      System.out.println(o2);
    }
    catch(Exception ex) {
      ex.printStackTrace();
    }
  }
  
  protected
  void doSerialize(Object resource)
  {
    String serialized = null;
    
    System.out.println(resource + " -> xml...\n");
    serialized = FHIRUtil.serialize(resource, FHIRUtil.CONTENT_TYPE_XML);
    System.out.println(serialized + "\n");
    
    System.out.println(resource + " -> json...\n");
    serialized = FHIRUtil.serialize(resource, FHIRUtil.CONTENT_TYPE_JSON);
    System.out.println(serialized);
    System.out.println("-------------------------------------------------");
  }
  
  protected
  Organization buildTestOrganization()
  {
    Organization organization = new Organization();
    organization.setId("asl-020101");
    organization.setText(new Narrative("generated", "<div xmlns=\"http://www.w3.org/1999/xhtml\"><p><b>Generated Narrative</b></p><p><b>id</b>: asl-020101</p><p><b>identifier</b>: 020101, 101, 00177330073, 91001750073</p><p><b>active</b>: true</p><p><b>type</b>: <span title=\"Codes: {http://terminology.hl7.it/CodeSystem/it-tipoEntita asl}\">Azienda Sanitaria Locale</span></p><p><b>name</b>: AZIENDA U.S.L. VALLE D'AOSTA</p><p><b>telecom</b>: ph: (0165) 5431, fax: (0165) 544587, mailto: protocollo@pec.ausl.vda.it, http://www.ausl.vda.it</p><p><b>address</b>: VIA GUIDO REY 1 AOSTA VALLE D'AOSTA 11100 IT </p></div>"));
    organization.setIdentifier(buildOrganizationIdentifier("020101", "101", "00177330073", "91001750073"));
    organization.setActive(true);
    organization.setType(buildArrayOfCodeableConcept("http://terminology.hl7.it/CodeSystem/it-tipoEntita", "asl", "Azienda Sanitaria Locale"));
    organization.setName("AZIENDA U.S.L. VALLE D'AOSTA");
    organization.setTelecom(buildArrayOfContactPoint("(0165) 5431", "(0165) 544587", "mailto: protocollo@pec.ausl.vda.it", "http://www.ausl.vda.it"));
    
    Address address = new Address("VIA GUIDO REY 1", "AOSTA", "AO", "VALLE D'AOSTA", "11100", "IT");
    address.set_city(new Element("http://hl7.org/fhir/StructureDefinition/iso21090-SC-coding", "http://terminology.hl7.it/CodeSystem/istat-unitaAmministrativeTerritoriali", "007003", "AOSTA"));
    address.set_state(new Element("http://hl7.org/fhir/StructureDefinition/iso21090-SC-coding", "http://terminology.hl7.it/CodeSystem/minsan-regione", "020", "VALLE D'AOSTA"));
    
    organization.setAddress(address);
    
    return organization;
  }
  
  protected 
  ValueSet buildValueSetIstatDug()
  {
    ValueSet valueSet = new ValueSet();
    valueSet.setId("istat-dug");
    valueSet.setText(new Narrative("generated", "<div xmlns=\"http://www.w3.org/1999/xhtml\"><ul><li>Include all codes defined in <a href=\"CodeSystem-dug.html\"><code>http://registry.geodati.gov.it/dug</code></a></li></ul></div>"));
    valueSet.setUrl("http://hl7.it/fhir/ValueSet/istat-dug");
    valueSet.setVersion("0.1.0");
    valueSet.setName("VsIstatDug");
    valueSet.setTitle("ISTAT - DUG");
    valueSet.setStatus("active");
    valueSet.setDate(new GregorianCalendar(2020, 5, 30, 18, 23, 29).getTime());
    valueSet.setPublisher("HL7 Italia");
    valueSet.setContact(buildArrayOfContactDetail("url", "http://hl7.it"));
    valueSet.setDescription("Registro delle Denominazioni Urbanistiche Generiche (DUG)");
    valueSet.setJurisdiction(buildValueSetJurisdiction("urn:iso:std:iso:3166", "IT"));
    valueSet.setCompose(buildValueSetCompose("http://registry.geodati.gov.it/dug"));
    return valueSet;
  }
  
  protected 
  ContactDetail[] buildArrayOfContactDetail(String telecomSystem, String telecomValue)
  {
    ContactPoint contactPoint = new ContactPoint(telecomSystem, telecomValue);
    
    ContactDetail contactDetail = new ContactDetail();
    contactDetail.setTelecom(new ContactPoint[] { contactPoint });
    
    return new ContactDetail[] { contactDetail };
  }
  
  protected 
  CodeableConcept[] buildValueSetJurisdiction(String system, String code)
  {
    Coding coding = new Coding(system, code);
    
    CodeableConcept codeableConcept = new CodeableConcept();
    codeableConcept.setCoding(new Coding[] { coding });
    
    return new CodeableConcept[] { codeableConcept };
  }
  
  protected
  ValueSetCompose buildValueSetCompose(String includeSystem)
  {
    ValueSetComposeInclude include = new ValueSetComposeInclude(includeSystem);
    
    ValueSetCompose valueSetCompose = new ValueSetCompose();
    valueSetCompose.setInclude(new ValueSetComposeInclude[] { include });
    
    return valueSetCompose;
  }
  
  protected
  Identifier[] buildOrganizationIdentifier(String codiceMin, String codiceReg, String partitaIva, String codiceFiscale)
  {
    Identifier id0 = new Identifier("http://hl7.it/sid/fls",           codiceMin);
    Identifier id1 = new Identifier("http://hl7.it/sid/vda/asl",       codiceReg);
    Identifier id2 = new Identifier("http://hl7.it/sid/partitaIva",    partitaIva);
    Identifier id3 = new Identifier("http://hl7.it/sid/codiceFiscale", codiceFiscale);
    
    return new Identifier[] { id0, id1, id2, id3 };
  }
  
  protected 
  CodeableConcept[] buildArrayOfCodeableConcept(String system, String code, String display)
  {
    Coding coding = new Coding(system, code, display);
    
    CodeableConcept codeableConcept = new CodeableConcept();
    codeableConcept.setCoding(new Coding[] { coding });
    
    return new CodeableConcept[] { codeableConcept };
  }
  
  protected 
  ContactPoint[] buildArrayOfContactPoint(String phone, String fax, String email, String url)
  {
    List<ContactPoint> listContactPoint = new ArrayList<ContactPoint>();
    
    if(phone != null && phone.length() > 3) {
      listContactPoint.add(new ContactPoint("phone", phone));
    }
    if(fax != null && fax.length() > 3) {
      listContactPoint.add(new ContactPoint("fax", phone));
    }
    if(email != null && email.length() > 5 && email.indexOf('@') > 0 && email.indexOf('.') > 0) {
      listContactPoint.add(new ContactPoint("email", phone));
    }
    if(url != null && url.length() > 5) {
      listContactPoint.add(new ContactPoint("url",   url));
    }
    
    ContactPoint[] result = new ContactPoint[listContactPoint.size()];
    
    for(int i = 0; i < listContactPoint.size(); i++) {
      result[i] = listContactPoint.get(i);
    }
    
    return result;
  }
  
  protected
  void checkModel()
  {
    List<String> missingObj = new ArrayList<String>();
    List<String> missingFld = new ArrayList<String>();
    int countObj = 0;
    
    Map<String, Object> mapSchema = loadSchema();
    
    for(int i = 0; i < ALL_OBJECTS.length; i++) {
      String objectName = ALL_OBJECTS[i];
      try {
        Class<?> objectClass = Class.forName("org.dew.fhir.model." + objectName);
        System.out.println(objectName);
        countObj++;
        
        Method[] methods = objectClass.getMethods();
        
        if(mapSchema != null) {
          List<String> fields = getObjectFields(mapSchema, objectName);
          
          if(fields != null && fields.size() > 0) {
            for(int j = 0; j < fields.size(); j++) {
              String field = fields.get(j);
              
              String setMethod = null;
              if(field.length() > 1) {
                setMethod = "set" + field.substring(0, 1).toUpperCase() + field.substring(1);
              }
              else {
                setMethod = "set" + field.toUpperCase();
              }
              
              boolean found = false;
              for(int k = 0; k < methods.length; k++) {
                Method method = methods[k];
                String methodName = method.getName();
                
                
                if(methodName.equals(setMethod)) {
                  found = true;
                  break;
                }
              }
              
              if(found) {
                System.out.println("\t" + field);
              }
              else {
                System.out.println("\t" + field + " (missing)");
                missingFld.add(objectName + "." + field);
              }
            }
          }
        }
      }
      catch(Exception ex) {
        System.out.println(objectName + " (missing)");
        missingObj.add(objectName);
      }
    }
    
    System.out.println("\nMissing objects:\n");
    for(int i = 0; i < missingObj.size(); i++) {
      System.out.println(missingObj.get(i));
    }
    
    System.out.println("\nMissing fields:\n");
    for(int i = 0; i < missingFld.size(); i++) {
      System.out.println(missingFld.get(i));
    }
    
    System.out.println("Implemented    : " + countObj);
    System.out.println("Missing        : " + missingObj.size());
    System.out.println("Missing fields : " + missingFld.size());
  }
  
  protected
  Map<String, Object> loadSchema()
  {
    Map<String, Object> result = null;
    try {
      byte[] fhir_schema = readFile("fhir.schema.json");
      
      result = JSON.parseObj(new String(fhir_schema));
    }
    catch(Exception ex) {
      ex.printStackTrace();
    }
    
    return result;
  }
  
  protected static
  byte[] readFile(String sFile)
    throws Exception
  {
    int iFileSep = sFile.indexOf('/');
    if(iFileSep < 0) iFileSep = sFile.indexOf('\\');
    InputStream is = null;
    if(iFileSep < 0) {
      URL url = Thread.currentThread().getContextClassLoader().getResource(sFile);
      is = url.openStream();
    }
    else {
      is = new FileInputStream(sFile);
    }
    try {
      int n;
      ByteArrayOutputStream baos = new ByteArrayOutputStream();
      byte[] buff = new byte[1024];
      while((n = is.read(buff)) > 0) baos.write(buff, 0, n);
      return baos.toByteArray();
    }
    finally {
      if(is != null) try{ is.close(); } catch(Exception ex) {}
    }
  }
  
  protected static
  List<String> getObjectFields(Map<String, Object> mapSchema, String objName)
    throws Exception
  {
    Map<String, Object> definitions = getMap(mapSchema, "definitions");
    
    Map<String, Object> resourceDef = getMap(definitions, objName);
    
    return getFields(resourceDef, "properties");
  }
  
  @SuppressWarnings("unchecked")
  protected static
  Map<String, Object> getMap(Map<String, Object> map, String key)
    throws Exception
  {
    if(map == null) return new HashMap<String, Object>();
    Object result = map.get(key);
    if(result instanceof Map) {
      return (Map<String, Object>) result;
    }
    return new HashMap<String, Object>(); 
  }
  
  protected static
  List<String> getFields(Map<String, Object> map, String key)
    throws Exception
  {
    Map<String, Object> mapResult = getMap(map, key);
    
    List<String> result = new ArrayList<String>();
    
    Iterator<String> iterator = mapResult.keySet().iterator();
    while(iterator.hasNext()) {
      String field = iterator.next();
      
      if(field.startsWith("_")) continue;
      
      boolean isBaseField = false;
      for(int i = 0; i < BASE_FIELDS.length; i++) {
        if(field.equals(BASE_FIELDS[i])) {
          isBaseField = true;
          break;
        }
      }
      if(isBaseField) continue;
      
      boolean isKeyword = false;
      for(int i = 0; i < KEYWORDS.length; i++) {
        if(field.equals(KEYWORDS[i])) {
          isKeyword = true;
          break;
        }
      }
      if(isKeyword) field += "_";
      
      result.add(field);
    }
    
    return result;
  }
}
