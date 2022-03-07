package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * The Expression structure defines an expression that generates a value. The expression is provided in a specifed language (by mime type).
 * The context of use of the expression must specify the context in which the expression is evaluated, and how the result of the expression is used.
 * 
 * @see <a href="https://www.hl7.org/fhir/metadatatypes.html#Expression">Expression</a>
 */
public 
class Expression extends Element implements Serializable
{
  private static final long serialVersionUID = 5056462602005576329L;
  
  protected String description;
  protected String name;
  protected String language;
  protected String expression;
  protected String reference;
  
  public Expression()
  {
  }
  
  public Expression(String expression)
  {
    this.expression = expression;
  }
  
  public Expression(String expression, String name)
  {
    this.expression = expression;
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public String getName() {
    return name;
  }

  public String getLanguage() {
    return language;
  }

  public String getExpression() {
    return expression;
  }

  public String getReference() {
    return reference;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public void setExpression(String expression) {
    this.expression = expression;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }

  @Override
  public boolean equals(Object object) {
    if(object instanceof Expression) {
      return this.hashCode() == object.hashCode();
    }
    return false;
  }
  
  @Override
  public int hashCode() {
    return (name + ":" + expression).hashCode();
  }
  
  @Override
  public String toString() {
    return "Expression(" + name + "," + expression + ")";
  }
}
