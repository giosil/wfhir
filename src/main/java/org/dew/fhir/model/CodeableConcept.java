package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * A CodeableConcept represents a value that is usually supplied by providing a reference to one or more terminologies or ontologies but may also be defined by the provision of text. 
 * This is a common pattern in healthcare data.
 *
 * @see <a href="https://www.hl7.org/fhir/datatypes.html#CodeableConcept">CodeableConcept</a>
 */
public 
class CodeableConcept extends Element implements Serializable
{
  private static final long serialVersionUID = -5864491111948530793L;
  
  protected Coding[] coding;
  protected String text;
  
  public CodeableConcept()
  {
  }

  public Coding[] getCoding() {
    return coding;
  }

  public String getText() {
    return text;
  }

  public void setCoding(Coding[] coding) {
    this.coding = coding;
  }

  public void setText(String text) {
    this.text = text;
  }

  @Override
  public boolean equals(Object object) {
    if(object instanceof CodeableConcept) {
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
    return "CodeableConcept(" + id + ")";
  }
}
