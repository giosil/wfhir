package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 * 
 * This type is for containing or referencing attachments - additional data content defined in other formats. 
 * The most common use of this type is to include images or reports in some report format such as PDF. 
 * However, it can be used for any data that has a MIME type.
 * 
 * @see <a href="https://www.hl7.org/fhir/datatypes.html#Attachment">Attachment</a>
 */
public 
class Attachment extends Element implements Serializable
{
  private static final long serialVersionUID = 1562374203315393303L;
  
  protected String contentType;
  protected String language;
  protected String data;
  protected String url;
  protected Integer size;
  protected String hash;
  protected String title;
  protected Date creation;
  
  public Attachment()
  {
  }

  public String getContentType() {
    return contentType;
  }

  public String getLanguage() {
    return language;
  }

  public String getData() {
    return data;
  }

  public String getUrl() {
    return url;
  }

  public Integer getSize() {
    return size;
  }

  public String getHash() {
    return hash;
  }

  public String getTitle() {
    return title;
  }

  public Date getCreation() {
    return creation;
  }

  public void setContentType(String contentType) {
    this.contentType = contentType;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public void setData(String data) {
    this.data = data;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public void setSize(Integer size) {
    this.size = size;
  }

  public void setHash(String hash) {
    this.hash = hash;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public void setCreation(Date creation) {
    this.creation = creation;
  }

  @Override
  public boolean equals(Object object) {
    if(object instanceof Attachment) {
      return this.hashCode() == object.hashCode();
    }
    return false;
  }
  
  @Override
  public int hashCode() {
    return (url + ":" + hash).hashCode();
  }
  
  @Override
  public String toString() {
    return "Attachment(" + contentType + "," + url + "," + title + ")";
  }
}
