package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * Distance data type.
 * 
 * @see <a href="https://www.hl7.org/fhir/datatypes.html#Distance">Distance</a>
 */
public 
class Distance extends Element implements Serializable
{
  private static final long serialVersionUID = -726267586501975517L;
  
  protected String code;
  protected String system;
  protected int value;
  
  public Distance()
  {
  }
  
  public String getCode() {
    return code;
  }

  public String getSystem() {
    return system;
  }

  public int getValue() {
    return value;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public void setSystem(String system) {
    this.system = system;
  }

  public void setValue(int value) {
    this.value = value;
  }

  @Override
  public boolean equals(Object object) {
    if(object instanceof Distance) {
      return this.hashCode() == object.hashCode();
    }
    return false;
  }
  
  @Override
  public int hashCode() {
    return value;
  }
  
  @Override
  public String toString() {
    return "Distance(" + code + "," + system + "," + value + ")";
  }
}