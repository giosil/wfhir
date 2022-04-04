package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * A specification of the restful capabilities of the solution for a specific resource type.
 *
 * @see <a href="https://www.hl7.org/fhir/capabilitystatement-definitions.html#CapabilityStatement.rest.resource">CapabilityStatement.rest.resource</a>
 */
public 
class CapabilityStatementRestResource extends BackboneElement implements Serializable 
{
  private static final long serialVersionUID = 8433253843719445195L;
  
  protected String type;
  protected String profile;
  protected String supportedProfile;
  protected String documentation;
  protected CapabilityStatementRestResourceInteraction interaction;
  protected String versioning;
  protected Boolean readHistory;
  protected Boolean updateCreate;
  protected String conditionalRead;
  protected Boolean conditionalUpdate;
  protected String conditionalDelete;
  protected String[] referencePolicy;
  protected String[] searchInclude;
  protected String[] searchRevInclude;
  protected CapabilityStatementRestResourceSearchParam[] searchParam;
  protected CapabilityStatementRestResourceOperation[] operation;
  
  public CapabilityStatementRestResource()
  {
  }

  public String getType() {
    return type;
  }

  public String getProfile() {
    return profile;
  }

  public String getSupportedProfile() {
    return supportedProfile;
  }

  public String getDocumentation() {
    return documentation;
  }

  public CapabilityStatementRestResourceInteraction getInteraction() {
    return interaction;
  }

  public String getVersioning() {
    return versioning;
  }

  public Boolean getReadHistory() {
    return readHistory;
  }

  public Boolean getUpdateCreate() {
    return updateCreate;
  }

  public String getConditionalRead() {
    return conditionalRead;
  }

  public Boolean getConditionalUpdate() {
    return conditionalUpdate;
  }

  public String getConditionalDelete() {
    return conditionalDelete;
  }

  public String[] getReferencePolicy() {
    return referencePolicy;
  }

  public String[] getSearchInclude() {
    return searchInclude;
  }

  public String[] getSearchRevInclude() {
    return searchRevInclude;
  }

  public CapabilityStatementRestResourceSearchParam[] getSearchParam() {
    return searchParam;
  }

  public CapabilityStatementRestResourceOperation[] getOperation() {
    return operation;
  }

  public void setType(String type) {
    this.type = type;
  }

  public void setProfile(String profile) {
    this.profile = profile;
  }

  public void setSupportedProfile(String supportedProfile) {
    this.supportedProfile = supportedProfile;
  }

  public void setDocumentation(String documentation) {
    this.documentation = documentation;
  }

  public void setInteraction(CapabilityStatementRestResourceInteraction interaction) {
    this.interaction = interaction;
  }

  public void setVersioning(String versioning) {
    this.versioning = versioning;
  }

  public void setReadHistory(Boolean readHistory) {
    this.readHistory = readHistory;
  }

  public void setUpdateCreate(Boolean updateCreate) {
    this.updateCreate = updateCreate;
  }

  public void setConditionalRead(String conditionalRead) {
    this.conditionalRead = conditionalRead;
  }

  public void setConditionalUpdate(Boolean conditionalUpdate) {
    this.conditionalUpdate = conditionalUpdate;
  }

  public void setConditionalDelete(String conditionalDelete) {
    this.conditionalDelete = conditionalDelete;
  }

  public void setReferencePolicy(String[] referencePolicy) {
    this.referencePolicy = referencePolicy;
  }

  public void setSearchInclude(String[] searchInclude) {
    this.searchInclude = searchInclude;
  }

  public void setSearchRevInclude(String[] searchRevInclude) {
    this.searchRevInclude = searchRevInclude;
  }

  public void setSearchParam(CapabilityStatementRestResourceSearchParam[] searchParam) {
    this.searchParam = searchParam;
  }

  public void setOperation(CapabilityStatementRestResourceOperation[] operation) {
    this.operation = operation;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof CapabilityStatementRestResource) {
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
    return "CapabilityStatementRestResource(" + id + "," + type + "," + profile + ")";
  }
}
