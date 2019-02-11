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
 * TeachingGroup
 */

public class TeachingGroup implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("id")
  private Integer id = ;

  @JsonProperty("school_id")
  private Integer schoolId = ;

  @JsonProperty("source_id")
  private String sourceId = ;

  @JsonProperty("name")
  private String name = ;

  @JsonProperty("created_at")
  private OffsetDateTime createdAt = ;

  @JsonProperty("updated_at")
  private OffsetDateTime updatedAt = ;

  @JsonProperty("academic_year_id")
  private Integer academicYearId = ;

  @JsonProperty("subject_id")
  private Integer subjectId = ;

  @JsonProperty("start_date")
  private OffsetDateTime startDate = ;

  @JsonProperty("end_date")
  private OffsetDateTime endDate = ;

  @JsonProperty("level")
  private String level = ;

  @JsonProperty("assessment_id")
  private Integer assessmentId = ;

  @JsonProperty("effective_at")
  private OffsetDateTime effectiveAt = ;

  public TeachingGroup id(Integer id) {
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

  public TeachingGroup schoolId(Integer schoolId) {
    this.schoolId = schoolId;
    return this;
  }

   /**
   * Get schoolId
   * @return schoolId
  **/
  @ApiModelProperty(value = "")
  public Integer getSchoolId() {
    return schoolId;
  }

  public void setSchoolId(Integer schoolId) {
    this.schoolId = schoolId;
  }

  public TeachingGroup sourceId(String sourceId) {
    this.sourceId = sourceId;
    return this;
  }

   /**
   * Get sourceId
   * @return sourceId
  **/
  @ApiModelProperty(value = "")
  public String getSourceId() {
    return sourceId;
  }

  public void setSourceId(String sourceId) {
    this.sourceId = sourceId;
  }

  public TeachingGroup name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TeachingGroup createdAt(OffsetDateTime createdAt) {
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

  public TeachingGroup updatedAt(OffsetDateTime updatedAt) {
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

  public TeachingGroup academicYearId(Integer academicYearId) {
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

  public TeachingGroup subjectId(Integer subjectId) {
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

  public TeachingGroup startDate(OffsetDateTime startDate) {
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

  public TeachingGroup endDate(OffsetDateTime endDate) {
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

  public TeachingGroup level(String level) {
    this.level = level;
    return this;
  }

   /**
   * Get level
   * @return level
  **/
  @ApiModelProperty(value = "")
  public String getLevel() {
    return level;
  }

  public void setLevel(String level) {
    this.level = level;
  }

  public TeachingGroup assessmentId(Integer assessmentId) {
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

  public TeachingGroup effectiveAt(OffsetDateTime effectiveAt) {
    this.effectiveAt = effectiveAt;
    return this;
  }

   /**
   * Get effectiveAt
   * @return effectiveAt
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getEffectiveAt() {
    return effectiveAt;
  }

  public void setEffectiveAt(OffsetDateTime effectiveAt) {
    this.effectiveAt = effectiveAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TeachingGroup teachingGroup = (TeachingGroup) o;
    return Objects.equals(this.id, teachingGroup.id) &&
        Objects.equals(this.schoolId, teachingGroup.schoolId) &&
        Objects.equals(this.sourceId, teachingGroup.sourceId) &&
        Objects.equals(this.name, teachingGroup.name) &&
        Objects.equals(this.createdAt, teachingGroup.createdAt) &&
        Objects.equals(this.updatedAt, teachingGroup.updatedAt) &&
        Objects.equals(this.academicYearId, teachingGroup.academicYearId) &&
        Objects.equals(this.subjectId, teachingGroup.subjectId) &&
        Objects.equals(this.startDate, teachingGroup.startDate) &&
        Objects.equals(this.endDate, teachingGroup.endDate) &&
        Objects.equals(this.level, teachingGroup.level) &&
        Objects.equals(this.assessmentId, teachingGroup.assessmentId) &&
        Objects.equals(this.effectiveAt, teachingGroup.effectiveAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, schoolId, sourceId, name, createdAt, updatedAt, academicYearId, subjectId, startDate, endDate, level, assessmentId, effectiveAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TeachingGroup {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    schoolId: ").append(toIndentedString(schoolId)).append("\n");
    sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    academicYearId: ").append(toIndentedString(academicYearId)).append("\n");
    sb.append("    subjectId: ").append(toIndentedString(subjectId)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    assessmentId: ").append(toIndentedString(assessmentId)).append("\n");
    sb.append("    effectiveAt: ").append(toIndentedString(effectiveAt)).append("\n");
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

