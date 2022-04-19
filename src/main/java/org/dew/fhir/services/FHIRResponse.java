package org.dew.fhir.services;

import java.io.Serializable;
import java.util.Map;

import org.dew.fhir.model.Bundle;
import org.dew.fhir.model.Meta;
import org.dew.fhir.model.OperationOutcome;
import org.dew.fhir.model.Resource;
import org.dew.fhir.util.FHIRUtil;
import org.dew.fhir.util.FUtil;

/**
 * 
 * FHIR Service Response.
 *
 */
public 
class FHIRResponse implements Serializable
{
  private static final long serialVersionUID = -2487169018671968981L;
  
  protected String id;
  protected String vid;
  protected OperationOutcome outcome;
  protected Bundle bundle;
  protected Resource resource;
  
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
  
  public FHIRResponse(OperationOutcome outcome)
  {
    this.outcome = outcome;
  }

  public FHIRResponse(Resource resource)
  {
    this.resource = resource;
    if(resource != null) {
      String resourceId = resource.getId();
      if(resourceId != null && resourceId.length() > 0) {
        this.id = resourceId;
      }
      Meta meta = resource.getMeta();
      if(meta != null) {
        String versionId = meta.getVersionId();
        if(versionId != null && versionId.length() > 0) {
          this.vid = versionId;
        }
      }
    }
  }
  
  public FHIRResponse(Map<String, Object> map)
  {
    if(map == null) return;
    
    Resource resource = FHIRUtil.toResource(map);
    
    if(resource instanceof OperationOutcome) {
      outcome = (OperationOutcome) resource;
    }
    else if(resource instanceof Bundle) {
      bundle = (Bundle) resource;
    }
    else if(resource != null) {
      setResource(resource);
    }
    else {
      id  = FUtil.toString(map.get("id"), null);
      vid = FUtil.toString(map.get("vid"), null);
    }
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

  public Resource getResource() {
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

  public void setResource(Resource resource) {
    this.resource = resource;
    if(resource != null) {
      String resourceId = resource.getId();
      if(resourceId != null && resourceId.length() > 0) {
        this.id = resourceId;
      }
      Meta meta = resource.getMeta();
      if(meta != null) {
        String versionId = meta.getVersionId();
        if(versionId != null && versionId.length() > 0) {
          this.vid = versionId;
        }
      }
    }
  }
  
  // Utils
  
  public FHIRResponse id(String id) {
    this.id = id;
    return this;
  }
  
  public FHIRResponse vid(String vid) {
    this.vid = vid;
    return this;
  }
  
  public FHIRResponse outcome(OperationOutcome outcome) {
    this.outcome = outcome;
    return this;
  }
  
  public FHIRResponse bundle(Bundle bundle) {
    this.bundle = bundle;
    return this;
  }
  
  public FHIRResponse resource(Resource resource) {
    setResource(resource);
    return this;
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
