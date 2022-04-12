package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * The clinical particulars - indications, contraindications etc. of a medicinal product, including for regulatory purposes.
 *
 * @see <a href="https://www.hl7.org/fhir">MedicinalProductContraindication</a>
 */
public
class MedicinalProductContraindication extends DomainResource implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected CodeableConcept disease;
  protected Reference<Resource>[] subject;
  protected Reference<Resource>[] therapeuticIndication;
  protected Population[] population;
  protected CodeableConcept diseaseStatus;
  protected MedicinalProductContraindicationOtherTherapy[] otherTherapy;
  protected CodeableConcept[] comorbidity;
  
  public MedicinalProductContraindication()
  {
    this.resourceType = "MedicinalProductContraindication";
  }
  
  public CodeableConcept getDisease() {
    return disease;
  }
  
  public void setDisease(CodeableConcept disease) {
    this.disease = disease;
  }
  
  public Reference<Resource>[] getSubject() {
    return subject;
  }
  
  public void setSubject(Reference<Resource>[] subject) {
    this.subject = subject;
  }
  
  public Reference<Resource>[] getTherapeuticIndication() {
    return therapeuticIndication;
  }
  
  public void setTherapeuticIndication(Reference<Resource>[] therapeuticIndication) {
    this.therapeuticIndication = therapeuticIndication;
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
  
  public MedicinalProductContraindicationOtherTherapy[] getOtherTherapy() {
    return otherTherapy;
  }
  
  public void setOtherTherapy(MedicinalProductContraindicationOtherTherapy[] otherTherapy) {
    this.otherTherapy = otherTherapy;
  }
  
  public CodeableConcept[] getComorbidity() {
    return comorbidity;
  }
  
  public void setComorbidity(CodeableConcept[] comorbidity) {
    this.comorbidity = comorbidity;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof MedicinalProductContraindication) {
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
    return "MedicinalProductContraindication(" + id + ")";
  }
}
