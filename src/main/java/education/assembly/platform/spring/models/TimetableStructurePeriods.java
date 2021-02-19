/*
 * assembly-client-java 1.2.473
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
 * TimetableStructurePeriods
 */

public class TimetableStructurePeriods implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("object")
  private String object = "period";

  @JsonProperty("id")
  private Integer id = ;

  @JsonProperty("short_name")
  private String shortName = ;

  @JsonProperty("long_name")
  private String longName = ;

  @JsonProperty("start_time")
  private String startTime = ;

  @JsonProperty("end_time")
  private String endTime = ;

  @JsonProperty("display_order")
  private Integer displayOrder = ;

  public TimetableStructurePeriods object(String object) {
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

  public TimetableStructurePeriods id(Integer id) {
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

  public TimetableStructurePeriods shortName(String shortName) {
    this.shortName = shortName;
    return this;
  }

   /**
   * The period short name
   * @return shortName
  **/
  @ApiModelProperty(value = "The period short name")
  public String getShortName() {
    return shortName;
  }

  public void setShortName(String shortName) {
    this.shortName = shortName;
  }

  public TimetableStructurePeriods longName(String longName) {
    this.longName = longName;
    return this;
  }

   /**
   * The period long name
   * @return longName
  **/
  @ApiModelProperty(value = "The period long name")
  public String getLongName() {
    return longName;
  }

  public void setLongName(String longName) {
    this.longName = longName;
  }

  public TimetableStructurePeriods startTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * The start time of the period
   * @return startTime
  **/
  @ApiModelProperty(value = "The start time of the period")
  public String getStartTime() {
    return startTime;
  }

  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }

  public TimetableStructurePeriods endTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

   /**
   * The end time of the period
   * @return endTime
  **/
  @ApiModelProperty(value = "The end time of the period")
  public String getEndTime() {
    return endTime;
  }

  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }

  public TimetableStructurePeriods displayOrder(Integer displayOrder) {
    this.displayOrder = displayOrder;
    return this;
  }

   /**
   * The order in which periods should be displayed
   * @return displayOrder
  **/
  @ApiModelProperty(value = "The order in which periods should be displayed")
  public Integer getDisplayOrder() {
    return displayOrder;
  }

  public void setDisplayOrder(Integer displayOrder) {
    this.displayOrder = displayOrder;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimetableStructurePeriods timetableStructurePeriods = (TimetableStructurePeriods) o;
    return Objects.equals(this.object, timetableStructurePeriods.object) &&
        Objects.equals(this.id, timetableStructurePeriods.id) &&
        Objects.equals(this.shortName, timetableStructurePeriods.shortName) &&
        Objects.equals(this.longName, timetableStructurePeriods.longName) &&
        Objects.equals(this.startTime, timetableStructurePeriods.startTime) &&
        Objects.equals(this.endTime, timetableStructurePeriods.endTime) &&
        Objects.equals(this.displayOrder, timetableStructurePeriods.displayOrder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(object, id, shortName, longName, startTime, endTime, displayOrder);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimetableStructurePeriods {\n");
    
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    shortName: ").append(toIndentedString(shortName)).append("\n");
    sb.append("    longName: ").append(toIndentedString(longName)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    displayOrder: ").append(toIndentedString(displayOrder)).append("\n");
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

