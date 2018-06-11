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
import education.assembly.platform.spring.models.AcademicYearTerms;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.LocalDate;
import java.io.Serializable;

/**
 * An academic year object represents a school year within a particular school.
 */
@ApiModel(description = "An academic year object represents a school year within a particular school.")

public class AcademicYearListData implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("start_date")
  private LocalDate startDate = null;

  @JsonProperty("end_date")
  private LocalDate endDate = null;

  @JsonProperty("terms")
  private List<AcademicYearTerms> terms = null;

  public AcademicYearListData id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Internal stable ID given to academic year on Platform
   * @return id
  **/
  @ApiModelProperty(example = "4", value = "Internal stable ID given to academic year on Platform")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public AcademicYearListData name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of academic year
   * @return name
  **/
  @ApiModelProperty(example = "2015/2016", value = "Name of academic year")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AcademicYearListData startDate(LocalDate startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Date on which academic year starts
   * @return startDate
  **/
  @ApiModelProperty(example = "2015-09-01", value = "Date on which academic year starts")
  public LocalDate getStartDate() {
    return startDate;
  }

  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }

  public AcademicYearListData endDate(LocalDate endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * Date on which academic year ends
   * @return endDate
  **/
  @ApiModelProperty(example = "2016-07-21", value = "Date on which academic year ends")
  public LocalDate getEndDate() {
    return endDate;
  }

  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }

  public AcademicYearListData terms(List<AcademicYearTerms> terms) {
    this.terms = terms;
    return this;
  }

  public AcademicYearListData addTermsItem(AcademicYearTerms termsItem) {
    if (this.terms == null) {
      this.terms = new ArrayList<AcademicYearTerms>();
    }
    this.terms.add(termsItem);
    return this;
  }

   /**
   * Provides details of the individual terms that make up the academic year where available (currently for SIMS schools only)
   * @return terms
  **/
  @ApiModelProperty(value = "Provides details of the individual terms that make up the academic year where available (currently for SIMS schools only)")
  public List<AcademicYearTerms> getTerms() {
    return terms;
  }

  public void setTerms(List<AcademicYearTerms> terms) {
    this.terms = terms;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AcademicYearListData academicYearListData = (AcademicYearListData) o;
    return Objects.equals(this.id, academicYearListData.id) &&
        Objects.equals(this.name, academicYearListData.name) &&
        Objects.equals(this.startDate, academicYearListData.startDate) &&
        Objects.equals(this.endDate, academicYearListData.endDate) &&
        Objects.equals(this.terms, academicYearListData.terms);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, startDate, endDate, terms);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AcademicYearListData {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    terms: ").append(toIndentedString(terms)).append("\n");
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

