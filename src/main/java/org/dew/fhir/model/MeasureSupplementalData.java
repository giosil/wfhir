package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * The Measure resource provides the definition of a quality measure.
 *
 * @see <a href="https://www.hl7.org/fhir">Measure_SupplementalData</a>
 */
public
class MeasureSupplementalData extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected CodeableConcept code;
  protected Expression criteria;
  protected CodeableConcept[] usage;
  protected String description;
  
  public MeasureSupplementalData()
  {
  }
  
  public CodeableConcept getCode() {
    return code;
  }
  
  public void setCode(CodeableConcept code) {
    this.code = code;
  }
  
  public Expression getCriteria() {
    return criteria;
  }
  
  public void setCriteria(Expression criteria) {
    this.criteria = criteria;
  }
  
  public CodeableConcept[] getUsage() {
    return usage;
  }
  
  public void setUsage(CodeableConcept[] usage) {
    this.usage = usage;
  }
  
  public String getDescription() {
    return description;
  }
  
  public void setDescription(String description) {
    this.description = description;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof MeasureSupplementalData) {
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
    return "MeasureSupplementalData(" + id + ")";
  }
}
