/*
 * assembly-client-java 1.0.0
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
 * No description
 */
@ApiModel(description = "No description")

public class StaffContractAllowances implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("object")
  private String object = null;

  @JsonProperty("additional_payment_type")
  private String additionalPaymentType = null;

  @JsonProperty("additional_payment_amount")
  private Float additionalPaymentAmount = null;

  @JsonProperty("start_date")
  private OffsetDateTime startDate = null;

  @JsonProperty("end_date")
  private OffsetDateTime endDate = null;

  public StaffContractAllowances object(String object) {
    this.object = object;
    return this;
  }

   /**
   * Object type
   * @return object
  **/
  @ApiModelProperty(example = "staff_allowance", value = "Object type")
  public String getObject() {
    return object;
  }

  public void setObject(String object) {
    this.object = object;
  }

  public StaffContractAllowances additionalPaymentType(String additionalPaymentType) {
    this.additionalPaymentType = additionalPaymentType;
    return this;
  }

   /**
   * No description
   * @return additionalPaymentType
  **/
  @ApiModelProperty(example = "Teaching and Learning Responsibility Payments", value = "No description")
  public String getAdditionalPaymentType() {
    return additionalPaymentType;
  }

  public void setAdditionalPaymentType(String additionalPaymentType) {
    this.additionalPaymentType = additionalPaymentType;
  }

  public StaffContractAllowances additionalPaymentAmount(Float additionalPaymentAmount) {
    this.additionalPaymentAmount = additionalPaymentAmount;
    return this;
  }

   /**
   * No description
   * @return additionalPaymentAmount
  **/
  @ApiModelProperty(example = "3100.0", value = "No description")
  public Float getAdditionalPaymentAmount() {
    return additionalPaymentAmount;
  }

  public void setAdditionalPaymentAmount(Float additionalPaymentAmount) {
    this.additionalPaymentAmount = additionalPaymentAmount;
  }

  public StaffContractAllowances startDate(OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * No description
   * @return startDate
  **/
  @ApiModelProperty(example = "2017-07-15T00:00:00.000Z", value = "No description")
  public OffsetDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }

  public StaffContractAllowances endDate(OffsetDateTime endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * No description
   * @return endDate
  **/
  @ApiModelProperty(value = "No description")
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
    StaffContractAllowances staffContractAllowances = (StaffContractAllowances) o;
    return Objects.equals(this.object, staffContractAllowances.object) &&
        Objects.equals(this.additionalPaymentType, staffContractAllowances.additionalPaymentType) &&
        Objects.equals(this.additionalPaymentAmount, staffContractAllowances.additionalPaymentAmount) &&
        Objects.equals(this.startDate, staffContractAllowances.startDate) &&
        Objects.equals(this.endDate, staffContractAllowances.endDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(object, additionalPaymentType, additionalPaymentAmount, startDate, endDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StaffContractAllowances {\n");
    
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
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

