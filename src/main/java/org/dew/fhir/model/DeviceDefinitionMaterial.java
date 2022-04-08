package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * A substance used to create the material(s) of which the device is made.
 *
 * @see <a href="https://www.hl7.org/fhir/devicedefinition-definitions.html#DeviceDefinition.material">DeviceDefinition.material</a>
 */
public 
class DeviceDefinitionMaterial extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = -9107035039441043177L;
  
  protected CodeableConcept substance;
  protected Boolean alternate;
  protected Boolean allergenicIndicator;
  
  public DeviceDefinitionMaterial()
  {
  }
 
  public CodeableConcept getSubstance() {
    return substance;
  }

  public Boolean getAlternate() {
    return alternate;
  }

  public Boolean getAllergenicIndicator() {
    return allergenicIndicator;
  }

  public void setSubstance(CodeableConcept substance) {
    this.substance = substance;
  }

  public void setAlternate(Boolean alternate) {
    this.alternate = alternate;
  }

  public void setAllergenicIndicator(Boolean allergenicIndicator) {
    this.allergenicIndicator = allergenicIndicator;
  }

  @Override
  public boolean equals(Object object) {
    if(object instanceof DeviceDefinitionMaterial) {
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
    return "DeviceDefinitionMaterial(" + id + ")";
  }
}
