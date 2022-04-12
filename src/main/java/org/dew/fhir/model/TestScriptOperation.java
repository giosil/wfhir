package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * A structured set of tests against a FHIR server or client implementation to determine compliance against the FHIR specification.
 *
 * @see <a href="https://www.hl7.org/fhir">TestScript_Operation</a>
 */
public
class TestScriptOperation extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected String sourceId;
  protected Boolean encodeRequestUrl;
  protected Integer origin;
  protected Integer destination;
  protected String description;
  protected Coding type;
  protected String requestId;
  protected String contentType;
  protected String method;
  protected String targetId;
  protected String resource;
  protected String label;
  protected String params;
  protected String url;
  protected String accept;
  protected TestScriptRequestHeader[] requestHeader;
  protected String responseId;
  
  public TestScriptOperation()
  {
  }
  
  public String getSourceId() {
    return sourceId;
  }
  
  public void setSourceId(String sourceId) {
    this.sourceId = sourceId;
  }
  
  public Boolean getEncodeRequestUrl() {
    return encodeRequestUrl;
  }
  
  public void setEncodeRequestUrl(Boolean encodeRequestUrl) {
    this.encodeRequestUrl = encodeRequestUrl;
  }
  
  public Integer getOrigin() {
    return origin;
  }
  
  public void setOrigin(Integer origin) {
    this.origin = origin;
  }
  
  public Integer getDestination() {
    return destination;
  }
  
  public void setDestination(Integer destination) {
    this.destination = destination;
  }
  
  public String getDescription() {
    return description;
  }
  
  public void setDescription(String description) {
    this.description = description;
  }
  
  public Coding getType() {
    return type;
  }
  
  public void setType(Coding type) {
    this.type = type;
  }
  
  public String getRequestId() {
    return requestId;
  }
  
  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }
  
  public String getContentType() {
    return contentType;
  }
  
  public void setContentType(String contentType) {
    this.contentType = contentType;
  }
  
  public String getMethod() {
    return method;
  }
  
  public void setMethod(String method) {
    this.method = method;
  }
  
  public String getTargetId() {
    return targetId;
  }
  
  public void setTargetId(String targetId) {
    this.targetId = targetId;
  }
  
  public String getResource() {
    return resource;
  }
  
  public void setResource(String resource) {
    this.resource = resource;
  }
  
  public String getLabel() {
    return label;
  }
  
  public void setLabel(String label) {
    this.label = label;
  }
  
  public String getParams() {
    return params;
  }
  
  public void setParams(String params) {
    this.params = params;
  }
  
  public String getUrl() {
    return url;
  }
  
  public void setUrl(String url) {
    this.url = url;
  }
  
  public String getAccept() {
    return accept;
  }
  
  public void setAccept(String accept) {
    this.accept = accept;
  }
  
  public TestScriptRequestHeader[] getRequestHeader() {
    return requestHeader;
  }
  
  public void setRequestHeader(TestScriptRequestHeader[] requestHeader) {
    this.requestHeader = requestHeader;
  }
  
  public String getResponseId() {
    return responseId;
  }
  
  public void setResponseId(String responseId) {
    this.responseId = responseId;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof TestScriptOperation) {
      return this.hashCode() == object.hashCode();
    }
    return false;
  }
  
  @Override
  public int hashCode() {
    if(id == null) return 0;
    return id.hashCode();
  }
  
  @Override
  public String toString() {
    return "TestScriptOperation(" + id + ")";
  }
}
