package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCorporateLoanFulfillmentArrangementControlInputModelCorporateLoanFulfillmentArrangementControlActionRequest;

import javax.validation.Valid;
  
/**
 * CRCorporateLoanFulfillmentArrangementControlInputModel
 */
public class CRCorporateLoanFulfillmentArrangementControlInputModel   {
  private String corporateLoanServicingSessionReference = null;

  private String corporateLoanFulfillmentArrangementInstanceReference = null;

  private Object corporateLoanFulfillmentArrangementControlActionTaskRecord = null;

  private CRCorporateLoanFulfillmentArrangementControlInputModelCorporateLoanFulfillmentArrangementControlActionRequest corporateLoanFulfillmentArrangementControlActionRequest = null;


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
   * Get corporateLoanFulfillmentArrangementControlActionRequest
   * @return corporateLoanFulfillmentArrangementControlActionRequest
  **/

  public CRCorporateLoanFulfillmentArrangementControlInputModelCorporateLoanFulfillmentArrangementControlActionRequest getCorporateLoanFulfillmentArrangementControlActionRequest() {
    return corporateLoanFulfillmentArrangementControlActionRequest;
  }

  public void setCorporateLoanFulfillmentArrangementControlActionRequest(CRCorporateLoanFulfillmentArrangementControlInputModelCorporateLoanFulfillmentArrangementControlActionRequest corporateLoanFulfillmentArrangementControlActionRequest) {
    this.corporateLoanFulfillmentArrangementControlActionRequest = corporateLoanFulfillmentArrangementControlActionRequest;
  }


}

