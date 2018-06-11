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
import education.assembly.platform.spring.models.GradesetGrades;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

/**
 * Gradesets offer an acceptable range of values for any given assessment.
 */
@ApiModel(description = "Gradesets offer an acceptable range of values for any given assessment.")

public class Gradeset implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("object")
  private String object = null;

  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("grades")
  private List<GradesetGrades> grades = null;

  public Gradeset object(String object) {
    this.object = object;
    return this;
  }

   /**
   * Object type
   * @return object
  **/
  @ApiModelProperty(example = "gradeset", value = "Object type")
  public String getObject() {
    return object;
  }

  public void setObject(String object) {
    this.object = object;
  }

  public Gradeset id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Internal stable ID given to all gradesets on the Platform
   * @return id
  **/
  @ApiModelProperty(example = "2", value = "Internal stable ID given to all gradesets on the Platform")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Gradeset name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the assessment family
   * @return name
  **/
  @ApiModelProperty(example = "Standardised Score", value = "The name of the assessment family")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Gradeset grades(List<GradesetGrades> grades) {
    this.grades = grades;
    return this;
  }

  public Gradeset addGradesItem(GradesetGrades gradesItem) {
    if (this.grades == null) {
      this.grades = new ArrayList<GradesetGrades>();
    }
    this.grades.add(gradesItem);
    return this;
  }

   /**
   * The grades are the acceptable values and ids that make up a gradeset.
   * @return grades
  **/
  @ApiModelProperty(value = "The grades are the acceptable values and ids that make up a gradeset.")
  public List<GradesetGrades> getGrades() {
    return grades;
  }

  public void setGrades(List<GradesetGrades> grades) {
    this.grades = grades;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Gradeset gradeset = (Gradeset) o;
    return Objects.equals(this.object, gradeset.object) &&
        Objects.equals(this.id, gradeset.id) &&
        Objects.equals(this.name, gradeset.name) &&
        Objects.equals(this.grades, gradeset.grades);
  }

  @Override
  public int hashCode() {
    return Objects.hash(object, id, name, grades);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Gradeset {\n");
    
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    grades: ").append(toIndentedString(grades)).append("\n");
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

