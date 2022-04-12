package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 *
 * A request to supply a diet, formula feeding (enteral) or oral nutritional supplement to a patient/resident.
 *
 * @see <a href="https://www.hl7.org/fhir">NutritionOrder</a>
 */
public
class NutritionOrder extends DomainResource implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected Date dateTime;
  protected String[] instantiates;
  protected Annotation[] note;
  protected String[] instantiatesUri;
  protected Reference<Resource> patient;
  protected CodeableConcept[] foodPreferenceModifier;
  protected Identifier[] identifier;
  protected NutritionOrderOralDiet oralDiet;
  protected NutritionOrderEnteralFormula enteralFormula;
  protected CodeableConcept[] excludeFoodModifier;
  protected Reference<Resource> encounter;
  protected String[] instantiatesCanonical;
  protected String intent;
  protected NutritionOrderSupplement[] supplement;
  protected Reference<Resource> orderer;
  protected Reference<Resource>[] allergyIntolerance;
  protected String status;
  
  public NutritionOrder()
  {
    this.resourceType = "NutritionOrder";
  }
  
  public Date getDateTime() {
    return dateTime;
  }
  
  public void setDateTime(Date dateTime) {
    this.dateTime = dateTime;
  }
  
  public String[] getInstantiates() {
    return instantiates;
  }
  
  public void setInstantiates(String[] instantiates) {
    this.instantiates = instantiates;
  }
  
  public Annotation[] getNote() {
    return note;
  }
  
  public void setNote(Annotation[] note) {
    this.note = note;
  }
  
  public String[] getInstantiatesUri() {
    return instantiatesUri;
  }
  
  public void setInstantiatesUri(String[] instantiatesUri) {
    this.instantiatesUri = instantiatesUri;
  }
  
  public Reference<Resource> getPatient() {
    return patient;
  }
  
  public void setPatient(Reference<Resource> patient) {
    this.patient = patient;
  }
  
  public CodeableConcept[] getFoodPreferenceModifier() {
    return foodPreferenceModifier;
  }
  
  public void setFoodPreferenceModifier(CodeableConcept[] foodPreferenceModifier) {
    this.foodPreferenceModifier = foodPreferenceModifier;
  }
  
  public Identifier[] getIdentifier() {
    return identifier;
  }
  
  public void setIdentifier(Identifier[] identifier) {
    this.identifier = identifier;
  }
  
  public NutritionOrderOralDiet getOralDiet() {
    return oralDiet;
  }
  
  public void setOralDiet(NutritionOrderOralDiet oralDiet) {
    this.oralDiet = oralDiet;
  }
  
  public NutritionOrderEnteralFormula getEnteralFormula() {
    return enteralFormula;
  }
  
  public void setEnteralFormula(NutritionOrderEnteralFormula enteralFormula) {
    this.enteralFormula = enteralFormula;
  }
  
  public CodeableConcept[] getExcludeFoodModifier() {
    return excludeFoodModifier;
  }
  
  public void setExcludeFoodModifier(CodeableConcept[] excludeFoodModifier) {
    this.excludeFoodModifier = excludeFoodModifier;
  }
  
  public Reference<Resource> getEncounter() {
    return encounter;
  }
  
  public void setEncounter(Reference<Resource> encounter) {
    this.encounter = encounter;
  }
  
  public String[] getInstantiatesCanonical() {
    return instantiatesCanonical;
  }
  
  public void setInstantiatesCanonical(String[] instantiatesCanonical) {
    this.instantiatesCanonical = instantiatesCanonical;
  }
  
  public String getIntent() {
    return intent;
  }
  
  public void setIntent(String intent) {
    this.intent = intent;
  }
  
  public NutritionOrderSupplement[] getSupplement() {
    return supplement;
  }
  
  public void setSupplement(NutritionOrderSupplement[] supplement) {
    this.supplement = supplement;
  }
  
  public Reference<Resource> getOrderer() {
    return orderer;
  }
  
  public void setOrderer(Reference<Resource> orderer) {
    this.orderer = orderer;
  }
  
  public Reference<Resource>[] getAllergyIntolerance() {
    return allergyIntolerance;
  }
  
  public void setAllergyIntolerance(Reference<Resource>[] allergyIntolerance) {
    this.allergyIntolerance = allergyIntolerance;
  }
  
  public String getStatus() {
    return status;
  }
  
  public void setStatus(String status) {
    this.status = status;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof NutritionOrder) {
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
    return "NutritionOrder(" + id + ")";
  }
}
