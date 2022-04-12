package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * A formal computable definition of an operation (on the RESTful interface) or a named query (using the search interaction).
 *
 * @see <a href="https://www.hl7.org/fhir">OperationDefinition_Parameter</a>
 */
public
class OperationDefinitionParameter extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected String max;
  protected String searchType;
  protected String use;
  protected String documentation;
  protected OperationDefinitionParameter[] part;
  protected OperationDefinitionBinding binding;
  protected String type;
  protected OperationDefinitionReferencedFrom[] referencedFrom;
  protected Integer min;
  protected String name;
  protected String[] targetProfile;
  
  public OperationDefinitionParameter()
  {
  }
  
  public String getMax() {
    return max;
  }
  
  public void setMax(String max) {
    this.max = max;
  }
  
  public String getSearchType() {
    return searchType;
  }
  
  public void setSearchType(String searchType) {
    this.searchType = searchType;
  }
  
  public String getUse() {
    return use;
  }
  
  public void setUse(String use) {
    this.use = use;
  }
  
  public String getDocumentation() {
    return documentation;
  }
  
  public void setDocumentation(String documentation) {
    this.documentation = documentation;
  }
  
  public OperationDefinitionParameter[] getPart() {
    return part;
  }
  
  public void setPart(OperationDefinitionParameter[] part) {
    this.part = part;
  }
  
  public OperationDefinitionBinding getBinding() {
    return binding;
  }
  
  public void setBinding(OperationDefinitionBinding binding) {
    this.binding = binding;
  }
  
  public String getType() {
    return type;
  }
  
  public void setType(String type) {
    this.type = type;
  }
  
  public OperationDefinitionReferencedFrom[] getReferencedFrom() {
    return referencedFrom;
  }
  
  public void setReferencedFrom(OperationDefinitionReferencedFrom[] referencedFrom) {
    this.referencedFrom = referencedFrom;
  }
  
  public Integer getMin() {
    return min;
  }
  
  public void setMin(Integer min) {
    this.min = min;
  }
  
  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  public String[] getTargetProfile() {
    return targetProfile;
  }
  
  public void setTargetProfile(String[] targetProfile) {
    this.targetProfile = targetProfile;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof OperationDefinitionParameter) {
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
    return "OperationDefinitionParameter(" + id + ")";
  }
}
