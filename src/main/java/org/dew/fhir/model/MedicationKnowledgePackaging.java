package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * Information that only applies to packages (not products).
 *
 * @see <a href="https://www.hl7.org/fhir/medicationknowledge-definitions.html#MedicationKnowledge.packaging">MedicationKnowledge.packaging</a>
 */
public 
class MedicationKnowledgePackaging extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = -545971557554910458L;

  protected CodeableConcept type;
  protected SimpleQuantity quantity;
  
  public MedicationKnowledgePackaging()
  {
  }

  public CodeableConcept getType() {
    return type;
  }

  public SimpleQuantity getQuantity() {
    return quantity;
  }

  public void setType(CodeableConcept type) {
    this.type = type;
  }

  public void setQuantity(SimpleQuantity quantity) {
    this.quantity = quantity;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof MedicationKnowledgePackaging) {
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
    return "MedicationKnowledgePackaging(" + id + "," + type + "," + quantity + ")";
  }
}
