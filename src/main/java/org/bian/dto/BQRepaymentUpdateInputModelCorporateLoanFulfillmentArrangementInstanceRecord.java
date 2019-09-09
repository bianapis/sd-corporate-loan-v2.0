package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCorporateLoanFulfillmentArrangementInitiateInputModelCorporateLoanFulfillmentArrangementInstanceRecordDateType;

import javax.validation.Valid;
  
/**
 * BQRepaymentUpdateInputModelCorporateLoanFulfillmentArrangementInstanceRecord
 */
public class BQRepaymentUpdateInputModelCorporateLoanFulfillmentArrangementInstanceRecord   {
  private String loanOutstandingBalance = null;

  private CRCorporateLoanFulfillmentArrangementInitiateInputModelCorporateLoanFulfillmentArrangementInstanceRecordDateType dateType = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The outstanding balance 
   * @return loanOutstandingBalance
  **/

  public String getLoanOutstandingBalance() {
    return loanOutstandingBalance;
  }

  public void setLoanOutstandingBalance(String loanOutstandingBalance) {
    this.loanOutstandingBalance = loanOutstandingBalance;
  }


  /**
   * Get dateType
   * @return dateType
  **/

  public CRCorporateLoanFulfillmentArrangementInitiateInputModelCorporateLoanFulfillmentArrangementInstanceRecordDateType getDateType() {
    return dateType;
  }

  public void setDateType(CRCorporateLoanFulfillmentArrangementInitiateInputModelCorporateLoanFulfillmentArrangementInstanceRecordDateType dateType) {
    this.dateType = dateType;
  }


}

