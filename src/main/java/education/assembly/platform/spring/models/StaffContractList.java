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
import education.assembly.platform.spring.models.StaffContractListData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

/**
 * A page of staff_contract objects
 */
@ApiModel(description = "A page of staff_contract objects")

public class StaffContractList implements Serializable {
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
  private List<StaffContractListData> data = null;

  public StaffContractList object(String object) {
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

  public StaffContractList totalCount(Integer totalCount) {
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

  public StaffContractList totalPages(Integer totalPages) {
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

  public StaffContractList currentPage(Integer currentPage) {
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

  public StaffContractList prevPage(Integer prevPage) {
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

  public StaffContractList nextPage(Integer nextPage) {
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

  public StaffContractList data(List<StaffContractListData> data) {
    this.data = data;
    return this;
  }

  public StaffContractList addDataItem(StaffContractListData dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<StaffContractListData>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * The paged data
   * @return data
  **/
  @ApiModelProperty(value = "The paged data")
  public List<StaffContractListData> getData() {
    return data;
  }

  public void setData(List<StaffContractListData> data) {
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
    StaffContractList staffContractList = (StaffContractList) o;
    return Objects.equals(this.object, staffContractList.object) &&
        Objects.equals(this.totalCount, staffContractList.totalCount) &&
        Objects.equals(this.totalPages, staffContractList.totalPages) &&
        Objects.equals(this.currentPage, staffContractList.currentPage) &&
        Objects.equals(this.prevPage, staffContractList.prevPage) &&
        Objects.equals(this.nextPage, staffContractList.nextPage) &&
        Objects.equals(this.data, staffContractList.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(object, totalCount, totalPages, currentPage, prevPage, nextPage, data);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StaffContractList {\n");
    
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

