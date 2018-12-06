/*
 * assembly-client-java 1.1.0
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
 * SenNeed
 */

public class SenNeed implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("start_date")
  private String startDate = null;

  @JsonProperty("sen_need_code")
  private String senNeedCode = null;

  @JsonProperty("sen_need_name")
  private String senNeedName = null;

  @JsonProperty("sen_broad_need_type_code")
  private String senBroadNeedTypeCode = null;

  @JsonProperty("sen_broad_need_type_name")
  private String senBroadNeedTypeName = null;

  @JsonProperty("priority")
  private Integer priority = null;

  public SenNeed id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
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
   * Get startDate
   * @return startDate
  **/
  @ApiModelProperty(value = "")
  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  public SenNeed senNeedCode(String senNeedCode) {
    this.senNeedCode = senNeedCode;
    return this;
  }

   /**
   * Get senNeedCode
   * @return senNeedCode
  **/
  @ApiModelProperty(value = "")
  public String getSenNeedCode() {
    return senNeedCode;
  }

  public void setSenNeedCode(String senNeedCode) {
    this.senNeedCode = senNeedCode;
  }

  public SenNeed senNeedName(String senNeedName) {
    this.senNeedName = senNeedName;
    return this;
  }

   /**
   * Get senNeedName
   * @return senNeedName
  **/
  @ApiModelProperty(value = "")
  public String getSenNeedName() {
    return senNeedName;
  }

  public void setSenNeedName(String senNeedName) {
    this.senNeedName = senNeedName;
  }

  public SenNeed senBroadNeedTypeCode(String senBroadNeedTypeCode) {
    this.senBroadNeedTypeCode = senBroadNeedTypeCode;
    return this;
  }

   /**
   * Get senBroadNeedTypeCode
   * @return senBroadNeedTypeCode
  **/
  @ApiModelProperty(value = "")
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
   * Get senBroadNeedTypeName
   * @return senBroadNeedTypeName
  **/
  @ApiModelProperty(value = "")
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
   * Get priority
   * @return priority
  **/
  @ApiModelProperty(value = "")
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
    return Objects.equals(this.id, senNeed.id) &&
        Objects.equals(this.startDate, senNeed.startDate) &&
        Objects.equals(this.senNeedCode, senNeed.senNeedCode) &&
        Objects.equals(this.senNeedName, senNeed.senNeedName) &&
        Objects.equals(this.senBroadNeedTypeCode, senNeed.senBroadNeedTypeCode) &&
        Objects.equals(this.senBroadNeedTypeName, senNeed.senBroadNeedTypeName) &&
        Objects.equals(this.priority, senNeed.priority);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, startDate, senNeedCode, senNeedName, senBroadNeedTypeCode, senBroadNeedTypeName, priority);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SenNeed {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    senNeedCode: ").append(toIndentedString(senNeedCode)).append("\n");
    sb.append("    senNeedName: ").append(toIndentedString(senNeedName)).append("\n");
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

