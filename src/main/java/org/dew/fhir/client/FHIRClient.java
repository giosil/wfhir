package org.dew.fhir.client;

import org.dew.fhir.model.Resource;

import org.dew.fhir.services.FHIRRequest;
import org.dew.fhir.services.FHIRResponse;
import org.dew.fhir.services.IFHIRService;

/**
 * 
 * FHIR Client.
 * 
 */
public 
class FHIRClient<T extends Resource> implements IFHIRService<T>
{
  protected String base;
  protected String type;
  protected WHttp whttp;
  
  public FHIRClient(String base, String type)
  {
    this.base = base;
    this.type = type;
    this.whttp = new WHttp(base);
  }

  public String getBase() {
    return base;
  }

  public String getType() {
    return type;
  }

  public void setBase(String base) {
    this.base = base;
  }

  public void setType(String type) {
    this.type = type;
  }

  @Override
  public FHIRResponse<T> read(FHIRRequest<T> request) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public FHIRResponse<T> vread(FHIRRequest<T> request) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public FHIRResponse<T> update(FHIRRequest<T> request) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public FHIRResponse<T> patch(FHIRRequest<T> request) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public FHIRResponse<T> delete(FHIRRequest<T> request) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public FHIRResponse<T> history(FHIRRequest<T> request) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public FHIRResponse<T> create(FHIRRequest<T> request) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public FHIRResponse<T> search(FHIRRequest<T> request) {
    // TODO Auto-generated method stub
    return null;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof FHIRClient) {
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
    return "FHIRClient(" + base + "," + type + ")";
  }
}
