/*
 * assembly-client-java 1.2.471
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
 * The address of the contact
 */
@ApiModel(description = "The address of the contact")

public class ContactAddress implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("object")
  private String object = "address";

  @JsonProperty("address_line_1")
  private String addressLine1 = ;

  @JsonProperty("address_line_2")
  private String addressLine2 = ;

  @JsonProperty("town_city")
  private String townCity = ;

  @JsonProperty("county")
  private String county = ;

  @JsonProperty("country")
  private String country = ;

  @JsonProperty("postcode")
  private String postcode = ;

  public ContactAddress object(String object) {
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

  public ContactAddress addressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
    return this;
  }

   /**
   * The first line of the address (PAON and street)
   * @return addressLine1
  **/
  @ApiModelProperty(value = "The first line of the address (PAON and street)")
  public String getAddressLine1() {
    return addressLine1;
  }

  public void setAddressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
  }

  public ContactAddress addressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
    return this;
  }

   /**
   * The second line of the address (SAON)
   * @return addressLine2
  **/
  @ApiModelProperty(value = "The second line of the address (SAON)")
  public String getAddressLine2() {
    return addressLine2;
  }

  public void setAddressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
  }

  public ContactAddress townCity(String townCity) {
    this.townCity = townCity;
    return this;
  }

   /**
   * The town or city
   * @return townCity
  **/
  @ApiModelProperty(value = "The town or city")
  public String getTownCity() {
    return townCity;
  }

  public void setTownCity(String townCity) {
    this.townCity = townCity;
  }

  public ContactAddress county(String county) {
    this.county = county;
    return this;
  }

   /**
   * The county
   * @return county
  **/
  @ApiModelProperty(value = "The county")
  public String getCounty() {
    return county;
  }

  public void setCounty(String county) {
    this.county = county;
  }

  public ContactAddress country(String country) {
    this.country = country;
    return this;
  }

   /**
   * The country
   * @return country
  **/
  @ApiModelProperty(value = "The country")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public ContactAddress postcode(String postcode) {
    this.postcode = postcode;
    return this;
  }

   /**
   * The postcode
   * @return postcode
  **/
  @ApiModelProperty(value = "The postcode")
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
    ContactAddress contactAddress = (ContactAddress) o;
    return Objects.equals(this.object, contactAddress.object) &&
        Objects.equals(this.addressLine1, contactAddress.addressLine1) &&
        Objects.equals(this.addressLine2, contactAddress.addressLine2) &&
        Objects.equals(this.townCity, contactAddress.townCity) &&
        Objects.equals(this.county, contactAddress.county) &&
        Objects.equals(this.country, contactAddress.country) &&
        Objects.equals(this.postcode, contactAddress.postcode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(object, addressLine1, addressLine2, townCity, county, country, postcode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactAddress {\n");
    
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

