package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * A Coding is a representation of a defined concept using a symbol from a defined "code system".
 * 
 * @see <a href="https://www.hl7.org/fhir/datatypes.html#Coding">Coding</a>
 */
public 
class Coding extends Element implements Serializable
{
  private static final long serialVersionUID = -6366388196465327881L;
  
  protected String system;
  protected String version;
  protected String code;
  protected String display;
  protected Boolean userSelected;
  
  public Coding()
  {
  }
  
  public Coding(String id, String display)
  {
    this.id = id;
    this.display = display;
  }
  
  public Coding(String id, String display, Boolean userSelected)
  {
    this.id = id;
    this.display = display;
    this.userSelected = userSelected;
  }
  
  public Coding(String id, String display, String code)
  {
    this.id = id;
    this.display = display;
    this.code = code;
  }
  
  public Coding(String id, String display, String code, Boolean userSelected)
  {
    this.id = id;
    this.code = code;
    this.display = display;
    this.userSelected = userSelected;
  }
  
  public Coding(String system, String version, String code, String display)
  {
    this.system = system;
    this.version = version;
    this.code = code;
    this.display = display;
  }
  
  public Coding(String system, String version, String code, String display, Boolean userSelected)
  {
    this.system = system;
    this.version = version;
    this.code = code;
    this.display = display;
    this.userSelected = userSelected;
  }
  
  public String getSystem() {
    return system;
  }

  public String getVersion() {
    return version;
  }

  public String getCode() {
    return code;
  }

  public String getDisplay() {
    return display;
  }

  public Boolean isUserSelected() {
    return userSelected;
  }

  public void setSystem(String system) {
    this.system = system;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public void setDisplay(String display) {
    this.display = display;
  }

  public void setUserSelected(Boolean userSelected) {
    this.userSelected = userSelected;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof Coding) {
      return this.hashCode() == object.hashCode();
    }
    return false;
  }

  @Override
  public int hashCode() {
    return (id + ":" + code).hashCode();
  }
  
  @Override
  public String toString() {
    return "Coding(" + id + "," + system + "," + version + "," + code + "," + display + ")";
  }
}
