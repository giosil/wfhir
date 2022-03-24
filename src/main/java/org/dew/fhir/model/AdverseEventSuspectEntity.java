package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * Describes the entity that is suspected to have caused the adverse event.
 *
 * @see <a href="https://www.hl7.org/fhir/adverseevent-definitions.html#AdverseEvent.suspectEntity">AdverseEvent.suspectEntity</a>
 */
public 
class AdverseEventSuspectEntity extends BackboneElement implements Serializable 
{
  private static final long serialVersionUID = 4969295803301251723L;
  
  protected Reference<Resource> instance;
  protected AdverseEventSuspectEntityCausality[] causality;
  
  public AdverseEventSuspectEntity()
  {
  }

  public Reference<Resource> getInstance() {
    return instance;
  }

  public AdverseEventSuspectEntityCausality[] getCausality() {
    return causality;
  }

  public void setInstance(Reference<Resource> instance) {
    this.instance = instance;
  }

  public void setCausality(AdverseEventSuspectEntityCausality[] causality) {
    this.causality = causality;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof AdverseEventSuspectEntity) {
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
    return "AdverseEventSuspectEntity(" + id + "," + instance + ")";
  }
}
