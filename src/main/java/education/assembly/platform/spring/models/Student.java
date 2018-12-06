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
import education.assembly.platform.spring.models.Contact;
import education.assembly.platform.spring.models.StudentAddress;
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
 * Student
 */

public class Student implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("year_code")
  private String yearCode = null;

  @JsonProperty("upn")
  private String upn = null;

  @JsonProperty("former_upn")
  private String formerUpn = null;

  @JsonProperty("mis_id")
  private String misId = null;

  @JsonProperty("pan")
  private String pan = null;

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
  private OffsetDateTime dob = null;

  @JsonProperty("start_date")
  private OffsetDateTime startDate = null;

  @JsonProperty("end_date")
  private OffsetDateTime endDate = null;

  @JsonProperty("enrolment_status")
  private String enrolmentStatus = null;

  @JsonProperty("demographics")
  private StudentDemographics demographics = null;

  @JsonProperty("medical")
  private StudentMedical medical = null;

  @JsonProperty("contacts")
  private List<Contact> contacts = null;

  @JsonProperty("address")
  private StudentAddress address = null;

  @JsonProperty("languages")
  private StudentLanguages languages = null;

  @JsonProperty("photo")
  private StudentPhoto photo = null;

  public Student id(Integer id) {
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

  public Student yearCode(String yearCode) {
    this.yearCode = yearCode;
    return this;
  }

   /**
   * Get yearCode
   * @return yearCode
  **/
  @ApiModelProperty(value = "")
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
   * Get upn
   * @return upn
  **/
  @ApiModelProperty(value = "")
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
   * Get formerUpn
   * @return formerUpn
  **/
  @ApiModelProperty(value = "")
  public String getFormerUpn() {
    return formerUpn;
  }

  public void setFormerUpn(String formerUpn) {
    this.formerUpn = formerUpn;
  }

  public Student misId(String misId) {
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

  public Student pan(String pan) {
    this.pan = pan;
    return this;
  }

   /**
   * Get pan
   * @return pan
  **/
  @ApiModelProperty(value = "")
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

  public Student legalFirstName(String legalFirstName) {
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

  public Student middleName(String middleName) {
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

  public Student lastName(String lastName) {
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

  public Student legalLastName(String legalLastName) {
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

  public Student formerLastName(String formerLastName) {
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

  public Student dob(OffsetDateTime dob) {
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

  public Student startDate(OffsetDateTime startDate) {
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

  public Student endDate(OffsetDateTime endDate) {
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

  public Student enrolmentStatus(String enrolmentStatus) {
    this.enrolmentStatus = enrolmentStatus;
    return this;
  }

   /**
   * Get enrolmentStatus
   * @return enrolmentStatus
  **/
  @ApiModelProperty(value = "")
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

  public Student contacts(List<Contact> contacts) {
    this.contacts = contacts;
    return this;
  }

  public Student addContactsItem(Contact contactsItem) {
    if (this.contacts == null) {
      this.contacts = new ArrayList<Contact>();
    }
    this.contacts.add(contactsItem);
    return this;
  }

   /**
   * Get contacts
   * @return contacts
  **/
  @ApiModelProperty(value = "")
  public List<Contact> getContacts() {
    return contacts;
  }

  public void setContacts(List<Contact> contacts) {
    this.contacts = contacts;
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
    return Objects.equals(this.id, student.id) &&
        Objects.equals(this.yearCode, student.yearCode) &&
        Objects.equals(this.upn, student.upn) &&
        Objects.equals(this.formerUpn, student.formerUpn) &&
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
        Objects.equals(this.address, student.address) &&
        Objects.equals(this.languages, student.languages) &&
        Objects.equals(this.photo, student.photo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, yearCode, upn, formerUpn, misId, pan, firstName, legalFirstName, middleName, lastName, legalLastName, formerLastName, dob, startDate, endDate, enrolmentStatus, demographics, medical, contacts, address, languages, photo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Student {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    yearCode: ").append(toIndentedString(yearCode)).append("\n");
    sb.append("    upn: ").append(toIndentedString(upn)).append("\n");
    sb.append("    formerUpn: ").append(toIndentedString(formerUpn)).append("\n");
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

