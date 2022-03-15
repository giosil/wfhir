package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * Identifies a concept from an external specification that roughly corresponds to this element.
 *
 * @see <a href="https://www.hl7.org/fhir/elementdefinition-definitions.html#ElementDefinition.mapping">ElementDefinition.mapping</a>
 */
public 
class ElementDefinitionMapping extends Element implements Serializable 
{
  private static final long serialVersionUID = -1696774482739831061L;
  
  protected String identity;
  protected String language;
  protected String map;
  protected String comment;
  
  public ElementDefinitionMapping()
  {
  }

  public String getIdentity() {
    return identity;
  }

  public String getLanguage() {
    return language;
  }

  public String getMap() {
    return map;
  }

  public String getComment() {
    return comment;
  }

  public void setIdentity(String identity) {
    this.identity = identity;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public void setMap(String map) {
    this.map = map;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof ElementDefinitionMapping) {
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
    return "ElementDefinitionMapping(" + id + ")";
  }
}
