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
 * StaffAbsence
 */

public class StaffAbsence implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("staff_member_id")
  private Integer staffMemberId = null;

  @JsonProperty("start_date")
  private OffsetDateTime startDate = null;

  @JsonProperty("end_date")
  private OffsetDateTime endDate = null;

  @JsonProperty("working_days_lost")
  private String workingDaysLost = null;

  @JsonProperty("absence_category")
  private String absenceCategory = null;

  @JsonProperty("illness_category")
  private String illnessCategory = null;

  @JsonProperty("pay_rate")
  private String payRate = null;

  public StaffAbsence id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public StaffAbsence staffMemberId(Integer staffMemberId) {
    this.staffMemberId = staffMemberId;
    return this;
  }

   /**
   * Get staffMemberId
   * @return staffMemberId
  **/
  @ApiModelProperty(value = "")
  public Integer getStaffMemberId() {
    return staffMemberId;
  }

  public void setStaffMemberId(Integer staffMemberId) {
    this.staffMemberId = staffMemberId;
  }

  public StaffAbsence startDate(OffsetDateTime startDate) {
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

  public StaffAbsence endDate(OffsetDateTime endDate) {
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

  public StaffAbsence workingDaysLost(String workingDaysLost) {
    this.workingDaysLost = workingDaysLost;
    return this;
  }

   /**
   * Get workingDaysLost
   * @return workingDaysLost
  **/
  @ApiModelProperty(value = "")
  public String getWorkingDaysLost() {
    return workingDaysLost;
  }

  public void setWorkingDaysLost(String workingDaysLost) {
    this.workingDaysLost = workingDaysLost;
  }

  public StaffAbsence absenceCategory(String absenceCategory) {
    this.absenceCategory = absenceCategory;
    return this;
  }

   /**
   * Get absenceCategory
   * @return absenceCategory
  **/
  @ApiModelProperty(value = "")
  public String getAbsenceCategory() {
    return absenceCategory;
  }

  public void setAbsenceCategory(String absenceCategory) {
    this.absenceCategory = absenceCategory;
  }

  public StaffAbsence illnessCategory(String illnessCategory) {
    this.illnessCategory = illnessCategory;
    return this;
  }

   /**
   * Get illnessCategory
   * @return illnessCategory
  **/
  @ApiModelProperty(value = "")
  public String getIllnessCategory() {
    return illnessCategory;
  }

  public void setIllnessCategory(String illnessCategory) {
    this.illnessCategory = illnessCategory;
  }

  public StaffAbsence payRate(String payRate) {
    this.payRate = payRate;
    return this;
  }

   /**
   * Get payRate
   * @return payRate
  **/
  @ApiModelProperty(value = "")
  public String getPayRate() {
    return payRate;
  }

  public void setPayRate(String payRate) {
    this.payRate = payRate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StaffAbsence staffAbsence = (StaffAbsence) o;
    return Objects.equals(this.id, staffAbsence.id) &&
        Objects.equals(this.staffMemberId, staffAbsence.staffMemberId) &&
        Objects.equals(this.startDate, staffAbsence.startDate) &&
        Objects.equals(this.endDate, staffAbsence.endDate) &&
        Objects.equals(this.workingDaysLost, staffAbsence.workingDaysLost) &&
        Objects.equals(this.absenceCategory, staffAbsence.absenceCategory) &&
        Objects.equals(this.illnessCategory, staffAbsence.illnessCategory) &&
        Objects.equals(this.payRate, staffAbsence.payRate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, staffMemberId, startDate, endDate, workingDaysLost, absenceCategory, illnessCategory, payRate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StaffAbsence {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    staffMemberId: ").append(toIndentedString(staffMemberId)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    workingDaysLost: ").append(toIndentedString(workingDaysLost)).append("\n");
    sb.append("    absenceCategory: ").append(toIndentedString(absenceCategory)).append("\n");
    sb.append("    illnessCategory: ").append(toIndentedString(illnessCategory)).append("\n");
    sb.append("    payRate: ").append(toIndentedString(payRate)).append("\n");
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

