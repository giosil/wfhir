package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * An external specification that the content is mapped to.
 *
 * @see <a href="https://www.hl7.org/fhir/structuredefinition-definitions.html#StructureDefinition.mapping">StructureDefinition.mapping</a>
 */
public 
class StructureDefinitionMapping extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 854207996827387815L;
  
  protected String identity;
  protected String uri;
  protected String name;
  protected String comment;
  
  public StructureDefinitionMapping()
  {
  }
  
  public String getIdentity() {
    return identity;
  }

  public String getUri() {
    return uri;
  }

  public String getName() {
    return name;
  }

  public String getComment() {
    return comment;
  }

  public void setIdentity(String identity) {
    this.identity = identity;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  @Override
  public boolean equals(Object object) {
    if(object instanceof StructureDefinitionMapping) {
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
    return "StructureDefinitionMapping(" + id + ")";
  }
}
