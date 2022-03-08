package org.dew.fhir.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * Date filters specify additional constraints on the data in terms of the applicable date range for specific elements. Each date filter specifies an additional constraInteger on the data, i.e. date filters are AND'ed, not OR'ed.
 * 
 * @see <a href="https://www.hl7.org/fhir/metadatatypes-definitions.html#DataRequirement.dateFilter">DataRequirement.dateFilter</a>
 */
public 
class DataRequirementDateFilter extends Element implements Serializable
{
  private static final long serialVersionUID = -8363938745987171337L;
  
  protected String path;
  protected String searchParam;
  protected Date valueDateTime;
  protected Period valuePeriod;
  protected Duration valueDuration;
  
  public DataRequirementDateFilter()
  {
  }

  public String getPath() {
    return path;
  }

  public String getSearchParam() {
    return searchParam;
  }

  public Date getValueDateTime() {
    return valueDateTime;
  }

  public Period getValuePeriod() {
    return valuePeriod;
  }

  public Duration getValueDuration() {
    return valueDuration;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public void setSearchParam(String searchParam) {
    this.searchParam = searchParam;
  }

  public void setValueDateTime(Date valueDateTime) {
    this.valueDateTime = valueDateTime;
  }

  public void setValuePeriod(Period valuePeriod) {
    this.valuePeriod = valuePeriod;
  }

  public void setValueDuration(Duration valueDuration) {
    this.valueDuration = valueDuration;
  }

  @Override
  public boolean equals(Object object) {
    if(object instanceof DataRequirementDateFilter) {
      return this.hashCode() == object.hashCode();
    }
    return false;
  }
  
  @Override
  public int hashCode() {
    return (path + ":" + searchParam).hashCode();
  }
  
  @Override
  public String toString() {
    return "DataRequirementDateFilter(" + path + "," + searchParam + ")";
  }
}
