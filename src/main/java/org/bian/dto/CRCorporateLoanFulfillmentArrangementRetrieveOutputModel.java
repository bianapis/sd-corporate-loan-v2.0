package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCorporateLoanFulfillmentArrangementRetrieveOutputModelCorporateLoanFulfillmentArrangementInstanceAnalysis;
import org.bian.dto.CRCorporateLoanFulfillmentArrangementRetrieveOutputModelCorporateLoanFulfillmentArrangementInstanceRecord;
import org.bian.dto.CRCorporateLoanFulfillmentArrangementRetrieveOutputModelCorporateLoanFulfillmentArrangementInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRCorporateLoanFulfillmentArrangementRetrieveOutputModel
 */
public class CRCorporateLoanFulfillmentArrangementRetrieveOutputModel   {
  private CRCorporateLoanFulfillmentArrangementRetrieveOutputModelCorporateLoanFulfillmentArrangementInstanceRecord corporateLoanFulfillmentArrangementInstanceRecord = null;

  private String corporateLoanFulfillmentArrangementRetrieveActionTaskReference = null;

  private Object corporateLoanFulfillmentArrangementRetrieveActionTaskRecord = null;

  private String corporateLoanFulfillmentArrangementRetrieveActionResponse = null;

  private CRCorporateLoanFulfillmentArrangementRetrieveOutputModelCorporateLoanFulfillmentArrangementInstanceReportRecord corporateLoanFulfillmentArrangementInstanceReportRecord = null;

  private CRCorporateLoanFulfillmentArrangementRetrieveOutputModelCorporateLoanFulfillmentArrangementInstanceAnalysis corporateLoanFulfillmentArrangementInstanceAnalysis = null;


  /**
   * Get corporateLoanFulfillmentArrangementInstanceRecord
   * @return corporateLoanFulfillmentArrangementInstanceRecord
  **/

  public CRCorporateLoanFulfillmentArrangementRetrieveOutputModelCorporateLoanFulfillmentArrangementInstanceRecord getCorporateLoanFulfillmentArrangementInstanceRecord() {
    return corporateLoanFulfillmentArrangementInstanceRecord;
  }

  public void setCorporateLoanFulfillmentArrangementInstanceRecord(CRCorporateLoanFulfillmentArrangementRetrieveOutputModelCorporateLoanFulfillmentArrangementInstanceRecord corporateLoanFulfillmentArrangementInstanceRecord) {
    this.corporateLoanFulfillmentArrangementInstanceRecord = corporateLoanFulfillmentArrangementInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Corporate Loan Fulfillment Arrangement instance retrieve service call 
   * @return corporateLoanFulfillmentArrangementRetrieveActionTaskReference
  **/

  public String getCorporateLoanFulfillmentArrangementRetrieveActionTaskReference() {
    return corporateLoanFulfillmentArrangementRetrieveActionTaskReference;
  }

  public void setCorporateLoanFulfillmentArrangementRetrieveActionTaskReference(String corporateLoanFulfillmentArrangementRetrieveActionTaskReference) {
    this.corporateLoanFulfillmentArrangementRetrieveActionTaskReference = corporateLoanFulfillmentArrangementRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return corporateLoanFulfillmentArrangementRetrieveActionTaskRecord
  **/

  public Object getCorporateLoanFulfillmentArrangementRetrieveActionTaskRecord() {
    return corporateLoanFulfillmentArrangementRetrieveActionTaskRecord;
  }

  public void setCorporateLoanFulfillmentArrangementRetrieveActionTaskRecord(Object corporateLoanFulfillmentArrangementRetrieveActionTaskRecord) {
    this.corporateLoanFulfillmentArrangementRetrieveActionTaskRecord = corporateLoanFulfillmentArrangementRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return corporateLoanFulfillmentArrangementRetrieveActionResponse
  **/

  public String getCorporateLoanFulfillmentArrangementRetrieveActionResponse() {
    return corporateLoanFulfillmentArrangementRetrieveActionResponse;
  }

  public void setCorporateLoanFulfillmentArrangementRetrieveActionResponse(String corporateLoanFulfillmentArrangementRetrieveActionResponse) {
    this.corporateLoanFulfillmentArrangementRetrieveActionResponse = corporateLoanFulfillmentArrangementRetrieveActionResponse;
  }


  /**
   * Get corporateLoanFulfillmentArrangementInstanceReportRecord
   * @return corporateLoanFulfillmentArrangementInstanceReportRecord
  **/

  public CRCorporateLoanFulfillmentArrangementRetrieveOutputModelCorporateLoanFulfillmentArrangementInstanceReportRecord getCorporateLoanFulfillmentArrangementInstanceReportRecord() {
    return corporateLoanFulfillmentArrangementInstanceReportRecord;
  }

  public void setCorporateLoanFulfillmentArrangementInstanceReportRecord(CRCorporateLoanFulfillmentArrangementRetrieveOutputModelCorporateLoanFulfillmentArrangementInstanceReportRecord corporateLoanFulfillmentArrangementInstanceReportRecord) {
    this.corporateLoanFulfillmentArrangementInstanceReportRecord = corporateLoanFulfillmentArrangementInstanceReportRecord;
  }


  /**
   * Get corporateLoanFulfillmentArrangementInstanceAnalysis
   * @return corporateLoanFulfillmentArrangementInstanceAnalysis
  **/

  public CRCorporateLoanFulfillmentArrangementRetrieveOutputModelCorporateLoanFulfillmentArrangementInstanceAnalysis getCorporateLoanFulfillmentArrangementInstanceAnalysis() {
    return corporateLoanFulfillmentArrangementInstanceAnalysis;
  }

  public void setCorporateLoanFulfillmentArrangementInstanceAnalysis(CRCorporateLoanFulfillmentArrangementRetrieveOutputModelCorporateLoanFulfillmentArrangementInstanceAnalysis corporateLoanFulfillmentArrangementInstanceAnalysis) {
    this.corporateLoanFulfillmentArrangementInstanceAnalysis = corporateLoanFulfillmentArrangementInstanceAnalysis;
  }


}

