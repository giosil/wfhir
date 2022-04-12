package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * A Map of relationships between 2 structures that can be used to transform data.
 *
 * @see <a href="https://www.hl7.org/fhir">StructureMap_Target</a>
 */
public
class StructureMapTarget extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected String listRuleId;
  protected String[] listMode;
  protected String transform;
  protected String contextType;
  protected StructureMapParameter[] parameter;
  protected String context;
  protected String variable;
  protected String element;
  
  public StructureMapTarget()
  {
  }
  
  public String getListRuleId() {
    return listRuleId;
  }
  
  public void setListRuleId(String listRuleId) {
    this.listRuleId = listRuleId;
  }
  
  public String[] getListMode() {
    return listMode;
  }
  
  public void setListMode(String[] listMode) {
    this.listMode = listMode;
  }
  
  public String getTransform() {
    return transform;
  }
  
  public void setTransform(String transform) {
    this.transform = transform;
  }
  
  public String getContextType() {
    return contextType;
  }
  
  public void setContextType(String contextType) {
    this.contextType = contextType;
  }
  
  public StructureMapParameter[] getParameter() {
    return parameter;
  }
  
  public void setParameter(StructureMapParameter[] parameter) {
    this.parameter = parameter;
  }
  
  public String getContext() {
    return context;
  }
  
  public void setContext(String context) {
    this.context = context;
  }
  
  public String getVariable() {
    return variable;
  }
  
  public void setVariable(String variable) {
    this.variable = variable;
  }
  
  public String getElement() {
    return element;
  }
  
  public void setElement(String element) {
    this.element = element;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof StructureMapTarget) {
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
    return "StructureMapTarget(" + id + ")";
  }
}
