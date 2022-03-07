package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * Represents a defined collection of entities that may be discussed or acted upon collectively but which are not expected to act collectively, and are not formally or legally recognized; i.e. a collection of entities that isn't an Organization.
 *
 * @see <a href="https://www.hl7.org/fhir/group.html">Group</a>
 */
public 
class Group extends DomainResource implements Serializable
{
  private static final long serialVersionUID = -9028624104483647077L;
  
  protected Identifier[] identifier;
  protected boolean active;
  protected CodeableConcept type;
  protected boolean actual;
  protected CodeableConcept code;
  protected String name;
  protected int quantity;
  protected Reference<Resource> managingEntity;
  protected GroupCharacteristic[] characteristic;
  protected GroupMember[] member;
  
  public Group()
  {
  }
  
  public Group(Identifier singleIdentifier)
  {
    this.identifier = new Identifier[] { singleIdentifier };
    this.active = true;
  }
  
  public Group(Identifier[] identifier)
  {
    this.identifier = identifier;
    this.active = true;
  }
  
  public Group(Identifier singleIdentifier, String name)
  {
    this.identifier = new Identifier[] { singleIdentifier };
    this.name = name;
    this.active = true;
  }
  
  public Group(Identifier[] identifier, String name)
  {
    this.identifier = identifier;
    this.name = name;
    this.active = true;
  }
  
  public Identifier[] getIdentifier() {
    return identifier;
  }

  public boolean isActive() {
    return active;
  }

  public CodeableConcept getType() {
    return type;
  }

  public boolean isActual() {
    return actual;
  }

  public CodeableConcept getCode() {
    return code;
  }

  public String getName() {
    return name;
  }

  public int getQuantity() {
    return quantity;
  }

  public Reference<Resource> getManagingEntity() {
    return managingEntity;
  }

  public GroupCharacteristic[] getCharacteristic() {
    return characteristic;
  }

  public GroupMember[] getMember() {
    return member;
  }

  public void setIdentifier(Identifier[] identifier) {
    this.identifier = identifier;
  }

  public void setActive(boolean active) {
    this.active = active;
  }

  public void setType(CodeableConcept type) {
    this.type = type;
  }

  public void setActual(boolean actual) {
    this.actual = actual;
  }

  public void setCode(CodeableConcept code) {
    this.code = code;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  public void setManagingEntity(Reference<Resource> managingEntity) {
    this.managingEntity = managingEntity;
  }

  public void setCharacteristic(GroupCharacteristic[] characteristic) {
    this.characteristic = characteristic;
  }

  public void setMember(GroupMember[] member) {
    this.member = member;
  }

  @Override
  public boolean equals(Object object) {
    if(object instanceof Group) {
      return this.hashCode() == object.hashCode();
    }
    return false;
  }
  
  @Override
  public int hashCode() {
    if(name == null) return 0;
    return name.hashCode();
  }
  
  @Override
  public String toString() {
    return "Group(" + id + "," + name + ")";
  }
}
