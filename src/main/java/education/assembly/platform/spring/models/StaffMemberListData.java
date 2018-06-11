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
import org.threeten.bp.OffsetDateTime;
import java.io.Serializable;

/**
 * A staff member object represents a single staff member within a school.
 */
@ApiModel(description = "A staff member object represents a single staff member within a school.")

public class StaffMemberListData implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("object")
  private String object = null;

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

  @JsonProperty("dob")
  private String dob = null;

  @JsonProperty("title")
  private String title = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("is_teaching_staff")
  private Boolean isTeachingStaff = null;

  @JsonProperty("included_in_census")
  private Boolean includedInCensus = null;

  @JsonProperty("start_date")
  private OffsetDateTime startDate = null;

  @JsonProperty("end_date")
  private OffsetDateTime endDate = null;

  @JsonProperty("demographics")
  private StaffMemberDemographics demographics = null;

  @JsonProperty("qualification_info")
  private StaffMemberQualificationInfo qualificationInfo = null;

  public StaffMemberListData object(String object) {
    this.object = object;
    return this;
  }

   /**
   * Object type
   * @return object
  **/
  @ApiModelProperty(example = "staff_member", value = "Object type")
  public String getObject() {
    return object;
  }

  public void setObject(String object) {
    this.object = object;
  }

  public StaffMemberListData id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Internal stable ID given to each staff member in the Platform
   * @return id
  **/
  @ApiModelProperty(example = "24", value = "Internal stable ID given to each staff member in the Platform")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public StaffMemberListData misId(String misId) {
    this.misId = misId;
    return this;
  }

   /**
   * The ID of the staff member from the MIS
   * @return misId
  **/
  @ApiModelProperty(example = "214", value = "The ID of the staff member from the MIS")
  public String getMisId() {
    return misId;
  }

  public void setMisId(String misId) {
    this.misId = misId;
  }

  public StaffMemberListData staffCode(String staffCode) {
    this.staffCode = staffCode;
    return this;
  }

   /**
   * The staff code from the MIS
   * @return staffCode
  **/
  @ApiModelProperty(example = "TLA", value = "The staff code from the MIS")
  public String getStaffCode() {
    return staffCode;
  }

  public void setStaffCode(String staffCode) {
    this.staffCode = staffCode;
  }

  public StaffMemberListData firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * The first name of the staff member
   * @return firstName
  **/
  @ApiModelProperty(example = "Trevor", value = "The first name of the staff member")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public StaffMemberListData legalFirstName(String legalFirstName) {
    this.legalFirstName = legalFirstName;
    return this;
  }

   /**
   * The legal first name of the staff member
   * @return legalFirstName
  **/
  @ApiModelProperty(example = "Trevor", value = "The legal first name of the staff member")
  public String getLegalFirstName() {
    return legalFirstName;
  }

  public void setLegalFirstName(String legalFirstName) {
    this.legalFirstName = legalFirstName;
  }

  public StaffMemberListData middleName(String middleName) {
    this.middleName = middleName;
    return this;
  }

   /**
   * The middle name of the staff member
   * @return middleName
  **/
  @ApiModelProperty(example = "Lance", value = "The middle name of the staff member")
  public String getMiddleName() {
    return middleName;
  }

  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  public StaffMemberListData lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * The last name of the staff member
   * @return lastName
  **/
  @ApiModelProperty(example = "Taylor", value = "The last name of the staff member")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public StaffMemberListData legalLastName(String legalLastName) {
    this.legalLastName = legalLastName;
    return this;
  }

   /**
   * The legal last name of the staff member
   * @return legalLastName
  **/
  @ApiModelProperty(example = "Taylor", value = "The legal last name of the staff member")
  public String getLegalLastName() {
    return legalLastName;
  }

  public void setLegalLastName(String legalLastName) {
    this.legalLastName = legalLastName;
  }

  public StaffMemberListData formerLastName(String formerLastName) {
    this.formerLastName = formerLastName;
    return this;
  }

   /**
   * The former last name of the staff member
   * @return formerLastName
  **/
  @ApiModelProperty(example = "Jones", value = "The former last name of the staff member")
  public String getFormerLastName() {
    return formerLastName;
  }

  public void setFormerLastName(String formerLastName) {
    this.formerLastName = formerLastName;
  }

  public StaffMemberListData dob(String dob) {
    this.dob = dob;
    return this;
  }

   /**
   * The staff member&#39;s date of birth
   * @return dob
  **/
  @ApiModelProperty(example = "1979-10-30", value = "The staff member's date of birth")
  public String getDob() {
    return dob;
  }

  public void setDob(String dob) {
    this.dob = dob;
  }

  public StaffMemberListData title(String title) {
    this.title = title;
    return this;
  }

   /**
   * The title of the staff member
   * @return title
  **/
  @ApiModelProperty(example = "Mr", value = "The title of the staff member")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public StaffMemberListData email(String email) {
    this.email = email;
    return this;
  }

   /**
   * The email address of the staff member.
   * @return email
  **/
  @ApiModelProperty(example = "trevor.taylor@assembly.education", value = "The email address of the staff member.")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public StaffMemberListData isTeachingStaff(Boolean isTeachingStaff) {
    this.isTeachingStaff = isTeachingStaff;
    return this;
  }

   /**
   * Indicates whether the staff member is a teacher
   * @return isTeachingStaff
  **/
  @ApiModelProperty(example = "true", value = "Indicates whether the staff member is a teacher")
  public Boolean isIsTeachingStaff() {
    return isTeachingStaff;
  }

  public void setIsTeachingStaff(Boolean isTeachingStaff) {
    this.isTeachingStaff = isTeachingStaff;
  }

  public StaffMemberListData includedInCensus(Boolean includedInCensus) {
    this.includedInCensus = includedInCensus;
    return this;
  }

   /**
   * Indicates whether the staff member is a teacher
   * @return includedInCensus
  **/
  @ApiModelProperty(example = "true", value = "Indicates whether the staff member is a teacher")
  public Boolean isIncludedInCensus() {
    return includedInCensus;
  }

  public void setIncludedInCensus(Boolean includedInCensus) {
    this.includedInCensus = includedInCensus;
  }

  public StaffMemberListData startDate(OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * When the staff member&#39;s employment started
   * @return startDate
  **/
  @ApiModelProperty(example = "2011-09-01T00:00:00.000Z", value = "When the staff member's employment started")
  public OffsetDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }

  public StaffMemberListData endDate(OffsetDateTime endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * When the staff member&#39;s employment ended/is due to end
   * @return endDate
  **/
  @ApiModelProperty(example = "2079-06-06T23:59:00.000Z", value = "When the staff member's employment ended/is due to end")
  public OffsetDateTime getEndDate() {
    return endDate;
  }

  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }

  public StaffMemberListData demographics(StaffMemberDemographics demographics) {
    this.demographics = demographics;
    return this;
  }

   /**
   * Get demographics
   * @return demographics
  **/
  @ApiModelProperty(value = "")
  public StaffMemberDemographics getDemographics() {
    return demographics;
  }

  public void setDemographics(StaffMemberDemographics demographics) {
    this.demographics = demographics;
  }

  public StaffMemberListData qualificationInfo(StaffMemberQualificationInfo qualificationInfo) {
    this.qualificationInfo = qualificationInfo;
    return this;
  }

   /**
   * Get qualificationInfo
   * @return qualificationInfo
  **/
  @ApiModelProperty(value = "")
  public StaffMemberQualificationInfo getQualificationInfo() {
    return qualificationInfo;
  }

  public void setQualificationInfo(StaffMemberQualificationInfo qualificationInfo) {
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
    StaffMemberListData staffMemberListData = (StaffMemberListData) o;
    return Objects.equals(this.object, staffMemberListData.object) &&
        Objects.equals(this.id, staffMemberListData.id) &&
        Objects.equals(this.misId, staffMemberListData.misId) &&
        Objects.equals(this.staffCode, staffMemberListData.staffCode) &&
        Objects.equals(this.firstName, staffMemberListData.firstName) &&
        Objects.equals(this.legalFirstName, staffMemberListData.legalFirstName) &&
        Objects.equals(this.middleName, staffMemberListData.middleName) &&
        Objects.equals(this.lastName, staffMemberListData.lastName) &&
        Objects.equals(this.legalLastName, staffMemberListData.legalLastName) &&
        Objects.equals(this.formerLastName, staffMemberListData.formerLastName) &&
        Objects.equals(this.dob, staffMemberListData.dob) &&
        Objects.equals(this.title, staffMemberListData.title) &&
        Objects.equals(this.email, staffMemberListData.email) &&
        Objects.equals(this.isTeachingStaff, staffMemberListData.isTeachingStaff) &&
        Objects.equals(this.includedInCensus, staffMemberListData.includedInCensus) &&
        Objects.equals(this.startDate, staffMemberListData.startDate) &&
        Objects.equals(this.endDate, staffMemberListData.endDate) &&
        Objects.equals(this.demographics, staffMemberListData.demographics) &&
        Objects.equals(this.qualificationInfo, staffMemberListData.qualificationInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(object, id, misId, staffCode, firstName, legalFirstName, middleName, lastName, legalLastName, formerLastName, dob, title, email, isTeachingStaff, includedInCensus, startDate, endDate, demographics, qualificationInfo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StaffMemberListData {\n");
    
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    misId: ").append(toIndentedString(misId)).append("\n");
    sb.append("    staffCode: ").append(toIndentedString(staffCode)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    legalFirstName: ").append(toIndentedString(legalFirstName)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    legalLastName: ").append(toIndentedString(legalLastName)).append("\n");
    sb.append("    formerLastName: ").append(toIndentedString(formerLastName)).append("\n");
    sb.append("    dob: ").append(toIndentedString(dob)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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

