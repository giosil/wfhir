package org.dew.fhir.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 *  Describes the occurrence of an event that may occur multiple times. 
 *  Timing schedules are used for specifying when events are expected or requested to occur and may also be used to represent the summary of a past or ongoing event. 
 *  For simplicity, the definitions of Timing components are expressed as 'future' events, but such components can also be used to describe historic or ongoing events.
 *
 * @see <a href="https://www.hl7.org/fhir/datatypes.html#Timing">Timing</a>
 */
public 
class Timing extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = -5659079428222456954L;
  
  protected Date[] event;
  protected TimingRepeat repeat;
  protected CodeableConcept code;
  
  public Timing()
  {
  }
  
  public Timing(CodeableConcept code)
  {
    this.code = code;
  }
  
  public Date[] getEvent() {
    return event;
  }

  public TimingRepeat getRepeat() {
    return repeat;
  }

  public CodeableConcept getCode() {
    return code;
  }

  public void setEvent(Date[] event) {
    this.event = event;
  }

  public void setRepeat(TimingRepeat repeat) {
    this.repeat = repeat;
  }

  public void setCode(CodeableConcept code) {
    this.code = code;
  }

  @Override
  public boolean equals(Object object) {
    if(object instanceof Timing) {
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
    return "Timing(" + id + ")";
  }
}
