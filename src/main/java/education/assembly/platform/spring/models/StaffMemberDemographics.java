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
 * Demographic information about a staff member.
 */
@ApiModel(description = "Demographic information about a staff member.")

public class StaffMemberDemographics implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * The gender of a staff member *Values*  |Value|Description| |---|---| |&#x60;F&#x60;|Female| |&#x60;M&#x60;|Male| 
   */
  public enum GenderEnum {
    F("F"),
    
    M("M");

    private String value;

    GenderEnum(String value) {
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
    public static GenderEnum fromValue(String text) {
      for (GenderEnum b : GenderEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("gender")
  private GenderEnum gender = null;

  @JsonProperty("ethnicity_code")
  private String ethnicityCode = null;

  @JsonProperty("ethnicity_group")
  private String ethnicityGroup = null;

  @JsonProperty("disability")
  private String disability = null;

  public StaffMemberDemographics gender(GenderEnum gender) {
    this.gender = gender;
    return this;
  }

   /**
   * The gender of a staff member *Values*  |Value|Description| |---|---| |&#x60;F&#x60;|Female| |&#x60;M&#x60;|Male| 
   * @return gender
  **/
  @ApiModelProperty(example = "M", value = "The gender of a staff member *Values*  |Value|Description| |---|---| |`F`|Female| |`M`|Male| ")
  public GenderEnum getGender() {
    return gender;
  }

  public void setGender(GenderEnum gender) {
    this.gender = gender;
  }

  public StaffMemberDemographics ethnicityCode(String ethnicityCode) {
    this.ethnicityCode = ethnicityCode;
    return this;
  }

   /**
   * A detailed, Dfe standardised way of categorising the ethnicity of a student 
   * @return ethnicityCode
  **/
  @ApiModelProperty(example = "MOTH", value = "A detailed, Dfe standardised way of categorising the ethnicity of a student ")
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
  @ApiModelProperty(example = "Mixed/ Dual Background", value = "A broader categorisation of ethnicity that is standardised across the country, with all ethnicity codes grouped in to 8 sections")
  public String getEthnicityGroup() {
    return ethnicityGroup;
  }

  public void setEthnicityGroup(String ethnicityGroup) {
    this.ethnicityGroup = ethnicityGroup;
  }

  public StaffMemberDemographics disability(String disability) {
    this.disability = disability;
    return this;
  }

   /**
   * The disability status of a staff member
   * @return disability
  **/
  @ApiModelProperty(example = "No", value = "The disability status of a staff member")
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
    return Objects.equals(this.gender, staffMemberDemographics.gender) &&
        Objects.equals(this.ethnicityCode, staffMemberDemographics.ethnicityCode) &&
        Objects.equals(this.ethnicityGroup, staffMemberDemographics.ethnicityGroup) &&
        Objects.equals(this.disability, staffMemberDemographics.disability);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gender, ethnicityCode, ethnicityGroup, disability);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StaffMemberDemographics {\n");
    
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    ethnicityCode: ").append(toIndentedString(ethnicityCode)).append("\n");
    sb.append("    ethnicityGroup: ").append(toIndentedString(ethnicityGroup)).append("\n");
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

