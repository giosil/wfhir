package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 * 
 * A collection of documents compiled for a purpose together with metadata that applies to the collection.
 *
 * @see <a href="https://www.hl7.org/fhir/documentmanifest.html">DocumentManifest</a>
 */
public 
class DocumentManifest extends DomainResource implements Serializable 
{
  private static final long serialVersionUID = 8136540453133902418L;
  
  protected Identifier masterIdentifier;
  protected Identifier[] identifier;
  protected String status;
  protected CodeableConcept type;
  protected Reference<Resource> subject;
  protected Date created;
  protected Reference<Resource>[] author;
  protected Reference<Resource>[] recipient;
  protected String source;
  protected String description;
  protected Reference<Resource>[] content;
  protected DocumentManifestRelated[] related;
  
  public DocumentManifest()
  {
    this.resourceType = "DocumentManifest";
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

  public CodeableConcept getType() {
    return type;
  }

  public Reference<Resource> getSubject() {
    return subject;
  }

  public Date getCreated() {
    return created;
  }

  public Reference<Resource>[] getAuthor() {
    return author;
  }

  public Reference<Resource>[] getRecipient() {
    return recipient;
  }

  public String getSource() {
    return source;
  }

  public String getDescription() {
    return description;
  }

  public Reference<Resource>[] getContent() {
    return content;
  }

  public DocumentManifestRelated[] getRelated() {
    return related;
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

  public void setType(CodeableConcept type) {
    this.type = type;
  }

  public void setSubject(Reference<Resource> subject) {
    this.subject = subject;
  }

  public void setCreated(Date created) {
    this.created = created;
  }

  public void setAuthor(Reference<Resource>[] author) {
    this.author = author;
  }

  public void setRecipient(Reference<Resource>[] recipient) {
    this.recipient = recipient;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public void setContent(Reference<Resource>[] content) {
    this.content = content;
  }

  public void setRelated(DocumentManifestRelated[] related) {
    this.related = related;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof DocumentManifest) {
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
    return "DocumentManifest(" + id + "," + masterIdentifier + "," + status + "," + type + "," + created + ")";
  }
}
