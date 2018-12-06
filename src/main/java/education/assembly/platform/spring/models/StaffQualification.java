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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

/**
 * StaffQualification
 */

public class StaffQualification implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("qualification_code")
  private String qualificationCode = null;

  @JsonProperty("degree_class")
  private String degreeClass = null;

  @JsonProperty("first_subject_code")
  private String firstSubjectCode = null;

  @JsonProperty("first_subject_name")
  private String firstSubjectName = null;

  @JsonProperty("second_subject_code")
  private String secondSubjectCode = null;

  @JsonProperty("second_subject_name")
  private String secondSubjectName = null;

  public StaffQualification id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public StaffQualification qualificationCode(String qualificationCode) {
    this.qualificationCode = qualificationCode;
    return this;
  }

   /**
   * Get qualificationCode
   * @return qualificationCode
  **/
  @ApiModelProperty(value = "")
  public String getQualificationCode() {
    return qualificationCode;
  }

  public void setQualificationCode(String qualificationCode) {
    this.qualificationCode = qualificationCode;
  }

  public StaffQualification degreeClass(String degreeClass) {
    this.degreeClass = degreeClass;
    return this;
  }

   /**
   * Get degreeClass
   * @return degreeClass
  **/
  @ApiModelProperty(value = "")
  public String getDegreeClass() {
    return degreeClass;
  }

  public void setDegreeClass(String degreeClass) {
    this.degreeClass = degreeClass;
  }

  public StaffQualification firstSubjectCode(String firstSubjectCode) {
    this.firstSubjectCode = firstSubjectCode;
    return this;
  }

   /**
   * Get firstSubjectCode
   * @return firstSubjectCode
  **/
  @ApiModelProperty(value = "")
  public String getFirstSubjectCode() {
    return firstSubjectCode;
  }

  public void setFirstSubjectCode(String firstSubjectCode) {
    this.firstSubjectCode = firstSubjectCode;
  }

  public StaffQualification firstSubjectName(String firstSubjectName) {
    this.firstSubjectName = firstSubjectName;
    return this;
  }

   /**
   * Get firstSubjectName
   * @return firstSubjectName
  **/
  @ApiModelProperty(value = "")
  public String getFirstSubjectName() {
    return firstSubjectName;
  }

  public void setFirstSubjectName(String firstSubjectName) {
    this.firstSubjectName = firstSubjectName;
  }

  public StaffQualification secondSubjectCode(String secondSubjectCode) {
    this.secondSubjectCode = secondSubjectCode;
    return this;
  }

   /**
   * Get secondSubjectCode
   * @return secondSubjectCode
  **/
  @ApiModelProperty(value = "")
  public String getSecondSubjectCode() {
    return secondSubjectCode;
  }

  public void setSecondSubjectCode(String secondSubjectCode) {
    this.secondSubjectCode = secondSubjectCode;
  }

  public StaffQualification secondSubjectName(String secondSubjectName) {
    this.secondSubjectName = secondSubjectName;
    return this;
  }

   /**
   * Get secondSubjectName
   * @return secondSubjectName
  **/
  @ApiModelProperty(value = "")
  public String getSecondSubjectName() {
    return secondSubjectName;
  }

  public void setSecondSubjectName(String secondSubjectName) {
    this.secondSubjectName = secondSubjectName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StaffQualification staffQualification = (StaffQualification) o;
    return Objects.equals(this.id, staffQualification.id) &&
        Objects.equals(this.qualificationCode, staffQualification.qualificationCode) &&
        Objects.equals(this.degreeClass, staffQualification.degreeClass) &&
        Objects.equals(this.firstSubjectCode, staffQualification.firstSubjectCode) &&
        Objects.equals(this.firstSubjectName, staffQualification.firstSubjectName) &&
        Objects.equals(this.secondSubjectCode, staffQualification.secondSubjectCode) &&
        Objects.equals(this.secondSubjectName, staffQualification.secondSubjectName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, qualificationCode, degreeClass, firstSubjectCode, firstSubjectName, secondSubjectCode, secondSubjectName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StaffQualification {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    qualificationCode: ").append(toIndentedString(qualificationCode)).append("\n");
    sb.append("    degreeClass: ").append(toIndentedString(degreeClass)).append("\n");
    sb.append("    firstSubjectCode: ").append(toIndentedString(firstSubjectCode)).append("\n");
    sb.append("    firstSubjectName: ").append(toIndentedString(firstSubjectName)).append("\n");
    sb.append("    secondSubjectCode: ").append(toIndentedString(secondSubjectCode)).append("\n");
    sb.append("    secondSubjectName: ").append(toIndentedString(secondSubjectName)).append("\n");
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

