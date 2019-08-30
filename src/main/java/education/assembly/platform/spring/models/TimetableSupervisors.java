/*
 * assembly-client-java 1.2.412
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
import java.io.Serializable;

/**
 * TimetableSupervisors
 */

public class TimetableSupervisors implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("object")
  private String object = "supervisor";

  @JsonProperty("staff_member_id")
  private Integer staffMemberId = ;

  @JsonProperty("role")
  private String role = ;

  public TimetableSupervisors object(String object) {
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

  public TimetableSupervisors staffMemberId(Integer staffMemberId) {
    this.staffMemberId = staffMemberId;
    return this;
  }

   /**
   * Internal stable ID of the staff member
   * @return staffMemberId
  **/
  @ApiModelProperty(value = "Internal stable ID of the staff member")
  public Integer getStaffMemberId() {
    return staffMemberId;
  }

  public void setStaffMemberId(Integer staffMemberId) {
    this.staffMemberId = staffMemberId;
  }

  public TimetableSupervisors role(String role) {
    this.role = role;
    return this;
  }

   /**
   * The role of the staff member within the group
   * @return role
  **/
  @ApiModelProperty(value = "The role of the staff member within the group")
  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimetableSupervisors timetableSupervisors = (TimetableSupervisors) o;
    return Objects.equals(this.object, timetableSupervisors.object) &&
        Objects.equals(this.staffMemberId, timetableSupervisors.staffMemberId) &&
        Objects.equals(this.role, timetableSupervisors.role);
  }

  @Override
  public int hashCode() {
    return Objects.hash(object, staffMemberId, role);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimetableSupervisors {\n");
    
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    staffMemberId: ").append(toIndentedString(staffMemberId)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
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

