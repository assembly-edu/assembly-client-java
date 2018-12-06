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
 * Result
 */

public class Result implements Serializable {
  private static final long serialVersionUID = 1L;

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

  @JsonProperty("facet_id")
  private Integer facetId = null;

  @JsonProperty("grade_id")
  private Integer gradeId = null;

  @JsonProperty("result_date")
  private OffsetDateTime resultDate = null;

  @JsonProperty("created_at")
  private OffsetDateTime createdAt = null;

  @JsonProperty("updated_at")
  private OffsetDateTime updatedAt = null;

  public Result id(Integer id) {
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

  public Result studentId(Integer studentId) {
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

  public Result subjectId(Integer subjectId) {
    this.subjectId = subjectId;
    return this;
  }

   /**
   * Get subjectId
   * @return subjectId
  **/
  @ApiModelProperty(value = "")
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
   * Get assessmentId
   * @return assessmentId
  **/
  @ApiModelProperty(value = "")
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
   * Get assessmentPointRank
   * @return assessmentPointRank
  **/
  @ApiModelProperty(value = "")
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
   * Get facetId
   * @return facetId
  **/
  @ApiModelProperty(value = "")
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
   * Get gradeId
   * @return gradeId
  **/
  @ApiModelProperty(value = "")
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
   * Get resultDate
   * @return resultDate
  **/
  @ApiModelProperty(value = "")
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
   * Get createdAt
   * @return createdAt
  **/
  @ApiModelProperty(value = "")
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
   * Get updatedAt
   * @return updatedAt
  **/
  @ApiModelProperty(value = "")
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
    return Objects.equals(this.id, result.id) &&
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
    return Objects.hash(id, studentId, subjectId, assessmentId, assessmentPointRank, facetId, gradeId, resultDate, createdAt, updatedAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Result {\n");
    
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

