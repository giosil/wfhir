package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 *
 * A material substance originating from a biological entity intended to be transplanted or infused into another (possibly the same) biological entity.
 *
 * @see <a href="https://www.hl7.org/fhir">BiologicallyDerivedProduct_Collection</a>
 */
public
class BiologicallyDerivedProductCollection extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected Period collectedPeriod;
  protected Date collectedDateTime;
  protected Reference<Resource> source;
  protected Reference<Resource> collector;
  
  public BiologicallyDerivedProductCollection()
  {
  }
  
  public Period getCollectedPeriod() {
    return collectedPeriod;
  }
  
  public void setCollectedPeriod(Period collectedPeriod) {
    this.collectedPeriod = collectedPeriod;
  }
  
  public Date getCollectedDateTime() {
    return collectedDateTime;
  }
  
  public void setCollectedDateTime(Date collectedDateTime) {
    this.collectedDateTime = collectedDateTime;
  }
  
  public Reference<Resource> getSource() {
    return source;
  }
  
  public void setSource(Reference<Resource> source) {
    this.source = source;
  }
  
  public Reference<Resource> getCollector() {
    return collector;
  }
  
  public void setCollector(Reference<Resource> collector) {
    this.collector = collector;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof BiologicallyDerivedProductCollection) {
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
    return "BiologicallyDerivedProductCollection(" + id + ")";
  }
}
