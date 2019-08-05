/*
 * assembly-client-java 1.2.381
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
 * ContactStudents
 */

public class ContactStudents implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("object")
  private String object = "contact_student";

  @JsonProperty("student_id")
  private Integer studentId = ;

  @JsonProperty("relationship")
  private StudentContactRelationship relationship = null;

  public ContactStudents object(String object) {
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

  public ContactStudents studentId(Integer studentId) {
    this.studentId = studentId;
    return this;
  }

   /**
   * The ID of a student this is a contact for
   * @return studentId
  **/
  @ApiModelProperty(value = "The ID of a student this is a contact for")
  public Integer getStudentId() {
    return studentId;
  }

  public void setStudentId(Integer studentId) {
    this.studentId = studentId;
  }

  public ContactStudents relationship(StudentContactRelationship relationship) {
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
    ContactStudents contactStudents = (ContactStudents) o;
    return Objects.equals(this.object, contactStudents.object) &&
        Objects.equals(this.studentId, contactStudents.studentId) &&
        Objects.equals(this.relationship, contactStudents.relationship);
  }

  @Override
  public int hashCode() {
    return Objects.hash(object, studentId, relationship);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactStudents {\n");
    
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    studentId: ").append(toIndentedString(studentId)).append("\n");
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

