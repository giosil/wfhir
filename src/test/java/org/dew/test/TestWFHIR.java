package org.dew.test;

import java.util.GregorianCalendar;

import org.dew.fhir.model.Address;
import org.dew.fhir.model.CodeableConcept;
import org.dew.fhir.model.Coding;
import org.dew.fhir.model.ContactDetail;
import org.dew.fhir.model.ContactPoint;
import org.dew.fhir.model.Element;
import org.dew.fhir.model.Identifier;
import org.dew.fhir.model.Narrative;
import org.dew.fhir.model.Organization;
import org.dew.fhir.model.ValueSet;
import org.dew.fhir.model.ValueSetCompose;
import org.dew.fhir.model.ValueSetComposeInclude;

import org.dew.fhir.json.JSON;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class TestWFHIR extends TestCase {
  
  public TestWFHIR(String testName) {
    super(testName);
  }
  
  public static Test suite() {
    return new TestSuite(TestWFHIR.class);
  }
  
  public void testApp() {
    ValueSet valueSet = buildValueSetIstatDug();
    
    String jsonValueSet = JSON.stringify(valueSet);
    
    System.out.println(jsonValueSet);
    
    Organization organization = buildTestOrganization();
    
    String jsonOrganization = JSON.stringify(organization);
    
    System.out.println(jsonOrganization);
  }
  
  protected
  Organization buildTestOrganization()
  {
    Organization organization = new Organization();
    organization.setId("asl-020101");
    organization.setText(new Narrative("generated", "<div xmlns=\"http://www.w3.org/1999/xhtml\"><p><b>Generated Narrative</b></p><p><b>id</b>: asl-020101</p><p><b>identifier</b>: 020101, 101, 00177330073, 91001750073</p><p><b>active</b>: true</p><p><b>type</b>: <span title=\"Codes: {http://terminology.hl7.it/CodeSystem/it-tipoEntita asl}\">Azienda Sanitaria Locale</span></p><p><b>name</b>: AZIENDA U.S.L. VALLE D'AOSTA</p><p><b>telecom</b>: ph: (0165) 5431, fax: (0165) 544587, mailto: protocollo@pec.ausl.vda.it, http://www.ausl.vda.it</p><p><b>address</b>: VIA GUIDO REY 1 AOSTA VALLE D'AOSTA 11100 IT </p></div>"));
    organization.setIdentifier(buildOrganizationIdentifier("020101", "101", "00177330073", "91001750073"));
    organization.setActive(true);
    organization.setType(buildOrganizationType("http://terminology.hl7.it/CodeSystem/it-tipoEntita", "asl", "Azienda Sanitaria Locale"));
    organization.setName("AZIENDA U.S.L. VALLE D'AOSTA");
    organization.setTelecom(buildOrganizationTelecom("(0165) 5431", "(0165) 544587", "mailto: protocollo@pec.ausl.vda.it", "http://www.ausl.vda.it"));
    
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
    valueSet.setContact(buildValueSetContact("url", "http://hl7.it"));
    valueSet.setDescription("Registro delle Denominazioni Urbanistiche Generiche (DUG)");
    valueSet.setJurisdiction(buildValueSetJurisdiction("urn:iso:std:iso:3166", "IT"));
    valueSet.setCompose(buildValueSetCompose("http://registry.geodati.gov.it/dug"));
    return valueSet;
  }
  
  protected 
  ContactDetail[] buildValueSetContact(String telecomSystem, String telecomValue)
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
  Identifier[] buildOrganizationIdentifier(String fls, String asl, String partitaIva, String codiceFiscale)
  {
    Identifier id0 = new Identifier("http://hl7.it/sid/fls", fls);
    Identifier id1 = new Identifier("http://hl7.it/sid/vda/asl", asl);
    Identifier id2 = new Identifier("http://hl7.it/sid/partitaIva", partitaIva);
    Identifier id3 = new Identifier("http://hl7.it/sid/codiceFiscale", codiceFiscale);
    
    return new Identifier[] { id0, id1, id2, id3 };
  }
  
  protected 
  CodeableConcept[] buildOrganizationType(String system, String code, String display)
  {
    Coding coding = new Coding(system, code, display);
    
    CodeableConcept codeableConcept = new CodeableConcept();
    codeableConcept.setCoding(new Coding[] { coding });
    
    return new CodeableConcept[] { codeableConcept };
  }
  
  protected 
  ContactPoint[] buildOrganizationTelecom(String phone, String fax, String email, String url)
  {
    ContactPoint cp0 = new ContactPoint("phone", phone);
    ContactPoint cp1 = new ContactPoint("fax", fax);
    ContactPoint cp2 = new ContactPoint("email", email);
    ContactPoint cp3 = new ContactPoint("url", url);
    
    return new ContactPoint[] { cp0, cp1, cp2, cp3 };
  }
}
