package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * Configurations of the external repository. The repository shall store target's observedSeq or records related with target's observedSeq.
 *
 * @see <a href="https://www.hl7.org/fhir/molecularsequence-definitions.html#MolecularSequence.repository">MolecularSequence.repository</a>
 */
public 
class MolecularSequenceRepository extends BackboneElement implements Serializable 
{
  private static final long serialVersionUID = -5833393474288497210L;
  
  protected String type;
  protected String url;
  protected String name;
  protected String datasetId;
  protected String variantsetId;
  protected String readsetId;
  
  public MolecularSequenceRepository()
  {
  }

  public String getType() {
    return type;
  }

  public String getUrl() {
    return url;
  }

  public String getName() {
    return name;
  }

  public String getDatasetId() {
    return datasetId;
  }

  public String getVariantsetId() {
    return variantsetId;
  }

  public String getReadsetId() {
    return readsetId;
  }

  public void setType(String type) {
    this.type = type;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setDatasetId(String datasetId) {
    this.datasetId = datasetId;
  }

  public void setVariantsetId(String variantsetId) {
    this.variantsetId = variantsetId;
  }

  public void setReadsetId(String readsetId) {
    this.readsetId = readsetId;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof MolecularSequenceRepository) {
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
    return "MolecularSequenceRepository(" + id + "," + type + "," + url + "," + name + ")";
  }
}
