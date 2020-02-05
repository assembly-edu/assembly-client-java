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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.threeten.bp.OffsetDateTime;
import java.io.Serializable;

/**
 * AcademicYearTerms
 */

public class AcademicYearTerms implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("object")
  private String object = "term";

  @JsonProperty("id")
  private Integer id = ;

  @JsonProperty("name")
  private String name = ;

  @JsonProperty("start_date")
  private OffsetDateTime startDate = ;

  @JsonProperty("end_date")
  private OffsetDateTime endDate = ;

  public AcademicYearTerms object(String object) {
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

  public AcademicYearTerms id(Integer id) {
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

  public AcademicYearTerms name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the term
   * @return name
  **/
  @ApiModelProperty(value = "Name of the term")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AcademicYearTerms startDate(OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Date on which term begins
   * @return startDate
  **/
  @ApiModelProperty(value = "Date on which term begins")
  public OffsetDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }

  public AcademicYearTerms endDate(OffsetDateTime endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * Date on which term ends
   * @return endDate
  **/
  @ApiModelProperty(value = "Date on which term ends")
  public OffsetDateTime getEndDate() {
    return endDate;
  }

  public void setEndDate(OffsetDateTime endDate) {
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
    AcademicYearTerms academicYearTerms = (AcademicYearTerms) o;
    return Objects.equals(this.object, academicYearTerms.object) &&
        Objects.equals(this.id, academicYearTerms.id) &&
        Objects.equals(this.name, academicYearTerms.name) &&
        Objects.equals(this.startDate, academicYearTerms.startDate) &&
        Objects.equals(this.endDate, academicYearTerms.endDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(object, id, name, startDate, endDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AcademicYearTerms {\n");
    
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

