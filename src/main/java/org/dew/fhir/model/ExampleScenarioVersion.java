package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * Example of workflow instance.
 *
 * @see <a href="https://www.hl7.org/fhir">ExampleScenario_Version</a>
 */
public
class ExampleScenarioVersion extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected String versionId;
  protected String description;
  
  public ExampleScenarioVersion()
  {
  }
  
  public String getVersionId() {
    return versionId;
  }
  
  public void setVersionId(String versionId) {
    this.versionId = versionId;
  }
  
  public String getDescription() {
    return description;
  }
  
  public void setDescription(String description) {
    this.description = description;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof ExampleScenarioVersion) {
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
    return "ExampleScenarioVersion(" + id + ")";
  }
}
