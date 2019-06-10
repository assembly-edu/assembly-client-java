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
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

/**
 * Knits together a range of assessment concepts. The name of the assessment also refers to the source of the result (for example, a Key Stage national assessment, or a standardised assessment provider).
 */
@ApiModel(description = "Knits together a range of assessment concepts. The name of the assessment also refers to the source of the result (for example, a Key Stage national assessment, or a standardised assessment provider).")

public class Assessment implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("object")
  private String object = "assessment";

  @JsonProperty("id")
  private Integer id = ;

  @JsonProperty("name")
  private String name = ;

  @JsonProperty("family_id")
  private Integer familyId = ;

  @JsonProperty("family_name")
  private String familyName = ;

  @JsonProperty("mis_assessments")
  private List<String> misAssessments = null;

  public Assessment object(String object) {
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

  public Assessment id(Integer id) {
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

  public Assessment name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the assessment as standardised int he Assembly Platform
   * @return name
  **/
  @ApiModelProperty(value = "The name of the assessment as standardised int he Assembly Platform")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Assessment familyId(Integer familyId) {
    this.familyId = familyId;
    return this;
  }

   /**
   * Internal stable ID
   * @return familyId
  **/
  @ApiModelProperty(value = "Internal stable ID")
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
   * The name of the assessment family
   * @return familyName
  **/
  @ApiModelProperty(value = "The name of the assessment family")
  public String getFamilyName() {
    return familyName;
  }

  public void setFamilyName(String familyName) {
    this.familyName = familyName;
  }

  public Assessment misAssessments(List<String> misAssessments) {
    this.misAssessments = misAssessments;
    return this;
  }

  public Assessment addMisAssessmentsItem(String misAssessmentsItem) {
    if (this.misAssessments == null) {
      this.misAssessments = new ArrayList<String>();
    }
    this.misAssessments.add(misAssessmentsItem);
    return this;
  }

   /**
   * The assessments as defined in the origin MIS
   * @return misAssessments
  **/
  @ApiModelProperty(value = "The assessments as defined in the origin MIS")
  public List<String> getMisAssessments() {
    return misAssessments;
  }

  public void setMisAssessments(List<String> misAssessments) {
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
    return Objects.equals(this.object, assessment.object) &&
        Objects.equals(this.id, assessment.id) &&
        Objects.equals(this.name, assessment.name) &&
        Objects.equals(this.familyId, assessment.familyId) &&
        Objects.equals(this.familyName, assessment.familyName) &&
        Objects.equals(this.misAssessments, assessment.misAssessments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(object, id, name, familyId, familyName, misAssessments);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Assessment {\n");
    
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    familyId: ").append(toIndentedString(familyId)).append("\n");
    sb.append("    familyName: ").append(toIndentedString(familyName)).append("\n");
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

