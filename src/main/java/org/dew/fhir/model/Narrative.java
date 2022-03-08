package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * Any resource that is a DomainResource (all resources except Bundle, Parameters and Binary) may include a human-readable narrative that contains a summary of the resource and may be used to represent the content of the resource to a human.
 *
 * @see <a href="https://www.hl7.org/fhir/narrative.html#Narrative">Narrative</a>
*/
public 
class Narrative extends Element implements Serializable
{
  private static final long serialVersionUID = -5456890573094476316L;
  
  protected String status;
  protected String div;
  
  public Narrative()
  {
  }
  
  public Narrative(String status, String div)
  {
    this.status = status;
    this.div = div;
  }
  
  public String getStatus() {
    return status;
  }

  public String getDiv() {
    return div;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public void setDiv(String div) {
    this.div = div;
  }

  @Override
  public boolean equals(Object object) {
    if(object instanceof Narrative) {
      return this.hashCode() == object.hashCode();
    }
    return false;
  }
  
  @Override
  public int hashCode() {
    if(div == null) return 0;
    return div.hashCode();
  }
  
  @Override
  public String toString() {
    return "Narrative(" + id + "," + status + "," + div + ")";
  }
}
