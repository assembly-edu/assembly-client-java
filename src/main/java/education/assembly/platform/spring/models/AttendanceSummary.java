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
 * AttendanceSummary
 */

public class AttendanceSummary implements Serializable {
  private static final long serialVersionUID = 1L;

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

  public AttendanceSummary id(Integer id) {
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

  public AttendanceSummary studentId(Integer studentId) {
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

  public AttendanceSummary registrationGroupId(Integer registrationGroupId) {
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

  public AttendanceSummary academicYearId(Integer academicYearId) {
    this.academicYearId = academicYearId;
    return this;
  }

   /**
   * Get academicYearId
   * @return academicYearId
  **/
  @ApiModelProperty(value = "")
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

  public AttendanceSummary endDate(OffsetDateTime endDate) {
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

  public AttendanceSummary possibleSessions(Float possibleSessions) {
    this.possibleSessions = possibleSessions;
    return this;
  }

   /**
   * Get possibleSessions
   * @return possibleSessions
  **/
  @ApiModelProperty(value = "")
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
   * Get attendedSessions
   * @return attendedSessions
  **/
  @ApiModelProperty(value = "")
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
   * Get lateSessions
   * @return lateSessions
  **/
  @ApiModelProperty(value = "")
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
   * Get authorisedAbsenceSessions
   * @return authorisedAbsenceSessions
  **/
  @ApiModelProperty(value = "")
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
   * Get unauthorisedAbsenceSessions
   * @return unauthorisedAbsenceSessions
  **/
  @ApiModelProperty(value = "")
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
    return Objects.equals(this.id, attendanceSummary.id) &&
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
    return Objects.hash(id, studentId, registrationGroupId, academicYearId, startDate, endDate, possibleSessions, attendedSessions, lateSessions, authorisedAbsenceSessions, unauthorisedAbsenceSessions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttendanceSummary {\n");
    
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

