package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * A numeric or alphanumeric string that is associated with a single object or entity within a given system. 
 * Typically, identifiers are used to connect content in resources to external content available in other frameworks or protocols. 
 * Identifiers are associated with objects and may be changed or retired due to human or system process and errors.
 * 
 * @see <a href="https://www.hl7.org/fhir/datatypes.html#Identifier">Identifier</a>
 */
public 
class Identifier extends Element implements Serializable
{
  private static final long serialVersionUID = 6269754276935411804L;
  
  protected String use;
  protected CodeableConcept type;
  protected String system;
  protected String value;
  protected Period period;
  protected Reference<Organization> assigner;
  
  public Identifier()
  {
  }

  public Identifier(String system, String value)
  {
    this.system = system;
    this.value = value;
  }

  public String getUse() {
    return use;
  }

  public CodeableConcept getType() {
    return type;
  }

  public String getSystem() {
    return system;
  }

  public String getValue() {
    return value;
  }

  public Period getPeriod() {
    return period;
  }

  public Reference<Organization> getAssigner() {
    return assigner;
  }

  public void setUse(String use) {
    this.use = use;
  }

  public void setType(CodeableConcept type) {
    this.type = type;
  }

  public void setSystem(String system) {
    this.system = system;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public void setPeriod(Period period) {
    this.period = period;
  }

  public void setAssigner(Reference<Organization> assigner) {
    this.assigner = assigner;
  }

  @Override
  public boolean equals(Object object) {
    if(object instanceof Identifier) {
      return this.hashCode() == object.hashCode();
    }
    return false;
  }

  @Override
  public int hashCode() {
    return (system + ":" + value).hashCode();
  }
  
  @Override
  public String toString() {
    return "Identifier(" + use + "," + system + "," + value + ")";
  }
}
