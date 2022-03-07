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
  private static final long serialVersionUID = 778338245940777371L;
  
  protected String url;
  protected byte[] valueBase64Binary;
  protected boolean valueBoolean;
  protected String valueCanonical;
  protected String valueCode;
  protected Date valueDate;
  protected Date valueDateTime;
  protected double valueDecimal;
  protected String valueId;
  protected Date valueInstant;
  protected int valueInteger;
  protected String valueMarkdown;
  protected String valueOid;
  protected int valuePositiveInt;
  protected String valueString;
  protected Date valueTime;
  protected int valueUnsignedInt;
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
