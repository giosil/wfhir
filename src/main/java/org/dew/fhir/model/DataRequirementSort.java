package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * Specifies the order of the results to be returned.
 * 
 * @see <a href="https://www.hl7.org/fhir/metadatatypes-definitions.html#DataRequirement.sort">DataRequirement.sort</a>
 */
public 
class DataRequirementSort extends Element implements Serializable
{
  private static final long serialVersionUID = 5056462602005576329L;
  
  protected String path;
  protected String direction;
  
  public DataRequirementSort()
  {
  }

  public String getPath() {
    return path;
  }

  public String getDirection() {
    return direction;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public void setDirection(String direction) {
    this.direction = direction;
  }

  @Override
  public boolean equals(Object object) {
    if(object instanceof DataRequirementSort) {
      return this.hashCode() == object.hashCode();
    }
    return false;
  }
  
  @Override
  public int hashCode() {
    return (path + ":" + direction).hashCode();
  }
  
  @Override
  public String toString() {
    return "DataRequirementSort(" + path + "," + direction + ")";
  }
}
