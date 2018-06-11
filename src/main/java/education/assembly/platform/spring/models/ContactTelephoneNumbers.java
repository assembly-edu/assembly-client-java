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
 * No description
 */
@ApiModel(description = "No description")

public class ContactTelephoneNumbers implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("object")
  private String object = null;

  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("telephone_number")
  private String telephoneNumber = null;

  /**
   * The location associated with the telephone number. *Values*  |Value|Description| |---|---| |&#x60;Home&#x60;|Home| |&#x60;Work&#x60;|Work| |&#x60;null&#x60;|Not Applicable / Unknown| |&#x60;Other&#x60;|Other| 
   */
  public enum TypeEnum {
    HOME("Home"),
    
    WORK("Work"),
    
    NULL("null"),
    
    OTHER("Other");

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
  private TypeEnum type = TypeEnum.NULL;

  @JsonProperty("is_primary")
  private Boolean isPrimary = null;

  public ContactTelephoneNumbers object(String object) {
    this.object = object;
    return this;
  }

   /**
   * Object type
   * @return object
  **/
  @ApiModelProperty(example = "telephone_number", value = "Object type")
  public String getObject() {
    return object;
  }

  public void setObject(String object) {
    this.object = object;
  }

  public ContactTelephoneNumbers id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Internal stable ID given to all telephone numbers on the Platform
   * @return id
  **/
  @ApiModelProperty(example = "23", value = "Internal stable ID given to all telephone numbers on the Platform")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public ContactTelephoneNumbers telephoneNumber(String telephoneNumber) {
    this.telephoneNumber = telephoneNumber;
    return this;
  }

   /**
   * The telephone number
   * @return telephoneNumber
  **/
  @ApiModelProperty(example = "0123 456789", value = "The telephone number")
  public String getTelephoneNumber() {
    return telephoneNumber;
  }

  public void setTelephoneNumber(String telephoneNumber) {
    this.telephoneNumber = telephoneNumber;
  }

  public ContactTelephoneNumbers type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * The location associated with the telephone number. *Values*  |Value|Description| |---|---| |&#x60;Home&#x60;|Home| |&#x60;Work&#x60;|Work| |&#x60;null&#x60;|Not Applicable / Unknown| |&#x60;Other&#x60;|Other| 
   * @return type
  **/
  @ApiModelProperty(example = "Home", value = "The location associated with the telephone number. *Values*  |Value|Description| |---|---| |`Home`|Home| |`Work`|Work| |`null`|Not Applicable / Unknown| |`Other`|Other| ")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public ContactTelephoneNumbers isPrimary(Boolean isPrimary) {
    this.isPrimary = isPrimary;
    return this;
  }

   /**
   * Indicates whether this is the primary telephone number
   * @return isPrimary
  **/
  @ApiModelProperty(example = "true", value = "Indicates whether this is the primary telephone number")
  public Boolean isIsPrimary() {
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
    ContactTelephoneNumbers contactTelephoneNumbers = (ContactTelephoneNumbers) o;
    return Objects.equals(this.object, contactTelephoneNumbers.object) &&
        Objects.equals(this.id, contactTelephoneNumbers.id) &&
        Objects.equals(this.telephoneNumber, contactTelephoneNumbers.telephoneNumber) &&
        Objects.equals(this.type, contactTelephoneNumbers.type) &&
        Objects.equals(this.isPrimary, contactTelephoneNumbers.isPrimary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(object, id, telephoneNumber, type, isPrimary);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactTelephoneNumbers {\n");
    
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    telephoneNumber: ").append(toIndentedString(telephoneNumber)).append("\n");
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

