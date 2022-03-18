package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * The clinical context in which the document was prepared.
 *
 * @see <a href="https://www.hl7.org/fhir/documentreference-definitions.html#DocumentReference.context">DocumentReference.context</a>
 */
public 
class DocumentReferenceContext extends BackboneElement implements Serializable 
{
  private static final long serialVersionUID = 8294492537504078586L;
  
  protected Reference<Resource>[] encounter;
  protected CodeableConcept[] event;
  protected Period period;
  protected CodeableConcept facilityType;
  protected CodeableConcept practiceSetting;
  protected Reference<Patient> sourcePatientInfo;
  protected Reference<Resource>[] related;
  
  public DocumentReferenceContext()
  {
  }

  public Reference<Resource>[] getEncounter() {
    return encounter;
  }

  public CodeableConcept[] getEvent() {
    return event;
  }

  public Period getPeriod() {
    return period;
  }

  public CodeableConcept getFacilityType() {
    return facilityType;
  }

  public CodeableConcept getPracticeSetting() {
    return practiceSetting;
  }

  public Reference<Patient> getSourcePatientInfo() {
    return sourcePatientInfo;
  }

  public Reference<Resource>[] getRelated() {
    return related;
  }

  public void setEncounter(Reference<Resource>[] encounter) {
    this.encounter = encounter;
  }

  public void setEvent(CodeableConcept[] event) {
    this.event = event;
  }

  public void setPeriod(Period period) {
    this.period = period;
  }

  public void setFacilityType(CodeableConcept facilityType) {
    this.facilityType = facilityType;
  }

  public void setPracticeSetting(CodeableConcept practiceSetting) {
    this.practiceSetting = practiceSetting;
  }

  public void setSourcePatientInfo(Reference<Patient> sourcePatientInfo) {
    this.sourcePatientInfo = sourcePatientInfo;
  }

  public void setRelated(Reference<Resource>[] related) {
    this.related = related;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof DocumentReferenceContext) {
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
    return "DocumentReferenceContext(" + id + "," + facilityType + "," + practiceSetting + ")";
  }
}
