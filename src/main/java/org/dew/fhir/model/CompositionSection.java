package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * The root of the sections that make up the composition.
 *
 * @see <a href="https://www.hl7.org/fhir/composition-definitions.html#Composition.section">Composition.section</a>
 */
public 
class CompositionSection extends BackboneElement implements Serializable 
{
  private static final long serialVersionUID = 1225469072578075082L;
  
  protected String title;
  protected CodeableConcept code;
  protected Reference<Resource>[] author;
  protected Reference<Resource> focus;
  protected Narrative text;
  protected String mode;
  protected CodeableConcept orderedBy;
  protected Reference<Resource>[] entry;
  protected CodeableConcept emptyReason;
  protected CompositionSection[] section;
  
  public CompositionSection()
  {
  }
  
  public CompositionSection(CodeableConcept code)
  {
    this.code = code;
  }
  
  public String getTitle() {
    return title;
  }

  public CodeableConcept getCode() {
    return code;
  }

  public Reference<Resource>[] getAuthor() {
    return author;
  }

  public Reference<Resource> getFocus() {
    return focus;
  }

  public Narrative getText() {
    return text;
  }

  public String getMode() {
    return mode;
  }

  public CodeableConcept getOrderedBy() {
    return orderedBy;
  }

  public Reference<Resource>[] getEntry() {
    return entry;
  }

  public CodeableConcept getEmptyReason() {
    return emptyReason;
  }

  public CompositionSection[] getSection() {
    return section;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public void setCode(CodeableConcept code) {
    this.code = code;
  }

  public void setAuthor(Reference<Resource>[] author) {
    this.author = author;
  }

  public void setFocus(Reference<Resource> focus) {
    this.focus = focus;
  }

  public void setText(Narrative text) {
    this.text = text;
  }

  public void setMode(String mode) {
    this.mode = mode;
  }

  public void setOrderedBy(CodeableConcept orderedBy) {
    this.orderedBy = orderedBy;
  }

  public void setEntry(Reference<Resource>[] entry) {
    this.entry = entry;
  }

  public void setEmptyReason(CodeableConcept emptyReason) {
    this.emptyReason = emptyReason;
  }

  public void setSection(CompositionSection[] section) {
    this.section = section;
  }

  @Override
  public boolean equals(Object object) {
    if(object instanceof CompositionSection) {
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
    return "CompositionSection(" + id + "," + title + "," + code + ")";
  }
}
