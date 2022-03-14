package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * Key images associated with a report. 
 * The images are generally created during the diagnostic process, and may be directly of the patient, or of treated specimens (i.e. slides of interest).
 *
 * @see <a href="https://www.hl7.org/fhir/diagnosticreport-definitions.html#DiagnosticReport.media">DiagnosticReport.media</a>
 */
public 
class DiagnosticReportMedia extends BackboneElement implements Serializable 
{
  private static final long serialVersionUID = -3617213368522221999L;
  
  protected String comment;
  protected Reference<Media> link;
  
  public DiagnosticReportMedia()
  {
  }

  public DiagnosticReportMedia(Reference<Media> link)
  {
    this.link = link;
  }

  public DiagnosticReportMedia(String comment, Reference<Media> link)
  {
    this.comment = comment;
    this.link = link;
  }

  public String getComment() {
    return comment;
  }

  public Reference<Media> getLink() {
    return link;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public void setLink(Reference<Media> link) {
    this.link = link;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof DiagnosticReportMedia) {
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
    return "DiagnosticReportMedia(" + id + ")";
  }
}
