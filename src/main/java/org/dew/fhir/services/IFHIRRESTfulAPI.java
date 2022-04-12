package org.dew.fhir.services;

import javax.annotation.Resource;

import org.dew.fhir.model.Bundle;

/**
 * 
 * FHIR is described as a 'RESTful' specification based on common industry level use of the term REST.
 *
 * @see <a href="https://www.hl7.org/fhir/http.html">RESTful API</a>
 */
public 
interface IFHIRRESTfulAPI<T extends Resource>
{
  /**
   * Read the current state of the resource.
   * 
   * @param id The Logical Id of a resource
   * @param parameters API parameters
   * @return Resource
   * @throws Exception (OperationOutcome)
   */
  public T read(String id, FHIRParameters parameters) throws Exception;
  
  /**
   * Read the state of a specific version of the resource.
   * 
   * @param id The Logical Id of a resource
   * @param vid The Version Id of a resource
   * @param parameters API parameters
   * @return Resource
   * @throws Exception (OperationOutcome)
   */
  public T vread(String id, String vid, FHIRParameters parameters) throws Exception;
  
  /**
   * Update an existing resource by its id (or create it if it is new).
   * 
   * @param resource Resource
   * @param parameters API parameters
   * @return FHIRResourceId The Logical Id and the Version Id of the resource updated
   * @throws Exception (OperationOutcome)
   */
  public FHIRResourceId update(T resource, FHIRParameters parameters) throws Exception;
  
  /**
   * Update an existing resource by posting a set of changes to it.
   * 
   * @param resource Resource
   * @param parameters API parameters
   * @return FHIRResourceId The Logical Id and the Version Id of the resource patched
   * @throws Exception (OperationOutcome)
   */
  public FHIRResourceId patch(T resource, FHIRParameters parameters) throws Exception;
  
  /**
   * Delete a resource.
   * 
   * @param id The Logical Id of a resource
   * @param parameters API parameters
   * @return true if delete suceed, false otherwise
   * @throws Exception (OperationOutcome)
   */
  public boolean delete(String id, FHIRParameters parameters) throws Exception;
  
  /**
   * Retrieve the change history for a particular resource.
   * 
   * @param id The Logical Id of a resource
   * @param parameters API parameters
   * @return Bundle
   * @throws Exception (OperationOutcome)
   */
  public Bundle history(String id, FHIRParameters parameters) throws Exception;
  
  /**
   * Retrieve the change history for a particular resource.
   * 
   * @param parameters API parameters
   * @return Bundle
   * @throws Exception (OperationOutcome)
   */
  public Bundle history(FHIRParameters parameters) throws Exception;
  
  /**
   * Create a new resource with a server assigned id.
   * 
   * @param resource Resource
   * @param parameters API parameters
   * @return FHIRResourceId The Logical Id and the Version Id of the resource created
   * @throws Exception (OperationOutcome)
   */
  public FHIRResourceId create(T resource, FHIRParameters parameters) throws Exception;
  
  /**
   * Search the resource type based on some filter criteria.
   * 
   * @param resource Filter
   * @param parameters API parameters
   * @return Bundle
   * @throws Exception (OperationOutcome)
   */
  public Bundle search(T resource, FHIRParameters parameters) throws Exception;
}
