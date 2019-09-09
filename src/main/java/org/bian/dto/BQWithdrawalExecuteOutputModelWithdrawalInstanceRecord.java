package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQWithdrawalExecuteOutputModelWithdrawalInstanceRecordPaymentTransaction;

import javax.validation.Valid;
  
/**
 * BQWithdrawalExecuteOutputModelWithdrawalInstanceRecord
 */
public class BQWithdrawalExecuteOutputModelWithdrawalInstanceRecord   {
  private BQWithdrawalExecuteOutputModelWithdrawalInstanceRecordPaymentTransaction paymentTransaction = null;


  /**
   * Get paymentTransaction
   * @return paymentTransaction
  **/

  public BQWithdrawalExecuteOutputModelWithdrawalInstanceRecordPaymentTransaction getPaymentTransaction() {
    return paymentTransaction;
  }

  public void setPaymentTransaction(BQWithdrawalExecuteOutputModelWithdrawalInstanceRecordPaymentTransaction paymentTransaction) {
    this.paymentTransaction = paymentTransaction;
  }


}

