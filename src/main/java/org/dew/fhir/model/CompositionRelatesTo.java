package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * Relationships that this composition has with other compositions or documents that already exist.
 *
 * @see <a href="https://www.hl7.org/fhir/composition-definitions.html#Composition.relatesTo">Composition.relatesTo</a>
 */
public 
class CompositionRelatesTo extends DomainResource implements Serializable 
{
  private static final long serialVersionUID = 5496051787572820907L;
  
  protected String code;
  protected Identifier targetIdentifier;
  protected Reference<Composition> targetReference;
  
  public CompositionRelatesTo()
  {
  }
  
  public CompositionRelatesTo(String code)
  {
    this.code = code;
  }
  
  public CompositionRelatesTo(String code, Identifier targetIdentifier)
  {
    this.code = code;
    this.targetIdentifier = targetIdentifier;
  }
  
  public CompositionRelatesTo(String code, Identifier targetIdentifier, Reference<Composition> targetReference)
  {
    this.code = code;
    this.targetIdentifier = targetIdentifier;
    this.targetReference = targetReference;
  }

  public String getCode() {
    return code;
  }

  public Identifier getTargetIdentifier() {
    return targetIdentifier;
  }

  public Reference<Composition> getTargetReference() {
    return targetReference;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public void setTargetIdentifier(Identifier targetIdentifier) {
    this.targetIdentifier = targetIdentifier;
  }

  public void setTargetReference(Reference<Composition> targetReference) {
    this.targetReference = targetReference;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof CompositionRelatesTo) {
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
    return "CompositionRelatesTo(" + id + ")";
  }
}
