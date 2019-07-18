/*
 * assembly-client-java 1.2.376
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
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

/**
 * Information about the token used to access this endpoint
 */
@ApiModel(description = "Information about the token used to access this endpoint")

public class MeToken implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * What kind of token was used to access this resource
   */
  public enum AccessLevelEnum {
    APP("app"),
    
    SCHOOL("school");

    private String value;

    AccessLevelEnum(String value) {
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
    public static AccessLevelEnum fromValue(String text) {
      for (AccessLevelEnum b : AccessLevelEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("access_level")
  private AccessLevelEnum accessLevel = ;

  @JsonProperty("scopes")
  private List<String> scopes = null;

  public MeToken accessLevel(AccessLevelEnum accessLevel) {
    this.accessLevel = accessLevel;
    return this;
  }

   /**
   * What kind of token was used to access this resource
   * @return accessLevel
  **/
  @ApiModelProperty(value = "What kind of token was used to access this resource")
  public AccessLevelEnum getAccessLevel() {
    return accessLevel;
  }

  public void setAccessLevel(AccessLevelEnum accessLevel) {
    this.accessLevel = accessLevel;
  }

  public MeToken scopes(List<String> scopes) {
    this.scopes = scopes;
    return this;
  }

  public MeToken addScopesItem(String scopesItem) {
    if (this.scopes == null) {
      this.scopes = new ArrayList<String>();
    }
    this.scopes.add(scopesItem);
    return this;
  }

   /**
   * The scopes this token has access to. Will be empty in the case of an application token.
   * @return scopes
  **/
  @ApiModelProperty(value = "The scopes this token has access to. Will be empty in the case of an application token.")
  public List<String> getScopes() {
    return scopes;
  }

  public void setScopes(List<String> scopes) {
    this.scopes = scopes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MeToken meToken = (MeToken) o;
    return Objects.equals(this.accessLevel, meToken.accessLevel) &&
        Objects.equals(this.scopes, meToken.scopes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessLevel, scopes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MeToken {\n");
    
    sb.append("    accessLevel: ").append(toIndentedString(accessLevel)).append("\n");
    sb.append("    scopes: ").append(toIndentedString(scopes)).append("\n");
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

