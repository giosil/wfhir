package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * Security labels that protect the handling of information about the term and its elements, which may be specifically identified.
 *
 * @see <a href="https://www.hl7.org/fhir/contract-definitions.html#Contract.term.securityLabel">Contract.term.securityLabel</a>
 */
public 
class ContractTermSecurityLabel extends BackboneElement implements Serializable 
{
  private static final long serialVersionUID = 4896802243683829657L;
  
  protected Integer[] number;
  protected Coding classification;
  protected Coding[] category;
  protected Coding[] control;
  
  public ContractTermSecurityLabel()
  {
  }

  public Integer[] getNumber() {
    return number;
  }

  public Coding getClassification() {
    return classification;
  }

  public Coding[] getCategory() {
    return category;
  }

  public Coding[] getControl() {
    return control;
  }

  public void setNumber(Integer[] number) {
    this.number = number;
  }

  public void setClassification(Coding classification) {
    this.classification = classification;
  }

  public void setCategory(Coding[] category) {
    this.category = category;
  }

  public void setControl(Coding[] control) {
    this.control = control;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof ContractContentDefinition) {
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
    return "ContractTermSecurityLabel(" + id + "," + classification + ")";
  }
}
