package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 * 
 * A set of healthcare-related information that is assembled together into a single logical package that provides a single coherent statement of meaning, establishes its own context and that has clinical attestation with regard to who is making the statement. 
 * A Composition defines the structure and narrative content necessary for a document. However, a Composition alone does not constitute a document. 
 * Rather, the Composition must be the first entry in a Bundle where Bundle.type=document, and any other resources referenced from Composition must be included as subsequent entries in the Bundle (for example Patient, Practitioner, Encounter, etc.).
 *
 * @see <a href="https://www.hl7.org/fhir/composition.html">Composition</a>
 */
public 
class Composition extends DomainResource implements Serializable 
{
  private static final long serialVersionUID = 82290817587288039L;
  
  protected Identifier identifier;
  protected String status;
  protected CodeableConcept type;
  protected CodeableConcept[] category;
  protected Reference<Resource> subject;
  protected Reference<Encounter> encounter;
  protected Date date;
  protected Reference<Resource>[] author;
  protected String title;
  protected String confidentiality;
  protected CompositionAttester[] attester;
  protected Reference<Organization> custodian;
  protected CompositionRelatesTo[] relatesTo;
  protected CompositionEvent[] event;
  protected CompositionSection[] section;
  
  public Composition()
  {
    this.resourceType = "Composition";
  }
  
  public Composition(Identifier identifier)
  {
    this.identifier = identifier;
  }
  
  public Composition(Identifier identifier, CodeableConcept type)
  {
    this.identifier = identifier;
    this.type = type;
  }

  public Identifier getIdentifier() {
    return identifier;
  }

  public String getStatus() {
    return status;
  }

  public CodeableConcept getType() {
    return type;
  }

  public CodeableConcept[] getCategory() {
    return category;
  }

  public Reference<Resource> getSubject() {
    return subject;
  }

  public Reference<Encounter> getEncounter() {
    return encounter;
  }

  public Date getDate() {
    return date;
  }

  public Reference<Resource>[] getAuthor() {
    return author;
  }

  public String getTitle() {
    return title;
  }

  public String getConfidentiality() {
    return confidentiality;
  }

  public CompositionAttester[] getAttester() {
    return attester;
  }

  public Reference<Organization> getCustodian() {
    return custodian;
  }

  public CompositionRelatesTo[] getRelatesTo() {
    return relatesTo;
  }

  public CompositionEvent[] getEvent() {
    return event;
  }

  public CompositionSection[] getSection() {
    return section;
  }

  public void setIdentifier(Identifier identifier) {
    this.identifier = identifier;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public void setType(CodeableConcept type) {
    this.type = type;
  }

  public void setCategory(CodeableConcept[] category) {
    this.category = category;
  }

  public void setSubject(Reference<Resource> subject) {
    this.subject = subject;
  }

  public void setEncounter(Reference<Encounter> encounter) {
    this.encounter = encounter;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public void setAuthor(Reference<Resource>[] author) {
    this.author = author;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public void setConfidentiality(String confidentiality) {
    this.confidentiality = confidentiality;
  }

  public void setAttester(CompositionAttester[] attester) {
    this.attester = attester;
  }

  public void setCustodian(Reference<Organization> custodian) {
    this.custodian = custodian;
  }

  public void setRelatesTo(CompositionRelatesTo[] relatesTo) {
    this.relatesTo = relatesTo;
  }

  public void setEvent(CompositionEvent[] event) {
    this.event = event;
  }

  public void setSection(CompositionSection[] section) {
    this.section = section;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof Composition) {
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
    return "Composition(" + id + "," + identifier + "," + status + "," + type + ")";
  }
}
