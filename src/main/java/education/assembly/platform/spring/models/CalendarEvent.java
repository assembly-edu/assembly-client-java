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
 * The calendar events object provides details of school events. This resource is currently only available for SIMS.
 */
@ApiModel(description = "The calendar events object provides details of school events. This resource is currently only available for SIMS.")

public class CalendarEvent implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("object")
  private String object = null;

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

  public CalendarEvent object(String object) {
    this.object = object;
    return this;
  }

   /**
   * Object type
   * @return object
  **/
  @ApiModelProperty(example = "calendar_event", value = "Object type")
  public String getObject() {
    return object;
  }

  public void setObject(String object) {
    this.object = object;
  }

  public CalendarEvent id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Internal stable ID given to all calendar events on the Platform
   * @return id
  **/
  @ApiModelProperty(example = "1", value = "Internal stable ID given to all calendar events on the Platform")
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
   * This details the user-defined &#39;category&#39; that the event is assigned to on SIMS.
   * @return name
  **/
  @ApiModelProperty(example = "Meeting", value = "This details the user-defined 'category' that the event is assigned to on SIMS.")
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
   * The name of the instance of the event, usually more detailed and specific than the &#39;name&#39;
   * @return description
  **/
  @ApiModelProperty(example = "After School SLT Meeting", value = "The name of the instance of the event, usually more detailed and specific than the 'name'")
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
   * Date and time of when the event starts
   * @return startDate
  **/
  @ApiModelProperty(example = "2015-09-03T16:00:00.000Z", value = "Date and time of when the event starts")
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
   * Date and time of when the event ends
   * @return endDate
  **/
  @ApiModelProperty(example = "2015-09-03T17:30:00.000Z", value = "Date and time of when the event ends")
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
   * Whether the event is active or not
   * @return isActive
  **/
  @ApiModelProperty(example = "true", value = "Whether the event is active or not")
  public Boolean isIsActive() {
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
   * Whether the event recurs and (soon) details of recurrences
   * @return isRecurrent
  **/
  @ApiModelProperty(example = "true", value = "Whether the event recurs and (soon) details of recurrences")
  public Boolean isIsRecurrent() {
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
    return Objects.equals(this.object, calendarEvent.object) &&
        Objects.equals(this.id, calendarEvent.id) &&
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
    return Objects.hash(object, id, name, description, startDate, endDate, isActive, isRecurrent, misType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CalendarEvent {\n");
    
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
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

