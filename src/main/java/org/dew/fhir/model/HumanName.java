package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * A name of a human with text, parts and usage information.
 *
 * @see <a href="https://www.hl7.org/fhir/datatypes.html#HumanName">HumanName</a>
 */
public 
class HumanName extends Element implements Serializable
{
  private static final long serialVersionUID = -4680725942501770488L;
  
  protected String use;
  protected String text;
  protected String family;
  protected String[] given;
  protected String[] prefix;
  protected String[] suffix;
  protected Period period;
  
  public HumanName()
  {
  }
  
  public HumanName(String family, String given)
  {
    this.family = family;
    if(given != null) {
      this.given = new String[] { given };
    }
  }
  
  public String getUse() {
    return use;
  }

  public String getText() {
    return text;
  }

  public String getFamily() {
    return family;
  }

  public String[] getGiven() {
    return given;
  }

  public String[] getPrefix() {
    return prefix;
  }

  public String[] getSuffix() {
    return suffix;
  }

  public Period getPeriod() {
    return period;
  }

  public void setUse(String use) {
    this.use = use;
  }

  public void setText(String text) {
    this.text = text;
  }

  public void setFamily(String family) {
    this.family = family;
  }

  public void setGiven(String[] given) {
    this.given = given;
  }

  public void setPrefix(String[] prefix) {
    this.prefix = prefix;
  }

  public void setSuffix(String[] suffix) {
    this.suffix = suffix;
  }

  public void setPeriod(Period period) {
    this.period = period;
  }

  @Override
  public boolean equals(Object object) {
    if(object instanceof HumanName) {
      return this.hashCode() == object.hashCode();
    }
    return false;
  }
  
  @Override
  public int hashCode() {
    String given0 = (given != null && given.length > 0) ? given[0] : null;
    return (family + ":" + given0).hashCode();
  }
  
  @Override
  public String toString() {
    String given0 = null;
    if(given != null && given.length > 0) {
      given0 = given[0];
    }
    return "HumanName(" + id + "," + use + "," + family + "," + given0 + "," + text + ")";
  }
}
