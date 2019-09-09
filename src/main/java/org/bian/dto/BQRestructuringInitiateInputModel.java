package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQRestructuringInitiateInputModelCorporateLoanFulfillmentArrangementInstanceRecord;
import org.bian.dto.BQRestructuringInitiateInputModelRestructuringInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQRestructuringInitiateInputModel
 */
public class BQRestructuringInitiateInputModel   {
  private BQRestructuringInitiateInputModelCorporateLoanFulfillmentArrangementInstanceRecord corporateLoanFulfillmentArrangementInstanceRecord = null;

  private String corporateLoanFulfillmentArrangementInstanceReference = null;

  private Object restructuringInitiateActionRecord = null;

  private BQRestructuringInitiateInputModelRestructuringInstanceRecord restructuringInstanceRecord = null;


  /**
   * Get corporateLoanFulfillmentArrangementInstanceRecord
   * @return corporateLoanFulfillmentArrangementInstanceRecord
  **/

  public BQRestructuringInitiateInputModelCorporateLoanFulfillmentArrangementInstanceRecord getCorporateLoanFulfillmentArrangementInstanceRecord() {
    return corporateLoanFulfillmentArrangementInstanceRecord;
  }

  public void setCorporateLoanFulfillmentArrangementInstanceRecord(BQRestructuringInitiateInputModelCorporateLoanFulfillmentArrangementInstanceRecord corporateLoanFulfillmentArrangementInstanceRecord) {
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return restructuringInitiateActionRecord
  **/

  public Object getRestructuringInitiateActionRecord() {
    return restructuringInitiateActionRecord;
  }

  public void setRestructuringInitiateActionRecord(Object restructuringInitiateActionRecord) {
    this.restructuringInitiateActionRecord = restructuringInitiateActionRecord;
  }


  /**
   * Get restructuringInstanceRecord
   * @return restructuringInstanceRecord
  **/

  public BQRestructuringInitiateInputModelRestructuringInstanceRecord getRestructuringInstanceRecord() {
    return restructuringInstanceRecord;
  }

  public void setRestructuringInstanceRecord(BQRestructuringInitiateInputModelRestructuringInstanceRecord restructuringInstanceRecord) {
    this.restructuringInstanceRecord = restructuringInstanceRecord;
  }


}

