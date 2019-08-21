/*
 * assembly-client-java 1.2.384
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
 * Present in the case of a 429 error, giving detail of how much the rate limit has been exceeded by and how long the client should wait before retrying
 */
@ApiModel(description = "Present in the case of a 429 error, giving detail of how much the rate limit has been exceeded by and how long the client should wait before retrying")

public class StandardErrorData implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("count")
  private Integer count = ;

  @JsonProperty("period")
  private Integer period = ;

  @JsonProperty("limit")
  private Integer limit = ;

  public StandardErrorData count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * The number of requests you have made with the current token
   * @return count
  **/
  @ApiModelProperty(value = "The number of requests you have made with the current token")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public StandardErrorData period(Integer period) {
    this.period = period;
    return this;
  }

   /**
   * The number of seconds until the current token may make another request
   * @return period
  **/
  @ApiModelProperty(value = "The number of seconds until the current token may make another request")
  public Integer getPeriod() {
    return period;
  }

  public void setPeriod(Integer period) {
    this.period = period;
  }

  public StandardErrorData limit(Integer limit) {
    this.limit = limit;
    return this;
  }

   /**
   * The total number of requests the current token may make within a 5 minute window
   * @return limit
  **/
  @ApiModelProperty(value = "The total number of requests the current token may make within a 5 minute window")
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
    StandardErrorData standardErrorData = (StandardErrorData) o;
    return Objects.equals(this.count, standardErrorData.count) &&
        Objects.equals(this.period, standardErrorData.period) &&
        Objects.equals(this.limit, standardErrorData.limit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, period, limit);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StandardErrorData {\n");
    
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

