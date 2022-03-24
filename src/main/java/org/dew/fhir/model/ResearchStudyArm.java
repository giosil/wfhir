package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * Describes an expected sequence of events for one of the participants of a study. E.g. Exposure to drug A, wash-out, exposure to drug B, wash-out, follow-up.
 *
 * @see <a href="https://www.hl7.org/fhir/researchstudy-definitions.html#ResearchStudy.arm">ResearchStudy.arm</a>
 */
public 
class ResearchStudyArm extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = -7483824447508244607L;
  
  protected String name;
  protected CodeableConcept type;
  protected String description;
  
  public ResearchStudyArm()
  {
  }

  public String getName() {
    return name;
  }

  public CodeableConcept getType() {
    return type;
  }

  public String getDescription() {
    return description;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setType(CodeableConcept type) {
    this.type = type;
  }

  public void setDescription(String description) {
    this.description = description;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof ResearchStudyArm) {
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
    return "ResearchStudyArm(" + id + "," + name + "," + type + ")";
  }
}
