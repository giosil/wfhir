package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * Todo.
 *
 * @see <a href="https://www.hl7.org/fhir">SubstancePolymer_StructuralRepresentation</a>
 */
public
class SubstancePolymerStructuralRepresentation extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected Attachment attachment;
  protected CodeableConcept type;
  protected String representation;
  
  public SubstancePolymerStructuralRepresentation()
  {
  }
  
  public Attachment getAttachment() {
    return attachment;
  }
  
  public void setAttachment(Attachment attachment) {
    this.attachment = attachment;
  }
  
  public CodeableConcept getType() {
    return type;
  }
  
  public void setType(CodeableConcept type) {
    this.type = type;
  }
  
  public String getRepresentation() {
    return representation;
  }
  
  public void setRepresentation(String representation) {
    this.representation = representation;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof SubstancePolymerStructuralRepresentation) {
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
    return "SubstancePolymerStructuralRepresentation(" + id + ")";
  }
}
