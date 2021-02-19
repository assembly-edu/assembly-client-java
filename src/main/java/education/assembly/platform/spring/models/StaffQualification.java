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
 * A degree completed by a staff member.
 */
@ApiModel(description = "A degree completed by a staff member.")

public class StaffQualification implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("object")
  private String object = "staff_qualification";

  @JsonProperty("id")
  private Integer id = ;

  @JsonProperty("qualification_code")
  private String qualificationCode = ;

  @JsonProperty("degree_class")
  private String degreeClass = ;

  @JsonProperty("first_subject_code")
  private String firstSubjectCode = ;

  @JsonProperty("first_subject_name")
  private String firstSubjectName = ;

  @JsonProperty("second_subject_code")
  private String secondSubjectCode = ;

  @JsonProperty("second_subject_name")
  private String secondSubjectName = ;

  public StaffQualification object(String object) {
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

  public StaffQualification id(Integer id) {
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

  public StaffQualification qualificationCode(String qualificationCode) {
    this.qualificationCode = qualificationCode;
    return this;
  }

   /**
   * A code describing the type of qualification
   * @return qualificationCode
  **/
  @ApiModelProperty(value = "A code describing the type of qualification")
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
   * Identifies the result of the qualification
   * @return degreeClass
  **/
  @ApiModelProperty(value = "Identifies the result of the qualification")
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
   * A code identifying the primary or joint main subject of the qualification
   * @return firstSubjectCode
  **/
  @ApiModelProperty(value = "A code identifying the primary or joint main subject of the qualification")
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
   * The name of the main/joint subject
   * @return firstSubjectName
  **/
  @ApiModelProperty(value = "The name of the main/joint subject")
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
   * A code identifying the secondary or joint main subject of the qualification
   * @return secondSubjectCode
  **/
  @ApiModelProperty(value = "A code identifying the secondary or joint main subject of the qualification")
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
   * The name of the secondary/joint subject
   * @return secondSubjectName
  **/
  @ApiModelProperty(value = "The name of the secondary/joint subject")
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
    return Objects.equals(this.object, staffQualification.object) &&
        Objects.equals(this.id, staffQualification.id) &&
        Objects.equals(this.qualificationCode, staffQualification.qualificationCode) &&
        Objects.equals(this.degreeClass, staffQualification.degreeClass) &&
        Objects.equals(this.firstSubjectCode, staffQualification.firstSubjectCode) &&
        Objects.equals(this.firstSubjectName, staffQualification.firstSubjectName) &&
        Objects.equals(this.secondSubjectCode, staffQualification.secondSubjectCode) &&
        Objects.equals(this.secondSubjectName, staffQualification.secondSubjectName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(object, id, qualificationCode, degreeClass, firstSubjectCode, firstSubjectName, secondSubjectCode, secondSubjectName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StaffQualification {\n");
    
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
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

