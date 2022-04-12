package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * A request to supply a diet, formula feeding (enteral) or oral nutritional supplement to a patient/resident.
 *
 * @see <a href="https://www.hl7.org/fhir">NutritionOrder_EnteralFormula</a>
 */
public
class NutritionOrderEnteralFormula extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected String administrationInstruction;
  protected NutritionOrderAdministration[] administration;
  protected Quantity maxVolumeToDeliver;
  protected CodeableConcept routeofAdministration;
  protected String baseFormulaProductName;
  protected CodeableConcept additiveType;
  protected CodeableConcept baseFormulaType;
  protected Quantity caloricDensity;
  protected String additiveProductName;
  
  public NutritionOrderEnteralFormula()
  {
  }
  
  public String getAdministrationInstruction() {
    return administrationInstruction;
  }
  
  public void setAdministrationInstruction(String administrationInstruction) {
    this.administrationInstruction = administrationInstruction;
  }
  
  public NutritionOrderAdministration[] getAdministration() {
    return administration;
  }
  
  public void setAdministration(NutritionOrderAdministration[] administration) {
    this.administration = administration;
  }
  
  public Quantity getMaxVolumeToDeliver() {
    return maxVolumeToDeliver;
  }
  
  public void setMaxVolumeToDeliver(Quantity maxVolumeToDeliver) {
    this.maxVolumeToDeliver = maxVolumeToDeliver;
  }
  
  public CodeableConcept getRouteofAdministration() {
    return routeofAdministration;
  }
  
  public void setRouteofAdministration(CodeableConcept routeofAdministration) {
    this.routeofAdministration = routeofAdministration;
  }
  
  public String getBaseFormulaProductName() {
    return baseFormulaProductName;
  }
  
  public void setBaseFormulaProductName(String baseFormulaProductName) {
    this.baseFormulaProductName = baseFormulaProductName;
  }
  
  public CodeableConcept getAdditiveType() {
    return additiveType;
  }
  
  public void setAdditiveType(CodeableConcept additiveType) {
    this.additiveType = additiveType;
  }
  
  public CodeableConcept getBaseFormulaType() {
    return baseFormulaType;
  }
  
  public void setBaseFormulaType(CodeableConcept baseFormulaType) {
    this.baseFormulaType = baseFormulaType;
  }
  
  public Quantity getCaloricDensity() {
    return caloricDensity;
  }
  
  public void setCaloricDensity(Quantity caloricDensity) {
    this.caloricDensity = caloricDensity;
  }
  
  public String getAdditiveProductName() {
    return additiveProductName;
  }
  
  public void setAdditiveProductName(String additiveProductName) {
    this.additiveProductName = additiveProductName;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof NutritionOrderEnteralFormula) {
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
    return "NutritionOrderEnteralFormula(" + id + ")";
  }
}
