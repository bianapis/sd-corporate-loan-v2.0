package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQRestructuringInitiateOutputModelCorporateLoanFulfillmentArrangementInstanceRecord;
import org.bian.dto.BQRestructuringInitiateOutputModelRestructuringInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQRestructuringInitiateOutputModel
 */
public class BQRestructuringInitiateOutputModel   {
  private BQRestructuringInitiateOutputModelCorporateLoanFulfillmentArrangementInstanceRecord corporateLoanFulfillmentArrangementInstanceRecord = null;

  private String restructuringInstanceReference = null;

  private String restructuringInitiateActionReference = null;

  private Object restructuringInitiateActionRecord = null;

  private String restructuringInstanceStatus = null;

  private BQRestructuringInitiateOutputModelRestructuringInstanceRecord restructuringInstanceRecord = null;


  /**
   * Get corporateLoanFulfillmentArrangementInstanceRecord
   * @return corporateLoanFulfillmentArrangementInstanceRecord
  **/

  public BQRestructuringInitiateOutputModelCorporateLoanFulfillmentArrangementInstanceRecord getCorporateLoanFulfillmentArrangementInstanceRecord() {
    return corporateLoanFulfillmentArrangementInstanceRecord;
  }

  public void setCorporateLoanFulfillmentArrangementInstanceRecord(BQRestructuringInitiateOutputModelCorporateLoanFulfillmentArrangementInstanceRecord corporateLoanFulfillmentArrangementInstanceRecord) {
    this.corporateLoanFulfillmentArrangementInstanceRecord = corporateLoanFulfillmentArrangementInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Restructuring instance 
   * @return restructuringInstanceReference
  **/

  public String getRestructuringInstanceReference() {
    return restructuringInstanceReference;
  }

  public void setRestructuringInstanceReference(String restructuringInstanceReference) {
    this.restructuringInstanceReference = restructuringInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return restructuringInitiateActionReference
  **/

  public String getRestructuringInitiateActionReference() {
    return restructuringInitiateActionReference;
  }

  public void setRestructuringInitiateActionReference(String restructuringInitiateActionReference) {
    this.restructuringInitiateActionReference = restructuringInitiateActionReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Restructuring instance (e.g. initialised, pending, active) 
   * @return restructuringInstanceStatus
  **/

  public String getRestructuringInstanceStatus() {
    return restructuringInstanceStatus;
  }

  public void setRestructuringInstanceStatus(String restructuringInstanceStatus) {
    this.restructuringInstanceStatus = restructuringInstanceStatus;
  }


  /**
   * Get restructuringInstanceRecord
   * @return restructuringInstanceRecord
  **/

  public BQRestructuringInitiateOutputModelRestructuringInstanceRecord getRestructuringInstanceRecord() {
    return restructuringInstanceRecord;
  }

  public void setRestructuringInstanceRecord(BQRestructuringInitiateOutputModelRestructuringInstanceRecord restructuringInstanceRecord) {
    this.restructuringInstanceRecord = restructuringInstanceRecord;
  }


}

