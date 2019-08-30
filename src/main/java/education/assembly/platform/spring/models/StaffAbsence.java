/*
 * assembly-client-java 1.2.412
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
 * Detail of a staff&#39;s absence recorded on the MIS.
 */
@ApiModel(description = "Detail of a staff's absence recorded on the MIS.")

public class StaffAbsence implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("object")
  private String object = "staff_absence";

  @JsonProperty("id")
  private Integer id = ;

  @JsonProperty("staff_member_id")
  private Integer staffMemberId = ;

  @JsonProperty("start_date")
  private OffsetDateTime startDate = ;

  @JsonProperty("end_date")
  private OffsetDateTime endDate = ;

  @JsonProperty("working_days_lost")
  private Float workingDaysLost = ;

  @JsonProperty("absence_category")
  private String absenceCategory = ;

  @JsonProperty("absence_category_code")
  private String absenceCategoryCode = ;

  @JsonProperty("illness_category")
  private String illnessCategory = ;

  @JsonProperty("pay_rate")
  private String payRate = ;

  public StaffAbsence object(String object) {
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

  public StaffAbsence id(Integer id) {
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

  public StaffAbsence staffMemberId(Integer staffMemberId) {
    this.staffMemberId = staffMemberId;
    return this;
  }

   /**
   * The ID of the staff member who the absence is for
   * @return staffMemberId
  **/
  @ApiModelProperty(value = "The ID of the staff member who the absence is for")
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
   * The start date of the absence
   * @return startDate
  **/
  @ApiModelProperty(value = "The start date of the absence")
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
   * The end date of the absence
   * @return endDate
  **/
  @ApiModelProperty(value = "The end date of the absence")
  public OffsetDateTime getEndDate() {
    return endDate;
  }

  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }

  public StaffAbsence workingDaysLost(Float workingDaysLost) {
    this.workingDaysLost = workingDaysLost;
    return this;
  }

   /**
   * Number of working days that were lost during the absence
   * @return workingDaysLost
  **/
  @ApiModelProperty(value = "Number of working days that were lost during the absence")
  public Float getWorkingDaysLost() {
    return workingDaysLost;
  }

  public void setWorkingDaysLost(Float workingDaysLost) {
    this.workingDaysLost = workingDaysLost;
  }

  public StaffAbsence absenceCategory(String absenceCategory) {
    this.absenceCategory = absenceCategory;
    return this;
  }

   /**
   * The category of the absence
   * @return absenceCategory
  **/
  @ApiModelProperty(value = "The category of the absence")
  public String getAbsenceCategory() {
    return absenceCategory;
  }

  public void setAbsenceCategory(String absenceCategory) {
    this.absenceCategory = absenceCategory;
  }

  public StaffAbsence absenceCategoryCode(String absenceCategoryCode) {
    this.absenceCategoryCode = absenceCategoryCode;
    return this;
  }

   /**
   * The category code of the absence
   * @return absenceCategoryCode
  **/
  @ApiModelProperty(value = "The category code of the absence")
  public String getAbsenceCategoryCode() {
    return absenceCategoryCode;
  }

  public void setAbsenceCategoryCode(String absenceCategoryCode) {
    this.absenceCategoryCode = absenceCategoryCode;
  }

  public StaffAbsence illnessCategory(String illnessCategory) {
    this.illnessCategory = illnessCategory;
    return this;
  }

   /**
   * If the absence category was \&quot;Illness\&quot;, the specific code
   * @return illnessCategory
  **/
  @ApiModelProperty(value = "If the absence category was \"Illness\", the specific code")
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
   * Whether or not the staff member was paid for the absence
   * @return payRate
  **/
  @ApiModelProperty(value = "Whether or not the staff member was paid for the absence")
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
    return Objects.equals(this.object, staffAbsence.object) &&
        Objects.equals(this.id, staffAbsence.id) &&
        Objects.equals(this.staffMemberId, staffAbsence.staffMemberId) &&
        Objects.equals(this.startDate, staffAbsence.startDate) &&
        Objects.equals(this.endDate, staffAbsence.endDate) &&
        Objects.equals(this.workingDaysLost, staffAbsence.workingDaysLost) &&
        Objects.equals(this.absenceCategory, staffAbsence.absenceCategory) &&
        Objects.equals(this.absenceCategoryCode, staffAbsence.absenceCategoryCode) &&
        Objects.equals(this.illnessCategory, staffAbsence.illnessCategory) &&
        Objects.equals(this.payRate, staffAbsence.payRate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(object, id, staffMemberId, startDate, endDate, workingDaysLost, absenceCategory, absenceCategoryCode, illnessCategory, payRate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StaffAbsence {\n");
    
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    staffMemberId: ").append(toIndentedString(staffMemberId)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    workingDaysLost: ").append(toIndentedString(workingDaysLost)).append("\n");
    sb.append("    absenceCategory: ").append(toIndentedString(absenceCategory)).append("\n");
    sb.append("    absenceCategoryCode: ").append(toIndentedString(absenceCategoryCode)).append("\n");
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

