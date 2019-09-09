package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQWithdrawalUpdateInputModelCorporateLoanFulfillmentArrangementInstanceRecord;
import org.bian.dto.BQWithdrawalUpdateInputModelWithdrawalInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQWithdrawalUpdateInputModel
 */
public class BQWithdrawalUpdateInputModel   {
  private BQWithdrawalUpdateInputModelCorporateLoanFulfillmentArrangementInstanceRecord corporateLoanFulfillmentArrangementInstanceRecord = null;

  private String corporateLoanFulfillmentArrangementInstanceReference = null;

  private String withdrawalInstanceReference = null;

  private BQWithdrawalUpdateInputModelWithdrawalInstanceRecord withdrawalInstanceRecord = null;

  private Object withdrawalUpdateActionTaskRecord = null;

  private String withdrawalUpdateActionRequest = null;


  /**
   * Get corporateLoanFulfillmentArrangementInstanceRecord
   * @return corporateLoanFulfillmentArrangementInstanceRecord
  **/

  public BQWithdrawalUpdateInputModelCorporateLoanFulfillmentArrangementInstanceRecord getCorporateLoanFulfillmentArrangementInstanceRecord() {
    return corporateLoanFulfillmentArrangementInstanceRecord;
  }

  public void setCorporateLoanFulfillmentArrangementInstanceRecord(BQWithdrawalUpdateInputModelCorporateLoanFulfillmentArrangementInstanceRecord corporateLoanFulfillmentArrangementInstanceRecord) {
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Withdrawal instance 
   * @return withdrawalInstanceReference
  **/

  public String getWithdrawalInstanceReference() {
    return withdrawalInstanceReference;
  }

  public void setWithdrawalInstanceReference(String withdrawalInstanceReference) {
    this.withdrawalInstanceReference = withdrawalInstanceReference;
  }


  /**
   * Get withdrawalInstanceRecord
   * @return withdrawalInstanceRecord
  **/

  public BQWithdrawalUpdateInputModelWithdrawalInstanceRecord getWithdrawalInstanceRecord() {
    return withdrawalInstanceRecord;
  }

  public void setWithdrawalInstanceRecord(BQWithdrawalUpdateInputModelWithdrawalInstanceRecord withdrawalInstanceRecord) {
    this.withdrawalInstanceRecord = withdrawalInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return withdrawalUpdateActionTaskRecord
  **/

  public Object getWithdrawalUpdateActionTaskRecord() {
    return withdrawalUpdateActionTaskRecord;
  }

  public void setWithdrawalUpdateActionTaskRecord(Object withdrawalUpdateActionTaskRecord) {
    this.withdrawalUpdateActionTaskRecord = withdrawalUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return withdrawalUpdateActionRequest
  **/

  public String getWithdrawalUpdateActionRequest() {
    return withdrawalUpdateActionRequest;
  }

  public void setWithdrawalUpdateActionRequest(String withdrawalUpdateActionRequest) {
    this.withdrawalUpdateActionRequest = withdrawalUpdateActionRequest;
  }


}

