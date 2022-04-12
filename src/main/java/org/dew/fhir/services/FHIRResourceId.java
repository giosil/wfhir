package org.dew.fhir.services;

import java.io.Serializable;

/**
 * 
 * The Logical Id and the Version Id of the resource.
 *
 */
public 
class FHIRResourceId implements Serializable 
{
  private static final long serialVersionUID = 6394700263767064369L;
  
  protected String id;
  protected String vid;
  protected String message;
  
  public FHIRResourceId()
  {
  }

  public FHIRResourceId(String id)
  {
    this.id = id;
  }

  public FHIRResourceId(String id, String vid)
  {
    this.id = id;
    this.vid = vid;
  }
  
  public String getId() {
    return id;
  }

  public String getVid() {
    return vid;
  }

  public String getMessage() {
    return message;
  }

  public void setId(String id) {
    this.id = id;
  }

  public void setVid(String vid) {
    this.vid = vid;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  @Override
  public boolean equals(Object object) {
    if(object instanceof FHIRResourceId) {
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
    return "FHIRResourceId(" + id + "," + vid + ")";
  }
}
