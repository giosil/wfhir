package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * The MeasureReport resource contains the results of the calculation of a measure; and optionally a reference to the resources involved in that calculation.
 *
 * @see <a href="https://www.hl7.org/fhir">MeasureReport_Stratifier</a>
 */
public
class MeasureReportStratifier extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected CodeableConcept[] code;
  protected MeasureReportStratum[] stratum;
  
  public MeasureReportStratifier()
  {
  }
  
  public CodeableConcept[] getCode() {
    return code;
  }
  
  public void setCode(CodeableConcept[] code) {
    this.code = code;
  }
  
  public MeasureReportStratum[] getStratum() {
    return stratum;
  }
  
  public void setStratum(MeasureReportStratum[] stratum) {
    this.stratum = stratum;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof MeasureReportStratifier) {
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
    return "MeasureReportStratifier(" + id + ")";
  }
}
