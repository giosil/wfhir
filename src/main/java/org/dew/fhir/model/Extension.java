package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 * 
 * Every element in a resource or data type includes an optional "extension" child element that may be present any number of times.
 *
 *  @see <a href="https://www.hl7.org/fhir/extensibility.html#Extension">Extension</a>
 */
public 
class Extension extends Element implements Serializable
{
  private static final long serialVersionUID = -5997871651498476194L;
  
  protected String url;
  protected byte[] valueBase64Binary;
  protected Boolean valueBoolean;
  protected String valueCanonical;
  protected String valueCode;
  protected Date valueDate;
  protected Date valueDateTime;
  protected Double valueDecimal;
  protected String valueId;
  protected Date valueInstant;
  protected Integer valueInteger;
  protected String valueMarkdown;
  protected String valueOid;
  protected Integer valuePositiveInt;
  protected String valueString;
  protected Date valueTime;
  protected Integer valueUnsignedInt;
  protected String valueUri;
  protected String valueUrl;
  protected String valueUuid;
  protected Address valueAddress;
  protected Age valueAge;
  protected Annotation valueAnnotation;
  protected Attachment valueAttachment;
  protected CodeableConcept valueCodeableConcept;
  protected Coding valueCoding;
  protected ContactPoint valueContactPoint;
  protected Count valueCount;
  protected Distance valueDistance;
  protected Duration valueDuration;
  protected HumanName valueHumanName;
  protected Identifier valueIdentifier;
  protected Money valueMoney;
  protected Period valuePeriod;
  protected Quantity valueQuantity;
  protected Range valueRange;
  protected Ratio valueRatio;
  protected Reference<Resource> valueReference;
  protected SampledData valueSampledData;
  protected Signature valueSignature;
  protected Timing valueTiming;
  protected ContactDetail valueContactDetail;
  protected Contributor valueContributor;
  protected DataRequirement valueDataRequirement;
  protected Expression valueExpression;
  protected ParameterDefinition valueParameterDefinition;
  protected RelatedArtifact valueRelatedArtifact;
  protected TriggerDefinition valueTriggerDefinition;
  protected UsageContext valueUsageContext;
  protected Dosage valueDosage;
  protected Meta valueMeta;
  
  public Extension()
  {
  }
  
  public Extension(String url, String codingSystem, String codingCode, String codingDisplay)
  {
    this.url = url;
    this.valueCoding = new Coding(codingSystem, null, codingCode, codingDisplay);
  }
  
  public String getUrl() {
    return url;
  }

  public byte[] getValueBase64Binary() {
    return valueBase64Binary;
  }

  public Boolean getValueBoolean() {
    return valueBoolean;
  }

  public String getValueCanonical() {
    return valueCanonical;
  }

  public String getValueCode() {
    return valueCode;
  }

  public Date getValueDate() {
    return valueDate;
  }

  public Date getValueDateTime() {
    return valueDateTime;
  }

  public Double getValueDecimal() {
    return valueDecimal;
  }

  public String getValueId() {
    return valueId;
  }

  public Date getValueInstant() {
    return valueInstant;
  }

  public Integer getValueInteger() {
    return valueInteger;
  }

  public String getValueMarkdown() {
    return valueMarkdown;
  }

  public String getValueOid() {
    return valueOid;
  }

  public Integer getValuePositiveInt() {
    return valuePositiveInt;
  }

  public String getValueString() {
    return valueString;
  }

  public Date getValueTime() {
    return valueTime;
  }

  public Integer getValueUnsignedInt() {
    return valueUnsignedInt;
  }

  public String getValueUri() {
    return valueUri;
  }

  public String getValueUrl() {
    return valueUrl;
  }

  public String getValueUuid() {
    return valueUuid;
  }

  public Address getValueAddress() {
    return valueAddress;
  }

  public Age getValueAge() {
    return valueAge;
  }

  public Annotation getValueAnnotation() {
    return valueAnnotation;
  }

  public Attachment getValueAttachment() {
    return valueAttachment;
  }

  public CodeableConcept getValueCodeableConcept() {
    return valueCodeableConcept;
  }

  public Coding getValueCoding() {
    return valueCoding;
  }

  public ContactPoint getValueContactPoint() {
    return valueContactPoint;
  }

  public Count getValueCount() {
    return valueCount;
  }

  public Distance getValueDistance() {
    return valueDistance;
  }

  public Duration getValueDuration() {
    return valueDuration;
  }

  public HumanName getValueHumanName() {
    return valueHumanName;
  }

  public Identifier getValueIdentifier() {
    return valueIdentifier;
  }

  public Money getValueMoney() {
    return valueMoney;
  }

  public Period getValuePeriod() {
    return valuePeriod;
  }

  public Quantity getValueQuantity() {
    return valueQuantity;
  }

  public Range getValueRange() {
    return valueRange;
  }

  public Ratio getValueRatio() {
    return valueRatio;
  }

  public Reference<Resource> getValueReference() {
    return valueReference;
  }

  public SampledData getValueSampledData() {
    return valueSampledData;
  }

  public Signature getValueSignature() {
    return valueSignature;
  }

  public Timing getValueTiming() {
    return valueTiming;
  }

  public ContactDetail getValueContactDetail() {
    return valueContactDetail;
  }

  public Contributor getValueContributor() {
    return valueContributor;
  }

  public DataRequirement getValueDataRequirement() {
    return valueDataRequirement;
  }

  public Expression getValueExpression() {
    return valueExpression;
  }

  public ParameterDefinition getValueParameterDefinition() {
    return valueParameterDefinition;
  }

  public RelatedArtifact getValueRelatedArtifact() {
    return valueRelatedArtifact;
  }

  public TriggerDefinition getValueTriggerDefinition() {
    return valueTriggerDefinition;
  }

  public UsageContext getValueUsageContext() {
    return valueUsageContext;
  }

  public Dosage getValueDosage() {
    return valueDosage;
  }

  public Meta getValueMeta() {
    return valueMeta;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public void setValueBase64Binary(byte[] valueBase64Binary) {
    this.valueBase64Binary = valueBase64Binary;
  }

  public void setValueBoolean(Boolean valueBoolean) {
    this.valueBoolean = valueBoolean;
  }

  public void setValueCanonical(String valueCanonical) {
    this.valueCanonical = valueCanonical;
  }

  public void setValueCode(String valueCode) {
    this.valueCode = valueCode;
  }

  public void setValueDate(Date valueDate) {
    this.valueDate = valueDate;
  }

  public void setValueDateTime(Date valueDateTime) {
    this.valueDateTime = valueDateTime;
  }

  public void setValueDecimal(Double valueDecimal) {
    this.valueDecimal = valueDecimal;
  }

  public void setValueId(String valueId) {
    this.valueId = valueId;
  }

  public void setValueInstant(Date valueInstant) {
    this.valueInstant = valueInstant;
  }

  public void setValueInteger(Integer valueInteger) {
    this.valueInteger = valueInteger;
  }

  public void setValueMarkdown(String valueMarkdown) {
    this.valueMarkdown = valueMarkdown;
  }

  public void setValueOid(String valueOid) {
    this.valueOid = valueOid;
  }

  public void setValuePositiveInt(Integer valuePositiveInt) {
    this.valuePositiveInt = valuePositiveInt;
  }

  public void setValueString(String valueString) {
    this.valueString = valueString;
  }

  public void setValueTime(Date valueTime) {
    this.valueTime = valueTime;
  }

  public void setValueUnsignedInt(Integer valueUnsignedInt) {
    this.valueUnsignedInt = valueUnsignedInt;
  }

  public void setValueUri(String valueUri) {
    this.valueUri = valueUri;
  }

  public void setValueUrl(String valueUrl) {
    this.valueUrl = valueUrl;
  }

  public void setValueUuid(String valueUuid) {
    this.valueUuid = valueUuid;
  }

  public void setValueAddress(Address valueAddress) {
    this.valueAddress = valueAddress;
  }

  public void setValueAge(Age valueAge) {
    this.valueAge = valueAge;
  }

  public void setValueAnnotation(Annotation valueAnnotation) {
    this.valueAnnotation = valueAnnotation;
  }

  public void setValueAttachment(Attachment valueAttachment) {
    this.valueAttachment = valueAttachment;
  }

  public void setValueCodeableConcept(CodeableConcept valueCodeableConcept) {
    this.valueCodeableConcept = valueCodeableConcept;
  }

  public void setValueCoding(Coding valueCoding) {
    this.valueCoding = valueCoding;
  }

  public void setValueContactPoint(ContactPoint valueContactPoint) {
    this.valueContactPoint = valueContactPoint;
  }

  public void setValueCount(Count valueCount) {
    this.valueCount = valueCount;
  }

  public void setValueDistance(Distance valueDistance) {
    this.valueDistance = valueDistance;
  }

  public void setValueDuration(Duration valueDuration) {
    this.valueDuration = valueDuration;
  }

  public void setValueHumanName(HumanName valueHumanName) {
    this.valueHumanName = valueHumanName;
  }

  public void setValueIdentifier(Identifier valueIdentifier) {
    this.valueIdentifier = valueIdentifier;
  }

  public void setValueMoney(Money valueMoney) {
    this.valueMoney = valueMoney;
  }

  public void setValuePeriod(Period valuePeriod) {
    this.valuePeriod = valuePeriod;
  }

  public void setValueQuantity(Quantity valueQuantity) {
    this.valueQuantity = valueQuantity;
  }

  public void setValueRange(Range valueRange) {
    this.valueRange = valueRange;
  }

  public void setValueRatio(Ratio valueRatio) {
    this.valueRatio = valueRatio;
  }

  public void setValueReference(Reference<Resource> valueReference) {
    this.valueReference = valueReference;
  }

  public void setValueSampledData(SampledData valueSampledData) {
    this.valueSampledData = valueSampledData;
  }

  public void setValueSignature(Signature valueSignature) {
    this.valueSignature = valueSignature;
  }

  public void setValueTiming(Timing valueTiming) {
    this.valueTiming = valueTiming;
  }

  public void setValueContactDetail(ContactDetail valueContactDetail) {
    this.valueContactDetail = valueContactDetail;
  }

  public void setValueContributor(Contributor valueContributor) {
    this.valueContributor = valueContributor;
  }

  public void setValueDataRequirement(DataRequirement valueDataRequirement) {
    this.valueDataRequirement = valueDataRequirement;
  }

  public void setValueExpression(Expression valueExpression) {
    this.valueExpression = valueExpression;
  }

  public void setValueParameterDefinition(ParameterDefinition valueParameterDefinition) {
    this.valueParameterDefinition = valueParameterDefinition;
  }

  public void setValueRelatedArtifact(RelatedArtifact valueRelatedArtifact) {
    this.valueRelatedArtifact = valueRelatedArtifact;
  }

  public void setValueTriggerDefinition(TriggerDefinition valueTriggerDefinition) {
    this.valueTriggerDefinition = valueTriggerDefinition;
  }

  public void setValueUsageContext(UsageContext valueUsageContext) {
    this.valueUsageContext = valueUsageContext;
  }

  public void setValueDosage(Dosage valueDosage) {
    this.valueDosage = valueDosage;
  }

  public void setValueMeta(Meta valueMeta) {
    this.valueMeta = valueMeta;
  }

  @Override
  public boolean equals(Object object) {
    if(object instanceof Extension) {
      return this.hashCode() == object.hashCode();
    }
    return false;
  }
  
  @Override
  public int hashCode() {
    return (url + ":" + valueString).hashCode();
  }
  
  @Override
  public String toString() {
    return "Extension(" + url + "," + valueString + ")";
  }
}
