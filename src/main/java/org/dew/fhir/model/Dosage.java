package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 *  The Dosage structure defines general dosage instruction information typically represented in medication requests, medication dispenses and medication statements.
 *
 * @see <a href="https://www.hl7.org/fhir/dosage.html#Dosage">Dosage</a>
 */
public 
class Dosage extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 3732354988289576396L;
  
  protected Integer sequence;
  protected String text;
  protected CodeableConcept[] additionalInstruction;
  protected String patientInstruction;
  protected Timing timing;
  protected Boolean asNeededBoolean;
  protected CodeableConcept asNeededCodeableConcept;
  protected CodeableConcept site;
  protected CodeableConcept route;
  protected CodeableConcept method;
  protected DosageDoseAndRate[] doseAndRate;
  protected Ratio maxDosePerPeriod;
  protected SimpleQuantity maxDosePerAdministration;
  protected SimpleQuantity maxDosePerLifetime;
  
  public Dosage()
  {
  }
  
  public Integer getSequence() {
    return sequence;
  }

  public String getText() {
    return text;
  }

  public CodeableConcept[] getAdditionalInstruction() {
    return additionalInstruction;
  }

  public String getPatientInstruction() {
    return patientInstruction;
  }

  public Timing getTiming() {
    return timing;
  }

  public Boolean getAsNeededBoolean() {
    return asNeededBoolean;
  }

  public CodeableConcept getAsNeededCodeableConcept() {
    return asNeededCodeableConcept;
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

  public DosageDoseAndRate[] getDoseAndRate() {
    return doseAndRate;
  }

  public Ratio getMaxDosePerPeriod() {
    return maxDosePerPeriod;
  }

  public SimpleQuantity getMaxDosePerAdministration() {
    return maxDosePerAdministration;
  }

  public SimpleQuantity getMaxDosePerLifetime() {
    return maxDosePerLifetime;
  }

  public void setSequence(Integer sequence) {
    this.sequence = sequence;
  }

  public void setText(String text) {
    this.text = text;
  }

  public void setAdditionalInstruction(CodeableConcept[] additionalInstruction) {
    this.additionalInstruction = additionalInstruction;
  }

  public void setPatientInstruction(String patientInstruction) {
    this.patientInstruction = patientInstruction;
  }

  public void setTiming(Timing timing) {
    this.timing = timing;
  }

  public void setAsNeededBoolean(Boolean asNeededBoolean) {
    this.asNeededBoolean = asNeededBoolean;
  }

  public void setAsNeededCodeableConcept(CodeableConcept asNeededCodeableConcept) {
    this.asNeededCodeableConcept = asNeededCodeableConcept;
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

  public void setDoseAndRate(DosageDoseAndRate[] doseAndRate) {
    this.doseAndRate = doseAndRate;
  }

  public void setMaxDosePerPeriod(Ratio maxDosePerPeriod) {
    this.maxDosePerPeriod = maxDosePerPeriod;
  }

  public void setMaxDosePerAdministration(SimpleQuantity maxDosePerAdministration) {
    this.maxDosePerAdministration = maxDosePerAdministration;
  }

  public void setMaxDosePerLifetime(SimpleQuantity maxDosePerLifetime) {
    this.maxDosePerLifetime = maxDosePerLifetime;
  }

  @Override
  public boolean equals(Object object) {
    if(object instanceof Dosage) {
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
    return "Dosage(" + id + "," + sequence + "," + text + ")";
  }
}