package org.dew.fhir.services;

import java.io.Serializable;

import org.dew.fhir.model.Bundle;
import org.dew.fhir.model.OperationOutcome;
import org.dew.fhir.model.Resource;

/**
 * 
 * FHIR Service Response.
 *
 */
public 
class FHIRResponse<T extends Resource> implements Serializable
{
  private static final long serialVersionUID = -2487169018671968981L;
  
  protected String id;
  protected String vid;
  protected OperationOutcome outcome;
  protected Bundle bundle;
  protected T resource;
  
  public FHIRResponse()
  {
  }

  public FHIRResponse(String id)
  {
    this.id = id;
  }

  public FHIRResponse(String id, String vid)
  {
    this.id = id;
    this.vid = vid;
  }

  public FHIRResponse(Bundle bundle)
  {
    this.bundle = bundle;
  }

  public FHIRResponse(T resource)
  {
    this.resource = resource;
  }

  public String getId() {
    return id;
  }

  public String getVid() {
    return vid;
  }

  public OperationOutcome getOutcome() {
    return outcome;
  }

  public Bundle getBundle() {
    return bundle;
  }

  public T getResource() {
    return resource;
  }

  public void setId(String id) {
    this.id = id;
  }

  public void setVid(String vid) {
    this.vid = vid;
  }

  public void setOutcome(OperationOutcome outcome) {
    this.outcome = outcome;
  }

  public void setBundle(Bundle bundle) {
    this.bundle = bundle;
  }

  public void setResource(T resource) {
    this.resource = resource;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof FHIRResponse) {
      return this.hashCode() == object.hashCode();
    }
    return false;
  }
  
  @Override
  public int hashCode() {
    return toString().hashCode();
  }
  
  @Override
  public String toString() {
    return "FHIRResponse(" + id + "," + vid + "," + outcome + "," + bundle + "," + resource + ")";
  }
}
