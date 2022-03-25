package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * Tagged value pairs for conveying additional information about the entity.
 *
 * @see <a href="https://www.hl7.org/fhir/auditevent-definitions.html#AuditEvent.entity.detail">AuditEvent.entity.detail</a>
 */
public 
class AuditEventEntityDetail extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = -7535807785753061439L;
  
  protected String type;
  protected String valueString;
  protected String valueBase64Binary;
  
  public AuditEventEntityDetail()
  {
  }

  public String getType() {
    return type;
  }

  public String getValueString() {
    return valueString;
  }

  public String getValueBase64Binary() {
    return valueBase64Binary;
  }

  public void setType(String type) {
    this.type = type;
  }

  public void setValueString(String valueString) {
    this.valueString = valueString;
  }

  public void setValueBase64Binary(String valueBase64Binary) {
    this.valueBase64Binary = valueBase64Binary;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof AuditEventEntityDetail) {
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
    return "AuditEventEntityDetail(" + id + ")";
  }
}
