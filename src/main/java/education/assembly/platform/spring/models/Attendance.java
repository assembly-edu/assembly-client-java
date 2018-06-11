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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.threeten.bp.OffsetDateTime;
import java.io.Serializable;

/**
 * The attendances resource details AM and PM roll call attendance marks for students.
 */
@ApiModel(description = "The attendances resource details AM and PM roll call attendance marks for students.")

public class Attendance implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("object")
  private String object = null;

  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("student_id")
  private Integer studentId = null;

  @JsonProperty("registration_group_id")
  private Integer registrationGroupId = null;

  @JsonProperty("session_date")
  private OffsetDateTime sessionDate = null;

  @JsonProperty("session_name")
  private String sessionName = null;

  @JsonProperty("attendance_mark")
  private String attendanceMark = null;

  @JsonProperty("minutes_late")
  private Integer minutesLate = null;

  @JsonProperty("comments")
  private String comments = null;

  public Attendance object(String object) {
    this.object = object;
    return this;
  }

   /**
   * Object type
   * @return object
  **/
  @ApiModelProperty(example = "attendance", value = "Object type")
  public String getObject() {
    return object;
  }

  public void setObject(String object) {
    this.object = object;
  }

  public Attendance id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Internal stable ID given to all attendances on the Platform
   * @return id
  **/
  @ApiModelProperty(example = "2117", value = "Internal stable ID given to all attendances on the Platform")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Attendance studentId(Integer studentId) {
    this.studentId = studentId;
    return this;
  }

   /**
   * The ID of the student that the attendance is attached to
   * @return studentId
  **/
  @ApiModelProperty(example = "1085", value = "The ID of the student that the attendance is attached to")
  public Integer getStudentId() {
    return studentId;
  }

  public void setStudentId(Integer studentId) {
    this.studentId = studentId;
  }

  public Attendance registrationGroupId(Integer registrationGroupId) {
    this.registrationGroupId = registrationGroupId;
    return this;
  }

   /**
   * The ID of the subject that the attendance is attached to
   * @return registrationGroupId
  **/
  @ApiModelProperty(example = "4682", value = "The ID of the subject that the attendance is attached to")
  public Integer getRegistrationGroupId() {
    return registrationGroupId;
  }

  public void setRegistrationGroupId(Integer registrationGroupId) {
    this.registrationGroupId = registrationGroupId;
  }

  public Attendance sessionDate(OffsetDateTime sessionDate) {
    this.sessionDate = sessionDate;
    return this;
  }

   /**
   * The date of the attendance
   * @return sessionDate
  **/
  @ApiModelProperty(example = "2017-05-19T13:00:00.000Z", value = "The date of the attendance")
  public OffsetDateTime getSessionDate() {
    return sessionDate;
  }

  public void setSessionDate(OffsetDateTime sessionDate) {
    this.sessionDate = sessionDate;
  }

  public Attendance sessionName(String sessionName) {
    this.sessionName = sessionName;
    return this;
  }

   /**
   * Denotes whether the attendance is an AM session or PM session (morning or afternoon)
   * @return sessionName
  **/
  @ApiModelProperty(example = "PM", value = "Denotes whether the attendance is an AM session or PM session (morning or afternoon)")
  public String getSessionName() {
    return sessionName;
  }

  public void setSessionName(String sessionName) {
    this.sessionName = sessionName;
  }

  public Attendance attendanceMark(String attendanceMark) {
    this.attendanceMark = attendanceMark;
    return this;
  }

   /**
   * The attendance mark
   * @return attendanceMark
  **/
  @ApiModelProperty(example = "/", value = "The attendance mark")
  public String getAttendanceMark() {
    return attendanceMark;
  }

  public void setAttendanceMark(String attendanceMark) {
    this.attendanceMark = attendanceMark;
  }

  public Attendance minutesLate(Integer minutesLate) {
    this.minutesLate = minutesLate;
    return this;
  }

   /**
   * If the attendance mark is &#39;L&#39; for &#39;Late&#39;, how many minutes late the student was
   * @return minutesLate
  **/
  @ApiModelProperty(example = "15", value = "If the attendance mark is 'L' for 'Late', how many minutes late the student was")
  public Integer getMinutesLate() {
    return minutesLate;
  }

  public void setMinutesLate(Integer minutesLate) {
    this.minutesLate = minutesLate;
  }

  public Attendance comments(String comments) {
    this.comments = comments;
    return this;
  }

   /**
   * Any additional comments
   * @return comments
  **/
  @ApiModelProperty(example = "Missed bus", value = "Any additional comments")
  public String getComments() {
    return comments;
  }

  public void setComments(String comments) {
    this.comments = comments;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Attendance attendance = (Attendance) o;
    return Objects.equals(this.object, attendance.object) &&
        Objects.equals(this.id, attendance.id) &&
        Objects.equals(this.studentId, attendance.studentId) &&
        Objects.equals(this.registrationGroupId, attendance.registrationGroupId) &&
        Objects.equals(this.sessionDate, attendance.sessionDate) &&
        Objects.equals(this.sessionName, attendance.sessionName) &&
        Objects.equals(this.attendanceMark, attendance.attendanceMark) &&
        Objects.equals(this.minutesLate, attendance.minutesLate) &&
        Objects.equals(this.comments, attendance.comments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(object, id, studentId, registrationGroupId, sessionDate, sessionName, attendanceMark, minutesLate, comments);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Attendance {\n");
    
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    studentId: ").append(toIndentedString(studentId)).append("\n");
    sb.append("    registrationGroupId: ").append(toIndentedString(registrationGroupId)).append("\n");
    sb.append("    sessionDate: ").append(toIndentedString(sessionDate)).append("\n");
    sb.append("    sessionName: ").append(toIndentedString(sessionName)).append("\n");
    sb.append("    attendanceMark: ").append(toIndentedString(attendanceMark)).append("\n");
    sb.append("    minutesLate: ").append(toIndentedString(minutesLate)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
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

