/*
 * assembly-client-java 1.2.471
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
import education.assembly.platform.spring.models.ResultEntry;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

/**
 * A result to updated on the Platform
 */
@ApiModel(description = "A result to updated on the Platform")

public class ResultBody implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("subject_id")
  private Integer subjectId = ;

  @JsonProperty("facet_id")
  private Integer facetId = ;

  @JsonProperty("assessment_point_rank")
  private Integer assessmentPointRank = ;

  @JsonProperty("assessment_id")
  private Integer assessmentId = ;

  @JsonProperty("results")
  private List<ResultEntry> results = null;

  public ResultBody subjectId(Integer subjectId) {
    this.subjectId = subjectId;
    return this;
  }

   /**
   * The ID of the associated subject
   * @return subjectId
  **/
  @ApiModelProperty(value = "The ID of the associated subject")
  public Integer getSubjectId() {
    return subjectId;
  }

  public void setSubjectId(Integer subjectId) {
    this.subjectId = subjectId;
  }

  public ResultBody facetId(Integer facetId) {
    this.facetId = facetId;
    return this;
  }

   /**
   * The ID of the associated facet
   * @return facetId
  **/
  @ApiModelProperty(value = "The ID of the associated facet")
  public Integer getFacetId() {
    return facetId;
  }

  public void setFacetId(Integer facetId) {
    this.facetId = facetId;
  }

  public ResultBody assessmentPointRank(Integer assessmentPointRank) {
    this.assessmentPointRank = assessmentPointRank;
    return this;
  }

   /**
   * The rank of the associated assessment point
   * @return assessmentPointRank
  **/
  @ApiModelProperty(value = "The rank of the associated assessment point")
  public Integer getAssessmentPointRank() {
    return assessmentPointRank;
  }

  public void setAssessmentPointRank(Integer assessmentPointRank) {
    this.assessmentPointRank = assessmentPointRank;
  }

  public ResultBody assessmentId(Integer assessmentId) {
    this.assessmentId = assessmentId;
    return this;
  }

   /**
   * The ID of the associated assessment
   * @return assessmentId
  **/
  @ApiModelProperty(value = "The ID of the associated assessment")
  public Integer getAssessmentId() {
    return assessmentId;
  }

  public void setAssessmentId(Integer assessmentId) {
    this.assessmentId = assessmentId;
  }

  public ResultBody results(List<ResultEntry> results) {
    this.results = results;
    return this;
  }

  public ResultBody addResultsItem(ResultEntry resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<ResultEntry>();
    }
    this.results.add(resultsItem);
    return this;
  }

   /**
   * The results to record
   * @return results
  **/
  @ApiModelProperty(value = "The results to record")
  public List<ResultEntry> getResults() {
    return results;
  }

  public void setResults(List<ResultEntry> results) {
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
    ResultBody resultBody = (ResultBody) o;
    return Objects.equals(this.subjectId, resultBody.subjectId) &&
        Objects.equals(this.facetId, resultBody.facetId) &&
        Objects.equals(this.assessmentPointRank, resultBody.assessmentPointRank) &&
        Objects.equals(this.assessmentId, resultBody.assessmentId) &&
        Objects.equals(this.results, resultBody.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subjectId, facetId, assessmentPointRank, assessmentId, results);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResultBody {\n");
    
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

