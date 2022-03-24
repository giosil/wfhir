package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * Information on the possible cause of the event.
 *
 * @see <a href="https://www.hl7.org/fhir/adverseevent-definitions.html#AdverseEvent.suspectEntity.causality">AdverseEvent.suspectEntity.causality</a>
 */
public 
class AdverseEventSuspectEntityCausality extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = -2602237106521824613L;
  
  protected CodeableConcept assessment;
  protected String productRelatedness;
  protected Reference<Resource> author;
  protected CodeableConcept method;
  
  public AdverseEventSuspectEntityCausality()
  {
  }

  public CodeableConcept getAssessment() {
    return assessment;
  }

  public String getProductRelatedness() {
    return productRelatedness;
  }

  public Reference<Resource> getAuthor() {
    return author;
  }

  public CodeableConcept getMethod() {
    return method;
  }

  public void setAssessment(CodeableConcept assessment) {
    this.assessment = assessment;
  }

  public void setProductRelatedness(String productRelatedness) {
    this.productRelatedness = productRelatedness;
  }

  public void setAuthor(Reference<Resource> author) {
    this.author = author;
  }

  public void setMethod(CodeableConcept method) {
    this.method = method;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof AdverseEventSuspectEntityCausality) {
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
    return "AdverseEventSuspectEntityCausality(" + id + "," + assessment + "," + method + ")";
  }
}
