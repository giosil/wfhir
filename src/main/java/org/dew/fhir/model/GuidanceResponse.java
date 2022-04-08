package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 * 
 * A guidance response is the formal response to a guidance request, including any output parameters returned by the evaluation, as well as the description of any proposed actions to be taken.
 *
 * @see <a href="https://www.hl7.org/fhir/guidanceresponse.html#GuidanceResponse">GuidanceResponse</a>
 */
public 
class GuidanceResponse extends DomainResource implements Serializable 
{
  private static final long serialVersionUID = -8742165355844642431L;
  
  protected Identifier requestIdentifier;
  protected Identifier[] identifier;
  protected String moduleUri;
  protected String moduleCanonical;
  protected CodeableConcept moduleCodeableConcept;
  protected String status;
  protected Reference<Resource> subject;
  protected Reference<Encounter> encounter;
  protected Date occurrenceDateTime;
  protected Reference<Device> performer;
  protected CodeableConcept[] reasonCode;
  protected Reference<Resource>[] reasonReference;
  protected Annotation[] note;
  protected Reference<OperationOutcome>[] evaluationMessage;
  protected Reference<Parameters> outputParameters;
  protected Reference<Resource> result;
  protected DataRequirement[] dataRequirement;
  
  public GuidanceResponse()
  {
    this.resourceType = "GuidanceResponse";
  }
  
  public GuidanceResponse(Identifier requestIdentifier)
  {
    this.resourceType = "GuidanceResponse";
    this.requestIdentifier = requestIdentifier;
  }
  
  public Identifier getRequestIdentifier() {
    return requestIdentifier;
  }

  public Identifier[] getIdentifier() {
    return identifier;
  }

  public String getModuleUri() {
    return moduleUri;
  }

  public String getModuleCanonical() {
    return moduleCanonical;
  }

  public CodeableConcept getModuleCodeableConcept() {
    return moduleCodeableConcept;
  }

  public String getStatus() {
    return status;
  }

  public Reference<Resource> getSubject() {
    return subject;
  }

  public Reference<Encounter> getEncounter() {
    return encounter;
  }

  public Date getOccurrenceDateTime() {
    return occurrenceDateTime;
  }

  public Reference<Device> getPerformer() {
    return performer;
  }

  public CodeableConcept[] getReasonCode() {
    return reasonCode;
  }

  public Reference<Resource>[] getReasonReference() {
    return reasonReference;
  }

  public Annotation[] getNote() {
    return note;
  }

  public Reference<OperationOutcome>[] getEvaluationMessage() {
    return evaluationMessage;
  }

  public Reference<Parameters> getOutputParameters() {
    return outputParameters;
  }

  public Reference<Resource> getResult() {
    return result;
  }

  public DataRequirement[] getDataRequirement() {
    return dataRequirement;
  }

  public void setRequestIdentifier(Identifier requestIdentifier) {
    this.requestIdentifier = requestIdentifier;
  }

  public void setIdentifier(Identifier[] identifier) {
    this.identifier = identifier;
  }

  public void setModuleUri(String moduleUri) {
    this.moduleUri = moduleUri;
  }

  public void setModuleCanonical(String moduleCanonical) {
    this.moduleCanonical = moduleCanonical;
  }

  public void setModuleCodeableConcept(CodeableConcept moduleCodeableConcept) {
    this.moduleCodeableConcept = moduleCodeableConcept;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public void setSubject(Reference<Resource> subject) {
    this.subject = subject;
  }

  public void setEncounter(Reference<Encounter> encounter) {
    this.encounter = encounter;
  }

  public void setOccurrenceDateTime(Date occurrenceDateTime) {
    this.occurrenceDateTime = occurrenceDateTime;
  }

  public void setPerformer(Reference<Device> performer) {
    this.performer = performer;
  }

  public void setReasonCode(CodeableConcept[] reasonCode) {
    this.reasonCode = reasonCode;
  }

  public void setReasonReference(Reference<Resource>[] reasonReference) {
    this.reasonReference = reasonReference;
  }

  public void setNote(Annotation[] note) {
    this.note = note;
  }

  public void setEvaluationMessage(Reference<OperationOutcome>[] evaluationMessage) {
    this.evaluationMessage = evaluationMessage;
  }

  public void setOutputParameters(Reference<Parameters> outputParameters) {
    this.outputParameters = outputParameters;
  }

  public void setResult(Reference<Resource> result) {
    this.result = result;
  }

  public void setDataRequirement(DataRequirement[] dataRequirement) {
    this.dataRequirement = dataRequirement;
  }

  @Override
  public boolean equals(Object object) {
    if(object instanceof GuidanceResponse) {
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
    return "GuidanceResponse(" + id + ")";
  }
}
