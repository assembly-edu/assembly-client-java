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
 * Error object.
 */
@ApiModel(description = "Error object.")

public class Error implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("error")
  private String error = null;

  @JsonProperty("message")
  private String message = null;

  @JsonProperty("data")
  private ErrorData data = null;

  public Error error(String error) {
    this.error = error;
    return this;
  }

   /**
   * Summary of error
   * @return error
  **/
  @ApiModelProperty(example = "invalid_request", value = "Summary of error")
  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }

  public Error message(String message) {
    this.message = message;
    return this;
  }

   /**
   * A longer description of the error that occured, depending on the error.
   * @return message
  **/
  @ApiModelProperty(example = "An access_token is required.", value = "A longer description of the error that occured, depending on the error.")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public Error data(ErrorData data) {
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
    Error error = (Error) o;
    return Objects.equals(this.error, error.error) &&
        Objects.equals(this.message, error.message) &&
        Objects.equals(this.data, error.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(error, message, data);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Error {\n");
    
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

