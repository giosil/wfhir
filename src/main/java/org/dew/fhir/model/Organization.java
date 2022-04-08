package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * A formally or informally recognized grouping of people or organizations formed for the purpose of achieving some form of collective action. 
 * Includes companies, institutions, corporations, departments, community groups, healthcare practice groups, payer/insurer, etc.
 *
 * @see <a href="https://www.hl7.org/fhir/organization.html">Organization</a>
 */
public 
class Organization extends DomainResource implements Serializable
{
  private static final long serialVersionUID = 1479043036079896361L;
  
  protected Identifier[] identifier;
  protected Boolean active;
  protected CodeableConcept[] type;
  protected String name;
  protected String[] alias;
  protected ContactPoint[] telecom;
  protected Address[] address;
  protected Reference<Organization> partOf;
  protected OrganizationContact[] contact;
  protected Reference<Endpoint>[] endpoint;
  
  public Organization()
  {
    this.resourceType = "Organization";
  }
  
  public Organization(String id, String identifierSystem, String identifierValue)
  {
    this.resourceType = "Organization";
    this.id = id;
    if(identifierValue != null) {
      this.identifier = new Identifier[] { new Identifier(identifierSystem, identifierValue) };
    }
    this.active = true;
  }
  
  public Organization(String id, Identifier singleIdentifier)
  {
    this.resourceType = "Organization";
    this.id = id;
    this.identifier = new Identifier[] { singleIdentifier };
    this.active = true;
  }
  
  public Organization(String id, String identifierSystem, String identifierValue, String name)
  {
    this.resourceType = "Organization";
    this.id = id;
    if(identifierValue != null) {
      this.identifier = new Identifier[] { new Identifier(identifierSystem, identifierValue) };
    }
    this.name = name;
    this.active = true;
  }
  
  public Organization(String id, Identifier singleIdentifier, String name)
  {
    this.resourceType = "Organization";
    this.id = id;
    this.identifier = new Identifier[] { singleIdentifier };
    this.name = name;
    this.active = true;
  }
  
  public Identifier[] getIdentifier() {
    return identifier;
  }

  public Boolean getActive() {
    return active;
  }

  public CodeableConcept[] getType() {
    return type;
  }

  public String getName() {
    return name;
  }

  public String[] getAlias() {
    return alias;
  }

  public ContactPoint[] getTelecom() {
    return telecom;
  }

  public Address[] getAddress() {
    return address;
  }

  public Reference<Organization> getPartOf() {
    return partOf;
  }

  public OrganizationContact[] getContact() {
    return contact;
  }

  public Reference<Endpoint>[] getEndpoint() {
    return endpoint;
  }

  public void setIdentifier(Identifier[] identifier) {
    this.identifier = identifier;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public void setType(CodeableConcept[] type) {
    this.type = type;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setAlias(String[] alias) {
    this.alias = alias;
  }

  public void setTelecom(ContactPoint[] telecom) {
    this.telecom = telecom;
  }

  public void setAddress(Address[] address) {
    this.address = address;
  }

  public void setPartOf(Reference<Organization> partOf) {
    this.partOf = partOf;
  }

  public void setContact(OrganizationContact[] contact) {
    this.contact = contact;
  }

  public void setEndpoint(Reference<Endpoint>[] endpoint) {
    this.endpoint = endpoint;
  }

  @Override
  public boolean equals(Object object) {
    if(object instanceof Organization) {
      return this.hashCode() == object.hashCode();
    }
    return false;
  }
  
  @Override
  public int hashCode() {
    if(id == null) return 0;
    return id.hashCode();
  }
  
  @Override
  public String toString() {
    return "Organization(" + id + "," + name + ")";
  }
}
