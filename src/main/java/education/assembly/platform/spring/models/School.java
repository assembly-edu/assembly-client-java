/*
 * assembly-client-java 1.2.424
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
 * Details for the school associated with the provided &#x60;access_token&#x60;.
 */
@ApiModel(description = "Details for the school associated with the provided `access_token`.")

public class School implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("object")
  private String object = "school";

  @JsonProperty("name")
  private String name = ;

  @JsonProperty("slug")
  private String slug = ;

  @JsonProperty("urn")
  private String urn = ;

  @JsonProperty("mis_provider")
  private String misProvider = ;

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

  public School object(String object) {
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

  public School name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the school
   * @return name
  **/
  @ApiModelProperty(value = "Name of the school")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public School slug(String slug) {
    this.slug = slug;
    return this;
  }

   /**
   * Assembly slug for the school
   * @return slug
  **/
  @ApiModelProperty(value = "Assembly slug for the school")
  public String getSlug() {
    return slug;
  }

  public void setSlug(String slug) {
    this.slug = slug;
  }

  public School urn(String urn) {
    this.urn = urn;
    return this;
  }

   /**
   * Unique Reference Number (URN) of the school
   * @return urn
  **/
  @ApiModelProperty(value = "Unique Reference Number (URN) of the school")
  public String getUrn() {
    return urn;
  }

  public void setUrn(String urn) {
    this.urn = urn;
  }

  public School misProvider(String misProvider) {
    this.misProvider = misProvider;
    return this;
  }

   /**
   * Name of school&#39;s MIS provider
   * @return misProvider
  **/
  @ApiModelProperty(value = "Name of school's MIS provider")
  public String getMisProvider() {
    return misProvider;
  }

  public void setMisProvider(String misProvider) {
    this.misProvider = misProvider;
  }

  public School laCode(Integer laCode) {
    this.laCode = laCode;
    return this;
  }

   /**
   * The code of the local authority that the school belongs to
   * @return laCode
  **/
  @ApiModelProperty(value = "The code of the local authority that the school belongs to")
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
   * The name of the local authority that the school belongs to
   * @return laName
  **/
  @ApiModelProperty(value = "The name of the local authority that the school belongs to")
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
   * The school&#39;s establishment number
   * @return establishmentNumber
  **/
  @ApiModelProperty(value = "The school's establishment number")
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
   * The type of establishment
   * @return establishmentType
  **/
  @ApiModelProperty(value = "The type of establishment")
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
   * The phase of the school (i.e. \&quot;Secondary, \&quot;Primary\&quot; or \&quot;All through\&quot;)
   * @return phase
  **/
  @ApiModelProperty(value = "The phase of the school (i.e. \"Secondary, \"Primary\" or \"All through\")")
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
   * The street that the school is on
   * @return street
  **/
  @ApiModelProperty(value = "The street that the school is on")
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
   * The town that the school is in
   * @return town
  **/
  @ApiModelProperty(value = "The town that the school is in")
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
   * The postcode of the school
   * @return postcode
  **/
  @ApiModelProperty(value = "The postcode of the school")
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
   * The school&#39;s head teacher name
   * @return headTeacher
  **/
  @ApiModelProperty(value = "The school's head teacher name")
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
    return Objects.equals(this.object, school.object) &&
        Objects.equals(this.name, school.name) &&
        Objects.equals(this.slug, school.slug) &&
        Objects.equals(this.urn, school.urn) &&
        Objects.equals(this.misProvider, school.misProvider) &&
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
    return Objects.hash(object, name, slug, urn, misProvider, laCode, laName, establishmentNumber, establishmentType, phase, street, town, postcode, headTeacher);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class School {\n");
    
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
    sb.append("    urn: ").append(toIndentedString(urn)).append("\n");
    sb.append("    misProvider: ").append(toIndentedString(misProvider)).append("\n");
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

