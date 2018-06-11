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
 * No description
 */
@ApiModel(description = "No description")

public class StaffContractRoles implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("object")
  private String object = null;

  @JsonProperty("role_type")
  private String roleType = null;

  @JsonProperty("start_date")
  private OffsetDateTime startDate = null;

  @JsonProperty("end_date")
  private OffsetDateTime endDate = null;

  public StaffContractRoles object(String object) {
    this.object = object;
    return this;
  }

   /**
   * Object type
   * @return object
  **/
  @ApiModelProperty(example = "staff_role", value = "Object type")
  public String getObject() {
    return object;
  }

  public void setObject(String object) {
    this.object = object;
  }

  public StaffContractRoles roleType(String roleType) {
    this.roleType = roleType;
    return this;
  }

   /**
   * Type of role
   * @return roleType
  **/
  @ApiModelProperty(example = "Classroom Teacher", value = "Type of role")
  public String getRoleType() {
    return roleType;
  }

  public void setRoleType(String roleType) {
    this.roleType = roleType;
  }

  public StaffContractRoles startDate(OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * No description
   * @return startDate
  **/
  @ApiModelProperty(example = "2016-05-21T00:00:00.000Z", value = "No description")
  public OffsetDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }

  public StaffContractRoles endDate(OffsetDateTime endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * No description
   * @return endDate
  **/
  @ApiModelProperty(value = "No description")
  public OffsetDateTime getEndDate() {
    return endDate;
  }

  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StaffContractRoles staffContractRoles = (StaffContractRoles) o;
    return Objects.equals(this.object, staffContractRoles.object) &&
        Objects.equals(this.roleType, staffContractRoles.roleType) &&
        Objects.equals(this.startDate, staffContractRoles.startDate) &&
        Objects.equals(this.endDate, staffContractRoles.endDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(object, roleType, startDate, endDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StaffContractRoles {\n");
    
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    roleType: ").append(toIndentedString(roleType)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
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

