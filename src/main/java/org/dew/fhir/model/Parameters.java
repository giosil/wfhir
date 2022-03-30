package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * This resource is a non-persisted resource used to pass information into and back from an operation. 
 * It has no other use, and there is no RESTful endpoint associated with it.
 *
 * @see <a href="https://www.hl7.org/fhir/parameters.html">Parameters</a>
 */
public 
class Parameters extends Resource implements Serializable
{
  private static final long serialVersionUID = -4060825061866792181L;

  protected ParametersParameter[] parameter;
  
  public Parameters()
  {
    this.resourceType = "Parameters";
  }

  public ParametersParameter[] getParameter() {
    return parameter;
  }

  public void setParameter(ParametersParameter[] parameter) {
    this.parameter = parameter;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof Parameters) {
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
    return "Parameters(" + id + ")";
  }
}
