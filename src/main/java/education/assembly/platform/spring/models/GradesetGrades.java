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

public class GradesetGrades implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("value")
  private Float value = null;

  public GradesetGrades id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Internal stable ID given to all grades. Results should be written back to the Platform using the ID (as opposed to the &#39;name&#39;)
   * @return id
  **/
  @ApiModelProperty(example = "2032", value = "Internal stable ID given to all grades. Results should be written back to the Platform using the ID (as opposed to the 'name')")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public GradesetGrades name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the grade as a string
   * @return name
  **/
  @ApiModelProperty(example = "EXS", value = "The name of the grade as a string")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public GradesetGrades value(Float value) {
    this.value = value;
    return this;
  }

   /**
   * The value of the grade as a number
   * @return value
  **/
  @ApiModelProperty(example = "8.5", value = "The value of the grade as a number")
  public Float getValue() {
    return value;
  }

  public void setValue(Float value) {
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
    GradesetGrades gradesetGrades = (GradesetGrades) o;
    return Objects.equals(this.id, gradesetGrades.id) &&
        Objects.equals(this.name, gradesetGrades.name) &&
        Objects.equals(this.value, gradesetGrades.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GradesetGrades {\n");
    
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

