package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * Example of workflow instance.
 *
 * @see <a href="https://www.hl7.org/fhir">ExampleScenario_Step</a>
 */
public
class ExampleScenarioStep extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected ExampleScenarioProcess[] process;
  protected ExampleScenarioAlternative[] alternative;
  protected ExampleScenarioOperation operation;
  protected Boolean pause;
  
  public ExampleScenarioStep()
  {
  }
  
  public ExampleScenarioProcess[] getProcess() {
    return process;
  }
  
  public void setProcess(ExampleScenarioProcess[] process) {
    this.process = process;
  }
  
  public ExampleScenarioAlternative[] getAlternative() {
    return alternative;
  }
  
  public void setAlternative(ExampleScenarioAlternative[] alternative) {
    this.alternative = alternative;
  }
  
  public ExampleScenarioOperation getOperation() {
    return operation;
  }
  
  public void setOperation(ExampleScenarioOperation operation) {
    this.operation = operation;
  }
  
  public Boolean getPause() {
    return pause;
  }
  
  public void setPause(Boolean pause) {
    this.pause = pause;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof ExampleScenarioStep) {
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
    return "ExampleScenarioStep(" + id + ")";
  }
}
