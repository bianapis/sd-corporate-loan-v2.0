package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCorporateLoanFulfillmentArrangementRetrieveInputModelCorporateLoanFulfillmentArrangementInstanceReportRecord
 */
public class CRCorporateLoanFulfillmentArrangementRetrieveInputModelCorporateLoanFulfillmentArrangementInstanceReportRecord   {
  private String corporateLoanFulfillmentArrangementInstanceReportReference = null;

  private String corporateLoanFulfillmentArrangementInstanceReportType = null;

  private String corporateLoanFulfillmentArrangementInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return corporateLoanFulfillmentArrangementInstanceReportReference
  **/

  public String getCorporateLoanFulfillmentArrangementInstanceReportReference() {
    return corporateLoanFulfillmentArrangementInstanceReportReference;
  }

  public void setCorporateLoanFulfillmentArrangementInstanceReportReference(String corporateLoanFulfillmentArrangementInstanceReportReference) {
    this.corporateLoanFulfillmentArrangementInstanceReportReference = corporateLoanFulfillmentArrangementInstanceReportReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return corporateLoanFulfillmentArrangementInstanceReportParameters
  **/

  public String getCorporateLoanFulfillmentArrangementInstanceReportParameters() {
    return corporateLoanFulfillmentArrangementInstanceReportParameters;
  }

  public void setCorporateLoanFulfillmentArrangementInstanceReportParameters(String corporateLoanFulfillmentArrangementInstanceReportParameters) {
    this.corporateLoanFulfillmentArrangementInstanceReportParameters = corporateLoanFulfillmentArrangementInstanceReportParameters;
  }


}

