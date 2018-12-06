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
import education.assembly.platform.spring.models.AssessmentMisAssessments;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

/**
 * Assessment
 */

public class Assessment implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("family_id")
  private Integer familyId = null;

  @JsonProperty("family_name")
  private String familyName = null;

  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("mis_assessments")
  private List<AssessmentMisAssessments> misAssessments = null;

  public Assessment familyId(Integer familyId) {
    this.familyId = familyId;
    return this;
  }

   /**
   * Get familyId
   * @return familyId
  **/
  @ApiModelProperty(value = "")
  public Integer getFamilyId() {
    return familyId;
  }

  public void setFamilyId(Integer familyId) {
    this.familyId = familyId;
  }

  public Assessment familyName(String familyName) {
    this.familyName = familyName;
    return this;
  }

   /**
   * Get familyName
   * @return familyName
  **/
  @ApiModelProperty(value = "")
  public String getFamilyName() {
    return familyName;
  }

  public void setFamilyName(String familyName) {
    this.familyName = familyName;
  }

  public Assessment id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Assessment name(String name) {
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

  public Assessment misAssessments(List<AssessmentMisAssessments> misAssessments) {
    this.misAssessments = misAssessments;
    return this;
  }

  public Assessment addMisAssessmentsItem(AssessmentMisAssessments misAssessmentsItem) {
    if (this.misAssessments == null) {
      this.misAssessments = new ArrayList<AssessmentMisAssessments>();
    }
    this.misAssessments.add(misAssessmentsItem);
    return this;
  }

   /**
   * Get misAssessments
   * @return misAssessments
  **/
  @ApiModelProperty(value = "")
  public List<AssessmentMisAssessments> getMisAssessments() {
    return misAssessments;
  }

  public void setMisAssessments(List<AssessmentMisAssessments> misAssessments) {
    this.misAssessments = misAssessments;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Assessment assessment = (Assessment) o;
    return Objects.equals(this.familyId, assessment.familyId) &&
        Objects.equals(this.familyName, assessment.familyName) &&
        Objects.equals(this.id, assessment.id) &&
        Objects.equals(this.name, assessment.name) &&
        Objects.equals(this.misAssessments, assessment.misAssessments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(familyId, familyName, id, name, misAssessments);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Assessment {\n");
    
    sb.append("    familyId: ").append(toIndentedString(familyId)).append("\n");
    sb.append("    familyName: ").append(toIndentedString(familyName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    misAssessments: ").append(toIndentedString(misAssessments)).append("\n");
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

