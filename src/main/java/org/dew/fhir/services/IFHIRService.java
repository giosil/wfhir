package org.dew.fhir.services;

import org.dew.fhir.model.Resource;

/**
 * 
 * FHIR Service interface.
 *
 * @see <a href="https://www.hl7.org/fhir/http.html">RESTful API</a>
 */
public 
interface IFHIRService<T extends Resource>
{
  /**
   * Read the current state of the resource.
   * 
   * @param request FHIRRequest
   * @return FHIRResponse with Resource or OperationOutcome
   */
  public FHIRResponse<T> read(FHIRRequest<T> request);
  
  /**
   * Read the state of a specific version of the resource.
   * 
   * @param request FHIRRequest
   * @return FHIRResponse with Resource or OperationOutcome
   */
  public FHIRResponse<T> vread(FHIRRequest<T> request);
  
  /**
   * Update an existing resource by its id (or create it if it is new).
   * 
   * @param request FHIRRequest
   * @return FHIRResponse with the Logical Id and the Version Id of the resource updated or OperationOutcome
   */
  public FHIRResponse<T> update(FHIRRequest<T> request);
  
  /**
   * Update an existing resource by posting a set of changes to it.
   * 
   * @param request FHIRRequest
   * @return FHIRResponse with the Logical Id and the Version Id of the resource patched or OperationOutcome
   */
  public FHIRResponse<T> patch(FHIRRequest<T> request);
  
  /**
   * Delete a resource.
   * 
   * @param request FHIRRequest
   * @return FHIRResponse with the Logical Id and the Version Id of the resource deleted or OperationOutcome
   */
  public FHIRResponse<T> delete(FHIRRequest<T> request);
  
  /**
   * Retrieve the change history for a particular resource.
   * 
   * @param request FHIRRequest
   * @return FHIRResponse with Bundle or OperationOutcome
   */
  public FHIRResponse<T> history(FHIRRequest<T> request);
  
  /**
   * Create a new resource with a server assigned id.
   * 
   * @param request FHIRRequest
   * @return FHIRResponse with the Logical Id and the Version Id of the resource created or OperationOutcome
   */
  public FHIRResponse<T> create(FHIRRequest<T> request);
  
  /**
   * Search the resource type based on some filter criteria.
   * 
   * @param request FHIRRequest
   * @return FHIRResponse with Bundle or OperationOutcome
   */
  public FHIRResponse<T> search(FHIRRequest<T> request);
}
