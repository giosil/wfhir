package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * A homogeneous material with a definite composition.
 *
 * @see <a href="https://www.hl7.org/fhir/substance.html">Substance</a>
 */
public 
class Substance extends DomainResource implements Serializable
{
  private static final long serialVersionUID = -1287327482284819757L;
  
  protected Identifier[] identifier;
  protected String status;
  protected CodeableConcept[] category;
  protected CodeableConcept code;
  protected String description;
  protected SubstanceInstance[] instance;
  protected SubstanceIngredient[] ingredient;
  
  public Substance()
  {
    this.resourceType = "Substance";
  }

  public Identifier[] getIdentifier() {
    return identifier;
  }

  public String getStatus() {
    return status;
  }

  public CodeableConcept[] getCategory() {
    return category;
  }

  public CodeableConcept getCode() {
    return code;
  }

  public String getDescription() {
    return description;
  }

  public SubstanceInstance[] getInstance() {
    return instance;
  }

  public SubstanceIngredient[] getIngredient() {
    return ingredient;
  }

  public void setIdentifier(Identifier[] identifier) {
    this.identifier = identifier;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public void setCategory(CodeableConcept[] category) {
    this.category = category;
  }

  public void setCode(CodeableConcept code) {
    this.code = code;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public void setInstance(SubstanceInstance[] instance) {
    this.instance = instance;
  }

  public void setIngredient(SubstanceIngredient[] ingredient) {
    this.ingredient = ingredient;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof Substance) {
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
    return "Substance(" + id + ")";
  }
}
