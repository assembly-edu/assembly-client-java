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
 * A registration group object represents the grouping in which students take AM/PM roll call (morning and afternoon registers).
 */
@ApiModel(description = "A registration group object represents the grouping in which students take AM/PM roll call (morning and afternoon registers).")

public class RegistrationGroupListData implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("object")
  private String object = null;

  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("supervisor_ids")
  private List<Integer> supervisorIds = null;

  @JsonProperty("student_ids")
  private List<Integer> studentIds = null;

  public RegistrationGroupListData object(String object) {
    this.object = object;
    return this;
  }

   /**
   * Object type
   * @return object
  **/
  @ApiModelProperty(example = "registration_group", value = "Object type")
  public String getObject() {
    return object;
  }

  public void setObject(String object) {
    this.object = object;
  }

  public RegistrationGroupListData id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Internal stable ID given to all registration groups on the Platform
   * @return id
  **/
  @ApiModelProperty(example = "124", value = "Internal stable ID given to all registration groups on the Platform")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public RegistrationGroupListData name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the registration group
   * @return name
  **/
  @ApiModelProperty(example = "6-Oxford", value = "Name of the registration group")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public RegistrationGroupListData supervisorIds(List<Integer> supervisorIds) {
    this.supervisorIds = supervisorIds;
    return this;
  }

  public RegistrationGroupListData addSupervisorIdsItem(Integer supervisorIdsItem) {
    if (this.supervisorIds == null) {
      this.supervisorIds = new ArrayList<Integer>();
    }
    this.supervisorIds.add(supervisorIdsItem);
    return this;
  }

   /**
   * The IDs of staff members associated with the registration group
   * @return supervisorIds
  **/
  @ApiModelProperty(value = "The IDs of staff members associated with the registration group")
  public List<Integer> getSupervisorIds() {
    return supervisorIds;
  }

  public void setSupervisorIds(List<Integer> supervisorIds) {
    this.supervisorIds = supervisorIds;
  }

  public RegistrationGroupListData studentIds(List<Integer> studentIds) {
    this.studentIds = studentIds;
    return this;
  }

  public RegistrationGroupListData addStudentIdsItem(Integer studentIdsItem) {
    if (this.studentIds == null) {
      this.studentIds = new ArrayList<Integer>();
    }
    this.studentIds.add(studentIdsItem);
    return this;
  }

   /**
   * The IDs of students associated with the registration group
   * @return studentIds
  **/
  @ApiModelProperty(value = "The IDs of students associated with the registration group")
  public List<Integer> getStudentIds() {
    return studentIds;
  }

  public void setStudentIds(List<Integer> studentIds) {
    this.studentIds = studentIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RegistrationGroupListData registrationGroupListData = (RegistrationGroupListData) o;
    return Objects.equals(this.object, registrationGroupListData.object) &&
        Objects.equals(this.id, registrationGroupListData.id) &&
        Objects.equals(this.name, registrationGroupListData.name) &&
        Objects.equals(this.supervisorIds, registrationGroupListData.supervisorIds) &&
        Objects.equals(this.studentIds, registrationGroupListData.studentIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(object, id, name, supervisorIds, studentIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegistrationGroupListData {\n");
    
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    supervisorIds: ").append(toIndentedString(supervisorIds)).append("\n");
    sb.append("    studentIds: ").append(toIndentedString(studentIds)).append("\n");
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

