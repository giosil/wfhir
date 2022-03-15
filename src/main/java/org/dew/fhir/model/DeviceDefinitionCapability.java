package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * Device capabilities.
 *
 * @see <a href="https://www.hl7.org/fhir/devicedefinition-definitions.html#DeviceDefinition.capability">DeviceDefinition.capability</a>
 */
public 
class DeviceDefinitionCapability extends BackboneElement implements Serializable 
{
  private static final long serialVersionUID = 7986854839217486781L;
  
  protected CodeableConcept type;
  protected CodeableConcept[] description;
  
  public DeviceDefinitionCapability()
  {
  }

  public CodeableConcept getType() {
    return type;
  }

  public CodeableConcept[] getDescription() {
    return description;
  }

  public void setType(CodeableConcept type) {
    this.type = type;
  }

  public void setDescription(CodeableConcept[] description) {
    this.description = description;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof DeviceDefinitionCapability) {
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
    return "DeviceDefinitionCapability(" + id + ")";
  }
}
