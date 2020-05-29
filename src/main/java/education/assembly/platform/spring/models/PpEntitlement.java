/*
 * assembly-client-java 1.2.464
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
 * A period of entitlement to Pupil Premium
 */
@ApiModel(description = "A period of entitlement to Pupil Premium")

public class PpEntitlement implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("object")
  private String object = "pp_entitlement";

  @JsonProperty("id")
  private Integer id = ;

  @JsonProperty("start_date")
  private String startDate = ;

  @JsonProperty("end_date")
  private String endDate = ;

  public PpEntitlement object(String object) {
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

  public PpEntitlement id(Integer id) {
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

  public PpEntitlement startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * The start date for the entitlement
   * @return startDate
  **/
  @ApiModelProperty(value = "The start date for the entitlement")
  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  public PpEntitlement endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * The end date for the entitlement
   * @return endDate
  **/
  @ApiModelProperty(value = "The end date for the entitlement")
  public String getEndDate() {
    return endDate;
  }

  public void setEndDate(String endDate) {
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
    PpEntitlement ppEntitlement = (PpEntitlement) o;
    return Objects.equals(this.object, ppEntitlement.object) &&
        Objects.equals(this.id, ppEntitlement.id) &&
        Objects.equals(this.startDate, ppEntitlement.startDate) &&
        Objects.equals(this.endDate, ppEntitlement.endDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(object, id, startDate, endDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PpEntitlement {\n");
    
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

