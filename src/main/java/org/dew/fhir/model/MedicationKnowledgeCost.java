package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * The price of the medication.
 *
 * @see <a href="https://www.hl7.org/fhir/medicationknowledge-definitions.html#MedicationKnowledge.cost">MedicationKnowledge.cost</a>
 */
public 
class MedicationKnowledgeCost extends BackboneElement implements Serializable 
{
  private static final long serialVersionUID = -801184719882348572L;
  
  protected CodeableConcept type;
  protected String source;
  protected Money cost;
  
  public MedicationKnowledgeCost()
  {
  }

  public CodeableConcept getType() {
    return type;
  }

  public String getSource() {
    return source;
  }

  public Money getCost() {
    return cost;
  }

  public void setType(CodeableConcept type) {
    this.type = type;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public void setCost(Money cost) {
    this.cost = cost;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof MedicationKnowledgeCost) {
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
    return "MedicationKnowledgeCost(" + id + "," + type + "," + source + "," + cost + ")";
  }
}
