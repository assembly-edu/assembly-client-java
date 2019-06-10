/*
 * assembly-client-java 1.2.368
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

  @JsonProperty("name")
  private String name = ;

  @JsonProperty("description")
  private String description = ;

  public CalendarEventMisType name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The type of the event
   * @return name
  **/
  @ApiModelProperty(value = "The type of the event")
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
   * Any additional description of this event type
   * @return description
  **/
  @ApiModelProperty(value = "Any additional description of this event type")
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
    return Objects.equals(this.name, calendarEventMisType.name) &&
        Objects.equals(this.description, calendarEventMisType.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CalendarEventMisType {\n");
    
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

