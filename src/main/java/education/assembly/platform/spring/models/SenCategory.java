/*
 * assembly-client-java 1.2.463
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
 * A student&#39;s SEN Provision information
 */
@ApiModel(description = "A student's SEN Provision information")

public class SenCategory implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("object")
  private String object = "sen_category";

  @JsonProperty("id")
  private Integer id = ;

  @JsonProperty("code")
  private String code = ;

  @JsonProperty("description")
  private String description = ;

  @JsonProperty("start_date")
  private String startDate = ;

  @JsonProperty("end_date")
  private String endDate = ;

  public SenCategory object(String object) {
    this.object = object;
    return this;
  }

   /**
   * Descriminator
   * @return object
  **/
  @ApiModelProperty(value = "Descriminator")
  public String getObject() {
    return object;
  }

  public void setObject(String object) {
    this.object = object;
  }

  public SenCategory id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Internal stable ID
   * @return id
  **/
  @ApiModelProperty(value = "Internal stable ID")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public SenCategory code(String code) {
    this.code = code;
    return this;
  }

   /**
   * The code of the sen category
   * @return code
  **/
  @ApiModelProperty(value = "The code of the sen category")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public SenCategory description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description of the sen category
   * @return description
  **/
  @ApiModelProperty(value = "The description of the sen category")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public SenCategory startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * The start date
   * @return startDate
  **/
  @ApiModelProperty(value = "The start date")
  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  public SenCategory endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * The end date
   * @return endDate
  **/
  @ApiModelProperty(value = "The end date")
  public String getEndDate() {
    return endDate;
  }

  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SenCategory senCategory = (SenCategory) o;
    return Objects.equals(this.object, senCategory.object) &&
        Objects.equals(this.id, senCategory.id) &&
        Objects.equals(this.code, senCategory.code) &&
        Objects.equals(this.description, senCategory.description) &&
        Objects.equals(this.startDate, senCategory.startDate) &&
        Objects.equals(this.endDate, senCategory.endDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(object, id, code, description, startDate, endDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SenCategory {\n");
    
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
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

