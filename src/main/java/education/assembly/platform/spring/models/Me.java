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
import education.assembly.platform.spring.models.MeToken;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.threeten.bp.OffsetDateTime;
import java.io.Serializable;

/**
 * The application connecting to the API
 */
@ApiModel(description = "The application connecting to the API")

public class Me implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("object")
  private String object = "application";

  @JsonProperty("id")
  private Integer id = ;

  @JsonProperty("name")
  private String name = ;

  @JsonProperty("decription")
  private String decription = ;

  @JsonProperty("website_uri")
  private String websiteUri = ;

  @JsonProperty("support_uri")
  private String supportUri = ;

  @JsonProperty("privacy_policy_uri")
  private String privacyPolicyUri = ;

  @JsonProperty("redirect_uri")
  private String redirectUri = ;

  @JsonProperty("install_uri")
  private String installUri = ;

  @JsonProperty("listed")
  private Boolean listed = ;

  @JsonProperty("sandbox")
  private Boolean sandbox = ;

  @JsonProperty("force_urn_check")
  private Boolean forceUrnCheck = ;

  @JsonProperty("created_at")
  private OffsetDateTime createdAt = ;

  @JsonProperty("updated_at")
  private OffsetDateTime updatedAt = ;

  @JsonProperty("token")
  private MeToken token = null;

  public Me object(String object) {
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

  public Me id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Internal stable ID
   * @return id
  **/
  @ApiModelProperty(value = "Internal stable ID")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Me name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Application name
   * @return name
  **/
  @ApiModelProperty(value = "Application name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Me decription(String decription) {
    this.decription = decription;
    return this;
  }

   /**
   * Application description
   * @return decription
  **/
  @ApiModelProperty(value = "Application description")
  public String getDecription() {
    return decription;
  }

  public void setDecription(String decription) {
    this.decription = decription;
  }

  public Me websiteUri(String websiteUri) {
    this.websiteUri = websiteUri;
    return this;
  }

   /**
   * Main application/company URI
   * @return websiteUri
  **/
  @ApiModelProperty(value = "Main application/company URI")
  public String getWebsiteUri() {
    return websiteUri;
  }

  public void setWebsiteUri(String websiteUri) {
    this.websiteUri = websiteUri;
  }

  public Me supportUri(String supportUri) {
    this.supportUri = supportUri;
    return this;
  }

   /**
   * Support URI
   * @return supportUri
  **/
  @ApiModelProperty(value = "Support URI")
  public String getSupportUri() {
    return supportUri;
  }

  public void setSupportUri(String supportUri) {
    this.supportUri = supportUri;
  }

  public Me privacyPolicyUri(String privacyPolicyUri) {
    this.privacyPolicyUri = privacyPolicyUri;
    return this;
  }

   /**
   * Privacy Policy URI
   * @return privacyPolicyUri
  **/
  @ApiModelProperty(value = "Privacy Policy URI")
  public String getPrivacyPolicyUri() {
    return privacyPolicyUri;
  }

  public void setPrivacyPolicyUri(String privacyPolicyUri) {
    this.privacyPolicyUri = privacyPolicyUri;
  }

  public Me redirectUri(String redirectUri) {
    this.redirectUri = redirectUri;
    return this;
  }

   /**
   * The URL on your site for OAuth responses
   * @return redirectUri
  **/
  @ApiModelProperty(value = "The URL on your site for OAuth responses")
  public String getRedirectUri() {
    return redirectUri;
  }

  public void setRedirectUri(String redirectUri) {
    this.redirectUri = redirectUri;
  }

  public Me installUri(String installUri) {
    this.installUri = installUri;
    return this;
  }

   /**
   * The URL where we will send users to install your app
   * @return installUri
  **/
  @ApiModelProperty(value = "The URL where we will send users to install your app")
  public String getInstallUri() {
    return installUri;
  }

  public void setInstallUri(String installUri) {
    this.installUri = installUri;
  }

  public Me listed(Boolean listed) {
    this.listed = listed;
    return this;
  }

   /**
   * Whether this application is publicly listed for schools to find
   * @return listed
  **/
  @ApiModelProperty(value = "Whether this application is publicly listed for schools to find")
  public Boolean isgetListed() {
    return listed;
  }

  public void setListed(Boolean listed) {
    this.listed = listed;
  }

  public Me sandbox(Boolean sandbox) {
    this.sandbox = sandbox;
    return this;
  }

   /**
   * Whether this application is a sandbox app
   * @return sandbox
  **/
  @ApiModelProperty(value = "Whether this application is a sandbox app")
  public Boolean isgetSandbox() {
    return sandbox;
  }

  public void setSandbox(Boolean sandbox) {
    this.sandbox = sandbox;
  }

  public Me forceUrnCheck(Boolean forceUrnCheck) {
    this.forceUrnCheck = forceUrnCheck;
    return this;
  }

   /**
   * Whether schools are forced to have their URN checked when authorizint this application
   * @return forceUrnCheck
  **/
  @ApiModelProperty(value = "Whether schools are forced to have their URN checked when authorizint this application")
  public Boolean isgetForceUrnCheck() {
    return forceUrnCheck;
  }

  public void setForceUrnCheck(Boolean forceUrnCheck) {
    this.forceUrnCheck = forceUrnCheck;
  }

  public Me createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * When the application was created
   * @return createdAt
  **/
  @ApiModelProperty(value = "When the application was created")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public Me updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * When the application was last updated
   * @return updatedAt
  **/
  @ApiModelProperty(value = "When the application was last updated")
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  public Me token(MeToken token) {
    this.token = token;
    return this;
  }

   /**
   * Get token
   * @return token
  **/
  @ApiModelProperty(value = "")
  public MeToken getToken() {
    return token;
  }

  public void setToken(MeToken token) {
    this.token = token;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Me me = (Me) o;
    return Objects.equals(this.object, me.object) &&
        Objects.equals(this.id, me.id) &&
        Objects.equals(this.name, me.name) &&
        Objects.equals(this.decription, me.decription) &&
        Objects.equals(this.websiteUri, me.websiteUri) &&
        Objects.equals(this.supportUri, me.supportUri) &&
        Objects.equals(this.privacyPolicyUri, me.privacyPolicyUri) &&
        Objects.equals(this.redirectUri, me.redirectUri) &&
        Objects.equals(this.installUri, me.installUri) &&
        Objects.equals(this.listed, me.listed) &&
        Objects.equals(this.sandbox, me.sandbox) &&
        Objects.equals(this.forceUrnCheck, me.forceUrnCheck) &&
        Objects.equals(this.createdAt, me.createdAt) &&
        Objects.equals(this.updatedAt, me.updatedAt) &&
        Objects.equals(this.token, me.token);
  }

  @Override
  public int hashCode() {
    return Objects.hash(object, id, name, decription, websiteUri, supportUri, privacyPolicyUri, redirectUri, installUri, listed, sandbox, forceUrnCheck, createdAt, updatedAt, token);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Me {\n");
    
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    decription: ").append(toIndentedString(decription)).append("\n");
    sb.append("    websiteUri: ").append(toIndentedString(websiteUri)).append("\n");
    sb.append("    supportUri: ").append(toIndentedString(supportUri)).append("\n");
    sb.append("    privacyPolicyUri: ").append(toIndentedString(privacyPolicyUri)).append("\n");
    sb.append("    redirectUri: ").append(toIndentedString(redirectUri)).append("\n");
    sb.append("    installUri: ").append(toIndentedString(installUri)).append("\n");
    sb.append("    listed: ").append(toIndentedString(listed)).append("\n");
    sb.append("    sandbox: ").append(toIndentedString(sandbox)).append("\n");
    sb.append("    forceUrnCheck: ").append(toIndentedString(forceUrnCheck)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
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

