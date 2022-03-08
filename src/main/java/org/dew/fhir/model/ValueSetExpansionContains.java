package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * The codes that are contained in the value set expansion.
 *
 * @see <a href="https://www.hl7.org/fhir/valueset-definitions.html#ValueSet.expansion.contains">ValueSet.expansion.contains</a>
 */
public 
class ValueSetExpansionContains extends BackboneElement implements Serializable 
{
  private static final long serialVersionUID = -6297952093676084595L;
  
  protected String system;
  protected Boolean abstract_; // Cannot use "abstract": it is a keyword!.
  protected Boolean inactive;
  protected String version;
  protected String code;
  protected String display;
  protected ValueSetComposeIncludeConceptDesignation[] designation;
  protected ValueSetExpansionContains[] contains;
  
  public ValueSetExpansionContains()
  {
  }

  public String getSystem() {
    return system;
  }

  public Boolean getAbstract_() {
    return abstract_;
  }

  public Boolean isInactive() {
    return inactive;
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

  public ValueSetComposeIncludeConceptDesignation[] getDesignation() {
    return designation;
  }

  public ValueSetExpansionContains[] getContains() {
    return contains;
  }

  public void setSystem(String system) {
    this.system = system;
  }

  public void setAbstract_(Boolean abstract_) {
    this.abstract_ = abstract_;
  }

  public void setInactive(Boolean inactive) {
    this.inactive = inactive;
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

  public void setDesignation(ValueSetComposeIncludeConceptDesignation[] designation) {
    this.designation = designation;
  }

  public void setContains(ValueSetExpansionContains[] contains) {
    this.contains = contains;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof ValueSetExpansionContains) {
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
    return "ValueSetExpansionContains(" + id + "," + system + "," + version + "," + code + ")";
  }
}
