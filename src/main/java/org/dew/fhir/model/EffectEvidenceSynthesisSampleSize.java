package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * The EffectEvidenceSynthesis resource describes the difference in an outcome between exposures states in a population where the effect estimate is derived from a combination of research studies.
 *
 * @see <a href="https://www.hl7.org/fhir">EffectEvidenceSynthesis_SampleSize</a>
 */
public
class EffectEvidenceSynthesisSampleSize extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected Integer numberOfParticipants;
  protected String description;
  protected Integer numberOfStudies;
  
  public EffectEvidenceSynthesisSampleSize()
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
    if(object instanceof EffectEvidenceSynthesisSampleSize) {
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
    return "EffectEvidenceSynthesisSampleSize(" + id + ")";
  }
}
