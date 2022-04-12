package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * The Measure resource provides the definition of a quality measure.
 *
 * @see <a href="https://www.hl7.org/fhir">Measure_Stratifier</a>
 */
public
class MeasureStratifier extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected MeasureComponent[] component;
  protected CodeableConcept code;
  protected Expression criteria;
  protected String description;
  
  public MeasureStratifier()
  {
  }
  
  public MeasureComponent[] getComponent() {
    return component;
  }
  
  public void setComponent(MeasureComponent[] component) {
    this.component = component;
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
  
  public String getDescription() {
    return description;
  }
  
  public void setDescription(String description) {
    this.description = description;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof MeasureStratifier) {
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
    return "MeasureStratifier(" + id + ")";
  }
}
