/*
 * assembly-client-java 1.1.0
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
 * School
 */

public class School implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("name")
  private String name = ;

  @JsonProperty("urn")
  private String urn = ;

  @JsonProperty("la_code")
  private Integer laCode = ;

  @JsonProperty("la_name")
  private String laName = ;

  @JsonProperty("establishment_number")
  private Integer establishmentNumber = ;

  @JsonProperty("establishment_type")
  private String establishmentType = ;

  @JsonProperty("phase")
  private String phase = ;

  @JsonProperty("street")
  private String street = ;

  @JsonProperty("town")
  private String town = ;

  @JsonProperty("postcode")
  private String postcode = ;

  @JsonProperty("head_teacher")
  private String headTeacher = ;

  public School name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public School urn(String urn) {
    this.urn = urn;
    return this;
  }

   /**
   * Get urn
   * @return urn
  **/
  @ApiModelProperty(value = "")
  public String getUrn() {
    return urn;
  }

  public void setUrn(String urn) {
    this.urn = urn;
  }

  public School laCode(Integer laCode) {
    this.laCode = laCode;
    return this;
  }

   /**
   * Get laCode
   * @return laCode
  **/
  @ApiModelProperty(value = "")
  public Integer getLaCode() {
    return laCode;
  }

  public void setLaCode(Integer laCode) {
    this.laCode = laCode;
  }

  public School laName(String laName) {
    this.laName = laName;
    return this;
  }

   /**
   * Get laName
   * @return laName
  **/
  @ApiModelProperty(value = "")
  public String getLaName() {
    return laName;
  }

  public void setLaName(String laName) {
    this.laName = laName;
  }

  public School establishmentNumber(Integer establishmentNumber) {
    this.establishmentNumber = establishmentNumber;
    return this;
  }

   /**
   * Get establishmentNumber
   * @return establishmentNumber
  **/
  @ApiModelProperty(value = "")
  public Integer getEstablishmentNumber() {
    return establishmentNumber;
  }

  public void setEstablishmentNumber(Integer establishmentNumber) {
    this.establishmentNumber = establishmentNumber;
  }

  public School establishmentType(String establishmentType) {
    this.establishmentType = establishmentType;
    return this;
  }

   /**
   * Get establishmentType
   * @return establishmentType
  **/
  @ApiModelProperty(value = "")
  public String getEstablishmentType() {
    return establishmentType;
  }

  public void setEstablishmentType(String establishmentType) {
    this.establishmentType = establishmentType;
  }

  public School phase(String phase) {
    this.phase = phase;
    return this;
  }

   /**
   * Get phase
   * @return phase
  **/
  @ApiModelProperty(value = "")
  public String getPhase() {
    return phase;
  }

  public void setPhase(String phase) {
    this.phase = phase;
  }

  public School street(String street) {
    this.street = street;
    return this;
  }

   /**
   * Get street
   * @return street
  **/
  @ApiModelProperty(value = "")
  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public School town(String town) {
    this.town = town;
    return this;
  }

   /**
   * Get town
   * @return town
  **/
  @ApiModelProperty(value = "")
  public String getTown() {
    return town;
  }

  public void setTown(String town) {
    this.town = town;
  }

  public School postcode(String postcode) {
    this.postcode = postcode;
    return this;
  }

   /**
   * Get postcode
   * @return postcode
  **/
  @ApiModelProperty(value = "")
  public String getPostcode() {
    return postcode;
  }

  public void setPostcode(String postcode) {
    this.postcode = postcode;
  }

  public School headTeacher(String headTeacher) {
    this.headTeacher = headTeacher;
    return this;
  }

   /**
   * Get headTeacher
   * @return headTeacher
  **/
  @ApiModelProperty(value = "")
  public String getHeadTeacher() {
    return headTeacher;
  }

  public void setHeadTeacher(String headTeacher) {
    this.headTeacher = headTeacher;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    School school = (School) o;
    return Objects.equals(this.name, school.name) &&
        Objects.equals(this.urn, school.urn) &&
        Objects.equals(this.laCode, school.laCode) &&
        Objects.equals(this.laName, school.laName) &&
        Objects.equals(this.establishmentNumber, school.establishmentNumber) &&
        Objects.equals(this.establishmentType, school.establishmentType) &&
        Objects.equals(this.phase, school.phase) &&
        Objects.equals(this.street, school.street) &&
        Objects.equals(this.town, school.town) &&
        Objects.equals(this.postcode, school.postcode) &&
        Objects.equals(this.headTeacher, school.headTeacher);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, urn, laCode, laName, establishmentNumber, establishmentType, phase, street, town, postcode, headTeacher);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class School {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    urn: ").append(toIndentedString(urn)).append("\n");
    sb.append("    laCode: ").append(toIndentedString(laCode)).append("\n");
    sb.append("    laName: ").append(toIndentedString(laName)).append("\n");
    sb.append("    establishmentNumber: ").append(toIndentedString(establishmentNumber)).append("\n");
    sb.append("    establishmentType: ").append(toIndentedString(establishmentType)).append("\n");
    sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
    sb.append("    town: ").append(toIndentedString(town)).append("\n");
    sb.append("    postcode: ").append(toIndentedString(postcode)).append("\n");
    sb.append("    headTeacher: ").append(toIndentedString(headTeacher)).append("\n");
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

