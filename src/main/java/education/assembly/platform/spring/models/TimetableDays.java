/*
 * assembly-client-java 1.2.475
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
import education.assembly.platform.spring.models.TimetablePeriods;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.LocalDate;
import java.io.Serializable;

/**
 * TimetableDays
 */

public class TimetableDays implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("object")
  private String object = "day";

  @JsonProperty("id")
  private Integer id = ;

  @JsonProperty("short_name")
  private String shortName = ;

  @JsonProperty("long_name")
  private String longName = ;

  @JsonProperty("display_order")
  private Integer displayOrder = ;

  @JsonProperty("occurs_on")
  private List<LocalDate> occursOn = null;

  @JsonProperty("periods")
  private List<TimetablePeriods> periods = null;

  public TimetableDays object(String object) {
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

  public TimetableDays id(Integer id) {
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

  public TimetableDays shortName(String shortName) {
    this.shortName = shortName;
    return this;
  }

   /**
   * The day short name
   * @return shortName
  **/
  @ApiModelProperty(value = "The day short name")
  public String getShortName() {
    return shortName;
  }

  public void setShortName(String shortName) {
    this.shortName = shortName;
  }

  public TimetableDays longName(String longName) {
    this.longName = longName;
    return this;
  }

   /**
   * The day long name
   * @return longName
  **/
  @ApiModelProperty(value = "The day long name")
  public String getLongName() {
    return longName;
  }

  public void setLongName(String longName) {
    this.longName = longName;
  }

  public TimetableDays displayOrder(Integer displayOrder) {
    this.displayOrder = displayOrder;
    return this;
  }

   /**
   * The order in which days should be displayed
   * @return displayOrder
  **/
  @ApiModelProperty(value = "The order in which days should be displayed")
  public Integer getDisplayOrder() {
    return displayOrder;
  }

  public void setDisplayOrder(Integer displayOrder) {
    this.displayOrder = displayOrder;
  }

  public TimetableDays occursOn(List<LocalDate> occursOn) {
    this.occursOn = occursOn;
    return this;
  }

  public TimetableDays addOccursOnItem(LocalDate occursOnItem) {
    if (this.occursOn == null) {
      this.occursOn = new ArrayList<LocalDate>();
    }
    this.occursOn.add(occursOnItem);
    return this;
  }

   /**
   * An array of dates for when the timetabled day occurs.
   * @return occursOn
  **/
  @ApiModelProperty(value = "An array of dates for when the timetabled day occurs.")
  public List<LocalDate> getOccursOn() {
    return occursOn;
  }

  public void setOccursOn(List<LocalDate> occursOn) {
    this.occursOn = occursOn;
  }

  public TimetableDays periods(List<TimetablePeriods> periods) {
    this.periods = periods;
    return this;
  }

  public TimetableDays addPeriodsItem(TimetablePeriods periodsItem) {
    if (this.periods == null) {
      this.periods = new ArrayList<TimetablePeriods>();
    }
    this.periods.add(periodsItem);
    return this;
  }

   /**
   * Provides details of the individual periods that make up the day
   * @return periods
  **/
  @ApiModelProperty(value = "Provides details of the individual periods that make up the day")
  public List<TimetablePeriods> getPeriods() {
    return periods;
  }

  public void setPeriods(List<TimetablePeriods> periods) {
    this.periods = periods;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimetableDays timetableDays = (TimetableDays) o;
    return Objects.equals(this.object, timetableDays.object) &&
        Objects.equals(this.id, timetableDays.id) &&
        Objects.equals(this.shortName, timetableDays.shortName) &&
        Objects.equals(this.longName, timetableDays.longName) &&
        Objects.equals(this.displayOrder, timetableDays.displayOrder) &&
        Objects.equals(this.occursOn, timetableDays.occursOn) &&
        Objects.equals(this.periods, timetableDays.periods);
  }

  @Override
  public int hashCode() {
    return Objects.hash(object, id, shortName, longName, displayOrder, occursOn, periods);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimetableDays {\n");
    
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    shortName: ").append(toIndentedString(shortName)).append("\n");
    sb.append("    longName: ").append(toIndentedString(longName)).append("\n");
    sb.append("    displayOrder: ").append(toIndentedString(displayOrder)).append("\n");
    sb.append("    occursOn: ").append(toIndentedString(occursOn)).append("\n");
    sb.append("    periods: ").append(toIndentedString(periods)).append("\n");
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

