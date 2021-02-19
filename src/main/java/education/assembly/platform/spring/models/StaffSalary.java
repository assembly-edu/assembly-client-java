/*
 * assembly-client-java 1.2.471
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
 * The salary detail of a staff member.
 */
@ApiModel(description = "The salary detail of a staff member.")

public class StaffSalary implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("object")
  private String object = "staff_salary";

  @JsonProperty("id")
  private Integer id = ;

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

  public StaffSalary object(String object) {
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

  public StaffSalary id(Integer id) {
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

  public StaffSalary hoursPerWeek(Float hoursPerWeek) {
    this.hoursPerWeek = hoursPerWeek;
    return this;
  }

   /**
   * Number of hours on which the contract is based
   * @return hoursPerWeek
  **/
  @ApiModelProperty(value = "Number of hours on which the contract is based")
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
   * Total contracted time expressed as a proportion of \&quot;full-time\&quot;
   * @return fte
  **/
  @ApiModelProperty(value = "Total contracted time expressed as a proportion of \"full-time\"")
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
   * Number of weeks per year that the contract operates
   * @return weeksPerYear
  **/
  @ApiModelProperty(value = "Number of weeks per year that the contract operates")
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
   * The pay range under which the member of staff is paid
   * @return payRange
  **/
  @ApiModelProperty(value = "The pay range under which the member of staff is paid")
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
   * Start date for this salary
   * @return startDate
  **/
  @ApiModelProperty(value = "Start date for this salary")
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
   * End date of this salary
   * @return endDate
  **/
  @ApiModelProperty(value = "End date of this salary")
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
   * Shows the pay framework under which a member of staff is paid
   * @return payScaleFramework
  **/
  @ApiModelProperty(value = "Shows the pay framework under which a member of staff is paid")
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
   * The location of the pay scale framework
   * @return regionalSpine
  **/
  @ApiModelProperty(value = "The location of the pay scale framework")
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
   * Annual salary, excluding additional payments
   * @return basePay
  **/
  @ApiModelProperty(value = "Annual salary, excluding additional payments")
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
   * Actual pay
   * @return actualPay
  **/
  @ApiModelProperty(value = "Actual pay")
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
   * Indicates the staff member&#39;s salary has been safeguarded
   * @return safeguardedSalary
  **/
  @ApiModelProperty(value = "Indicates the staff member's salary has been safeguarded")
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
    return Objects.equals(this.object, staffSalary.object) &&
        Objects.equals(this.id, staffSalary.id) &&
        Objects.equals(this.hoursPerWeek, staffSalary.hoursPerWeek) &&
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
    return Objects.hash(object, id, hoursPerWeek, fte, weeksPerYear, payRange, startDate, endDate, payScaleFramework, regionalSpine, basePay, actualPay, safeguardedSalary);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StaffSalary {\n");
    
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

