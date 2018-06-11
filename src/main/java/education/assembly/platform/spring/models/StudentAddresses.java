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
 * The home address and postcode of a student.
 */
@ApiModel(description = "The home address and postcode of a student.")

public class StudentAddresses implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("object")
  private String object = null;

  @JsonProperty("address_line_1")
  private String addressLine1 = null;

  @JsonProperty("address_line_2")
  private String addressLine2 = null;

  @JsonProperty("town_city")
  private String townCity = null;

  @JsonProperty("county")
  private String county = null;

  @JsonProperty("country")
  private String country = null;

  @JsonProperty("postcode")
  private String postcode = null;

  public StudentAddresses object(String object) {
    this.object = object;
    return this;
  }

   /**
   * Object type
   * @return object
  **/
  @ApiModelProperty(example = "addresses", value = "Object type")
  public String getObject() {
    return object;
  }

  public void setObject(String object) {
    this.object = object;
  }

  public StudentAddresses addressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
    return this;
  }

   /**
   * The first line of the address
   * @return addressLine1
  **/
  @ApiModelProperty(example = "1 King Street", value = "The first line of the address")
  public String getAddressLine1() {
    return addressLine1;
  }

  public void setAddressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
  }

  public StudentAddresses addressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
    return this;
  }

   /**
   * The second line of the address
   * @return addressLine2
  **/
  @ApiModelProperty(example = "Flat 1", value = "The second line of the address")
  public String getAddressLine2() {
    return addressLine2;
  }

  public void setAddressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
  }

  public StudentAddresses townCity(String townCity) {
    this.townCity = townCity;
    return this;
  }

   /**
   * The town or city
   * @return townCity
  **/
  @ApiModelProperty(example = "Maidstone", value = "The town or city")
  public String getTownCity() {
    return townCity;
  }

  public void setTownCity(String townCity) {
    this.townCity = townCity;
  }

  public StudentAddresses county(String county) {
    this.county = county;
    return this;
  }

   /**
   * The county
   * @return county
  **/
  @ApiModelProperty(example = "Kent", value = "The county")
  public String getCounty() {
    return county;
  }

  public void setCounty(String county) {
    this.county = county;
  }

  public StudentAddresses country(String country) {
    this.country = country;
    return this;
  }

   /**
   * The country
   * @return country
  **/
  @ApiModelProperty(example = "United Kingdom", value = "The country")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public StudentAddresses postcode(String postcode) {
    this.postcode = postcode;
    return this;
  }

   /**
   * The postcode
   * @return postcode
  **/
  @ApiModelProperty(example = "A1 1AA", value = "The postcode")
  public String getPostcode() {
    return postcode;
  }

  public void setPostcode(String postcode) {
    this.postcode = postcode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StudentAddresses studentAddresses = (StudentAddresses) o;
    return Objects.equals(this.object, studentAddresses.object) &&
        Objects.equals(this.addressLine1, studentAddresses.addressLine1) &&
        Objects.equals(this.addressLine2, studentAddresses.addressLine2) &&
        Objects.equals(this.townCity, studentAddresses.townCity) &&
        Objects.equals(this.county, studentAddresses.county) &&
        Objects.equals(this.country, studentAddresses.country) &&
        Objects.equals(this.postcode, studentAddresses.postcode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(object, addressLine1, addressLine2, townCity, county, country, postcode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StudentAddresses {\n");
    
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    addressLine1: ").append(toIndentedString(addressLine1)).append("\n");
    sb.append("    addressLine2: ").append(toIndentedString(addressLine2)).append("\n");
    sb.append("    townCity: ").append(toIndentedString(townCity)).append("\n");
    sb.append("    county: ").append(toIndentedString(county)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    postcode: ").append(toIndentedString(postcode)).append("\n");
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

