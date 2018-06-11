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
import java.io.Serializable;

/**
 * Details the type of event - whether it is a regular calendar event, a staff meeting or inset day
 */
@ApiModel(description = "Details the type of event - whether it is a regular calendar event, a staff meeting or inset day")

public class CalendarEventMisType implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("object")
  private String object = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("description")
  private String description = null;

  public CalendarEventMisType object(String object) {
    this.object = object;
    return this;
  }

   /**
   * Object type
   * @return object
  **/
  @ApiModelProperty(example = "mis_type", value = "Object type")
  public String getObject() {
    return object;
  }

  public void setObject(String object) {
    this.object = object;
  }

  public CalendarEventMisType name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the event type in the MIS
   * @return name
  **/
  @ApiModelProperty(example = "student_contact", value = "Name of the event type in the MIS")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CalendarEventMisType description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description of the event type in the MIS
   * @return description
  **/
  @ApiModelProperty(example = "School Event", value = "Description of the event type in the MIS")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CalendarEventMisType calendarEventMisType = (CalendarEventMisType) o;
    return Objects.equals(this.object, calendarEventMisType.object) &&
        Objects.equals(this.name, calendarEventMisType.name) &&
        Objects.equals(this.description, calendarEventMisType.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(object, name, description);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CalendarEventMisType {\n");
    
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

