package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * The protocol (set of recommendations) being followed by the provider who administered the dose.
 *
 * @see <a href="https://www.hl7.org/fhir/immunization-definitions.html#Immunization.protocolApplied">Immunization.protocolApplied</a>
 */
public 
class ImmunizationProtocolApplied extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = -6305329829139070211L;
  
  protected String series;
  protected Reference<Organization> authority;
  protected CodeableConcept[] targetDisease;
  protected Integer doseNumberPositiveInt;
  protected String doseNumberString;
  protected Integer seriesDosesPositiveInt;
  protected String seriesDosesString;
  
  public ImmunizationProtocolApplied()
  {
  }

  public String getSeries() {
    return series;
  }

  public Reference<Organization> getAuthority() {
    return authority;
  }

  public CodeableConcept[] getTargetDisease() {
    return targetDisease;
  }

  public Integer getDoseNumberPositiveInt() {
    return doseNumberPositiveInt;
  }

  public String getDoseNumberString() {
    return doseNumberString;
  }

  public Integer getSeriesDosesPositiveInt() {
    return seriesDosesPositiveInt;
  }

  public String getSeriesDosesString() {
    return seriesDosesString;
  }

  public void setSeries(String series) {
    this.series = series;
  }

  public void setAuthority(Reference<Organization> authority) {
    this.authority = authority;
  }

  public void setTargetDisease(CodeableConcept[] targetDisease) {
    this.targetDisease = targetDisease;
  }

  public void setDoseNumberPositiveInt(Integer doseNumberPositiveInt) {
    this.doseNumberPositiveInt = doseNumberPositiveInt;
  }

  public void setDoseNumberString(String doseNumberString) {
    this.doseNumberString = doseNumberString;
  }

  public void setSeriesDosesPositiveInt(Integer seriesDosesPositiveInt) {
    this.seriesDosesPositiveInt = seriesDosesPositiveInt;
  }

  public void setSeriesDosesString(String seriesDosesString) {
    this.seriesDosesString = seriesDosesString;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof ImmunizationProtocolApplied) {
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
    return "ImmunizationProtocolApplied(" + id + ")";
  }
}
