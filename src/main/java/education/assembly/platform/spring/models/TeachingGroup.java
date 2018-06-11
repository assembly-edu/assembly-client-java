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
import education.assembly.platform.spring.models.TeachingGroupSubject;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
import java.io.Serializable;

/**
 * A teaching group object represents the grouping in which students are taught a subject.
 */
@ApiModel(description = "A teaching group object represents the grouping in which students are taught a subject.")

public class TeachingGroup implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("object")
  private String object = null;

  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("start_date")
  private OffsetDateTime startDate = null;

  @JsonProperty("end_date")
  private OffsetDateTime endDate = null;

  @JsonProperty("supervisor_ids")
  private List<Integer> supervisorIds = null;

  @JsonProperty("student_ids")
  private List<Integer> studentIds = null;

  @JsonProperty("subject")
  private TeachingGroupSubject subject = null;

  @JsonProperty("mis_level")
  private String misLevel = null;

  public TeachingGroup object(String object) {
    this.object = object;
    return this;
  }

   /**
   * Object type
   * @return object
  **/
  @ApiModelProperty(example = "teaching_group", value = "Object type")
  public String getObject() {
    return object;
  }

  public void setObject(String object) {
    this.object = object;
  }

  public TeachingGroup id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Internal stable ID given to all teaching groups in the Platform
   * @return id
  **/
  @ApiModelProperty(example = "12", value = "Internal stable ID given to all teaching groups in the Platform")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public TeachingGroup name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of teaching group
   * @return name
  **/
  @ApiModelProperty(example = "10/Ma1", value = "Name of teaching group")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TeachingGroup startDate(OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * The start date of the teaching group
   * @return startDate
  **/
  @ApiModelProperty(example = "2017-09-01T00:00:00.000Z", value = "The start date of the teaching group")
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
   * The end date of the teaching group
   * @return endDate
  **/
  @ApiModelProperty(example = "2018-08-31T23:59:00.000Z", value = "The end date of the teaching group")
  public OffsetDateTime getEndDate() {
    return endDate;
  }

  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }

  public TeachingGroup supervisorIds(List<Integer> supervisorIds) {
    this.supervisorIds = supervisorIds;
    return this;
  }

  public TeachingGroup addSupervisorIdsItem(Integer supervisorIdsItem) {
    if (this.supervisorIds == null) {
      this.supervisorIds = new ArrayList<Integer>();
    }
    this.supervisorIds.add(supervisorIdsItem);
    return this;
  }

   /**
   * The IDs of supervisors associated with the teaching group
   * @return supervisorIds
  **/
  @ApiModelProperty(value = "The IDs of supervisors associated with the teaching group")
  public List<Integer> getSupervisorIds() {
    return supervisorIds;
  }

  public void setSupervisorIds(List<Integer> supervisorIds) {
    this.supervisorIds = supervisorIds;
  }

  public TeachingGroup studentIds(List<Integer> studentIds) {
    this.studentIds = studentIds;
    return this;
  }

  public TeachingGroup addStudentIdsItem(Integer studentIdsItem) {
    if (this.studentIds == null) {
      this.studentIds = new ArrayList<Integer>();
    }
    this.studentIds.add(studentIdsItem);
    return this;
  }

   /**
   * The IDs of students associated with the teaching group
   * @return studentIds
  **/
  @ApiModelProperty(value = "The IDs of students associated with the teaching group")
  public List<Integer> getStudentIds() {
    return studentIds;
  }

  public void setStudentIds(List<Integer> studentIds) {
    this.studentIds = studentIds;
  }

  public TeachingGroup subject(TeachingGroupSubject subject) {
    this.subject = subject;
    return this;
  }

   /**
   * Get subject
   * @return subject
  **/
  @ApiModelProperty(value = "")
  public TeachingGroupSubject getSubject() {
    return subject;
  }

  public void setSubject(TeachingGroupSubject subject) {
    this.subject = subject;
  }

  public TeachingGroup misLevel(String misLevel) {
    this.misLevel = misLevel;
    return this;
  }

   /**
   * The official examination or assessment &#39;level&#39; of the teaching group taken directly from the MIS
   * @return misLevel
  **/
  @ApiModelProperty(example = "GCSE 9 - 1 Full Course", value = "The official examination or assessment 'level' of the teaching group taken directly from the MIS")
  public String getMisLevel() {
    return misLevel;
  }

  public void setMisLevel(String misLevel) {
    this.misLevel = misLevel;
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
    return Objects.equals(this.object, teachingGroup.object) &&
        Objects.equals(this.id, teachingGroup.id) &&
        Objects.equals(this.name, teachingGroup.name) &&
        Objects.equals(this.startDate, teachingGroup.startDate) &&
        Objects.equals(this.endDate, teachingGroup.endDate) &&
        Objects.equals(this.supervisorIds, teachingGroup.supervisorIds) &&
        Objects.equals(this.studentIds, teachingGroup.studentIds) &&
        Objects.equals(this.subject, teachingGroup.subject) &&
        Objects.equals(this.misLevel, teachingGroup.misLevel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(object, id, name, startDate, endDate, supervisorIds, studentIds, subject, misLevel);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TeachingGroup {\n");
    
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    supervisorIds: ").append(toIndentedString(supervisorIds)).append("\n");
    sb.append("    studentIds: ").append(toIndentedString(studentIds)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    misLevel: ").append(toIndentedString(misLevel)).append("\n");
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

