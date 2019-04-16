/*
 * assembly-client-java 1.1.0
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
import education.assembly.platform.spring.models.Grade;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

/**
 * A named grouping of grades that make an acceptable range of values for any given assessment.
 */
@ApiModel(description = "A named grouping of grades that make an acceptable range of values for any given assessment.")

public class GradeSet implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("object")
  private String object = "grade_set";

  @JsonProperty("id")
  private Integer id = ;

  @JsonProperty("name")
  private String name = ;

  @JsonProperty("grades")
  private List<Grade> grades = null;

  public GradeSet object(String object) {
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

  public GradeSet id(Integer id) {
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

  public GradeSet name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the assessment family
   * @return name
  **/
  @ApiModelProperty(value = "The name of the assessment family")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public GradeSet grades(List<Grade> grades) {
    this.grades = grades;
    return this;
  }

  public GradeSet addGradesItem(Grade gradesItem) {
    if (this.grades == null) {
      this.grades = new ArrayList<Grade>();
    }
    this.grades.add(gradesItem);
    return this;
  }

   /**
   * The grades that this gradeset contains
   * @return grades
  **/
  @ApiModelProperty(value = "The grades that this gradeset contains")
  public List<Grade> getGrades() {
    return grades;
  }

  public void setGrades(List<Grade> grades) {
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
    GradeSet gradeSet = (GradeSet) o;
    return Objects.equals(this.object, gradeSet.object) &&
        Objects.equals(this.id, gradeSet.id) &&
        Objects.equals(this.name, gradeSet.name) &&
        Objects.equals(this.grades, gradeSet.grades);
  }

  @Override
  public int hashCode() {
    return Objects.hash(object, id, name, grades);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GradeSet {\n");
    
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

