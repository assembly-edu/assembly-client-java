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
 * StaffSalary
 */

public class StaffSalary implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("hours_per_week")
  private String hoursPerWeek = null;

  @JsonProperty("fte")
  private String fte = null;

  @JsonProperty("weeks_per_year")
  private String weeksPerYear = null;

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
  private String basePay = null;

  @JsonProperty("actual_pay")
  private String actualPay = null;

  @JsonProperty("safeguarded_salary")
  private Boolean safeguardedSalary = null;

  public StaffSalary hoursPerWeek(String hoursPerWeek) {
    this.hoursPerWeek = hoursPerWeek;
    return this;
  }

   /**
   * Get hoursPerWeek
   * @return hoursPerWeek
  **/
  @ApiModelProperty(value = "")
  public String getHoursPerWeek() {
    return hoursPerWeek;
  }

  public void setHoursPerWeek(String hoursPerWeek) {
    this.hoursPerWeek = hoursPerWeek;
  }

  public StaffSalary fte(String fte) {
    this.fte = fte;
    return this;
  }

   /**
   * Get fte
   * @return fte
  **/
  @ApiModelProperty(value = "")
  public String getFte() {
    return fte;
  }

  public void setFte(String fte) {
    this.fte = fte;
  }

  public StaffSalary weeksPerYear(String weeksPerYear) {
    this.weeksPerYear = weeksPerYear;
    return this;
  }

   /**
   * Get weeksPerYear
   * @return weeksPerYear
  **/
  @ApiModelProperty(value = "")
  public String getWeeksPerYear() {
    return weeksPerYear;
  }

  public void setWeeksPerYear(String weeksPerYear) {
    this.weeksPerYear = weeksPerYear;
  }

  public StaffSalary payRange(String payRange) {
    this.payRange = payRange;
    return this;
  }

   /**
   * Get payRange
   * @return payRange
  **/
  @ApiModelProperty(value = "")
  public String getPayRange() {
    return payRange;
  }

  public void setPayRange(String payRange) {
    this.payRange = payRange;
  }

  public StaffSalary startDate(OffsetDateTime startDate) {
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

  public StaffSalary endDate(OffsetDateTime endDate) {
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

  public StaffSalary payScaleFramework(String payScaleFramework) {
    this.payScaleFramework = payScaleFramework;
    return this;
  }

   /**
   * Get payScaleFramework
   * @return payScaleFramework
  **/
  @ApiModelProperty(value = "")
  public String getPayScaleFramework() {
    return payScaleFramework;
  }

  public void setPayScaleFramework(String payScaleFramework) {
    this.payScaleFramework = payScaleFramework;
  }

  public StaffSalary regionalSpine(String regionalSpine) {
    this.regionalSpine = regionalSpine;
    return this;
  }

   /**
   * Get regionalSpine
   * @return regionalSpine
  **/
  @ApiModelProperty(value = "")
  public String getRegionalSpine() {
    return regionalSpine;
  }

  public void setRegionalSpine(String regionalSpine) {
    this.regionalSpine = regionalSpine;
  }

  public StaffSalary basePay(String basePay) {
    this.basePay = basePay;
    return this;
  }

   /**
   * Get basePay
   * @return basePay
  **/
  @ApiModelProperty(value = "")
  public String getBasePay() {
    return basePay;
  }

  public void setBasePay(String basePay) {
    this.basePay = basePay;
  }

  public StaffSalary actualPay(String actualPay) {
    this.actualPay = actualPay;
    return this;
  }

   /**
   * Get actualPay
   * @return actualPay
  **/
  @ApiModelProperty(value = "")
  public String getActualPay() {
    return actualPay;
  }

  public void setActualPay(String actualPay) {
    this.actualPay = actualPay;
  }

  public StaffSalary safeguardedSalary(Boolean safeguardedSalary) {
    this.safeguardedSalary = safeguardedSalary;
    return this;
  }

   /**
   * Get safeguardedSalary
   * @return safeguardedSalary
  **/
  @ApiModelProperty(value = "")
  public Boolean isgetSafeguardedSalary() {
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
    StaffSalary staffSalary = (StaffSalary) o;
    return Objects.equals(this.hoursPerWeek, staffSalary.hoursPerWeek) &&
        Objects.equals(this.fte, staffSalary.fte) &&
        Objects.equals(this.weeksPerYear, staffSalary.weeksPerYear) &&
        Objects.equals(this.payRange, staffSalary.payRange) &&
        Objects.equals(this.startDate, staffSalary.startDate) &&
        Objects.equals(this.endDate, staffSalary.endDate) &&
        Objects.equals(this.payScaleFramework, staffSalary.payScaleFramework) &&
        Objects.equals(this.regionalSpine, staffSalary.regionalSpine) &&
        Objects.equals(this.basePay, staffSalary.basePay) &&
        Objects.equals(this.actualPay, staffSalary.actualPay) &&
        Objects.equals(this.safeguardedSalary, staffSalary.safeguardedSalary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hoursPerWeek, fte, weeksPerYear, payRange, startDate, endDate, payScaleFramework, regionalSpine, basePay, actualPay, safeguardedSalary);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StaffSalary {\n");
    
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

