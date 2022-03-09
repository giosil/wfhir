package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 * 
 * A set of rules that describe when the event is scheduled.
 * 
 * @see <a href="https://www.hl7.org/fhir/datatypes-definitions.html#Timing.repeat">Timing.repeat</a>
 */
public 
class TimingRepeat extends Element implements Serializable
{
  private static final long serialVersionUID = 7218560351640820256L;
  
  protected Duration boundsDuration;
  protected Range boundsRange;
  protected Period boundsPeriod;
  protected Integer count;
  protected Integer countMax;
  protected Double duration;
  protected Double durationMax;
  protected String durationUnit;
  protected Integer frequency;
  protected Integer frequencyMax;
  protected Double period;
  protected Double periodMax;
  protected String periodUnit;
  protected String[] dayOfWeek;
  protected Date[] timeOfDay;
  protected String[] when;
  protected Integer offset;
  
  public TimingRepeat()
  {
  }

  public Duration getBoundsDuration() {
    return boundsDuration;
  }

  public Range getBoundsRange() {
    return boundsRange;
  }

  public Period getBoundsPeriod() {
    return boundsPeriod;
  }

  public Integer getCount() {
    return count;
  }

  public Integer getCountMax() {
    return countMax;
  }

  public Double getDuration() {
    return duration;
  }

  public Double getDurationMax() {
    return durationMax;
  }

  public String getDurationUnit() {
    return durationUnit;
  }

  public Integer getFrequency() {
    return frequency;
  }

  public Integer getFrequencyMax() {
    return frequencyMax;
  }

  public Double getPeriod() {
    return period;
  }

  public Double getPeriodMax() {
    return periodMax;
  }

  public String getPeriodUnit() {
    return periodUnit;
  }

  public String[] getDayOfWeek() {
    return dayOfWeek;
  }

  public Date[] getTimeOfDay() {
    return timeOfDay;
  }

  public String[] getWhen() {
    return when;
  }

  public Integer getOffset() {
    return offset;
  }

  public void setBoundsDuration(Duration boundsDuration) {
    this.boundsDuration = boundsDuration;
  }

  public void setBoundsRange(Range boundsRange) {
    this.boundsRange = boundsRange;
  }

  public void setBoundsPeriod(Period boundsPeriod) {
    this.boundsPeriod = boundsPeriod;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public void setCountMax(Integer countMax) {
    this.countMax = countMax;
  }

  public void setDuration(Double duration) {
    this.duration = duration;
  }

  public void setDurationMax(Double durationMax) {
    this.durationMax = durationMax;
  }

  public void setDurationUnit(String durationUnit) {
    this.durationUnit = durationUnit;
  }

  public void setFrequency(Integer frequency) {
    this.frequency = frequency;
  }

  public void setFrequencyMax(Integer frequencyMax) {
    this.frequencyMax = frequencyMax;
  }

  public void setPeriod(Double period) {
    this.period = period;
  }

  public void setPeriodMax(Double periodMax) {
    this.periodMax = periodMax;
  }

  public void setPeriodUnit(String periodUnit) {
    this.periodUnit = periodUnit;
  }

  public void setDayOfWeek(String[] dayOfWeek) {
    this.dayOfWeek = dayOfWeek;
  }

  public void setTimeOfDay(Date[] timeOfDay) {
    this.timeOfDay = timeOfDay;
  }

  public void setWhen(String[] when) {
    this.when = when;
  }

  public void setOffset(Integer offset) {
    this.offset = offset;
  }

  @Override
  public boolean equals(Object object) {
    if(object instanceof TimingRepeat) {
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
    return "TimingRepeat(" + id + ")";
  }
}