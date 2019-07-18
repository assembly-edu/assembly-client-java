/*
 * assembly-client-java 1.2.376
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
import education.assembly.platform.spring.models.StudentAddress;
import education.assembly.platform.spring.models.StudentContacts;
import education.assembly.platform.spring.models.StudentDemographics;
import education.assembly.platform.spring.models.StudentLanguages;
import education.assembly.platform.spring.models.StudentMedical;
import education.assembly.platform.spring.models.StudentPhoto;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
import java.io.Serializable;

/**
 * A single student within a school.
 */
@ApiModel(description = "A single student within a school.")

public class Student implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("object")
  private String object = "student";

  @JsonProperty("id")
  private Integer id = ;

  @JsonProperty("year_code")
  private String yearCode = ;

  @JsonProperty("upn")
  private String upn = ;

  @JsonProperty("former_upn")
  private String formerUpn = ;

  @JsonProperty("uln")
  private String uln = ;

  @JsonProperty("mis_id")
  private String misId = ;

  @JsonProperty("pan")
  private String pan = ;

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

  @JsonProperty("dob")
  private OffsetDateTime dob = ;

  @JsonProperty("start_date")
  private OffsetDateTime startDate = ;

  @JsonProperty("end_date")
  private OffsetDateTime endDate = ;

  @JsonProperty("enrolment_status")
  private String enrolmentStatus = ;

  @JsonProperty("demographics")
  private StudentDemographics demographics = null;

  @JsonProperty("medical")
  private StudentMedical medical = null;

  @JsonProperty("contacts")
  private List<StudentContacts> contacts = null;

  @JsonProperty("emails")
  private List<EmailInfo> emails = null;

  @JsonProperty("address")
  private StudentAddress address = null;

  @JsonProperty("languages")
  private StudentLanguages languages = null;

  @JsonProperty("photo")
  private StudentPhoto photo = null;

  public Student object(String object) {
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

  public Student id(Integer id) {
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

  public Student yearCode(String yearCode) {
    this.yearCode = yearCode;
    return this;
  }

   /**
   * The year group the student currently belongs to
   * @return yearCode
  **/
  @ApiModelProperty(value = "The year group the student currently belongs to")
  public String getYearCode() {
    return yearCode;
  }

  public void setYearCode(String yearCode) {
    this.yearCode = yearCode;
  }

  public Student upn(String upn) {
    this.upn = upn;
    return this;
  }

   /**
   * Unique Pupil Number (UPN) - a DfE-mandated 13-character code that identifies each pupil
   * @return upn
  **/
  @ApiModelProperty(value = "Unique Pupil Number (UPN) - a DfE-mandated 13-character code that identifies each pupil")
  public String getUpn() {
    return upn;
  }

  public void setUpn(String upn) {
    this.upn = upn;
  }

  public Student formerUpn(String formerUpn) {
    this.formerUpn = formerUpn;
    return this;
  }

   /**
   * The previous UPN where a pupil has held another UPN whilst at a school
   * @return formerUpn
  **/
  @ApiModelProperty(value = "The previous UPN where a pupil has held another UPN whilst at a school")
  public String getFormerUpn() {
    return formerUpn;
  }

  public void setFormerUpn(String formerUpn) {
    this.formerUpn = formerUpn;
  }

  public Student uln(String uln) {
    this.uln = uln;
    return this;
  }

   /**
   * Unique Learner Number (ULN) - a LRS-mandated 10-character code that identifies each pupil
   * @return uln
  **/
  @ApiModelProperty(value = "Unique Learner Number (ULN) - a LRS-mandated 10-character code that identifies each pupil")
  public String getUln() {
    return uln;
  }

  public void setUln(String uln) {
    this.uln = uln;
  }

  public Student misId(String misId) {
    this.misId = misId;
    return this;
  }

   /**
   * The ID of a student from the MIS
   * @return misId
  **/
  @ApiModelProperty(value = "The ID of a student from the MIS")
  public String getMisId() {
    return misId;
  }

  public void setMisId(String misId) {
    this.misId = misId;
  }

  public Student pan(String pan) {
    this.pan = pan;
    return this;
  }

   /**
   * A student&#39;s \&quot;pupil admission number\&quot;. This field is often exposed in the front end of the MIS, and may be the same as &#x60;mis_id&#x60;
   * @return pan
  **/
  @ApiModelProperty(value = "A student's \"pupil admission number\". This field is often exposed in the front end of the MIS, and may be the same as `mis_id`")
  public String getPan() {
    return pan;
  }

  public void setPan(String pan) {
    this.pan = pan;
  }

  public Student firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * The first name the student wishes to go by, may be the same as &#x60;legal_first_name&#x60;
   * @return firstName
  **/
  @ApiModelProperty(value = "The first name the student wishes to go by, may be the same as `legal_first_name`")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public Student legalFirstName(String legalFirstName) {
    this.legalFirstName = legalFirstName;
    return this;
  }

   /**
   * The legal first name of the student
   * @return legalFirstName
  **/
  @ApiModelProperty(value = "The legal first name of the student")
  public String getLegalFirstName() {
    return legalFirstName;
  }

  public void setLegalFirstName(String legalFirstName) {
    this.legalFirstName = legalFirstName;
  }

  public Student middleName(String middleName) {
    this.middleName = middleName;
    return this;
  }

   /**
   * The middle name of the student
   * @return middleName
  **/
  @ApiModelProperty(value = "The middle name of the student")
  public String getMiddleName() {
    return middleName;
  }

  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  public Student lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * The last name the student wishes to go by, may be the same as &#x60;legal_last_name&#x60;
   * @return lastName
  **/
  @ApiModelProperty(value = "The last name the student wishes to go by, may be the same as `legal_last_name`")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Student legalLastName(String legalLastName) {
    this.legalLastName = legalLastName;
    return this;
  }

   /**
   * The legal first name of the student, may be the same as &#x60;legal_last_name&#x60;
   * @return legalLastName
  **/
  @ApiModelProperty(value = "The legal first name of the student, may be the same as `legal_last_name`")
  public String getLegalLastName() {
    return legalLastName;
  }

  public void setLegalLastName(String legalLastName) {
    this.legalLastName = legalLastName;
  }

  public Student formerLastName(String formerLastName) {
    this.formerLastName = formerLastName;
    return this;
  }

   /**
   * The former last name of the student, may be &#x60;null&#x60;
   * @return formerLastName
  **/
  @ApiModelProperty(value = "The former last name of the student, may be `null`")
  public String getFormerLastName() {
    return formerLastName;
  }

  public void setFormerLastName(String formerLastName) {
    this.formerLastName = formerLastName;
  }

  public Student dob(OffsetDateTime dob) {
    this.dob = dob;
    return this;
  }

   /**
   * The date of birth of the student
   * @return dob
  **/
  @ApiModelProperty(value = "The date of birth of the student")
  public OffsetDateTime getDob() {
    return dob;
  }

  public void setDob(OffsetDateTime dob) {
    this.dob = dob;
  }

  public Student startDate(OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * The date that the student first joined the school
   * @return startDate
  **/
  @ApiModelProperty(value = "The date that the student first joined the school")
  public OffsetDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }

  public Student endDate(OffsetDateTime endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * The date that the student left the school, or &#x60;null&#x60; if still a current student
   * @return endDate
  **/
  @ApiModelProperty(value = "The date that the student left the school, or `null` if still a current student")
  public OffsetDateTime getEndDate() {
    return endDate;
  }

  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }

  public Student enrolmentStatus(String enrolmentStatus) {
    this.enrolmentStatus = enrolmentStatus;
    return this;
  }

   /**
   * The enrolment status of the student
   * @return enrolmentStatus
  **/
  @ApiModelProperty(value = "The enrolment status of the student")
  public String getEnrolmentStatus() {
    return enrolmentStatus;
  }

  public void setEnrolmentStatus(String enrolmentStatus) {
    this.enrolmentStatus = enrolmentStatus;
  }

  public Student demographics(StudentDemographics demographics) {
    this.demographics = demographics;
    return this;
  }

   /**
   * Get demographics
   * @return demographics
  **/
  @ApiModelProperty(value = "")
  public StudentDemographics getDemographics() {
    return demographics;
  }

  public void setDemographics(StudentDemographics demographics) {
    this.demographics = demographics;
  }

  public Student medical(StudentMedical medical) {
    this.medical = medical;
    return this;
  }

   /**
   * Get medical
   * @return medical
  **/
  @ApiModelProperty(value = "")
  public StudentMedical getMedical() {
    return medical;
  }

  public void setMedical(StudentMedical medical) {
    this.medical = medical;
  }

  public Student contacts(List<StudentContacts> contacts) {
    this.contacts = contacts;
    return this;
  }

  public Student addContactsItem(StudentContacts contactsItem) {
    if (this.contacts == null) {
      this.contacts = new ArrayList<StudentContacts>();
    }
    this.contacts.add(contactsItem);
    return this;
  }

   /**
   * A list of contact IDs which are associated with this student, and their relationship
   * @return contacts
  **/
  @ApiModelProperty(value = "A list of contact IDs which are associated with this student, and their relationship")
  public List<StudentContacts> getContacts() {
    return contacts;
  }

  public void setContacts(List<StudentContacts> contacts) {
    this.contacts = contacts;
  }

  public Student emails(List<EmailInfo> emails) {
    this.emails = emails;
    return this;
  }

  public Student addEmailsItem(EmailInfo emailsItem) {
    if (this.emails == null) {
      this.emails = new ArrayList<EmailInfo>();
    }
    this.emails.add(emailsItem);
    return this;
  }

   /**
   * A list of emails for the student
   * @return emails
  **/
  @ApiModelProperty(value = "A list of emails for the student")
  public List<EmailInfo> getEmails() {
    return emails;
  }

  public void setEmails(List<EmailInfo> emails) {
    this.emails = emails;
  }

  public Student address(StudentAddress address) {
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @ApiModelProperty(value = "")
  public StudentAddress getAddress() {
    return address;
  }

  public void setAddress(StudentAddress address) {
    this.address = address;
  }

  public Student languages(StudentLanguages languages) {
    this.languages = languages;
    return this;
  }

   /**
   * Get languages
   * @return languages
  **/
  @ApiModelProperty(value = "")
  public StudentLanguages getLanguages() {
    return languages;
  }

  public void setLanguages(StudentLanguages languages) {
    this.languages = languages;
  }

  public Student photo(StudentPhoto photo) {
    this.photo = photo;
    return this;
  }

   /**
   * Get photo
   * @return photo
  **/
  @ApiModelProperty(value = "")
  public StudentPhoto getPhoto() {
    return photo;
  }

  public void setPhoto(StudentPhoto photo) {
    this.photo = photo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Student student = (Student) o;
    return Objects.equals(this.object, student.object) &&
        Objects.equals(this.id, student.id) &&
        Objects.equals(this.yearCode, student.yearCode) &&
        Objects.equals(this.upn, student.upn) &&
        Objects.equals(this.formerUpn, student.formerUpn) &&
        Objects.equals(this.uln, student.uln) &&
        Objects.equals(this.misId, student.misId) &&
        Objects.equals(this.pan, student.pan) &&
        Objects.equals(this.firstName, student.firstName) &&
        Objects.equals(this.legalFirstName, student.legalFirstName) &&
        Objects.equals(this.middleName, student.middleName) &&
        Objects.equals(this.lastName, student.lastName) &&
        Objects.equals(this.legalLastName, student.legalLastName) &&
        Objects.equals(this.formerLastName, student.formerLastName) &&
        Objects.equals(this.dob, student.dob) &&
        Objects.equals(this.startDate, student.startDate) &&
        Objects.equals(this.endDate, student.endDate) &&
        Objects.equals(this.enrolmentStatus, student.enrolmentStatus) &&
        Objects.equals(this.demographics, student.demographics) &&
        Objects.equals(this.medical, student.medical) &&
        Objects.equals(this.contacts, student.contacts) &&
        Objects.equals(this.emails, student.emails) &&
        Objects.equals(this.address, student.address) &&
        Objects.equals(this.languages, student.languages) &&
        Objects.equals(this.photo, student.photo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(object, id, yearCode, upn, formerUpn, uln, misId, pan, firstName, legalFirstName, middleName, lastName, legalLastName, formerLastName, dob, startDate, endDate, enrolmentStatus, demographics, medical, contacts, emails, address, languages, photo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Student {\n");
    
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    yearCode: ").append(toIndentedString(yearCode)).append("\n");
    sb.append("    upn: ").append(toIndentedString(upn)).append("\n");
    sb.append("    formerUpn: ").append(toIndentedString(formerUpn)).append("\n");
    sb.append("    uln: ").append(toIndentedString(uln)).append("\n");
    sb.append("    misId: ").append(toIndentedString(misId)).append("\n");
    sb.append("    pan: ").append(toIndentedString(pan)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    legalFirstName: ").append(toIndentedString(legalFirstName)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    legalLastName: ").append(toIndentedString(legalLastName)).append("\n");
    sb.append("    formerLastName: ").append(toIndentedString(formerLastName)).append("\n");
    sb.append("    dob: ").append(toIndentedString(dob)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    enrolmentStatus: ").append(toIndentedString(enrolmentStatus)).append("\n");
    sb.append("    demographics: ").append(toIndentedString(demographics)).append("\n");
    sb.append("    medical: ").append(toIndentedString(medical)).append("\n");
    sb.append("    contacts: ").append(toIndentedString(contacts)).append("\n");
    sb.append("    emails: ").append(toIndentedString(emails)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    languages: ").append(toIndentedString(languages)).append("\n");
    sb.append("    photo: ").append(toIndentedString(photo)).append("\n");
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

