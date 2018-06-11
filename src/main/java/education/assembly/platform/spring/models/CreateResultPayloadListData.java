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
import education.assembly.platform.spring.models.CreateResultPayloadResults;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

/**
 * Payload for create Result request
 */
@ApiModel(description = "Payload for create Result request")

public class CreateResultPayloadListData implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("subject_id")
  private Integer subjectId = null;

  @JsonProperty("facet_id")
  private Integer facetId = null;

  @JsonProperty("assessment_point_rank")
  private Integer assessmentPointRank = null;

  @JsonProperty("assessment_id")
  private Integer assessmentId = null;

  @JsonProperty("results")
  private List<CreateResultPayloadResults> results = null;

  public CreateResultPayloadListData subjectId(Integer subjectId) {
    this.subjectId = subjectId;
    return this;
  }

   /**
   * No description
   * @return subjectId
  **/
  @ApiModelProperty(example = "2", value = "No description")
  public Integer getSubjectId() {
    return subjectId;
  }

  public void setSubjectId(Integer subjectId) {
    this.subjectId = subjectId;
  }

  public CreateResultPayloadListData facetId(Integer facetId) {
    this.facetId = facetId;
    return this;
  }

   /**
   * No description
   * @return facetId
  **/
  @ApiModelProperty(example = "1", value = "No description")
  public Integer getFacetId() {
    return facetId;
  }

  public void setFacetId(Integer facetId) {
    this.facetId = facetId;
  }

  public CreateResultPayloadListData assessmentPointRank(Integer assessmentPointRank) {
    this.assessmentPointRank = assessmentPointRank;
    return this;
  }

   /**
   * No description
   * @return assessmentPointRank
  **/
  @ApiModelProperty(example = "122", value = "No description")
  public Integer getAssessmentPointRank() {
    return assessmentPointRank;
  }

  public void setAssessmentPointRank(Integer assessmentPointRank) {
    this.assessmentPointRank = assessmentPointRank;
  }

  public CreateResultPayloadListData assessmentId(Integer assessmentId) {
    this.assessmentId = assessmentId;
    return this;
  }

   /**
   * No description
   * @return assessmentId
  **/
  @ApiModelProperty(example = "1", value = "No description")
  public Integer getAssessmentId() {
    return assessmentId;
  }

  public void setAssessmentId(Integer assessmentId) {
    this.assessmentId = assessmentId;
  }

  public CreateResultPayloadListData results(List<CreateResultPayloadResults> results) {
    this.results = results;
    return this;
  }

  public CreateResultPayloadListData addResultsItem(CreateResultPayloadResults resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<CreateResultPayloadResults>();
    }
    this.results.add(resultsItem);
    return this;
  }

   /**
   * No description
   * @return results
  **/
  @ApiModelProperty(value = "No description")
  public List<CreateResultPayloadResults> getResults() {
    return results;
  }

  public void setResults(List<CreateResultPayloadResults> results) {
    this.results = results;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateResultPayloadListData createResultPayloadListData = (CreateResultPayloadListData) o;
    return Objects.equals(this.subjectId, createResultPayloadListData.subjectId) &&
        Objects.equals(this.facetId, createResultPayloadListData.facetId) &&
        Objects.equals(this.assessmentPointRank, createResultPayloadListData.assessmentPointRank) &&
        Objects.equals(this.assessmentId, createResultPayloadListData.assessmentId) &&
        Objects.equals(this.results, createResultPayloadListData.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subjectId, facetId, assessmentPointRank, assessmentId, results);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateResultPayloadListData {\n");
    
    sb.append("    subjectId: ").append(toIndentedString(subjectId)).append("\n");
    sb.append("    facetId: ").append(toIndentedString(facetId)).append("\n");
    sb.append("    assessmentPointRank: ").append(toIndentedString(assessmentPointRank)).append("\n");
    sb.append("    assessmentId: ").append(toIndentedString(assessmentId)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
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

