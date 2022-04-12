package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * Example of workflow instance.
 *
 * @see <a href="https://www.hl7.org/fhir">ExampleScenario_Operation</a>
 */
public
class ExampleScenarioOperation extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected ExampleScenarioContainedInstance request;
  protected String receiver;
  protected String initiator;
  protected String description;
  protected Boolean receiverActive;
  protected String type;
  protected String number;
  protected ExampleScenarioContainedInstance response;
  protected String name;
  protected Boolean initiatorActive;
  
  public ExampleScenarioOperation()
  {
  }
  
  public ExampleScenarioContainedInstance getRequest() {
    return request;
  }
  
  public void setRequest(ExampleScenarioContainedInstance request) {
    this.request = request;
  }
  
  public String getReceiver() {
    return receiver;
  }
  
  public void setReceiver(String receiver) {
    this.receiver = receiver;
  }
  
  public String getInitiator() {
    return initiator;
  }
  
  public void setInitiator(String initiator) {
    this.initiator = initiator;
  }
  
  public String getDescription() {
    return description;
  }
  
  public void setDescription(String description) {
    this.description = description;
  }
  
  public Boolean getReceiverActive() {
    return receiverActive;
  }
  
  public void setReceiverActive(Boolean receiverActive) {
    this.receiverActive = receiverActive;
  }
  
  public String getType() {
    return type;
  }
  
  public void setType(String type) {
    this.type = type;
  }
  
  public String getNumber() {
    return number;
  }
  
  public void setNumber(String number) {
    this.number = number;
  }
  
  public ExampleScenarioContainedInstance getResponse() {
    return response;
  }
  
  public void setResponse(ExampleScenarioContainedInstance response) {
    this.response = response;
  }
  
  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  public Boolean getInitiatorActive() {
    return initiatorActive;
  }
  
  public void setInitiatorActive(Boolean initiatorActive) {
    this.initiatorActive = initiatorActive;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof ExampleScenarioOperation) {
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
    return "ExampleScenarioOperation(" + id + ")";
  }
}
