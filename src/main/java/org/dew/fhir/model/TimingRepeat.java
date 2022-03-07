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
  private static final long serialVersionUID = 8182794633816339756L;
  
  protected Duration boundsDuration;
  protected Range boundsRange;
  protected Period boundsPeriod;
  protected int count;
  protected int countMax;
  protected double duration;
  protected double durationMax;
  protected String durationUnit;
  protected int frequency;
  protected int frequencyMax;
  protected double period;
  protected double periodMax;
  protected String periodUnit;
  protected String dayOfWeek;
  protected Date timeOfDay;
  protected String when;
  protected int offset;
  
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

  public int getCount() {
    return count;
  }

  public int getCountMax() {
    return countMax;
  }

  public double getDuration() {
    return duration;
  }

  public double getDurationMax() {
    return durationMax;
  }

  public String getDurationUnit() {
    return durationUnit;
  }

  public int getFrequency() {
    return frequency;
  }

  public int getFrequencyMax() {
    return frequencyMax;
  }

  public double getPeriod() {
    return period;
  }

  public double getPeriodMax() {
    return periodMax;
  }

  public String getPeriodUnit() {
    return periodUnit;
  }

  public String getDayOfWeek() {
    return dayOfWeek;
  }

  public Date getTimeOfDay() {
    return timeOfDay;
  }

  public String getWhen() {
    return when;
  }

  public int getOffset() {
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

  public void setCount(int count) {
    this.count = count;
  }

  public void setCountMax(int countMax) {
    this.countMax = countMax;
  }

  public void setDuration(double duration) {
    this.duration = duration;
  }

  public void setDurationMax(double durationMax) {
    this.durationMax = durationMax;
  }

  public void setDurationUnit(String durationUnit) {
    this.durationUnit = durationUnit;
  }

  public void setFrequency(int frequency) {
    this.frequency = frequency;
  }

  public void setFrequencyMax(int frequencyMax) {
    this.frequencyMax = frequencyMax;
  }

  public void setPeriod(double period) {
    this.period = period;
  }

  public void setPeriodMax(double periodMax) {
    this.periodMax = periodMax;
  }

  public void setPeriodUnit(String periodUnit) {
    this.periodUnit = periodUnit;
  }

  public void setDayOfWeek(String dayOfWeek) {
    this.dayOfWeek = dayOfWeek;
  }

  public void setTimeOfDay(Date timeOfDay) {
    this.timeOfDay = timeOfDay;
  }

  public void setWhen(String when) {
    this.when = when;
  }

  public void setOffset(int offset) {
    this.offset = offset;
  }

  @Override
  public boolean equals(Object object) {
    if(object instanceof Ratio) {
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