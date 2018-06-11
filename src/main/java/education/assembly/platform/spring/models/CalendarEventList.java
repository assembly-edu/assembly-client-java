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
import education.assembly.platform.spring.models.CalendarEventListData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

/**
 * A page of calendar_event objects
 */
@ApiModel(description = "A page of calendar_event objects")

public class CalendarEventList implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("object")
  private String object = null;

  @JsonProperty("total_count")
  private Integer totalCount = null;

  @JsonProperty("total_pages")
  private Integer totalPages = null;

  @JsonProperty("current_page")
  private Integer currentPage = null;

  @JsonProperty("prev_page")
  private Integer prevPage = null;

  @JsonProperty("next_page")
  private Integer nextPage = null;

  @JsonProperty("data")
  private List<CalendarEventListData> data = null;

  public CalendarEventList object(String object) {
    this.object = object;
    return this;
  }

   /**
   * Object type
   * @return object
  **/
  @ApiModelProperty(example = "list", value = "Object type")
  public String getObject() {
    return object;
  }

  public void setObject(String object) {
    this.object = object;
  }

  public CalendarEventList totalCount(Integer totalCount) {
    this.totalCount = totalCount;
    return this;
  }

   /**
   * Total number of objects available
   * @return totalCount
  **/
  @ApiModelProperty(example = "10", value = "Total number of objects available")
  public Integer getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(Integer totalCount) {
    this.totalCount = totalCount;
  }

  public CalendarEventList totalPages(Integer totalPages) {
    this.totalPages = totalPages;
    return this;
  }

   /**
   * Total number of pages available
   * @return totalPages
  **/
  @ApiModelProperty(example = "2", value = "Total number of pages available")
  public Integer getTotalPages() {
    return totalPages;
  }

  public void setTotalPages(Integer totalPages) {
    this.totalPages = totalPages;
  }

  public CalendarEventList currentPage(Integer currentPage) {
    this.currentPage = currentPage;
    return this;
  }

   /**
   * Current page in pages available
   * @return currentPage
  **/
  @ApiModelProperty(example = "1", value = "Current page in pages available")
  public Integer getCurrentPage() {
    return currentPage;
  }

  public void setCurrentPage(Integer currentPage) {
    this.currentPage = currentPage;
  }

  public CalendarEventList prevPage(Integer prevPage) {
    this.prevPage = prevPage;
    return this;
  }

   /**
   * Previous page number
   * @return prevPage
  **/
  @ApiModelProperty(value = "Previous page number")
  public Integer getPrevPage() {
    return prevPage;
  }

  public void setPrevPage(Integer prevPage) {
    this.prevPage = prevPage;
  }

  public CalendarEventList nextPage(Integer nextPage) {
    this.nextPage = nextPage;
    return this;
  }

   /**
   * Next page number
   * @return nextPage
  **/
  @ApiModelProperty(example = "1", value = "Next page number")
  public Integer getNextPage() {
    return nextPage;
  }

  public void setNextPage(Integer nextPage) {
    this.nextPage = nextPage;
  }

  public CalendarEventList data(List<CalendarEventListData> data) {
    this.data = data;
    return this;
  }

  public CalendarEventList addDataItem(CalendarEventListData dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<CalendarEventListData>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * The paged data
   * @return data
  **/
  @ApiModelProperty(value = "The paged data")
  public List<CalendarEventListData> getData() {
    return data;
  }

  public void setData(List<CalendarEventListData> data) {
    this.data = data;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CalendarEventList calendarEventList = (CalendarEventList) o;
    return Objects.equals(this.object, calendarEventList.object) &&
        Objects.equals(this.totalCount, calendarEventList.totalCount) &&
        Objects.equals(this.totalPages, calendarEventList.totalPages) &&
        Objects.equals(this.currentPage, calendarEventList.currentPage) &&
        Objects.equals(this.prevPage, calendarEventList.prevPage) &&
        Objects.equals(this.nextPage, calendarEventList.nextPage) &&
        Objects.equals(this.data, calendarEventList.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(object, totalCount, totalPages, currentPage, prevPage, nextPage, data);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CalendarEventList {\n");
    
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    sb.append("    totalPages: ").append(toIndentedString(totalPages)).append("\n");
    sb.append("    currentPage: ").append(toIndentedString(currentPage)).append("\n");
    sb.append("    prevPage: ").append(toIndentedString(prevPage)).append("\n");
    sb.append("    nextPage: ").append(toIndentedString(nextPage)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

