package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * If the Task.focus is a request resource and the task is seeking fulfillment (i.e. is asking for the request to be actioned), this element identifies any limitations on what parts of the referenced request should be actioned.
 * 
 * @see <a href="https://www.hl7.org/fhir/task-definitions.html#Task.restriction">Task.restriction</a>
 */
public 
class TaskRestriction extends BackboneElement implements Serializable 
{
  private static final long serialVersionUID = 1969251168343865896L;
  
  protected Integer repetitions;
  protected Period period;
  protected Reference<Resource>[] recipient;
  
  public TaskRestriction()
  {
  }
  
  public TaskRestriction(int repetitions)
  {
    this.repetitions = repetitions;
  }
  
  public TaskRestriction(int repetitions, Period period)
  {
    this.repetitions = repetitions;
    this.period = period;
  }
  
  public Integer getRepetitions() {
    return repetitions;
  }

  public Period getPeriod() {
    return period;
  }

  public Reference<Resource>[] getRecipient() {
    return recipient;
  }

  public void setRepetitions(Integer repetitions) {
    this.repetitions = repetitions;
  }

  public void setPeriod(Period period) {
    this.period = period;
  }

  public void setRecipient(Reference<Resource>[] recipient) {
    this.recipient = recipient;
  }

  @Override
  public boolean equals(Object object) {
    if(object instanceof TaskRestriction) {
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
    return "TaskRestriction(" + id + ")";
  }
}
