package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * The maximum number of units of the medication that can be dispensed in a period.
 *
 * @see <a href="https://www.hl7.org/fhir/medicationknowledge-definitions.html#MedicationKnowledge.regulatory.maxDispense">MedicationKnowledge.regulatory.maxDispense</a>
 */
public 
class MedicationKnowledgeRegulatoryMaxDispense extends BackboneElement implements Serializable 
{
  private static final long serialVersionUID = 8769885593442892971L;
  
  protected SimpleQuantity quantity;
  protected Duration period;
  
  public MedicationKnowledgeRegulatoryMaxDispense()
  {
  }

  public SimpleQuantity getQuantity() {
    return quantity;
  }

  public Duration getPeriod() {
    return period;
  }

  public void setQuantity(SimpleQuantity quantity) {
    this.quantity = quantity;
  }

  public void setPeriod(Duration period) {
    this.period = period;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof MedicationKnowledgeRegulatoryMaxDispense) {
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
    return "MedicationKnowledgeRegulatoryMaxDispense(" + id + "," + quantity + "," + period + ")";
  }
}
