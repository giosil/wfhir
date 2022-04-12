package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * Todo.
 *
 * @see <a href="https://www.hl7.org/fhir">SubstancePolymer</a>
 */
public
class SubstancePolymer extends DomainResource implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected SubstancePolymerMonomerSet[] monomerSet;
  protected String[] modification;
  protected CodeableConcept[] copolymerConnectivity;
  protected SubstancePolymerRepeat[] repeat;
  protected CodeableConcept geometry;
  protected CodeableConcept class_;
  
  public SubstancePolymer()
  {
    this.resourceType = "SubstancePolymer";
  }
  
  public SubstancePolymerMonomerSet[] getMonomerSet() {
    return monomerSet;
  }
  
  public void setMonomerSet(SubstancePolymerMonomerSet[] monomerSet) {
    this.monomerSet = monomerSet;
  }
  
  public String[] getModification() {
    return modification;
  }
  
  public void setModification(String[] modification) {
    this.modification = modification;
  }
  
  public CodeableConcept[] getCopolymerConnectivity() {
    return copolymerConnectivity;
  }
  
  public void setCopolymerConnectivity(CodeableConcept[] copolymerConnectivity) {
    this.copolymerConnectivity = copolymerConnectivity;
  }
  
  public SubstancePolymerRepeat[] getRepeat() {
    return repeat;
  }
  
  public void setRepeat(SubstancePolymerRepeat[] repeat) {
    this.repeat = repeat;
  }
  
  public CodeableConcept getGeometry() {
    return geometry;
  }
  
  public void setGeometry(CodeableConcept geometry) {
    this.geometry = geometry;
  }
  
  public CodeableConcept getClass_() {
    return class_;
  }
  
  public void setClass_(CodeableConcept class_) {
    this.class_ = class_;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof SubstancePolymer) {
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
    return "SubstancePolymer(" + id + ")";
  }
}
