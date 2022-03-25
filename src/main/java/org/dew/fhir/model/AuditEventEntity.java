package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * Specific instances of data or objects that have been accessed.
 *
 * @see <a href="https://www.hl7.org/fhir/auditevent-definitions.html#AuditEvent.entity">AuditEvent.entity</a>
 */
public 
class AuditEventEntity extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1963397203004760793L;
  
  protected Reference<Resource> what;
  protected Coding type;
  protected Coding role;
  protected Coding lifecycle;
  protected Coding[] securityLabel;
  protected String name;
  protected String description;
  protected String query;
  protected AuditEventEntityDetail[] detail;
  
  public AuditEventEntity()
  {
  }

  public Reference<Resource> getWhat() {
    return what;
  }

  public Coding getType() {
    return type;
  }

  public Coding getRole() {
    return role;
  }

  public Coding getLifecycle() {
    return lifecycle;
  }

  public Coding[] getSecurityLabel() {
    return securityLabel;
  }

  public String getName() {
    return name;
  }

  public String getDescription() {
    return description;
  }

  public String getQuery() {
    return query;
  }

  public AuditEventEntityDetail[] getDetail() {
    return detail;
  }

  public void setWhat(Reference<Resource> what) {
    this.what = what;
  }

  public void setType(Coding type) {
    this.type = type;
  }

  public void setRole(Coding role) {
    this.role = role;
  }

  public void setLifecycle(Coding lifecycle) {
    this.lifecycle = lifecycle;
  }

  public void setSecurityLabel(Coding[] securityLabel) {
    this.securityLabel = securityLabel;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public void setQuery(String query) {
    this.query = query;
  }

  public void setDetail(AuditEventEntityDetail[] detail) {
    this.detail = detail;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof AuditEventEntity) {
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
    return "AuditEventEntity(" + id + ")";
  }
}
