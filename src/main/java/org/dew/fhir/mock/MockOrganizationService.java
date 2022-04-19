package org.dew.fhir.mock;

import java.util.Map;

import org.dew.fhir.model.Bundle;
import org.dew.fhir.model.OperationOutcome;
import org.dew.fhir.model.Organization;
import org.dew.fhir.model.Resource;

import org.dew.fhir.services.FHIRRequest;
import org.dew.fhir.services.FHIRResponse;
import org.dew.fhir.services.IFHIRService;

public 
class MockOrganizationService implements IFHIRService
{
  @Override
  public 
  FHIRResponse read(FHIRRequest request) 
      throws Exception 
  {
    String id = request.getId();
    
    Organization resource = new Organization("120201", "http://hl7.it/sid/fls", "120201", "ASL ROMA 1");
    
    return new FHIRResponse(resource).id(id);
  }
  
  @Override
  public 
  FHIRResponse vread(FHIRRequest request) 
      throws Exception 
  {
    String id = request.getId();
    String vid = request.getVid();
    
    Organization resource = new Organization("120201", "http://hl7.it/sid/fls", "120201", "ASL ROMA 1");
    
    return new FHIRResponse(resource).id(id).vid(vid);
  }
  
  @Override
  public 
  FHIRResponse update(FHIRRequest request) 
      throws Exception 
  {
    Resource resource = request.getResource();
    
    return new FHIRResponse(resource).vid("2");
  }
  
  @Override
  public 
  FHIRResponse patch(FHIRRequest request) 
      throws Exception 
  {
    Resource resource = request.getResource();
    
    return new FHIRResponse(resource).vid("3");
  }
  
  @Override
  public 
  FHIRResponse delete(FHIRRequest request) 
    throws Exception 
  {
    String id = request.getId();
    
    OperationOutcome operationOutcome = new OperationOutcome("information", "informational", "Success");
    
    return new FHIRResponse(operationOutcome).vid(id);
  }
  
  @Override
  public 
  FHIRResponse history(FHIRRequest request) 
    throws Exception 
  {
    String id = request.getId();
    String vid = request.getVid();
    
    Organization resource = new Organization("120201", "http://hl7.it/sid/fls", "120201", "ASL ROMA 1");
    
    return new FHIRResponse(resource).id(id).vid(vid);
  }
  
  @Override
  public 
  FHIRResponse create(FHIRRequest request) 
    throws Exception 
  {
    Resource resource = request.getResource();
    
    return new FHIRResponse(resource).vid("1");
  }
  
  @Override
  public FHIRResponse search(FHIRRequest request) 
      throws Exception 
  {
    Map<String, Object> parameters = request.getParameters();
    System.out.println(parameters);
    
    Organization resource = new Organization("120201", "http://hl7.it/sid/fls", "120201", "ASL ROMA 1");
    
    Bundle bundle = new Bundle("searchset");
    bundle.addLink("self", request.getBase(), request.getType(), resource);
    
    return new FHIRResponse(bundle);
  }
}
