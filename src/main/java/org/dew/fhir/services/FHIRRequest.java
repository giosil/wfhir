package org.dew.fhir.services;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.dew.fhir.model.Resource;
import org.dew.fhir.util.FUtil;

/**
 * 
 * FHIR Service Request.
 *
 */
public 
class FHIRRequest implements Serializable
{
  private static final long serialVersionUID = -1893986457430276781L;
  
  protected String id;
  protected String vid;
  protected Resource resource;
  protected String base;
  protected String format;
  protected boolean pretty;
  protected String summary;
  protected List<String> elements;
  // Extension
  protected String type;
  protected boolean history;
  protected String compartment;
  protected String include;
  protected String revinclude;
  protected Map<String, Object> parameters;
  
  public FHIRRequest()
  {
  }
  
  public FHIRRequest(String id)
  {
    this.id = id;
  }

  public FHIRRequest(String id, String vid)
  {
    this.id = id;
    this.vid = vid;
  }

  public FHIRRequest(Resource resource)
  {
    this.resource = resource;
  }

  public FHIRRequest(String format, boolean pretty)
  {
    this.format = format;
    this.pretty = pretty;
  }

  public FHIRRequest(String format, boolean pretty, String summary)
  {
    this.format = format;
    this.pretty = pretty;
    this.summary = summary;
  }

  public FHIRRequest(String format, boolean pretty, List<String> elements)
  {
    this.format = format;
    this.pretty = pretty;
    this.elements = elements;
  }
  
  public FHIRRequest(List<String> elements)
  {
    this.elements = elements;
  }
  
  public FHIRRequest(String format, List<String> elements)
  {
    this.format = format;
    this.elements = elements;
  }
  
  public String getId() {
    return id;
  }

  public String getVid() {
    return vid;
  }

  public Resource getResource() {
    return resource;
  }

  public String getBase() {
    return base;
  }

  public String getFormat() {
    return format;
  }

  public boolean isPretty() {
    return pretty;
  }

  public String getSummary() {
    return summary;
  }

  public List<String> getElements() {
    return elements;
  }

  public String getType() {
    return type;
  }

  public boolean isHistory() {
    return history;
  }

  public String getCompartment() {
    return compartment;
  }

  public String getInclude() {
    return include;
  }

  public String getRevinclude() {
    return revinclude;
  }

  public Map<String, Object> getParameters() {
    return parameters;
  }

  public void setId(String id) {
    this.id = id;
  }

  public void setVid(String vid) {
    this.vid = vid;
  }

  public void setResource(Resource resource) {
    this.resource = resource;
  }

  public void setBase(String base) {
    this.base = base;
  }

  public void setFormat(String format) {
    this.format = format;
  }

  public void setPretty(boolean pretty) {
    this.pretty = pretty;
  }

  public void setSummary(String summary) {
    this.summary = summary;
  }

  public void setElements(List<String> elements) {
    this.elements = elements;
  }

  public void setType(String type) {
    this.type = type;
  }

  public void setHistory(boolean history) {
    this.history = history;
  }

  public void setCompartment(String compartment) {
    this.compartment = compartment;
  }

  public void setInclude(String include) {
    this.include = include;
  }

  public void setRevinclude(String revinclude) {
    this.revinclude = revinclude;
  }

  public void setParameters(Map<String, Object> parameters) {
    this.parameters = parameters;
  }

  public void addParameter(String name, String value) {
    if(name == null || name.length() == 0) {
      return;
    }
    if(name.equals("id")) {
      this.id = value;
    }
    else if(name.equals("vid")) {
      this.vid = value;
    }
    else if(name.equals("_format") || name.equals("format")) {
      this.format = value;
    }
    else if(name.equals("_pretty") || name.equals("pretty")) {
      this.pretty = FUtil.toBoolean(value, false);
    }
    else if(name.equals("_summary") || name.equals("summary")) {
      this.summary = value;
    }
    else if(name.equals("_elements") || name.equals("elements")) {
      this.elements = FUtil.toListOfString(value);
    }
    else if(name.equals("_type") || name.equals("type")) {
      this.type = value;
    }
    else {
      if(this.parameters == null) {
        this.parameters = new HashMap<String, Object>();
      }
      this.parameters.put(name, value);
    }
  }
  
  public Object valueOf(String name) {
    if(name == null || name.length() == 0) {
      return null;
    }
    if(name.equals("id")) {
      return this.id;
    }
    else if(name.equals("vid")) {
      return this.vid;
    }
    else if(name.equals("_format") || name.equals("format")) {
      return this.format;
    }
    else if(name.equals("_pretty") || name.equals("pretty")) {
      return this.pretty;
    }
    else if(name.equals("_summary") || name.equals("summary")) {
      return this.summary;
    }
    else if(name.equals("_elements") || name.equals("elements")) {
      return this.elements;
    }
    else if(name.equals("_type") || name.equals("type")) {
      return this.type;
    }
    
    if(this.parameters != null) {
      return this.parameters.get(name);
    }
    return null;
  }
  
  public Object valueOf(String name, Object defaultValue) {
    Object result = valueOf(name);
    if(result == null) {
      return defaultValue;
    }
    return result;
  }

  @Override
  public boolean equals(Object object) {
    if(object instanceof FHIRRequest) {
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
    return "FHIRRequest(" + id + "," + vid + "," + resource + "," + base + "," + format + "," + pretty + "," + summary + "," + elements + "," + parameters + ")";
  }
}
