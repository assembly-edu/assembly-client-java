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
 * A dietary need defined in the MIS.
 */
@ApiModel(description = "A dietary need defined in the MIS.")

public class DietaryNeed implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("object")
  private String object = "dietary_need";

  @JsonProperty("id")
  private Integer id = ;

  @JsonProperty("code")
  private String code = ;

  @JsonProperty("name")
  private String name = ;

  public DietaryNeed object(String object) {
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

  public DietaryNeed id(Integer id) {
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

  public DietaryNeed code(String code) {
    this.code = code;
    return this;
  }

   /**
   * The code of the dietary need
   * @return code
  **/
  @ApiModelProperty(value = "The code of the dietary need")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public DietaryNeed name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the dietary need
   * @return name
  **/
  @ApiModelProperty(value = "The name of the dietary need")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DietaryNeed dietaryNeed = (DietaryNeed) o;
    return Objects.equals(this.object, dietaryNeed.object) &&
        Objects.equals(this.id, dietaryNeed.id) &&
        Objects.equals(this.code, dietaryNeed.code) &&
        Objects.equals(this.name, dietaryNeed.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(object, id, code, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DietaryNeed {\n");
    
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

