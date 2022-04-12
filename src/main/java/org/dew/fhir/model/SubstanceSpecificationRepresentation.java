package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * The detailed description of a substance, typically at a level beyond what is used for prescribing.
 *
 * @see <a href="https://www.hl7.org/fhir">SubstanceSpecification_Representation</a>
 */
public
class SubstanceSpecificationRepresentation extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected Attachment attachment;
  protected CodeableConcept type;
  protected String representation;
  
  public SubstanceSpecificationRepresentation()
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
    if(object instanceof SubstanceSpecificationRepresentation) {
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
    return "SubstanceSpecificationRepresentation(" + id + ")";
  }
}
