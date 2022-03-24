package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * A goal that the study is aiming to achieve in terms of a scientific question to be answered by the analysis of data collected during the study.
 *
 * @see <a href="https://www.hl7.org/fhir/researchstudy-definitions.html#ResearchStudy.objective">ResearchStudy.objective</a>
 */
public 
class ResearchStudyObjective extends BackboneElement implements Serializable 
{
  private static final long serialVersionUID = 8206462467722285847L;
  
  protected String name;
  protected CodeableConcept type;
  
  public ResearchStudyObjective()
  {
  }

  public String getName() {
    return name;
  }

  public CodeableConcept getType() {
    return type;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setType(CodeableConcept type) {
    this.type = type;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof ResearchStudyObjective) {
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
    return "ResearchStudyObjective(" + id + "," + name + "," + type + ")";
  }
}
