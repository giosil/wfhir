package org.dew.fhir.model;

import java.io.Serializable;

/**
 *
 * A structured set of questions intended to guide the collection of answers from end-users. Questionnaires provide detailed control over order, presentation, phraseology and grouping to allow coherent, consistent data collection.
 *
 * @see <a href="https://www.hl7.org/fhir">Questionnaire_Item</a>
 */
public
class QuestionnaireItem extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected Boolean repeats;
  protected Coding[] code;
  protected QuestionnaireEnableWhen[] enableWhen;
  protected String prefix;
  protected String type;
  protected Boolean required;
  protected String definition;
  protected QuestionnaireItem[] item;
  protected QuestionnaireInitial[] initial;
  protected Boolean readOnly;
  protected String linkId;
  protected String enableBehavior;
  protected String answerValueSet;
  protected QuestionnaireAnswerOption[] answerOption;
  protected Integer maxLength;
  
  public QuestionnaireItem()
  {
  }
  
  public Boolean getRepeats() {
    return repeats;
  }
  
  public void setRepeats(Boolean repeats) {
    this.repeats = repeats;
  }
  
  public Coding[] getCode() {
    return code;
  }
  
  public void setCode(Coding[] code) {
    this.code = code;
  }
  
  public QuestionnaireEnableWhen[] getEnableWhen() {
    return enableWhen;
  }
  
  public void setEnableWhen(QuestionnaireEnableWhen[] enableWhen) {
    this.enableWhen = enableWhen;
  }
  
  public String getPrefix() {
    return prefix;
  }
  
  public void setPrefix(String prefix) {
    this.prefix = prefix;
  }
  
  public String getType() {
    return type;
  }
  
  public void setType(String type) {
    this.type = type;
  }
  
  public Boolean getRequired() {
    return required;
  }
  
  public void setRequired(Boolean required) {
    this.required = required;
  }
  
  public String getDefinition() {
    return definition;
  }
  
  public void setDefinition(String definition) {
    this.definition = definition;
  }
  
  public QuestionnaireItem[] getItem() {
    return item;
  }
  
  public void setItem(QuestionnaireItem[] item) {
    this.item = item;
  }
  
  public QuestionnaireInitial[] getInitial() {
    return initial;
  }
  
  public void setInitial(QuestionnaireInitial[] initial) {
    this.initial = initial;
  }
  
  public Boolean getReadOnly() {
    return readOnly;
  }
  
  public void setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
  }
  
  public String getLinkId() {
    return linkId;
  }
  
  public void setLinkId(String linkId) {
    this.linkId = linkId;
  }
  
  public String getEnableBehavior() {
    return enableBehavior;
  }
  
  public void setEnableBehavior(String enableBehavior) {
    this.enableBehavior = enableBehavior;
  }
  
  public String getAnswerValueSet() {
    return answerValueSet;
  }
  
  public void setAnswerValueSet(String answerValueSet) {
    this.answerValueSet = answerValueSet;
  }
  
  public QuestionnaireAnswerOption[] getAnswerOption() {
    return answerOption;
  }
  
  public void setAnswerOption(QuestionnaireAnswerOption[] answerOption) {
    this.answerOption = answerOption;
  }
  
  public Integer getMaxLength() {
    return maxLength;
  }
  
  public void setMaxLength(Integer maxLength) {
    this.maxLength = maxLength;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof QuestionnaireItem) {
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
    return "QuestionnaireItem(" + id + ")";
  }
}
