package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * Goals that describe what the activities within the plan are intended to achieve. 
 * For example, weight loss, restoring an activity of daily living, obtaining herd immunity via immunization, meeting a process improvement objective, etc.
 * 
 * @see <a href="https://www.hl7.org/fhir/plandefinition-definitions.html#PlanDefinition.goal">PlanDefinition.goal</a>
 */
public 
class PlanDefinitionGoal extends BackboneElement implements Serializable 
{
  private static final long serialVersionUID = 1390413804687468867L;

  protected CodeableConcept category;
  protected CodeableConcept description;
  protected CodeableConcept priority;
  protected CodeableConcept start;
  protected CodeableConcept[] addresses;
  protected RelatedArtifact[] documentation;
  protected PlanDefinitionGoalTarget[] target;
  
  public PlanDefinitionGoal()
  {
  }
  
  public CodeableConcept getCategory() {
    return category;
  }

  public CodeableConcept getDescription() {
    return description;
  }

  public CodeableConcept getPriority() {
    return priority;
  }

  public CodeableConcept getStart() {
    return start;
  }

  public CodeableConcept[] getAddresses() {
    return addresses;
  }

  public RelatedArtifact[] getDocumentation() {
    return documentation;
  }

  public PlanDefinitionGoalTarget[] getTarget() {
    return target;
  }

  public void setCategory(CodeableConcept category) {
    this.category = category;
  }

  public void setDescription(CodeableConcept description) {
    this.description = description;
  }

  public void setPriority(CodeableConcept priority) {
    this.priority = priority;
  }

  public void setStart(CodeableConcept start) {
    this.start = start;
  }

  public void setAddresses(CodeableConcept[] addresses) {
    this.addresses = addresses;
  }

  public void setDocumentation(RelatedArtifact[] documentation) {
    this.documentation = documentation;
  }

  public void setTarget(PlanDefinitionGoalTarget[] target) {
    this.target = target;
  }

  @Override
  public boolean equals(Object object) {
    if(object instanceof PlanDefinitionGoal) {
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
    return "PlanDefinitionGoal(" + id + "," + category + "," + description + "," + priority + ")";
  }
}
