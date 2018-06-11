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
 * Response object for create Result request
 */
@ApiModel(description = "Response object for create Result request")

public class CreateResultResponseListData implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("message")
  private String message = null;

  @JsonProperty("data")
  private List<CreateResultPayloadResults> data = null;

  public CreateResultResponseListData message(String message) {
    this.message = message;
    return this;
  }

   /**
   * No description
   * @return message
  **/
  @ApiModelProperty(example = "ok", value = "No description")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public CreateResultResponseListData data(List<CreateResultPayloadResults> data) {
    this.data = data;
    return this;
  }

  public CreateResultResponseListData addDataItem(CreateResultPayloadResults dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<CreateResultPayloadResults>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * No description
   * @return data
  **/
  @ApiModelProperty(value = "No description")
  public List<CreateResultPayloadResults> getData() {
    return data;
  }

  public void setData(List<CreateResultPayloadResults> data) {
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
    CreateResultResponseListData createResultResponseListData = (CreateResultResponseListData) o;
    return Objects.equals(this.message, createResultResponseListData.message) &&
        Objects.equals(this.data, createResultResponseListData.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, data);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateResultResponseListData {\n");
    
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

