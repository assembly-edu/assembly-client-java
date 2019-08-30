/*
 * assembly-client-java 1.2.412
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
 * A room
 */
@ApiModel(description = "A room")

public class Room implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("object")
  private String object = "room";

  @JsonProperty("id")
  private Integer id = ;

  @JsonProperty("code")
  private String code = ;

  @JsonProperty("name")
  private String name = ;

  @JsonProperty("description")
  private String description = ;

  @JsonProperty("maximum_capacity")
  private Integer maximumCapacity = ;

  public Room object(String object) {
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

  public Room id(Integer id) {
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

  public Room code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Room code
   * @return code
  **/
  @ApiModelProperty(value = "Room code")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public Room name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Room name
   * @return name
  **/
  @ApiModelProperty(value = "Room name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Room description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Room description
   * @return description
  **/
  @ApiModelProperty(value = "Room description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Room maximumCapacity(Integer maximumCapacity) {
    this.maximumCapacity = maximumCapacity;
    return this;
  }

   /**
   * Maximum capacity of the room
   * @return maximumCapacity
  **/
  @ApiModelProperty(value = "Maximum capacity of the room")
  public Integer getMaximumCapacity() {
    return maximumCapacity;
  }

  public void setMaximumCapacity(Integer maximumCapacity) {
    this.maximumCapacity = maximumCapacity;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Room room = (Room) o;
    return Objects.equals(this.object, room.object) &&
        Objects.equals(this.id, room.id) &&
        Objects.equals(this.code, room.code) &&
        Objects.equals(this.name, room.name) &&
        Objects.equals(this.description, room.description) &&
        Objects.equals(this.maximumCapacity, room.maximumCapacity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(object, id, code, name, description, maximumCapacity);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Room {\n");
    
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    maximumCapacity: ").append(toIndentedString(maximumCapacity)).append("\n");
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

