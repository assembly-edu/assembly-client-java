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
import education.assembly.platform.spring.models.ContactListData;
import education.assembly.platform.spring.models.StudentAddresses;
import education.assembly.platform.spring.models.StudentDemographics;
import education.assembly.platform.spring.models.StudentLanguages;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.LocalDate;
import org.threeten.bp.OffsetDateTime;
import java.io.Serializable;

/**
 * A student object represents a single student within a school.
 */
@ApiModel(description = "A student object represents a single student within a school.")

public class StudentListData implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("object")
  private String object = null;

  @JsonProperty("id")
  private Integer id = null;

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
  private LocalDate dob = null;

  /**
   * The year group the student currently belongs to *Values*  |Value|Description| |---|---| |&#x60;1&#x60;|Year 1| |&#x60;2&#x60;|Year 2| |&#x60;3&#x60;|Year 3| |&#x60;4&#x60;|Year 4| |&#x60;5&#x60;|Year 5| |&#x60;6&#x60;|Year 6| |&#x60;7&#x60;|Year 7| |&#x60;8&#x60;|Year 8| |&#x60;9&#x60;|Year 9| |&#x60;R&#x60;|Reception| |&#x60;10&#x60;|Year 10| |&#x60;11&#x60;|Year 11| |&#x60;12&#x60;|Year 12| |&#x60;13&#x60;|Year 13| |&#x60;N1&#x60;|Nursery first year| |&#x60;N2&#x60;|Nursery second year| 
   */
  public enum YearCodeEnum {
    _1("1"),
    
    _2("2"),
    
    _3("3"),
    
    _4("4"),
    
    _5("5"),
    
    _6("6"),
    
    _7("7"),
    
    _8("8"),
    
    _9("9"),
    
    R("R"),
    
    _10("10"),
    
    _11("11"),
    
    _12("12"),
    
    _13("13"),
    
    N1("N1"),
    
    N2("N2");

    private String value;

    YearCodeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static YearCodeEnum fromValue(String text) {
      for (YearCodeEnum b : YearCodeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("year_code")
  private YearCodeEnum yearCode = null;

  @JsonProperty("upn")
  private String upn = null;

  @JsonProperty("former_upn")
  private String formerUpn = null;

  @JsonProperty("mis_id")
  private String misId = null;

  @JsonProperty("pan")
  private String pan = null;

  @JsonProperty("start_date")
  private OffsetDateTime startDate = null;

  @JsonProperty("end_date")
  private OffsetDateTime endDate = null;

  @JsonProperty("enrolment_status")
  private String enrolmentStatus = null;

  @JsonProperty("demographics")
  private StudentDemographics demographics = null;

  @JsonProperty("contact")
  private List<ContactListData> contact = null;

  @JsonProperty("addresses")
  private StudentAddresses addresses = null;

  @JsonProperty("languages")
  private StudentLanguages languages = null;

  public StudentListData object(String object) {
    this.object = object;
    return this;
  }

   /**
   * Object type
   * @return object
  **/
  @ApiModelProperty(example = "student", value = "Object type")
  public String getObject() {
    return object;
  }

  public void setObject(String object) {
    this.object = object;
  }

  public StudentListData id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Internal stable ID given to students in the Platform
   * @return id
  **/
  @ApiModelProperty(example = "48", value = "Internal stable ID given to students in the Platform")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public StudentListData firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * The first name of the student
   * @return firstName
  **/
  @ApiModelProperty(example = "Duncan", value = "The first name of the student")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public StudentListData legalFirstName(String legalFirstName) {
    this.legalFirstName = legalFirstName;
    return this;
  }

   /**
   * The legal first name of the student
   * @return legalFirstName
  **/
  @ApiModelProperty(example = "Duncan", value = "The legal first name of the student")
  public String getLegalFirstName() {
    return legalFirstName;
  }

  public void setLegalFirstName(String legalFirstName) {
    this.legalFirstName = legalFirstName;
  }

  public StudentListData middleName(String middleName) {
    this.middleName = middleName;
    return this;
  }

   /**
   * The middle name of the student
   * @return middleName
  **/
  @ApiModelProperty(example = "Peter", value = "The middle name of the student")
  public String getMiddleName() {
    return middleName;
  }

  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  public StudentListData lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * The last name of the student
   * @return lastName
  **/
  @ApiModelProperty(example = "Smith", value = "The last name of the student")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public StudentListData legalLastName(String legalLastName) {
    this.legalLastName = legalLastName;
    return this;
  }

   /**
   * The legal last name of the student
   * @return legalLastName
  **/
  @ApiModelProperty(example = "Smith", value = "The legal last name of the student")
  public String getLegalLastName() {
    return legalLastName;
  }

  public void setLegalLastName(String legalLastName) {
    this.legalLastName = legalLastName;
  }

  public StudentListData formerLastName(String formerLastName) {
    this.formerLastName = formerLastName;
    return this;
  }

   /**
   * The former last name of the student
   * @return formerLastName
  **/
  @ApiModelProperty(example = "Jones", value = "The former last name of the student")
  public String getFormerLastName() {
    return formerLastName;
  }

  public void setFormerLastName(String formerLastName) {
    this.formerLastName = formerLastName;
  }

  public StudentListData dob(LocalDate dob) {
    this.dob = dob;
    return this;
  }

   /**
   * The date of birth of the student
   * @return dob
  **/
  @ApiModelProperty(example = "2004-10-30", value = "The date of birth of the student")
  public LocalDate getDob() {
    return dob;
  }

  public void setDob(LocalDate dob) {
    this.dob = dob;
  }

  public StudentListData yearCode(YearCodeEnum yearCode) {
    this.yearCode = yearCode;
    return this;
  }

   /**
   * The year group the student currently belongs to *Values*  |Value|Description| |---|---| |&#x60;1&#x60;|Year 1| |&#x60;2&#x60;|Year 2| |&#x60;3&#x60;|Year 3| |&#x60;4&#x60;|Year 4| |&#x60;5&#x60;|Year 5| |&#x60;6&#x60;|Year 6| |&#x60;7&#x60;|Year 7| |&#x60;8&#x60;|Year 8| |&#x60;9&#x60;|Year 9| |&#x60;R&#x60;|Reception| |&#x60;10&#x60;|Year 10| |&#x60;11&#x60;|Year 11| |&#x60;12&#x60;|Year 12| |&#x60;13&#x60;|Year 13| |&#x60;N1&#x60;|Nursery first year| |&#x60;N2&#x60;|Nursery second year| 
   * @return yearCode
  **/
  @ApiModelProperty(example = "7", value = "The year group the student currently belongs to *Values*  |Value|Description| |---|---| |`1`|Year 1| |`2`|Year 2| |`3`|Year 3| |`4`|Year 4| |`5`|Year 5| |`6`|Year 6| |`7`|Year 7| |`8`|Year 8| |`9`|Year 9| |`R`|Reception| |`10`|Year 10| |`11`|Year 11| |`12`|Year 12| |`13`|Year 13| |`N1`|Nursery first year| |`N2`|Nursery second year| ")
  public YearCodeEnum getYearCode() {
    return yearCode;
  }

  public void setYearCode(YearCodeEnum yearCode) {
    this.yearCode = yearCode;
  }

  public StudentListData upn(String upn) {
    this.upn = upn;
    return this;
  }

   /**
   * Unique Pupil Number (UPN) - a DfE-mandated 13-character code that identifies each pupil
   * @return upn
  **/
  @ApiModelProperty(example = "M3334321444109", value = "Unique Pupil Number (UPN) - a DfE-mandated 13-character code that identifies each pupil")
  public String getUpn() {
    return upn;
  }

  public void setUpn(String upn) {
    this.upn = upn;
  }

  public StudentListData formerUpn(String formerUpn) {
    this.formerUpn = formerUpn;
    return this;
  }

   /**
   * The previous UPN where a pupil has held another UPN whilst at a school
   * @return formerUpn
  **/
  @ApiModelProperty(example = "P3444321665112", value = "The previous UPN where a pupil has held another UPN whilst at a school")
  public String getFormerUpn() {
    return formerUpn;
  }

  public void setFormerUpn(String formerUpn) {
    this.formerUpn = formerUpn;
  }

  public StudentListData misId(String misId) {
    this.misId = misId;
    return this;
  }

   /**
   * The ID of a student from the MIS
   * @return misId
  **/
  @ApiModelProperty(example = "8032", value = "The ID of a student from the MIS")
  public String getMisId() {
    return misId;
  }

  public void setMisId(String misId) {
    this.misId = misId;
  }

  public StudentListData pan(String pan) {
    this.pan = pan;
    return this;
  }

   /**
   * A student&#39;s &#39;Pupil Admission Number&#39;. This field is exposed in the front end of the MIS, and may be the same as mis_id
   * @return pan
  **/
  @ApiModelProperty(example = "A1032", value = "A student's 'Pupil Admission Number'. This field is exposed in the front end of the MIS, and may be the same as mis_id")
  public String getPan() {
    return pan;
  }

  public void setPan(String pan) {
    this.pan = pan;
  }

  public StudentListData startDate(OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Date when the student joined the school
   * @return startDate
  **/
  @ApiModelProperty(example = "2016-03-31T00:00:00.000Z", value = "Date when the student joined the school")
  public OffsetDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }

  public StudentListData endDate(OffsetDateTime endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * Date when the student left the school (this will default to 2079-06-06T23:59:00.000Z)
   * @return endDate
  **/
  @ApiModelProperty(example = "2017-07-21T00:00:00.000Z", value = "Date when the student left the school (this will default to 2079-06-06T23:59:00.000Z)")
  public OffsetDateTime getEndDate() {
    return endDate;
  }

  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }

  public StudentListData enrolmentStatus(String enrolmentStatus) {
    this.enrolmentStatus = enrolmentStatus;
    return this;
  }

   /**
   * The enrolment status of the student
   * @return enrolmentStatus
  **/
  @ApiModelProperty(example = "Current (Single Registration)", value = "The enrolment status of the student")
  public String getEnrolmentStatus() {
    return enrolmentStatus;
  }

  public void setEnrolmentStatus(String enrolmentStatus) {
    this.enrolmentStatus = enrolmentStatus;
  }

  public StudentListData demographics(StudentDemographics demographics) {
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

  public StudentListData contact(List<ContactListData> contact) {
    this.contact = contact;
    return this;
  }

  public StudentListData addContactItem(ContactListData contactItem) {
    if (this.contact == null) {
      this.contact = new ArrayList<ContactListData>();
    }
    this.contact.add(contactItem);
    return this;
  }

   /**
   * List of contact IDs for the student.
   * @return contact
  **/
  @ApiModelProperty(value = "List of contact IDs for the student.")
  public List<ContactListData> getContact() {
    return contact;
  }

  public void setContact(List<ContactListData> contact) {
    this.contact = contact;
  }

  public StudentListData addresses(StudentAddresses addresses) {
    this.addresses = addresses;
    return this;
  }

   /**
   * Get addresses
   * @return addresses
  **/
  @ApiModelProperty(value = "")
  public StudentAddresses getAddresses() {
    return addresses;
  }

  public void setAddresses(StudentAddresses addresses) {
    this.addresses = addresses;
  }

  public StudentListData languages(StudentLanguages languages) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StudentListData studentListData = (StudentListData) o;
    return Objects.equals(this.object, studentListData.object) &&
        Objects.equals(this.id, studentListData.id) &&
        Objects.equals(this.firstName, studentListData.firstName) &&
        Objects.equals(this.legalFirstName, studentListData.legalFirstName) &&
        Objects.equals(this.middleName, studentListData.middleName) &&
        Objects.equals(this.lastName, studentListData.lastName) &&
        Objects.equals(this.legalLastName, studentListData.legalLastName) &&
        Objects.equals(this.formerLastName, studentListData.formerLastName) &&
        Objects.equals(this.dob, studentListData.dob) &&
        Objects.equals(this.yearCode, studentListData.yearCode) &&
        Objects.equals(this.upn, studentListData.upn) &&
        Objects.equals(this.formerUpn, studentListData.formerUpn) &&
        Objects.equals(this.misId, studentListData.misId) &&
        Objects.equals(this.pan, studentListData.pan) &&
        Objects.equals(this.startDate, studentListData.startDate) &&
        Objects.equals(this.endDate, studentListData.endDate) &&
        Objects.equals(this.enrolmentStatus, studentListData.enrolmentStatus) &&
        Objects.equals(this.demographics, studentListData.demographics) &&
        Objects.equals(this.contact, studentListData.contact) &&
        Objects.equals(this.addresses, studentListData.addresses) &&
        Objects.equals(this.languages, studentListData.languages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(object, id, firstName, legalFirstName, middleName, lastName, legalLastName, formerLastName, dob, yearCode, upn, formerUpn, misId, pan, startDate, endDate, enrolmentStatus, demographics, contact, addresses, languages);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StudentListData {\n");
    
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    legalFirstName: ").append(toIndentedString(legalFirstName)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    legalLastName: ").append(toIndentedString(legalLastName)).append("\n");
    sb.append("    formerLastName: ").append(toIndentedString(formerLastName)).append("\n");
    sb.append("    dob: ").append(toIndentedString(dob)).append("\n");
    sb.append("    yearCode: ").append(toIndentedString(yearCode)).append("\n");
    sb.append("    upn: ").append(toIndentedString(upn)).append("\n");
    sb.append("    formerUpn: ").append(toIndentedString(formerUpn)).append("\n");
    sb.append("    misId: ").append(toIndentedString(misId)).append("\n");
    sb.append("    pan: ").append(toIndentedString(pan)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    enrolmentStatus: ").append(toIndentedString(enrolmentStatus)).append("\n");
    sb.append("    demographics: ").append(toIndentedString(demographics)).append("\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
    sb.append("    languages: ").append(toIndentedString(languages)).append("\n");
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

