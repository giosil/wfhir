package org.dew.fhir.services;

/**
 * 
 * FHIR Service interface.
 *
 * @see <a href="https://www.hl7.org/fhir/http.html">RESTful API</a>
 */
public 
interface IFHIRService
{
  /**
   * Read the current state of the resource.
   * 
   * @param request FHIRRequest
   * @return FHIRResponse with Resource or OperationOutcome
   * @throws Exception Unexpected error
   */
  public FHIRResponse read(FHIRRequest request) throws Exception;
  
  /**
   * Read the state of a specific version of the resource.
   * 
   * @param request FHIRRequest
   * @return FHIRResponse with Resource or OperationOutcome
   * @throws Exception Unexpected error
   */
  public FHIRResponse vread(FHIRRequest request) throws Exception;
  
  /**
   * Update an existing resource by its id (or create it if it is new).
   * 
   * @param request FHIRRequest
   * @return FHIRResponse with the Logical Id and the Version Id of the resource updated or OperationOutcome
   * @throws Exception Unexpected error
   */
  public FHIRResponse update(FHIRRequest request) throws Exception;
  
  /**
   * Update an existing resource by posting a set of changes to it.
   * 
   * @param request FHIRRequest
   * @return FHIRResponse with the Logical Id and the Version Id of the resource patched or OperationOutcome
   * @throws Exception Unexpected error
   */
  public FHIRResponse patch(FHIRRequest request) throws Exception;
  
  /**
   * Delete a resource.
   * 
   * @param request FHIRRequest
   * @return FHIRResponse with the Logical Id and the Version Id of the resource deleted or OperationOutcome
   * @throws Exception Unexpected error
   */
  public FHIRResponse delete(FHIRRequest request) throws Exception;
  
  /**
   * Retrieve the change history for a particular resource.
   * 
   * @param request FHIRRequest
   * @return FHIRResponse with Bundle or OperationOutcome
   * @throws Exception Unexpected error
   */
  public FHIRResponse history(FHIRRequest request) throws Exception;
  
  /**
   * Create a new resource with a server assigned id.
   * 
   * @param request FHIRRequest
   * @return FHIRResponse with the Logical Id and the Version Id of the resource created or OperationOutcome
   * @throws Exception Unexpected error
   */
  public FHIRResponse create(FHIRRequest request) throws Exception;
  
  /**
   * Search the resource type based on some filter criteria.
   * 
   * @param request FHIRRequest
   * @return FHIRResponse with Bundle or OperationOutcome
   * @throws Exception Unexpected error
   */
  public FHIRResponse search(FHIRRequest request) throws Exception;
}
