package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCorporateLoanFulfillmentArrangementInitiateOutputModelCorporateLoanFulfillmentArrangementInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCorporateLoanFulfillmentArrangementInitiateOutputModel
 */
public class CRCorporateLoanFulfillmentArrangementInitiateOutputModel   {
  private String corporateLoanFulfillmentArrangementInstanceReference = null;

  private String corporateLoanFulfillmentArrangementInitiateActionReference = null;

  private Object corporateLoanFulfillmentArrangementInitiateActionRecord = null;

  private String corporateLoanFulfillmentArrangementInstanceStatus = null;

  private CRCorporateLoanFulfillmentArrangementInitiateOutputModelCorporateLoanFulfillmentArrangementInstanceRecord corporateLoanFulfillmentArrangementInstanceRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return corporateLoanFulfillmentArrangementInitiateActionReference
  **/

  public String getCorporateLoanFulfillmentArrangementInitiateActionReference() {
    return corporateLoanFulfillmentArrangementInitiateActionReference;
  }

  public void setCorporateLoanFulfillmentArrangementInitiateActionReference(String corporateLoanFulfillmentArrangementInitiateActionReference) {
    this.corporateLoanFulfillmentArrangementInitiateActionReference = corporateLoanFulfillmentArrangementInitiateActionReference;
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

  public CRCorporateLoanFulfillmentArrangementInitiateOutputModelCorporateLoanFulfillmentArrangementInstanceRecord getCorporateLoanFulfillmentArrangementInstanceRecord() {
    return corporateLoanFulfillmentArrangementInstanceRecord;
  }

  public void setCorporateLoanFulfillmentArrangementInstanceRecord(CRCorporateLoanFulfillmentArrangementInitiateOutputModelCorporateLoanFulfillmentArrangementInstanceRecord corporateLoanFulfillmentArrangementInstanceRecord) {
    this.corporateLoanFulfillmentArrangementInstanceRecord = corporateLoanFulfillmentArrangementInstanceRecord;
  }


}

