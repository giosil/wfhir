package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * An experimental feature attribute that defines the quality of the feature in a quantitative way, such as a phred quality score.
 *
 * @see <a href="https://www.hl7.org/fhir/molecularsequence-definitions.html#MolecularSequence.quality">MolecularSequence.quality</a>
 */
public 
class MolecularSequenceQuality extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = -8771219412131444731L;
  
  protected String type;
  protected CodeableConcept standardSequence;
  protected Integer start;
  protected Integer end;
  protected Quantity score;
  protected CodeableConcept method;
  protected Double truthTP;
  protected Double queryTP;
  protected Double truthFN;
  protected Double queryFP;
  protected Double gtFP;
  protected Double precision;
  protected Double recall;
  protected Double fScore;
  protected MolecularSequenceQualityRoc roc;
  
  public MolecularSequenceQuality()
  {
  }
  
  public String getType() {
    return type;
  }

  public CodeableConcept getStandardSequence() {
    return standardSequence;
  }

  public Integer getStart() {
    return start;
  }

  public Integer getEnd() {
    return end;
  }

  public Quantity getScore() {
    return score;
  }

  public CodeableConcept getMethod() {
    return method;
  }

  public Double getTruthTP() {
    return truthTP;
  }

  public Double getQueryTP() {
    return queryTP;
  }

  public Double getTruthFN() {
    return truthFN;
  }

  public Double getQueryFP() {
    return queryFP;
  }

  public Double getGtFP() {
    return gtFP;
  }

  public Double getPrecision() {
    return precision;
  }

  public Double getRecall() {
    return recall;
  }

  public Double getFScore() {
    return fScore;
  }

  public MolecularSequenceQualityRoc getRoc() {
    return roc;
  }

  public void setType(String type) {
    this.type = type;
  }

  public void setStandardSequence(CodeableConcept standardSequence) {
    this.standardSequence = standardSequence;
  }

  public void setStart(Integer start) {
    this.start = start;
  }

  public void setEnd(Integer end) {
    this.end = end;
  }

  public void setScore(Quantity score) {
    this.score = score;
  }

  public void setMethod(CodeableConcept method) {
    this.method = method;
  }

  public void setTruthTP(Double truthTP) {
    this.truthTP = truthTP;
  }

  public void setQueryTP(Double queryTP) {
    this.queryTP = queryTP;
  }

  public void setTruthFN(Double truthFN) {
    this.truthFN = truthFN;
  }

  public void setQueryFP(Double queryFP) {
    this.queryFP = queryFP;
  }

  public void setGtFP(Double gtFP) {
    this.gtFP = gtFP;
  }

  public void setPrecision(Double precision) {
    this.precision = precision;
  }

  public void setRecall(Double recall) {
    this.recall = recall;
  }

  public void setFScore(Double fScore) {
    this.fScore = fScore;
  }

  public void setRoc(MolecularSequenceQualityRoc roc) {
    this.roc = roc;
  }

  @Override
  public boolean equals(Object object) {
    if(object instanceof MolecularSequenceQuality) {
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
    return "MolecularSequenceQuality(" + id + "," + standardSequence + "," + start + "," + end + ")";
  }
}
