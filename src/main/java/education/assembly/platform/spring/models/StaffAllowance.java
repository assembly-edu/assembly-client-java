/*
 * assembly-client-java 1.1.0
 *
 * Copyright (c) 2018 Assembly
 * http://assembly.education
 * help@assembly.education
 *
 * Licensed under MIT (https://spdx.org/licenses/MIT.html)
 *
 * NOTE: This class has been automatically generated, do not edit manually.
 */

package education.assembly.platform.spring.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.threeten.bp.OffsetDateTime;
import java.io.Serializable;

/**
 * StaffAllowance
 */

public class StaffAllowance implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("additional_payment_type")
  private String additionalPaymentType = ;

  @JsonProperty("additional_payment_amount")
  private String additionalPaymentAmount = ;

  @JsonProperty("start_date")
  private OffsetDateTime startDate = ;

  @JsonProperty("end_date")
  private OffsetDateTime endDate = ;

  public StaffAllowance additionalPaymentType(String additionalPaymentType) {
    this.additionalPaymentType = additionalPaymentType;
    return this;
  }

   /**
   * Get additionalPaymentType
   * @return additionalPaymentType
  **/
  @ApiModelProperty(value = "")
  public String getAdditionalPaymentType() {
    return additionalPaymentType;
  }

  public void setAdditionalPaymentType(String additionalPaymentType) {
    this.additionalPaymentType = additionalPaymentType;
  }

  public StaffAllowance additionalPaymentAmount(String additionalPaymentAmount) {
    this.additionalPaymentAmount = additionalPaymentAmount;
    return this;
  }

   /**
   * Get additionalPaymentAmount
   * @return additionalPaymentAmount
  **/
  @ApiModelProperty(value = "")
  public String getAdditionalPaymentAmount() {
    return additionalPaymentAmount;
  }

  public void setAdditionalPaymentAmount(String additionalPaymentAmount) {
    this.additionalPaymentAmount = additionalPaymentAmount;
  }

  public StaffAllowance startDate(OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Get startDate
   * @return startDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }

  public StaffAllowance endDate(OffsetDateTime endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * Get endDate
   * @return endDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getEndDate() {
    return endDate;
  }

  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StaffAllowance staffAllowance = (StaffAllowance) o;
    return Objects.equals(this.additionalPaymentType, staffAllowance.additionalPaymentType) &&
        Objects.equals(this.additionalPaymentAmount, staffAllowance.additionalPaymentAmount) &&
        Objects.equals(this.startDate, staffAllowance.startDate) &&
        Objects.equals(this.endDate, staffAllowance.endDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalPaymentType, additionalPaymentAmount, startDate, endDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StaffAllowance {\n");
    
    sb.append("    additionalPaymentType: ").append(toIndentedString(additionalPaymentType)).append("\n");
    sb.append("    additionalPaymentAmount: ").append(toIndentedString(additionalPaymentAmount)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

