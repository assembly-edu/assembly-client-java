/*
 * assembly-client-java 1.2.436
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
 * Detail of a school event.
 */
@ApiModel(description = "Detail of a school event.")

public class CalendarEvent implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("object")
  private String object = "calendar_event";

  @JsonProperty("id")
  private Integer id = ;

  /**
   * The type of the event
   */
  public enum TypeEnum {
    EVENT("Event"),
    
    MEETING("Meeting"),
    
    INSET("Inset"),
    
    HOLIDAY("Holiday");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("type")
  private TypeEnum type = ;

  @JsonProperty("name")
  private String name = ;

  @JsonProperty("description")
  private String description = ;

  @JsonProperty("start_date")
  private OffsetDateTime startDate = ;

  @JsonProperty("end_date")
  private OffsetDateTime endDate = ;

  public CalendarEvent object(String object) {
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

  public CalendarEvent id(Integer id) {
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

  public CalendarEvent type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * The type of the event
   * @return type
  **/
  @ApiModelProperty(value = "The type of the event")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public CalendarEvent name(String name) {
    this.name = name;
    return this;
  }

   /**
   * This details the user-defined \&quot;category\&quot; that the event is assigned to on SIMS.
   * @return name
  **/
  @ApiModelProperty(value = "This details the user-defined \"category\" that the event is assigned to on SIMS.")
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
   * The name of the instance of the event, usually more detailed and specific than the \&quot;name\&quot;
   * @return description
  **/
  @ApiModelProperty(value = "The name of the instance of the event, usually more detailed and specific than the \"name\"")
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
  @ApiModelProperty(value = "Date and time of when the event starts")
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
  @ApiModelProperty(value = "Date and time of when the event ends")
  public OffsetDateTime getEndDate() {
    return endDate;
  }

  public void setEndDate(OffsetDateTime endDate) {
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
    CalendarEvent calendarEvent = (CalendarEvent) o;
    return Objects.equals(this.object, calendarEvent.object) &&
        Objects.equals(this.id, calendarEvent.id) &&
        Objects.equals(this.type, calendarEvent.type) &&
        Objects.equals(this.name, calendarEvent.name) &&
        Objects.equals(this.description, calendarEvent.description) &&
        Objects.equals(this.startDate, calendarEvent.startDate) &&
        Objects.equals(this.endDate, calendarEvent.endDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(object, id, type, name, description, startDate, endDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CalendarEvent {\n");
    
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

