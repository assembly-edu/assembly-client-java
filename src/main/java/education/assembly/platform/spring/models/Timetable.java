/*
 * assembly-client-java 1.2.450
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
import education.assembly.platform.spring.models.TimetableDays;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
import java.io.Serializable;

/**
 * A timetable
 */
@ApiModel(description = "A timetable")

public class Timetable implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("object")
  private String object = "timetable";

  @JsonProperty("id")
  private Integer id = ;

  @JsonProperty("name")
  private String name = ;

  @JsonProperty("description")
  private String description = ;

  @JsonProperty("start_date")
  private OffsetDateTime startDate = ;

  @JsonProperty("end_date")
  private OffsetDateTime endDate = ;

  @JsonProperty("weeks")
  private Integer weeks = ;

  @JsonProperty("days_per_week")
  private Integer daysPerWeek = ;

  @JsonProperty("periods_per_day")
  private Integer periodsPerDay = ;

  @JsonProperty("days")
  private List<TimetableDays> days = null;

  public Timetable object(String object) {
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

  public Timetable id(Integer id) {
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

  public Timetable name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the timetable
   * @return name
  **/
  @ApiModelProperty(value = "The name of the timetable")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Timetable description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description of the timetable cycle
   * @return description
  **/
  @ApiModelProperty(value = "The description of the timetable cycle")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Timetable startDate(OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * The start date of the timetable cycle
   * @return startDate
  **/
  @ApiModelProperty(value = "The start date of the timetable cycle")
  public OffsetDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }

  public Timetable endDate(OffsetDateTime endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * The end date of the timetable cycle
   * @return endDate
  **/
  @ApiModelProperty(value = "The end date of the timetable cycle")
  public OffsetDateTime getEndDate() {
    return endDate;
  }

  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }

  public Timetable weeks(Integer weeks) {
    this.weeks = weeks;
    return this;
  }

   /**
   * The number of weeks in the timetable cycle
   * @return weeks
  **/
  @ApiModelProperty(value = "The number of weeks in the timetable cycle")
  public Integer getWeeks() {
    return weeks;
  }

  public void setWeeks(Integer weeks) {
    this.weeks = weeks;
  }

  public Timetable daysPerWeek(Integer daysPerWeek) {
    this.daysPerWeek = daysPerWeek;
    return this;
  }

   /**
   * Number of days per week
   * @return daysPerWeek
  **/
  @ApiModelProperty(value = "Number of days per week")
  public Integer getDaysPerWeek() {
    return daysPerWeek;
  }

  public void setDaysPerWeek(Integer daysPerWeek) {
    this.daysPerWeek = daysPerWeek;
  }

  public Timetable periodsPerDay(Integer periodsPerDay) {
    this.periodsPerDay = periodsPerDay;
    return this;
  }

   /**
   * Number of periods per day
   * @return periodsPerDay
  **/
  @ApiModelProperty(value = "Number of periods per day")
  public Integer getPeriodsPerDay() {
    return periodsPerDay;
  }

  public void setPeriodsPerDay(Integer periodsPerDay) {
    this.periodsPerDay = periodsPerDay;
  }

  public Timetable days(List<TimetableDays> days) {
    this.days = days;
    return this;
  }

  public Timetable addDaysItem(TimetableDays daysItem) {
    if (this.days == null) {
      this.days = new ArrayList<TimetableDays>();
    }
    this.days.add(daysItem);
    return this;
  }

   /**
   * Provides details of the individual days that make up the timetable
   * @return days
  **/
  @ApiModelProperty(value = "Provides details of the individual days that make up the timetable")
  public List<TimetableDays> getDays() {
    return days;
  }

  public void setDays(List<TimetableDays> days) {
    this.days = days;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Timetable timetable = (Timetable) o;
    return Objects.equals(this.object, timetable.object) &&
        Objects.equals(this.id, timetable.id) &&
        Objects.equals(this.name, timetable.name) &&
        Objects.equals(this.description, timetable.description) &&
        Objects.equals(this.startDate, timetable.startDate) &&
        Objects.equals(this.endDate, timetable.endDate) &&
        Objects.equals(this.weeks, timetable.weeks) &&
        Objects.equals(this.daysPerWeek, timetable.daysPerWeek) &&
        Objects.equals(this.periodsPerDay, timetable.periodsPerDay) &&
        Objects.equals(this.days, timetable.days);
  }

  @Override
  public int hashCode() {
    return Objects.hash(object, id, name, description, startDate, endDate, weeks, daysPerWeek, periodsPerDay, days);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Timetable {\n");
    
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    weeks: ").append(toIndentedString(weeks)).append("\n");
    sb.append("    daysPerWeek: ").append(toIndentedString(daysPerWeek)).append("\n");
    sb.append("    periodsPerDay: ").append(toIndentedString(periodsPerDay)).append("\n");
    sb.append("    days: ").append(toIndentedString(days)).append("\n");
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

