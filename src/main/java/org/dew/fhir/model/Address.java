package org.dew.fhir.model;

import java.io.Serializable;

/**
 * 
 * An address expressed using postal conventions (as opposed to GPS or other location definition formats). 
 * This data type may be used to convey addresses for use in delivering mail as well as for visiting locations which might not be valid for mail delivery. 
 * There are a variety of postal address formats defined around the world.
 * 
 * @see <a href="https://www.hl7.org/fhir/datatypes.html#Address">Address</a>
 */
public 
class Address extends Element implements Serializable
{
  private static final long serialVersionUID = -2619901739393453824L;
  
  protected String use;
  protected String type;
  protected String text;
  protected String[] line;
  protected String city;
  protected String district;
  protected String state;
  protected String postalCode;
  protected String country;
  protected Period period;
  // extra
  protected Element _city;
  protected Element _state;
  
  public Address()
  {
  }
  
  public Address(String line, String city)
  {
    if(line != null) {
      this.line = new String[] { line };
    }
    this.city = city;
  }
  
  public Address(String line, String city, String district)
  {
    if(line != null) {
      this.line = new String[] { line };
    }
    this.city = city;
    this.district = district;
  }
  
  public Address(String line, String city, String district, String state, String postalCode, String country)
  {
    if(line != null) {
      this.line = new String[] { line };
    }
    this.city = city;
    this.district = district;
    this.state = state;
    this.postalCode = postalCode;
    this.country = country;
  }
  
  public String getUse() {
    return use;
  }

  public String getType() {
    return type;
  }

  public String getText() {
    return text;
  }

  public String[] getLine() {
    return line;
  }

  public String getCity() {
    return city;
  }

  public String getDistrict() {
    return district;
  }

  public String getState() {
    return state;
  }

  public String getPostalCode() {
    return postalCode;
  }

  public String getCountry() {
    return country;
  }

  public Period getPeriod() {
    return period;
  }

  public Element get_city() {
    return _city;
  }

  public Element get_state() {
    return _state;
  }

  public void setUse(String use) {
    this.use = use;
  }

  public void setType(String type) {
    this.type = type;
  }

  public void setText(String text) {
    this.text = text;
  }

  public void setLine(String[] line) {
    this.line = line;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public void setDistrict(String district) {
    this.district = district;
  }

  public void setState(String state) {
    this.state = state;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public void setPeriod(Period period) {
    this.period = period;
  }

  public void set_city(Element _city) {
    this._city = _city;
  }

  public void set_state(Element _state) {
    this._state = _state;
  }

  @Override
  public boolean equals(Object object) {
    if(object instanceof Address) {
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
    return "Address(" + id + "," + use + "," + type + "," + text + ")";
  }
}
