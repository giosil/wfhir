package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * A request to convey information; e.g. the CDS system proposes that an alert be sent to a responsible provider, the CDS system proposes that the public health agency be notified about a reportable condition.
 *
 * @see <a href="https://www.hl7.org/fhir">CommunicationRequest_Payload</a>
 */
public
class CommunicationRequestPayload extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected Reference<Resource> contentReference;
  protected String contentString;
  protected Attachment contentAttachment;
  
  public CommunicationRequestPayload()
  {
  }
  
  public Reference<Resource> getContentReference() {
    return contentReference;
  }
  
  public void setContentReference(Reference<Resource> contentReference) {
    this.contentReference = contentReference;
  }
  
  public String getContentString() {
    return contentString;
  }
  
  public void setContentString(String contentString) {
    this.contentString = contentString;
  }
  
  public Attachment getContentAttachment() {
    return contentAttachment;
  }
  
  public void setContentAttachment(Attachment contentAttachment) {
    this.contentAttachment = contentAttachment;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof CommunicationRequestPayload) {
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
    return "CommunicationRequestPayload(" + id + ")";
  }
}
