package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 * 
 * A search parameter that defines a named search item that can be used to search/filter on a resource.
 *
 * @see <a href="https://www.hl7.org/fhir/searchparameter.html">SearchParameter</a>
 */
public 
class SearchParameter extends DomainResource implements Serializable 
{
  private static final long serialVersionUID = 4959050674111603763L;
  
  protected String url;
  protected String version;
  protected String name;
  protected String derivedFrom;
  protected String status;
  protected Boolean experimental;
  protected Date date;
  protected String publisher;
  protected ContactDetail[] contact;
  protected String description;
  protected UsageContext[] useContext;
  protected CodeableConcept[] jurisdiction;
  protected String purpose;
  protected String code;
  protected String[] base;
  protected String type;
  protected String expression;
  protected String xpath;
  protected String xpathUsage;
  protected String[] target;
  protected Boolean multipleOr;
  protected Boolean multipleAnd;
  protected String[] comparator; // eq | ne | gt | lt | ge | le | sa | eb | ap
  protected String[] modifier;   // missing | exact | contains | not | text | in | not-in | below | above | type | identifier | ofType
  protected String[] chain;
  protected SearchParameterComponent[] component;
  
  public SearchParameter()
  {
    this.resourceType = "SearchParameter";
  }
  
  public String getUrl() {
    return url;
  }

  public String getVersion() {
    return version;
  }

  public String getName() {
    return name;
  }

  public String getDerivedFrom() {
    return derivedFrom;
  }

  public String getStatus() {
    return status;
  }

  public Boolean getExperimental() {
    return experimental;
  }

  public Date getDate() {
    return date;
  }

  public String getPublisher() {
    return publisher;
  }

  public ContactDetail[] getContact() {
    return contact;
  }

  public String getDescription() {
    return description;
  }

  public UsageContext[] getUseContext() {
    return useContext;
  }

  public CodeableConcept[] getJurisdiction() {
    return jurisdiction;
  }

  public String getPurpose() {
    return purpose;
  }

  public String getCode() {
    return code;
  }

  public String[] getBase() {
    return base;
  }

  public String getType() {
    return type;
  }

  public String getExpression() {
    return expression;
  }

  public String getXpath() {
    return xpath;
  }

  public String getXpathUsage() {
    return xpathUsage;
  }

  public String[] getTarget() {
    return target;
  }

  public Boolean getMultipleOr() {
    return multipleOr;
  }

  public Boolean getMultipleAnd() {
    return multipleAnd;
  }

  public String[] getComparator() {
    return comparator;
  }

  public String[] getModifier() {
    return modifier;
  }

  public String[] getChain() {
    return chain;
  }

  public SearchParameterComponent[] getComponent() {
    return component;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setDerivedFrom(String derivedFrom) {
    this.derivedFrom = derivedFrom;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public void setExperimental(Boolean experimental) {
    this.experimental = experimental;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public void setPublisher(String publisher) {
    this.publisher = publisher;
  }

  public void setContact(ContactDetail[] contact) {
    this.contact = contact;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public void setUseContext(UsageContext[] useContext) {
    this.useContext = useContext;
  }

  public void setJurisdiction(CodeableConcept[] jurisdiction) {
    this.jurisdiction = jurisdiction;
  }

  public void setPurpose(String purpose) {
    this.purpose = purpose;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public void setBase(String[] base) {
    this.base = base;
  }

  public void setType(String type) {
    this.type = type;
  }

  public void setExpression(String expression) {
    this.expression = expression;
  }

  public void setXpath(String xpath) {
    this.xpath = xpath;
  }

  public void setXpathUsage(String xpathUsage) {
    this.xpathUsage = xpathUsage;
  }

  public void setTarget(String[] target) {
    this.target = target;
  }

  public void setMultipleOr(Boolean multipleOr) {
    this.multipleOr = multipleOr;
  }

  public void setMultipleAnd(Boolean multipleAnd) {
    this.multipleAnd = multipleAnd;
  }

  public void setComparator(String[] comparator) {
    this.comparator = comparator;
  }

  public void setModifier(String[] modifier) {
    this.modifier = modifier;
  }

  public void setChain(String[] chain) {
    this.chain = chain;
  }

  public void setComponent(SearchParameterComponent[] component) {
    this.component = component;
  }

  @Override
  public boolean equals(Object object) {
    if(object instanceof SearchParameter) {
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
    return "SearchParameter(" + id + "," + name + ")";
  }
}
