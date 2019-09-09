package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCorporateLoanFulfillmentArrangementUpdateInputModelCorporateLoanFulfillmentArrangementInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCorporateLoanFulfillmentArrangementUpdateInputModel
 */
public class CRCorporateLoanFulfillmentArrangementUpdateInputModel   {
  private String corporateLoanServicingSessionReference = null;

  private String corporateLoanFulfillmentArrangementInstanceReference = null;

  private CRCorporateLoanFulfillmentArrangementUpdateInputModelCorporateLoanFulfillmentArrangementInstanceRecord corporateLoanFulfillmentArrangementInstanceRecord = null;

  private Object corporateLoanFulfillmentArrangementUpdateActionTaskRecord = null;

  private String updateActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return corporateLoanServicingSessionReference
  **/

  public String getCorporateLoanServicingSessionReference() {
    return corporateLoanServicingSessionReference;
  }

  public void setCorporateLoanServicingSessionReference(String corporateLoanServicingSessionReference) {
    this.corporateLoanServicingSessionReference = corporateLoanServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Corporate Loan Fulfillment Arrangement instance 
   * @return corporateLoanFulfillmentArrangementInstanceReference
  **/

  public String getCorporateLoanFulfillmentArrangementInstanceReference() {
    return corporateLoanFulfillmentArrangementInstanceReference;
  }

  public void setCorporateLoanFulfillmentArrangementInstanceReference(String corporateLoanFulfillmentArrangementInstanceReference) {
    this.corporateLoanFulfillmentArrangementInstanceReference = corporateLoanFulfillmentArrangementInstanceReference;
  }


  /**
   * Get corporateLoanFulfillmentArrangementInstanceRecord
   * @return corporateLoanFulfillmentArrangementInstanceRecord
  **/

  public CRCorporateLoanFulfillmentArrangementUpdateInputModelCorporateLoanFulfillmentArrangementInstanceRecord getCorporateLoanFulfillmentArrangementInstanceRecord() {
    return corporateLoanFulfillmentArrangementInstanceRecord;
  }

  public void setCorporateLoanFulfillmentArrangementInstanceRecord(CRCorporateLoanFulfillmentArrangementUpdateInputModelCorporateLoanFulfillmentArrangementInstanceRecord corporateLoanFulfillmentArrangementInstanceRecord) {
    this.corporateLoanFulfillmentArrangementInstanceRecord = corporateLoanFulfillmentArrangementInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return corporateLoanFulfillmentArrangementUpdateActionTaskRecord
  **/

  public Object getCorporateLoanFulfillmentArrangementUpdateActionTaskRecord() {
    return corporateLoanFulfillmentArrangementUpdateActionTaskRecord;
  }

  public void setCorporateLoanFulfillmentArrangementUpdateActionTaskRecord(Object corporateLoanFulfillmentArrangementUpdateActionTaskRecord) {
    this.corporateLoanFulfillmentArrangementUpdateActionTaskRecord = corporateLoanFulfillmentArrangementUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return updateActionRequest
  **/

  public String getUpdateActionRequest() {
    return updateActionRequest;
  }

  public void setUpdateActionRequest(String updateActionRequest) {
    this.updateActionRequest = updateActionRequest;
  }


}

