package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * The amount of medication administered.
 * 
 * @see <a href="https://www.hl7.org/fhir/dosage-definitions.html#Dosage.doseAndRate">Dosage.doseAndRate</a>
 */
public 
class DosageDoseAndRate extends Element implements Serializable
{
  private static final long serialVersionUID = -4177075065941699918L;
  
  protected CodeableConcept type;
  protected Range doseRange;
  protected SimpleQuantity doseQuantity;
  protected Ratio rateRatio;
  protected Range rateRange;
  protected SimpleQuantity rateQuantity;
  
  public DosageDoseAndRate()
  {
  }
  
  public DosageDoseAndRate(String id)
  {
    this.id = id;
  }
  
  public DosageDoseAndRate(String id, CodeableConcept type)
  {
    this.id = id;
    this.type = type;
  }

  public CodeableConcept getType() {
    return type;
  }

  public Range getDoseRange() {
    return doseRange;
  }

  public SimpleQuantity getDoseQuantity() {
    return doseQuantity;
  }

  public Ratio getRateRatio() {
    return rateRatio;
  }

  public Range getRateRange() {
    return rateRange;
  }

  public SimpleQuantity getRateQuantity() {
    return rateQuantity;
  }

  public void setType(CodeableConcept type) {
    this.type = type;
  }

  public void setDoseRange(Range doseRange) {
    this.doseRange = doseRange;
  }

  public void setDoseQuantity(SimpleQuantity doseQuantity) {
    this.doseQuantity = doseQuantity;
  }

  public void setRateRatio(Ratio rateRatio) {
    this.rateRatio = rateRatio;
  }

  public void setRateRange(Range rateRange) {
    this.rateRange = rateRange;
  }

  public void setRateQuantity(SimpleQuantity rateQuantity) {
    this.rateQuantity = rateQuantity;
  }

  @Override
  public boolean equals(Object object) {
    if(object instanceof DosageDoseAndRate) {
      return this.hashCode() == object.hashCode();
    }
    return false;
  }
  
  @Override
  public int hashCode() {
    if(type == null) return 0;
    return type.hashCode();
  }
  
  @Override
  public String toString() {
    return "DosageDoseAndRate(" + id + "," + type + "," + doseRange + "," + doseQuantity + ")";
  }
}