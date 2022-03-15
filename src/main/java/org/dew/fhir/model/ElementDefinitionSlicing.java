package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * Indicates that the element is sliced into a set of alternative definitions (i.e. in a structure definition, there are multiple different constraints on a single element in the base resource). Slicing can be used in any resource that has cardinality ..* on the base resource, or any resource with a choice of types. 
 * The set of slices is any elements that come after this in the element sequence that have the same path, until a shorter path occurs (the shorter path terminates the set).
 *
 * @see <a href="https://www.hl7.org/fhir/elementdefinition-definitions.html#ElementDefinition.slicing">ElementDefinition.slicing</a>
 */
public 
class ElementDefinitionSlicing extends Element implements Serializable
{
  private static final long serialVersionUID = 2493685883990167666L;
  
  protected ElementDefinitionSlicingDiscriminator[] discriminator;
  protected String description;
  protected Boolean ordered;
  protected String rules;
  
  public ElementDefinitionSlicing()
  {
  }

  public ElementDefinitionSlicingDiscriminator[] getDiscriminator() {
    return discriminator;
  }

  public String getDescription() {
    return description;
  }

  public Boolean getOrdered() {
    return ordered;
  }

  public String getRules() {
    return rules;
  }

  public void setDiscriminator(ElementDefinitionSlicingDiscriminator[] discriminator) {
    this.discriminator = discriminator;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public void setOrdered(Boolean ordered) {
    this.ordered = ordered;
  }

  public void setRules(String rules) {
    this.rules = rules;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof ElementDefinitionSlicing) {
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
    return "ElementDefinitionSlicing(" + id + ")";
  }
}
