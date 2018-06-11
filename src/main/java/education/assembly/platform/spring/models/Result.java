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
 * A result combines the other assessment principles and attaches them to a student.
 */
@ApiModel(description = "A result combines the other assessment principles and attaches them to a student.")

public class Result implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("object")
  private String object = null;

  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("student_id")
  private Integer studentId = null;

  @JsonProperty("subject_id")
  private Integer subjectId = null;

  @JsonProperty("assessment_id")
  private Integer assessmentId = null;

  @JsonProperty("assessment_point_rank")
  private Integer assessmentPointRank = null;

  @JsonProperty("aspect_id")
  private Integer aspectId = null;

  @JsonProperty("grade_id")
  private Integer gradeId = null;

  @JsonProperty("result_date")
  private OffsetDateTime resultDate = null;

  @JsonProperty("created_at")
  private OffsetDateTime createdAt = null;

  @JsonProperty("updated_at")
  private OffsetDateTime updatedAt = null;

  public Result object(String object) {
    this.object = object;
    return this;
  }

   /**
   * Object type
   * @return object
  **/
  @ApiModelProperty(example = "result", value = "Object type")
  public String getObject() {
    return object;
  }

  public void setObject(String object) {
    this.object = object;
  }

  public Result id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Internal stable ID given to all results on the Platform
   * @return id
  **/
  @ApiModelProperty(example = "101", value = "Internal stable ID given to all results on the Platform")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Result studentId(Integer studentId) {
    this.studentId = studentId;
    return this;
  }

   /**
   * The ID of the student that the result is attached to
   * @return studentId
  **/
  @ApiModelProperty(example = "923", value = "The ID of the student that the result is attached to")
  public Integer getStudentId() {
    return studentId;
  }

  public void setStudentId(Integer studentId) {
    this.studentId = studentId;
  }

  public Result subjectId(Integer subjectId) {
    this.subjectId = subjectId;
    return this;
  }

   /**
   * The ID of the subject that the result is attached to
   * @return subjectId
  **/
  @ApiModelProperty(example = "2", value = "The ID of the subject that the result is attached to")
  public Integer getSubjectId() {
    return subjectId;
  }

  public void setSubjectId(Integer subjectId) {
    this.subjectId = subjectId;
  }

  public Result assessmentId(Integer assessmentId) {
    this.assessmentId = assessmentId;
    return this;
  }

   /**
   * The ID of the assessment that the result is attached to
   * @return assessmentId
  **/
  @ApiModelProperty(example = "1", value = "The ID of the assessment that the result is attached to")
  public Integer getAssessmentId() {
    return assessmentId;
  }

  public void setAssessmentId(Integer assessmentId) {
    this.assessmentId = assessmentId;
  }

  public Result assessmentPointRank(Integer assessmentPointRank) {
    this.assessmentPointRank = assessmentPointRank;
    return this;
  }

   /**
   * The rank of the assessment point
   * @return assessmentPointRank
  **/
  @ApiModelProperty(example = "48", value = "The rank of the assessment point")
  public Integer getAssessmentPointRank() {
    return assessmentPointRank;
  }

  public void setAssessmentPointRank(Integer assessmentPointRank) {
    this.assessmentPointRank = assessmentPointRank;
  }

  public Result aspectId(Integer aspectId) {
    this.aspectId = aspectId;
    return this;
  }

   /**
   * The ID of the aspect that the result is attached to
   * @return aspectId
  **/
  @ApiModelProperty(example = "6", value = "The ID of the aspect that the result is attached to")
  public Integer getAspectId() {
    return aspectId;
  }

  public void setAspectId(Integer aspectId) {
    this.aspectId = aspectId;
  }

  public Result gradeId(Integer gradeId) {
    this.gradeId = gradeId;
    return this;
  }

   /**
   * The ID of the grade
   * @return gradeId
  **/
  @ApiModelProperty(example = "157", value = "The ID of the grade")
  public Integer getGradeId() {
    return gradeId;
  }

  public void setGradeId(Integer gradeId) {
    this.gradeId = gradeId;
  }

  public Result resultDate(OffsetDateTime resultDate) {
    this.resultDate = resultDate;
    return this;
  }

   /**
   * The date on which the result was recorded in the MIS or standardised assessment system
   * @return resultDate
  **/
  @ApiModelProperty(example = "2013-06-26T00:00:00.000Z", value = "The date on which the result was recorded in the MIS or standardised assessment system")
  public OffsetDateTime getResultDate() {
    return resultDate;
  }

  public void setResultDate(OffsetDateTime resultDate) {
    this.resultDate = resultDate;
  }

  public Result createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The date and time that the result was first created on Assembly
   * @return createdAt
  **/
  @ApiModelProperty(example = "2017-06-07T09:24:06.991Z", value = "The date and time that the result was first created on Assembly")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public Result updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * The date and time that the result was last updated on Assembly
   * @return updatedAt
  **/
  @ApiModelProperty(example = "2017-06-07T09:24:06.991Z", value = "The date and time that the result was last updated on Assembly")
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Result result = (Result) o;
    return Objects.equals(this.object, result.object) &&
        Objects.equals(this.id, result.id) &&
        Objects.equals(this.studentId, result.studentId) &&
        Objects.equals(this.subjectId, result.subjectId) &&
        Objects.equals(this.assessmentId, result.assessmentId) &&
        Objects.equals(this.assessmentPointRank, result.assessmentPointRank) &&
        Objects.equals(this.aspectId, result.aspectId) &&
        Objects.equals(this.gradeId, result.gradeId) &&
        Objects.equals(this.resultDate, result.resultDate) &&
        Objects.equals(this.createdAt, result.createdAt) &&
        Objects.equals(this.updatedAt, result.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(object, id, studentId, subjectId, assessmentId, assessmentPointRank, aspectId, gradeId, resultDate, createdAt, updatedAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Result {\n");
    
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    studentId: ").append(toIndentedString(studentId)).append("\n");
    sb.append("    subjectId: ").append(toIndentedString(subjectId)).append("\n");
    sb.append("    assessmentId: ").append(toIndentedString(assessmentId)).append("\n");
    sb.append("    assessmentPointRank: ").append(toIndentedString(assessmentPointRank)).append("\n");
    sb.append("    aspectId: ").append(toIndentedString(aspectId)).append("\n");
    sb.append("    gradeId: ").append(toIndentedString(gradeId)).append("\n");
    sb.append("    resultDate: ").append(toIndentedString(resultDate)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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

