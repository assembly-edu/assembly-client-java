/*
 * assembly-client-java 1.2.376
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
 * An official exclusion of a student from a school.
 */
@ApiModel(description = "An official exclusion of a student from a school.")

public class Exclusion implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("object")
  private String object = "exclusion";

  @JsonProperty("id")
  private Integer id = ;

  @JsonProperty("student_id")
  private Integer studentId = ;

  /**
   * The exclusions type, where &#x60;Reinstated&#x60; may be from a fixed term or permanent exclusion
   */
  public enum ExclusionTypeEnum {
    FIXED_TERM("Fixed Term"),
    
    LUNCHTIME("Lunchtime"),
    
    PERMANENT("Permanent"),
    
    REINSTATED("Reinstated");

    private String value;

    ExclusionTypeEnum(String value) {
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
    public static ExclusionTypeEnum fromValue(String text) {
      for (ExclusionTypeEnum b : ExclusionTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("exclusion_type")
  private ExclusionTypeEnum exclusionType = ;

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

  public Exclusion object(String object) {
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

  public Exclusion id(Integer id) {
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

  public Exclusion studentId(Integer studentId) {
    this.studentId = studentId;
    return this;
  }

   /**
   * The ID of the student that the exclusion is attached to
   * @return studentId
  **/
  @ApiModelProperty(value = "The ID of the student that the exclusion is attached to")
  public Integer getStudentId() {
    return studentId;
  }

  public void setStudentId(Integer studentId) {
    this.studentId = studentId;
  }

  public Exclusion exclusionType(ExclusionTypeEnum exclusionType) {
    this.exclusionType = exclusionType;
    return this;
  }

   /**
   * The exclusions type, where &#x60;Reinstated&#x60; may be from a fixed term or permanent exclusion
   * @return exclusionType
  **/
  @ApiModelProperty(value = "The exclusions type, where `Reinstated` may be from a fixed term or permanent exclusion")
  public ExclusionTypeEnum getExclusionType() {
    return exclusionType;
  }

  public void setExclusionType(ExclusionTypeEnum exclusionType) {
    this.exclusionType = exclusionType;
  }

  public Exclusion exclusionReason(String exclusionReason) {
    this.exclusionReason = exclusionReason;
    return this;
  }

   /**
   * The exclusion reason, normalized to values as in Pupil Exclusion Reason (CS010/D00024) in CBDS
   * @return exclusionReason
  **/
  @ApiModelProperty(value = "The exclusion reason, normalized to values as in Pupil Exclusion Reason (CS010/D00024) in CBDS")
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
   * The date on which the exclusions starts
   * @return startDate
  **/
  @ApiModelProperty(value = "The date on which the exclusions starts")
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
   * The session (AM/PM) in which the exclusion starts
   * @return startSession
  **/
  @ApiModelProperty(value = "The session (AM/PM) in which the exclusion starts")
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
   * The date on which the exclusion ends
   * @return endDate
  **/
  @ApiModelProperty(value = "The date on which the exclusion ends")
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
   * The session (AM/PM) in which the exclusion ends
   * @return endSession
  **/
  @ApiModelProperty(value = "The session (AM/PM) in which the exclusion ends")
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
  @ApiModelProperty(value = "The total length, in sessions, of the exclusion")
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
        Objects.equals(this.exclusionReason, exclusion.exclusionReason) &&
        Objects.equals(this.startDate, exclusion.startDate) &&
        Objects.equals(this.startSession, exclusion.startSession) &&
        Objects.equals(this.endDate, exclusion.endDate) &&
        Objects.equals(this.endSession, exclusion.endSession) &&
        Objects.equals(this.exclusionLength, exclusion.exclusionLength);
  }

  @Override
  public int hashCode() {
    return Objects.hash(object, id, studentId, exclusionType, exclusionReason, startDate, startSession, endDate, endSession, exclusionLength);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Exclusion {\n");
    
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
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

