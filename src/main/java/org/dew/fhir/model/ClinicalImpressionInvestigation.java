package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * One or more sets of investigations (signs, symptoms, etc.). The actual grouping of investigations varies greatly depending on the type and context of the assessment. 
 * These investigations may include data generated during the assessment process, or data previously generated and recorded that is pertinent to the outcomes.
 *
 * @see <a href="https://www.hl7.org/fhir/clinicalimpression-definitions.html#ClinicalImpression.investigation">ClinicalImpression.investigation</a>
 */
public 
class ClinicalImpressionInvestigation extends BackboneElement implements Serializable 
{
  private static final long serialVersionUID = -7247157450918797983L;
  
  protected CodeableConcept code;
  protected Reference<Resource>[] item;
  
  public ClinicalImpressionInvestigation()
  {
  }

  public CodeableConcept getCode() {
    return code;
  }

  public Reference<Resource>[] getItem() {
    return item;
  }

  public void setCode(CodeableConcept code) {
    this.code = code;
  }

  public void setItem(Reference<Resource>[] item) {
    this.item = item;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof ClinicalImpressionInvestigation) {
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
    return "ClinicalImpressionInvestigation(" + id + "," + code + ")";
  }
}
