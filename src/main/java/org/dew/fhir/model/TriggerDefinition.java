package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 * 
 * The TriggerDefinition structure defines when a knowledge artifact is expected to be evaluated.
 * 
 * @see <a href="https://www.hl7.org/fhir/metadatatypes.html#TriggerDefinition">TriggerDefinition</a>
 */
public 
class TriggerDefinition extends Element implements Serializable
{
  private static final long serialVersionUID = -7860987903572076004L;
  
  protected String type;
  protected String name;
  protected Timing timingTiming;
  protected Reference<Schedule> timingReference;
  protected Date timingDate;
  protected Date timingDateTime;
  protected DataRequirement[] data;
  protected Expression condition;
  
  public TriggerDefinition()
  {
  }

  public String getType() {
    return type;
  }

  public String getName() {
    return name;
  }

  public Timing getTimingTiming() {
    return timingTiming;
  }

  public Reference<Schedule> getTimingReference() {
    return timingReference;
  }

  public Date getTimingDate() {
    return timingDate;
  }

  public Date getTimingDateTime() {
    return timingDateTime;
  }

  public DataRequirement[] getData() {
    return data;
  }

  public Expression getCondition() {
    return condition;
  }

  public void setType(String type) {
    this.type = type;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setTimingTiming(Timing timingTiming) {
    this.timingTiming = timingTiming;
  }

  public void setTimingReference(Reference<Schedule> timingReference) {
    this.timingReference = timingReference;
  }

  public void setTimingDate(Date timingDate) {
    this.timingDate = timingDate;
  }

  public void setTimingDateTime(Date timingDateTime) {
    this.timingDateTime = timingDateTime;
  }

  public void setData(DataRequirement[] data) {
    this.data = data;
  }

  public void setCondition(Expression condition) {
    this.condition = condition;
  }

  @Override
  public boolean equals(Object object) {
    if(object instanceof TriggerDefinition) {
      return this.hashCode() == object.hashCode();
    }
    return false;
  }
  
  @Override
  public int hashCode() {
    return (type + ":" + name).hashCode();
  }
  
  @Override
  public String toString() {
    return "TriggerDefinition(" + type + "," + name + ")";
  }
}
