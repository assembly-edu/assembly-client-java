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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

/**
 * AssessmentPoint
 */

public class AssessmentPoint implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("rank")
  private Integer rank = ;

  @JsonProperty("name")
  private String name = ;

  @JsonProperty("type")
  private String type = ;

  @JsonProperty("year_code")
  private String yearCode = ;

  public AssessmentPoint rank(Integer rank) {
    this.rank = rank;
    return this;
  }

   /**
   * Get rank
   * @return rank
  **/
  @ApiModelProperty(value = "")
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
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
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
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
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
   * Get yearCode
   * @return yearCode
  **/
  @ApiModelProperty(value = "")
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
    return Objects.equals(this.rank, assessmentPoint.rank) &&
        Objects.equals(this.name, assessmentPoint.name) &&
        Objects.equals(this.type, assessmentPoint.type) &&
        Objects.equals(this.yearCode, assessmentPoint.yearCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rank, name, type, yearCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssessmentPoint {\n");
    
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

