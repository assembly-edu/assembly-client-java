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
import education.assembly.platform.spring.models.ErrorData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

/**
 * Rate limiting error object.
 */
@ApiModel(description = "Rate limiting error object.")

public class ErrorRateLimit implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("error")
  private String error = null;

  @JsonProperty("data")
  private ErrorData data = null;

  public ErrorRateLimit error(String error) {
    this.error = error;
    return this;
  }

   /**
   * Summary of error
   * @return error
  **/
  @ApiModelProperty(example = "too many requests", value = "Summary of error")
  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }

  public ErrorRateLimit data(ErrorData data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(value = "")
  public ErrorData getData() {
    return data;
  }

  public void setData(ErrorData data) {
    this.data = data;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorRateLimit errorRateLimit = (ErrorRateLimit) o;
    return Objects.equals(this.error, errorRateLimit.error) &&
        Objects.equals(this.data, errorRateLimit.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(error, data);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorRateLimit {\n");
    
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

