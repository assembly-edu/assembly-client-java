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
 * An assessment point represents a point in the school key stage, year, term or half-term that results can be attached to.
 */
@ApiModel(description = "An assessment point represents a point in the school key stage, year, term or half-term that results can be attached to.")

public class AssessmentPoint implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("object")
  private String object = null;

  @JsonProperty("rank")
  private Integer rank = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("year_code")
  private String yearCode = null;

  public AssessmentPoint object(String object) {
    this.object = object;
    return this;
  }

   /**
   * Object type
   * @return object
  **/
  @ApiModelProperty(example = "assessment_point", value = "Object type")
  public String getObject() {
    return object;
  }

  public void setObject(String object) {
    this.object = object;
  }

  public AssessmentPoint rank(Integer rank) {
    this.rank = rank;
    return this;
  }

   /**
   * A stable number consistently assigned to assessment points across all environments. This field should be used to send results back to the Platform
   * @return rank
  **/
  @ApiModelProperty(example = "122", value = "A stable number consistently assigned to assessment points across all environments. This field should be used to send results back to the Platform")
  public Integer getRank() {
    return rank;
  }

  public void setRank(Integer rank) {
    this.rank = rank;
  }

  public AssessmentPoint name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the assessment point
   * @return name
  **/
  @ApiModelProperty(example = "Key Stage 2", value = "The name of the assessment point")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AssessmentPoint type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The time period that the assessment point relates to. This can be an entire key stage, an entire year, or a single term or half-term
   * @return type
  **/
  @ApiModelProperty(example = "term", value = "The time period that the assessment point relates to. This can be an entire key stage, an entire year, or a single term or half-term")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public AssessmentPoint yearCode(String yearCode) {
    this.yearCode = yearCode;
    return this;
  }

   /**
   * This field ties an assessment point to a year group.
   * @return yearCode
  **/
  @ApiModelProperty(example = "Year 6 Spring 2", value = "This field ties an assessment point to a year group.")
  public String getYearCode() {
    return yearCode;
  }

  public void setYearCode(String yearCode) {
    this.yearCode = yearCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssessmentPoint assessmentPoint = (AssessmentPoint) o;
    return Objects.equals(this.object, assessmentPoint.object) &&
        Objects.equals(this.rank, assessmentPoint.rank) &&
        Objects.equals(this.name, assessmentPoint.name) &&
        Objects.equals(this.type, assessmentPoint.type) &&
        Objects.equals(this.yearCode, assessmentPoint.yearCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(object, rank, name, type, yearCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssessmentPoint {\n");
    
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    rank: ").append(toIndentedString(rank)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    yearCode: ").append(toIndentedString(yearCode)).append("\n");
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

