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
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

/**
 * Response object for update Result request
 */
@ApiModel(description = "Response object for update Result request")

public class UpdateResultResponseListData implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("message")
  private String message = null;

  @JsonProperty("updated_fields")
  private List<String> updatedFields = null;

  public UpdateResultResponseListData message(String message) {
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

  public UpdateResultResponseListData updatedFields(List<String> updatedFields) {
    this.updatedFields = updatedFields;
    return this;
  }

  public UpdateResultResponseListData addUpdatedFieldsItem(String updatedFieldsItem) {
    if (this.updatedFields == null) {
      this.updatedFields = new ArrayList<String>();
    }
    this.updatedFields.add(updatedFieldsItem);
    return this;
  }

   /**
   * No description
   * @return updatedFields
  **/
  @ApiModelProperty(value = "No description")
  public List<String> getUpdatedFields() {
    return updatedFields;
  }

  public void setUpdatedFields(List<String> updatedFields) {
    this.updatedFields = updatedFields;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateResultResponseListData updateResultResponseListData = (UpdateResultResponseListData) o;
    return Objects.equals(this.message, updateResultResponseListData.message) &&
        Objects.equals(this.updatedFields, updateResultResponseListData.updatedFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, updatedFields);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateResultResponseListData {\n");
    
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    updatedFields: ").append(toIndentedString(updatedFields)).append("\n");
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

