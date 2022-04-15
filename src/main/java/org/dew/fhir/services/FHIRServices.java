package org.dew.fhir.services;

import java.util.HashMap;
import java.util.Map;

import org.dew.fhir.model.Resource;

/**
 * 
 * FHIR Services Container.
 *
 */
public 
class FHIRServices 
{
  protected String name;
  protected Map<String, IFHIRService<Resource>> handlers;
  
  public FHIRServices()
  {
    this.name = "default";
    this.handlers = new HashMap<String, IFHIRService<Resource>>();
  }
  
  public FHIRServices(String name)
  {
    this.name = name;
    if(this.name == null || this.name.length() == 0) {
      this.name = "default";
    }
    this.handlers = new HashMap<String, IFHIRService<Resource>>();
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public 
  void addHandler(String type, IFHIRService<Resource> service)
  {
    if(type == null || type.length() == 0) {
      return;
    }
    if(service == null) {
      return;
    }
    handlers.put(type, service);
  }
  
  public 
  IFHIRService<?> removeHandler(String type)
  {
    if(type == null || type.length() == 0) {
      return null;
    }
    return handlers.remove(type);
  }
  
  public 
  IFHIRService<Resource> getHandler(String type)
  {
    if(type == null || type.length() == 0) {
      return null;
    }
    return handlers.get(type);
  }
  
  public 
  void clear()
  {
    handlers.clear();
  }
  
  public 
  int size()
  {
    return handlers.size();
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof FHIRServices) {
      return this.hashCode() == object.hashCode();
    }
    return false;
  }
  
  @Override
  public int hashCode() {
    return handlers.hashCode();
  }
  
  @Override
  public String toString() {
    return "FHIRServices(" + name + "," + handlers.keySet() + ")";
  }
}
