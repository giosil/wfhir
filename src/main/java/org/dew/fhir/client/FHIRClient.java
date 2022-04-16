package org.dew.fhir.client;

import org.dew.fhir.services.FHIRRequest;
import org.dew.fhir.services.FHIRResponse;
import org.dew.fhir.services.IFHIRService;

/**
 * 
 * FHIR Client.
 * 
 */
public 
class FHIRClient implements IFHIRService
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
  public FHIRResponse read(FHIRRequest request) throws Exception {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public FHIRResponse vread(FHIRRequest request) throws Exception {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public FHIRResponse update(FHIRRequest request) throws Exception {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public FHIRResponse patch(FHIRRequest request) throws Exception {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public FHIRResponse delete(FHIRRequest request) throws Exception {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public FHIRResponse history(FHIRRequest request) throws Exception {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public FHIRResponse create(FHIRRequest request) throws Exception {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public FHIRResponse search(FHIRRequest request) throws Exception {
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
