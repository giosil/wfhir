package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 * 
 * A value set can also be "expanded", where the value set is turned into a simple collection of enumerated codes. 
 * This element holds the expansion, if it has been performed.
 *
 * @see <a href="https://www.hl7.org/fhir/valueset-definitions.html#ValueSet.expansion">ValueSet.expansion</a>
 */
public 
class ValueSetExpansion extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 5100255444198791633L;
  
  protected String identifier;
  protected Date timestamp;
  protected Integer total;
  protected Integer offset;
  protected ValueSetExpansionParameter[] parameter;
  protected ValueSetExpansionContains[] contains;
  
  public ValueSetExpansion()
  {
  }

  public String getIdentifier() {
    return identifier;
  }

  public Date getTimestamp() {
    return timestamp;
  }

  public Integer getTotal() {
    return total;
  }

  public Integer getOffset() {
    return offset;
  }

  public ValueSetExpansionParameter[] getParameter() {
    return parameter;
  }

  public ValueSetExpansionContains[] getContains() {
    return contains;
  }

  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }

  public void setTimestamp(Date timestamp) {
    this.timestamp = timestamp;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }

  public void setOffset(Integer offset) {
    this.offset = offset;
  }

  public void setParameter(ValueSetExpansionParameter[] parameter) {
    this.parameter = parameter;
  }

  public void setContains(ValueSetExpansionContains[] contains) {
    this.contains = contains;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof ValueSetExpansion) {
      return this.hashCode() == object.hashCode();
    }
    return false;
  }
  
  @Override
  public int hashCode() {
    if(identifier == null) return 0;
    return identifier.hashCode();
  }
  
  @Override
  public String toString() {
    return "ValueSetExpansion(" + id + "," + identifier + ")";
  }
}
