package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * Describes the medication dosage information details e.g. dose, rate, site, route, etc.
 *
 * @see <a href="https://www.hl7.org/fhir/medicationadministration-definitions.html#MedicationAdministration.dosage">MedicationAdministration.dosage</a>
 */
public 
class MedicationAdministrationDosage extends BackboneElement implements Serializable 
{
  private static final long serialVersionUID = -1360512928319542229L;
  
  protected String text;
  protected CodeableConcept site;
  protected CodeableConcept route;
  protected CodeableConcept method;
  protected SimpleQuantity dose;
  protected Ratio rateRatio;
  protected SimpleQuantity rateQuantity;
  
  public MedicationAdministrationDosage()
  {
  }

  public String getText() {
    return text;
  }

  public CodeableConcept getSite() {
    return site;
  }

  public CodeableConcept getRoute() {
    return route;
  }

  public CodeableConcept getMethod() {
    return method;
  }

  public SimpleQuantity getDose() {
    return dose;
  }

  public Ratio getRateRatio() {
    return rateRatio;
  }

  public SimpleQuantity getRateQuantity() {
    return rateQuantity;
  }

  public void setText(String text) {
    this.text = text;
  }

  public void setSite(CodeableConcept site) {
    this.site = site;
  }

  public void setRoute(CodeableConcept route) {
    this.route = route;
  }

  public void setMethod(CodeableConcept method) {
    this.method = method;
  }

  public void setDose(SimpleQuantity dose) {
    this.dose = dose;
  }

  public void setRateRatio(Ratio rateRatio) {
    this.rateRatio = rateRatio;
  }

  public void setRateQuantity(SimpleQuantity rateQuantity) {
    this.rateQuantity = rateQuantity;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof MedicationAdministrationDosage) {
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
    return "MedicationAdministrationDosage(" + id + ")";
  }
}
