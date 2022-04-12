package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * A kind of specimen with associated set of requirements.
 *
 * @see <a href="https://www.hl7.org/fhir">SpecimenDefinition_TypeTested</a>
 */
public
class SpecimenDefinitionTypeTested extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected SpecimenDefinitionContainer container;
  protected Boolean isDerived;
  protected String preference;
  protected CodeableConcept[] rejectionCriterion;
  protected String requirement;
  protected CodeableConcept type;
  protected Duration retentionTime;
  protected SpecimenDefinitionHandling[] handling;
  
  public SpecimenDefinitionTypeTested()
  {
  }
  
  public SpecimenDefinitionContainer getContainer() {
    return container;
  }
  
  public void setContainer(SpecimenDefinitionContainer container) {
    this.container = container;
  }
  
  public Boolean getIsDerived() {
    return isDerived;
  }
  
  public void setIsDerived(Boolean isDerived) {
    this.isDerived = isDerived;
  }
  
  public String getPreference() {
    return preference;
  }
  
  public void setPreference(String preference) {
    this.preference = preference;
  }
  
  public CodeableConcept[] getRejectionCriterion() {
    return rejectionCriterion;
  }
  
  public void setRejectionCriterion(CodeableConcept[] rejectionCriterion) {
    this.rejectionCriterion = rejectionCriterion;
  }
  
  public String getRequirement() {
    return requirement;
  }
  
  public void setRequirement(String requirement) {
    this.requirement = requirement;
  }
  
  public CodeableConcept getType() {
    return type;
  }
  
  public void setType(CodeableConcept type) {
    this.type = type;
  }
  
  public Duration getRetentionTime() {
    return retentionTime;
  }
  
  public void setRetentionTime(Duration retentionTime) {
    this.retentionTime = retentionTime;
  }
  
  public SpecimenDefinitionHandling[] getHandling() {
    return handling;
  }
  
  public void setHandling(SpecimenDefinitionHandling[] handling) {
    this.handling = handling;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof SpecimenDefinitionTypeTested) {
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
    return "SpecimenDefinitionTypeTested(" + id + ")";
  }
}
