package org.dew.fhir.services;

import java.io.Serializable;

import java.util.List;
import java.util.Map;

/**
 * 
 * FHIR API parameters.
 *
 */
public 
class FHIRParameters implements Serializable
{
  private static final long serialVersionUID = -1893986457430276781L;
  
  protected String format;
  protected boolean pretty;
  protected boolean summary;
  protected List<String> elements;
  protected String compartment;
  protected Map<String, Object> parameters;
  
  public FHIRParameters()
  {
  }

  public FHIRParameters(String format)
  {
    this.format = format;
  }

  public FHIRParameters(String format, boolean pretty)
  {
    this.format = format;
    this.pretty = pretty;
  }

  public FHIRParameters(String format, boolean pretty, boolean summary)
  {
    this.format = format;
    this.pretty = pretty;
    this.summary = summary;
  }

  public FHIRParameters(String format, boolean pretty, List<String> elements)
  {
    this.format = format;
    this.pretty = pretty;
    this.elements = elements;
  }
  
  public FHIRParameters(List<String> elements)
  {
    this.elements = elements;
  }
  
  public FHIRParameters(String format, List<String> elements)
  {
    this.format = format;
    this.elements = elements;
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

  public Map<String, Object> getParameters() {
    return parameters;
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

  public void setParameters(Map<String, Object> parameters) {
    this.parameters = parameters;
  }

  @Override
  public boolean equals(Object object) {
    if(object instanceof FHIRParameters) {
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
    return "FHIRAPIParameters(" + format + "," + pretty + "," + summary + "," + elements + "," + parameters + ")";
  }
}
