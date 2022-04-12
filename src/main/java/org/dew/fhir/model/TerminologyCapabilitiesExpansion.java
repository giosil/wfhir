package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * A TerminologyCapabilities resource documents a set of capabilities (behaviors) of a FHIR Terminology Server that may be used as a statement of actual server functionality or a statement of required or desired server implementation.
 *
 * @see <a href="https://www.hl7.org/fhir">TerminologyCapabilities_Expansion</a>
 */
public
class TerminologyCapabilitiesExpansion extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected String textFilter;
  protected Boolean incomplete;
  protected Boolean hierarchical;
  protected TerminologyCapabilitiesParameter[] parameter;
  protected Boolean paging;
  
  public TerminologyCapabilitiesExpansion()
  {
  }
  
  public String getTextFilter() {
    return textFilter;
  }
  
  public void setTextFilter(String textFilter) {
    this.textFilter = textFilter;
  }
  
  public Boolean getIncomplete() {
    return incomplete;
  }
  
  public void setIncomplete(Boolean incomplete) {
    this.incomplete = incomplete;
  }
  
  public Boolean getHierarchical() {
    return hierarchical;
  }
  
  public void setHierarchical(Boolean hierarchical) {
    this.hierarchical = hierarchical;
  }
  
  public TerminologyCapabilitiesParameter[] getParameter() {
    return parameter;
  }
  
  public void setParameter(TerminologyCapabilitiesParameter[] parameter) {
    this.parameter = parameter;
  }
  
  public Boolean getPaging() {
    return paging;
  }
  
  public void setPaging(Boolean paging) {
    this.paging = paging;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof TerminologyCapabilitiesExpansion) {
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
    return "TerminologyCapabilitiesExpansion(" + id + ")";
  }
}
