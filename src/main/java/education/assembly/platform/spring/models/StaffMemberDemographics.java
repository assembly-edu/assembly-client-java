/*
 * assembly-client-java 1.2.404
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
 * Demographic information about the staff member.
 */
@ApiModel(description = "Demographic information about the staff member.")

public class StaffMemberDemographics implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("object")
  private String object = "staff_demographics";

  @JsonProperty("ethnicity_code")
  private String ethnicityCode = ;

  @JsonProperty("ethnicity_group")
  private String ethnicityGroup = ;

  @JsonProperty("gender")
  private String gender = ;

  @JsonProperty("disability")
  private String disability = ;

  public StaffMemberDemographics object(String object) {
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

  public StaffMemberDemographics ethnicityCode(String ethnicityCode) {
    this.ethnicityCode = ethnicityCode;
    return this;
  }

   /**
   * A detailed, Dfe standardised way of categorising the ethnicity of a staff member
   * @return ethnicityCode
  **/
  @ApiModelProperty(value = "A detailed, Dfe standardised way of categorising the ethnicity of a staff member")
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
   * A broader categorisation of ethnicity that is standardised across the country, with all ethnicity codes grouped in to 8 sections
   * @return ethnicityGroup
  **/
  @ApiModelProperty(value = "A broader categorisation of ethnicity that is standardised across the country, with all ethnicity codes grouped in to 8 sections")
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
   * The gender of a staff member
   * @return gender
  **/
  @ApiModelProperty(value = "The gender of a staff member")
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
   * The disability status of a staff member
   * @return disability
  **/
  @ApiModelProperty(value = "The disability status of a staff member")
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
    return Objects.equals(this.object, staffMemberDemographics.object) &&
        Objects.equals(this.ethnicityCode, staffMemberDemographics.ethnicityCode) &&
        Objects.equals(this.ethnicityGroup, staffMemberDemographics.ethnicityGroup) &&
        Objects.equals(this.gender, staffMemberDemographics.gender) &&
        Objects.equals(this.disability, staffMemberDemographics.disability);
  }

  @Override
  public int hashCode() {
    return Objects.hash(object, ethnicityCode, ethnicityGroup, gender, disability);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StaffMemberDemographics {\n");
    
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
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

