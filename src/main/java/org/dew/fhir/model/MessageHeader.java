package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * The header for a message exchange that is either requesting or responding to an action. 
 * The reference(s) that are the subject of the action as well as other information related to the action are typically transmitted in a bundle in which the MessageHeader resource instance is the first resource in the bundle.
 *
 * @see <a href="https://www.hl7.org/fhir/messageheader.html">MessageHeader</a>
 */
public 
class MessageHeader extends DomainResource implements Serializable 
{
  private static final long serialVersionUID = 971134255809266042L;
  
  protected Coding eventCoding;
  protected String eventUri;
  protected MessageHeaderDestination[] destination;
  protected Reference<Resource> sender;
  protected Reference<Resource> enterer;
  protected Reference<Resource> author;
  protected MessageHeaderSource source;
  protected Reference<Resource> responsible;
  protected CodeableConcept reason;
  protected MessageHeaderResponse response;
  protected Reference<Resource>[] focus;
  protected String definition;
  
  public MessageHeader()
  {
    this.resourceType = "MessageHeader";
  }

  public Coding getEventCoding() {
    return eventCoding;
  }

  public String getEventUri() {
    return eventUri;
  }

  public MessageHeaderDestination[] getDestination() {
    return destination;
  }

  public Reference<Resource> getSender() {
    return sender;
  }

  public Reference<Resource> getEnterer() {
    return enterer;
  }

  public Reference<Resource> getAuthor() {
    return author;
  }

  public MessageHeaderSource getSource() {
    return source;
  }

  public Reference<Resource> getResponsible() {
    return responsible;
  }

  public CodeableConcept getReason() {
    return reason;
  }

  public MessageHeaderResponse getResponse() {
    return response;
  }

  public Reference<Resource>[] getFocus() {
    return focus;
  }

  public String getDefinition() {
    return definition;
  }

  public void setEventCoding(Coding eventCoding) {
    this.eventCoding = eventCoding;
  }

  public void setEventUri(String eventUri) {
    this.eventUri = eventUri;
  }

  public void setDestination(MessageHeaderDestination[] destination) {
    this.destination = destination;
  }

  public void setSender(Reference<Resource> sender) {
    this.sender = sender;
  }

  public void setEnterer(Reference<Resource> enterer) {
    this.enterer = enterer;
  }

  public void setAuthor(Reference<Resource> author) {
    this.author = author;
  }

  public void setSource(MessageHeaderSource source) {
    this.source = source;
  }

  public void setResponsible(Reference<Resource> responsible) {
    this.responsible = responsible;
  }

  public void setReason(CodeableConcept reason) {
    this.reason = reason;
  }

  public void setResponse(MessageHeaderResponse response) {
    this.response = response;
  }

  public void setFocus(Reference<Resource>[] focus) {
    this.focus = focus;
  }

  public void setDefinition(String definition) {
    this.definition = definition;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof MessageHeader) {
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
    return "MessageHeader(" + id + "," + eventCoding + "," + eventUri + ")";
  }
}
