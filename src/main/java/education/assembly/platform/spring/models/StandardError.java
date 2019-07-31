/*
 * assembly-client-java 1.2.379
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
import education.assembly.platform.spring.models.StandardErrorData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

/**
 * Error object. All properties are optional, though typically an instance of this will have a concise &#x60;error&#x60; message and a &#x60;message&#x60; string with more detail
 */
@ApiModel(description = "Error object. All properties are optional, though typically an instance of this will have a concise `error` message and a `message` string with more detail")

public class StandardError implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("error")
  private String error = ;

  @JsonProperty("message")
  private String message = ;

  @JsonProperty("data")
  private StandardErrorData data = null;

  public StandardError error(String error) {
    this.error = error;
    return this;
  }

   /**
   * An indication of error, such as:  - &#x60;invalid_request&#x60; (401, no API token presented in header) - &#x60;invalid_token&#x60; (401, bad token presented in header) - &#x60;insufficient_scope&#x60; (401, asked for more data than authorized) - &#x60;unsupported_version&#x60; (406, bad API version in accept header) 
   * @return error
  **/
  @ApiModelProperty(value = "An indication of error, such as:  - `invalid_request` (401, no API token presented in header) - `invalid_token` (401, bad token presented in header) - `insufficient_scope` (401, asked for more data than authorized) - `unsupported_version` (406, bad API version in accept header) ")
  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }

  public StandardError message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Explanation of the error, such as:  - &#x60;malformed date parameter: &#39;32-13-2019&#39;&#x60; (400) - &#x60;an access_token is required.&#x60; (401) - &#x60;not found&#x60; (404) 
   * @return message
  **/
  @ApiModelProperty(value = "Explanation of the error, such as:  - `malformed date parameter: '32-13-2019'` (400) - `an access_token is required.` (401) - `not found` (404) ")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public StandardError data(StandardErrorData data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(value = "")
  public StandardErrorData getData() {
    return data;
  }

  public void setData(StandardErrorData data) {
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
    StandardError standardError = (StandardError) o;
    return Objects.equals(this.error, standardError.error) &&
        Objects.equals(this.message, standardError.message) &&
        Objects.equals(this.data, standardError.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(error, message, data);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StandardError {\n");
    
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

