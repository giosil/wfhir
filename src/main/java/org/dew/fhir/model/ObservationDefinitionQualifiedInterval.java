package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * Multiple ranges of results qualified by different contexts for ordinal or continuous observations conforming to this ObservationDefinition.
 * 
 * @see <a href="https://www.hl7.org/fhir/observationdefinition-definitions.html#ObservationDefinition.qualifiedInterval">ObservationDefinition.qualifiedInterval</a>
 */
public 
class ObservationDefinitionQualifiedInterval extends BackboneElement implements Serializable 
{
  private static final long serialVersionUID = -4839137524533686299L;
  
  protected String category;
  protected Range range;
  protected CodeableConcept context;
  protected CodeableConcept[] appliesTo;
  protected String gender;
  protected Range age;
  protected Range gestationalAge;
  protected String condition;
  
  public ObservationDefinitionQualifiedInterval()
  {
  }

  public String getCategory() {
    return category;
  }

  public Range getRange() {
    return range;
  }

  public CodeableConcept getContext() {
    return context;
  }

  public CodeableConcept[] getAppliesTo() {
    return appliesTo;
  }

  public String getGender() {
    return gender;
  }

  public Range getAge() {
    return age;
  }

  public Range getGestationalAge() {
    return gestationalAge;
  }

  public String getCondition() {
    return condition;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public void setRange(Range range) {
    this.range = range;
  }

  public void setContext(CodeableConcept context) {
    this.context = context;
  }

  public void setAppliesTo(CodeableConcept[] appliesTo) {
    this.appliesTo = appliesTo;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public void setAge(Range age) {
    this.age = age;
  }

  public void setGestationalAge(Range gestationalAge) {
    this.gestationalAge = gestationalAge;
  }

  public void setCondition(String condition) {
    this.condition = condition;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof ObservationDefinitionQualifiedInterval) {
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
    return "ObservationDefinitionQualifiedInterval(" + id + "," + category + "," + range + "," + context + ")";
  }
}
