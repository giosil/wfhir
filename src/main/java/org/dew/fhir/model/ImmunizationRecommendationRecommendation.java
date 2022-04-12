package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * Vaccine administration recommendations.
 *
 * @see <a href="https://www.hl7.org/fhir/immunizationrecommendation-definitions.html#ImmunizationRecommendation.recommendation">ImmunizationRecommendation.recommendation</a>
 */
public 
class ImmunizationRecommendationRecommendation extends BackboneElement implements Serializable 
{
  private static final long serialVersionUID = -5910836178168302310L;
  
  protected CodeableConcept[] vaccineCode;
  protected CodeableConcept targetDisease;
  protected CodeableConcept[] contraindicatedVaccineCode;
  protected CodeableConcept forecastStatus;
  protected CodeableConcept[] forecastReason;
  protected ImmunizationRecommendationRecommendationDateCriterion[] dateCriterion;
  protected String description;
  protected String series;
  protected Integer doseNumberPositiveInt;
  protected String doseNumberString;
  protected Integer seriesDosesPositiveInt;
  protected String seriesDosesString;
  protected Reference<Immunization>[] supportingImmunization;
  protected Reference<Resource>[] supportingPatientInformation;
  
  public ImmunizationRecommendationRecommendation()
  {
  }
  
  public CodeableConcept[] getVaccineCode() {
    return vaccineCode;
  }

  public CodeableConcept getTargetDisease() {
    return targetDisease;
  }

  public CodeableConcept[] getContraindicatedVaccineCode() {
    return contraindicatedVaccineCode;
  }

  public CodeableConcept getForecastStatus() {
    return forecastStatus;
  }

  public CodeableConcept[] getForecastReason() {
    return forecastReason;
  }

  public ImmunizationRecommendationRecommendationDateCriterion[] getDateCriterion() {
    return dateCriterion;
  }

  public String getDescription() {
    return description;
  }

  public String getSeries() {
    return series;
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

  public Reference<Immunization>[] getSupportingImmunization() {
    return supportingImmunization;
  }

  public Reference<Resource>[] getSupportingPatientInformation() {
    return supportingPatientInformation;
  }

  public void setVaccineCode(CodeableConcept[] vaccineCode) {
    this.vaccineCode = vaccineCode;
  }

  public void setTargetDisease(CodeableConcept targetDisease) {
    this.targetDisease = targetDisease;
  }

  public void setContraindicatedVaccineCode(CodeableConcept[] contraindicatedVaccineCode) {
    this.contraindicatedVaccineCode = contraindicatedVaccineCode;
  }

  public void setForecastStatus(CodeableConcept forecastStatus) {
    this.forecastStatus = forecastStatus;
  }

  public void setForecastReason(CodeableConcept[] forecastReason) {
    this.forecastReason = forecastReason;
  }

  public void setDateCriterion(ImmunizationRecommendationRecommendationDateCriterion[] dateCriterion) {
    this.dateCriterion = dateCriterion;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public void setSeries(String series) {
    this.series = series;
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

  public void setSupportingImmunization(Reference<Immunization>[] supportingImmunization) {
    this.supportingImmunization = supportingImmunization;
  }

  public void setSupportingPatientInformation(Reference<Resource>[] supportingPatientInformation) {
    this.supportingPatientInformation = supportingPatientInformation;
  }

  @Override
  public boolean equals(Object object) {
    if(object instanceof ImmunizationRecommendationRecommendation) {
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
    return "ImmunizationRecommendationRecommendation(" + id + ")";
  }
}
