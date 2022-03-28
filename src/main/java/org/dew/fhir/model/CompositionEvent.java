package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * The clinical service, such as a colonoscopy or an appendectomy, being documented.+
 * 
 * @see <a href="https://www.hl7.org/fhir/composition-definitions.html#Composition.event">Composition.event</a>
 */
public 
class CompositionEvent extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = -4479393552445890978L;
  
  protected CodeableConcept[] code;
  protected Period period;
  protected Reference<Resource>[] detail;
  
  public CompositionEvent()
  {
  }

  public CodeableConcept[] getCode() {
    return code;
  }

  public Period getPeriod() {
    return period;
  }

  public Reference<Resource>[] getDetail() {
    return detail;
  }

  public void setCode(CodeableConcept[] code) {
    this.code = code;
  }

  public void setPeriod(Period period) {
    this.period = period;
  }

  public void setDetail(Reference<Resource>[] detail) {
    this.detail = detail;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof CompositionEvent) {
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
    return "CompositionEvent(" + id + ")";
  }
}
