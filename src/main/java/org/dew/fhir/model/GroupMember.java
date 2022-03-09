package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * Identifies the resource instances that are members of the group.
 *
 * @see <a href="https://www.hl7.org/fhir/group-definitions.html#Group.member">Group.member</a>
 */
public 
class GroupMember extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = -2113568141872759378L;
  
  protected Reference<Resource> entity;
  protected Period period;
  protected Boolean inactive;
  
  public GroupMember()
  {
  }

  public GroupMember(Reference<Resource> entity)
  {
    this.entity = entity;
  }

  public Reference<Resource> getEntity() {
    return entity;
  }

  public Period getPeriod() {
    return period;
  }

  public Boolean getInactive() {
    return inactive;
  }

  public void setEntity(Reference<Resource> entity) {
    this.entity = entity;
  }

  public void setPeriod(Period period) {
    this.period = period;
  }

  public void setInactive(Boolean inactive) {
    this.inactive = inactive;
  }

  @Override
  public boolean equals(Object object) {
    if(object instanceof GroupMember) {
      return this.hashCode() == object.hashCode();
    }
    return false;
  }
  
  @Override
  public int hashCode() {
    if(entity == null) return 0;
    return entity.hashCode();
  }
  
  @Override
  public String toString() {
    return "GroupMember(" + id + "," + entity + ")";
  }
}
