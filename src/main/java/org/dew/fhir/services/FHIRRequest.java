package org.dew.fhir.services;

import java.io.Serializable;

import java.security.Principal;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.dew.fhir.model.Resource;
import org.dew.fhir.util.FUtil;

/**
 * 
 * FHIR Service Request.
 *
 */
public 
class FHIRRequest implements Serializable
{
  private static final long serialVersionUID = -1893986457430276781L;
  
  protected String id;
  protected String vid;
  protected Resource resource;
  protected String base;
  protected String format;
  protected boolean pretty;
  protected String summary;
  protected List<String> elements;
  // Extension
  protected String type;
  protected boolean history;
  protected String include;
  protected String revinclude;
  protected Map<String, Object> parameters = new HashMap<String, Object>();
  // Security
  protected Principal principal;
  
  public FHIRRequest()
  {
  }
  
  public FHIRRequest(String id)
  {
    this.id = id;
  }

  public FHIRRequest(String id, String vid)
  {
    this.id = id;
    this.vid = vid;
  }

  public FHIRRequest(String type, String id, String vid)
  {
    this.type = type;
    this.id = id;
    this.vid = vid;
  }

  public FHIRRequest(Resource resource)
  {
    this.resource = resource;
  }

  public FHIRRequest(String format, boolean pretty)
  {
    this.format = format;
    this.pretty = pretty;
  }

  public FHIRRequest(String format, boolean pretty, String summary)
  {
    this.format = format;
    this.pretty = pretty;
    this.summary = summary;
  }

  public FHIRRequest(String format, boolean pretty, List<String> elements)
  {
    this.format = format;
    this.pretty = pretty;
    this.elements = elements;
  }
  
  public FHIRRequest(List<String> elements)
  {
    this.elements = elements;
  }
  
  public FHIRRequest(String format, List<String> elements)
  {
    this.format = format;
    this.elements = elements;
  }

  public String getId() {
    return id;
  }

  public String getVid() {
    return vid;
  }

  public Resource getResource() {
    return resource;
  }

  public String getBase() {
    return base;
  }

  public String getFormat() {
    return format;
  }

  public boolean isPretty() {
    return pretty;
  }

  public String getSummary() {
    return summary;
  }

  public List<String> getElements() {
    return elements;
  }

  public String getType() {
    return type;
  }

  public boolean isHistory() {
    return history;
  }

  public String getInclude() {
    return include;
  }

  public String getRevinclude() {
    return revinclude;
  }

  public Map<String, Object> getParameters() {
    return parameters();
  }

  public Principal getPrincipal() {
    return principal;
  }

  public void setId(String id) {
    this.id = id;
  }

  public void setVid(String vid) {
    this.vid = vid;
  }

  public void setResource(Resource resource) {
    this.resource = resource;
  }

  public void setBase(String base) {
    this.base = base;
  }

  public void setFormat(String format) {
    this.format = format;
  }

  public void setPretty(boolean pretty) {
    this.pretty = pretty;
  }

  public void setSummary(String summary) {
    this.summary = summary;
  }

  public void setElements(List<String> elements) {
    this.elements = elements;
  }

  public void setType(String type) {
    this.type = type;
  }

  public void setHistory(boolean history) {
    this.history = history;
  }

  public void setInclude(String include) {
    this.include = include;
  }

  public void setRevinclude(String revinclude) {
    this.revinclude = revinclude;
  }

  public void setParameters(Map<String, Object> parameters) {
    this.parameters = parameters;
    this.parameters();
  }

  public void setPrincipal(Principal principal) {
    this.principal = principal;
  }
  
  // Utils
  
  public boolean isSearch() {
    if(id == null || id.length() == 0) {
      return true;
    }
    return false;
  }
  
  public FHIRRequest search() {
    this.id = null;
    return this;
  }
  
  public FHIRRequest base(String base) {
    this.base = base;
    return this;
  }
  
  public FHIRRequest type(String type) {
    this.type = type;
    return this;
  }
  
  public FHIRRequest id(String id) {
    this.id = id;
    return this;
  }
  
  // Search parameters
  
  public FHIRRequest _id(String val) {
    parameters.put("_id", val);
    return this;
  }
  
  public FHIRRequest _lastUpdated(Object val) {
    parameters.put("_lastUpdated", FUtil.formatDate(val, "-"));
    return this;
  }
  
  public FHIRRequest _lastUpdated(String operator, Object val) {
    if(operator == null) operator = "";
    parameters.put("_lastUpdated", operator + FUtil.formatDate(val, "-"));
    return this;
  }
  
  public FHIRRequest _tag(String val) {
    parameters.put("_tag", val);
    return this;
  }

  public FHIRRequest _profile(String val) {
    parameters.put("_profile", val);
    return this;
  }
  
  public FHIRRequest _security(String val) {
    parameters.put("_security", val);
    return this;
  }
  
  public FHIRRequest _text(String val) {
    parameters.put("_text", val);
    return this;
  }
  
  public FHIRRequest _content(String val) {
    parameters.put("_content", val);
    return this;
  }
  
  public FHIRRequest _list(String val) {
    parameters.put("_list", val);
    return this;
  }
  
  public FHIRRequest _has(String val) {
    parameters.put("_text", val);
    return this;
  }
  
  public FHIRRequest _type(String val) {
    parameters.put("_type", val);
    return this;
  }
  
  public FHIRRequest _query(String val) {
    if(parameters == null) {
      parameters = new HashMap<String, Object>();
    }
    parameters.put("_query", val);
    return this;
  }
  
  public FHIRRequest _filter(String val) {
    if(parameters == null) {
      parameters = new HashMap<String, Object>();
    }
    parameters.put("_filter", val);
    return this;
  }
  
  public FHIRRequest vid(String vid) {
    this.vid = vid;
    return this;
  }
  
  public FHIRRequest format(String format) {
    return this;
  }

  public FHIRRequest summary(String summary) {
    this.summary = summary;
    return this;
  }
  
  public FHIRRequest history() {
    this.history = true;
    return this;
  }

  public FHIRRequest history(boolean history) {
    this.history = history;
    return this;
  }
  
  public FHIRRequest pretty() {
    this.pretty = true;
    return this;
  }

  public FHIRRequest pretty(boolean pretty) {
    this.pretty = pretty;
    return this;
  }

  public FHIRRequest resource(Resource resource) {
    this.resource = resource;
    return this;
  }
  
  public FHIRRequest clear() {
    id = null;
    vid = null;
    // base = null;
    resource = null;
    format = null;
    pretty = false;
    summary = null;
    elements = null;
    type = null;
    history = false;
    include = null;
    revinclude = null;
    if(parameters != null) {
      parameters.clear();
    }
    else {
      parameters = new HashMap<String, Object>();
    }
    return this;
  }
  
  public
  Map<String, Object> parameters()
  {
    if(parameters == null) {
      parameters = new HashMap<String, Object>();
    }
    if(id != null && id.length() > 0) {
      parameters.put("id", id);
    }
    if(vid != null && vid.length() > 0) {
      parameters.put("vid", vid);
    }
    if(format != null && format.length() > 0) {
      parameters.put("_format", format);
    }
    if(summary != null && summary.length() > 0) {
      parameters.put("_summary", summary);
    }
    if(pretty) {
      parameters.put("_pretty", String.valueOf(pretty));
    }
    if(elements != null && elements.size() > 0) {
      parameters.put("_elements", elements);
    }
    if(include != null && include.length() > 0) {
      parameters.put("_include", include);
    }
    if(revinclude != null && revinclude.length() > 0) {
      parameters.put("_revinclude", revinclude);
    }
    // No type, resource, etc.
    return parameters;
  }
  
  public FHIRRequest put(String name, Object value) {
    if(name == null || name.length() == 0) {
      return this;
    }
    if(this.parameters == null) {
      this.parameters = new HashMap<String, Object>();
    }
    this.parameters.put(name, value);
    return this;
  }
  
  public FHIRRequest add(String name, String value) {
    if(name == null || name.length() == 0) {
      return this;
    }
    
    if(name.equals("_type") || name.equals("type")) {
      this.type = value;
      return this;
    }
    
    if(name.equals("id")) {
      this.id = value;
    }
    else if(name.equals("vid")) {
      this.vid = value;
    }
    else if(name.equals("_format") || name.equals("format")) {
      this.format = value;
    }
    else if(name.equals("_pretty") || name.equals("pretty")) {
      this.pretty = FUtil.toBoolean(value, false);
    }
    else if(name.equals("_summary") || name.equals("summary")) {
      this.summary = value;
    }
    else if(name.equals("_elements") || name.equals("elements")) {
      this.elements = FUtil.toListOfString(value);
    }
    else if(name.equals("_include") || name.equals("include")) {
      this.include = value;
    }
    else if(name.equals("_revinclude") || name.equals("revinclude")) {
      this.revinclude = value;
    }
    
    if(this.parameters == null) {
      this.parameters = new HashMap<String, Object>();
    }
    this.parameters.put(name, value);
    return this;
  }
  
  public FHIRRequest add(String name, String modifier, String value) {
    if(modifier == null || modifier.length() == 0) {
      return add(name, value);
    }
    return add(name + ":" + modifier, value);
  }
  
  public FHIRRequest not(String name, String value) {
    return add(name, "not", value);
  }
  
  public FHIRRequest exact(String name, String value) {
    return add(name, "exact", value);
  }
  
  public FHIRRequest contains(String name, String value) {
    return add(name, "contains", value);
  }
  
  public FHIRRequest missing(String name, boolean value) {
    return add(name, "contains", String.valueOf(value));
  }
  
  public Object val(String name) {
    if(name == null || name.length() == 0) {
      return null;
    }
    
    Object result = null;
    if(this.parameters != null) {
      result = this.parameters.get(name);
      if(result != null) return result;
    }
    
    if(name.equals("id")) {
      return this.id;
    }
    else if(name.equals("vid")) {
      return this.vid;
    }
    else if(name.equals("type")) {
      return this.type;
    }
    else if(name.equals("_format") || name.equals("format")) {
      return this.format;
    }
    else if(name.equals("_pretty") || name.equals("pretty")) {
      return this.pretty;
    }
    else if(name.equals("_summary") || name.equals("summary")) {
      return this.summary;
    }
    else if(name.equals("_elements") || name.equals("elements")) {
      return this.elements;
    }
    else if(name.equals("_include") || name.equals("include")) {
      return this.include;
    }
    else if(name.equals("_revinclude") || name.equals("revinclude")) {
      return this.revinclude;
    }
    
    return null;
  }
  
  public Object val(String name, Object defaultValue) {
    Object result = val(name);
    if(result == null) {
      return defaultValue;
    }
    return result;
  }
  
  public boolean check(String name) {
    if(name == null || name.length() == 0) {
      return false;
    }
    if(this.parameters == null) return false;
    Object val = this.parameters.get(name);
    if(val == null) return false;
    if(val instanceof String) {
      if(((String) val).length() == 0) {
        return false;
      }
    }
    return true;
  }

  public String strVal(String name) {
    return FUtil.toString(val(name), null);
  }
  
  public String strVal(String name, String defaultValue) {
    return FUtil.toString(val(name), defaultValue);
  }

  public int intVal(String name) {
    return FUtil.toInt(val(name), 0);
  }
  
  public int intVal(String name, int defaultValue) {
    return FUtil.toInt(val(name), defaultValue);
  }
  
  public double doubleVal(String name) {
    return FUtil.toDouble(val(name), 0);
  }
  
  public double doubleVal(String name, double defaultValue) {
    return FUtil.toDouble(val(name), defaultValue);
  }
  
  public boolean boolVal(String name) {
    return FUtil.toBoolean(val(name), false);
  }
  
  public boolean boolVal(String name, boolean defaultValue) {
    return FUtil.toBoolean(val(name), defaultValue);
  }
  
  public Date dateVal(String name) {
    return FUtil.toDate(val(name), false);
  }
  
  public Date dateVal(String name, Object defaultValue) {
    return FUtil.toDate(val(name), defaultValue);
  }
  
  public Calendar calVal(String name) {
    return FUtil.toCalendar(val(name), false);
  }
  
  public Calendar calVal(String name, Object defaultValue) {
    return FUtil.toCalendar(val(name), defaultValue);
  }
  
  public List<String> listVal(String name) {
    return FUtil.toListOfString(val(name));
  }

  @Override
  public boolean equals(Object object) {
    if(object instanceof FHIRRequest) {
      return this.hashCode() == object.hashCode();
    }
    return false;
  }
  
  @Override
  public int hashCode() {
    return toString().hashCode();
  }
  
  @Override
  public String toString() {
    return "FHIRRequest(" + id + "," + vid + "," + resource + "," + base + "," + format + "," + pretty + "," + summary + "," + elements + "," + parameters + ")";
  }
}
