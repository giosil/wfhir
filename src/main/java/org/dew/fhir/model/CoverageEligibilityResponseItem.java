package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * This resource provides eligibility and plan details from the processing of an CoverageEligibilityRequest resource.
 *
 * @see <a href="https://www.hl7.org/fhir">CoverageEligibilityResponse_Item</a>
 */
public
class CoverageEligibilityResponseItem extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected CodeableConcept[] modifier;
  protected String description;
  protected CodeableConcept[] authorizationSupporting;
  protected CodeableConcept productOrService;
  protected CoverageEligibilityResponseBenefit[] benefit;
  protected CodeableConcept network;
  protected Boolean excluded;
  protected CodeableConcept unit;
  protected String authorizationUrl;
  protected Reference<Resource> provider;
  protected Boolean authorizationRequired;
  protected String name;
  protected CodeableConcept term;
  protected CodeableConcept category;
  
  public CoverageEligibilityResponseItem()
  {
  }
  
  public CodeableConcept[] getModifier() {
    return modifier;
  }
  
  public void setModifier(CodeableConcept[] modifier) {
    this.modifier = modifier;
  }
  
  public String getDescription() {
    return description;
  }
  
  public void setDescription(String description) {
    this.description = description;
  }
  
  public CodeableConcept[] getAuthorizationSupporting() {
    return authorizationSupporting;
  }
  
  public void setAuthorizationSupporting(CodeableConcept[] authorizationSupporting) {
    this.authorizationSupporting = authorizationSupporting;
  }
  
  public CodeableConcept getProductOrService() {
    return productOrService;
  }
  
  public void setProductOrService(CodeableConcept productOrService) {
    this.productOrService = productOrService;
  }
  
  public CoverageEligibilityResponseBenefit[] getBenefit() {
    return benefit;
  }
  
  public void setBenefit(CoverageEligibilityResponseBenefit[] benefit) {
    this.benefit = benefit;
  }
  
  public CodeableConcept getNetwork() {
    return network;
  }
  
  public void setNetwork(CodeableConcept network) {
    this.network = network;
  }
  
  public Boolean getExcluded() {
    return excluded;
  }
  
  public void setExcluded(Boolean excluded) {
    this.excluded = excluded;
  }
  
  public CodeableConcept getUnit() {
    return unit;
  }
  
  public void setUnit(CodeableConcept unit) {
    this.unit = unit;
  }
  
  public String getAuthorizationUrl() {
    return authorizationUrl;
  }
  
  public void setAuthorizationUrl(String authorizationUrl) {
    this.authorizationUrl = authorizationUrl;
  }
  
  public Reference<Resource> getProvider() {
    return provider;
  }
  
  public void setProvider(Reference<Resource> provider) {
    this.provider = provider;
  }
  
  public Boolean getAuthorizationRequired() {
    return authorizationRequired;
  }
  
  public void setAuthorizationRequired(Boolean authorizationRequired) {
    this.authorizationRequired = authorizationRequired;
  }
  
  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  public CodeableConcept getTerm() {
    return term;
  }
  
  public void setTerm(CodeableConcept term) {
    this.term = term;
  }
  
  public CodeableConcept getCategory() {
    return category;
  }
  
  public void setCategory(CodeableConcept category) {
    this.category = category;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof CoverageEligibilityResponseItem) {
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
    return "CoverageEligibilityResponseItem(" + id + ")";
  }
}
