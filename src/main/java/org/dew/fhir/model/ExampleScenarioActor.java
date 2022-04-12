package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * Example of workflow instance.
 *
 * @see <a href="https://www.hl7.org/fhir">ExampleScenario_Actor</a>
 */
public
class ExampleScenarioActor extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected String actorId;
  protected String name;
  protected String description;
  protected String type;
  
  public ExampleScenarioActor()
  {
  }
  
  public String getActorId() {
    return actorId;
  }
  
  public void setActorId(String actorId) {
    this.actorId = actorId;
  }
  
  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  public String getDescription() {
    return description;
  }
  
  public void setDescription(String description) {
    this.description = description;
  }
  
  public String getType() {
    return type;
  }
  
  public void setType(String type) {
    this.type = type;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof ExampleScenarioActor) {
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
    return "ExampleScenarioActor(" + id + ")";
  }
}
