package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * The ProdCharacteristic structure.
 *
 * @see <a href="https://www.hl7.org/fhir/prodcharacteristic.html#ProdCharacteristic">ProdCharacteristic</a>
 */
public 
class ProdCharacteristic extends BackboneElement implements Serializable 
{
  private static final long serialVersionUID = -6967649881513503313L;
  
  protected Quantity height;
  protected Quantity width;
  protected Quantity depth;
  protected Quantity weight;
  protected Quantity nominalVolume;
  protected Quantity externalDiameter;
  protected String shape;
  protected String[] color;
  protected String[] imprint;
  protected Attachment[] image;
  protected CodeableConcept scoring;
  
  public ProdCharacteristic()
  {
  }

  public Quantity getHeight() {
    return height;
  }

  public Quantity getWidth() {
    return width;
  }

  public Quantity getDepth() {
    return depth;
  }

  public Quantity getWeight() {
    return weight;
  }

  public Quantity getNominalVolume() {
    return nominalVolume;
  }

  public Quantity getExternalDiameter() {
    return externalDiameter;
  }

  public String getShape() {
    return shape;
  }

  public String[] getColor() {
    return color;
  }

  public String[] getImprint() {
    return imprint;
  }

  public Attachment[] getImage() {
    return image;
  }

  public CodeableConcept getScoring() {
    return scoring;
  }

  public void setHeight(Quantity height) {
    this.height = height;
  }

  public void setWidth(Quantity width) {
    this.width = width;
  }

  public void setDepth(Quantity depth) {
    this.depth = depth;
  }

  public void setWeight(Quantity weight) {
    this.weight = weight;
  }

  public void setNominalVolume(Quantity nominalVolume) {
    this.nominalVolume = nominalVolume;
  }

  public void setExternalDiameter(Quantity externalDiameter) {
    this.externalDiameter = externalDiameter;
  }

  public void setShape(String shape) {
    this.shape = shape;
  }

  public void setColor(String[] color) {
    this.color = color;
  }

  public void setImprint(String[] imprint) {
    this.imprint = imprint;
  }

  public void setImage(Attachment[] image) {
    this.image = image;
  }

  public void setScoring(CodeableConcept scoring) {
    this.scoring = scoring;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof ProdCharacteristic) {
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
    return "ProdCharacteristic(" + id + ")";
  }
}
