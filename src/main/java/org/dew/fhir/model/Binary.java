package org.dew.fhir.model;

import java.io.Serializable;

import org.dew.fhir.util.Base64Coder;

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
  private static final long serialVersionUID = -2513545209866775964L;
  
  protected String contentType;
  protected Reference<Resource> securityContext;
  protected String data;
  
  public Binary()
  {
    this.resourceType = "Binary";
  }
  
  public Binary(String contentType, String data)
  {
    this.resourceType = "Binary";
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
  
  public void encodeData(byte[] raw) {
    if(raw == null || raw.length == 0) {
      this.data = null;
    }
    else {
      this.data = new String(Base64Coder.encode(raw));
    }
  }
  
  public byte[] decodeData() {
    if(data == null || data.length() == 0) {
      return new byte[0];
    }
    byte[] result = null;
    try {
      result = Base64Coder.decode(data);
    }
    catch(Exception ex) {
      ex.printStackTrace();
    }
    if(result == null) result = new byte[0];
    return result;
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

