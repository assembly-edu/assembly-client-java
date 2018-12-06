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
import education.assembly.platform.spring.models.CalendarEventMisType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.threeten.bp.OffsetDateTime;
import java.io.Serializable;

/**
 * CalendarEvent
 */

public class CalendarEvent implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("start_date")
  private OffsetDateTime startDate = null;

  @JsonProperty("end_date")
  private OffsetDateTime endDate = null;

  @JsonProperty("is_active")
  private Boolean isActive = null;

  @JsonProperty("is_recurrent")
  private Boolean isRecurrent = null;

  @JsonProperty("mis_type")
  private CalendarEventMisType misType = null;

  public CalendarEvent id(Integer id) {
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

  public CalendarEvent name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CalendarEvent description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CalendarEvent startDate(OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Get startDate
   * @return startDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }

  public CalendarEvent endDate(OffsetDateTime endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * Get endDate
   * @return endDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getEndDate() {
    return endDate;
  }

  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }

  public CalendarEvent isActive(Boolean isActive) {
    this.isActive = isActive;
    return this;
  }

   /**
   * Get isActive
   * @return isActive
  **/
  @ApiModelProperty(value = "")
  public Boolean isgetIsActive() {
    return isActive;
  }

  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }

  public CalendarEvent isRecurrent(Boolean isRecurrent) {
    this.isRecurrent = isRecurrent;
    return this;
  }

   /**
   * Get isRecurrent
   * @return isRecurrent
  **/
  @ApiModelProperty(value = "")
  public Boolean isgetIsRecurrent() {
    return isRecurrent;
  }

  public void setIsRecurrent(Boolean isRecurrent) {
    this.isRecurrent = isRecurrent;
  }

  public CalendarEvent misType(CalendarEventMisType misType) {
    this.misType = misType;
    return this;
  }

   /**
   * Get misType
   * @return misType
  **/
  @ApiModelProperty(value = "")
  public CalendarEventMisType getMisType() {
    return misType;
  }

  public void setMisType(CalendarEventMisType misType) {
    this.misType = misType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CalendarEvent calendarEvent = (CalendarEvent) o;
    return Objects.equals(this.id, calendarEvent.id) &&
        Objects.equals(this.name, calendarEvent.name) &&
        Objects.equals(this.description, calendarEvent.description) &&
        Objects.equals(this.startDate, calendarEvent.startDate) &&
        Objects.equals(this.endDate, calendarEvent.endDate) &&
        Objects.equals(this.isActive, calendarEvent.isActive) &&
        Objects.equals(this.isRecurrent, calendarEvent.isRecurrent) &&
        Objects.equals(this.misType, calendarEvent.misType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, startDate, endDate, isActive, isRecurrent, misType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CalendarEvent {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    isRecurrent: ").append(toIndentedString(isRecurrent)).append("\n");
    sb.append("    misType: ").append(toIndentedString(misType)).append("\n");
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

