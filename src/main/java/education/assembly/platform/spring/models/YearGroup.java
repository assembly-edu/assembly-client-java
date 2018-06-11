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
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

/**
 * A year group object represents the pastoral year group that a student belongs to.
 */
@ApiModel(description = "A year group object represents the pastoral year group that a student belongs to.")

public class YearGroup implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("object")
  private String object = null;

  @JsonProperty("code")
  private String code = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("student_ids")
  private List<Integer> studentIds = null;

  @JsonProperty("supervisor_ids")
  private List<Integer> supervisorIds = null;

  public YearGroup object(String object) {
    this.object = object;
    return this;
  }

   /**
   * Object type
   * @return object
  **/
  @ApiModelProperty(example = "year_group", value = "Object type")
  public String getObject() {
    return object;
  }

  public void setObject(String object) {
    this.object = object;
  }

  public YearGroup code(String code) {
    this.code = code;
    return this;
  }

   /**
   * The code of the year that the student belongs to
   * @return code
  **/
  @ApiModelProperty(example = "7", value = "The code of the year that the student belongs to")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public YearGroup name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of internal year group that the student belongs to
   * @return name
  **/
  @ApiModelProperty(example = "Year 7", value = "The name of internal year group that the student belongs to")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public YearGroup studentIds(List<Integer> studentIds) {
    this.studentIds = studentIds;
    return this;
  }

  public YearGroup addStudentIdsItem(Integer studentIdsItem) {
    if (this.studentIds == null) {
      this.studentIds = new ArrayList<Integer>();
    }
    this.studentIds.add(studentIdsItem);
    return this;
  }

   /**
   * The IDs of students associated with the year group
   * @return studentIds
  **/
  @ApiModelProperty(value = "The IDs of students associated with the year group")
  public List<Integer> getStudentIds() {
    return studentIds;
  }

  public void setStudentIds(List<Integer> studentIds) {
    this.studentIds = studentIds;
  }

  public YearGroup supervisorIds(List<Integer> supervisorIds) {
    this.supervisorIds = supervisorIds;
    return this;
  }

  public YearGroup addSupervisorIdsItem(Integer supervisorIdsItem) {
    if (this.supervisorIds == null) {
      this.supervisorIds = new ArrayList<Integer>();
    }
    this.supervisorIds.add(supervisorIdsItem);
    return this;
  }

   /**
   * The IDs of supervisors associated with the year group
   * @return supervisorIds
  **/
  @ApiModelProperty(value = "The IDs of supervisors associated with the year group")
  public List<Integer> getSupervisorIds() {
    return supervisorIds;
  }

  public void setSupervisorIds(List<Integer> supervisorIds) {
    this.supervisorIds = supervisorIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    YearGroup yearGroup = (YearGroup) o;
    return Objects.equals(this.object, yearGroup.object) &&
        Objects.equals(this.code, yearGroup.code) &&
        Objects.equals(this.name, yearGroup.name) &&
        Objects.equals(this.studentIds, yearGroup.studentIds) &&
        Objects.equals(this.supervisorIds, yearGroup.supervisorIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(object, code, name, studentIds, supervisorIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class YearGroup {\n");
    
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    studentIds: ").append(toIndentedString(studentIds)).append("\n");
    sb.append("    supervisorIds: ").append(toIndentedString(supervisorIds)).append("\n");
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

