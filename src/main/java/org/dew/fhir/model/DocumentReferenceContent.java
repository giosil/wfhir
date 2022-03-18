package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * The document and format referenced. There may be multiple content element repetitions, each with a different format.
 *
 * @see <a href="https://www.hl7.org/fhir/documentreference-definitions.html#DocumentReference.content">DocumentReference.content</a>
 */
public 
class DocumentReferenceContent extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 4044421915769126407L;
  
  protected Attachment attachment;
  protected Coding format;
  
  public DocumentReferenceContent()
  {
  }
  
  public DocumentReferenceContent(Attachment attachment)
  {
    this.attachment = attachment;
  }
  
  public DocumentReferenceContent(Attachment attachment, Coding format)
  {
    this.attachment = attachment;
    this.format = format;
  }

  public Attachment getAttachment() {
    return attachment;
  }

  public Coding getFormat() {
    return format;
  }

  public void setAttachment(Attachment attachment) {
    this.attachment = attachment;
  }

  public void setFormat(Coding format) {
    this.format = format;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof DocumentReferenceContent) {
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
    return "DocumentReferenceContent(" + id + "," + attachment + "," + format + ")";
  }
}
