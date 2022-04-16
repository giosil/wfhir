package org.dew.fhir.client;

import java.util.HashMap;
import java.util.Map;

import org.dew.fhir.model.Resource;
import org.dew.fhir.services.FHIRRequest;
import org.dew.fhir.services.FHIRResponse;
import org.dew.fhir.services.IFHIRService;
import org.dew.fhir.util.FHIRUtil;

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
  protected String accept = "application/fhir+json";
  protected WHttp whttp;
  
  public FHIRClient(String base)
  {
    this.base = base;
    
    whttp = new WHttp(base);
    whttp.setHeaders(getHeaders());
  }
  
  public FHIRClient(String base, String type)
  {
    this.base = base;
    this.type = type;
    
    whttp = new WHttp(base);
    whttp.setHeaders(getHeaders());
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
  public 
  FHIRResponse read(FHIRRequest request) 
    throws Exception 
  {
    if(request == null) {
      throw new Exception("FHIRRequest is null");
    }
    String id = request.getId();
    if(id == null || id.length() == 0) {
      throw new Exception("Invalid id");
    }
    String requestType = type;
    if(requestType == null || requestType.length() == 0) {
      requestType = request.getType();
    }
    if(requestType == null || requestType.length() == 0) {
      throw new Exception("Invalid type");
    }
    
    String response = whttp.get(requestType + "/" + id);
    
    Map<String, Object> mapResponse = FHIRUtil.deserialize(response);
    
    return new FHIRResponse(mapResponse);
  }

  @Override
  public 
  FHIRResponse vread(FHIRRequest request) 
    throws Exception 
  {
    if(request == null) {
      throw new Exception("FHIRRequest is null");
    }
    String id = request.getId();
    if(id == null || id.length() == 0) {
      throw new Exception("Invalid id");
    }
    String vid = request.getVid();
    if(vid == null || vid.length() == 0) {
      throw new Exception("Invalid version id");
    }
    String requestType = type;
    if(requestType == null || requestType.length() == 0) {
      requestType = request.getType();
    }
    if(requestType == null || requestType.length() == 0) {
      throw new Exception("Invalid type");
    }
    
    String response = whttp.get(requestType + "/" + id + "/_history/" + vid);
    
    Map<String, Object> mapResponse = FHIRUtil.deserialize(response);
    
    return new FHIRResponse(mapResponse);
  }

  @Override
  public 
  FHIRResponse update(FHIRRequest request) 
    throws Exception 
  {
    if(request == null) {
      throw new Exception("FHIRRequest is null");
    }
    Resource resource = request.getResource();
    if(resource == null) {
      throw new Exception("FHIRRequest.resource is null");
    }
    String requestType = type;
    if(requestType == null || requestType.length() == 0) {
      requestType = request.getType();
    }
    if(requestType == null || requestType.length() == 0) {
      throw new Exception("Invalid type");
    }
    
    String requestData = FHIRUtil.serialize(resource, accept);
    
    String response = whttp.put(requestType, requestData);
    
    Map<String, Object> mapResponse = FHIRUtil.deserialize(response);
    
    return new FHIRResponse(mapResponse);
  }

  @Override
  public 
  FHIRResponse patch(FHIRRequest request) 
    throws Exception 
  {
    if(request == null) {
      throw new Exception("FHIRRequest is null");
    }
    Resource resource = request.getResource();
    if(resource == null) {
      throw new Exception("FHIRRequest.resource is null");
    }
    String requestType = type;
    if(requestType == null || requestType.length() == 0) {
      requestType = request.getType();
    }
    if(requestType == null || requestType.length() == 0) {
      throw new Exception("Invalid type");
    }
    
    String requestData = FHIRUtil.serialize(resource, accept);
    
    String response = whttp.patch(requestType, requestData);
    
    Map<String, Object> mapResponse = FHIRUtil.deserialize(response);
    
    return new FHIRResponse(mapResponse);
  }

  @Override
  public 
  FHIRResponse delete(FHIRRequest request) 
    throws Exception 
  {
    if(request == null) {
      throw new Exception("FHIRRequest is null");
    }
    String id = request.getId();
    if(id == null || id.length() == 0) {
      throw new Exception("Invalid id");
    }
    String requestType = type;
    if(requestType == null || requestType.length() == 0) {
      requestType = request.getType();
    }
    if(requestType == null || requestType.length() == 0) {
      throw new Exception("Invalid type");
    }
    
    String response = whttp.delete(requestType + "/" + id);
    
    Map<String, Object> mapResponse = FHIRUtil.deserialize(response);
    
    return new FHIRResponse(mapResponse);
  }

  @Override
  public 
  FHIRResponse history(FHIRRequest request) 
    throws Exception 
  {
    if(request == null) {
      throw new Exception("FHIRRequest is null");
    }
    String id = request.getId();
    if(id == null || id.length() == 0) {
      throw new Exception("Invalid id");
    }
    String vid = request.getVid();
    if(vid == null || vid.length() == 0) {
      throw new Exception("Invalid version id");
    }
    String requestType = type;
    if(requestType == null || requestType.length() == 0) {
      requestType = request.getType();
    }
    if(requestType == null || requestType.length() == 0) {
      throw new Exception("Invalid type");
    }
    
    String response = whttp.get(requestType + "/" + id + "/_history/" + vid);
    
    Map<String, Object> mapResponse = FHIRUtil.deserialize(response);
    
    return new FHIRResponse(mapResponse);
  }

  @Override
  public 
  FHIRResponse create(FHIRRequest request) 
    throws Exception 
  {
    if(request == null) {
      throw new Exception("FHIRRequest is null");
    }
    Resource resource = request.getResource();
    if(resource == null) {
      throw new Exception("FHIRRequest.resource is null");
    }
    String requestType = type;
    if(requestType == null || requestType.length() == 0) {
      requestType = request.getType();
    }
    if(requestType == null || requestType.length() == 0) {
      throw new Exception("Invalid type");
    }
    
    String requestData = FHIRUtil.serialize(resource, accept);
    
    String response = whttp.post(requestType, requestData);
    
    Map<String, Object> mapResponse = FHIRUtil.deserialize(response);
    
    return new FHIRResponse(mapResponse);
  }

  @Override
  public 
  FHIRResponse search(FHIRRequest request) 
    throws Exception 
  {
    if(request == null) {
      throw new Exception("FHIRRequest is null");
    }
    String id = request.getId();
    if(id == null) id = "";
    Resource resource = request.getResource();
    if(resource == null) {
      throw new Exception("FHIRRequest.resource is null");
    }
    String requestType = type;
    if(requestType == null || requestType.length() == 0) {
      requestType = request.getType();
    }
    if(requestType == null || requestType.length() == 0) {
      throw new Exception("Invalid type");
    }
    
    String response = whttp.get(requestType + "/" + id);
    
    Map<String, Object> mapResponse = FHIRUtil.deserialize(response);
    
    return new FHIRResponse(mapResponse);
  }

  protected
  Map<String, Object> getHeaders()
  {
    Map<String, Object> mapResult = new HashMap<String, Object>();
    if(accept != null && accept.length() > 0) {
      mapResult.put("Accept", accept);
    }
    return mapResult;
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
