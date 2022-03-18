package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * A group of mappings that all have the same source and target system.
 *
 */
public 
class ConceptMapGroup extends BackboneElement implements Serializable 
{
  private static final long serialVersionUID = -3232955218147264109L;
  
  protected String source;
  protected String sourceVersion;
  protected String target;
  protected String targetVersion;
  protected ConceptMapGroupElement[] element;
  protected ConceptMapGroupUnmapped unmapped;
  
  public ConceptMapGroup()
  {
  }
  
  public String getSource() {
    return source;
  }

  public String getSourceVersion() {
    return sourceVersion;
  }

  public String getTarget() {
    return target;
  }

  public String getTargetVersion() {
    return targetVersion;
  }

  public ConceptMapGroupElement[] getElement() {
    return element;
  }

  public ConceptMapGroupUnmapped getUnmapped() {
    return unmapped;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public void setSourceVersion(String sourceVersion) {
    this.sourceVersion = sourceVersion;
  }

  public void setTarget(String target) {
    this.target = target;
  }

  public void setTargetVersion(String targetVersion) {
    this.targetVersion = targetVersion;
  }

  public void setElement(ConceptMapGroupElement[] element) {
    this.element = element;
  }

  public void setUnmapped(ConceptMapGroupUnmapped unmapped) {
    this.unmapped = unmapped;
  }

  @Override
  public boolean equals(Object object) {
    if(object instanceof ConceptMap) {
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
    return "ConceptMapGroup(" + id + "," + source + "," + sourceVersion + "," + target + "," + targetVersion + ")";
  }
}
