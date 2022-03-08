package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * Include one or more codes from a code system or other value set(s).
 *
 * @see <a href="https://www.hl7.org/fhir/valueset-definitions.html#ValueSet.compose.include">ValueSet.compose.include</a>
 */
public 
class ValueSetComposeInclude extends BackboneElement implements Serializable 
{
  private static final long serialVersionUID = -1809036882515033218L;
  
  protected String system;
  protected String version;
  protected ValueSetComposeIncludeConcept[] concept;
  protected ValueSetComposeIncludeFilter[] filter;
  protected String valueSet;
  
  public ValueSetComposeInclude()
  {
  }
  
  public ValueSetComposeInclude(String system)
  {
    this.system = system;
  }
  
  public ValueSetComposeInclude(String system, String version)
  {
    this.system = system;
    this.version = version;
  }

  public String getSystem() {
    return system;
  }

  public String getVersion() {
    return version;
  }

  public ValueSetComposeIncludeConcept[] getConcept() {
    return concept;
  }

  public ValueSetComposeIncludeFilter[] getFilter() {
    return filter;
  }

  public String getValueSet() {
    return valueSet;
  }

  public void setSystem(String system) {
    this.system = system;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public void setConcept(ValueSetComposeIncludeConcept[] concept) {
    this.concept = concept;
  }

  public void setFilter(ValueSetComposeIncludeFilter[] filter) {
    this.filter = filter;
  }

  public void setValueSet(String valueSet) {
    this.valueSet = valueSet;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof ValueSetComposeInclude) {
      return this.hashCode() == object.hashCode();
    }
    return false;
  }
  
  @Override
  public int hashCode() {
    return (system + ":" + version).hashCode();
  }
  
  @Override
  public String toString() {
    return "ValueSetComposeInclude(" + id + "," + system + "," + version + "," + valueSet + ")";
  }
}
