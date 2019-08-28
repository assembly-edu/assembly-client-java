/*
 * assembly-client-java 1.2.410
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
 * An allowance associated with a staff member.
 */
@ApiModel(description = "An allowance associated with a staff member.")

public class StaffAllowance implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("object")
  private String object = "staff_allowance";

  @JsonProperty("id")
  private Integer id = ;

  @JsonProperty("additional_payment_type")
  private String additionalPaymentType = ;

  @JsonProperty("additional_payment_amount")
  private Float additionalPaymentAmount = ;

  @JsonProperty("start_date")
  private OffsetDateTime startDate = ;

  @JsonProperty("end_date")
  private OffsetDateTime endDate = ;

  public StaffAllowance object(String object) {
    this.object = object;
    return this;
  }

   /**
   * Descriminator
   * @return object
  **/
  @ApiModelProperty(value = "Descriminator")
  public String getObject() {
    return object;
  }

  public void setObject(String object) {
    this.object = object;
  }

  public StaffAllowance id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Internal stable ID
   * @return id
  **/
  @ApiModelProperty(value = "Internal stable ID")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public StaffAllowance additionalPaymentType(String additionalPaymentType) {
    this.additionalPaymentType = additionalPaymentType;
    return this;
  }

   /**
   * Type of additional payment
   * @return additionalPaymentType
  **/
  @ApiModelProperty(value = "Type of additional payment")
  public String getAdditionalPaymentType() {
    return additionalPaymentType;
  }

  public void setAdditionalPaymentType(String additionalPaymentType) {
    this.additionalPaymentType = additionalPaymentType;
  }

  public StaffAllowance additionalPaymentAmount(Float additionalPaymentAmount) {
    this.additionalPaymentAmount = additionalPaymentAmount;
    return this;
  }

   /**
   * Amount of additional payment
   * @return additionalPaymentAmount
  **/
  @ApiModelProperty(value = "Amount of additional payment")
  public Float getAdditionalPaymentAmount() {
    return additionalPaymentAmount;
  }

  public void setAdditionalPaymentAmount(Float additionalPaymentAmount) {
    this.additionalPaymentAmount = additionalPaymentAmount;
  }

  public StaffAllowance startDate(OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Start date of additional payment
   * @return startDate
  **/
  @ApiModelProperty(value = "Start date of additional payment")
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
   * End date of additional payment
   * @return endDate
  **/
  @ApiModelProperty(value = "End date of additional payment")
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
    return Objects.equals(this.object, staffAllowance.object) &&
        Objects.equals(this.id, staffAllowance.id) &&
        Objects.equals(this.additionalPaymentType, staffAllowance.additionalPaymentType) &&
        Objects.equals(this.additionalPaymentAmount, staffAllowance.additionalPaymentAmount) &&
        Objects.equals(this.startDate, staffAllowance.startDate) &&
        Objects.equals(this.endDate, staffAllowance.endDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(object, id, additionalPaymentType, additionalPaymentAmount, startDate, endDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StaffAllowance {\n");
    
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

