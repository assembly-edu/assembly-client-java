/*
 * assembly-client-java 1.2.474
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
  private String object = "result_date";

  @JsonProperty("id")
  private Integer id = ;

  @JsonProperty("student_id")
  private Integer studentId = ;

  @JsonProperty("subject_id")
  private Integer subjectId = ;

  @JsonProperty("assessment_id")
  private Integer assessmentId = ;

  @JsonProperty("assessment_point_rank")
  private Integer assessmentPointRank = ;

  @JsonProperty("facet_id")
  private Integer facetId = ;

  @JsonProperty("grade_id")
  private Integer gradeId = ;

  @JsonProperty("result_date")
  private OffsetDateTime resultDate = ;

  @JsonProperty("created_at")
  private OffsetDateTime createdAt = ;

  @JsonProperty("updated_at")
  private OffsetDateTime updatedAt = ;

  public Result object(String object) {
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

  public Result id(Integer id) {
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

  public Result studentId(Integer studentId) {
    this.studentId = studentId;
    return this;
  }

   /**
   * The ID of the student that the result is attached to
   * @return studentId
  **/
  @ApiModelProperty(value = "The ID of the student that the result is attached to")
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
  @ApiModelProperty(value = "The ID of the subject that the result is attached to")
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
  @ApiModelProperty(value = "The ID of the assessment that the result is attached to")
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
  @ApiModelProperty(value = "The rank of the assessment point")
  public Integer getAssessmentPointRank() {
    return assessmentPointRank;
  }

  public void setAssessmentPointRank(Integer assessmentPointRank) {
    this.assessmentPointRank = assessmentPointRank;
  }

  public Result facetId(Integer facetId) {
    this.facetId = facetId;
    return this;
  }

   /**
   * The ID of the facet that the result is attached to
   * @return facetId
  **/
  @ApiModelProperty(value = "The ID of the facet that the result is attached to")
  public Integer getFacetId() {
    return facetId;
  }

  public void setFacetId(Integer facetId) {
    this.facetId = facetId;
  }

  public Result gradeId(Integer gradeId) {
    this.gradeId = gradeId;
    return this;
  }

   /**
   * The ID of the grade that this result is attached to
   * @return gradeId
  **/
  @ApiModelProperty(value = "The ID of the grade that this result is attached to")
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
  @ApiModelProperty(value = "The date on which the result was recorded in the MIS or standardised assessment system")
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
  @ApiModelProperty(value = "The date and time that the result was first created on Assembly")
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
  @ApiModelProperty(value = "The date and time that the result was last updated on Assembly")
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
        Objects.equals(this.facetId, result.facetId) &&
        Objects.equals(this.gradeId, result.gradeId) &&
        Objects.equals(this.resultDate, result.resultDate) &&
        Objects.equals(this.createdAt, result.createdAt) &&
        Objects.equals(this.updatedAt, result.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(object, id, studentId, subjectId, assessmentId, assessmentPointRank, facetId, gradeId, resultDate, createdAt, updatedAt);
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
    sb.append("    facetId: ").append(toIndentedString(facetId)).append("\n");
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

