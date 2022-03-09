package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * The DataRequirement structure defines a general data requirement for a knowledge asset such as a decision support rule or quality measure.
 * 
 * @see <a href="https://www.hl7.org/fhir/metadatatypes.html#DataRequirement">DataRequirement</a>
 */
public 
class DataRequirement extends Element implements Serializable
{
  private static final long serialVersionUID = 5846068590746767404L;
  
  protected String type;
  protected String[] profile;
  protected CodeableConcept subjectCodeableConcept;
  protected Reference<Group> subjectReference;
  protected String[] mustSupport;
  protected DataRequirementCodeFilter[] codeFilter;
  protected DataRequirementDateFilter[] dateFilter;
  protected Integer limit;
  protected DataRequirementSort[] sort;
  
  public DataRequirement()
  {
  }
  
  public DataRequirement(String type)
  {
    this.type = type;
  }

  public String getType() {
    return type;
  }

  public String[] getProfile() {
    return profile;
  }

  public CodeableConcept getSubjectCodeableConcept() {
    return subjectCodeableConcept;
  }

  public Reference<Group> getSubjectReference() {
    return subjectReference;
  }

  public String[] getMustSupport() {
    return mustSupport;
  }

  public DataRequirementCodeFilter[] getCodeFilter() {
    return codeFilter;
  }

  public DataRequirementDateFilter[] getDateFilter() {
    return dateFilter;
  }

  public Integer getLimit() {
    return limit;
  }

  public DataRequirementSort[] getSort() {
    return sort;
  }

  public void setType(String type) {
    this.type = type;
  }

  public void setProfile(String[] profile) {
    this.profile = profile;
  }

  public void setSubjectCodeableConcept(CodeableConcept subjectCodeableConcept) {
    this.subjectCodeableConcept = subjectCodeableConcept;
  }

  public void setSubjectReference(Reference<Group> subjectReference) {
    this.subjectReference = subjectReference;
  }

  public void setMustSupport(String[] mustSupport) {
    this.mustSupport = mustSupport;
  }

  public void setCodeFilter(DataRequirementCodeFilter[] codeFilter) {
    this.codeFilter = codeFilter;
  }

  public void setDateFilter(DataRequirementDateFilter[] dateFilter) {
    this.dateFilter = dateFilter;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  public void setSort(DataRequirementSort[] sort) {
    this.sort = sort;
  }

  @Override
  public boolean equals(Object object) {
    if(object instanceof DataRequirement) {
      return this.hashCode() == object.hashCode();
    }
    return false;
  }
  
  @Override
  public int hashCode() {
    return (type + ":" + profile).hashCode();
  }
  
  @Override
  public String toString() {
    return "DataRequirement(" + type + "," + profile + ")";
  }
}
