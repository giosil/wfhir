package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * Todo.
 *
 * @see <a href="https://www.hl7.org/fhir">SubstanceReferenceInformation_GeneElement</a>
 */
public
class SubstanceReferenceInformationGeneElement extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected Reference<Resource>[] source;
  protected CodeableConcept type;
  protected Identifier element;
  
  public SubstanceReferenceInformationGeneElement()
  {
  }
  
  public Reference<Resource>[] getSource() {
    return source;
  }
  
  public void setSource(Reference<Resource>[] source) {
    this.source = source;
  }
  
  public CodeableConcept getType() {
    return type;
  }
  
  public void setType(CodeableConcept type) {
    this.type = type;
  }
  
  public Identifier getElement() {
    return element;
  }
  
  public void setElement(Identifier element) {
    this.element = element;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof SubstanceReferenceInformationGeneElement) {
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
    return "SubstanceReferenceInformationGeneElement(" + id + ")";
  }
}
