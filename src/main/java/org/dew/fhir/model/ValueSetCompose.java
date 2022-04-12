package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 * 
 * A set of criteria that define the contents of the value set by including or excluding codes selected from the specified code system(s) that the value set draws from. 
 * This is also known as the Content Logical Definition (CLD).
 *
 * @see <a href="https://www.hl7.org/fhir/valueset-definitions.html#ValueSet.compose">ValueSet.compose</a>
 */
public 
class ValueSetCompose extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 8653293128019905294L;
  
  protected Date lockedDate;
  protected Boolean inactive;
  protected ValueSetComposeInclude[] include;
  protected ValueSetComposeInclude[] exclude;
  
  public ValueSetCompose()
  {
  }

  public Date getLockedDate() {
    return lockedDate;
  }

  public Boolean getInactive() {
    return inactive;
  }

  public ValueSetComposeInclude[] getInclude() {
    return include;
  }

  public ValueSetComposeInclude[] getExclude() {
    return exclude;
  }

  public void setLockedDate(Date lockedDate) {
    this.lockedDate = lockedDate;
  }

  public void setInactive(Boolean inactive) {
    this.inactive = inactive;
  }

  public void setInclude(ValueSetComposeInclude[] include) {
    this.include = include;
  }

  public void setExclude(ValueSetComposeInclude[] exclude) {
    this.exclude = exclude;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof ValueSetCompose) {
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
    return "ValueSetCompose(" + id + "," + lockedDate + "," + inactive + ")";
  }
}
