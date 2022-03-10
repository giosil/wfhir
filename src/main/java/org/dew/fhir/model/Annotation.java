package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 * 
 * A text note which also contains information about who made the statement and when.
 * 
 * @see <a href="https://www.hl7.org/fhir/datatypes.html#Annotation">Annotation</a>
 */
public 
class Annotation extends Element implements Serializable
{
  private static final long serialVersionUID = -3109439242234482088L;
  
  protected Reference<Resource> authorReference;
  protected String authorString;
  protected Date time;
  protected String text;
  
  public Annotation()
  {
  }

  public Reference<Resource> getAuthorReference() {
    return authorReference;
  }

  public String getAuthorString() {
    return authorString;
  }

  public Date getTime() {
    return time;
  }

  public String getText() {
    return text;
  }

  public void setAuthorReference(Reference<Resource> authorReference) {
    this.authorReference = authorReference;
  }

  public void setAuthorString(String authorString) {
    this.authorString = authorString;
  }

  public void setTime(Date time) {
    this.time = time;
  }

  public void setText(String text) {
    this.text = text;
  }

  @Override
  public boolean equals(Object object) {
    if(object instanceof Annotation) {
      return this.hashCode() == object.hashCode();
    }
    return false;
  }
  
  @Override
  public int hashCode() {
    if(text == null) return 0;
    return text.hashCode();
  }
  
  @Override
  public String toString() {
    return "Annotation(" + id + "," + authorReference + "," + authorString + "," + time + ")";
  }
}