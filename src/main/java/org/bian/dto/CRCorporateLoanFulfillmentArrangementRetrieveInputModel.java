package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCorporateLoanFulfillmentArrangementRetrieveInputModelCorporateLoanFulfillmentArrangementInstanceAnalysis;
import org.bian.dto.CRCorporateLoanFulfillmentArrangementRetrieveInputModelCorporateLoanFulfillmentArrangementInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRCorporateLoanFulfillmentArrangementRetrieveInputModel
 */
public class CRCorporateLoanFulfillmentArrangementRetrieveInputModel   {
  private Object corporateLoanFulfillmentArrangementRetrieveActionTaskRecord = null;

  private String corporateLoanFulfillmentArrangementRetrieveActionRequest = null;

  private CRCorporateLoanFulfillmentArrangementRetrieveInputModelCorporateLoanFulfillmentArrangementInstanceReportRecord corporateLoanFulfillmentArrangementInstanceReportRecord = null;

  private CRCorporateLoanFulfillmentArrangementRetrieveInputModelCorporateLoanFulfillmentArrangementInstanceAnalysis corporateLoanFulfillmentArrangementInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return corporateLoanFulfillmentArrangementRetrieveActionRequest
  **/

  public String getCorporateLoanFulfillmentArrangementRetrieveActionRequest() {
    return corporateLoanFulfillmentArrangementRetrieveActionRequest;
  }

  public void setCorporateLoanFulfillmentArrangementRetrieveActionRequest(String corporateLoanFulfillmentArrangementRetrieveActionRequest) {
    this.corporateLoanFulfillmentArrangementRetrieveActionRequest = corporateLoanFulfillmentArrangementRetrieveActionRequest;
  }


  /**
   * Get corporateLoanFulfillmentArrangementInstanceReportRecord
   * @return corporateLoanFulfillmentArrangementInstanceReportRecord
  **/

  public CRCorporateLoanFulfillmentArrangementRetrieveInputModelCorporateLoanFulfillmentArrangementInstanceReportRecord getCorporateLoanFulfillmentArrangementInstanceReportRecord() {
    return corporateLoanFulfillmentArrangementInstanceReportRecord;
  }

  public void setCorporateLoanFulfillmentArrangementInstanceReportRecord(CRCorporateLoanFulfillmentArrangementRetrieveInputModelCorporateLoanFulfillmentArrangementInstanceReportRecord corporateLoanFulfillmentArrangementInstanceReportRecord) {
    this.corporateLoanFulfillmentArrangementInstanceReportRecord = corporateLoanFulfillmentArrangementInstanceReportRecord;
  }


  /**
   * Get corporateLoanFulfillmentArrangementInstanceAnalysis
   * @return corporateLoanFulfillmentArrangementInstanceAnalysis
  **/

  public CRCorporateLoanFulfillmentArrangementRetrieveInputModelCorporateLoanFulfillmentArrangementInstanceAnalysis getCorporateLoanFulfillmentArrangementInstanceAnalysis() {
    return corporateLoanFulfillmentArrangementInstanceAnalysis;
  }

  public void setCorporateLoanFulfillmentArrangementInstanceAnalysis(CRCorporateLoanFulfillmentArrangementRetrieveInputModelCorporateLoanFulfillmentArrangementInstanceAnalysis corporateLoanFulfillmentArrangementInstanceAnalysis) {
    this.corporateLoanFulfillmentArrangementInstanceAnalysis = corporateLoanFulfillmentArrangementInstanceAnalysis;
  }


}

