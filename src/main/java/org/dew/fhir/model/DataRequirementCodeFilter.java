package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * Code filters specify additional constraints on the data, specifying the value set of interest for a particular element of the data. Each code filter defines an additional constraInteger on the data, i.e. code filters are AND'ed, not OR'ed.
 * 
 * @see <a href="https://www.hl7.org/fhir/metadatatypes-definitions.html#DataRequirement.codeFilter">DataRequirement.codeFilter</a>
 */
public 
class DataRequirementCodeFilter extends Element implements Serializable
{
  private static final long serialVersionUID = -913402495574110415L;
  
  protected String path;
  protected String searchParam;
  protected String valueSet;
  protected Coding[] code;
  
  public DataRequirementCodeFilter()
  {
  }

  public String getPath() {
    return path;
  }

  public String getSearchParam() {
    return searchParam;
  }

  public String getValueSet() {
    return valueSet;
  }

  public Coding[] getCode() {
    return code;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public void setSearchParam(String searchParam) {
    this.searchParam = searchParam;
  }

  public void setValueSet(String valueSet) {
    this.valueSet = valueSet;
  }

  public void setCode(Coding[] code) {
    this.code = code;
  }

  @Override
  public boolean equals(Object object) {
    if(object instanceof DataRequirementCodeFilter) {
      return this.hashCode() == object.hashCode();
    }
    return false;
  }
  
  @Override
  public int hashCode() {
    return (path + ":" + searchParam + ":" + valueSet).hashCode();
  }
  
  @Override
  public String toString() {
    return "DataRequirementCodeFilter(" + path + "," + searchParam + "," + valueSet + ")";
  }
}