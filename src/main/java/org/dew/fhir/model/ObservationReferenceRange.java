package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * Guidance on how to interpret the value by comparison to a normal or recommended range. Multiple reference ranges are interpreted as an "OR". 
 * In other words, to represent two distinct target populations, two referenceRange elements would be used.
 *
 * @see <a href="https://www.hl7.org/fhir/observation-definitions.html#Observation.referenceRange">Observation.referenceRange</a>
 */
public 
class ObservationReferenceRange extends BackboneElement implements Serializable 
{
  private static final long serialVersionUID = 6847334038604993301L;
  
  protected SimpleQuantity low;
  protected SimpleQuantity high;
  protected CodeableConcept type;
  protected CodeableConcept[] appliesTo;
  protected Range age;
  protected String text;
  
  public ObservationReferenceRange()
  {
  }

  public SimpleQuantity getLow() {
    return low;
  }

  public SimpleQuantity getHigh() {
    return high;
  }

  public CodeableConcept getType() {
    return type;
  }

  public CodeableConcept[] getAppliesTo() {
    return appliesTo;
  }

  public Range getAge() {
    return age;
  }

  public String getText() {
    return text;
  }

  public void setLow(SimpleQuantity low) {
    this.low = low;
  }

  public void setHigh(SimpleQuantity high) {
    this.high = high;
  }

  public void setType(CodeableConcept type) {
    this.type = type;
  }

  public void setAppliesTo(CodeableConcept[] appliesTo) {
    this.appliesTo = appliesTo;
  }

  public void setAge(Range age) {
    this.age = age;
  }

  public void setText(String text) {
    this.text = text;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof ObservationReferenceRange) {
      return this.hashCode() == object.hashCode();
    }
    return false;
  }
  
  @Override
  public int hashCode() {
    if(text == null) return 0;
    return text.hashCode();
  }
  
  @Override
  public String toString() {
    return "ObservationReferenceRange(" + id + "," + low + "," + high + "," + type + "," + text + ")";
  }
}
