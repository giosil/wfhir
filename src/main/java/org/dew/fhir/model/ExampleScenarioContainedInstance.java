package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * Example of workflow instance.
 *
 * @see <a href="https://www.hl7.org/fhir">ExampleScenario_ContainedInstance</a>
 */
public
class ExampleScenarioContainedInstance extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected String resourceId;
  protected String versionId;
  
  public ExampleScenarioContainedInstance()
  {
  }
  
  public String getResourceId() {
    return resourceId;
  }
  
  public void setResourceId(String resourceId) {
    this.resourceId = resourceId;
  }
  
  public String getVersionId() {
    return versionId;
  }
  
  public void setVersionId(String versionId) {
    this.versionId = versionId;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof ExampleScenarioContainedInstance) {
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
    return "ExampleScenarioContainedInstance(" + id + ")";
  }
}
