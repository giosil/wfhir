package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * Information about the search process that lead to the creation of this entry.
 *
 * @see <a href="https://www.hl7.org/fhir/bundle-definitions.html#Bundle.entry.search">Bundle.entry.search</a>
 */
public 
class BundleEntrySearch extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 6631928918562193932L;
  
  protected String mode;
  protected Double score;
  
  public BundleEntrySearch()
  {
  }

  public String getMode() {
    return mode;
  }

  public Double getScore() {
    return score;
  }

  public void setMode(String mode) {
    this.mode = mode;
  }

  public void setScore(Double score) {
    this.score = score;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof BundleEntrySearch) {
      return this.hashCode() == object.hashCode();
    }
    return false;
  }
  
  @Override
  public int hashCode() {
    return (mode + ":" + score).hashCode();
  }
  
  @Override
  public String toString() {
    return "BundleEntrySearch(" + id + "," + mode + "," + score + ")";
  }
}
