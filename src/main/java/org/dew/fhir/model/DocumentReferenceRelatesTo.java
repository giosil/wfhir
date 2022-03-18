package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * Relationships that this document has with other document references that already exist.
 *
 * @see <a href="https://www.hl7.org/fhir/documentreference-definitions.html#DocumentReference.relatesTo">DocumentReference.relatesTo</a>
 */
public 
class DocumentReferenceRelatesTo extends BackboneElement implements Serializable 
{
  private static final long serialVersionUID = 1954420878655139890L;
  
  protected String code;
  protected Reference<DocumentReference> target;
  
  public DocumentReferenceRelatesTo()
  {
  }
  
  public DocumentReferenceRelatesTo(String code)
  {
    this.code = code;
  }
  
  public DocumentReferenceRelatesTo(String code, Reference<DocumentReference> target)
  {
    this.code = code;
    this.target = target;
  }

  public String getCode() {
    return code;
  }

  public Reference<DocumentReference> getTarget() {
    return target;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public void setTarget(Reference<DocumentReference> target) {
    this.target = target;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof DocumentReferenceRelatesTo) {
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
    return "DocumentReferenceRelatesTo(" + id + "," + code + "," + target + ")";
  }
}
