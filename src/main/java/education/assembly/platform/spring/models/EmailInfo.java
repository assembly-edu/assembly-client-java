/*
 * assembly-client-java 1.2.475
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
 * An email address.
 */
@ApiModel(description = "An email address.")

public class EmailInfo implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("object")
  private String object = "email";

  @JsonProperty("id")
  private Integer id = ;

  @JsonProperty("email")
  private String email = ;

  /**
   * The location associated with the email address
   */
  public enum TypeEnum {
    HOME("Home"),
    
    WORK("Work"),
    
    OTHER("Other"),
    
    NULL("null");

    private String value;

    TypeEnum(String value) {
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
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("type")
  private TypeEnum type = ;

  @JsonProperty("is_primary")
  private Boolean isPrimary = ;

  public EmailInfo object(String object) {
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

  public EmailInfo id(Integer id) {
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

  public EmailInfo email(String email) {
    this.email = email;
    return this;
  }

   /**
   * The email address
   * @return email
  **/
  @ApiModelProperty(value = "The email address")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public EmailInfo type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * The location associated with the email address
   * @return type
  **/
  @ApiModelProperty(value = "The location associated with the email address")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public EmailInfo isPrimary(Boolean isPrimary) {
    this.isPrimary = isPrimary;
    return this;
  }

   /**
   * Indicates whether this is the primary email address
   * @return isPrimary
  **/
  @ApiModelProperty(value = "Indicates whether this is the primary email address")
  public Boolean isgetIsPrimary() {
    return isPrimary;
  }

  public void setIsPrimary(Boolean isPrimary) {
    this.isPrimary = isPrimary;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmailInfo emailInfo = (EmailInfo) o;
    return Objects.equals(this.object, emailInfo.object) &&
        Objects.equals(this.id, emailInfo.id) &&
        Objects.equals(this.email, emailInfo.email) &&
        Objects.equals(this.type, emailInfo.type) &&
        Objects.equals(this.isPrimary, emailInfo.isPrimary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(object, id, email, type, isPrimary);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmailInfo {\n");
    
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    isPrimary: ").append(toIndentedString(isPrimary)).append("\n");
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

