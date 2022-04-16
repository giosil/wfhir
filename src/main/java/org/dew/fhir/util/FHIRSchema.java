package org.dew.fhir.util;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.lang.reflect.Method;
import java.net.URL;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.dew.fhir.json.JSON;

public 
class FHIRSchema 
{
  public static final String SCHEMA_JSON = "fhir.schema.json";
  
  public static final String MODEL_PACKAGE = "org.dew.fhir.model";
  
  public static final String[] ALL_RESOURCES = {
      "Account","ActivityDefinition","AdverseEvent","AllergyIntolerance","Appointment","AppointmentResponse", "AuditEvent","Basic","Binary",
      "BiologicallyDerivedProduct","BodyStructure","Bundle","CapabilityStatement","CarePlan","CareTeam","CatalogEntry", "ChargeItem",
      "ChargeItemDefinition","Claim","ClaimResponse","ClinicalImpression","CodeSystem","Communication","CommunicationRequest",
      "CompartmentDefinition","Composition","ConceptMap","Condition","Consent","Contract","Coverage","CoverageEligibilityRequest",
      "CoverageEligibilityResponse","DetectedIssue","Device","DeviceDefinition","DeviceMetric","DeviceRequest","DeviceUseStatement",
      "DiagnosticReport","DocumentManifest","DocumentReference","EffectEvidenceSynthesis","Encounter","Endpoint","EnrollmentRequest",
      "EnrollmentResponse","EpisodeOfCare","EventDefinition","Evidence","EvidenceVariable","ExampleScenario","ExplanationOfBenefit",
      "FamilyMemberHistory","Flag","Goal","GraphDefinition","Group","GuidanceResponse","HealthcareService","ImagingStudy","Immunization",
      "ImmunizationEvaluation","ImmunizationRecommendation","ImplementationGuide","InsurancePlan","Invoice","Library","Linkage","List",
      "Location","Measure","MeasureReport","Media","Medication","MedicationAdministration","MedicationDispense","MedicationKnowledge",
      "MedicationRequest","MedicationStatement","MedicinalProduct","MedicinalProductAuthorization","MedicinalProductContraindication",
      "MedicinalProductIndication","MedicinalProductIngredient","MedicinalProductInteraction","MedicinalProductManufactured","MedicinalProductPackaged",
      "MedicinalProductPharmaceutical","MedicinalProductUndesirableEffect","MessageDefinition","MessageHeader","MolecularSequence","NamingSystem",
      "NutritionOrder","Observation","ObservationDefinition","OperationDefinition","OperationOutcome","Organization","OrganizationAffiliation",
      "Parameters","Patient","PaymentNotice","PaymentReconciliation","Person","PlanDefinition","Practitioner","PractitionerRole","Procedure",
      "Provenance","Questionnaire","QuestionnaireResponse","RelatedPerson","RequestGroup","ResearchDefinition","ResearchElementDefinition",
      "ResearchStudy","ResearchSubject","RiskAssessment","RiskEvidenceSynthesis","Schedule","SearchParameter","ServiceRequest","Slot",
      "Specimen","SpecimenDefinition","StructureDefinition","StructureMap","Subscription","Substance","SubstanceNucleicAcid","SubstancePolymer",
      "SubstanceProtein","SubstanceReferenceInformation","SubstanceSourceMaterial","SubstanceSpecification","SupplyDelivery","SupplyRequest",
      "Task","TerminologyCapabilities","TestReport","TestScript","ValueSet","VerificationResult","VisionPrescription"};
  //                                          DomainResource                                         Resource
  public static final String[] BASE_FIELDS = {"text", "contained", "extension", "modifierExtension", "id", "meta", "implicitRules", "language", "resourceType"};

  public static final String[] KEYWORDS = {"class", "abstract", "for", "import", "extends", "assert"};
  
  protected Map<String, Object> schema;
  
  public FHIRSchema()
  {
    schema = loadSchema();
  }
  
  public 
  Map<String, Object> getSchema()
  {
    return schema;
  }
  
  public 
  List<String> getAllResources()
  {
    List<String> listResult = new ArrayList<String>(ALL_RESOURCES.length);
    for(int i = 0; i < ALL_RESOURCES.length; i++) {
      listResult.add(ALL_RESOURCES[i]);
    }
    return listResult;
  }
  
  public 
  List<String> getMissingResources()
  {
    List<String> listResult = new ArrayList<String>();
    for(int i = 0; i < ALL_RESOURCES.length; i++) {
      String resourceName = ALL_RESOURCES[i];
      try {
        Class.forName(MODEL_PACKAGE + "." + normalizeClassName(resourceName));
      }
      catch(Exception ex) {
        listResult.add(resourceName);
      }
    }
    return listResult;
  }
  
  public 
  List<String> getBackboneElements()
  {
    List<String> listResult = new ArrayList<String>();
    for(int i = 0; i < ALL_RESOURCES.length; i++) {
      String objectName = ALL_RESOURCES[i];
      List<String> fields = getFields(objectName);
      if(fields == null || fields.size() == 0) continue;
      for(int j = 0; j < fields.size(); j++) {
        String field    = fields.get(j);
        getType(objectName, field, listResult);
      }
    }
    return listResult;
  }
  
  public 
  List<String> getBackboneElements(String objectName)
  {
    List<String> listResult = new ArrayList<String>();
    if(objectName == null || objectName.length() == 0) {
      return listResult;
    }
    List<String> fields = getFields(objectName);
    if(fields == null || fields.size() == 0) {
      return listResult;
    }
    for(int j = 0; j < fields.size(); j++) {
      String field    = fields.get(j);
      getType(objectName, field, listResult);
    }
    return listResult;
  }
  
  public static
  Class<?> getClassOf(String objectName)
  {
    if(objectName == null || objectName.length() == 0) {
      return null;
    }
    try {
      Class<?> objectClass = Class.forName(MODEL_PACKAGE + "." + normalizeClassName(objectName));
      return objectClass;
    }
    catch(Exception ex) {
    }
    return null;
  }
  
  public static
  Method findGetMethod(Class<?> objectClass, String field)
  {
    if(objectClass == null || field == null) return null;
    String methodNameToFind = null;
    if(field.length() > 1) {
      methodNameToFind = "get" + field.substring(0, 1).toUpperCase() + field.substring(1);
    }
    else {
      methodNameToFind = "get" + field.toUpperCase();
    }
    Method[] methods = objectClass.getMethods();
    for(int k = 0; k < methods.length; k++) {
      Method method = methods[k];
      String methodName = method.getName();
      if(methodName.equals(methodNameToFind)) {
        return method;
      }
    }
    return null;
  }
  
  public static
  Method findSetMethod(Class<?> objectClass, String field)
  {
    if(objectClass == null || field == null) return null;
    String methodNameToFind = null;
    if(field.length() > 1) {
      methodNameToFind = "set" + field.substring(0, 1).toUpperCase() + field.substring(1);
    }
    else {
      methodNameToFind = "set" + field.toUpperCase();
    }
    Method[] methods = objectClass.getMethods();
    for(int k = 0; k < methods.length; k++) {
      Method method = methods[k];
      String methodName = method.getName();
      if(methodName.equals(methodNameToFind)) {
        return method;
      }
    }
    return null;
  }
  
  public
  String getClassType(String objectName, String field)
  {
    Class<?> objectClass = getClassOf(objectName);
    if(objectClass == null) return null;
    Method method = findGetMethod(objectClass, field);
    if(method == null) return null;
    Class<?> returnType = method.getReturnType();
    return returnType == null ? "void" : returnType.getCanonicalName();
  }
  
  public
  String getClassType(Class<?> objectClass, String field)
  {
    Method method = findGetMethod(objectClass, field);
    if(method == null) return null;
    Class<?> returnType = method.getReturnType();
    String result = returnType == null ? "void" : returnType.getCanonicalName();
    if(result.equals("int"))     return "java.lang.Integer";
    if(result.equals("double"))  return "java.lang.Double";
    if(result.equals("boolean")) return "java.lang.Boolean";
    return result;
  }
  
  public
  List<String> getFields(String objectName)
  {
    Map<String, Object> definitions = getMap(schema, "definitions");
    
    Map<String, Object> resourceDef = getMap(definitions, objectName);
    
    return getFields(resourceDef, "properties");
  }
  
  public
  String getDescription(String objectName, String defaultDescription)
  {
    Map<String, Object> definitions = getMap(schema, "definitions");
    
    Map<String, Object> resourceDef = getMap(definitions, objectName);
    
    Object description = resourceDef.get("description");
    
    String result = null;
    if(description instanceof String) {
      result = (String) description;
      result = result.replace('\n', ' ');
    }
    if(result == null || result.length() == 0) {
      return defaultDescription;
    }
    return result;
  }
  
  public
  String getType(String objectName, String fieldName)
  {
    return getType(objectName, fieldName, null);
  }
  
  public
  String getType(String objectName, String fieldName, List<String> backboneElements)
  {
    Map<String, Object> definitions = getMap(schema, "definitions");
    
    Map<String, Object> resourceDef = getMap(definitions, objectName);
    
    Map<String, Object> properties = getMap(resourceDef, "properties");
    
    if(fieldName.endsWith("_")) {
      fieldName = fieldName.substring(0, fieldName.length()-1);
    }
    
    Map<String, Object> fieldDef = getMap(properties, fieldName);
    
    String fhirType = "";
    
    Object type = fieldDef.get("type");
    if(type instanceof String) {
      fhirType = (String) type;
      
      if(fhirType.equals("array")) {
        String itemType = null;
        Map<String, Object> items = getMap(fieldDef, "items");
        Object ref = items.get("$ref");
        if(ref instanceof String) {
          itemType = (String) ref;
          if(itemType.length() > 0) {
            int sep = itemType.lastIndexOf('/');
            if(sep >= 0) {
              itemType = itemType.substring(sep + 1);
            }
          }
        }
        else {
          Object enumValues = items.get("enum");
          if(enumValues != null) {
            itemType = "string";
          }
        }
        
        if(itemType.indexOf('_') > 0) {
          if(backboneElements != null) {
            if(!backboneElements.contains(itemType)) {
              backboneElements.add(itemType);
            }
          }
        }
        
        return getClassName(itemType) + "[]";
      }
      
      if(fhirType.equals("string")) {
        Object pattern = fieldDef.get("pattern");
        if(pattern instanceof String) {
          String sPattern = (String) pattern;
          if(sPattern.startsWith("^([0")) {
            return "java.util.Date";
          }
        }
      }
      else if(fhirType.equals("number")) {
        if(fieldName.toLowerCase().indexOf("decimal") >= 0) {
          return "java.lang.Double";
        }
      }
    }
    else {
      Object ref = fieldDef.get("$ref");
      if(ref instanceof String) {
        fhirType = (String) ref;
        if(fhirType.length() > 0) {
          int sep = fhirType.lastIndexOf('/');
          if(sep >= 0) {
            fhirType = fhirType.substring(sep + 1);
          }
        }
      }
      else {
        Object enumValues = fieldDef.get("enum");
        if(enumValues != null) {
          fhirType = "string";
        }
      }
    }
    
    if(fhirType.indexOf('_') > 0) {
      if(backboneElements != null) {
        if(!backboneElements.contains(fhirType)) {
          backboneElements.add(fhirType);
        }
      }
    }
    
    return getClassName(fhirType);
  }
  
  public
  void buildJavaClasses(String folder, List<String> objectNames)
  {
    buildJavaClasses(folder, objectNames, null);
  }
  
  public
  void buildJavaClasses(String folder, List<String> objectNames, List<String> backboneElements)
  {
    if(objectNames == null || objectNames.size() == 0) {
      return;
    }
    for(int i = 0; i < objectNames.size(); i++) {
      buildJavaClass(folder, objectNames.get(i), backboneElements);
    }
  }
  
  public
  void buildJavaClass(String folder, String objectName)
  {
    buildJavaClass(folder, objectName, null);
  }
  
  public
  void buildJavaClass(String folder, String objectName, List<String> backboneElements)
  {
    if(objectName == null || objectName.length() == 0) {
      return;
    }
    List<String> fields = getFields(objectName);
    if(fields == null || fields.size() == 0) {
      return;
    }
    if(backboneElements == null) {
      backboneElements = new ArrayList<String>();
    }
    
    boolean isBackboneElement = isBackboneElement(objectName);
    String className = normalizeClassName(objectName);
    
    boolean importDate = false;
    StringBuilder sbFields = new StringBuilder();
    for(int j = 0; j < fields.size(); j++) {
      String field = fields.get(j);
      
      boolean isKeyword = isKeyword(field);
      
      int sizeBackboneElements1 = backboneElements.size();
      String fhirType = getType(objectName, field, backboneElements);
      int sizeBackboneElements2 = backboneElements.size();
      
      if(sizeBackboneElements1 != sizeBackboneElements2) {
        buildJavaClass(folder, backboneElements.get(backboneElements.size()-1), backboneElements);
      }
      
      int lastDot = fhirType.lastIndexOf('.');
      if(lastDot > 0) {
        fhirType = fhirType.substring(lastDot + 1);
      }
      if(fhirType.equals("Reference")) {
        fhirType = "Reference<Resource>";
      }
      else if(fhirType.equals("Reference[]")) {
        fhirType = "Reference<Resource>[]";
      }
      if(fhirType.equals("Date")) {
        importDate = true;
      }
      
      if(isKeyword) {
        sbFields.append("  protected " + fhirType + " " + field + "_;\n");
      }
      else {
        sbFields.append("  protected " + fhirType + " " + field + ";\n");
      }
    }
    
    PrintStream ps = getPrintStream(folder, className + ".java");
    
    String sDescription = getDescription(objectName, "Bean " + objectName + ".");
    
    ps.println("package " + MODEL_PACKAGE + ";");
    ps.println();
    ps.println("import java.io.Serializable;");
    if(importDate) {
      ps.println();
      ps.println("import java.util.Date;");
    }
    ps.println();
    ps.println("/**");
    ps.println(" *");
    ps.println(" * " + sDescription);
    ps.println(" *");
    ps.println(" * @see <a href=\"https://www.hl7.org/fhir\">" + objectName + "</a>");
    ps.println(" */");
    ps.println("public");
    if(isBackboneElement) {
      ps.println("class " + className + " extends BackboneElement implements Serializable");
    }
    else {
      ps.println("class " + className + " extends DomainResource implements Serializable");
    }
    ps.println("{");
    ps.println("  private static final long serialVersionUID = 1L;");
    ps.println("  ");
    ps.print(sbFields);
    ps.println("  ");
    if(isBackboneElement) {
      ps.println("  public " + className + "()");
      ps.println("  {");
      ps.println("  }");
      ps.println("  ");
    }
    else {
      ps.println("  public " + className + "()");
      ps.println("  {");
      ps.println("    this.resourceType = \"" + objectName + "\";");
      ps.println("  }");
      ps.println("  ");
    }
    for(int j = 0; j < fields.size(); j++) {
      String field = fields.get(j);
      
      boolean isKeyword = isKeyword(field);
      
      String fhirType = getType(objectName, field);
      int lastDot = fhirType.lastIndexOf('.');
      if(lastDot > 0) {
        fhirType = fhirType.substring(lastDot + 1);
      }
      if(fhirType.equals("Reference")) {
        fhirType = "Reference<Resource>";
      }
      else if(fhirType.equals("Reference[]")) {
        fhirType = "Reference<Resource>[]";
      }
      String methodField = null;
      if(isKeyword) {
        if(field.length() > 1) {
          methodField = field.substring(0, 1).toUpperCase() + field.substring(1) + "_";
        }
        else {
          methodField = field.toUpperCase() + "_";
        }
      }
      else {
        if(field.length() > 1) {
          methodField = field.substring(0, 1).toUpperCase() + field.substring(1);
        }
        else {
          methodField = field.toUpperCase();
        }
      }
      
      ps.println("  public " + fhirType + " get" + methodField + "() {");
      ps.println("    return " + field + ";");
      ps.println("  }");
      ps.println("  ");
      ps.println("  public void set" + methodField + "(" + fhirType + " " + field + ") {");
      ps.println("    this." + field + " = " + field + ";");
      ps.println("  }");
      ps.println("  ");
    }
    ps.println("  @Override");
    ps.println("  public boolean equals(Object object) {");
    ps.println("    if(object instanceof " + className + ") {");
    ps.println("      return this.hashCode() == object.hashCode();");
    ps.println("    }");
    ps.println("    return false;");
    ps.println("  }");
    ps.println("  ");
    ps.println("  @Override");
    ps.println("  public int hashCode() {");
    ps.println("    if(id == null) return 0;");
    ps.println("    return id.hashCode();");
    ps.println("  }");
    ps.println("  ");
    ps.println("  @Override");
    ps.println("  public String toString() {");
    ps.println("    return \"" + className + "(\" + id + \")\";");
    ps.println("  }");
    ps.println("}");
    
    if(!ps.equals(System.out)) {
      try { ps.close(); } catch(Exception ex) {}
    }
  }
  
  public static
  boolean isKeyword(String field)
  {
    if(field == null || field.length() == 0) {
      return false;
    }
    for(int i = 0; i < KEYWORDS.length; i++) {
      if(field.equals(KEYWORDS[i])) return true;
    }
    return false;
  }
  
  public static
  boolean isObject(String fhirType)
  {
    if(fhirType == null || fhirType.length() == 0) {
      return false;
    }
    char c0 = fhirType.charAt(0);
    return Character.isUpperCase(c0);
  }
  
  public static
  boolean isBackboneElement(String fhirType)
  {
    if(fhirType == null || fhirType.length() == 0) {
      return false;
    }
    char c0 = fhirType.charAt(0);
    if(!Character.isUpperCase(c0)) {
      return false;
    }
    return fhirType.indexOf('_') > 0;
  }
  
  public static
  String normalizeClassName(String objectName)
  {
    if(objectName == null || objectName.length() == 0) {
      return objectName;
    }
    StringBuilder result = new StringBuilder(objectName.length());
    for(int i = 0; i < objectName.length(); i++) {
      char c = objectName.charAt(i);
      if(c == '_') continue;
      result.append(c);
    }
    return result.toString();
  }
  
  public static
  String getClassName(String fhirType) 
  {
    if(fhirType == null || fhirType.length() == 0 || fhirType.equals("*")) {
      return "java.lang.Object";
    }
    
    if(isObject(fhirType)) {
      return MODEL_PACKAGE + "." + normalizeClassName(fhirType);
    }
    
    if(fhirType.equalsIgnoreCase("string")) {
      return "java.lang.String";
    }
    else if(fhirType.equalsIgnoreCase("id")) {
      return "java.lang.String";
    }
    else if(fhirType.equalsIgnoreCase("uri")) {
      return "java.lang.String";
    }
    else if(fhirType.equalsIgnoreCase("url")) {
      return "java.lang.String";
    }
    else if(fhirType.equalsIgnoreCase("markdown")) {
      return "java.lang.String";
    }
    else if(fhirType.equalsIgnoreCase("uuid")) {
      return "java.lang.String";
    }
    else if(fhirType.equalsIgnoreCase("oid")) {
      return "java.lang.String";
    }
    else if(fhirType.equalsIgnoreCase("code")) {
      return "java.lang.String";
    }
    else if(fhirType.equalsIgnoreCase("canonical")) {
      return "java.lang.String";
    }
    else if(fhirType.equalsIgnoreCase("boolean")) {
      return "java.lang.Boolean";
    }
    else if(fhirType.equalsIgnoreCase("number")) {
      return "java.lang.Integer";
    }
    else if(fhirType.equalsIgnoreCase("integer")) {
      return "java.lang.Integer";
    }
    else if(fhirType.equalsIgnoreCase("positiveInt")) {
      return "java.lang.Integer";
    }
    else if(fhirType.equalsIgnoreCase("unsignedInt")) {
      return "java.lang.Integer";
    }
    else if(fhirType.equalsIgnoreCase("decimal")) {
      return "java.lang.Double";
    }
    else if(fhirType.equalsIgnoreCase("instant")) {
      return "java.util.Date";
    }
    else if(fhirType.equalsIgnoreCase("date")) {
      return "java.util.Date";
    }
    else if(fhirType.equalsIgnoreCase("dateTime")) {
      return "java.util.Date";
    }
    else if(fhirType.equalsIgnoreCase("time")) {
      return "java.util.Date";
    }
    return "java.lang.String";
  }
  
  @SuppressWarnings("unchecked")
  protected static
  Map<String, Object> getMap(Map<String, Object> map, String key)
  {
    if(map == null) return new HashMap<String, Object>();
    Object result = map.get(key);
    if(result instanceof Map) {
      return (Map<String, Object>) result;
    }
    return new HashMap<String, Object>(); 
  }
  
  protected static
  List<String> getFields(Map<String, Object> map, String key)
  {
    Map<String, Object> mapResult = getMap(map, key);
    
    List<String> result = new ArrayList<String>();
    
    Iterator<String> iterator = mapResult.keySet().iterator();
    while(iterator.hasNext()) {
      String field = iterator.next();
      
      if(field.startsWith("_")) continue;
      
      boolean isBaseField = false;
      for(int i = 0; i < BASE_FIELDS.length; i++) {
        if(field.equals(BASE_FIELDS[i])) {
          isBaseField = true;
          break;
        }
      }
      if(isBaseField) continue;
      
      boolean isKeyword = isKeyword(field);
      if(isKeyword) field += "_";
      
      result.add(field);
    }
    return result;
  }
  
  protected static
  byte[] readFile(String file)
    throws Exception
  {
    int sep = file.indexOf('/');
    if(sep < 0) sep = file.indexOf('\\');
    InputStream is = null;
    if(sep < 0) {
      URL url = Thread.currentThread().getContextClassLoader().getResource(file);
      is = url.openStream();
    }
    else {
      is = new FileInputStream(file);
    }
    try {
      int n;
      ByteArrayOutputStream baos = new ByteArrayOutputStream();
      byte[] buff = new byte[1024];
      while((n = is.read(buff)) > 0) baos.write(buff, 0, n);
      return baos.toByteArray();
    }
    finally {
      if(is != null) try{ is.close(); } catch(Exception ex) {}
    }
  }
  
  protected static
  PrintStream getPrintStream(String folder, String fileName)
  {
    if(folder == null || folder.length() == 0) {
      return System.out;
    }
    if(fileName == null || fileName.length() == 0) {
      return System.out;
    }
    String filePath = folder + File.separator + fileName;
    try{
      FileOutputStream fileoutputstream = new FileOutputStream(filePath, false);
      return new PrintStream(fileoutputstream, true);
    }
    catch(FileNotFoundException ex){
      ex.printStackTrace();
    }
    return System.out;
  }
  
  protected static
  Map<String, Object> loadSchema()
  {
    Map<String, Object> result = null;
    try {
      byte[] fhir_schema = readFile(SCHEMA_JSON);
      
      result = JSON.parseObj(new String(fhir_schema));
    }
    catch(Exception ex) {
      ex.printStackTrace();
    }
    if(result == null) result = new HashMap<String, Object>();
    return result;
  }
}
