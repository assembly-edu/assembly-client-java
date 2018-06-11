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
 * Returns details for the school associated with the provided access_token.
 */
@ApiModel(description = "Returns details for the school associated with the provided access_token.")

public class SchoolDetailsListData implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("object")
  private String object = null;

  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("urn")
  private String urn = null;

  @JsonProperty("la_code")
  private String laCode = null;

  @JsonProperty("la_name")
  private String laName = null;

  @JsonProperty("establishment_number")
  private String establishmentNumber = null;

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

  public SchoolDetailsListData object(String object) {
    this.object = object;
    return this;
  }

   /**
   * Object type
   * @return object
  **/
  @ApiModelProperty(example = "school_details", value = "Object type")
  public String getObject() {
    return object;
  }

  public void setObject(String object) {
    this.object = object;
  }

  public SchoolDetailsListData id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Internal stable ID given to all schools on Platform
   * @return id
  **/
  @ApiModelProperty(example = "1231", value = "Internal stable ID given to all schools on Platform")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public SchoolDetailsListData name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the school
   * @return name
  **/
  @ApiModelProperty(example = "Test School", value = "Name of the school")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SchoolDetailsListData urn(String urn) {
    this.urn = urn;
    return this;
  }

   /**
   * Unique Reference Number (URN) of the school
   * @return urn
  **/
  @ApiModelProperty(example = "123456", value = "Unique Reference Number (URN) of the school")
  public String getUrn() {
    return urn;
  }

  public void setUrn(String urn) {
    this.urn = urn;
  }

  public SchoolDetailsListData laCode(String laCode) {
    this.laCode = laCode;
    return this;
  }

   /**
   * The code of the local authority that the school belongs to
   * @return laCode
  **/
  @ApiModelProperty(example = "123", value = "The code of the local authority that the school belongs to")
  public String getLaCode() {
    return laCode;
  }

  public void setLaCode(String laCode) {
    this.laCode = laCode;
  }

  public SchoolDetailsListData laName(String laName) {
    this.laName = laName;
    return this;
  }

   /**
   * The name of the local authority that the school belongs to
   * @return laName
  **/
  @ApiModelProperty(example = "City of London", value = "The name of the local authority that the school belongs to")
  public String getLaName() {
    return laName;
  }

  public void setLaName(String laName) {
    this.laName = laName;
  }

  public SchoolDetailsListData establishmentNumber(String establishmentNumber) {
    this.establishmentNumber = establishmentNumber;
    return this;
  }

   /**
   * The school&#39;s establishment or &#39;DfE number&#39;
   * @return establishmentNumber
  **/
  @ApiModelProperty(example = "4321", value = "The school's establishment or 'DfE number'")
  public String getEstablishmentNumber() {
    return establishmentNumber;
  }

  public void setEstablishmentNumber(String establishmentNumber) {
    this.establishmentNumber = establishmentNumber;
  }

  public SchoolDetailsListData establishmentType(String establishmentType) {
    this.establishmentType = establishmentType;
    return this;
  }

   /**
   * The type of establishment
   * @return establishmentType
  **/
  @ApiModelProperty(example = "Community School", value = "The type of establishment")
  public String getEstablishmentType() {
    return establishmentType;
  }

  public void setEstablishmentType(String establishmentType) {
    this.establishmentType = establishmentType;
  }

  public SchoolDetailsListData phase(String phase) {
    this.phase = phase;
    return this;
  }

   /**
   * The phase of the school (i.e. &#39;Secondary&#39;, &#39;Primary&#39; or &#39;All through&#39;)
   * @return phase
  **/
  @ApiModelProperty(example = "Secondary", value = "The phase of the school (i.e. 'Secondary', 'Primary' or 'All through')")
  public String getPhase() {
    return phase;
  }

  public void setPhase(String phase) {
    this.phase = phase;
  }

  public SchoolDetailsListData street(String street) {
    this.street = street;
    return this;
  }

   /**
   * The street that the school is on
   * @return street
  **/
  @ApiModelProperty(example = "High Street", value = "The street that the school is on")
  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public SchoolDetailsListData town(String town) {
    this.town = town;
    return this;
  }

   /**
   * The town that the school is in
   * @return town
  **/
  @ApiModelProperty(example = "London", value = "The town that the school is in")
  public String getTown() {
    return town;
  }

  public void setTown(String town) {
    this.town = town;
  }

  public SchoolDetailsListData postcode(String postcode) {
    this.postcode = postcode;
    return this;
  }

   /**
   * The postcode of the school
   * @return postcode
  **/
  @ApiModelProperty(example = "SE1 1AA", value = "The postcode of the school")
  public String getPostcode() {
    return postcode;
  }

  public void setPostcode(String postcode) {
    this.postcode = postcode;
  }

  public SchoolDetailsListData headTeacher(String headTeacher) {
    this.headTeacher = headTeacher;
    return this;
  }

   /**
   * The school&#39;s head teacher name
   * @return headTeacher
  **/
  @ApiModelProperty(example = "Mrs A Smith", value = "The school's head teacher name")
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
    SchoolDetailsListData schoolDetailsListData = (SchoolDetailsListData) o;
    return Objects.equals(this.object, schoolDetailsListData.object) &&
        Objects.equals(this.id, schoolDetailsListData.id) &&
        Objects.equals(this.name, schoolDetailsListData.name) &&
        Objects.equals(this.urn, schoolDetailsListData.urn) &&
        Objects.equals(this.laCode, schoolDetailsListData.laCode) &&
        Objects.equals(this.laName, schoolDetailsListData.laName) &&
        Objects.equals(this.establishmentNumber, schoolDetailsListData.establishmentNumber) &&
        Objects.equals(this.establishmentType, schoolDetailsListData.establishmentType) &&
        Objects.equals(this.phase, schoolDetailsListData.phase) &&
        Objects.equals(this.street, schoolDetailsListData.street) &&
        Objects.equals(this.town, schoolDetailsListData.town) &&
        Objects.equals(this.postcode, schoolDetailsListData.postcode) &&
        Objects.equals(this.headTeacher, schoolDetailsListData.headTeacher);
  }

  @Override
  public int hashCode() {
    return Objects.hash(object, id, name, urn, laCode, laName, establishmentNumber, establishmentType, phase, street, town, postcode, headTeacher);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SchoolDetailsListData {\n");
    
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

