package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * The technical details of an endpoInteger that can be used for electronic services, such as for web services providing XDS.b or a REST endpoInteger for another FHIR server. 
 * This may include any security context information.
 *
 *  @see <a href="https://www.hl7.org/fhir/endpoint.html">Endpoint</a>
 */
public 
class Endpoint extends DomainResource implements Serializable 
{
  private static final long serialVersionUID = 1355516068555033081L;
  
  protected Identifier[] identifier;
  protected String status;
  protected Coding connectionType;
  protected String name;
  protected Reference<Organization> managingOrganization;
  protected ContactPoint[] contact;
  protected Period period;
  protected CodeableConcept[] payloadType;
  protected String[] payloadMimeType;
  protected String address;
  protected String[] header;
  
  public Endpoint()
  {
    this.resourceType = "Endpoint";
  }
  
  public Endpoint(String name)
  {
    this.resourceType = "Endpoint";
    this.name = name;
  }
  
  public Identifier[] getIdentifier() {
    return identifier;
  }

  public String getStatus() {
    return status;
  }

  public Coding getConnectionType() {
    return connectionType;
  }

  public String getName() {
    return name;
  }

  public Reference<Organization> getManagingOrganization() {
    return managingOrganization;
  }

  public ContactPoint[] getContact() {
    return contact;
  }

  public Period getPeriod() {
    return period;
  }

  public CodeableConcept[] getPayloadType() {
    return payloadType;
  }

  public String[] getPayloadMimeType() {
    return payloadMimeType;
  }

  public String getAddress() {
    return address;
  }

  public String[] getHeader() {
    return header;
  }

  public void setIdentifier(Identifier[] identifier) {
    this.identifier = identifier;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public void setConnectionType(Coding connectionType) {
    this.connectionType = connectionType;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setManagingOrganization(Reference<Organization> managingOrganization) {
    this.managingOrganization = managingOrganization;
  }

  public void setContact(ContactPoint[] contact) {
    this.contact = contact;
  }

  public void setPeriod(Period period) {
    this.period = period;
  }

  public void setPayloadType(CodeableConcept[] payloadType) {
    this.payloadType = payloadType;
  }

  public void setPayloadMimeType(String[] payloadMimeType) {
    this.payloadMimeType = payloadMimeType;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public void setHeader(String[] header) {
    this.header = header;
  }

  @Override
  public boolean equals(Object object) {
    if(object instanceof Endpoint) {
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
    return "Endpoint(" + id + "," + name + "," + address + ")";
  }
}
