# WFHIR

A simple HL7&copy; FHIR&copy; implementation.
The project is in a preliminary phase, therefore the implementation is incomplete and not sufficiently tested.

## Example

```java
import org.dew.fhir.model.*;
import org.dew.fhir.util.FHIRUtil;

Organization res = new Organization("120201000", "http://hl7.it/sid/fls", "120201", "ASL ROMA 1");
  
String json = FHIRUtil.serialize(res, "application/fhir+json");
  
String xml  = FHIRUtil.serialize(res, "application/fhir+xml");
  
Organization o1 = FHIRUtil.deserialize(json, Organization.class);
  
Organization o2 = FHIRUtil.deserialize(xml, Organization.class);
```

## Build

- `git clone https://github.com/giosil/wfhir.git`
- `mvn clean install`

## Contributors

* [Giorgio Silvestris](https://github.com/giosil)
