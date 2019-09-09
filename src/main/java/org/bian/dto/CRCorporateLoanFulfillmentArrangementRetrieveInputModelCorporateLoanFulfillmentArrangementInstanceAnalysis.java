package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCorporateLoanFulfillmentArrangementRetrieveInputModelCorporateLoanFulfillmentArrangementInstanceAnalysis
 */
public class CRCorporateLoanFulfillmentArrangementRetrieveInputModelCorporateLoanFulfillmentArrangementInstanceAnalysis   {
  private String corporateLoanFulfillmentArrangementInstanceAnalysisReference = null;

  private String corporateLoanFulfillmentArrangementInstanceAnalysisReportType = null;

  private String corporateLoanFulfillmentArrangementInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return corporateLoanFulfillmentArrangementInstanceAnalysisReference
  **/

  public String getCorporateLoanFulfillmentArrangementInstanceAnalysisReference() {
    return corporateLoanFulfillmentArrangementInstanceAnalysisReference;
  }

  public void setCorporateLoanFulfillmentArrangementInstanceAnalysisReference(String corporateLoanFulfillmentArrangementInstanceAnalysisReference) {
    this.corporateLoanFulfillmentArrangementInstanceAnalysisReference = corporateLoanFulfillmentArrangementInstanceAnalysisReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return corporateLoanFulfillmentArrangementInstanceAnalysisParameters
  **/

  public String getCorporateLoanFulfillmentArrangementInstanceAnalysisParameters() {
    return corporateLoanFulfillmentArrangementInstanceAnalysisParameters;
  }

  public void setCorporateLoanFulfillmentArrangementInstanceAnalysisParameters(String corporateLoanFulfillmentArrangementInstanceAnalysisParameters) {
    this.corporateLoanFulfillmentArrangementInstanceAnalysisParameters = corporateLoanFulfillmentArrangementInstanceAnalysisParameters;
  }


}

