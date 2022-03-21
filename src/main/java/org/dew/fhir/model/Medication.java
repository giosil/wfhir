package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * This resource is primarily used for the identification and definition of a medication for the purposes of prescribing, dispensing, and administering a medication as well as for making statements about medication use.
 *
 * @see <a href="https://www.hl7.org/fhir/medication.html">Medication</a>
 */
public 
class Medication extends DomainResource implements Serializable 
{
  private static final long serialVersionUID = 4260202533070391630L;
  
  protected Identifier[] identifier;
  protected CodeableConcept code;
  protected String status;
  protected Reference<Organization> manufacturer;
  protected CodeableConcept form;
  protected Ratio amount;
  protected MedicationIngredient[] ingredient;
  protected MedicationBatch batch;
  
  public Medication()
  {
    this.resourceType = "Medication";
  }

  public Identifier[] getIdentifier() {
    return identifier;
  }

  public CodeableConcept getCode() {
    return code;
  }

  public String getStatus() {
    return status;
  }

  public Reference<Organization> getManufacturer() {
    return manufacturer;
  }

  public CodeableConcept getForm() {
    return form;
  }

  public Ratio getAmount() {
    return amount;
  }

  public MedicationIngredient[] getIngredient() {
    return ingredient;
  }

  public MedicationBatch getBatch() {
    return batch;
  }

  public void setIdentifier(Identifier[] identifier) {
    this.identifier = identifier;
  }

  public void setCode(CodeableConcept code) {
    this.code = code;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public void setManufacturer(Reference<Organization> manufacturer) {
    this.manufacturer = manufacturer;
  }

  public void setForm(CodeableConcept form) {
    this.form = form;
  }

  public void setAmount(Ratio amount) {
    this.amount = amount;
  }

  public void setIngredient(MedicationIngredient[] ingredient) {
    this.ingredient = ingredient;
  }

  public void setBatch(MedicationBatch batch) {
    this.batch = batch;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof Medication) {
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
    return "Medication(" + id + "," + code + ")";
  }
}
