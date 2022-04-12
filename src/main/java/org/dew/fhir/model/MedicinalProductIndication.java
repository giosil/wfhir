package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * Indication for the Medicinal Product.
 *
 * @see <a href="https://www.hl7.org/fhir">MedicinalProductIndication</a>
 */
public
class MedicinalProductIndication extends DomainResource implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected CodeableConcept intendedEffect;
  protected Reference<Resource>[] subject;
  protected Population[] population;
  protected CodeableConcept diseaseStatus;
  protected Quantity duration;
  protected Reference<Resource>[] undesirableEffect;
  protected MedicinalProductIndicationOtherTherapy[] otherTherapy;
  protected CodeableConcept[] comorbidity;
  protected CodeableConcept diseaseSymptomProcedure;
  
  public MedicinalProductIndication()
  {
    this.resourceType = "MedicinalProductIndication";
  }
  
  public CodeableConcept getIntendedEffect() {
    return intendedEffect;
  }
  
  public void setIntendedEffect(CodeableConcept intendedEffect) {
    this.intendedEffect = intendedEffect;
  }
  
  public Reference<Resource>[] getSubject() {
    return subject;
  }
  
  public void setSubject(Reference<Resource>[] subject) {
    this.subject = subject;
  }
  
  public Population[] getPopulation() {
    return population;
  }
  
  public void setPopulation(Population[] population) {
    this.population = population;
  }
  
  public CodeableConcept getDiseaseStatus() {
    return diseaseStatus;
  }
  
  public void setDiseaseStatus(CodeableConcept diseaseStatus) {
    this.diseaseStatus = diseaseStatus;
  }
  
  public Quantity getDuration() {
    return duration;
  }
  
  public void setDuration(Quantity duration) {
    this.duration = duration;
  }
  
  public Reference<Resource>[] getUndesirableEffect() {
    return undesirableEffect;
  }
  
  public void setUndesirableEffect(Reference<Resource>[] undesirableEffect) {
    this.undesirableEffect = undesirableEffect;
  }
  
  public MedicinalProductIndicationOtherTherapy[] getOtherTherapy() {
    return otherTherapy;
  }
  
  public void setOtherTherapy(MedicinalProductIndicationOtherTherapy[] otherTherapy) {
    this.otherTherapy = otherTherapy;
  }
  
  public CodeableConcept[] getComorbidity() {
    return comorbidity;
  }
  
  public void setComorbidity(CodeableConcept[] comorbidity) {
    this.comorbidity = comorbidity;
  }
  
  public CodeableConcept getDiseaseSymptomProcedure() {
    return diseaseSymptomProcedure;
  }
  
  public void setDiseaseSymptomProcedure(CodeableConcept diseaseSymptomProcedure) {
    this.diseaseSymptomProcedure = diseaseSymptomProcedure;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof MedicinalProductIndication) {
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
    return "MedicinalProductIndication(" + id + ")";
  }
}
