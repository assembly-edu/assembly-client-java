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
import education.assembly.platform.spring.models.StudentContactRelationship;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

/**
 * StudentContacts
 */

public class StudentContacts implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("object")
  private String object = "student_contact";

  @JsonProperty("contact_id")
  private Integer contactId = ;

  @JsonProperty("relationship")
  private StudentContactRelationship relationship = null;

  public StudentContacts object(String object) {
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

  public StudentContacts contactId(Integer contactId) {
    this.contactId = contactId;
    return this;
  }

   /**
   * The ID of a contact related to this student
   * @return contactId
  **/
  @ApiModelProperty(value = "The ID of a contact related to this student")
  public Integer getContactId() {
    return contactId;
  }

  public void setContactId(Integer contactId) {
    this.contactId = contactId;
  }

  public StudentContacts relationship(StudentContactRelationship relationship) {
    this.relationship = relationship;
    return this;
  }

   /**
   * Get relationship
   * @return relationship
  **/
  @ApiModelProperty(value = "")
  public StudentContactRelationship getRelationship() {
    return relationship;
  }

  public void setRelationship(StudentContactRelationship relationship) {
    this.relationship = relationship;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StudentContacts studentContacts = (StudentContacts) o;
    return Objects.equals(this.object, studentContacts.object) &&
        Objects.equals(this.contactId, studentContacts.contactId) &&
        Objects.equals(this.relationship, studentContacts.relationship);
  }

  @Override
  public int hashCode() {
    return Objects.hash(object, contactId, relationship);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StudentContacts {\n");
    
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    contactId: ").append(toIndentedString(contactId)).append("\n");
    sb.append("    relationship: ").append(toIndentedString(relationship)).append("\n");
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

