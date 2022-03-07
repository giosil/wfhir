package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 *  The Dosage structure defines general dosage instruction information typically represented in medication requests, medication dispenses and medication statements.
 *
 * @see <a href="https://www.hl7.org/fhir/dosage.html#Dosage">Dosage</a>
 */
public 
class Dosage extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = -6483017982427909521L;
  
  protected int sequence;
  protected String text;
  protected CodeableConcept additionalInstruction;
  protected String patientInstruction;
  
  public Dosage()
  {
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof Dosage) {
      return this.hashCode() == object.hashCode();
    }
    return false;
  }
  
  @Override
  public int hashCode() {
    if(text == null) return 0;
    return text.hashCode();
  }
  
  @Override
  public String toString() {
    return "Dosage(" + id + "," + sequence + "," + text + ")";
  }
}