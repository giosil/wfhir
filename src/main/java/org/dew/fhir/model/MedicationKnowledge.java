package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * Information about a medication that is used to support knowledge.
 *
 * @see <a href="https://www.hl7.org/fhir/medicationknowledge.html">MedicationKnowledge</a>
 */
public 
class MedicationKnowledge extends DomainResource implements Serializable 
{
  private static final long serialVersionUID = -7575155093135780029L;
  
  protected CodeableConcept code;
  protected String status;
  protected Reference<Organization> manufacturer;
  protected CodeableConcept doseForm;
  protected Quantity amount;
  protected String[] synonym;
  protected MedicationKnowledgeRelatedMedicationKnowledge[] relatedMedicationKnowledge;
  protected Reference<Medication>[] associatedMedication;
  protected CodeableConcept[] productType;
  protected MedicationKnowledgeMonograph[] monograph;
  protected MedicationKnowledgeIngredient[] ingredient;
  protected String preparationInstruction;
  protected CodeableConcept[] intendedRoute;
  protected MedicationKnowledgeCost[] cost;
  protected MedicationKnowledgeMonitoringProgram[] monitoringProgram;
  protected MedicationKnowledgeAdministrationGuidelines[] administrationGuidelines;
  protected MedicationKnowledgeMedicineClassification[] medicineClassification;
  protected MedicationKnowledgePackaging packaging;
  protected MedicationKnowledgeDrugCharacteristic[] drugCharacteristic;
  protected Reference<DetectedIssue>[] contraindication;
  protected MedicationKnowledgeRegulatory[] regulatory;
  protected MedicationKnowledgeKinetics[] kinetics;
  
  public MedicationKnowledge()
  {
    this.resourceType = "MedicationKnowledge";
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

  public CodeableConcept getDoseForm() {
    return doseForm;
  }

  public Quantity getAmount() {
    return amount;
  }

  public String[] getSynonym() {
    return synonym;
  }

  public MedicationKnowledgeRelatedMedicationKnowledge[] getRelatedMedicationKnowledge() {
    return relatedMedicationKnowledge;
  }

  public Reference<Medication>[] getAssociatedMedication() {
    return associatedMedication;
  }

  public CodeableConcept[] getProductType() {
    return productType;
  }

  public MedicationKnowledgeMonograph[] getMonograph() {
    return monograph;
  }

  public MedicationKnowledgeIngredient[] getIngredient() {
    return ingredient;
  }

  public String getPreparationInstruction() {
    return preparationInstruction;
  }

  public CodeableConcept[] getIntendedRoute() {
    return intendedRoute;
  }

  public MedicationKnowledgeCost[] getCost() {
    return cost;
  }

  public MedicationKnowledgeMonitoringProgram[] getMonitoringProgram() {
    return monitoringProgram;
  }

  public MedicationKnowledgeAdministrationGuidelines[] getAdministrationGuidelines() {
    return administrationGuidelines;
  }

  public MedicationKnowledgeMedicineClassification[] getMedicineClassification() {
    return medicineClassification;
  }

  public MedicationKnowledgePackaging getPackaging() {
    return packaging;
  }

  public MedicationKnowledgeDrugCharacteristic[] getDrugCharacteristic() {
    return drugCharacteristic;
  }

  public Reference<DetectedIssue>[] getContraindication() {
    return contraindication;
  }

  public MedicationKnowledgeRegulatory[] getRegulatory() {
    return regulatory;
  }

  public MedicationKnowledgeKinetics[] getKinetics() {
    return kinetics;
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

  public void setDoseForm(CodeableConcept doseForm) {
    this.doseForm = doseForm;
  }

  public void setAmount(Quantity amount) {
    this.amount = amount;
  }

  public void setSynonym(String[] synonym) {
    this.synonym = synonym;
  }

  public void setRelatedMedicationKnowledge(MedicationKnowledgeRelatedMedicationKnowledge[] relatedMedicationKnowledge) {
    this.relatedMedicationKnowledge = relatedMedicationKnowledge;
  }

  public void setAssociatedMedication(Reference<Medication>[] associatedMedication) {
    this.associatedMedication = associatedMedication;
  }

  public void setProductType(CodeableConcept[] productType) {
    this.productType = productType;
  }

  public void setMonograph(MedicationKnowledgeMonograph[] monograph) {
    this.monograph = monograph;
  }

  public void setIngredient(MedicationKnowledgeIngredient[] ingredient) {
    this.ingredient = ingredient;
  }

  public void setPreparationInstruction(String preparationInstruction) {
    this.preparationInstruction = preparationInstruction;
  }

  public void setIntendedRoute(CodeableConcept[] intendedRoute) {
    this.intendedRoute = intendedRoute;
  }

  public void setCost(MedicationKnowledgeCost[] cost) {
    this.cost = cost;
  }

  public void setMonitoringProgram(MedicationKnowledgeMonitoringProgram[] monitoringProgram) {
    this.monitoringProgram = monitoringProgram;
  }

  public void setAdministrationGuidelines(MedicationKnowledgeAdministrationGuidelines[] administrationGuidelines) {
    this.administrationGuidelines = administrationGuidelines;
  }

  public void setMedicineClassification(MedicationKnowledgeMedicineClassification[] medicineClassification) {
    this.medicineClassification = medicineClassification;
  }

  public void setPackaging(MedicationKnowledgePackaging packaging) {
    this.packaging = packaging;
  }

  public void setDrugCharacteristic(MedicationKnowledgeDrugCharacteristic[] drugCharacteristic) {
    this.drugCharacteristic = drugCharacteristic;
  }

  public void setContraindication(Reference<DetectedIssue>[] contraindication) {
    this.contraindication = contraindication;
  }

  public void setRegulatory(MedicationKnowledgeRegulatory[] regulatory) {
    this.regulatory = regulatory;
  }

  public void setKinetics(MedicationKnowledgeKinetics[] kinetics) {
    this.kinetics = kinetics;
  }

  @Override
  public boolean equals(Object object) {
    if(object instanceof MedicationKnowledge) {
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
    return "MedicationKnowledge(" + id + "," + code + "," + manufacturer + ")";
  }
}
