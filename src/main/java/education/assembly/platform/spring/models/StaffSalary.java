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
 * StaffSalary
 */

public class StaffSalary implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("hours_per_week")
  private Float hoursPerWeek = ;

  @JsonProperty("fte")
  private Float fte = ;

  @JsonProperty("weeks_per_year")
  private Float weeksPerYear = ;

  @JsonProperty("pay_range")
  private String payRange = ;

  @JsonProperty("start_date")
  private OffsetDateTime startDate = ;

  @JsonProperty("end_date")
  private OffsetDateTime endDate = ;

  @JsonProperty("pay_scale_framework")
  private String payScaleFramework = ;

  @JsonProperty("regional_spine")
  private String regionalSpine = ;

  @JsonProperty("base_pay")
  private Float basePay = ;

  @JsonProperty("actual_pay")
  private Float actualPay = ;

  @JsonProperty("safeguarded_salary")
  private Boolean safeguardedSalary = ;

  public StaffSalary hoursPerWeek(Float hoursPerWeek) {
    this.hoursPerWeek = hoursPerWeek;
    return this;
  }

   /**
   * Get hoursPerWeek
   * @return hoursPerWeek
  **/
  @ApiModelProperty(value = "")
  public Float getHoursPerWeek() {
    return hoursPerWeek;
  }

  public void setHoursPerWeek(Float hoursPerWeek) {
    this.hoursPerWeek = hoursPerWeek;
  }

  public StaffSalary fte(Float fte) {
    this.fte = fte;
    return this;
  }

   /**
   * Get fte
   * @return fte
  **/
  @ApiModelProperty(value = "")
  public Float getFte() {
    return fte;
  }

  public void setFte(Float fte) {
    this.fte = fte;
  }

  public StaffSalary weeksPerYear(Float weeksPerYear) {
    this.weeksPerYear = weeksPerYear;
    return this;
  }

   /**
   * Get weeksPerYear
   * @return weeksPerYear
  **/
  @ApiModelProperty(value = "")
  public Float getWeeksPerYear() {
    return weeksPerYear;
  }

  public void setWeeksPerYear(Float weeksPerYear) {
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

  public StaffSalary basePay(Float basePay) {
    this.basePay = basePay;
    return this;
  }

   /**
   * Get basePay
   * @return basePay
  **/
  @ApiModelProperty(value = "")
  public Float getBasePay() {
    return basePay;
  }

  public void setBasePay(Float basePay) {
    this.basePay = basePay;
  }

  public StaffSalary actualPay(Float actualPay) {
    this.actualPay = actualPay;
    return this;
  }

   /**
   * Get actualPay
   * @return actualPay
  **/
  @ApiModelProperty(value = "")
  public Float getActualPay() {
    return actualPay;
  }

  public void setActualPay(Float actualPay) {
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

