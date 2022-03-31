package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * Specifies if changes are allowed when dispensing a medication from a regulatory perspective.
 *
 * @see <a href="https://www.hl7.org/fhir/medicationknowledge-definitions.html#MedicationKnowledge.regulatory.substitution">MedicationKnowledge.regulatory.substitution</a>
 */
public 
class MedicationKnowledgeRegulatorySubstitution extends BackboneElement implements Serializable 
{
  private static final long serialVersionUID = 4244593470815681934L;
  
  protected CodeableConcept type;
  protected Boolean allowed;
  
  public MedicationKnowledgeRegulatorySubstitution()
  {
  }

  public CodeableConcept getType() {
    return type;
  }

  public Boolean getAllowed() {
    return allowed;
  }

  public void setType(CodeableConcept type) {
    this.type = type;
  }

  public void setAllowed(Boolean allowed) {
    this.allowed = allowed;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof MedicationKnowledgeRegulatorySubstitution) {
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
    return "MedicationKnowledgeRegulatorySubstitution(" + id + "," + type + ")";
  }
}
