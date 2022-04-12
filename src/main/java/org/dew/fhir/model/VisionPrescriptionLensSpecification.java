package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * An authorization for the provision of glasses and/or contact lenses to a patient.
 *
 * @see <a href="https://www.hl7.org/fhir">VisionPrescription_LensSpecification</a>
 */
public
class VisionPrescriptionLensSpecification extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected Annotation[] note;
  protected Double backCurve;
  protected String color;
  protected Integer axis;
  protected Quantity duration;
  protected Double diameter;
  protected Double sphere;
  protected Double power;
  protected String brand;
  protected VisionPrescriptionPrism[] prism;
  protected Double add;
  protected CodeableConcept product;
  protected String eye;
  protected Double cylinder;
  
  public VisionPrescriptionLensSpecification()
  {
  }
  
  public Annotation[] getNote() {
    return note;
  }
  
  public void setNote(Annotation[] note) {
    this.note = note;
  }
  
  public Double getBackCurve() {
    return backCurve;
  }
  
  public void setBackCurve(Double backCurve) {
    this.backCurve = backCurve;
  }
  
  public String getColor() {
    return color;
  }
  
  public void setColor(String color) {
    this.color = color;
  }
  
  public Integer getAxis() {
    return axis;
  }
  
  public void setAxis(Integer axis) {
    this.axis = axis;
  }
  
  public Quantity getDuration() {
    return duration;
  }
  
  public void setDuration(Quantity duration) {
    this.duration = duration;
  }
  
  public Double getDiameter() {
    return diameter;
  }
  
  public void setDiameter(Double diameter) {
    this.diameter = diameter;
  }
  
  public Double getSphere() {
    return sphere;
  }
  
  public void setSphere(Double sphere) {
    this.sphere = sphere;
  }
  
  public Double getPower() {
    return power;
  }
  
  public void setPower(Double power) {
    this.power = power;
  }
  
  public String getBrand() {
    return brand;
  }
  
  public void setBrand(String brand) {
    this.brand = brand;
  }
  
  public VisionPrescriptionPrism[] getPrism() {
    return prism;
  }
  
  public void setPrism(VisionPrescriptionPrism[] prism) {
    this.prism = prism;
  }
  
  public Double getAdd() {
    return add;
  }
  
  public void setAdd(Double add) {
    this.add = add;
  }
  
  public CodeableConcept getProduct() {
    return product;
  }
  
  public void setProduct(CodeableConcept product) {
    this.product = product;
  }
  
  public String getEye() {
    return eye;
  }
  
  public void setEye(String eye) {
    this.eye = eye;
  }
  
  public Double getCylinder() {
    return cylinder;
  }
  
  public void setCylinder(Double cylinder) {
    this.cylinder = cylinder;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof VisionPrescriptionLensSpecification) {
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
    return "VisionPrescriptionLensSpecification(" + id + ")";
  }
}
