/*
 * assembly-client-java 1.2.475
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
 * A student&#39;s SEN Need information.
 */
@ApiModel(description = "A student's SEN Need information.")

public class SenNeed implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("object")
  private String object = "sen_need";

  @JsonProperty("id")
  private Integer id = ;

  @JsonProperty("start_date")
  private String startDate = ;

  @JsonProperty("sen_need_type_code")
  private String senNeedTypeCode = ;

  @JsonProperty("sen_need_type_name")
  private String senNeedTypeName = ;

  @JsonProperty("sen_broad_need_type_code")
  private String senBroadNeedTypeCode = ;

  @JsonProperty("sen_broad_need_type_name")
  private String senBroadNeedTypeName = ;

  @JsonProperty("priority")
  private Integer priority = ;

  public SenNeed object(String object) {
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

  public SenNeed id(Integer id) {
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

  public SenNeed startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * The start date for the need
   * @return startDate
  **/
  @ApiModelProperty(value = "The start date for the need")
  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  public SenNeed senNeedTypeCode(String senNeedTypeCode) {
    this.senNeedTypeCode = senNeedTypeCode;
    return this;
  }

   /**
   * The code of the sen need
   * @return senNeedTypeCode
  **/
  @ApiModelProperty(value = "The code of the sen need")
  public String getSenNeedTypeCode() {
    return senNeedTypeCode;
  }

  public void setSenNeedTypeCode(String senNeedTypeCode) {
    this.senNeedTypeCode = senNeedTypeCode;
  }

  public SenNeed senNeedTypeName(String senNeedTypeName) {
    this.senNeedTypeName = senNeedTypeName;
    return this;
  }

   /**
   * The name of the sen need
   * @return senNeedTypeName
  **/
  @ApiModelProperty(value = "The name of the sen need")
  public String getSenNeedTypeName() {
    return senNeedTypeName;
  }

  public void setSenNeedTypeName(String senNeedTypeName) {
    this.senNeedTypeName = senNeedTypeName;
  }

  public SenNeed senBroadNeedTypeCode(String senBroadNeedTypeCode) {
    this.senBroadNeedTypeCode = senBroadNeedTypeCode;
    return this;
  }

   /**
   * The code for the broad need
   * @return senBroadNeedTypeCode
  **/
  @ApiModelProperty(value = "The code for the broad need")
  public String getSenBroadNeedTypeCode() {
    return senBroadNeedTypeCode;
  }

  public void setSenBroadNeedTypeCode(String senBroadNeedTypeCode) {
    this.senBroadNeedTypeCode = senBroadNeedTypeCode;
  }

  public SenNeed senBroadNeedTypeName(String senBroadNeedTypeName) {
    this.senBroadNeedTypeName = senBroadNeedTypeName;
    return this;
  }

   /**
   * The name of the broad need
   * @return senBroadNeedTypeName
  **/
  @ApiModelProperty(value = "The name of the broad need")
  public String getSenBroadNeedTypeName() {
    return senBroadNeedTypeName;
  }

  public void setSenBroadNeedTypeName(String senBroadNeedTypeName) {
    this.senBroadNeedTypeName = senBroadNeedTypeName;
  }

  public SenNeed priority(Integer priority) {
    this.priority = priority;
    return this;
  }

   /**
   * The priority of the sen need
   * @return priority
  **/
  @ApiModelProperty(value = "The priority of the sen need")
  public Integer getPriority() {
    return priority;
  }

  public void setPriority(Integer priority) {
    this.priority = priority;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SenNeed senNeed = (SenNeed) o;
    return Objects.equals(this.object, senNeed.object) &&
        Objects.equals(this.id, senNeed.id) &&
        Objects.equals(this.startDate, senNeed.startDate) &&
        Objects.equals(this.senNeedTypeCode, senNeed.senNeedTypeCode) &&
        Objects.equals(this.senNeedTypeName, senNeed.senNeedTypeName) &&
        Objects.equals(this.senBroadNeedTypeCode, senNeed.senBroadNeedTypeCode) &&
        Objects.equals(this.senBroadNeedTypeName, senNeed.senBroadNeedTypeName) &&
        Objects.equals(this.priority, senNeed.priority);
  }

  @Override
  public int hashCode() {
    return Objects.hash(object, id, startDate, senNeedTypeCode, senNeedTypeName, senBroadNeedTypeCode, senBroadNeedTypeName, priority);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SenNeed {\n");
    
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    senNeedTypeCode: ").append(toIndentedString(senNeedTypeCode)).append("\n");
    sb.append("    senNeedTypeName: ").append(toIndentedString(senNeedTypeName)).append("\n");
    sb.append("    senBroadNeedTypeCode: ").append(toIndentedString(senBroadNeedTypeCode)).append("\n");
    sb.append("    senBroadNeedTypeName: ").append(toIndentedString(senBroadNeedTypeName)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
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

