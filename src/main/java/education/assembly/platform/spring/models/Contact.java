/*
 * assembly-client-java 1.2.463
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
import education.assembly.platform.spring.models.ContactAddress;
import education.assembly.platform.spring.models.ContactStudents;
import education.assembly.platform.spring.models.EmailInfo;
import education.assembly.platform.spring.models.TelephoneNumberInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

/**
 * A parent, guardian, or other point of contact for a student.
 */
@ApiModel(description = "A parent, guardian, or other point of contact for a student.")

public class Contact implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("object")
  private String object = "contact";

  @JsonProperty("id")
  private Integer id = ;

  @JsonProperty("mis_id")
  private String misId = ;

  @JsonProperty("first_name")
  private String firstName = ;

  @JsonProperty("middle_name")
  private String middleName = ;

  @JsonProperty("last_name")
  private String lastName = ;

  @JsonProperty("gender")
  private String gender = ;

  @JsonProperty("title")
  private String title = ;

  @JsonProperty("salutation")
  private String salutation = ;

  @JsonProperty("address")
  private ContactAddress address = null;

  @JsonProperty("emails")
  private List<EmailInfo> emails = null;

  @JsonProperty("telephone_numbers")
  private List<TelephoneNumberInfo> telephoneNumbers = null;

  @JsonProperty("students")
  private List<ContactStudents> students = null;

  public Contact object(String object) {
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

  public Contact id(Integer id) {
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

  public Contact misId(String misId) {
    this.misId = misId;
    return this;
  }

   /**
   * The ID of the contact from the MIS
   * @return misId
  **/
  @ApiModelProperty(value = "The ID of the contact from the MIS")
  public String getMisId() {
    return misId;
  }

  public void setMisId(String misId) {
    this.misId = misId;
  }

  public Contact firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * The first name of the contact
   * @return firstName
  **/
  @ApiModelProperty(value = "The first name of the contact")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public Contact middleName(String middleName) {
    this.middleName = middleName;
    return this;
  }

   /**
   * The middle name of the contact
   * @return middleName
  **/
  @ApiModelProperty(value = "The middle name of the contact")
  public String getMiddleName() {
    return middleName;
  }

  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  public Contact lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * The last name of the contact
   * @return lastName
  **/
  @ApiModelProperty(value = "The last name of the contact")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Contact gender(String gender) {
    this.gender = gender;
    return this;
  }

   /**
   * The gender of the contact
   * @return gender
  **/
  @ApiModelProperty(value = "The gender of the contact")
  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public Contact title(String title) {
    this.title = title;
    return this;
  }

   /**
   * The title of the contact
   * @return title
  **/
  @ApiModelProperty(value = "The title of the contact")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Contact salutation(String salutation) {
    this.salutation = salutation;
    return this;
  }

   /**
   * The salutation for the contact
   * @return salutation
  **/
  @ApiModelProperty(value = "The salutation for the contact")
  public String getSalutation() {
    return salutation;
  }

  public void setSalutation(String salutation) {
    this.salutation = salutation;
  }

  public Contact address(ContactAddress address) {
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @ApiModelProperty(value = "")
  public ContactAddress getAddress() {
    return address;
  }

  public void setAddress(ContactAddress address) {
    this.address = address;
  }

  public Contact emails(List<EmailInfo> emails) {
    this.emails = emails;
    return this;
  }

  public Contact addEmailsItem(EmailInfo emailsItem) {
    if (this.emails == null) {
      this.emails = new ArrayList<EmailInfo>();
    }
    this.emails.add(emailsItem);
    return this;
  }

   /**
   * A list of emails for the contact
   * @return emails
  **/
  @ApiModelProperty(value = "A list of emails for the contact")
  public List<EmailInfo> getEmails() {
    return emails;
  }

  public void setEmails(List<EmailInfo> emails) {
    this.emails = emails;
  }

  public Contact telephoneNumbers(List<TelephoneNumberInfo> telephoneNumbers) {
    this.telephoneNumbers = telephoneNumbers;
    return this;
  }

  public Contact addTelephoneNumbersItem(TelephoneNumberInfo telephoneNumbersItem) {
    if (this.telephoneNumbers == null) {
      this.telephoneNumbers = new ArrayList<TelephoneNumberInfo>();
    }
    this.telephoneNumbers.add(telephoneNumbersItem);
    return this;
  }

   /**
   * A list of telephone numbers for the contact
   * @return telephoneNumbers
  **/
  @ApiModelProperty(value = "A list of telephone numbers for the contact")
  public List<TelephoneNumberInfo> getTelephoneNumbers() {
    return telephoneNumbers;
  }

  public void setTelephoneNumbers(List<TelephoneNumberInfo> telephoneNumbers) {
    this.telephoneNumbers = telephoneNumbers;
  }

  public Contact students(List<ContactStudents> students) {
    this.students = students;
    return this;
  }

  public Contact addStudentsItem(ContactStudents studentsItem) {
    if (this.students == null) {
      this.students = new ArrayList<ContactStudents>();
    }
    this.students.add(studentsItem);
    return this;
  }

   /**
   * A list of student IDs which are associated with this contact, and their relationship
   * @return students
  **/
  @ApiModelProperty(value = "A list of student IDs which are associated with this contact, and their relationship")
  public List<ContactStudents> getStudents() {
    return students;
  }

  public void setStudents(List<ContactStudents> students) {
    this.students = students;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Contact contact = (Contact) o;
    return Objects.equals(this.object, contact.object) &&
        Objects.equals(this.id, contact.id) &&
        Objects.equals(this.misId, contact.misId) &&
        Objects.equals(this.firstName, contact.firstName) &&
        Objects.equals(this.middleName, contact.middleName) &&
        Objects.equals(this.lastName, contact.lastName) &&
        Objects.equals(this.gender, contact.gender) &&
        Objects.equals(this.title, contact.title) &&
        Objects.equals(this.salutation, contact.salutation) &&
        Objects.equals(this.address, contact.address) &&
        Objects.equals(this.emails, contact.emails) &&
        Objects.equals(this.telephoneNumbers, contact.telephoneNumbers) &&
        Objects.equals(this.students, contact.students);
  }

  @Override
  public int hashCode() {
    return Objects.hash(object, id, misId, firstName, middleName, lastName, gender, title, salutation, address, emails, telephoneNumbers, students);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Contact {\n");
    
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    misId: ").append(toIndentedString(misId)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    salutation: ").append(toIndentedString(salutation)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    emails: ").append(toIndentedString(emails)).append("\n");
    sb.append("    telephoneNumbers: ").append(toIndentedString(telephoneNumbers)).append("\n");
    sb.append("    students: ").append(toIndentedString(students)).append("\n");
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

