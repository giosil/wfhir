package org.dew.fhir.model;

import java.io.Serializable;

import java.util.Date;

/**
 * 
 * A Signature holds an electronic representation of a signature and its supporting context in a FHIR accessible form.
 *
 * @see <a href="https://www.hl7.org/fhir/datatypes.html#Signature">Signature</a>
 */
public 
class Signature extends Element implements Serializable
{
  private static final long serialVersionUID = 2439835231724290521L;
  
  protected Coding type;
  protected Date when;
  protected Reference<Resource> who;
  protected Reference<Resource> onBehalfOf;
  protected String targetFormat;
  protected String sigFormat;
  protected String data;
  
  public Signature()
  {
  }

  public Coding getType() {
    return type;
  }

  public Date getWhen() {
    return when;
  }

  public Reference<Resource> getWho() {
    return who;
  }

  public Reference<Resource> getOnBehalfOf() {
    return onBehalfOf;
  }

  public String getTargetFormat() {
    return targetFormat;
  }

  public String getSigFormat() {
    return sigFormat;
  }

  public String getData() {
    return data;
  }

  public void setType(Coding type) {
    this.type = type;
  }

  public void setWhen(Date when) {
    this.when = when;
  }

  public void setWho(Reference<Resource> who) {
    this.who = who;
  }

  public void setOnBehalfOf(Reference<Resource> onBehalfOf) {
    this.onBehalfOf = onBehalfOf;
  }

  public void setTargetFormat(String targetFormat) {
    this.targetFormat = targetFormat;
  }

  public void setSigFormat(String sigFormat) {
    this.sigFormat = sigFormat;
  }

  public void setData(String data) {
    this.data = data;
  }

  @Override
  public boolean equals(Object object) {
    if(object instanceof Signature) {
      return this.hashCode() == object.hashCode();
    }
    return false;
  }
  
  @Override
  public int hashCode() {
    if(data == null) return 0;
    return data.hashCode();
  }
  
  @Override
  public String toString() {
    if(data == null) {
      return "Signature(" + id + "," + targetFormat + ",null)";
    }
    return "Signature(" + id + "," + targetFormat + ",[" + data.length() + "])";
  }
}
