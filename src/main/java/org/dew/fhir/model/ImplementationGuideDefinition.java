package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * A set of rules of how a particular interoperability or standards problem is solved - typically through the use of FHIR resources. This resource is used to gather all the parts of an implementation guide into a logical whole and to publish a computable definition of all the parts.
 *
 * @see <a href="https://www.hl7.org/fhir">ImplementationGuide_Definition</a>
 */
public
class ImplementationGuideDefinition extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected ImplementationGuideTemplate[] template;
  protected ImplementationGuideResource[] resource;
  protected ImplementationGuideParameter[] parameter;
  protected ImplementationGuidePage page;
  protected ImplementationGuideGrouping[] grouping;
  
  public ImplementationGuideDefinition()
  {
  }
  
  public ImplementationGuideTemplate[] getTemplate() {
    return template;
  }
  
  public void setTemplate(ImplementationGuideTemplate[] template) {
    this.template = template;
  }
  
  public ImplementationGuideResource[] getResource() {
    return resource;
  }
  
  public void setResource(ImplementationGuideResource[] resource) {
    this.resource = resource;
  }
  
  public ImplementationGuideParameter[] getParameter() {
    return parameter;
  }
  
  public void setParameter(ImplementationGuideParameter[] parameter) {
    this.parameter = parameter;
  }
  
  public ImplementationGuidePage getPage() {
    return page;
  }
  
  public void setPage(ImplementationGuidePage page) {
    this.page = page;
  }
  
  public ImplementationGuideGrouping[] getGrouping() {
    return grouping;
  }
  
  public void setGrouping(ImplementationGuideGrouping[] grouping) {
    this.grouping = grouping;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof ImplementationGuideDefinition) {
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
    return "ImplementationGuideDefinition(" + id + ")";
  }
}
