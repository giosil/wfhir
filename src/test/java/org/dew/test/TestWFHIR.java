package org.dew.test;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

import org.dew.fhir.client.FHIRClient;

import org.dew.fhir.model.Address;
import org.dew.fhir.model.Bundle;
import org.dew.fhir.model.CodeableConcept;
import org.dew.fhir.model.Coding;
import org.dew.fhir.model.ContactDetail;
import org.dew.fhir.model.ContactPoint;
import org.dew.fhir.model.Element;
import org.dew.fhir.model.Identifier;
import org.dew.fhir.model.Narrative;
import org.dew.fhir.model.OperationOutcome;
import org.dew.fhir.model.Organization;
import org.dew.fhir.model.Resource;
import org.dew.fhir.model.ValueSet;
import org.dew.fhir.model.ValueSetCompose;
import org.dew.fhir.model.ValueSetComposeInclude;

import org.dew.fhir.services.FHIRRequest;
import org.dew.fhir.services.FHIRResponse;

import org.dew.fhir.util.FHIRSchema;
import org.dew.fhir.util.FHIRUtil;
import org.dew.fhir.util.FUtil;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public 
class TestWFHIR extends TestCase 
{
  public TestWFHIR(String testName) {
    super(testName);
  }
  
  public static Test suite() {
    return new TestSuite(TestWFHIR.class);
  }
  
  public 
  void testApp() 
  {
    String operation = System.getProperty("dew.test.op", "");
    
    if(operation == null || operation.length() == 0) {
      System.out.println("dew.test.op not setted (ex. -Ddew.test.op=client)");
      checkModel(false, false);
    }
    else if(operation.equalsIgnoreCase("model")) {
      checkModel(true, false);
    }
    else if(operation.equalsIgnoreCase("client")) {
      checkClient();
    }
    else {
      checkSerializationDeserialization();
    }
  }
  
  public 
  void checkSerializationDeserialization()
  {
    System.out.println("checkSerializationDeserialization()...");
    System.out.println("-------------------------------------------------");
    try {
      Organization res = new Organization("120201", "http://hl7.it/sid/fls", "120201", "ASL ROMA 1");
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
    System.out.println("-------------------------------------------------");
  }
  
  public 
  void checkClient()
  {
    System.out.println("checkClient()...");
    System.out.println("-------------------------------------------------");
    
    FHIRClient client = new FHIRClient("http://localhost:8080/wfhir/fhir");
    client.setBasicAuth("test", "test");
    
    try {
      FHIRRequest req = new FHIRRequest();
      
      System.out.println("read...");
      FHIRResponse res = client.read(req.type("organization").id("120201"));
      
      Resource resource = res.getResource();
      System.out.println("resource = " + resource);
      
      System.out.println("delete...");
      res = client.delete(req.type("organization").id("120201"));
      
      OperationOutcome outcome = res.getOutcome();
      System.out.println("outcome = " + outcome);
      
      System.out.println("search...");
      res = client.search(req.clear().type("organization").contains("name", "ROMA"));
      
      Bundle bundle = res.getBundle();
      System.out.println("bundle = " + bundle);
      if(bundle != null) {
        System.out.println("bundle.listURL() = " + bundle.listURL());
      }
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
    
    organization.setAddress(new Address[] { address });
    
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
  void checkModel(boolean traceObj, boolean traceFld)
  {
    System.out.println("checkModel(" + traceObj + "," + traceFld + ")...");
    System.out.println("-------------------------------------------------");
    List<String> missingObj = new ArrayList<String>();
    List<String> missingFld = new ArrayList<String>();
    List<String> invalidFld = new ArrayList<String>();
    List<String> bbElements = new ArrayList<String>();
    
    FHIRSchema fhirSchema = new FHIRSchema();
    
    List<String> listResources = fhirSchema.getAllResources();
    if(listResources == null || listResources.size() == 0) {
      System.out.println("No resources available");
      return;
    }
    
    for(int i = 0; i < listResources.size(); i++) {
      String objectName = listResources.get(i);
      
      Class<?> objectClass = FHIRSchema.getClassOf(objectName);
      if(objectClass == null) {
        if(traceObj) System.out.println(objectName + " (missing)");
        missingObj.add(objectName);
        continue;
      }
      
      if(traceObj) System.out.println(objectName);
      
      List<String> fields = fhirSchema.getFields(objectName);
      if(fields == null || fields.size() == 0) {
        if(traceFld) System.out.println("  No fields available");
        continue;
      }
      
      for(int j = 0; j < fields.size(); j++) {
        String field    = fields.get(j);
        String fhirType = fhirSchema.getType(objectName, field, bbElements);
        
        if(fhirType == null || fhirType.length() == 0) {
          if(traceFld) System.out.println("  " + FUtil.rpad(field, ' ', 25) + FUtil.rpad("?", ' ', 80) + " (no type available)");
          continue;
        }
        
        String classType = fhirSchema.getClassType(objectClass, field);
        if(classType == null) {
          if(traceFld) System.out.println("  " + FUtil.rpad(field, ' ', 25) + FUtil.rpad(fhirType, ' ', 80) + " (missing)");
          missingFld.add(objectName + "." + field);
          continue;
        }
        
        if(!fhirType.equals(classType)) {
          String note = " (schema=" + fhirType + ", class=" + classType + ")";
          invalidFld.add(objectName + "." + field + " " + note);
          
          if(traceFld) System.out.println("  " + FUtil.rpad(field, ' ', 25) + FUtil.rpad(fhirType, ' ', 80) + " (incorrect: " + classType + ")");
        }
        else {
          if(traceFld) System.out.println("  " + FUtil.rpad(field, ' ', 25) + FUtil.rpad(fhirType, ' ', 80));
        }
      }
    }
    if(traceObj || traceFld) System.out.println();
    
    // Check backboneElements
    for(int i = 0; i < bbElements.size(); i++) {
      String backboneElement = bbElements.get(i);
      
      Class<?> objectClass = FHIRSchema.getClassOf(backboneElement);
      if(objectClass == null) {
        continue;
      }
      List<String> fields = fhirSchema.getFields(backboneElement);
      if(fields == null || fields.size() == 0) {
        continue;
      }
      
      for(int j = 0; j < fields.size(); j++) {
        String field    = fields.get(j);
        String fhirType = fhirSchema.getType(backboneElement, field, bbElements);
        
        if(fhirType == null || fhirType.length() == 0) {
          continue;
        }
        String classType = fhirSchema.getClassType(objectClass, field);
        if(classType == null) {
          missingFld.add(backboneElement + "." + field + " *");
          continue;
        }
        
        if(!fhirType.equals(classType)) {
          boolean invalid = true;
          
          String root = getBackboneRoot(backboneElement);
          if(classType.startsWith(root)) {
            if(fhirType.endsWith("[]") && classType.endsWith("[]")) {
              invalid = false;
            }
            else if(!fhirType.endsWith("[]") && !classType.endsWith("[]")) {
              invalid = false;
            }
          }
          else if(fhirType.equals("org.dew.fhir.model.Quantity") && classType.equals("org.dew.fhir.model.SimpleQuantity")) {
            invalid = false;
          }
          else if(fhirType.equals("org.dew.fhir.model.Quantity[]") && classType.equals("org.dew.fhir.model.SimpleQuantity[]")) {
            invalid = false;
          }
          else if(fhirType.equals("org.dew.fhir.model.SimpleQuantity") && classType.equals("org.dew.fhir.model.Quantity")) {
            invalid = false;
          }
          else if(fhirType.equals("org.dew.fhir.model.SimpleQuantity[]") && classType.equals("org.dew.fhir.model.Quantity[]")) {
            invalid = false;
          }
          else if(fhirType.equals("org.dew.fhir.model.ResourceList") && classType.equals("org.dew.fhir.model.Resource")) {
            invalid = false;
          }
          else if(fhirType.equals("java.lang.String") && classType.equals("byte[]")) {
            invalid = false;
          }
          
          if(invalid) {
            String note = " (schema=" + fhirType + ", class=" + classType + ")";
            invalidFld.add(backboneElement + "." + field + " " + note + " *");
          }
        }
      }
    }
    System.out.println("### Missing objects [" + missingObj.size() + " of " + listResources.size() + "]:");
    for(int i = 0; i < missingObj.size(); i++) {
      System.out.println(missingObj.get(i));
    }
    System.out.println("### Missing fields [" + missingFld.size() + "]:");
    for(int i = 0; i < missingFld.size(); i++) {
      System.out.println(missingFld.get(i));
    }
    System.out.println("### Invalid fields [" + invalidFld.size() + "]:");
    for(int i = 0; i < invalidFld.size(); i++) {
      System.out.println(invalidFld.get(i));
    }
    System.out.println("-------------------------------------------------");
  }
  
  protected static
  String getBackboneRoot(String backboneElement)
  {
    if(backboneElement == null || backboneElement.length() == 0) {
      return "";
    }
    String result = null;
    int sep = backboneElement.indexOf('_');
    if(sep > 0) {
      result = backboneElement.substring(0, sep);
    }
    else {
      result = backboneElement;
    }
    if(result.indexOf('.') < 0) {
      return FHIRSchema.MODEL_PACKAGE + "." + result;
    }
    return result;
  }
}
