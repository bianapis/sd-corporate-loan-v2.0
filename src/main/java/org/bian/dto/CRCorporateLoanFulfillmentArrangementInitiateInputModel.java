package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCorporateLoanFulfillmentArrangementInitiateInputModelCorporateLoanFulfillmentArrangementInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCorporateLoanFulfillmentArrangementInitiateInputModel
 */
public class CRCorporateLoanFulfillmentArrangementInitiateInputModel   {
  private String corporateLoanServicingSessionReference = null;

  private Object corporateLoanFulfillmentArrangementInitiateActionRecord = null;

  private String corporateLoanFulfillmentArrangementInstanceStatus = null;

  private CRCorporateLoanFulfillmentArrangementInitiateInputModelCorporateLoanFulfillmentArrangementInstanceRecord corporateLoanFulfillmentArrangementInstanceRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return corporateLoanFulfillmentArrangementInitiateActionRecord
  **/

  public Object getCorporateLoanFulfillmentArrangementInitiateActionRecord() {
    return corporateLoanFulfillmentArrangementInitiateActionRecord;
  }

  public void setCorporateLoanFulfillmentArrangementInitiateActionRecord(Object corporateLoanFulfillmentArrangementInitiateActionRecord) {
    this.corporateLoanFulfillmentArrangementInitiateActionRecord = corporateLoanFulfillmentArrangementInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Corporate Loan Fulfillment Arrangement instance (e.g. initialised, pending, active) 
   * @return corporateLoanFulfillmentArrangementInstanceStatus
  **/

  public String getCorporateLoanFulfillmentArrangementInstanceStatus() {
    return corporateLoanFulfillmentArrangementInstanceStatus;
  }

  public void setCorporateLoanFulfillmentArrangementInstanceStatus(String corporateLoanFulfillmentArrangementInstanceStatus) {
    this.corporateLoanFulfillmentArrangementInstanceStatus = corporateLoanFulfillmentArrangementInstanceStatus;
  }


  /**
   * Get corporateLoanFulfillmentArrangementInstanceRecord
   * @return corporateLoanFulfillmentArrangementInstanceRecord
  **/

  public CRCorporateLoanFulfillmentArrangementInitiateInputModelCorporateLoanFulfillmentArrangementInstanceRecord getCorporateLoanFulfillmentArrangementInstanceRecord() {
    return corporateLoanFulfillmentArrangementInstanceRecord;
  }

  public void setCorporateLoanFulfillmentArrangementInstanceRecord(CRCorporateLoanFulfillmentArrangementInitiateInputModelCorporateLoanFulfillmentArrangementInstanceRecord corporateLoanFulfillmentArrangementInstanceRecord) {
    this.corporateLoanFulfillmentArrangementInstanceRecord = corporateLoanFulfillmentArrangementInstanceRecord;
  }


}

