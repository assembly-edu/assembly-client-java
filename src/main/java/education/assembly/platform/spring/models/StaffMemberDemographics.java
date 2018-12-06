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
import java.io.Serializable;

/**
 * StaffMemberDemographics
 */

public class StaffMemberDemographics implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("ethnicity_code")
  private String ethnicityCode = null;

  @JsonProperty("ethnicity_group")
  private String ethnicityGroup = null;

  @JsonProperty("gender")
  private String gender = null;

  @JsonProperty("disability")
  private String disability = null;

  public StaffMemberDemographics ethnicityCode(String ethnicityCode) {
    this.ethnicityCode = ethnicityCode;
    return this;
  }

   /**
   * Get ethnicityCode
   * @return ethnicityCode
  **/
  @ApiModelProperty(value = "")
  public String getEthnicityCode() {
    return ethnicityCode;
  }

  public void setEthnicityCode(String ethnicityCode) {
    this.ethnicityCode = ethnicityCode;
  }

  public StaffMemberDemographics ethnicityGroup(String ethnicityGroup) {
    this.ethnicityGroup = ethnicityGroup;
    return this;
  }

   /**
   * Get ethnicityGroup
   * @return ethnicityGroup
  **/
  @ApiModelProperty(value = "")
  public String getEthnicityGroup() {
    return ethnicityGroup;
  }

  public void setEthnicityGroup(String ethnicityGroup) {
    this.ethnicityGroup = ethnicityGroup;
  }

  public StaffMemberDemographics gender(String gender) {
    this.gender = gender;
    return this;
  }

   /**
   * Get gender
   * @return gender
  **/
  @ApiModelProperty(value = "")
  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public StaffMemberDemographics disability(String disability) {
    this.disability = disability;
    return this;
  }

   /**
   * Get disability
   * @return disability
  **/
  @ApiModelProperty(value = "")
  public String getDisability() {
    return disability;
  }

  public void setDisability(String disability) {
    this.disability = disability;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StaffMemberDemographics staffMemberDemographics = (StaffMemberDemographics) o;
    return Objects.equals(this.ethnicityCode, staffMemberDemographics.ethnicityCode) &&
        Objects.equals(this.ethnicityGroup, staffMemberDemographics.ethnicityGroup) &&
        Objects.equals(this.gender, staffMemberDemographics.gender) &&
        Objects.equals(this.disability, staffMemberDemographics.disability);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ethnicityCode, ethnicityGroup, gender, disability);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StaffMemberDemographics {\n");
    
    sb.append("    ethnicityCode: ").append(toIndentedString(ethnicityCode)).append("\n");
    sb.append("    ethnicityGroup: ").append(toIndentedString(ethnicityGroup)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    disability: ").append(toIndentedString(disability)).append("\n");
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

