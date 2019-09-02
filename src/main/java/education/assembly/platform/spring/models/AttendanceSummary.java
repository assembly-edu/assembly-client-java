/*
 * assembly-client-java 1.2.416
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
 * A statiscital summary of a student&#39;s attendance for an academic year.
 */
@ApiModel(description = "A statiscital summary of a student's attendance for an academic year.")

public class AttendanceSummary implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("object")
  private String object = "attendance_summary";

  @JsonProperty("id")
  private Integer id = ;

  @JsonProperty("student_id")
  private Integer studentId = ;

  @JsonProperty("registration_group_id")
  private Integer registrationGroupId = ;

  @JsonProperty("academic_year_id")
  private Integer academicYearId = ;

  @JsonProperty("start_date")
  private OffsetDateTime startDate = ;

  @JsonProperty("end_date")
  private OffsetDateTime endDate = ;

  @JsonProperty("possible_sessions")
  private Float possibleSessions = ;

  @JsonProperty("attended_sessions")
  private Float attendedSessions = ;

  @JsonProperty("late_sessions")
  private Float lateSessions = ;

  @JsonProperty("authorised_absence_sessions")
  private Float authorisedAbsenceSessions = ;

  @JsonProperty("unauthorised_absence_sessions")
  private Float unauthorisedAbsenceSessions = ;

  public AttendanceSummary object(String object) {
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

  public AttendanceSummary id(Integer id) {
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

  public AttendanceSummary studentId(Integer studentId) {
    this.studentId = studentId;
    return this;
  }

   /**
   * The ID of the student
   * @return studentId
  **/
  @ApiModelProperty(value = "The ID of the student")
  public Integer getStudentId() {
    return studentId;
  }

  public void setStudentId(Integer studentId) {
    this.studentId = studentId;
  }

  public AttendanceSummary registrationGroupId(Integer registrationGroupId) {
    this.registrationGroupId = registrationGroupId;
    return this;
  }

   /**
   * The ID of the student&#39;s registration group
   * @return registrationGroupId
  **/
  @ApiModelProperty(value = "The ID of the student's registration group")
  public Integer getRegistrationGroupId() {
    return registrationGroupId;
  }

  public void setRegistrationGroupId(Integer registrationGroupId) {
    this.registrationGroupId = registrationGroupId;
  }

  public AttendanceSummary academicYearId(Integer academicYearId) {
    this.academicYearId = academicYearId;
    return this;
  }

   /**
   * The ID of the academic year
   * @return academicYearId
  **/
  @ApiModelProperty(value = "The ID of the academic year")
  public Integer getAcademicYearId() {
    return academicYearId;
  }

  public void setAcademicYearId(Integer academicYearId) {
    this.academicYearId = academicYearId;
  }

  public AttendanceSummary startDate(OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Start date for the attendance summary
   * @return startDate
  **/
  @ApiModelProperty(value = "Start date for the attendance summary")
  public OffsetDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }

  public AttendanceSummary endDate(OffsetDateTime endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * End date for the attendance summary
   * @return endDate
  **/
  @ApiModelProperty(value = "End date for the attendance summary")
  public OffsetDateTime getEndDate() {
    return endDate;
  }

  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }

  public AttendanceSummary possibleSessions(Float possibleSessions) {
    this.possibleSessions = possibleSessions;
    return this;
  }

   /**
   * Number of possible sessions that could have been attended
   * @return possibleSessions
  **/
  @ApiModelProperty(value = "Number of possible sessions that could have been attended")
  public Float getPossibleSessions() {
    return possibleSessions;
  }

  public void setPossibleSessions(Float possibleSessions) {
    this.possibleSessions = possibleSessions;
  }

  public AttendanceSummary attendedSessions(Float attendedSessions) {
    this.attendedSessions = attendedSessions;
    return this;
  }

   /**
   * Number of sessions with present mark recorded
   * @return attendedSessions
  **/
  @ApiModelProperty(value = "Number of sessions with present mark recorded")
  public Float getAttendedSessions() {
    return attendedSessions;
  }

  public void setAttendedSessions(Float attendedSessions) {
    this.attendedSessions = attendedSessions;
  }

  public AttendanceSummary lateSessions(Float lateSessions) {
    this.lateSessions = lateSessions;
    return this;
  }

   /**
   * Number of sessions with late mark recorded
   * @return lateSessions
  **/
  @ApiModelProperty(value = "Number of sessions with late mark recorded")
  public Float getLateSessions() {
    return lateSessions;
  }

  public void setLateSessions(Float lateSessions) {
    this.lateSessions = lateSessions;
  }

  public AttendanceSummary authorisedAbsenceSessions(Float authorisedAbsenceSessions) {
    this.authorisedAbsenceSessions = authorisedAbsenceSessions;
    return this;
  }

   /**
   * Number of sessions with authorised absence recorded
   * @return authorisedAbsenceSessions
  **/
  @ApiModelProperty(value = "Number of sessions with authorised absence recorded")
  public Float getAuthorisedAbsenceSessions() {
    return authorisedAbsenceSessions;
  }

  public void setAuthorisedAbsenceSessions(Float authorisedAbsenceSessions) {
    this.authorisedAbsenceSessions = authorisedAbsenceSessions;
  }

  public AttendanceSummary unauthorisedAbsenceSessions(Float unauthorisedAbsenceSessions) {
    this.unauthorisedAbsenceSessions = unauthorisedAbsenceSessions;
    return this;
  }

   /**
   * Number of sessions with unauthorised absence recorded
   * @return unauthorisedAbsenceSessions
  **/
  @ApiModelProperty(value = "Number of sessions with unauthorised absence recorded")
  public Float getUnauthorisedAbsenceSessions() {
    return unauthorisedAbsenceSessions;
  }

  public void setUnauthorisedAbsenceSessions(Float unauthorisedAbsenceSessions) {
    this.unauthorisedAbsenceSessions = unauthorisedAbsenceSessions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AttendanceSummary attendanceSummary = (AttendanceSummary) o;
    return Objects.equals(this.object, attendanceSummary.object) &&
        Objects.equals(this.id, attendanceSummary.id) &&
        Objects.equals(this.studentId, attendanceSummary.studentId) &&
        Objects.equals(this.registrationGroupId, attendanceSummary.registrationGroupId) &&
        Objects.equals(this.academicYearId, attendanceSummary.academicYearId) &&
        Objects.equals(this.startDate, attendanceSummary.startDate) &&
        Objects.equals(this.endDate, attendanceSummary.endDate) &&
        Objects.equals(this.possibleSessions, attendanceSummary.possibleSessions) &&
        Objects.equals(this.attendedSessions, attendanceSummary.attendedSessions) &&
        Objects.equals(this.lateSessions, attendanceSummary.lateSessions) &&
        Objects.equals(this.authorisedAbsenceSessions, attendanceSummary.authorisedAbsenceSessions) &&
        Objects.equals(this.unauthorisedAbsenceSessions, attendanceSummary.unauthorisedAbsenceSessions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(object, id, studentId, registrationGroupId, academicYearId, startDate, endDate, possibleSessions, attendedSessions, lateSessions, authorisedAbsenceSessions, unauthorisedAbsenceSessions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttendanceSummary {\n");
    
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    studentId: ").append(toIndentedString(studentId)).append("\n");
    sb.append("    registrationGroupId: ").append(toIndentedString(registrationGroupId)).append("\n");
    sb.append("    academicYearId: ").append(toIndentedString(academicYearId)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    possibleSessions: ").append(toIndentedString(possibleSessions)).append("\n");
    sb.append("    attendedSessions: ").append(toIndentedString(attendedSessions)).append("\n");
    sb.append("    lateSessions: ").append(toIndentedString(lateSessions)).append("\n");
    sb.append("    authorisedAbsenceSessions: ").append(toIndentedString(authorisedAbsenceSessions)).append("\n");
    sb.append("    unauthorisedAbsenceSessions: ").append(toIndentedString(unauthorisedAbsenceSessions)).append("\n");
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

