package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * A kind of specimen with associated set of requirements.
 *
 * @see <a href="https://www.hl7.org/fhir">SpecimenDefinition_Handling</a>
 */
public
class SpecimenDefinitionHandling extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected Range temperatureRange;
  protected String instruction;
  protected CodeableConcept temperatureQualifier;
  protected Duration maxDuration;
  
  public SpecimenDefinitionHandling()
  {
  }
  
  public Range getTemperatureRange() {
    return temperatureRange;
  }
  
  public void setTemperatureRange(Range temperatureRange) {
    this.temperatureRange = temperatureRange;
  }
  
  public String getInstruction() {
    return instruction;
  }
  
  public void setInstruction(String instruction) {
    this.instruction = instruction;
  }
  
  public CodeableConcept getTemperatureQualifier() {
    return temperatureQualifier;
  }
  
  public void setTemperatureQualifier(CodeableConcept temperatureQualifier) {
    this.temperatureQualifier = temperatureQualifier;
  }
  
  public Duration getMaxDuration() {
    return maxDuration;
  }
  
  public void setMaxDuration(Duration maxDuration) {
    this.maxDuration = maxDuration;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof SpecimenDefinitionHandling) {
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
    return "SpecimenDefinitionHandling(" + id + ")";
  }
}
