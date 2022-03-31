package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * Set of definitional characteristics for a kind of observation or measurement produced or consumed by an orderable health care service.
 *
 * @see <a href="https://www.hl7.org/fhir/observationdefinition.html">ObservationDefinition</a>
 */
public 
class ObservationDefinition extends DomainResource implements Serializable 
{
  private static final long serialVersionUID = -7345375769098021037L;
  
  protected CodeableConcept[] category;
  protected CodeableConcept code;
  protected Identifier[] identifier;
  protected String[] permittedDataType;
  protected Boolean multipleResultsAllowed;
  protected CodeableConcept method;
  protected String preferredReportName;
  protected ObservationDefinitionQuantitativeDetails quantitativeDetails;
  protected ObservationDefinitionQualifiedInterval[] qualifiedInterval;
  protected Reference<ValueSet> validCodedValueSet;
  protected Reference<ValueSet> normalCodedValueSet;
  protected Reference<ValueSet> abnormalCodedValueSet;
  protected Reference<ValueSet> criticalCodedValueSet;
  
  public ObservationDefinition()
  {
    this.resourceType = "ObservationDefinition";
  }

  public CodeableConcept[] getCategory() {
    return category;
  }

  public CodeableConcept getCode() {
    return code;
  }

  public Identifier[] getIdentifier() {
    return identifier;
  }

  public String[] getPermittedDataType() {
    return permittedDataType;
  }

  public Boolean getMultipleResultsAllowed() {
    return multipleResultsAllowed;
  }

  public CodeableConcept getMethod() {
    return method;
  }

  public String getPreferredReportName() {
    return preferredReportName;
  }

  public ObservationDefinitionQuantitativeDetails getQuantitativeDetails() {
    return quantitativeDetails;
  }

  public ObservationDefinitionQualifiedInterval[] getQualifiedInterval() {
    return qualifiedInterval;
  }

  public Reference<ValueSet> getValidCodedValueSet() {
    return validCodedValueSet;
  }

  public Reference<ValueSet> getNormalCodedValueSet() {
    return normalCodedValueSet;
  }

  public Reference<ValueSet> getAbnormalCodedValueSet() {
    return abnormalCodedValueSet;
  }

  public Reference<ValueSet> getCriticalCodedValueSet() {
    return criticalCodedValueSet;
  }

  public void setCategory(CodeableConcept[] category) {
    this.category = category;
  }

  public void setCode(CodeableConcept code) {
    this.code = code;
  }

  public void setIdentifier(Identifier[] identifier) {
    this.identifier = identifier;
  }

  public void setPermittedDataType(String[] permittedDataType) {
    this.permittedDataType = permittedDataType;
  }

  public void setMultipleResultsAllowed(Boolean multipleResultsAllowed) {
    this.multipleResultsAllowed = multipleResultsAllowed;
  }

  public void setMethod(CodeableConcept method) {
    this.method = method;
  }

  public void setPreferredReportName(String preferredReportName) {
    this.preferredReportName = preferredReportName;
  }

  public void setQuantitativeDetails(ObservationDefinitionQuantitativeDetails quantitativeDetails) {
    this.quantitativeDetails = quantitativeDetails;
  }

  public void setQualifiedInterval(ObservationDefinitionQualifiedInterval[] qualifiedInterval) {
    this.qualifiedInterval = qualifiedInterval;
  }

  public void setValidCodedValueSet(Reference<ValueSet> validCodedValueSet) {
    this.validCodedValueSet = validCodedValueSet;
  }

  public void setNormalCodedValueSet(Reference<ValueSet> normalCodedValueSet) {
    this.normalCodedValueSet = normalCodedValueSet;
  }

  public void setAbnormalCodedValueSet(Reference<ValueSet> abnormalCodedValueSet) {
    this.abnormalCodedValueSet = abnormalCodedValueSet;
  }

  public void setCriticalCodedValueSet(Reference<ValueSet> criticalCodedValueSet) {
    this.criticalCodedValueSet = criticalCodedValueSet;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof ObservationDefinition) {
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
    return "ObservationDefinition(" + id + "," + code + "," + method + ")";
  }
}
