package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * The Measure resource provides the definition of a quality measure.
 *
 * @see <a href="https://www.hl7.org/fhir">Measure_Group</a>
 */
public
class MeasureGroup extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected CodeableConcept code;
  protected String description;
  protected MeasureStratifier[] stratifier;
  protected MeasurePopulation[] population;
  
  public MeasureGroup()
  {
  }
  
  public CodeableConcept getCode() {
    return code;
  }
  
  public void setCode(CodeableConcept code) {
    this.code = code;
  }
  
  public String getDescription() {
    return description;
  }
  
  public void setDescription(String description) {
    this.description = description;
  }
  
  public MeasureStratifier[] getStratifier() {
    return stratifier;
  }
  
  public void setStratifier(MeasureStratifier[] stratifier) {
    this.stratifier = stratifier;
  }
  
  public MeasurePopulation[] getPopulation() {
    return population;
  }
  
  public void setPopulation(MeasurePopulation[] population) {
    this.population = population;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof MeasureGroup) {
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
    return "MeasureGroup(" + id + ")";
  }
}
