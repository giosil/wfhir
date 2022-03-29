package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * Specific findings or diagnoses that were considered likely or relevant to ongoing treatment.
 *
 * @see <a href="https://www.hl7.org/fhir/clinicalimpression-definitions.html#ClinicalImpression.finding">ClinicalImpression.finding</a>
 */
public 
class ClinicalImpressionFinding extends BackboneElement implements Serializable 
{
  private static final long serialVersionUID = -3937783273911856226L;
  
  protected CodeableConcept itemCodeableConcept;
  protected Reference<Resource> itemReference;
  protected String basis;
  
  public ClinicalImpressionFinding()
  {
  }

  public CodeableConcept getItemCodeableConcept() {
    return itemCodeableConcept;
  }

  public Reference<Resource> getItemReference() {
    return itemReference;
  }

  public String getBasis() {
    return basis;
  }

  public void setItemCodeableConcept(CodeableConcept itemCodeableConcept) {
    this.itemCodeableConcept = itemCodeableConcept;
  }

  public void setItemReference(Reference<Resource> itemReference) {
    this.itemReference = itemReference;
  }

  public void setBasis(String basis) {
    this.basis = basis;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof ClinicalImpressionFinding) {
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
    return "ClinicalImpressionFinding(" + id + "," + itemCodeableConcept + "," + itemReference + "," + basis + ")";
  }
}
