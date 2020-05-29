/*
 * assembly-client-java 1.2.464
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
import education.assembly.platform.spring.models.GroupMisSubject;
import education.assembly.platform.spring.models.Supervisor;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
import java.io.Serializable;

/**
 * A grouping of students. A teaching or registration group for example.
 */
@ApiModel(description = "A grouping of students. A teaching or registration group for example.")

public class Group implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("object")
  private String object = "group";

  @JsonProperty("id")
  private Integer id = ;

  @JsonProperty("name")
  private String name = ;

  @JsonProperty("code")
  private String code = ;

  /**
   * The type of group
   */
  public enum TypeEnum {
    YEARGROUP("YearGroup"),
    
    TEACHINGGROUP("TeachingGroup"),
    
    REGISTRATIONGROUP("RegistrationGroup"),
    
    HOUSEGROUP("HouseGroup"),
    
    NONTEACHINGGROUP("NonTeachingGroup"),
    
    USERGROUP("UserGroup");

    private String value;

    TypeEnum(String value) {
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
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("type")
  private TypeEnum type = ;

  @JsonProperty("mis_subject")
  private GroupMisSubject misSubject = null;

  @JsonProperty("start_date")
  private OffsetDateTime startDate = ;

  @JsonProperty("end_date")
  private OffsetDateTime endDate = ;

  @JsonProperty("supervisors")
  private List<Supervisor> supervisors = null;

  @JsonProperty("student_ids")
  private List<Integer> studentIds = null;

  public Group object(String object) {
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

  public Group id(Integer id) {
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

  public Group name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the group
   * @return name
  **/
  @ApiModelProperty(value = "Name of the group")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Group code(String code) {
    this.code = code;
    return this;
  }

   /**
   * The code of the year that the group belongs to
   * @return code
  **/
  @ApiModelProperty(value = "The code of the year that the group belongs to")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public Group type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * The type of group
   * @return type
  **/
  @ApiModelProperty(value = "The type of group")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public Group misSubject(GroupMisSubject misSubject) {
    this.misSubject = misSubject;
    return this;
  }

   /**
   * Get misSubject
   * @return misSubject
  **/
  @ApiModelProperty(value = "")
  public GroupMisSubject getMisSubject() {
    return misSubject;
  }

  public void setMisSubject(GroupMisSubject misSubject) {
    this.misSubject = misSubject;
  }

  public Group startDate(OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * The start date of the group
   * @return startDate
  **/
  @ApiModelProperty(value = "The start date of the group")
  public OffsetDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }

  public Group endDate(OffsetDateTime endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * The end date of the group
   * @return endDate
  **/
  @ApiModelProperty(value = "The end date of the group")
  public OffsetDateTime getEndDate() {
    return endDate;
  }

  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }

  public Group supervisors(List<Supervisor> supervisors) {
    this.supervisors = supervisors;
    return this;
  }

  public Group addSupervisorsItem(Supervisor supervisorsItem) {
    if (this.supervisors == null) {
      this.supervisors = new ArrayList<Supervisor>();
    }
    this.supervisors.add(supervisorsItem);
    return this;
  }

   /**
   * The IDs of supervisors (staff members) associated with the group and their role
   * @return supervisors
  **/
  @ApiModelProperty(value = "The IDs of supervisors (staff members) associated with the group and their role")
  public List<Supervisor> getSupervisors() {
    return supervisors;
  }

  public void setSupervisors(List<Supervisor> supervisors) {
    this.supervisors = supervisors;
  }

  public Group studentIds(List<Integer> studentIds) {
    this.studentIds = studentIds;
    return this;
  }

  public Group addStudentIdsItem(Integer studentIdsItem) {
    if (this.studentIds == null) {
      this.studentIds = new ArrayList<Integer>();
    }
    this.studentIds.add(studentIdsItem);
    return this;
  }

   /**
   * The IDs of members (students) associated with the group
   * @return studentIds
  **/
  @ApiModelProperty(value = "The IDs of members (students) associated with the group")
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
    Group group = (Group) o;
    return Objects.equals(this.object, group.object) &&
        Objects.equals(this.id, group.id) &&
        Objects.equals(this.name, group.name) &&
        Objects.equals(this.code, group.code) &&
        Objects.equals(this.type, group.type) &&
        Objects.equals(this.misSubject, group.misSubject) &&
        Objects.equals(this.startDate, group.startDate) &&
        Objects.equals(this.endDate, group.endDate) &&
        Objects.equals(this.supervisors, group.supervisors) &&
        Objects.equals(this.studentIds, group.studentIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(object, id, name, code, type, misSubject, startDate, endDate, supervisors, studentIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Group {\n");
    
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    misSubject: ").append(toIndentedString(misSubject)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    supervisors: ").append(toIndentedString(supervisors)).append("\n");
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

