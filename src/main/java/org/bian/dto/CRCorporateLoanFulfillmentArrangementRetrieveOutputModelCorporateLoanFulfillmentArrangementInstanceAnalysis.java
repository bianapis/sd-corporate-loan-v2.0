package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCorporateLoanFulfillmentArrangementRetrieveOutputModelCorporateLoanFulfillmentArrangementInstanceAnalysis
 */
public class CRCorporateLoanFulfillmentArrangementRetrieveOutputModelCorporateLoanFulfillmentArrangementInstanceAnalysis   {
  private String corporateLoanFulfillmentArrangementInstanceAnalysisData = null;

  private String corporateLoanFulfillmentArrangementInstanceAnalysisReportType = null;

  private Object corporateLoanFulfillmentArrangementInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return corporateLoanFulfillmentArrangementInstanceAnalysisData
  **/

  public String getCorporateLoanFulfillmentArrangementInstanceAnalysisData() {
    return corporateLoanFulfillmentArrangementInstanceAnalysisData;
  }

  public void setCorporateLoanFulfillmentArrangementInstanceAnalysisData(String corporateLoanFulfillmentArrangementInstanceAnalysisData) {
    this.corporateLoanFulfillmentArrangementInstanceAnalysisData = corporateLoanFulfillmentArrangementInstanceAnalysisData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return corporateLoanFulfillmentArrangementInstanceAnalysisReportType
  **/

  public String getCorporateLoanFulfillmentArrangementInstanceAnalysisReportType() {
    return corporateLoanFulfillmentArrangementInstanceAnalysisReportType;
  }

  public void setCorporateLoanFulfillmentArrangementInstanceAnalysisReportType(String corporateLoanFulfillmentArrangementInstanceAnalysisReportType) {
    this.corporateLoanFulfillmentArrangementInstanceAnalysisReportType = corporateLoanFulfillmentArrangementInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return corporateLoanFulfillmentArrangementInstanceAnalysisReport
  **/

  public Object getCorporateLoanFulfillmentArrangementInstanceAnalysisReport() {
    return corporateLoanFulfillmentArrangementInstanceAnalysisReport;
  }

  public void setCorporateLoanFulfillmentArrangementInstanceAnalysisReport(Object corporateLoanFulfillmentArrangementInstanceAnalysisReport) {
    this.corporateLoanFulfillmentArrangementInstanceAnalysisReport = corporateLoanFulfillmentArrangementInstanceAnalysisReport;
  }


}

