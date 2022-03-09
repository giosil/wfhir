package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * The RelatedArtifact structure defines resources related to a module such as previous and next versions of documents, documentation, citations, etc. 
 * Note that the name resource here is being used in a more general sense than the FHIR-specific Resource. 
 * The related resource may be a FHIR resource, or it may be another type of resource, represented using the Attachment data type.
 * 
 * @see <a href="https://www.hl7.org/fhir/metadatatypes.html#RelatedArtifact">RelatedArtifact</a>
 */
public 
class RelatedArtifact extends Element implements Serializable
{
  private static final long serialVersionUID = -6505609053099443993L;
  
  protected String type;
  protected String label;
  protected String display;
  protected String citation;
  protected String url;
  protected Attachment document;
  protected String resource;
  
  public RelatedArtifact()
  {
  }

  public String getType() {
    return type;
  }

  public String getLabel() {
    return label;
  }

  public String getDisplay() {
    return display;
  }

  public String getCitation() {
    return citation;
  }

  public String getUrl() {
    return url;
  }

  public Attachment getDocument() {
    return document;
  }

  public String getResource() {
    return resource;
  }

  public void setType(String type) {
    this.type = type;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public void setDisplay(String display) {
    this.display = display;
  }

  public void setCitation(String citation) {
    this.citation = citation;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public void setDocument(Attachment document) {
    this.document = document;
  }

  public void setResource(String resource) {
    this.resource = resource;
  }
  
  public byte[] decodeData() {
    if(document == null) {
      return new byte[0];
    }
    return document.decodeData();
  }

  @Override
  public boolean equals(Object object) {
    if(object instanceof RelatedArtifact) {
      return this.hashCode() == object.hashCode();
    }
    return false;
  }
  
  @Override
  public int hashCode() {
    return (type + ":" + label + ":" + url).hashCode();
  }
  
  @Override
  public String toString() {
    return "RelatedArtifact(" + type + "," + label + "," + display + "," + url + ")";
  }
}
