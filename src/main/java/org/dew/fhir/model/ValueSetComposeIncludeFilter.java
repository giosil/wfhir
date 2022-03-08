package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * Select concepts by specify a matching criterion based on the properties (including relationships) defined by the system, or on filters defined by the system. 
 * If multiple filters are specified, they SHALL all be true.
 *
 * @see <a href="https://www.hl7.org/fhir/valueset-definitions.html#ValueSet.compose.include.filter">ValueSet.compose.include.filter</a>
 */
public 
class ValueSetComposeIncludeFilter extends BackboneElement implements Serializable 
{
  private static final long serialVersionUID = 633246178935213273L;
  
  protected String property;
  protected String op;
  protected String value;
  
  public ValueSetComposeIncludeFilter()
  {
  }

  public String getProperty() {
    return property;
  }

  public String getOp() {
    return op;
  }

  public String getValue() {
    return value;
  }

  public void setProperty(String property) {
    this.property = property;
  }

  public void setOp(String op) {
    this.op = op;
  }

  public void setValue(String value) {
    this.value = value;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof ValueSetComposeIncludeFilter) {
      return this.hashCode() == object.hashCode();
    }
    return false;
  }
  
  @Override
  public int hashCode() {
    return (property + ":" + value).hashCode();
  }
  
  @Override
  public String toString() {
    return "ValueSetComposeIncludeFilter(" + id + "," + property + "," + op + "," + value + ")";
  }
}
