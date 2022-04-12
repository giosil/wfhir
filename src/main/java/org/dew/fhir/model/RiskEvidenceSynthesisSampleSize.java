package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * The RiskEvidenceSynthesis resource describes the likelihood of an outcome in a population plus exposure state where the risk estimate is derived from a combination of research studies.
 *
 * @see <a href="https://www.hl7.org/fhir">RiskEvidenceSynthesis_SampleSize</a>
 */
public
class RiskEvidenceSynthesisSampleSize extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected Integer numberOfParticipants;
  protected String description;
  protected Integer numberOfStudies;
  
  public RiskEvidenceSynthesisSampleSize()
  {
  }
  
  public Integer getNumberOfParticipants() {
    return numberOfParticipants;
  }
  
  public void setNumberOfParticipants(Integer numberOfParticipants) {
    this.numberOfParticipants = numberOfParticipants;
  }
  
  public String getDescription() {
    return description;
  }
  
  public void setDescription(String description) {
    this.description = description;
  }
  
  public Integer getNumberOfStudies() {
    return numberOfStudies;
  }
  
  public void setNumberOfStudies(Integer numberOfStudies) {
    this.numberOfStudies = numberOfStudies;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof RiskEvidenceSynthesisSampleSize) {
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
    return "RiskEvidenceSynthesisSampleSize(" + id + ")";
  }
}
