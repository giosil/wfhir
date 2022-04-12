package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * A formal computable definition of an operation (on the RESTful interface) or a named query (using the search interaction).
 *
 * @see <a href="https://www.hl7.org/fhir">OperationDefinition_ReferencedFrom</a>
 */
public
class OperationDefinitionReferencedFrom extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected String sourceId;
  protected String source;
  
  public OperationDefinitionReferencedFrom()
  {
  }
  
  public String getSourceId() {
    return sourceId;
  }
  
  public void setSourceId(String sourceId) {
    this.sourceId = sourceId;
  }
  
  public String getSource() {
    return source;
  }
  
  public void setSource(String source) {
    this.source = source;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof OperationDefinitionReferencedFrom) {
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
    return "OperationDefinitionReferencedFrom(" + id + ")";
  }
}
