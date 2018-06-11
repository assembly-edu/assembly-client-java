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
 * Details of staff absences recorded on the MIS.
 */
@ApiModel(description = "Details of staff absences recorded on the MIS.")

public class StaffAbsenceListData implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("object")
  private String object = null;

  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("staff_member_id")
  private Integer staffMemberId = null;

  @JsonProperty("start_date")
  private OffsetDateTime startDate = null;

  @JsonProperty("end_date")
  private OffsetDateTime endDate = null;

  @JsonProperty("working_days_lost")
  private Float workingDaysLost = null;

  @JsonProperty("absence_category")
  private String absenceCategory = null;

  @JsonProperty("illness_category")
  private String illnessCategory = null;

  @JsonProperty("pay_rate")
  private String payRate = null;

  public StaffAbsenceListData object(String object) {
    this.object = object;
    return this;
  }

   /**
   * Object type
   * @return object
  **/
  @ApiModelProperty(example = "staff_absence", value = "Object type")
  public String getObject() {
    return object;
  }

  public void setObject(String object) {
    this.object = object;
  }

  public StaffAbsenceListData id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Internal stable ID given to all absences on the Platform
   * @return id
  **/
  @ApiModelProperty(example = "12", value = "Internal stable ID given to all absences on the Platform")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public StaffAbsenceListData staffMemberId(Integer staffMemberId) {
    this.staffMemberId = staffMemberId;
    return this;
  }

   /**
   * The ID of the staff member who the absence is for
   * @return staffMemberId
  **/
  @ApiModelProperty(example = "112", value = "The ID of the staff member who the absence is for")
  public Integer getStaffMemberId() {
    return staffMemberId;
  }

  public void setStaffMemberId(Integer staffMemberId) {
    this.staffMemberId = staffMemberId;
  }

  public StaffAbsenceListData startDate(OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * The start date of the absence
   * @return startDate
  **/
  @ApiModelProperty(example = "2017-09-06T14:00:00.000Z", value = "The start date of the absence")
  public OffsetDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }

  public StaffAbsenceListData endDate(OffsetDateTime endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * The end date of the absence
   * @return endDate
  **/
  @ApiModelProperty(example = "2017-09-06T16:27:00.000Z", value = "The end date of the absence")
  public OffsetDateTime getEndDate() {
    return endDate;
  }

  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }

  public StaffAbsenceListData workingDaysLost(Float workingDaysLost) {
    this.workingDaysLost = workingDaysLost;
    return this;
  }

   /**
   * Number of working days that were lost during the absence
   * @return workingDaysLost
  **/
  @ApiModelProperty(example = "0.5", value = "Number of working days that were lost during the absence")
  public Float getWorkingDaysLost() {
    return workingDaysLost;
  }

  public void setWorkingDaysLost(Float workingDaysLost) {
    this.workingDaysLost = workingDaysLost;
  }

  public StaffAbsenceListData absenceCategory(String absenceCategory) {
    this.absenceCategory = absenceCategory;
    return this;
  }

   /**
   * The category of the absence
   * @return absenceCategory
  **/
  @ApiModelProperty(example = "OTH", value = "The category of the absence")
  public String getAbsenceCategory() {
    return absenceCategory;
  }

  public void setAbsenceCategory(String absenceCategory) {
    this.absenceCategory = absenceCategory;
  }

  public StaffAbsenceListData illnessCategory(String illnessCategory) {
    this.illnessCategory = illnessCategory;
    return this;
  }

   /**
   * If the absence category was &#39;Illness&#39;, the specific code
   * @return illnessCategory
  **/
  @ApiModelProperty(value = "If the absence category was 'Illness', the specific code")
  public String getIllnessCategory() {
    return illnessCategory;
  }

  public void setIllnessCategory(String illnessCategory) {
    this.illnessCategory = illnessCategory;
  }

  public StaffAbsenceListData payRate(String payRate) {
    this.payRate = payRate;
    return this;
  }

   /**
   * Whether or not the staff member was paid for the absence, and at what rate
   * @return payRate
  **/
  @ApiModelProperty(value = "Whether or not the staff member was paid for the absence, and at what rate")
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
    StaffAbsenceListData staffAbsenceListData = (StaffAbsenceListData) o;
    return Objects.equals(this.object, staffAbsenceListData.object) &&
        Objects.equals(this.id, staffAbsenceListData.id) &&
        Objects.equals(this.staffMemberId, staffAbsenceListData.staffMemberId) &&
        Objects.equals(this.startDate, staffAbsenceListData.startDate) &&
        Objects.equals(this.endDate, staffAbsenceListData.endDate) &&
        Objects.equals(this.workingDaysLost, staffAbsenceListData.workingDaysLost) &&
        Objects.equals(this.absenceCategory, staffAbsenceListData.absenceCategory) &&
        Objects.equals(this.illnessCategory, staffAbsenceListData.illnessCategory) &&
        Objects.equals(this.payRate, staffAbsenceListData.payRate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(object, id, staffMemberId, startDate, endDate, workingDaysLost, absenceCategory, illnessCategory, payRate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StaffAbsenceListData {\n");
    
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
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

