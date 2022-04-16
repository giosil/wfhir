package org.dew.fhir.mock;

import org.dew.fhir.model.Bundle;
import org.dew.fhir.model.OperationOutcome;
import org.dew.fhir.model.Organization;

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
    System.out.println("MockOrganizationService.read(" + request + ")...");
    
    Organization resource = buildMockResource();
    
    FHIRResponse fhirResponse = new FHIRResponse(resource);
    
    System.out.println("MockOrganizationService.read(" + request + ") -> " + fhirResponse);
    
    return fhirResponse;
  }

  @Override
  public 
  FHIRResponse vread(FHIRRequest request) 
      throws Exception 
  {
    System.out.println("MockOrganizationService.vread(" + request + ")...");
    
    Organization resource = buildMockResource();
    
    FHIRResponse fhirResponse = new FHIRResponse(resource);
    
    System.out.println("MockOrganizationService.vread(" + request + ") -> " + fhirResponse);
    
    return fhirResponse;
  }

  @Override
  public 
  FHIRResponse update(FHIRRequest request) 
      throws Exception 
  {
    System.out.println("MockOrganizationService.update(" + request + ")...");
    
    Organization resource = buildMockResource();
    
    FHIRResponse fhirResponse = new FHIRResponse(resource);
    fhirResponse.setVid("2");
    
    System.out.println("MockOrganizationService.update(" + request + ") -> " + fhirResponse);
    
    return fhirResponse;
  }

  @Override
  public 
  FHIRResponse patch(FHIRRequest request) 
      throws Exception 
  {
    System.out.println("MockOrganizationService.patch(" + request + ")...");
    
    Organization resource = buildMockResource();
    
    FHIRResponse fhirResponse = new FHIRResponse(resource);
    fhirResponse.setVid("3");
    
    System.out.println("MockOrganizationService.patch(" + request + ") -> " + fhirResponse);
    
    return fhirResponse;
  }

  @Override
  public 
  FHIRResponse delete(FHIRRequest request) 
    throws Exception 
  {
    System.out.println("MockOrganizationService.delete(" + request + ")...");
    
    OperationOutcome operationOutcome = new OperationOutcome("information", "informational", "Successfully deleted 1 resource(s) in 1ms");
    
    FHIRResponse fhirResponse = new FHIRResponse(operationOutcome);
    
    System.out.println("MockOrganizationService.delete(" + request + ") -> " + fhirResponse);
    
    return fhirResponse;
  }

  @Override
  public 
  FHIRResponse history(FHIRRequest request) 
    throws Exception 
  {
    System.out.println("MockOrganizationService.history(" + request + ")...");
    
    Organization resource = buildMockResource();
    
    FHIRResponse fhirResponse = new FHIRResponse(resource);
    fhirResponse.setVid(request.getVid());
    
    System.out.println("MockOrganizationService.history(" + request + ") -> " + fhirResponse);
    
    return fhirResponse;
  }

  @Override
  public 
  FHIRResponse create(FHIRRequest request) 
    throws Exception 
  {
    System.out.println("MockOrganizationService.create(" + request + ")...");
    
    Organization resource = buildMockResource();
    
    FHIRResponse fhirResponse = new FHIRResponse(resource);
    fhirResponse.setVid("1");
    
    System.out.println("MockOrganizationService.create(" + request + ") -> " + fhirResponse);
    
    return fhirResponse;
  }

  @Override
  public FHIRResponse search(FHIRRequest request) 
      throws Exception 
  {
    System.out.println("MockOrganizationService.search(" + request + ")...");
    
    String base = request.getBase();
    String type = request.getType();
    
    Organization resource = buildMockResource();
    
    Bundle bundle = new Bundle("searchset");
    bundle.addLink("self", base + "/" + type + "/" + resource.getId());
    
    FHIRResponse fhirResponse = new FHIRResponse(bundle);
    
    System.out.println("MockOrganizationService.search(" + request + ") -> " + fhirResponse);
    
    return fhirResponse;
  }
  
  protected
  Organization buildMockResource()
  {
    return new Organization("120201000", "http://hl7.it/sid/fls", "120201", "ASL ROMA 1");
  }
}
