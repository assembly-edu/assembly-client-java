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
import education.assembly.platform.spring.models.ContactEmails;
import education.assembly.platform.spring.models.ContactStudents;
import education.assembly.platform.spring.models.ContactTelephoneNumbers;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

/**
 * A contact object represents a parent or guardian. Students are related to contacts through a student/contact relationship.
 */
@ApiModel(description = "A contact object represents a parent or guardian. Students are related to contacts through a student/contact relationship.")

public class ContactListData implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("object")
  private String object = null;

  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("first_name")
  private String firstName = null;

  @JsonProperty("middle_name")
  private String middleName = null;

  @JsonProperty("last_name")
  private String lastName = null;

  /**
   * The gender of the contact *Values*  |Value|Description| |---|---| |&#x60;F&#x60;|Female| |&#x60;M&#x60;|Male| 
   */
  public enum GenderEnum {
    F("F"),
    
    M("M");

    private String value;

    GenderEnum(String value) {
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
    public static GenderEnum fromValue(String text) {
      for (GenderEnum b : GenderEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("gender")
  private GenderEnum gender = null;

  @JsonProperty("title")
  private String title = null;

  @JsonProperty("salutation")
  private String salutation = null;

  @JsonProperty("emails")
  private List<ContactEmails> emails = null;

  @JsonProperty("telephone_numbers")
  private List<ContactTelephoneNumbers> telephoneNumbers = null;

  @JsonProperty("students")
  private List<ContactStudents> students = null;

  public ContactListData object(String object) {
    this.object = object;
    return this;
  }

   /**
   * Object type
   * @return object
  **/
  @ApiModelProperty(example = "contact", value = "Object type")
  public String getObject() {
    return object;
  }

  public void setObject(String object) {
    this.object = object;
  }

  public ContactListData id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Internal stable ID given to all contacts on the Platform
   * @return id
  **/
  @ApiModelProperty(example = "87", value = "Internal stable ID given to all contacts on the Platform")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public ContactListData firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * The first name of the contact
   * @return firstName
  **/
  @ApiModelProperty(example = "Tony", value = "The first name of the contact")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public ContactListData middleName(String middleName) {
    this.middleName = middleName;
    return this;
  }

   /**
   * The middle name of the contact
   * @return middleName
  **/
  @ApiModelProperty(example = "Peter", value = "The middle name of the contact")
  public String getMiddleName() {
    return middleName;
  }

  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  public ContactListData lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * The last name of the contact
   * @return lastName
  **/
  @ApiModelProperty(example = "Smith", value = "The last name of the contact")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public ContactListData gender(GenderEnum gender) {
    this.gender = gender;
    return this;
  }

   /**
   * The gender of the contact *Values*  |Value|Description| |---|---| |&#x60;F&#x60;|Female| |&#x60;M&#x60;|Male| 
   * @return gender
  **/
  @ApiModelProperty(example = "M", value = "The gender of the contact *Values*  |Value|Description| |---|---| |`F`|Female| |`M`|Male| ")
  public GenderEnum getGender() {
    return gender;
  }

  public void setGender(GenderEnum gender) {
    this.gender = gender;
  }

  public ContactListData title(String title) {
    this.title = title;
    return this;
  }

   /**
   * The title of the contact
   * @return title
  **/
  @ApiModelProperty(example = "Mr", value = "The title of the contact")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public ContactListData salutation(String salutation) {
    this.salutation = salutation;
    return this;
  }

   /**
   * The salutation for the contact
   * @return salutation
  **/
  @ApiModelProperty(example = "Mr Smith", value = "The salutation for the contact")
  public String getSalutation() {
    return salutation;
  }

  public void setSalutation(String salutation) {
    this.salutation = salutation;
  }

  public ContactListData emails(List<ContactEmails> emails) {
    this.emails = emails;
    return this;
  }

  public ContactListData addEmailsItem(ContactEmails emailsItem) {
    if (this.emails == null) {
      this.emails = new ArrayList<ContactEmails>();
    }
    this.emails.add(emailsItem);
    return this;
  }

   /**
   * A list of emails for the contact
   * @return emails
  **/
  @ApiModelProperty(value = "A list of emails for the contact")
  public List<ContactEmails> getEmails() {
    return emails;
  }

  public void setEmails(List<ContactEmails> emails) {
    this.emails = emails;
  }

  public ContactListData telephoneNumbers(List<ContactTelephoneNumbers> telephoneNumbers) {
    this.telephoneNumbers = telephoneNumbers;
    return this;
  }

  public ContactListData addTelephoneNumbersItem(ContactTelephoneNumbers telephoneNumbersItem) {
    if (this.telephoneNumbers == null) {
      this.telephoneNumbers = new ArrayList<ContactTelephoneNumbers>();
    }
    this.telephoneNumbers.add(telephoneNumbersItem);
    return this;
  }

   /**
   * A list of telephone numbers for the contact
   * @return telephoneNumbers
  **/
  @ApiModelProperty(value = "A list of telephone numbers for the contact")
  public List<ContactTelephoneNumbers> getTelephoneNumbers() {
    return telephoneNumbers;
  }

  public void setTelephoneNumbers(List<ContactTelephoneNumbers> telephoneNumbers) {
    this.telephoneNumbers = telephoneNumbers;
  }

  public ContactListData students(List<ContactStudents> students) {
    this.students = students;
    return this;
  }

  public ContactListData addStudentsItem(ContactStudents studentsItem) {
    if (this.students == null) {
      this.students = new ArrayList<ContactStudents>();
    }
    this.students.add(studentsItem);
    return this;
  }

   /**
   * A list of student IDs that the contact is responsible for
   * @return students
  **/
  @ApiModelProperty(value = "A list of student IDs that the contact is responsible for")
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
    ContactListData contactListData = (ContactListData) o;
    return Objects.equals(this.object, contactListData.object) &&
        Objects.equals(this.id, contactListData.id) &&
        Objects.equals(this.firstName, contactListData.firstName) &&
        Objects.equals(this.middleName, contactListData.middleName) &&
        Objects.equals(this.lastName, contactListData.lastName) &&
        Objects.equals(this.gender, contactListData.gender) &&
        Objects.equals(this.title, contactListData.title) &&
        Objects.equals(this.salutation, contactListData.salutation) &&
        Objects.equals(this.emails, contactListData.emails) &&
        Objects.equals(this.telephoneNumbers, contactListData.telephoneNumbers) &&
        Objects.equals(this.students, contactListData.students);
  }

  @Override
  public int hashCode() {
    return Objects.hash(object, id, firstName, middleName, lastName, gender, title, salutation, emails, telephoneNumbers, students);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactListData {\n");
    
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    salutation: ").append(toIndentedString(salutation)).append("\n");
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

