package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 * 
 * Legally enforceable, formally recorded unilateral or bilateral directive i.e., a policy or agreement.
 *
 * @see <a href="https://www.hl7.org/fhir/contract.html">Contract</a>
 */
public 
class Contract extends DomainResource implements Serializable 
{
  private static final long serialVersionUID = 3287276676722789666L;
  
  protected Identifier[] identifier;
  protected String url;
  protected String version;
  protected String status;
  protected CodeableConcept legalState;
  protected Reference<Contract> instantiatesCanonical;
  protected String instantiatesUri;
  protected CodeableConcept contentDerivative;
  protected Date issued;
  protected Period applies;
  protected CodeableConcept expirationType;
  protected Reference<Resource>[] subject;
  protected Reference<Organization>[] authority;
  protected Reference<Location>[] domain;
  protected Reference<Location>[] site;
  protected String name;
  protected String title;
  protected String subtitle;
  protected String[] alias;
  protected Reference<Resource> author;
  protected CodeableConcept scope;
  protected CodeableConcept topicCodeableConcept;
  protected Reference<Resource> topicReference;
  protected CodeableConcept type;
  protected CodeableConcept[] subType;
  protected ContractContentDefinition contentDefinition;
  protected ContractTerm[] term;
  protected Reference<Resource>[] supportingInfo;
  protected Reference<Provenance>[] relevantHistory;
  protected ContractSigner[] signer;
  protected ContractFriendly[] friendly;
  protected ContractLegal[] legal;
  protected ContractRule[] rule;
  protected Attachment legallyBindingAttachment;
  protected Reference<Resource> legallyBindingReference;
  
  public Contract()
  {
    this.resourceType = "Contract";
  }

  public Identifier[] getIdentifier() {
    return identifier;
  }

  public String getUrl() {
    return url;
  }

  public String getVersion() {
    return version;
  }

  public String getStatus() {
    return status;
  }

  public CodeableConcept getLegalState() {
    return legalState;
  }

  public Reference<Contract> getInstantiatesCanonical() {
    return instantiatesCanonical;
  }

  public String getInstantiatesUri() {
    return instantiatesUri;
  }

  public CodeableConcept getContentDerivative() {
    return contentDerivative;
  }

  public Date getIssued() {
    return issued;
  }

  public Period getApplies() {
    return applies;
  }

  public CodeableConcept getExpirationType() {
    return expirationType;
  }

  public Reference<Resource>[] getSubject() {
    return subject;
  }

  public Reference<Organization>[] getAuthority() {
    return authority;
  }

  public Reference<Location>[] getDomain() {
    return domain;
  }

  public Reference<Location>[] getSite() {
    return site;
  }

  public String getName() {
    return name;
  }

  public String getTitle() {
    return title;
  }

  public String getSubtitle() {
    return subtitle;
  }

  public String[] getAlias() {
    return alias;
  }

  public Reference<Resource> getAuthor() {
    return author;
  }

  public CodeableConcept getScope() {
    return scope;
  }

  public CodeableConcept getTopicCodeableConcept() {
    return topicCodeableConcept;
  }

  public Reference<Resource> getTopicReference() {
    return topicReference;
  }

  public CodeableConcept getType() {
    return type;
  }

  public CodeableConcept[] getSubType() {
    return subType;
  }

  public ContractContentDefinition getContentDefinition() {
    return contentDefinition;
  }

  public ContractTerm[] getTerm() {
    return term;
  }

  public Reference<Resource>[] getSupportingInfo() {
    return supportingInfo;
  }

  public Reference<Provenance>[] getRelevantHistory() {
    return relevantHistory;
  }

  public ContractSigner[] getSigner() {
    return signer;
  }

  public ContractFriendly[] getFriendly() {
    return friendly;
  }

  public ContractLegal[] getLegal() {
    return legal;
  }

  public ContractRule[] getRule() {
    return rule;
  }

  public Attachment getLegallyBindingAttachment() {
    return legallyBindingAttachment;
  }

  public Reference<Resource> getLegallyBindingReference() {
    return legallyBindingReference;
  }

  public void setIdentifier(Identifier[] identifier) {
    this.identifier = identifier;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public void setLegalState(CodeableConcept legalState) {
    this.legalState = legalState;
  }

  public void setInstantiatesCanonical(Reference<Contract> instantiatesCanonical) {
    this.instantiatesCanonical = instantiatesCanonical;
  }

  public void setInstantiatesUri(String instantiatesUri) {
    this.instantiatesUri = instantiatesUri;
  }

  public void setContentDerivative(CodeableConcept contentDerivative) {
    this.contentDerivative = contentDerivative;
  }

  public void setIssued(Date issued) {
    this.issued = issued;
  }

  public void setApplies(Period applies) {
    this.applies = applies;
  }

  public void setExpirationType(CodeableConcept expirationType) {
    this.expirationType = expirationType;
  }

  public void setSubject(Reference<Resource>[] subject) {
    this.subject = subject;
  }

  public void setAuthority(Reference<Organization>[] authority) {
    this.authority = authority;
  }

  public void setDomain(Reference<Location>[] domain) {
    this.domain = domain;
  }

  public void setSite(Reference<Location>[] site) {
    this.site = site;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public void setSubtitle(String subtitle) {
    this.subtitle = subtitle;
  }

  public void setAlias(String[] alias) {
    this.alias = alias;
  }

  public void setAuthor(Reference<Resource> author) {
    this.author = author;
  }

  public void setScope(CodeableConcept scope) {
    this.scope = scope;
  }

  public void setTopicCodeableConcept(CodeableConcept topicCodeableConcept) {
    this.topicCodeableConcept = topicCodeableConcept;
  }

  public void setTopicReference(Reference<Resource> topicReference) {
    this.topicReference = topicReference;
  }

  public void setType(CodeableConcept type) {
    this.type = type;
  }

  public void setSubType(CodeableConcept[] subType) {
    this.subType = subType;
  }

  public void setContentDefinition(ContractContentDefinition contentDefinition) {
    this.contentDefinition = contentDefinition;
  }

  public void setTerm(ContractTerm[] term) {
    this.term = term;
  }

  public void setSupportingInfo(Reference<Resource>[] supportingInfo) {
    this.supportingInfo = supportingInfo;
  }

  public void setRelevantHistory(Reference<Provenance>[] relevantHistory) {
    this.relevantHistory = relevantHistory;
  }

  public void setSigner(ContractSigner[] signer) {
    this.signer = signer;
  }

  public void setFriendly(ContractFriendly[] friendly) {
    this.friendly = friendly;
  }

  public void setLegal(ContractLegal[] legal) {
    this.legal = legal;
  }

  public void setRule(ContractRule[] rule) {
    this.rule = rule;
  }

  public void setLegallyBindingAttachment(Attachment legallyBindingAttachment) {
    this.legallyBindingAttachment = legallyBindingAttachment;
  }

  public void setLegallyBindingReference(Reference<Resource> legallyBindingReference) {
    this.legallyBindingReference = legallyBindingReference;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof Contract) {
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
    return "Contract(" + id + "," + url + "," + type + "," + subType + ")";
  }
}
