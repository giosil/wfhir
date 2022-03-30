package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * Identifies the resource (or resources) that are being addressed by the event. 
 * For example, the Encounter for an admit message or two Account records for a merge.
 *
 * @see <a href="https://www.hl7.org/fhir/messagedefinition-definitions.html#MessageDefinition.focus">MessageDefinition.focus</a>
 */
public 
class MessageDefinitionFocus extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = -1012165991171924294L;
  
  protected String code;
  protected String profile;
  protected Integer min;
  protected String max;
  
  public MessageDefinitionFocus()
  {
  }

  public String getCode() {
    return code;
  }

  public String getProfile() {
    return profile;
  }

  public Integer getMin() {
    return min;
  }

  public String getMax() {
    return max;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public void setProfile(String profile) {
    this.profile = profile;
  }

  public void setMin(Integer min) {
    this.min = min;
  }

  public void setMax(String max) {
    this.max = max;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof MessageDefinitionFocus) {
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
    return "MessageDefinitionFocus(" + id + "," + code + "," + profile + ")";
  }
}
