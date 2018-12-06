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
 * SchoolDetails
 */

public class SchoolDetails implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("urn")
  private String urn = null;

  @JsonProperty("la_code")
  private Integer laCode = null;

  @JsonProperty("la_name")
  private String laName = null;

  @JsonProperty("establishment_number")
  private Integer establishmentNumber = null;

  @JsonProperty("establishment_type")
  private String establishmentType = null;

  @JsonProperty("phase")
  private String phase = null;

  @JsonProperty("street")
  private String street = null;

  @JsonProperty("town")
  private String town = null;

  @JsonProperty("postcode")
  private String postcode = null;

  @JsonProperty("head_teacher")
  private String headTeacher = null;

  public SchoolDetails name(String name) {
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

  public SchoolDetails urn(String urn) {
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

  public SchoolDetails laCode(Integer laCode) {
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

  public SchoolDetails laName(String laName) {
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

  public SchoolDetails establishmentNumber(Integer establishmentNumber) {
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

  public SchoolDetails establishmentType(String establishmentType) {
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

  public SchoolDetails phase(String phase) {
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

  public SchoolDetails street(String street) {
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

  public SchoolDetails town(String town) {
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

  public SchoolDetails postcode(String postcode) {
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

  public SchoolDetails headTeacher(String headTeacher) {
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
    SchoolDetails schoolDetails = (SchoolDetails) o;
    return Objects.equals(this.name, schoolDetails.name) &&
        Objects.equals(this.urn, schoolDetails.urn) &&
        Objects.equals(this.laCode, schoolDetails.laCode) &&
        Objects.equals(this.laName, schoolDetails.laName) &&
        Objects.equals(this.establishmentNumber, schoolDetails.establishmentNumber) &&
        Objects.equals(this.establishmentType, schoolDetails.establishmentType) &&
        Objects.equals(this.phase, schoolDetails.phase) &&
        Objects.equals(this.street, schoolDetails.street) &&
        Objects.equals(this.town, schoolDetails.town) &&
        Objects.equals(this.postcode, schoolDetails.postcode) &&
        Objects.equals(this.headTeacher, schoolDetails.headTeacher);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, urn, laCode, laName, establishmentNumber, establishmentType, phase, street, town, postcode, headTeacher);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SchoolDetails {\n");
    
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

