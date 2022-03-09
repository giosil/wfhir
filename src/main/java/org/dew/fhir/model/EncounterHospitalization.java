package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * Details about the admission to a healthcare service.
 *
 * @see <a href="https://www.hl7.org/fhir/encounter-definitions.html#Encounter.hospitalization">Encounter.hospitalization</a>
 */
public 
class EncounterHospitalization extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = -3516735234636246711L;
  
  protected Identifier preAdmissionIdentifier;
  protected Reference<Resource> origin;
  protected CodeableConcept admitSource;
  protected CodeableConcept reAdmission;
  protected CodeableConcept[] dietPreference;
  protected CodeableConcept[] specialCourtesy;
  protected CodeableConcept[] specialArrangement;
  protected Reference<Resource> destination;
  protected CodeableConcept dischargeDisposition;
  
  public EncounterHospitalization()
  {
  }

  public Identifier getPreAdmissionIdentifier() {
    return preAdmissionIdentifier;
  }

  public Reference<Resource> getOrigin() {
    return origin;
  }

  public CodeableConcept getAdmitSource() {
    return admitSource;
  }

  public CodeableConcept getReAdmission() {
    return reAdmission;
  }

  public CodeableConcept[] getDietPreference() {
    return dietPreference;
  }

  public CodeableConcept[] getSpecialCourtesy() {
    return specialCourtesy;
  }

  public CodeableConcept[] getSpecialArrangement() {
    return specialArrangement;
  }

  public Reference<Resource> getDestination() {
    return destination;
  }

  public CodeableConcept getDischargeDisposition() {
    return dischargeDisposition;
  }

  public void setPreAdmissionIdentifier(Identifier preAdmissionIdentifier) {
    this.preAdmissionIdentifier = preAdmissionIdentifier;
  }

  public void setOrigin(Reference<Resource> origin) {
    this.origin = origin;
  }

  public void setAdmitSource(CodeableConcept admitSource) {
    this.admitSource = admitSource;
  }

  public void setReAdmission(CodeableConcept reAdmission) {
    this.reAdmission = reAdmission;
  }

  public void setDietPreference(CodeableConcept[] dietPreference) {
    this.dietPreference = dietPreference;
  }

  public void setSpecialCourtesy(CodeableConcept[] specialCourtesy) {
    this.specialCourtesy = specialCourtesy;
  }

  public void setSpecialArrangement(CodeableConcept[] specialArrangement) {
    this.specialArrangement = specialArrangement;
  }

  public void setDestination(Reference<Resource> destination) {
    this.destination = destination;
  }

  public void setDischargeDisposition(CodeableConcept dischargeDisposition) {
    this.dischargeDisposition = dischargeDisposition;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof EncounterHospitalization) {
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
    return "EncounterHospitalization(" + id + ")";
  }
}
