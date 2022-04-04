package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * A document definition.
 *
 * @see <a href="https://www.hl7.org/fhir/capabilitystatement-definitions.html#CapabilityStatement.document">CapabilityStatement.document</a>
 */
public 
class CapabilityStatementDocument extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = -8999650603514935444L;
  
  protected String mode;
  protected String documentation;
  protected String profile;
  
  public CapabilityStatementDocument()
  {
  }

  public String getMode() {
    return mode;
  }

  public String getDocumentation() {
    return documentation;
  }

  public String getProfile() {
    return profile;
  }

  public void setMode(String mode) {
    this.mode = mode;
  }

  public void setDocumentation(String documentation) {
    this.documentation = documentation;
  }

  public void setProfile(String profile) {
    this.profile = profile;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof CapabilityStatementDocument) {
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
    return "CapabilityStatementDocument(" + id + "," + mode + "," + profile + ")";
  }
}
