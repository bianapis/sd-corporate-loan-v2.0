package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCorporateLoanFulfillmentArrangementRetrieveOutputModelCorporateLoanFulfillmentArrangementInstanceReportRecord
 */
public class CRCorporateLoanFulfillmentArrangementRetrieveOutputModelCorporateLoanFulfillmentArrangementInstanceReportRecord   {
  private String corporateLoanFulfillmentArrangementInstanceReportData = null;

  private String corporateLoanFulfillmentArrangementInstanceReportType = null;

  private Object corporateLoanFulfillmentArrangementInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return corporateLoanFulfillmentArrangementInstanceReportData
  **/

  public String getCorporateLoanFulfillmentArrangementInstanceReportData() {
    return corporateLoanFulfillmentArrangementInstanceReportData;
  }

  public void setCorporateLoanFulfillmentArrangementInstanceReportData(String corporateLoanFulfillmentArrangementInstanceReportData) {
    this.corporateLoanFulfillmentArrangementInstanceReportData = corporateLoanFulfillmentArrangementInstanceReportData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return corporateLoanFulfillmentArrangementInstanceReportType
  **/

  public String getCorporateLoanFulfillmentArrangementInstanceReportType() {
    return corporateLoanFulfillmentArrangementInstanceReportType;
  }

  public void setCorporateLoanFulfillmentArrangementInstanceReportType(String corporateLoanFulfillmentArrangementInstanceReportType) {
    this.corporateLoanFulfillmentArrangementInstanceReportType = corporateLoanFulfillmentArrangementInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return corporateLoanFulfillmentArrangementInstanceReport
  **/

  public Object getCorporateLoanFulfillmentArrangementInstanceReport() {
    return corporateLoanFulfillmentArrangementInstanceReport;
  }

  public void setCorporateLoanFulfillmentArrangementInstanceReport(Object corporateLoanFulfillmentArrangementInstanceReport) {
    this.corporateLoanFulfillmentArrangementInstanceReport = corporateLoanFulfillmentArrangementInstanceReport;
  }


}

