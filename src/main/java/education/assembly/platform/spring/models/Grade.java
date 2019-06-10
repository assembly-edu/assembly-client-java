/*
 * assembly-client-java 1.2.368
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
 * An acceptable name and value for an assessment grade.
 */
@ApiModel(description = "An acceptable name and value for an assessment grade.")

public class Grade implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("object")
  private String object = "grade";

  @JsonProperty("id")
  private Integer id = ;

  @JsonProperty("name")
  private String name = ;

  @JsonProperty("value")
  private Integer value = ;

  public Grade object(String object) {
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

  public Grade id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Internal stable ID. Results should be written back using the ID (as opposed to the &#x60;name&#x60;)
   * @return id
  **/
  @ApiModelProperty(value = "Internal stable ID. Results should be written back using the ID (as opposed to the `name`)")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Grade name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the grade as a string
   * @return name
  **/
  @ApiModelProperty(value = "The name of the grade as a string")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Grade value(Integer value) {
    this.value = value;
    return this;
  }

   /**
   * The value of the grade as a number
   * @return value
  **/
  @ApiModelProperty(value = "The value of the grade as a number")
  public Integer getValue() {
    return value;
  }

  public void setValue(Integer value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Grade grade = (Grade) o;
    return Objects.equals(this.object, grade.object) &&
        Objects.equals(this.id, grade.id) &&
        Objects.equals(this.name, grade.name) &&
        Objects.equals(this.value, grade.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(object, id, name, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Grade {\n");
    
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

