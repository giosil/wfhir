package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * A structured set of tests against a FHIR server or client implementation to determine compliance against the FHIR specification.
 *
 * @see <a href="https://www.hl7.org/fhir">TestScript_Assert</a>
 */
public
class TestScriptAssert extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected String sourceId;
  protected String headerField;
  protected String minimumId;
  protected String requestMethod;
  protected String description;
  protected String operator;
  protected String responseCode;
  protected String path;
  protected String requestURL;
  protected String validateProfileId;
  protected String contentType;
  protected String value;
  protected String direction;
  protected String compareToSourceId;
  protected String expression;
  protected String resource;
  protected String compareToSourcePath;
  protected String label;
  protected String compareToSourceExpression;
  protected Boolean navigationLinks;
  protected String response;
  protected Boolean warningOnly;
  
  public TestScriptAssert()
  {
  }
  
  public String getSourceId() {
    return sourceId;
  }
  
  public void setSourceId(String sourceId) {
    this.sourceId = sourceId;
  }
  
  public String getHeaderField() {
    return headerField;
  }
  
  public void setHeaderField(String headerField) {
    this.headerField = headerField;
  }
  
  public String getMinimumId() {
    return minimumId;
  }
  
  public void setMinimumId(String minimumId) {
    this.minimumId = minimumId;
  }
  
  public String getRequestMethod() {
    return requestMethod;
  }
  
  public void setRequestMethod(String requestMethod) {
    this.requestMethod = requestMethod;
  }
  
  public String getDescription() {
    return description;
  }
  
  public void setDescription(String description) {
    this.description = description;
  }
  
  public String getOperator() {
    return operator;
  }
  
  public void setOperator(String operator) {
    this.operator = operator;
  }
  
  public String getResponseCode() {
    return responseCode;
  }
  
  public void setResponseCode(String responseCode) {
    this.responseCode = responseCode;
  }
  
  public String getPath() {
    return path;
  }
  
  public void setPath(String path) {
    this.path = path;
  }
  
  public String getRequestURL() {
    return requestURL;
  }
  
  public void setRequestURL(String requestURL) {
    this.requestURL = requestURL;
  }
  
  public String getValidateProfileId() {
    return validateProfileId;
  }
  
  public void setValidateProfileId(String validateProfileId) {
    this.validateProfileId = validateProfileId;
  }
  
  public String getContentType() {
    return contentType;
  }
  
  public void setContentType(String contentType) {
    this.contentType = contentType;
  }
  
  public String getValue() {
    return value;
  }
  
  public void setValue(String value) {
    this.value = value;
  }
  
  public String getDirection() {
    return direction;
  }
  
  public void setDirection(String direction) {
    this.direction = direction;
  }
  
  public String getCompareToSourceId() {
    return compareToSourceId;
  }
  
  public void setCompareToSourceId(String compareToSourceId) {
    this.compareToSourceId = compareToSourceId;
  }
  
  public String getExpression() {
    return expression;
  }
  
  public void setExpression(String expression) {
    this.expression = expression;
  }
  
  public String getResource() {
    return resource;
  }
  
  public void setResource(String resource) {
    this.resource = resource;
  }
  
  public String getCompareToSourcePath() {
    return compareToSourcePath;
  }
  
  public void setCompareToSourcePath(String compareToSourcePath) {
    this.compareToSourcePath = compareToSourcePath;
  }
  
  public String getLabel() {
    return label;
  }
  
  public void setLabel(String label) {
    this.label = label;
  }
  
  public String getCompareToSourceExpression() {
    return compareToSourceExpression;
  }
  
  public void setCompareToSourceExpression(String compareToSourceExpression) {
    this.compareToSourceExpression = compareToSourceExpression;
  }
  
  public Boolean getNavigationLinks() {
    return navigationLinks;
  }
  
  public void setNavigationLinks(Boolean navigationLinks) {
    this.navigationLinks = navigationLinks;
  }
  
  public String getResponse() {
    return response;
  }
  
  public void setResponse(String response) {
    this.response = response;
  }
  
  public Boolean getWarningOnly() {
    return warningOnly;
  }
  
  public void setWarningOnly(Boolean warningOnly) {
    this.warningOnly = warningOnly;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof TestScriptAssert) {
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
    return "TestScriptAssert(" + id + ")";
  }
}
