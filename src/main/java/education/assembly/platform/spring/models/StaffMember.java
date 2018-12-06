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
import education.assembly.platform.spring.models.StaffMemberDemographics;
import education.assembly.platform.spring.models.StaffMemberQualificationInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
import java.io.Serializable;

/**
 * StaffMember
 */

public class StaffMember implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("mis_id")
  private String misId = null;

  @JsonProperty("staff_code")
  private String staffCode = null;

  @JsonProperty("first_name")
  private String firstName = null;

  @JsonProperty("legal_first_name")
  private String legalFirstName = null;

  @JsonProperty("middle_name")
  private String middleName = null;

  @JsonProperty("last_name")
  private String lastName = null;

  @JsonProperty("legal_last_name")
  private String legalLastName = null;

  @JsonProperty("former_last_name")
  private String formerLastName = null;

  @JsonProperty("title")
  private String title = null;

  @JsonProperty("dob")
  private OffsetDateTime dob = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("is_teaching_staff")
  private Boolean isTeachingStaff = null;

  @JsonProperty("included_in_census")
  private Boolean includedInCensus = null;

  @JsonProperty("start_date")
  private String startDate = null;

  @JsonProperty("end_date")
  private String endDate = null;

  @JsonProperty("demographics")
  private List<StaffMemberDemographics> demographics = null;

  @JsonProperty("qualification_info")
  private List<StaffMemberQualificationInfo> qualificationInfo = null;

  public StaffMember id(Integer id) {
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

  public StaffMember misId(String misId) {
    this.misId = misId;
    return this;
  }

   /**
   * Get misId
   * @return misId
  **/
  @ApiModelProperty(value = "")
  public String getMisId() {
    return misId;
  }

  public void setMisId(String misId) {
    this.misId = misId;
  }

  public StaffMember staffCode(String staffCode) {
    this.staffCode = staffCode;
    return this;
  }

   /**
   * Get staffCode
   * @return staffCode
  **/
  @ApiModelProperty(value = "")
  public String getStaffCode() {
    return staffCode;
  }

  public void setStaffCode(String staffCode) {
    this.staffCode = staffCode;
  }

  public StaffMember firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * Get firstName
   * @return firstName
  **/
  @ApiModelProperty(value = "")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public StaffMember legalFirstName(String legalFirstName) {
    this.legalFirstName = legalFirstName;
    return this;
  }

   /**
   * Get legalFirstName
   * @return legalFirstName
  **/
  @ApiModelProperty(value = "")
  public String getLegalFirstName() {
    return legalFirstName;
  }

  public void setLegalFirstName(String legalFirstName) {
    this.legalFirstName = legalFirstName;
  }

  public StaffMember middleName(String middleName) {
    this.middleName = middleName;
    return this;
  }

   /**
   * Get middleName
   * @return middleName
  **/
  @ApiModelProperty(value = "")
  public String getMiddleName() {
    return middleName;
  }

  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  public StaffMember lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * Get lastName
   * @return lastName
  **/
  @ApiModelProperty(value = "")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public StaffMember legalLastName(String legalLastName) {
    this.legalLastName = legalLastName;
    return this;
  }

   /**
   * Get legalLastName
   * @return legalLastName
  **/
  @ApiModelProperty(value = "")
  public String getLegalLastName() {
    return legalLastName;
  }

  public void setLegalLastName(String legalLastName) {
    this.legalLastName = legalLastName;
  }

  public StaffMember formerLastName(String formerLastName) {
    this.formerLastName = formerLastName;
    return this;
  }

   /**
   * Get formerLastName
   * @return formerLastName
  **/
  @ApiModelProperty(value = "")
  public String getFormerLastName() {
    return formerLastName;
  }

  public void setFormerLastName(String formerLastName) {
    this.formerLastName = formerLastName;
  }

  public StaffMember title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @ApiModelProperty(value = "")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public StaffMember dob(OffsetDateTime dob) {
    this.dob = dob;
    return this;
  }

   /**
   * Get dob
   * @return dob
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getDob() {
    return dob;
  }

  public void setDob(OffsetDateTime dob) {
    this.dob = dob;
  }

  public StaffMember email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(value = "")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public StaffMember isTeachingStaff(Boolean isTeachingStaff) {
    this.isTeachingStaff = isTeachingStaff;
    return this;
  }

   /**
   * Get isTeachingStaff
   * @return isTeachingStaff
  **/
  @ApiModelProperty(value = "")
  public Boolean isgetIsTeachingStaff() {
    return isTeachingStaff;
  }

  public void setIsTeachingStaff(Boolean isTeachingStaff) {
    this.isTeachingStaff = isTeachingStaff;
  }

  public StaffMember includedInCensus(Boolean includedInCensus) {
    this.includedInCensus = includedInCensus;
    return this;
  }

   /**
   * Get includedInCensus
   * @return includedInCensus
  **/
  @ApiModelProperty(value = "")
  public Boolean isgetIncludedInCensus() {
    return includedInCensus;
  }

  public void setIncludedInCensus(Boolean includedInCensus) {
    this.includedInCensus = includedInCensus;
  }

  public StaffMember startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Get startDate
   * @return startDate
  **/
  @ApiModelProperty(value = "")
  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  public StaffMember endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * Get endDate
   * @return endDate
  **/
  @ApiModelProperty(value = "")
  public String getEndDate() {
    return endDate;
  }

  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  public StaffMember demographics(List<StaffMemberDemographics> demographics) {
    this.demographics = demographics;
    return this;
  }

  public StaffMember addDemographicsItem(StaffMemberDemographics demographicsItem) {
    if (this.demographics == null) {
      this.demographics = new ArrayList<StaffMemberDemographics>();
    }
    this.demographics.add(demographicsItem);
    return this;
  }

   /**
   * Get demographics
   * @return demographics
  **/
  @ApiModelProperty(value = "")
  public List<StaffMemberDemographics> getDemographics() {
    return demographics;
  }

  public void setDemographics(List<StaffMemberDemographics> demographics) {
    this.demographics = demographics;
  }

  public StaffMember qualificationInfo(List<StaffMemberQualificationInfo> qualificationInfo) {
    this.qualificationInfo = qualificationInfo;
    return this;
  }

  public StaffMember addQualificationInfoItem(StaffMemberQualificationInfo qualificationInfoItem) {
    if (this.qualificationInfo == null) {
      this.qualificationInfo = new ArrayList<StaffMemberQualificationInfo>();
    }
    this.qualificationInfo.add(qualificationInfoItem);
    return this;
  }

   /**
   * Get qualificationInfo
   * @return qualificationInfo
  **/
  @ApiModelProperty(value = "")
  public List<StaffMemberQualificationInfo> getQualificationInfo() {
    return qualificationInfo;
  }

  public void setQualificationInfo(List<StaffMemberQualificationInfo> qualificationInfo) {
    this.qualificationInfo = qualificationInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StaffMember staffMember = (StaffMember) o;
    return Objects.equals(this.id, staffMember.id) &&
        Objects.equals(this.misId, staffMember.misId) &&
        Objects.equals(this.staffCode, staffMember.staffCode) &&
        Objects.equals(this.firstName, staffMember.firstName) &&
        Objects.equals(this.legalFirstName, staffMember.legalFirstName) &&
        Objects.equals(this.middleName, staffMember.middleName) &&
        Objects.equals(this.lastName, staffMember.lastName) &&
        Objects.equals(this.legalLastName, staffMember.legalLastName) &&
        Objects.equals(this.formerLastName, staffMember.formerLastName) &&
        Objects.equals(this.title, staffMember.title) &&
        Objects.equals(this.dob, staffMember.dob) &&
        Objects.equals(this.email, staffMember.email) &&
        Objects.equals(this.isTeachingStaff, staffMember.isTeachingStaff) &&
        Objects.equals(this.includedInCensus, staffMember.includedInCensus) &&
        Objects.equals(this.startDate, staffMember.startDate) &&
        Objects.equals(this.endDate, staffMember.endDate) &&
        Objects.equals(this.demographics, staffMember.demographics) &&
        Objects.equals(this.qualificationInfo, staffMember.qualificationInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, misId, staffCode, firstName, legalFirstName, middleName, lastName, legalLastName, formerLastName, title, dob, email, isTeachingStaff, includedInCensus, startDate, endDate, demographics, qualificationInfo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StaffMember {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    misId: ").append(toIndentedString(misId)).append("\n");
    sb.append("    staffCode: ").append(toIndentedString(staffCode)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    legalFirstName: ").append(toIndentedString(legalFirstName)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    legalLastName: ").append(toIndentedString(legalLastName)).append("\n");
    sb.append("    formerLastName: ").append(toIndentedString(formerLastName)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    dob: ").append(toIndentedString(dob)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    isTeachingStaff: ").append(toIndentedString(isTeachingStaff)).append("\n");
    sb.append("    includedInCensus: ").append(toIndentedString(includedInCensus)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    demographics: ").append(toIndentedString(demographics)).append("\n");
    sb.append("    qualificationInfo: ").append(toIndentedString(qualificationInfo)).append("\n");
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

