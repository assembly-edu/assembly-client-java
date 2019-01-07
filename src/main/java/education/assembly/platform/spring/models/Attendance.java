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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.threeten.bp.OffsetDateTime;
import java.io.Serializable;

/**
 * Attendance
 */

public class Attendance implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("id")
  private Integer id = ;

  @JsonProperty("student_id")
  private Integer studentId = ;

  @JsonProperty("registration_group_id")
  private Integer registrationGroupId = ;

  @JsonProperty("session_date")
  private OffsetDateTime sessionDate = ;

  @JsonProperty("session_name")
  private String sessionName = ;

  @JsonProperty("attendance_mark")
  private String attendanceMark = ;

  @JsonProperty("minutes_late")
  private Integer minutesLate = ;

  @JsonProperty("comments")
  private String comments = ;

  public Attendance id(Integer id) {
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

  public Attendance studentId(Integer studentId) {
    this.studentId = studentId;
    return this;
  }

   /**
   * Get studentId
   * @return studentId
  **/
  @ApiModelProperty(value = "")
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
   * Get registrationGroupId
   * @return registrationGroupId
  **/
  @ApiModelProperty(value = "")
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
   * Get sessionDate
   * @return sessionDate
  **/
  @ApiModelProperty(value = "")
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
   * Get sessionName
   * @return sessionName
  **/
  @ApiModelProperty(value = "")
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
   * Get attendanceMark
   * @return attendanceMark
  **/
  @ApiModelProperty(value = "")
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
   * Get minutesLate
   * @return minutesLate
  **/
  @ApiModelProperty(value = "")
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
   * Get comments
   * @return comments
  **/
  @ApiModelProperty(value = "")
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
    return Objects.equals(this.id, attendance.id) &&
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
    return Objects.hash(id, studentId, registrationGroupId, sessionDate, sessionName, attendanceMark, minutesLate, comments);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Attendance {\n");
    
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

