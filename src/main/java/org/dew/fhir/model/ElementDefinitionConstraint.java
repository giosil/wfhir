package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * Formal constraints such as co-occurrence and other constraints that can be computationally evaluated within the context of the instance.
 *
 * @see <a href="https://www.hl7.org/fhir/elementdefinition-definitions.html#ElementDefinition.constraint">ElementDefinition.constraint</a>
 */
public 
class ElementDefinitionConstraint extends Element implements Serializable 
{
  private static final long serialVersionUID = 7930393140704289051L;
  
  protected String key;
  protected String requirements;
  protected String severity;
  protected String human;
  protected String expression;
  protected String xpath;
  protected String source;
  
  public ElementDefinitionConstraint()
  {
  }

  public String getKey() {
    return key;
  }

  public String getRequirements() {
    return requirements;
  }

  public String getSeverity() {
    return severity;
  }

  public String getHuman() {
    return human;
  }

  public String getExpression() {
    return expression;
  }

  public String getXpath() {
    return xpath;
  }

  public String getSource() {
    return source;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public void setRequirements(String requirements) {
    this.requirements = requirements;
  }

  public void setSeverity(String severity) {
    this.severity = severity;
  }

  public void setHuman(String human) {
    this.human = human;
  }

  public void setExpression(String expression) {
    this.expression = expression;
  }

  public void setXpath(String xpath) {
    this.xpath = xpath;
  }

  public void setSource(String source) {
    this.source = source;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof ElementDefinitionConstraint) {
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
    return "ElementDefinitionConstraint(" + id + ")";
  }
}
