/*
 * assembly-client-java 1.2.472
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
import org.threeten.bp.OffsetDateTime;
import java.io.Serializable;

/**
 * The grouping in which students take AM/PM roll call (morning and afternoon registers).
 */
@ApiModel(description = "The grouping in which students take AM/PM roll call (morning and afternoon registers).")

public class RegistrationGroup implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("object")
  private String object = "registration_group";

  @JsonProperty("id")
  private Integer id = ;

  @JsonProperty("name")
  private String name = ;

  @JsonProperty("start_date")
  private OffsetDateTime startDate = ;

  @JsonProperty("end_date")
  private OffsetDateTime endDate = ;

  @JsonProperty("supervisor_ids")
  private List<Integer> supervisorIds = null;

  @JsonProperty("student_ids")
  private List<Integer> studentIds = null;

  public RegistrationGroup object(String object) {
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

  public RegistrationGroup id(Integer id) {
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

  public RegistrationGroup name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the registration group
   * @return name
  **/
  @ApiModelProperty(value = "Name of the registration group")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public RegistrationGroup startDate(OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * The start date of the registration group
   * @return startDate
  **/
  @ApiModelProperty(value = "The start date of the registration group")
  public OffsetDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }

  public RegistrationGroup endDate(OffsetDateTime endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * The end date of the registration group
   * @return endDate
  **/
  @ApiModelProperty(value = "The end date of the registration group")
  public OffsetDateTime getEndDate() {
    return endDate;
  }

  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }

  public RegistrationGroup supervisorIds(List<Integer> supervisorIds) {
    this.supervisorIds = supervisorIds;
    return this;
  }

  public RegistrationGroup addSupervisorIdsItem(Integer supervisorIdsItem) {
    if (this.supervisorIds == null) {
      this.supervisorIds = new ArrayList<Integer>();
    }
    this.supervisorIds.add(supervisorIdsItem);
    return this;
  }

   /**
   * The IDs of supervisors (staff members) associated with the registration group
   * @return supervisorIds
  **/
  @ApiModelProperty(value = "The IDs of supervisors (staff members) associated with the registration group")
  public List<Integer> getSupervisorIds() {
    return supervisorIds;
  }

  public void setSupervisorIds(List<Integer> supervisorIds) {
    this.supervisorIds = supervisorIds;
  }

  public RegistrationGroup studentIds(List<Integer> studentIds) {
    this.studentIds = studentIds;
    return this;
  }

  public RegistrationGroup addStudentIdsItem(Integer studentIdsItem) {
    if (this.studentIds == null) {
      this.studentIds = new ArrayList<Integer>();
    }
    this.studentIds.add(studentIdsItem);
    return this;
  }

   /**
   * The IDs of members (students) associated with the registration group
   * @return studentIds
  **/
  @ApiModelProperty(value = "The IDs of members (students) associated with the registration group")
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
    RegistrationGroup registrationGroup = (RegistrationGroup) o;
    return Objects.equals(this.object, registrationGroup.object) &&
        Objects.equals(this.id, registrationGroup.id) &&
        Objects.equals(this.name, registrationGroup.name) &&
        Objects.equals(this.startDate, registrationGroup.startDate) &&
        Objects.equals(this.endDate, registrationGroup.endDate) &&
        Objects.equals(this.supervisorIds, registrationGroup.supervisorIds) &&
        Objects.equals(this.studentIds, registrationGroup.studentIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(object, id, name, startDate, endDate, supervisorIds, studentIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegistrationGroup {\n");
    
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
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

