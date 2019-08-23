/*
 * assembly-client-java 1.2.407
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
import education.assembly.platform.spring.models.LessonGroup;
import education.assembly.platform.spring.models.LessonRooms;
import education.assembly.platform.spring.models.TimetableSupervisors;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
import java.io.Serializable;

/**
 * TimetableLessons
 */

public class TimetableLessons implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("object")
  private String object = "lesson";

  @JsonProperty("id")
  private Integer id = ;

  /**
   * The start date of the lesson
   */
  public enum TypeEnum {
    SCHEDULED("Scheduled"),
    
    ROOMCOVER("RoomCover"),
    
    STAFFCOVER("StaffCover"),
    
    INVIGILATIONCOVER("InvigilationCover");

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

  @JsonProperty("group")
  private LessonGroup group = null;

  @JsonProperty("start_date")
  private OffsetDateTime startDate = ;

  @JsonProperty("end_date")
  private OffsetDateTime endDate = ;

  @JsonProperty("supervisors")
  private List<TimetableSupervisors> supervisors = null;

  @JsonProperty("rooms")
  private List<LessonRooms> rooms = null;

  public TimetableLessons object(String object) {
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

  public TimetableLessons id(Integer id) {
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

  public TimetableLessons type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * The start date of the lesson
   * @return type
  **/
  @ApiModelProperty(value = "The start date of the lesson")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public TimetableLessons group(LessonGroup group) {
    this.group = group;
    return this;
  }

   /**
   * Get group
   * @return group
  **/
  @ApiModelProperty(value = "")
  public LessonGroup getGroup() {
    return group;
  }

  public void setGroup(LessonGroup group) {
    this.group = group;
  }

  public TimetableLessons startDate(OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * The start date of the lesson
   * @return startDate
  **/
  @ApiModelProperty(value = "The start date of the lesson")
  public OffsetDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }

  public TimetableLessons endDate(OffsetDateTime endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * The end date of the lesson
   * @return endDate
  **/
  @ApiModelProperty(value = "The end date of the lesson")
  public OffsetDateTime getEndDate() {
    return endDate;
  }

  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }

  public TimetableLessons supervisors(List<TimetableSupervisors> supervisors) {
    this.supervisors = supervisors;
    return this;
  }

  public TimetableLessons addSupervisorsItem(TimetableSupervisors supervisorsItem) {
    if (this.supervisors == null) {
      this.supervisors = new ArrayList<TimetableSupervisors>();
    }
    this.supervisors.add(supervisorsItem);
    return this;
  }

   /**
   * The ID of a staff member who supervises a group and their role.
   * @return supervisors
  **/
  @ApiModelProperty(value = "The ID of a staff member who supervises a group and their role.")
  public List<TimetableSupervisors> getSupervisors() {
    return supervisors;
  }

  public void setSupervisors(List<TimetableSupervisors> supervisors) {
    this.supervisors = supervisors;
  }

  public TimetableLessons rooms(List<LessonRooms> rooms) {
    this.rooms = rooms;
    return this;
  }

  public TimetableLessons addRoomsItem(LessonRooms roomsItem) {
    if (this.rooms == null) {
      this.rooms = new ArrayList<LessonRooms>();
    }
    this.rooms.add(roomsItem);
    return this;
  }

   /**
   * Provides details of the rooms that a lessons is assigned to
   * @return rooms
  **/
  @ApiModelProperty(value = "Provides details of the rooms that a lessons is assigned to")
  public List<LessonRooms> getRooms() {
    return rooms;
  }

  public void setRooms(List<LessonRooms> rooms) {
    this.rooms = rooms;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimetableLessons timetableLessons = (TimetableLessons) o;
    return Objects.equals(this.object, timetableLessons.object) &&
        Objects.equals(this.id, timetableLessons.id) &&
        Objects.equals(this.type, timetableLessons.type) &&
        Objects.equals(this.group, timetableLessons.group) &&
        Objects.equals(this.startDate, timetableLessons.startDate) &&
        Objects.equals(this.endDate, timetableLessons.endDate) &&
        Objects.equals(this.supervisors, timetableLessons.supervisors) &&
        Objects.equals(this.rooms, timetableLessons.rooms);
  }

  @Override
  public int hashCode() {
    return Objects.hash(object, id, type, group, startDate, endDate, supervisors, rooms);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimetableLessons {\n");
    
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    supervisors: ").append(toIndentedString(supervisors)).append("\n");
    sb.append("    rooms: ").append(toIndentedString(rooms)).append("\n");
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

