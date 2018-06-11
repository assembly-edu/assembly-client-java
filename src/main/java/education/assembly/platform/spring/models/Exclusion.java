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
import java.io.Serializable;

/**
 * The exclusions resource details official exclusions from a school.
 */
@ApiModel(description = "The exclusions resource details official exclusions from a school.")

public class Exclusion implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("object")
  private String object = null;

  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("student_id")
  private Integer studentId = null;

  @JsonProperty("exclusion_type")
  private String exclusionType = null;

  @JsonProperty("exclusions_reason")
  private String exclusionsReason = null;

  @JsonProperty("start_date")
  private String startDate = null;

  @JsonProperty("start_session")
  private String startSession = null;

  @JsonProperty("end_date")
  private String endDate = null;

  @JsonProperty("end_session")
  private String endSession = null;

  @JsonProperty("exclusion_length")
  private Integer exclusionLength = null;

  public Exclusion object(String object) {
    this.object = object;
    return this;
  }

   /**
   * Object type
   * @return object
  **/
  @ApiModelProperty(example = "exclusion", value = "Object type")
  public String getObject() {
    return object;
  }

  public void setObject(String object) {
    this.object = object;
  }

  public Exclusion id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Internal stable ID given to all exclusions on the Platform
   * @return id
  **/
  @ApiModelProperty(example = "243", value = "Internal stable ID given to all exclusions on the Platform")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Exclusion studentId(Integer studentId) {
    this.studentId = studentId;
    return this;
  }

   /**
   * The ID of the student that the exclusion is attached to
   * @return studentId
  **/
  @ApiModelProperty(example = "15085", value = "The ID of the student that the exclusion is attached to")
  public Integer getStudentId() {
    return studentId;
  }

  public void setStudentId(Integer studentId) {
    this.studentId = studentId;
  }

  public Exclusion exclusionType(String exclusionType) {
    this.exclusionType = exclusionType;
    return this;
  }

   /**
   * The exclusions type
   * @return exclusionType
  **/
  @ApiModelProperty(example = "Fixed Term", value = "The exclusions type")
  public String getExclusionType() {
    return exclusionType;
  }

  public void setExclusionType(String exclusionType) {
    this.exclusionType = exclusionType;
  }

  public Exclusion exclusionsReason(String exclusionsReason) {
    this.exclusionsReason = exclusionsReason;
    return this;
  }

   /**
   * The exclusion reason
   * @return exclusionsReason
  **/
  @ApiModelProperty(example = "Drug and alcohol related", value = "The exclusion reason")
  public String getExclusionsReason() {
    return exclusionsReason;
  }

  public void setExclusionsReason(String exclusionsReason) {
    this.exclusionsReason = exclusionsReason;
  }

  public Exclusion startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * The date on which the exclusions starts
   * @return startDate
  **/
  @ApiModelProperty(example = "2017-12-07T00:00:00.000Z", value = "The date on which the exclusions starts")
  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  public Exclusion startSession(String startSession) {
    this.startSession = startSession;
    return this;
  }

   /**
   * The session in which the exclusion starts
   * @return startSession
  **/
  @ApiModelProperty(example = "AM", value = "The session in which the exclusion starts")
  public String getStartSession() {
    return startSession;
  }

  public void setStartSession(String startSession) {
    this.startSession = startSession;
  }

  public Exclusion endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * The date on which the exclusion ends
   * @return endDate
  **/
  @ApiModelProperty(example = "2017-12-09T00:00:00.000Z", value = "The date on which the exclusion ends")
  public String getEndDate() {
    return endDate;
  }

  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  public Exclusion endSession(String endSession) {
    this.endSession = endSession;
    return this;
  }

   /**
   * The session (AM/PM) in which the exclusion ends
   * @return endSession
  **/
  @ApiModelProperty(example = "PM", value = "The session (AM/PM) in which the exclusion ends")
  public String getEndSession() {
    return endSession;
  }

  public void setEndSession(String endSession) {
    this.endSession = endSession;
  }

  public Exclusion exclusionLength(Integer exclusionLength) {
    this.exclusionLength = exclusionLength;
    return this;
  }

   /**
   * The total length, in sessions, of the exclusion
   * @return exclusionLength
  **/
  @ApiModelProperty(example = "6", value = "The total length, in sessions, of the exclusion")
  public Integer getExclusionLength() {
    return exclusionLength;
  }

  public void setExclusionLength(Integer exclusionLength) {
    this.exclusionLength = exclusionLength;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Exclusion exclusion = (Exclusion) o;
    return Objects.equals(this.object, exclusion.object) &&
        Objects.equals(this.id, exclusion.id) &&
        Objects.equals(this.studentId, exclusion.studentId) &&
        Objects.equals(this.exclusionType, exclusion.exclusionType) &&
        Objects.equals(this.exclusionsReason, exclusion.exclusionsReason) &&
        Objects.equals(this.startDate, exclusion.startDate) &&
        Objects.equals(this.startSession, exclusion.startSession) &&
        Objects.equals(this.endDate, exclusion.endDate) &&
        Objects.equals(this.endSession, exclusion.endSession) &&
        Objects.equals(this.exclusionLength, exclusion.exclusionLength);
  }

  @Override
  public int hashCode() {
    return Objects.hash(object, id, studentId, exclusionType, exclusionsReason, startDate, startSession, endDate, endSession, exclusionLength);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Exclusion {\n");
    
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    studentId: ").append(toIndentedString(studentId)).append("\n");
    sb.append("    exclusionType: ").append(toIndentedString(exclusionType)).append("\n");
    sb.append("    exclusionsReason: ").append(toIndentedString(exclusionsReason)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    startSession: ").append(toIndentedString(startSession)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    endSession: ").append(toIndentedString(endSession)).append("\n");
    sb.append("    exclusionLength: ").append(toIndentedString(exclusionLength)).append("\n");
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

