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
 * Rate limiting information
 */
@ApiModel(description = "Rate limiting information")

public class ErrorData implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("count")
  private Integer count = null;

  @JsonProperty("period")
  private Integer period = null;

  @JsonProperty("limit")
  private Integer limit = null;

  public ErrorData count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * The number of requests you have made with the current token.
   * @return count
  **/
  @ApiModelProperty(example = "601", value = "The number of requests you have made with the current token.")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public ErrorData period(Integer period) {
    this.period = period;
    return this;
  }

   /**
   * The number of seconds until the current token may make another request.
   * @return period
  **/
  @ApiModelProperty(example = "300", value = "The number of seconds until the current token may make another request.")
  public Integer getPeriod() {
    return period;
  }

  public void setPeriod(Integer period) {
    this.period = period;
  }

  public ErrorData limit(Integer limit) {
    this.limit = limit;
    return this;
  }

   /**
   * The total number of requests the current token may make within a 5 minute window.
   * @return limit
  **/
  @ApiModelProperty(example = "600", value = "The total number of requests the current token may make within a 5 minute window.")
  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorData errorData = (ErrorData) o;
    return Objects.equals(this.count, errorData.count) &&
        Objects.equals(this.period, errorData.period) &&
        Objects.equals(this.limit, errorData.limit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, period, limit);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorData {\n");
    
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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

