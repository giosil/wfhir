package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 * 
 * The definition of an element in a resource or an extension.
 *
 * @see <a href="https://www.hl7.org/fhir/elementdefinition.html">ElementDefinition</a>
 */
public 
class ElementDefinition extends BackboneElement implements Serializable 
{
  private static final long serialVersionUID = 119391776738047100L;
  
  protected String path;
  protected String[] representation;
  protected String sliceName;
  protected Boolean sliceIsConstraining;
  protected String label;
  protected Coding[] code;
  protected ElementDefinitionSlicing slicing;
  protected String short_;
  protected String definition;
  protected String comment;
  protected String requirements;
  protected String[] alias;
  protected Integer min;
  protected String max;
  protected ElementDefinitionBase base;
  protected String contentReference;
  protected ElementDefinitionType[] type;
  protected String defaultValue;
  protected String meaningWhenMissing;
  protected String orderMeaning;
  protected String fixed;
  protected String pattern;
  protected ElementDefinitionExample[] example;
  protected Date minValueDate;
  protected Date minValueDateTime;
  protected Date minValueInstant;
  protected Date minValueTime;
  protected Double minValueDecimal;
  protected Integer minValueInteger;
  protected Integer minValueUnsignedInt;
  protected Quantity minValueQuantity;
  protected Date maxValueDate;
  protected Date maxValueDateTime;
  protected Date maxValueInstant;
  protected Date maxValueTime;
  protected Double maxValueDecimal;
  protected Integer maxValueInteger;
  protected Integer maxValueUnsignedInt;
  protected Quantity maxValueQuantity;
  protected Integer maxLength;
  protected String[] condition;
  protected ElementDefinitionConstraint[] constraint;
  protected Boolean mustSupport;
  protected Boolean isModifier;
  protected Boolean isModifierReason;
  protected Boolean isSummary;
  protected ElementDefinitionBinding binding;
  protected ElementDefinitionMapping[] mapping;
  
  public ElementDefinition()
  {
  }

  public String getPath() {
    return path;
  }

  public String[] getRepresentation() {
    return representation;
  }

  public String getSliceName() {
    return sliceName;
  }

  public Boolean getSliceIsConstraining() {
    return sliceIsConstraining;
  }

  public String getLabel() {
    return label;
  }

  public Coding[] getCode() {
    return code;
  }

  public ElementDefinitionSlicing getSlicing() {
    return slicing;
  }

  public String getShort_() {
    return short_;
  }

  public String getDefinition() {
    return definition;
  }

  public String getComment() {
    return comment;
  }

  public String getRequirements() {
    return requirements;
  }

  public String[] getAlias() {
    return alias;
  }

  public Integer getMin() {
    return min;
  }

  public String getMax() {
    return max;
  }

  public ElementDefinitionBase getBase() {
    return base;
  }

  public String getContentReference() {
    return contentReference;
  }

  public ElementDefinitionType[] getType() {
    return type;
  }

  public String getDefaultValue() {
    return defaultValue;
  }

  public String getMeaningWhenMissing() {
    return meaningWhenMissing;
  }

  public String getOrderMeaning() {
    return orderMeaning;
  }

  public String getFixed() {
    return fixed;
  }

  public String getPattern() {
    return pattern;
  }

  public ElementDefinitionExample[] getExample() {
    return example;
  }

  public Date getMinValueDate() {
    return minValueDate;
  }

  public Date getMinValueDateTime() {
    return minValueDateTime;
  }

  public Date getMinValueInstant() {
    return minValueInstant;
  }

  public Date getMinValueTime() {
    return minValueTime;
  }

  public Double getMinValueDecimal() {
    return minValueDecimal;
  }

  public Integer getMinValueInteger() {
    return minValueInteger;
  }

  public Integer getMinValueUnsignedInt() {
    return minValueUnsignedInt;
  }

  public Quantity getMinValueQuantity() {
    return minValueQuantity;
  }

  public Date getMaxValueDate() {
    return maxValueDate;
  }

  public Date getMaxValueDateTime() {
    return maxValueDateTime;
  }

  public Date getMaxValueInstant() {
    return maxValueInstant;
  }

  public Date getMaxValueTime() {
    return maxValueTime;
  }

  public Double getMaxValueDecimal() {
    return maxValueDecimal;
  }

  public Integer getMaxValueInteger() {
    return maxValueInteger;
  }

  public Integer getMaxValueUnsignedInt() {
    return maxValueUnsignedInt;
  }

  public Quantity getMaxValueQuantity() {
    return maxValueQuantity;
  }

  public Integer getMaxLength() {
    return maxLength;
  }

  public String[] getCondition() {
    return condition;
  }

  public ElementDefinitionConstraint[] getConstraint() {
    return constraint;
  }

  public Boolean getMustSupport() {
    return mustSupport;
  }

  public Boolean getIsModifier() {
    return isModifier;
  }

  public Boolean getIsModifierReason() {
    return isModifierReason;
  }

  public Boolean getIsSummary() {
    return isSummary;
  }

  public ElementDefinitionBinding getBinding() {
    return binding;
  }

  public ElementDefinitionMapping[] getMapping() {
    return mapping;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public void setRepresentation(String[] representation) {
    this.representation = representation;
  }

  public void setSliceName(String sliceName) {
    this.sliceName = sliceName;
  }

  public void setSliceIsConstraining(Boolean sliceIsConstraining) {
    this.sliceIsConstraining = sliceIsConstraining;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public void setCode(Coding[] code) {
    this.code = code;
  }

  public void setSlicing(ElementDefinitionSlicing slicing) {
    this.slicing = slicing;
  }

  public void setShort_(String short_) {
    this.short_ = short_;
  }

  public void setDefinition(String definition) {
    this.definition = definition;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public void setRequirements(String requirements) {
    this.requirements = requirements;
  }

  public void setAlias(String[] alias) {
    this.alias = alias;
  }

  public void setMin(Integer min) {
    this.min = min;
  }

  public void setMax(String max) {
    this.max = max;
  }

  public void setBase(ElementDefinitionBase base) {
    this.base = base;
  }

  public void setContentReference(String contentReference) {
    this.contentReference = contentReference;
  }

  public void setType(ElementDefinitionType[] type) {
    this.type = type;
  }

  public void setDefaultValue(String defaultValue) {
    this.defaultValue = defaultValue;
  }

  public void setMeaningWhenMissing(String meaningWhenMissing) {
    this.meaningWhenMissing = meaningWhenMissing;
  }

  public void setOrderMeaning(String orderMeaning) {
    this.orderMeaning = orderMeaning;
  }

  public void setFixed(String fixed) {
    this.fixed = fixed;
  }

  public void setPattern(String pattern) {
    this.pattern = pattern;
  }

  public void setExample(ElementDefinitionExample[] example) {
    this.example = example;
  }

  public void setMinValueDate(Date minValueDate) {
    this.minValueDate = minValueDate;
  }

  public void setMinValueDateTime(Date minValueDateTime) {
    this.minValueDateTime = minValueDateTime;
  }

  public void setMinValueInstant(Date minValueInstant) {
    this.minValueInstant = minValueInstant;
  }

  public void setMinValueTime(Date minValueTime) {
    this.minValueTime = minValueTime;
  }

  public void setMinValueDecimal(Double minValueDecimal) {
    this.minValueDecimal = minValueDecimal;
  }

  public void setMinValueInteger(Integer minValueInteger) {
    this.minValueInteger = minValueInteger;
  }

  public void setMinValueUnsignedInt(Integer minValueUnsignedInt) {
    this.minValueUnsignedInt = minValueUnsignedInt;
  }

  public void setMinValueQuantity(Quantity minValueQuantity) {
    this.minValueQuantity = minValueQuantity;
  }

  public void setMaxValueDate(Date maxValueDate) {
    this.maxValueDate = maxValueDate;
  }

  public void setMaxValueDateTime(Date maxValueDateTime) {
    this.maxValueDateTime = maxValueDateTime;
  }

  public void setMaxValueInstant(Date maxValueInstant) {
    this.maxValueInstant = maxValueInstant;
  }

  public void setMaxValueTime(Date maxValueTime) {
    this.maxValueTime = maxValueTime;
  }

  public void setMaxValueDecimal(Double maxValueDecimal) {
    this.maxValueDecimal = maxValueDecimal;
  }

  public void setMaxValueInteger(Integer maxValueInteger) {
    this.maxValueInteger = maxValueInteger;
  }

  public void setMaxValueUnsignedInt(Integer maxValueUnsignedInt) {
    this.maxValueUnsignedInt = maxValueUnsignedInt;
  }

  public void setMaxValueQuantity(Quantity maxValueQuantity) {
    this.maxValueQuantity = maxValueQuantity;
  }

  public void setMaxLength(Integer maxLength) {
    this.maxLength = maxLength;
  }

  public void setCondition(String[] condition) {
    this.condition = condition;
  }

  public void setConstraint(ElementDefinitionConstraint[] constraint) {
    this.constraint = constraint;
  }

  public void setMustSupport(Boolean mustSupport) {
    this.mustSupport = mustSupport;
  }

  public void setIsModifier(Boolean isModifier) {
    this.isModifier = isModifier;
  }

  public void setIsModifierReason(Boolean isModifierReason) {
    this.isModifierReason = isModifierReason;
  }

  public void setIsSummary(Boolean isSummary) {
    this.isSummary = isSummary;
  }

  public void setBinding(ElementDefinitionBinding binding) {
    this.binding = binding;
  }

  public void setMapping(ElementDefinitionMapping[] mapping) {
    this.mapping = mapping;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object instanceof ElementDefinition) {
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
    return "ElementDefinition(" + id + ")";
  }
}
