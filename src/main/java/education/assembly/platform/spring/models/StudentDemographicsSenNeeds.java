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
import org.threeten.bp.OffsetDateTime;
import java.io.Serializable;

/**
 * A student&#39;s SEN Need information.
 */
@ApiModel(description = "A student's SEN Need information.")

public class StudentDemographicsSenNeeds implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("object")
  private String object = null;

  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("start_date")
  private OffsetDateTime startDate = null;

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

  public StudentDemographicsSenNeeds object(String object) {
    this.object = object;
    return this;
  }

   /**
   * Object type
   * @return object
  **/
  @ApiModelProperty(example = "sen_needs", value = "Object type")
  public String getObject() {
    return object;
  }

  public void setObject(String object) {
    this.object = object;
  }

  public StudentDemographicsSenNeeds id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * The id of the sen need
   * @return id
  **/
  @ApiModelProperty(example = "12", value = "The id of the sen need")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public StudentDemographicsSenNeeds startDate(OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * The start date for the need
   * @return startDate
  **/
  @ApiModelProperty(example = "2014-09-01T00:00:00.000Z", value = "The start date for the need")
  public OffsetDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }

  public StudentDemographicsSenNeeds senNeedCode(String senNeedCode) {
    this.senNeedCode = senNeedCode;
    return this;
  }

   /**
   * The code of the sen need
   * @return senNeedCode
  **/
  @ApiModelProperty(example = "VI", value = "The code of the sen need")
  public String getSenNeedCode() {
    return senNeedCode;
  }

  public void setSenNeedCode(String senNeedCode) {
    this.senNeedCode = senNeedCode;
  }

  public StudentDemographicsSenNeeds senNeedName(String senNeedName) {
    this.senNeedName = senNeedName;
    return this;
  }

   /**
   * The name of the sen need
   * @return senNeedName
  **/
  @ApiModelProperty(example = "Visual Impairment", value = "The name of the sen need")
  public String getSenNeedName() {
    return senNeedName;
  }

  public void setSenNeedName(String senNeedName) {
    this.senNeedName = senNeedName;
  }

  public StudentDemographicsSenNeeds senBroadNeedTypeCode(String senBroadNeedTypeCode) {
    this.senBroadNeedTypeCode = senBroadNeedTypeCode;
    return this;
  }

   /**
   * The code for the broad need
   * @return senBroadNeedTypeCode
  **/
  @ApiModelProperty(example = "SENS", value = "The code for the broad need")
  public String getSenBroadNeedTypeCode() {
    return senBroadNeedTypeCode;
  }

  public void setSenBroadNeedTypeCode(String senBroadNeedTypeCode) {
    this.senBroadNeedTypeCode = senBroadNeedTypeCode;
  }

  public StudentDemographicsSenNeeds senBroadNeedTypeName(String senBroadNeedTypeName) {
    this.senBroadNeedTypeName = senBroadNeedTypeName;
    return this;
  }

   /**
   * The name of the broad need
   * @return senBroadNeedTypeName
  **/
  @ApiModelProperty(example = "Sensory and/or physical", value = "The name of the broad need")
  public String getSenBroadNeedTypeName() {
    return senBroadNeedTypeName;
  }

  public void setSenBroadNeedTypeName(String senBroadNeedTypeName) {
    this.senBroadNeedTypeName = senBroadNeedTypeName;
  }

  public StudentDemographicsSenNeeds priority(Integer priority) {
    this.priority = priority;
    return this;
  }

   /**
   * The priority of the sen need
   * @return priority
  **/
  @ApiModelProperty(example = "1", value = "The priority of the sen need")
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
    StudentDemographicsSenNeeds studentDemographicsSenNeeds = (StudentDemographicsSenNeeds) o;
    return Objects.equals(this.object, studentDemographicsSenNeeds.object) &&
        Objects.equals(this.id, studentDemographicsSenNeeds.id) &&
        Objects.equals(this.startDate, studentDemographicsSenNeeds.startDate) &&
        Objects.equals(this.senNeedCode, studentDemographicsSenNeeds.senNeedCode) &&
        Objects.equals(this.senNeedName, studentDemographicsSenNeeds.senNeedName) &&
        Objects.equals(this.senBroadNeedTypeCode, studentDemographicsSenNeeds.senBroadNeedTypeCode) &&
        Objects.equals(this.senBroadNeedTypeName, studentDemographicsSenNeeds.senBroadNeedTypeName) &&
        Objects.equals(this.priority, studentDemographicsSenNeeds.priority);
  }

  @Override
  public int hashCode() {
    return Objects.hash(object, id, startDate, senNeedCode, senNeedName, senBroadNeedTypeCode, senBroadNeedTypeName, priority);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StudentDemographicsSenNeeds {\n");
    
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
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

