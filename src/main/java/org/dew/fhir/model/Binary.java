package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * A resource that represents the data of a single raw artifact as digital content accessible in its native format. 
 * A Binary resource can contain any content, whether text, image, pdf, zip archive, etc.
 * 
 * @see <a href="https://www.hl7.org/fhir/binary.html">Binary</a>
 */
public 
class Binary extends Resource implements Serializable
{
  private static final long serialVersionUID = -7612457658621138180L;
  
  protected String contentType;
  protected Reference<Resource> securityContext;
  protected String data;
  
  public Binary()
  {
  }
  
  public Binary(String contentType, String data)
  {
    this.contentType = contentType;
    this.data = data;
  }

  public String getContentType() {
    return contentType;
  }

  public Reference<Resource> getSecurityContext() {
    return securityContext;
  }

  public String getData() {
    return data;
  }

  public void setContentType(String contentType) {
    this.contentType = contentType;
  }

  public void setSecurityContext(Reference<Resource> securityContext) {
    this.securityContext = securityContext;
  }

  public void setData(String data) {
    this.data = data;
  }

  @Override
  public boolean equals(Object object) {
    if(object instanceof Binary) {
      return this.hashCode() == object.hashCode();
    }
    return false;
  }
  
  @Override
  public int hashCode() {
    if(data == null) return 0;
    return data.hashCode();
  }
  
  @Override
  public String toString() {
    if(data == null) {
      return "Binary(" + id + "," + contentType + ",null)";
    }
    return "Binary(" + id + "," + contentType + ",[" + data.length() + "])";
  }
}

