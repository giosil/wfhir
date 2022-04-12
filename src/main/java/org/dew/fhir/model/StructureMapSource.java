package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 *
 * A Map of relationships between 2 structures that can be used to transform data.
 *
 * @see <a href="https://www.hl7.org/fhir">StructureMap_Source</a>
 */
public
class StructureMapSource extends BackboneElement implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  protected Dosage defaultValueDosage;
  protected String defaultValueString;
  protected Signature defaultValueSignature;
  protected String type;
  protected Date defaultValueInstant;
  protected Boolean defaultValueBoolean;
  protected Quantity defaultValueQuantity;
  protected String defaultValueUrl;
  protected Ratio defaultValueRatio;
  protected String defaultValueUri;
  protected String context;
  protected Meta defaultValueMeta;
  protected Money defaultValueMoney;
  protected String element;
  protected String defaultValueBase64Binary;
  protected Address defaultValueAddress;
  protected Identifier defaultValueIdentifier;
  protected String defaultValueMarkdown;
  protected Age defaultValueAge;
  protected Expression defaultValueExpression;
  protected String defaultValueId;
  protected String check;
  protected String condition;
  protected UsageContext defaultValueUsageContext;
  protected DataRequirement defaultValueDataRequirement;
  protected Date defaultValueDate;
  protected ParameterDefinition defaultValueParameterDefinition;
  protected Attachment defaultValueAttachment;
  protected Reference<Resource> defaultValueReference;
  protected ContactDetail defaultValueContactDetail;
  protected Duration defaultValueDuration;
  protected Range defaultValueRange;
  protected SampledData defaultValueSampledData;
  protected String logMessage;
  protected Integer defaultValueUnsignedInt;
  protected Integer defaultValueInteger;
  protected Date defaultValueTime;
  protected String listMode;
  protected RelatedArtifact defaultValueRelatedArtifact;
  protected TriggerDefinition defaultValueTriggerDefinition;
  protected Integer min;
  protected ContactPoint defaultValueContactPoint;
  protected HumanName defaultValueHumanName;
  protected Date defaultValueDateTime;
  protected Distance defaultValueDistance;
  protected CodeableConcept defaultValueCodeableConcept;
  protected Double defaultValueDecimal;
  protected String defaultValueUuid;
  protected Annotation defaultValueAnnotation;
  protected Count defaultValueCount;
  protected String defaultValueCanonical;
  protected Period defaultValuePeriod;
  protected Contributor defaultValueContributor;
  protected String max;
  protected Timing defaultValueTiming;
  protected Integer defaultValuePositiveInt;
  protected String defaultValueOid;
  protected Coding defaultValueCoding;
  protected String defaultValueCode;
  protected String variable;
  
  public StructureMapSource()
  {
  }
  
  public Dosage getDefaultValueDosage() {
    return defaultValueDosage;
  }
  
  public void setDefaultValueDosage(Dosage defaultValueDosage) {
    this.defaultValueDosage = defaultValueDosage;
  }
  
  public String getDefaultValueString() {
    return defaultValueString;
  }
  
  public void setDefaultValueString(String defaultValueString) {
    this.defaultValueString = defaultValueString;
  }
  
  public Signature getDefaultValueSignature() {
    return defaultValueSignature;
  }
  
  public void setDefaultValueSignature(Signature defaultValueSignature) {
    this.defaultValueSignature = defaultValueSignature;
  }
  
  public String getType() {
    return type;
  }
  
  public void setType(String type) {
    this.type = type;
  }
  
  public Date getDefaultValueInstant() {
    return defaultValueInstant;
  }
  
  public void setDefaultValueInstant(Date defaultValueInstant) {
    this.defaultValueInstant = defaultValueInstant;
  }
  
  public Boolean getDefaultValueBoolean() {
    return defaultValueBoolean;
  }
  
  public void setDefaultValueBoolean(Boolean defaultValueBoolean) {
    this.defaultValueBoolean = defaultValueBoolean;
  }
  
  public Quantity getDefaultValueQuantity() {
    return defaultValueQuantity;
  }
  
  public void setDefaultValueQuantity(Quantity defaultValueQuantity) {
    this.defaultValueQuantity = defaultValueQuantity;
  }
  
  public String getDefaultValueUrl() {
    return defaultValueUrl;
  }
  
  public void setDefaultValueUrl(String defaultValueUrl) {
    this.defaultValueUrl = defaultValueUrl;
  }
  
  public Ratio getDefaultValueRatio() {
    return defaultValueRatio;
  }
  
  public void setDefaultValueRatio(Ratio defaultValueRatio) {
    this.defaultValueRatio = defaultValueRatio;
  }
  
  public String getDefaultValueUri() {
    return defaultValueUri;
  }
  
  public void setDefaultValueUri(String defaultValueUri) {
    this.defaultValueUri = defaultValueUri;
  }
  
  public String getContext() {
    return context;
  }
  
  public void setContext(String context) {
    this.context = context;
  }
  
  public Meta getDefaultValueMeta() {
    return defaultValueMeta;
  }
  
  public void setDefaultValueMeta(Meta defaultValueMeta) {
    this.defaultValueMeta = defaultValueMeta;
  }
  
  public Money getDefaultValueMoney() {
    return defaultValueMoney;
  }
  
  public void setDefaultValueMoney(Money defaultValueMoney) {
    this.defaultValueMoney = defaultValueMoney;
  }
  
  public String getElement() {
    return element;
  }
  
  public void setElement(String element) {
    this.element = element;
  }
  
  public String getDefaultValueBase64Binary() {
    return defaultValueBase64Binary;
  }
  
  public void setDefaultValueBase64Binary(String defaultValueBase64Binary) {
    this.defaultValueBase64Binary = defaultValueBase64Binary;
  }
  
  public Address getDefaultValueAddress() {
    return defaultValueAddress;
  }
  
  public void setDefaultValueAddress(Address defaultValueAddress) {
    this.defaultValueAddress = defaultValueAddress;
  }
  
  public Identifier getDefaultValueIdentifier() {
    return defaultValueIdentifier;
  }
  
  public void setDefaultValueIdentifier(Identifier defaultValueIdentifier) {
    this.defaultValueIdentifier = defaultValueIdentifier;
  }
  
  public String getDefaultValueMarkdown() {
    return defaultValueMarkdown;
  }
  
  public void setDefaultValueMarkdown(String defaultValueMarkdown) {
    this.defaultValueMarkdown = defaultValueMarkdown;
  }
  
  public Age getDefaultValueAge() {
    return defaultValueAge;
  }
  
  public void setDefaultValueAge(Age defaultValueAge) {
    this.defaultValueAge = defaultValueAge;
  }
  
  public Expression getDefaultValueExpression() {
    return defaultValueExpression;
  }
  
  public void setDefaultValueExpression(Expression defaultValueExpression) {
    this.defaultValueExpression = defaultValueExpression;
  }
  
  public String getDefaultValueId() {
    return defaultValueId;
  }
  
  public void setDefaultValueId(String defaultValueId) {
    this.defaultValueId = defaultValueId;
  }
  
  public String getCheck() {
    return check;
  }
  
  public void setCheck(String check) {
    this.check = check;
  }
  
  public String getCondition() {
    return condition;
  }
  
  public void setCondition(String condition) {
    this.condition = condition;
  }
  
  public UsageContext getDefaultValueUsageContext() {
    return defaultValueUsageContext;
  }
  
  public void setDefaultValueUsageContext(UsageContext defaultValueUsageContext) {
    this.defaultValueUsageContext = defaultValueUsageContext;
  }
  
  public DataRequirement getDefaultValueDataRequirement() {
    return defaultValueDataRequirement;
  }
  
  public void setDefaultValueDataRequirement(DataRequirement defaultValueDataRequirement) {
    this.defaultValueDataRequirement = defaultValueDataRequirement;
  }
  
  public Date getDefaultValueDate() {
    return defaultValueDate;
  }
  
  public void setDefaultValueDate(Date defaultValueDate) {
    this.defaultValueDate = defaultValueDate;
  }
  
  public ParameterDefinition getDefaultValueParameterDefinition() {
    return defaultValueParameterDefinition;
  }
  
  public void setDefaultValueParameterDefinition(ParameterDefinition defaultValueParameterDefinition) {
    this.defaultValueParameterDefinition = defaultValueParameterDefinition;
  }
  
  public Attachment getDefaultValueAttachment() {
    return defaultValueAttachment;
  }
  
  public void setDefaultValueAttachment(Attachment defaultValueAttachment) {
    this.defaultValueAttachment = defaultValueAttachment;
  }
  
  public Reference<Resource> getDefaultValueReference() {
    return defaultValueReference;
  }
  
  public void setDefaultValueReference(Reference<Resource> defaultValueReference) {
    this.defaultValueReference = defaultValueReference;
  }
  
  public ContactDetail getDefaultValueContactDetail() {
    return defaultValueContactDetail;
  }
  
  public void setDefaultValueContactDetail(ContactDetail defaultValueContactDetail) {
    this.defaultValueContactDetail = defaultValueContactDetail;
  }
  
  public Duration getDefaultValueDuration() {
    return defaultValueDuration;
  }
  
  public void setDefaultValueDuration(Duration defaultValueDuration) {
    this.defaultValueDuration = defaultValueDuration;
  }
  
  public Range getDefaultValueRange() {
    return defaultValueRange;
  }
  
  public void setDefaultValueRange(Range defaultValueRange) {
    this.defaultValueRange = defaultValueRange;
  }
  
  public SampledData getDefaultValueSampledData() {
    return defaultValueSampledData;
  }
  
  public void setDefaultValueSampledData(SampledData defaultValueSampledData) {
    this.defaultValueSampledData = defaultValueSampledData;
  }
  
  public String getLogMessage() {
    return logMessage;
  }
  
  public void setLogMessage(String logMessage) {
    this.logMessage = logMessage;
  }
  
  public Integer getDefaultValueUnsignedInt() {
    return defaultValueUnsignedInt;
  }
  
  public void setDefaultValueUnsignedInt(Integer defaultValueUnsignedInt) {
    this.defaultValueUnsignedInt = defaultValueUnsignedInt;
  }
  
  public Integer getDefaultValueInteger() {
    return defaultValueInteger;
  }
  
  public void setDefaultValueInteger(Integer defaultValueInteger) {
    this.defaultValueInteger = defaultValueInteger;
  }
  
  public Date getDefaultValueTime() {
    return defaultValueTime;
  }
  
  public void setDefaultValueTime(Date defaultValueTime) {
    this.defaultValueTime = defaultValueTime;
  }
  
  public String getListMode() {
    return listMode;
  }
  
  public void setListMode(String listMode) {
    this.listMode = listMode;
  }
  
  public RelatedArtifact getDefaultValueRelatedArtifact() {
    return defaultValueRelatedArtifact;
  }
  
  public void setDefaultValueRelatedArtifact(RelatedArtifact defaultValueRelatedArtifact) {
    this.defaultValueRelatedArtifact = defaultValueRelatedArtifact;
  }
  
  public TriggerDefinition getDefaultValueTriggerDefinition() {
    return defaultValueTriggerDefinition;
  }
  
  public void setDefaultValueTriggerDefinition(TriggerDefinition defaultValueTriggerDefinition) {
    this.defaultValueTriggerDefinition = defaultValueTriggerDefinition;
  }
  
  public Integer getMin() {
    return min;
  }
  
  public void setMin(Integer min) {
    this.min = min;
  }
  
  public ContactPoint getDefaultValueContactPoint() {
    return defaultValueContactPoint;
  }
  
  public void setDefaultValueContactPoint(ContactPoint defaultValueContactPoint) {
    this.defaultValueContactPoint = defaultValueContactPoint;
  }
  
  public HumanName getDefaultValueHumanName() {
    return defaultValueHumanName;
  }
  
  public void setDefaultValueHumanName(HumanName defaultValueHumanName) {
    this.defaultValueHumanName = defaultValueHumanName;
  }
  
  public Date getDefaultValueDateTime() {
    return defaultValueDateTime;
  }
  
  public void setDefaultValueDateTime(Date defaultValueDateTime) {
    this.defaultValueDateTime = defaultValueDateTime;
  }
  
  public Distance getDefaultValueDistance() {
    return defaultValueDistance;
  }
  
  public void setDefaultValueDistance(Distance defaultValueDistance) {
    this.defaultValueDistance = defaultValueDistance;
  }
  
  public CodeableConcept getDefaultValueCodeableConcept() {
    return defaultValueCodeableConcept;
  }
  
  public void setDefaultValueCodeableConcept(CodeableConcept defaultValueCodeableConcept) {
    this.defaultValueCodeableConcept = defaultValueCodeableConcept;
  }
  
  public Double getDefaultValueDecimal() {
    return defaultValueDecimal;
  }
  
  public void setDefaultValueDecimal(Double defaultValueDecimal) {
    this.defaultValueDecimal = defaultValueDecimal;
  }
  
  public String getDefaultValueUuid() {
    return defaultValueUuid;
  }
  
  public void setDefaultValueUuid(String defaultValueUuid) {
    this.defaultValueUuid = defaultValueUuid;
  }
  
  public Annotation getDefaultValueAnnotation() {
    return defaultValueAnnotation;
  }
  
  public void setDefaultValueAnnotation(Annotation defaultValueAnnotation) {
    this.defaultValueAnnotation = defaultValueAnnotation;
  }
  
  public Count getDefaultValueCount() {
    return defaultValueCount;
  }
  
  public void setDefaultValueCount(Count defaultValueCount) {
    this.defaultValueCount = defaultValueCount;
  }
  
  public String getDefaultValueCanonical() {
    return defaultValueCanonical;
  }
  
  public void setDefaultValueCanonical(String defaultValueCanonical) {
    this.defaultValueCanonical = defaultValueCanonical;
  }
  
  public Period getDefaultValuePeriod() {
    return defaultValuePeriod;
  }
  
  public void setDefaultValuePeriod(Period defaultValuePeriod) {
    this.defaultValuePeriod = defaultValuePeriod;
  }
  
  public Contributor getDefaultValueContributor() {
    return defaultValueContributor;
  }
  
  public void setDefaultValueContributor(Contributor defaultValueContributor) {
    this.defaultValueContributor = defaultValueContributor;
  }
  
  public String getMax() {
    return max;
  }
  
  public void setMax(String max) {
    this.max = max;
  }
  
  public Timing getDefaultValueTiming() {
    return defaultValueTiming;
  }
  
  public void setDefaultValueTiming(Timing defaultValueTiming) {
    this.defaultValueTiming = defaultValueTiming;
  }
  
  public Integer getDefaultValuePositiveInt() {
    return defaultValuePositiveInt;
  }
  
  public void setDefaultValuePositiveInt(Integer defaultValuePositiveInt) {
    this.defaultValuePositiveInt = defaultValuePositiveInt;
  }
  
  public String getDefaultValueOid() {
    return defaultValueOid;
  }
  
  public void setDefaultValueOid(String defaultValueOid) {
    this.defaultValueOid = defaultValueOid;
  }
  
  public Coding getDefaultValueCoding() {
    return defaultValueCoding;
  }
  
  public void setDefaultValueCoding(Coding defaultValueCoding) {
    this.defaultValueCoding = defaultValueCoding;
  }
  
  public String getDefaultValueCode() {
    return defaultValueCode;
  }
  
  public void setDefaultValueCode(String defaultValueCode) {
    this.defaultValueCode = defaultValueCode;
  }
  
  public String getVariable() {
    return variable;
  }
  
  public void setVariable(String variable) {
    this.variable = variable;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof StructureMapSource) {
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
    return "StructureMapSource(" + id + ")";
  }
}
