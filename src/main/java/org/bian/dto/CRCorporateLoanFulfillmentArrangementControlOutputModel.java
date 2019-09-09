package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCorporateLoanFulfillmentArrangementControlOutputModel
 */
public class CRCorporateLoanFulfillmentArrangementControlOutputModel   {
  private String corporateLoanFulfillmentArrangementControlActionTaskReference = null;

  private Object corporateLoanFulfillmentArrangementControlActionTaskRecord = null;

  private String corporateLoanFulfillmentArrangementControlActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Corporate Loan Fulfillment Arrangement instance control processing service call 
   * @return corporateLoanFulfillmentArrangementControlActionTaskReference
  **/

  public String getCorporateLoanFulfillmentArrangementControlActionTaskReference() {
    return corporateLoanFulfillmentArrangementControlActionTaskReference;
  }

  public void setCorporateLoanFulfillmentArrangementControlActionTaskReference(String corporateLoanFulfillmentArrangementControlActionTaskReference) {
    this.corporateLoanFulfillmentArrangementControlActionTaskReference = corporateLoanFulfillmentArrangementControlActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The processing control service call consolidated processing record 
   * @return corporateLoanFulfillmentArrangementControlActionTaskRecord
  **/

  public Object getCorporateLoanFulfillmentArrangementControlActionTaskRecord() {
    return corporateLoanFulfillmentArrangementControlActionTaskRecord;
  }

  public void setCorporateLoanFulfillmentArrangementControlActionTaskRecord(Object corporateLoanFulfillmentArrangementControlActionTaskRecord) {
    this.corporateLoanFulfillmentArrangementControlActionTaskRecord = corporateLoanFulfillmentArrangementControlActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the control action service response 
   * @return corporateLoanFulfillmentArrangementControlActionResponse
  **/

  public String getCorporateLoanFulfillmentArrangementControlActionResponse() {
    return corporateLoanFulfillmentArrangementControlActionResponse;
  }

  public void setCorporateLoanFulfillmentArrangementControlActionResponse(String corporateLoanFulfillmentArrangementControlActionResponse) {
    this.corporateLoanFulfillmentArrangementControlActionResponse = corporateLoanFulfillmentArrangementControlActionResponse;
  }


}

