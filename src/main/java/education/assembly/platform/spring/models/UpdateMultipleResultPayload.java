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
 * Payload for update multiple Result request
 */
@ApiModel(description = "Payload for update multiple Result request")

public class UpdateMultipleResultPayload implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("results")
  private List<CreateResultPayloadResults> results = null;

  public UpdateMultipleResultPayload results(List<CreateResultPayloadResults> results) {
    this.results = results;
    return this;
  }

  public UpdateMultipleResultPayload addResultsItem(CreateResultPayloadResults resultsItem) {
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
    UpdateMultipleResultPayload updateMultipleResultPayload = (UpdateMultipleResultPayload) o;
    return Objects.equals(this.results, updateMultipleResultPayload.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(results);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateMultipleResultPayload {\n");
    
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

