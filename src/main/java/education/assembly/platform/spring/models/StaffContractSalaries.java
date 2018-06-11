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

public class StaffContractSalaries implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("object")
  private String object = null;

  @JsonProperty("hours_per_week")
  private Float hoursPerWeek = null;

  @JsonProperty("fte")
  private Float fte = null;

  @JsonProperty("weeks_per_year")
  private Float weeksPerYear = null;

  @JsonProperty("pay_range")
  private String payRange = null;

  @JsonProperty("start_date")
  private OffsetDateTime startDate = null;

  @JsonProperty("end_date")
  private OffsetDateTime endDate = null;

  @JsonProperty("pay_scale_framework")
  private String payScaleFramework = null;

  @JsonProperty("regional_spine")
  private String regionalSpine = null;

  @JsonProperty("base_pay")
  private Float basePay = null;

  @JsonProperty("actual_pay")
  private Float actualPay = null;

  @JsonProperty("safeguarded_salary")
  private Boolean safeguardedSalary = null;

  public StaffContractSalaries object(String object) {
    this.object = object;
    return this;
  }

   /**
   * Object type
   * @return object
  **/
  @ApiModelProperty(example = "staff_salary", value = "Object type")
  public String getObject() {
    return object;
  }

  public void setObject(String object) {
    this.object = object;
  }

  public StaffContractSalaries hoursPerWeek(Float hoursPerWeek) {
    this.hoursPerWeek = hoursPerWeek;
    return this;
  }

   /**
   * No description
   * @return hoursPerWeek
  **/
  @ApiModelProperty(example = "36.0", value = "No description")
  public Float getHoursPerWeek() {
    return hoursPerWeek;
  }

  public void setHoursPerWeek(Float hoursPerWeek) {
    this.hoursPerWeek = hoursPerWeek;
  }

  public StaffContractSalaries fte(Float fte) {
    this.fte = fte;
    return this;
  }

   /**
   * No description
   * @return fte
  **/
  @ApiModelProperty(example = "1.0", value = "No description")
  public Float getFte() {
    return fte;
  }

  public void setFte(Float fte) {
    this.fte = fte;
  }

  public StaffContractSalaries weeksPerYear(Float weeksPerYear) {
    this.weeksPerYear = weeksPerYear;
    return this;
  }

   /**
   * No description
   * @return weeksPerYear
  **/
  @ApiModelProperty(example = "52.0", value = "No description")
  public Float getWeeksPerYear() {
    return weeksPerYear;
  }

  public void setWeeksPerYear(Float weeksPerYear) {
    this.weeksPerYear = weeksPerYear;
  }

  public StaffContractSalaries payRange(String payRange) {
    this.payRange = payRange;
    return this;
  }

   /**
   * No description
   * @return payRange
  **/
  @ApiModelProperty(example = "Leadership", value = "No description")
  public String getPayRange() {
    return payRange;
  }

  public void setPayRange(String payRange) {
    this.payRange = payRange;
  }

  public StaffContractSalaries startDate(OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * No description
   * @return startDate
  **/
  @ApiModelProperty(example = "2016-04-27T00:00:00.000Z", value = "No description")
  public OffsetDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }

  public StaffContractSalaries endDate(OffsetDateTime endDate) {
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

  public StaffContractSalaries payScaleFramework(String payScaleFramework) {
    this.payScaleFramework = payScaleFramework;
    return this;
  }

   /**
   * No description
   * @return payScaleFramework
  **/
  @ApiModelProperty(example = "N51", value = "No description")
  public String getPayScaleFramework() {
    return payScaleFramework;
  }

  public void setPayScaleFramework(String payScaleFramework) {
    this.payScaleFramework = payScaleFramework;
  }

  public StaffContractSalaries regionalSpine(String regionalSpine) {
    this.regionalSpine = regionalSpine;
    return this;
  }

   /**
   * No description
   * @return regionalSpine
  **/
  @ApiModelProperty(example = "London Fringe", value = "No description")
  public String getRegionalSpine() {
    return regionalSpine;
  }

  public void setRegionalSpine(String regionalSpine) {
    this.regionalSpine = regionalSpine;
  }

  public StaffContractSalaries basePay(Float basePay) {
    this.basePay = basePay;
    return this;
  }

   /**
   * No description
   * @return basePay
  **/
  @ApiModelProperty(example = "38400.0", value = "No description")
  public Float getBasePay() {
    return basePay;
  }

  public void setBasePay(Float basePay) {
    this.basePay = basePay;
  }

  public StaffContractSalaries actualPay(Float actualPay) {
    this.actualPay = actualPay;
    return this;
  }

   /**
   * No description
   * @return actualPay
  **/
  @ApiModelProperty(example = "38400.0", value = "No description")
  public Float getActualPay() {
    return actualPay;
  }

  public void setActualPay(Float actualPay) {
    this.actualPay = actualPay;
  }

  public StaffContractSalaries safeguardedSalary(Boolean safeguardedSalary) {
    this.safeguardedSalary = safeguardedSalary;
    return this;
  }

   /**
   * No description
   * @return safeguardedSalary
  **/
  @ApiModelProperty(example = "true", value = "No description")
  public Boolean isSafeguardedSalary() {
    return safeguardedSalary;
  }

  public void setSafeguardedSalary(Boolean safeguardedSalary) {
    this.safeguardedSalary = safeguardedSalary;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StaffContractSalaries staffContractSalaries = (StaffContractSalaries) o;
    return Objects.equals(this.object, staffContractSalaries.object) &&
        Objects.equals(this.hoursPerWeek, staffContractSalaries.hoursPerWeek) &&
        Objects.equals(this.fte, staffContractSalaries.fte) &&
        Objects.equals(this.weeksPerYear, staffContractSalaries.weeksPerYear) &&
        Objects.equals(this.payRange, staffContractSalaries.payRange) &&
        Objects.equals(this.startDate, staffContractSalaries.startDate) &&
        Objects.equals(this.endDate, staffContractSalaries.endDate) &&
        Objects.equals(this.payScaleFramework, staffContractSalaries.payScaleFramework) &&
        Objects.equals(this.regionalSpine, staffContractSalaries.regionalSpine) &&
        Objects.equals(this.basePay, staffContractSalaries.basePay) &&
        Objects.equals(this.actualPay, staffContractSalaries.actualPay) &&
        Objects.equals(this.safeguardedSalary, staffContractSalaries.safeguardedSalary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(object, hoursPerWeek, fte, weeksPerYear, payRange, startDate, endDate, payScaleFramework, regionalSpine, basePay, actualPay, safeguardedSalary);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StaffContractSalaries {\n");
    
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    hoursPerWeek: ").append(toIndentedString(hoursPerWeek)).append("\n");
    sb.append("    fte: ").append(toIndentedString(fte)).append("\n");
    sb.append("    weeksPerYear: ").append(toIndentedString(weeksPerYear)).append("\n");
    sb.append("    payRange: ").append(toIndentedString(payRange)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    payScaleFramework: ").append(toIndentedString(payScaleFramework)).append("\n");
    sb.append("    regionalSpine: ").append(toIndentedString(regionalSpine)).append("\n");
    sb.append("    basePay: ").append(toIndentedString(basePay)).append("\n");
    sb.append("    actualPay: ").append(toIndentedString(actualPay)).append("\n");
    sb.append("    safeguardedSalary: ").append(toIndentedString(safeguardedSalary)).append("\n");
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

