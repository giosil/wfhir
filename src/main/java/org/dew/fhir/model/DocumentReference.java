package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 * 
 * A reference to a document of any kind for any purpose. Provides metadata about the document so that the document can be discovered and managed. 
 * The scope of a document is any seralized object with a mime-type, so includes formal patient centric documents (CDA), cliical notes, scanned paper, and non-patient specific documents like policy text.
 *
 * @see <a href="https://www.hl7.org/fhir/documentreference.html">DocumentReference</a>
 */
public 
class DocumentReference extends DomainResource implements Serializable 
{
  private static final long serialVersionUID = -4201630291682458460L;
  
  protected Identifier masterIdentifier;
  protected Identifier[] identifier;
  protected String status;
  protected String docStatus;
  protected CodeableConcept type;
  protected CodeableConcept[] category;
  protected Reference<Resource> subject;
  protected Date date;
  protected Reference<Resource>[] author;
  protected Reference<Resource> authenticator;
  protected Reference<Organization> custodian;
  protected DocumentReferenceRelatesTo[] relatesTo;
  protected String description;
  protected CodeableConcept[] securityLabel;
  protected DocumentReferenceContent[] content;
  protected DocumentReferenceContext context;
  
  public DocumentReference()
  {
    this.resourceType = "DocumentReference";
  }
  
  public DocumentReference(Identifier masterIdentifier)
  {
    this.resourceType = "DocumentReference";
    this.masterIdentifier = masterIdentifier;
  }

  public Identifier getMasterIdentifier() {
    return masterIdentifier;
  }

  public Identifier[] getIdentifier() {
    return identifier;
  }

  public String getStatus() {
    return status;
  }

  public String getDocStatus() {
    return docStatus;
  }

  public CodeableConcept getType() {
    return type;
  }

  public CodeableConcept[] getCategory() {
    return category;
  }

  public Reference<Resource> getSubject() {
    return subject;
  }

  public Date getDate() {
    return date;
  }

  public Reference<Resource>[] getAuthor() {
    return author;
  }

  public Reference<Resource> getAuthenticator() {
    return authenticator;
  }

  public Reference<Organization> getCustodian() {
    return custodian;
  }

  public DocumentReferenceRelatesTo[] getRelatesTo() {
    return relatesTo;
  }

  public String getDescription() {
    return description;
  }

  public CodeableConcept[] getSecurityLabel() {
    return securityLabel;
  }

  public DocumentReferenceContent[] getContent() {
    return content;
  }

  public DocumentReferenceContext getContext() {
    return context;
  }

  public void setMasterIdentifier(Identifier masterIdentifier) {
    this.masterIdentifier = masterIdentifier;
  }

  public void setIdentifier(Identifier[] identifier) {
    this.identifier = identifier;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public void setDocStatus(String docStatus) {
    this.docStatus = docStatus;
  }

  public void setType(CodeableConcept type) {
    this.type = type;
  }

  public void setCategory(CodeableConcept[] category) {
    this.category = category;
  }

  public void setSubject(Reference<Resource> subject) {
    this.subject = subject;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public void setAuthor(Reference<Resource>[] author) {
    this.author = author;
  }

  public void setAuthenticator(Reference<Resource> authenticator) {
    this.authenticator = authenticator;
  }

  public void setCustodian(Reference<Organization> custodian) {
    this.custodian = custodian;
  }

  public void setRelatesTo(DocumentReferenceRelatesTo[] relatesTo) {
    this.relatesTo = relatesTo;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public void setSecurityLabel(CodeableConcept[] securityLabel) {
    this.securityLabel = securityLabel;
  }

  public void setContent(DocumentReferenceContent[] content) {
    this.content = content;
  }

  public void setContext(DocumentReferenceContext context) {
    this.context = context;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof DocumentReference) {
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
    return "DocumentReference(" + id + "," + masterIdentifier + "," + status + "," + docStatus + "," + type + "," + date + ")";
  }
}
