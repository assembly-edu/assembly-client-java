/*
 * assembly-client-java 1.2.379
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
import org.threeten.bp.OffsetDateTime;
import java.io.Serializable;

/**
 * A school year within a particular school.
 */
@ApiModel(description = "A school year within a particular school.")

public class AcademicYear implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("object")
  private String object = "academic_year";

  @JsonProperty("id")
  private Integer id = ;

  @JsonProperty("name")
  private String name = ;

  @JsonProperty("start_date")
  private OffsetDateTime startDate = ;

  @JsonProperty("end_date")
  private OffsetDateTime endDate = ;

  @JsonProperty("terms")
  private List<AcademicYearTerms> terms = null;

  public AcademicYear object(String object) {
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

  public AcademicYear id(Integer id) {
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

  public AcademicYear name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of academic year
   * @return name
  **/
  @ApiModelProperty(value = "Name of academic year")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AcademicYear startDate(OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Date on which academic year starts
   * @return startDate
  **/
  @ApiModelProperty(value = "Date on which academic year starts")
  public OffsetDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }

  public AcademicYear endDate(OffsetDateTime endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * Date on which academic year ends
   * @return endDate
  **/
  @ApiModelProperty(value = "Date on which academic year ends")
  public OffsetDateTime getEndDate() {
    return endDate;
  }

  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }

  public AcademicYear terms(List<AcademicYearTerms> terms) {
    this.terms = terms;
    return this;
  }

  public AcademicYear addTermsItem(AcademicYearTerms termsItem) {
    if (this.terms == null) {
      this.terms = new ArrayList<AcademicYearTerms>();
    }
    this.terms.add(termsItem);
    return this;
  }

   /**
   * Provides details of the individual terms that make up the academic year
   * @return terms
  **/
  @ApiModelProperty(value = "Provides details of the individual terms that make up the academic year")
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
    AcademicYear academicYear = (AcademicYear) o;
    return Objects.equals(this.object, academicYear.object) &&
        Objects.equals(this.id, academicYear.id) &&
        Objects.equals(this.name, academicYear.name) &&
        Objects.equals(this.startDate, academicYear.startDate) &&
        Objects.equals(this.endDate, academicYear.endDate) &&
        Objects.equals(this.terms, academicYear.terms);
  }

  @Override
  public int hashCode() {
    return Objects.hash(object, id, name, startDate, endDate, terms);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AcademicYear {\n");
    
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
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

