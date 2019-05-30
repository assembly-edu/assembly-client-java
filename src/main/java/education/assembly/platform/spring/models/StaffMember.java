/*
 * assembly-client-java 1.2.360
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
import education.assembly.platform.spring.models.EmailInfo;
import education.assembly.platform.spring.models.StaffMemberDemographics;
import education.assembly.platform.spring.models.StaffMemberQualificationInfo;
import education.assembly.platform.spring.models.TelephoneNumberInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
import java.io.Serializable;

/**
 * A single staff member within a school.
 */
@ApiModel(description = "A single staff member within a school.")

public class StaffMember implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("object")
  private String object = "staff_member";

  @JsonProperty("id")
  private Integer id = ;

  @JsonProperty("mis_id")
  private String misId = ;

  @JsonProperty("staff_code")
  private String staffCode = ;

  @JsonProperty("first_name")
  private String firstName = ;

  @JsonProperty("legal_first_name")
  private String legalFirstName = ;

  @JsonProperty("middle_name")
  private String middleName = ;

  @JsonProperty("last_name")
  private String lastName = ;

  @JsonProperty("legal_last_name")
  private String legalLastName = ;

  @JsonProperty("former_last_name")
  private String formerLastName = ;

  @JsonProperty("title")
  private String title = ;

  @JsonProperty("dob")
  private OffsetDateTime dob = ;

  @JsonProperty("email")
  private String email = ;

  @JsonProperty("emails")
  private List<EmailInfo> emails = null;

  @JsonProperty("telephone_numbers")
  private List<TelephoneNumberInfo> telephoneNumbers = null;

  @JsonProperty("is_teaching_staff")
  private Boolean isTeachingStaff = ;

  @JsonProperty("included_in_census")
  private Boolean includedInCensus = ;

  @JsonProperty("start_date")
  private OffsetDateTime startDate = ;

  @JsonProperty("end_date")
  private OffsetDateTime endDate = ;

  @JsonProperty("demographics")
  private StaffMemberDemographics demographics = null;

  @JsonProperty("qualification_info")
  private StaffMemberQualificationInfo qualificationInfo = null;

  public StaffMember object(String object) {
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

  public StaffMember id(Integer id) {
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

  public StaffMember misId(String misId) {
    this.misId = misId;
    return this;
  }

   /**
   * The ID of the staff member from the MIS
   * @return misId
  **/
  @ApiModelProperty(value = "The ID of the staff member from the MIS")
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
   * The staff code from the MIS
   * @return staffCode
  **/
  @ApiModelProperty(value = "The staff code from the MIS")
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
   * The first name the staff member wishes to go by, may be the same as &#x60;legal_first_name&#x60;
   * @return firstName
  **/
  @ApiModelProperty(value = "The first name the staff member wishes to go by, may be the same as `legal_first_name`")
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
   * The legal first name of the staff member
   * @return legalFirstName
  **/
  @ApiModelProperty(value = "The legal first name of the staff member")
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
   * The middle name of the staff member
   * @return middleName
  **/
  @ApiModelProperty(value = "The middle name of the staff member")
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
   * The last name the staff member wishes to go by, may be the same as &#x60;legal_last_name&#x60;
   * @return lastName
  **/
  @ApiModelProperty(value = "The last name the staff member wishes to go by, may be the same as `legal_last_name`")
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
   * The legal first name of the staff member, may be the same as &#x60;legal_last_name&#x60;
   * @return legalLastName
  **/
  @ApiModelProperty(value = "The legal first name of the staff member, may be the same as `legal_last_name`")
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
   * The former last name of the staff member, may be &#x60;null&#x60;
   * @return formerLastName
  **/
  @ApiModelProperty(value = "The former last name of the staff member, may be `null`")
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
   * The title of the staff member
   * @return title
  **/
  @ApiModelProperty(value = "The title of the staff member")
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
   * The staff member&#39;s date of birth
   * @return dob
  **/
  @ApiModelProperty(value = "The staff member's date of birth")
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
   * The email address of the staff member. Deprecated in favour of &#x60;emails&#x60;
   * @return email
  **/
  @ApiModelProperty(value = "The email address of the staff member. Deprecated in favour of `emails`")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public StaffMember emails(List<EmailInfo> emails) {
    this.emails = emails;
    return this;
  }

  public StaffMember addEmailsItem(EmailInfo emailsItem) {
    if (this.emails == null) {
      this.emails = new ArrayList<EmailInfo>();
    }
    this.emails.add(emailsItem);
    return this;
  }

   /**
   * The email addresses of the staff member.
   * @return emails
  **/
  @ApiModelProperty(value = "The email addresses of the staff member.")
  public List<EmailInfo> getEmails() {
    return emails;
  }

  public void setEmails(List<EmailInfo> emails) {
    this.emails = emails;
  }

  public StaffMember telephoneNumbers(List<TelephoneNumberInfo> telephoneNumbers) {
    this.telephoneNumbers = telephoneNumbers;
    return this;
  }

  public StaffMember addTelephoneNumbersItem(TelephoneNumberInfo telephoneNumbersItem) {
    if (this.telephoneNumbers == null) {
      this.telephoneNumbers = new ArrayList<TelephoneNumberInfo>();
    }
    this.telephoneNumbers.add(telephoneNumbersItem);
    return this;
  }

   /**
   * A list of telephone numbers for the staff member
   * @return telephoneNumbers
  **/
  @ApiModelProperty(value = "A list of telephone numbers for the staff member")
  public List<TelephoneNumberInfo> getTelephoneNumbers() {
    return telephoneNumbers;
  }

  public void setTelephoneNumbers(List<TelephoneNumberInfo> telephoneNumbers) {
    this.telephoneNumbers = telephoneNumbers;
  }

  public StaffMember isTeachingStaff(Boolean isTeachingStaff) {
    this.isTeachingStaff = isTeachingStaff;
    return this;
  }

   /**
   * Indicates whether the staff member is a teacher
   * @return isTeachingStaff
  **/
  @ApiModelProperty(value = "Indicates whether the staff member is a teacher")
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
   * Indicates whether the staff member is included in official statistical returns
   * @return includedInCensus
  **/
  @ApiModelProperty(value = "Indicates whether the staff member is included in official statistical returns")
  public Boolean isgetIncludedInCensus() {
    return includedInCensus;
  }

  public void setIncludedInCensus(Boolean includedInCensus) {
    this.includedInCensus = includedInCensus;
  }

  public StaffMember startDate(OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * The date the staff member first started working at the school
   * @return startDate
  **/
  @ApiModelProperty(value = "The date the staff member first started working at the school")
  public OffsetDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }

  public StaffMember endDate(OffsetDateTime endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * The date the staff member left the school, or &#x60;null&#x60; if still active
   * @return endDate
  **/
  @ApiModelProperty(value = "The date the staff member left the school, or `null` if still active")
  public OffsetDateTime getEndDate() {
    return endDate;
  }

  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }

  public StaffMember demographics(StaffMemberDemographics demographics) {
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

  public StaffMember qualificationInfo(StaffMemberQualificationInfo qualificationInfo) {
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
    StaffMember staffMember = (StaffMember) o;
    return Objects.equals(this.object, staffMember.object) &&
        Objects.equals(this.id, staffMember.id) &&
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
        Objects.equals(this.emails, staffMember.emails) &&
        Objects.equals(this.telephoneNumbers, staffMember.telephoneNumbers) &&
        Objects.equals(this.isTeachingStaff, staffMember.isTeachingStaff) &&
        Objects.equals(this.includedInCensus, staffMember.includedInCensus) &&
        Objects.equals(this.startDate, staffMember.startDate) &&
        Objects.equals(this.endDate, staffMember.endDate) &&
        Objects.equals(this.demographics, staffMember.demographics) &&
        Objects.equals(this.qualificationInfo, staffMember.qualificationInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(object, id, misId, staffCode, firstName, legalFirstName, middleName, lastName, legalLastName, formerLastName, title, dob, email, emails, telephoneNumbers, isTeachingStaff, includedInCensus, startDate, endDate, demographics, qualificationInfo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StaffMember {\n");
    
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
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    dob: ").append(toIndentedString(dob)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    emails: ").append(toIndentedString(emails)).append("\n");
    sb.append("    telephoneNumbers: ").append(toIndentedString(telephoneNumbers)).append("\n");
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

