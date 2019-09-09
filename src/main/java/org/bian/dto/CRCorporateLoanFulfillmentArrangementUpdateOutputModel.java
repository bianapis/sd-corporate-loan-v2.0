package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCorporateLoanFulfillmentArrangementUpdateInputModelCorporateLoanFulfillmentArrangementInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCorporateLoanFulfillmentArrangementUpdateOutputModel
 */
public class CRCorporateLoanFulfillmentArrangementUpdateOutputModel   {
  private CRCorporateLoanFulfillmentArrangementUpdateInputModelCorporateLoanFulfillmentArrangementInstanceRecord corporateLoanFulfillmentArrangementInstanceRecord = null;

  private String corporateLoanFulfillmentArrangementUpdateActionTaskReference = null;

  private Object corporateLoanFulfillmentArrangementUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * Get corporateLoanFulfillmentArrangementInstanceRecord
   * @return corporateLoanFulfillmentArrangementInstanceRecord
  **/

  public CRCorporateLoanFulfillmentArrangementUpdateInputModelCorporateLoanFulfillmentArrangementInstanceRecord getCorporateLoanFulfillmentArrangementInstanceRecord() {
    return corporateLoanFulfillmentArrangementInstanceRecord;
  }

  public void setCorporateLoanFulfillmentArrangementInstanceRecord(CRCorporateLoanFulfillmentArrangementUpdateInputModelCorporateLoanFulfillmentArrangementInstanceRecord corporateLoanFulfillmentArrangementInstanceRecord) {
    this.corporateLoanFulfillmentArrangementInstanceRecord = corporateLoanFulfillmentArrangementInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return corporateLoanFulfillmentArrangementUpdateActionTaskReference
  **/

  public String getCorporateLoanFulfillmentArrangementUpdateActionTaskReference() {
    return corporateLoanFulfillmentArrangementUpdateActionTaskReference;
  }

  public void setCorporateLoanFulfillmentArrangementUpdateActionTaskReference(String corporateLoanFulfillmentArrangementUpdateActionTaskReference) {
    this.corporateLoanFulfillmentArrangementUpdateActionTaskReference = corporateLoanFulfillmentArrangementUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return corporateLoanFulfillmentArrangementUpdateActionTaskRecord
  **/

  public Object getCorporateLoanFulfillmentArrangementUpdateActionTaskRecord() {
    return corporateLoanFulfillmentArrangementUpdateActionTaskRecord;
  }

  public void setCorporateLoanFulfillmentArrangementUpdateActionTaskRecord(Object corporateLoanFulfillmentArrangementUpdateActionTaskRecord) {
    this.corporateLoanFulfillmentArrangementUpdateActionTaskRecord = corporateLoanFulfillmentArrangementUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

