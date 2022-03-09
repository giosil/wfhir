package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * The ParameterDefinition structure defines a parameter to a knowledge asset such as a decision support rule or quality measure.
 * 
 * @see <a href="https://www.hl7.org/fhir/metadatatypes.html#ParameterDefinition">ParameterDefinition</a>
 */
public 
class ParameterDefinition extends Element implements Serializable
{
  private static final long serialVersionUID = -7499369813680662422L;
  
  protected String name;
  protected String use;
  protected Integer min;
  protected String max; // Is string!
  protected String documentation;
  protected String type;
  protected String profile;
  
  public ParameterDefinition()
  {
  }
  
  public ParameterDefinition(String name)
  {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public String getUse() {
    return use;
  }

  public Integer getMin() {
    return min;
  }

  public String getMax() {
    return max;
  }

  public String getDocumentation() {
    return documentation;
  }

  public String getType() {
    return type;
  }

  public String getProfile() {
    return profile;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setUse(String use) {
    this.use = use;
  }

  public void setMin(Integer min) {
    this.min = min;
  }

  public void setMax(String max) {
    this.max = max;
  }

  public void setDocumentation(String documentation) {
    this.documentation = documentation;
  }

  public void setType(String type) {
    this.type = type;
  }

  public void setProfile(String profile) {
    this.profile = profile;
  }

  @Override
  public boolean equals(Object object) {
    if(object instanceof ParameterDefinition) {
      return this.hashCode() == object.hashCode();
    }
    return false;
  }
  
  @Override
  public int hashCode() {
    if(name == null) return 0;
    return name.hashCode();
  }
  
  @Override
  public String toString() {
    return "ParameterDefinition(" + name + ")";
  }
}