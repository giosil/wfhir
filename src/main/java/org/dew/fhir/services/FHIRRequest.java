package org.dew.fhir.services;

import java.io.Serializable;

import java.util.List;
import java.util.Map;

import org.dew.fhir.model.Resource;

/**
 * 
 * FHIR Service Request.
 *
 */
public 
class FHIRRequest<T extends Resource> implements Serializable
{
  private static final long serialVersionUID = -1893986457430276781L;
  
  protected String id;
  protected String vid;
  protected String code;
  protected T resource;
  protected String format;
  protected boolean pretty;
  protected boolean summary;
  protected List<String> elements;
  protected String compartment;
  protected String include;
  protected String revinclude;
  protected String not;
  protected String missing;
  protected String exact;
  protected String contains;
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

  public FHIRRequest(T resource)
  {
    this.resource = resource;
  }

  public FHIRRequest(String format, boolean pretty)
  {
    this.format = format;
    this.pretty = pretty;
  }

  public FHIRRequest(String format, boolean pretty, boolean summary)
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

  public String getCode() {
    return code;
  }

  public T getResource() {
    return resource;
  }

  public String getFormat() {
    return format;
  }

  public boolean isPretty() {
    return pretty;
  }

  public boolean isSummary() {
    return summary;
  }

  public List<String> getElements() {
    return elements;
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

  public String getNot() {
    return not;
  }

  public String getMissing() {
    return missing;
  }

  public String getExact() {
    return exact;
  }

  public String getContains() {
    return contains;
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

  public void setCode(String code) {
    this.code = code;
  }

  public void setResource(T resource) {
    this.resource = resource;
  }

  public void setFormat(String format) {
    this.format = format;
  }

  public void setPretty(boolean pretty) {
    this.pretty = pretty;
  }

  public void setSummary(boolean summary) {
    this.summary = summary;
  }

  public void setElements(List<String> elements) {
    this.elements = elements;
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

  public void setNot(String not) {
    this.not = not;
  }

  public void setMissing(String missing) {
    this.missing = missing;
  }

  public void setExact(String exact) {
    this.exact = exact;
  }

  public void setContains(String contains) {
    this.contains = contains;
  }

  public void setParameters(Map<String, Object> parameters) {
    this.parameters = parameters;
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
    return "FHIRRequest(" + id + "," + vid + "," + resource + "," + format + "," + pretty + "," + summary + "," + elements + "," + parameters + ")";
  }
}
