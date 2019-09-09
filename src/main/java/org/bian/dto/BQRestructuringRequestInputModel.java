package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQMaintenanceRequestInputModelRequestRecordType;
import org.bian.dto.BQRestructuringInitiateInputModelRestructuringInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQRestructuringRequestInputModel
 */
public class BQRestructuringRequestInputModel   {
  private String corporateLoanFulfillmentArrangementInstanceReference = null;

  private String restructuringInstanceReference = null;

  private BQRestructuringInitiateInputModelRestructuringInstanceRecord restructuringInstanceRecord = null;

  private Object restructuringRequestActionTaskRecord = null;

  private BQMaintenanceRequestInputModelRequestRecordType requestRecordType = null;


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
   * Get restructuringInstanceRecord
   * @return restructuringInstanceRecord
  **/

  public BQRestructuringInitiateInputModelRestructuringInstanceRecord getRestructuringInstanceRecord() {
    return restructuringInstanceRecord;
  }

  public void setRestructuringInstanceRecord(BQRestructuringInitiateInputModelRestructuringInstanceRecord restructuringInstanceRecord) {
    this.restructuringInstanceRecord = restructuringInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return restructuringRequestActionTaskRecord
  **/

  public Object getRestructuringRequestActionTaskRecord() {
    return restructuringRequestActionTaskRecord;
  }

  public void setRestructuringRequestActionTaskRecord(Object restructuringRequestActionTaskRecord) {
    this.restructuringRequestActionTaskRecord = restructuringRequestActionTaskRecord;
  }


  /**
   * Get requestRecordType
   * @return requestRecordType
  **/

  public BQMaintenanceRequestInputModelRequestRecordType getRequestRecordType() {
    return requestRecordType;
  }

  public void setRequestRecordType(BQMaintenanceRequestInputModelRequestRecordType requestRecordType) {
    this.requestRecordType = requestRecordType;
  }


}

