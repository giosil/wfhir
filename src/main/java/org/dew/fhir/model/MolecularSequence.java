package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * STU3 moves beyond FHIR DSTU2 Standard Genetics profile on Observation allowing increased granularity and less ambiguity by creating a new resource to be called MolecularSequence. 
 * This resource will be used to hold clinically relevant sequence data in a manner that is both efficient and versatile integrating new and as yet undefined types of genomic and other -omics data that will soon be commonly entered into health records for clinical use. 
 * MolecularSequence will be leveraged by other FHIR resources, including Observation. 
 * This is consistent with how all FHIR resources are designed and used.
 *
 * @see <a href="https://www.hl7.org/fhir/genomics.html">MolecularSequence</a>
 */
public 
class MolecularSequence extends DomainResource implements Serializable 
{
  private static final long serialVersionUID = 5679950373230040941L;
  
  protected Identifier[] identifier;
  protected String type;
  protected Integer coordinateSystem;
  protected Reference<Patient> patient;
  protected Reference<Specimen> specimen;
  protected Reference<Device> device;
  protected Reference<Organization> performer;
  protected Quantity quantity;
  protected MolecularSequenceReferenceSeq referenceSeq;
  protected MolecularSequenceVariant[] variant;
  protected String observedSeq;
  protected MolecularSequenceQuality[] quality;
  protected Integer readCoverage;
  protected MolecularSequenceRepository[] repository;
  protected Reference<MolecularSequence>[] pointer;
  protected MolecularSequenceStructureVariant[] structureVariant;
  
  public MolecularSequence()
  {
    this.resourceType = "MolecularSequence";
  }

  public Identifier[] getIdentifier() {
    return identifier;
  }

  public String getType() {
    return type;
  }

  public Integer getCoordinateSystem() {
    return coordinateSystem;
  }

  public Reference<Patient> getPatient() {
    return patient;
  }

  public Reference<Specimen> getSpecimen() {
    return specimen;
  }

  public Reference<Device> getDevice() {
    return device;
  }

  public Reference<Organization> getPerformer() {
    return performer;
  }

  public Quantity getQuantity() {
    return quantity;
  }

  public MolecularSequenceReferenceSeq getReferenceSeq() {
    return referenceSeq;
  }

  public MolecularSequenceVariant[] getVariant() {
    return variant;
  }

  public String getObservedSeq() {
    return observedSeq;
  }

  public MolecularSequenceQuality[] getQuality() {
    return quality;
  }

  public Integer getReadCoverage() {
    return readCoverage;
  }

  public MolecularSequenceRepository[] getRepository() {
    return repository;
  }

  public Reference<MolecularSequence>[] getPointer() {
    return pointer;
  }

  public MolecularSequenceStructureVariant[] getStructureVariant() {
    return structureVariant;
  }

  public void setIdentifier(Identifier[] identifier) {
    this.identifier = identifier;
  }

  public void setType(String type) {
    this.type = type;
  }

  public void setCoordinateSystem(Integer coordinateSystem) {
    this.coordinateSystem = coordinateSystem;
  }

  public void setPatient(Reference<Patient> patient) {
    this.patient = patient;
  }

  public void setSpecimen(Reference<Specimen> specimen) {
    this.specimen = specimen;
  }

  public void setDevice(Reference<Device> device) {
    this.device = device;
  }

  public void setPerformer(Reference<Organization> performer) {
    this.performer = performer;
  }

  public void setQuantity(Quantity quantity) {
    this.quantity = quantity;
  }

  public void setReferenceSeq(MolecularSequenceReferenceSeq referenceSeq) {
    this.referenceSeq = referenceSeq;
  }

  public void setVariant(MolecularSequenceVariant[] variant) {
    this.variant = variant;
  }

  public void setObservedSeq(String observedSeq) {
    this.observedSeq = observedSeq;
  }

  public void setQuality(MolecularSequenceQuality[] quality) {
    this.quality = quality;
  }

  public void setReadCoverage(Integer readCoverage) {
    this.readCoverage = readCoverage;
  }

  public void setRepository(MolecularSequenceRepository[] repository) {
    this.repository = repository;
  }

  public void setPointer(Reference<MolecularSequence>[] pointer) {
    this.pointer = pointer;
  }

  public void setStructureVariant(MolecularSequenceStructureVariant[] structureVariant) {
    this.structureVariant = structureVariant;
  }

  @Override
  public boolean equals(Object object) {
    if(object instanceof MolecularSequence) {
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
    return "MolecularSequence(" + id + "," + type + "," + coordinateSystem + "," + patient + ")";
  }
}
