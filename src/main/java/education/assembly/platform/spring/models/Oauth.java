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
 * The OAuth endpoints are available to gain authorisation to access a school&#39;s data.
 */
@ApiModel(description = "The OAuth endpoints are available to gain authorisation to access a school's data.")

public class Oauth implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("access_token")
  private String accessToken = null;

  @JsonProperty("refresh_token")
  private String refreshToken = null;

  @JsonProperty("token_type")
  private String tokenType = null;

  @JsonProperty("level")
  private String level = null;

  @JsonProperty("expires_in")
  private Integer expiresIn = null;

  @JsonProperty("school_id")
  private Integer schoolId = null;

  public Oauth accessToken(String accessToken) {
    this.accessToken = accessToken;
    return this;
  }

   /**
   * Access token grants authorisation to school data (currently valid for a period of 1 day)
   * @return accessToken
  **/
  @ApiModelProperty(example = "U10.cre0RDDZ_xfGz0", value = "Access token grants authorisation to school data (currently valid for a period of 1 day)")
  public String getAccessToken() {
    return accessToken;
  }

  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }

  public Oauth refreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
    return this;
  }

   /**
   * Refresh tokens should be used to aquire a new access token upon expiry of access tokens
   * @return refreshToken
  **/
  @ApiModelProperty(example = "34g9hp0obobgo9g23", value = "Refresh tokens should be used to aquire a new access token upon expiry of access tokens")
  public String getRefreshToken() {
    return refreshToken;
  }

  public void setRefreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
  }

  public Oauth tokenType(String tokenType) {
    this.tokenType = tokenType;
    return this;
  }

   /**
   * Provides the client with the information to utilise the access token to make a resource request
   * @return tokenType
  **/
  @ApiModelProperty(example = "Bearer", value = "Provides the client with the information to utilise the access token to make a resource request")
  public String getTokenType() {
    return tokenType;
  }

  public void setTokenType(String tokenType) {
    this.tokenType = tokenType;
  }

  public Oauth level(String level) {
    this.level = level;
    return this;
  }

   /**
   * Details whether the token gives access to application level resources or school data.
   * @return level
  **/
  @ApiModelProperty(example = "app", value = "Details whether the token gives access to application level resources or school data.")
  public String getLevel() {
    return level;
  }

  public void setLevel(String level) {
    this.level = level;
  }

  public Oauth expiresIn(Integer expiresIn) {
    this.expiresIn = expiresIn;
    return this;
  }

   /**
   * The amount of time (in seconds) that the access token is valid for
   * @return expiresIn
  **/
  @ApiModelProperty(example = "108000", value = "The amount of time (in seconds) that the access token is valid for")
  public Integer getExpiresIn() {
    return expiresIn;
  }

  public void setExpiresIn(Integer expiresIn) {
    this.expiresIn = expiresIn;
  }

  public Oauth schoolId(Integer schoolId) {
    this.schoolId = schoolId;
    return this;
  }

   /**
   * Internal Platform ID for school that the token applies to
   * @return schoolId
  **/
  @ApiModelProperty(example = "143", value = "Internal Platform ID for school that the token applies to")
  public Integer getSchoolId() {
    return schoolId;
  }

  public void setSchoolId(Integer schoolId) {
    this.schoolId = schoolId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Oauth oauth = (Oauth) o;
    return Objects.equals(this.accessToken, oauth.accessToken) &&
        Objects.equals(this.refreshToken, oauth.refreshToken) &&
        Objects.equals(this.tokenType, oauth.tokenType) &&
        Objects.equals(this.level, oauth.level) &&
        Objects.equals(this.expiresIn, oauth.expiresIn) &&
        Objects.equals(this.schoolId, oauth.schoolId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessToken, refreshToken, tokenType, level, expiresIn, schoolId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Oauth {\n");
    
    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
    sb.append("    refreshToken: ").append(toIndentedString(refreshToken)).append("\n");
    sb.append("    tokenType: ").append(toIndentedString(tokenType)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    expiresIn: ").append(toIndentedString(expiresIn)).append("\n");
    sb.append("    schoolId: ").append(toIndentedString(schoolId)).append("\n");
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

