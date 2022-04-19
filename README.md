# WFHIR

A simple HL7&copy; FHIR&copy; implementation.

This library contains:

- java beans of FHIR resources;
- serialization and deserialization utilities;
- base servlet to implement own endpoint;
- client to invoke FHIR RESTful API.

This library DON'T contains:

- persistence engine of resources;
- user interfaces or viewers;
- tools for server/resources management.

## Serialization and Deserialization

```java
import org.dew.fhir.model.*;
import org.dew.fhir.util.FHIRUtil;

Organization res = new Organization("120201000", "http://hl7.it/sid/fls", "120201", "ASL ROMA 1");
  
String json = FHIRUtil.serialize(res, "application/fhir+json");
  
String xml  = FHIRUtil.serialize(res, "application/fhir+xml");
  
Organization o1 = FHIRUtil.deserialize(json, Organization.class);
  
Organization o2 = FHIRUtil.deserialize(xml, Organization.class);
```

## Client

```java
import org.dew.fhir.client.FHIRClient;
import org.dew.fhir.model.*;

FHIRClient client = new FHIRClient("http://localhost:8080/wfhir/fhir");
client.setBasicAuth("test", "test");

try {
  FHIRRequest req = new FHIRRequest();
  
  FHIRResponse res = client.read(req.type("organization").id("120201"));
  
  Resource resource = res.getResource();
  
  OperationOutcome outcome = res.getOutcome();
}
catch(Exception ex) {
  ex.printStackTrace();
}
```

```java
import org.dew.fhir.client.FHIRClient;
import org.dew.fhir.model.*;

FHIRClient client = new FHIRClient("http://localhost:8080/wfhir/fhir", "organization");
client.setBasicAuth("test", "test");

try {
  FHIRRequest req = new FHIRRequest();
  
  FHIRResponse res = client.read(req.id("120201"));
  
  Resource resource = res.getResource();
  
  OperationOutcome outcome = res.getOutcome();
}
catch(Exception ex) {
  ex.printStackTrace();
}
```

## Endpoint

```java
import java.security.Principal;

import javax.servlet.ServletException;

import org.dew.fhir.mock.MockOrganizationService;

public 
class TestServlet extends FHIRServlet
{
  private static final long serialVersionUID = 1L;
  
  @Override
  public 
  void init() 
    throws ServletException 
  {
    baseLocation     = null;
    checkSession     = false;
    checkSessionName = "user";
    basicAuth        = true;
    basicRealm       = "wfhir";
    
    services.addHandler("organization", new MockOrganizationService());
  }
  
  @Override
  protected
  Principal authenticate(String username, String password)
  {
    if(!username.equals(password)) return null;
    return new FHIRPrincipal(username);
  }
}
```

## Service

```java
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

```

## Build

- `git clone https://github.com/giosil/wfhir.git`
- `mvn clean install`

## Contributors

* [Giorgio Silvestris](https://github.com/giosil)
