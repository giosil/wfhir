package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * A medicinal product in a container or package.
 *
 * @see <a href="https://www.hl7.org/fhir">MedicinalProductPackaged_BatchIdentifier</a>
 */
public
class MedicinalProductPackagedBatchIdentifier extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected Identifier immediatePackaging;
  protected Identifier outerPackaging;
  
  public MedicinalProductPackagedBatchIdentifier()
  {
  }
  
  public Identifier getImmediatePackaging() {
    return immediatePackaging;
  }
  
  public void setImmediatePackaging(Identifier immediatePackaging) {
    this.immediatePackaging = immediatePackaging;
  }
  
  public Identifier getOuterPackaging() {
    return outerPackaging;
  }
  
  public void setOuterPackaging(Identifier outerPackaging) {
    this.outerPackaging = outerPackaging;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof MedicinalProductPackagedBatchIdentifier) {
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
    return "MedicinalProductPackagedBatchIdentifier(" + id + ")";
  }
}
