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
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

/**
 * StudentMedical
 */

public class StudentMedical implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("dietary_needs")
  private List<String> dietaryNeeds = null;

  public StudentMedical dietaryNeeds(List<String> dietaryNeeds) {
    this.dietaryNeeds = dietaryNeeds;
    return this;
  }

  public StudentMedical addDietaryNeedsItem(String dietaryNeedsItem) {
    if (this.dietaryNeeds == null) {
      this.dietaryNeeds = new ArrayList<String>();
    }
    this.dietaryNeeds.add(dietaryNeedsItem);
    return this;
  }

   /**
   * Get dietaryNeeds
   * @return dietaryNeeds
  **/
  @ApiModelProperty(value = "")
  public List<String> getDietaryNeeds() {
    return dietaryNeeds;
  }

  public void setDietaryNeeds(List<String> dietaryNeeds) {
    this.dietaryNeeds = dietaryNeeds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StudentMedical studentMedical = (StudentMedical) o;
    return Objects.equals(this.dietaryNeeds, studentMedical.dietaryNeeds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dietaryNeeds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StudentMedical {\n");
    
    sb.append("    dietaryNeeds: ").append(toIndentedString(dietaryNeeds)).append("\n");
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

