package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * Receiver Operator Characteristic (ROC) Curve to give sensitivity/specificity tradeoff.
 *
 * @see <a href="https://www.hl7.org/fhir/molecularsequence-definitions.html#MolecularSequence.quality.roc">MolecularSequence.quality.roc</a>
 */
public 
class MolecularSequenceQualityRoc extends BackboneElement implements Serializable 
{
  private static final long serialVersionUID = 4595735847729219920L;

  protected Integer[] score;
  protected Integer[] numTP;
  protected Integer[] numFP;
  protected Integer[] numFN;
  protected Double[] precision;
  protected Double[] sensitivity;
  protected Double[] fMeasure;
  
  public MolecularSequenceQualityRoc()
  {
  }

  public Integer[] getScore() {
    return score;
  }

  public Integer[] getNumTP() {
    return numTP;
  }

  public Integer[] getNumFP() {
    return numFP;
  }

  public Integer[] getNumFN() {
    return numFN;
  }

  public Double[] getPrecision() {
    return precision;
  }

  public Double[] getSensitivity() {
    return sensitivity;
  }

  public Double[] getfMeasure() {
    return fMeasure;
  }

  public void setScore(Integer[] score) {
    this.score = score;
  }

  public void setNumTP(Integer[] numTP) {
    this.numTP = numTP;
  }

  public void setNumFP(Integer[] numFP) {
    this.numFP = numFP;
  }

  public void setNumFN(Integer[] numFN) {
    this.numFN = numFN;
  }

  public void setPrecision(Double[] precision) {
    this.precision = precision;
  }

  public void setSensitivity(Double[] sensitivity) {
    this.sensitivity = sensitivity;
  }

  public void setfMeasure(Double[] fMeasure) {
    this.fMeasure = fMeasure;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof MolecularSequenceQualityRoc) {
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
    return "MolecularSequenceQualityRoc(" + id + ")";
  }
}
