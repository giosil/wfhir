package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * The data type or resource that the value of this element is permitted to be.
 *
 * @see <a href="https://www.hl7.org/fhir/elementdefinition-definitions.html#ElementDefinition.type">ElementDefinition.type</a>
 */
public 
class ElementDefinitionType extends Element implements Serializable 
{
  private static final long serialVersionUID = 4932458236719684719L;
  
  protected String code;
  protected String[] profile;
  protected String[] targetProfile;
  protected String[] aggregation;
  protected String versioning;
  
  public ElementDefinitionType()
  {
  }

  public String getCode() {
    return code;
  }

  public String[] getProfile() {
    return profile;
  }

  public String[] getTargetProfile() {
    return targetProfile;
  }

  public String[] getAggregation() {
    return aggregation;
  }

  public String getVersioning() {
    return versioning;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public void setProfile(String[] profile) {
    this.profile = profile;
  }

  public void setTargetProfile(String[] targetProfile) {
    this.targetProfile = targetProfile;
  }

  public void setAggregation(String[] aggregation) {
    this.aggregation = aggregation;
  }

  public void setVersioning(String versioning) {
    this.versioning = versioning;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof ElementDefinitionSlicing) {
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
    return "ElementDefinitionSlicing(" + id + ")";
  }
}
