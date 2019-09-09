package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQRepaymentUpdateInputModelCorporateLoanFulfillmentArrangementInstanceRecord;
import org.bian.dto.BQRepaymentUpdateInputModelRepaymentInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQRepaymentUpdateInputModel
 */
public class BQRepaymentUpdateInputModel   {
  private BQRepaymentUpdateInputModelCorporateLoanFulfillmentArrangementInstanceRecord corporateLoanFulfillmentArrangementInstanceRecord = null;

  private String corporateLoanFulfillmentArrangementInstanceReference = null;

  private String repaymentInstanceReference = null;

  private BQRepaymentUpdateInputModelRepaymentInstanceRecord repaymentInstanceRecord = null;

  private Object repaymentUpdateActionTaskRecord = null;

  private String repaymentUpdateActionRequest = null;


  /**
   * Get corporateLoanFulfillmentArrangementInstanceRecord
   * @return corporateLoanFulfillmentArrangementInstanceRecord
  **/

  public BQRepaymentUpdateInputModelCorporateLoanFulfillmentArrangementInstanceRecord getCorporateLoanFulfillmentArrangementInstanceRecord() {
    return corporateLoanFulfillmentArrangementInstanceRecord;
  }

  public void setCorporateLoanFulfillmentArrangementInstanceRecord(BQRepaymentUpdateInputModelCorporateLoanFulfillmentArrangementInstanceRecord corporateLoanFulfillmentArrangementInstanceRecord) {
    this.corporateLoanFulfillmentArrangementInstanceRecord = corporateLoanFulfillmentArrangementInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Corporate Loan Fulfillment Arrangement instance 
   * @return corporateLoanFulfillmentArrangementInstanceReference
  **/

  public String getCorporateLoanFulfillmentArrangementInstanceReference() {
    return corporateLoanFulfillmentArrangementInstanceReference;
  }

  public void setCorporateLoanFulfillmentArrangementInstanceReference(String corporateLoanFulfillmentArrangementInstanceReference) {
    this.corporateLoanFulfillmentArrangementInstanceReference = corporateLoanFulfillmentArrangementInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Repayment instance 
   * @return repaymentInstanceReference
  **/

  public String getRepaymentInstanceReference() {
    return repaymentInstanceReference;
  }

  public void setRepaymentInstanceReference(String repaymentInstanceReference) {
    this.repaymentInstanceReference = repaymentInstanceReference;
  }


  /**
   * Get repaymentInstanceRecord
   * @return repaymentInstanceRecord
  **/

  public BQRepaymentUpdateInputModelRepaymentInstanceRecord getRepaymentInstanceRecord() {
    return repaymentInstanceRecord;
  }

  public void setRepaymentInstanceRecord(BQRepaymentUpdateInputModelRepaymentInstanceRecord repaymentInstanceRecord) {
    this.repaymentInstanceRecord = repaymentInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return repaymentUpdateActionTaskRecord
  **/

  public Object getRepaymentUpdateActionTaskRecord() {
    return repaymentUpdateActionTaskRecord;
  }

  public void setRepaymentUpdateActionTaskRecord(Object repaymentUpdateActionTaskRecord) {
    this.repaymentUpdateActionTaskRecord = repaymentUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return repaymentUpdateActionRequest
  **/

  public String getRepaymentUpdateActionRequest() {
    return repaymentUpdateActionRequest;
  }

  public void setRepaymentUpdateActionRequest(String repaymentUpdateActionRequest) {
    this.repaymentUpdateActionRequest = repaymentUpdateActionRequest;
  }


}

