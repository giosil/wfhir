package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 * 
 * A participant who has attested to the accuracy of the composition/document.
 *
 * @see <a href="https://www.hl7.org/fhir/composition-definitions.html#Composition.attester">Composition.attester</a>
 */
public 
class CompositionAttester extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 676912989603995263L;
  
  protected String mode;
  protected Date time;
  protected Reference<Resource> party;
  
  public CompositionAttester()
  {
  }
  
  public CompositionAttester(String mode)
  {
    this.mode = mode;
  }
  
  public CompositionAttester(String mode, Date time)
  {
    this.mode = mode;
    this.time = time;
  }
  
  public CompositionAttester(String mode, Date time, Reference<Resource> party)
  {
    this.mode = mode;
    this.time = time;
    this.party = party;
  }

  public String getMode() {
    return mode;
  }

  public Date getTime() {
    return time;
  }

  public Reference<Resource> getParty() {
    return party;
  }

  public void setMode(String mode) {
    this.mode = mode;
  }

  public void setTime(Date time) {
    this.time = time;
  }

  public void setParty(Reference<Resource> party) {
    this.party = party;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof CompositionAttester) {
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
    return "CompositionAttester(" + id + ")";
  }
}
