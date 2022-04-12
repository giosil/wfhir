package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * Example of workflow instance.
 *
 * @see <a href="https://www.hl7.org/fhir">ExampleScenario_Instance</a>
 */
public
class ExampleScenarioInstance extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected String resourceId;
  protected String description;
  protected ExampleScenarioContainedInstance[] containedInstance;
  protected ExampleScenarioVersion[] version;
  protected String name;
  
  public ExampleScenarioInstance()
  {
  }
  
  public String getResourceId() {
    return resourceId;
  }
  
  public void setResourceId(String resourceId) {
    this.resourceId = resourceId;
  }
  
  public String getDescription() {
    return description;
  }
  
  public void setDescription(String description) {
    this.description = description;
  }
  
  public ExampleScenarioContainedInstance[] getContainedInstance() {
    return containedInstance;
  }
  
  public void setContainedInstance(ExampleScenarioContainedInstance[] containedInstance) {
    this.containedInstance = containedInstance;
  }
  
  public ExampleScenarioVersion[] getVersion() {
    return version;
  }
  
  public void setVersion(ExampleScenarioVersion[] version) {
    this.version = version;
  }
  
  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof ExampleScenarioInstance) {
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
    return "ExampleScenarioInstance(" + id + ")";
  }
}
