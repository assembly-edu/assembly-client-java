/*
 * assembly-client-java 1.2.475
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.threeten.bp.OffsetDateTime;
import java.io.Serializable;

/**
 * An group enrolment of a student from a school.
 */
@ApiModel(description = "An group enrolment of a student from a school.")

public class Enrolment implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("object")
  private String object = "enrolment";

  @JsonProperty("id")
  private Integer id = ;

  @JsonProperty("student_id")
  private Integer studentId = ;

  @JsonProperty("group_id")
  private Integer groupId = ;

  @JsonProperty("start_date")
  private OffsetDateTime startDate = ;

  @JsonProperty("end_date")
  private OffsetDateTime endDate = ;

  public Enrolment object(String object) {
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

  public Enrolment id(Integer id) {
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

  public Enrolment studentId(Integer studentId) {
    this.studentId = studentId;
    return this;
  }

   /**
   * The ID of the student that the enrolment is attached to
   * @return studentId
  **/
  @ApiModelProperty(value = "The ID of the student that the enrolment is attached to")
  public Integer getStudentId() {
    return studentId;
  }

  public void setStudentId(Integer studentId) {
    this.studentId = studentId;
  }

  public Enrolment groupId(Integer groupId) {
    this.groupId = groupId;
    return this;
  }

   /**
   * The ID of the group that the enrolment is attached to
   * @return groupId
  **/
  @ApiModelProperty(value = "The ID of the group that the enrolment is attached to")
  public Integer getGroupId() {
    return groupId;
  }

  public void setGroupId(Integer groupId) {
    this.groupId = groupId;
  }

  public Enrolment startDate(OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * The date on which the enrolment starts
   * @return startDate
  **/
  @ApiModelProperty(value = "The date on which the enrolment starts")
  public OffsetDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }

  public Enrolment endDate(OffsetDateTime endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * The date on which the enrolment ends
   * @return endDate
  **/
  @ApiModelProperty(value = "The date on which the enrolment ends")
  public OffsetDateTime getEndDate() {
    return endDate;
  }

  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Enrolment enrolment = (Enrolment) o;
    return Objects.equals(this.object, enrolment.object) &&
        Objects.equals(this.id, enrolment.id) &&
        Objects.equals(this.studentId, enrolment.studentId) &&
        Objects.equals(this.groupId, enrolment.groupId) &&
        Objects.equals(this.startDate, enrolment.startDate) &&
        Objects.equals(this.endDate, enrolment.endDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(object, id, studentId, groupId, startDate, endDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Enrolment {\n");
    
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    studentId: ").append(toIndentedString(studentId)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
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

