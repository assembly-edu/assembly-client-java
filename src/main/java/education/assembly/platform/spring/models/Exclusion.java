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
 * Exclusion
 */

public class Exclusion implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("id")
  private Integer id = ;

  @JsonProperty("student_id")
  private Integer studentId = ;

  @JsonProperty("exclusion_type")
  private String exclusionType = ;

  @JsonProperty("exclusion_reason")
  private String exclusionReason = ;

  @JsonProperty("start_date")
  private OffsetDateTime startDate = ;

  @JsonProperty("start_session")
  private String startSession = ;

  @JsonProperty("end_date")
  private OffsetDateTime endDate = ;

  @JsonProperty("end_session")
  private String endSession = ;

  @JsonProperty("exclusion_length")
  private Integer exclusionLength = ;

  public Exclusion id(Integer id) {
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

  public Exclusion studentId(Integer studentId) {
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

  public Exclusion exclusionType(String exclusionType) {
    this.exclusionType = exclusionType;
    return this;
  }

   /**
   * Get exclusionType
   * @return exclusionType
  **/
  @ApiModelProperty(value = "")
  public String getExclusionType() {
    return exclusionType;
  }

  public void setExclusionType(String exclusionType) {
    this.exclusionType = exclusionType;
  }

  public Exclusion exclusionReason(String exclusionReason) {
    this.exclusionReason = exclusionReason;
    return this;
  }

   /**
   * Get exclusionReason
   * @return exclusionReason
  **/
  @ApiModelProperty(value = "")
  public String getExclusionReason() {
    return exclusionReason;
  }

  public void setExclusionReason(String exclusionReason) {
    this.exclusionReason = exclusionReason;
  }

  public Exclusion startDate(OffsetDateTime startDate) {
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

  public Exclusion startSession(String startSession) {
    this.startSession = startSession;
    return this;
  }

   /**
   * Get startSession
   * @return startSession
  **/
  @ApiModelProperty(value = "")
  public String getStartSession() {
    return startSession;
  }

  public void setStartSession(String startSession) {
    this.startSession = startSession;
  }

  public Exclusion endDate(OffsetDateTime endDate) {
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

  public Exclusion endSession(String endSession) {
    this.endSession = endSession;
    return this;
  }

   /**
   * Get endSession
   * @return endSession
  **/
  @ApiModelProperty(value = "")
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
   * Get exclusionLength
   * @return exclusionLength
  **/
  @ApiModelProperty(value = "")
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
    return Objects.equals(this.id, exclusion.id) &&
        Objects.equals(this.studentId, exclusion.studentId) &&
        Objects.equals(this.exclusionType, exclusion.exclusionType) &&
        Objects.equals(this.exclusionReason, exclusion.exclusionReason) &&
        Objects.equals(this.startDate, exclusion.startDate) &&
        Objects.equals(this.startSession, exclusion.startSession) &&
        Objects.equals(this.endDate, exclusion.endDate) &&
        Objects.equals(this.endSession, exclusion.endSession) &&
        Objects.equals(this.exclusionLength, exclusion.exclusionLength);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, studentId, exclusionType, exclusionReason, startDate, startSession, endDate, endSession, exclusionLength);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Exclusion {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    studentId: ").append(toIndentedString(studentId)).append("\n");
    sb.append("    exclusionType: ").append(toIndentedString(exclusionType)).append("\n");
    sb.append("    exclusionReason: ").append(toIndentedString(exclusionReason)).append("\n");
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

