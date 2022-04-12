package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * Example of workflow instance.
 *
 * @see <a href="https://www.hl7.org/fhir">ExampleScenario_Alternative</a>
 */
public
class ExampleScenarioAlternative extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected String description;
  protected ExampleScenarioStep[] step;
  protected String title;
  
  public ExampleScenarioAlternative()
  {
  }
  
  public String getDescription() {
    return description;
  }
  
  public void setDescription(String description) {
    this.description = description;
  }
  
  public ExampleScenarioStep[] getStep() {
    return step;
  }
  
  public void setStep(ExampleScenarioStep[] step) {
    this.step = step;
  }
  
  public String getTitle() {
    return title;
  }
  
  public void setTitle(String title) {
    this.title = title;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof ExampleScenarioAlternative) {
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
    return "ExampleScenarioAlternative(" + id + ")";
  }
}
