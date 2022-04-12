package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * Population bean.
 *
 * @see <a href="https://www.hl7.org/fhir/population.html">Population</a>
 */
public 
class Population extends BackboneElement implements Serializable 
{
  private static final long serialVersionUID = 7666931437754622876L;
  
  protected Range ageRange;
  protected CodeableConcept ageCodeableConcept;
  protected CodeableConcept gender;
  protected CodeableConcept race;
  protected CodeableConcept physiologicalCondition;
  
  public Population()
  {
  }

  public Range getAgeRange() {
    return ageRange;
  }

  public CodeableConcept getAgeCodeableConcept() {
    return ageCodeableConcept;
  }

  public CodeableConcept getGender() {
    return gender;
  }

  public CodeableConcept getRace() {
    return race;
  }

  public CodeableConcept getPhysiologicalCondition() {
    return physiologicalCondition;
  }

  public void setAgeRange(Range ageRange) {
    this.ageRange = ageRange;
  }

  public void setAgeCodeableConcept(CodeableConcept ageCodeableConcept) {
    this.ageCodeableConcept = ageCodeableConcept;
  }

  public void setGender(CodeableConcept gender) {
    this.gender = gender;
  }

  public void setRace(CodeableConcept race) {
    this.race = race;
  }

  public void setPhysiologicalCondition(CodeableConcept physiologicalCondition) {
    this.physiologicalCondition = physiologicalCondition;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof Population) {
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
    return "Population(" + id + "," + ageRange + "," + ageCodeableConcept + "," + gender + ")";
  }
}
