package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 * 
 * A time period defined by a start and end date/time.
 *
 * @see <a href="https://www.hl7.org/fhir/datatypes.html#Period">Period</a>
 */
public 
class Period extends Element implements Serializable
{
  private static final long serialVersionUID = -7311603580309653793L;
  
  protected Date start;
  protected Date end;
  
  public Period()
  {
  }

  public Date getStart() {
    return start;
  }

  public Date getEnd() {
    return end;
  }

  public void setStart(Date start) {
    this.start = start;
  }

  public void setEnd(Date end) {
    this.end = end;
  }

  @Override
  public boolean equals(Object object) {
    if(object instanceof Period) {
      return this.hashCode() == object.hashCode();
    }
    return false;
  }
  
  @Override
  public int hashCode() {
    return (start + ":" + end).hashCode();
  }
  
  @Override
  public String toString() {
    return "Period(" + id + "," + start + "," + end + ")";
  }
}
