package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * Related identifiers or resources associated with the DocumentManifest.
 *
 * @see <a href="https://www.hl7.org/fhir/documentmanifest-definitions.html#DocumentManifest.related">DocumentManifest.related</a>
 */
public 
class DocumentManifestRelated extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = -5873322407814169046L;
  
  protected Identifier identifier;
  protected Reference<Resource> ref;
  
  public DocumentManifestRelated()
  {
  }

  public Identifier getIdentifier() {
    return identifier;
  }

  public Reference<Resource> getRef() {
    return ref;
  }

  public void setIdentifier(Identifier identifier) {
    this.identifier = identifier;
  }

  public void setRef(Reference<Resource> ref) {
    this.ref = ref;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof DocumentManifestRelated) {
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
    return "DocumentManifestRelated(" + id + "," + identifier + "," + ref + ")";
  }
}
