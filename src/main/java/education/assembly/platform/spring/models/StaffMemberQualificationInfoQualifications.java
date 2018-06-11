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
 * No description
 */
@ApiModel(description = "No description")

public class StaffMemberQualificationInfoQualifications implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("object")
  private String object = null;

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

  public StaffMemberQualificationInfoQualifications object(String object) {
    this.object = object;
    return this;
  }

   /**
   * Object type
   * @return object
  **/
  @ApiModelProperty(example = "staff_qualifications", value = "Object type")
  public String getObject() {
    return object;
  }

  public void setObject(String object) {
    this.object = object;
  }

  public StaffMemberQualificationInfoQualifications id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Internal stable ID given to all staff qualifications on the Platform
   * @return id
  **/
  @ApiModelProperty(example = "323", value = "Internal stable ID given to all staff qualifications on the Platform")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public StaffMemberQualificationInfoQualifications qualificationCode(String qualificationCode) {
    this.qualificationCode = qualificationCode;
    return this;
  }

   /**
   * A code describing the type of qualification 
   * @return qualificationCode
  **/
  @ApiModelProperty(example = "Other First Degree or equivalent", value = "A code describing the type of qualification ")
  public String getQualificationCode() {
    return qualificationCode;
  }

  public void setQualificationCode(String qualificationCode) {
    this.qualificationCode = qualificationCode;
  }

  public StaffMemberQualificationInfoQualifications degreeClass(String degreeClass) {
    this.degreeClass = degreeClass;
    return this;
  }

   /**
   * Identifies the result of the qualification
   * @return degreeClass
  **/
  @ApiModelProperty(example = "Upper second class honours", value = "Identifies the result of the qualification")
  public String getDegreeClass() {
    return degreeClass;
  }

  public void setDegreeClass(String degreeClass) {
    this.degreeClass = degreeClass;
  }

  public StaffMemberQualificationInfoQualifications firstSubjectCode(String firstSubjectCode) {
    this.firstSubjectCode = firstSubjectCode;
    return this;
  }

   /**
   * A code identifying the main or joint main subject of the qualification
   * @return firstSubjectCode
  **/
  @ApiModelProperty(example = "D900", value = "A code identifying the main or joint main subject of the qualification")
  public String getFirstSubjectCode() {
    return firstSubjectCode;
  }

  public void setFirstSubjectCode(String firstSubjectCode) {
    this.firstSubjectCode = firstSubjectCode;
  }

  public StaffMemberQualificationInfoQualifications firstSubjectName(String firstSubjectName) {
    this.firstSubjectName = firstSubjectName;
    return this;
  }

   /**
   * The name of the subject
   * @return firstSubjectName
  **/
  @ApiModelProperty(example = "Chemistry", value = "The name of the subject")
  public String getFirstSubjectName() {
    return firstSubjectName;
  }

  public void setFirstSubjectName(String firstSubjectName) {
    this.firstSubjectName = firstSubjectName;
  }

  public StaffMemberQualificationInfoQualifications secondSubjectCode(String secondSubjectCode) {
    this.secondSubjectCode = secondSubjectCode;
    return this;
  }

   /**
   * A code identifying the main or joint main subject of the qualification
   * @return secondSubjectCode
  **/
  @ApiModelProperty(value = "A code identifying the main or joint main subject of the qualification")
  public String getSecondSubjectCode() {
    return secondSubjectCode;
  }

  public void setSecondSubjectCode(String secondSubjectCode) {
    this.secondSubjectCode = secondSubjectCode;
  }

  public StaffMemberQualificationInfoQualifications secondSubjectName(String secondSubjectName) {
    this.secondSubjectName = secondSubjectName;
    return this;
  }

   /**
   * The name of the subject
   * @return secondSubjectName
  **/
  @ApiModelProperty(value = "The name of the subject")
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
    StaffMemberQualificationInfoQualifications staffMemberQualificationInfoQualifications = (StaffMemberQualificationInfoQualifications) o;
    return Objects.equals(this.object, staffMemberQualificationInfoQualifications.object) &&
        Objects.equals(this.id, staffMemberQualificationInfoQualifications.id) &&
        Objects.equals(this.qualificationCode, staffMemberQualificationInfoQualifications.qualificationCode) &&
        Objects.equals(this.degreeClass, staffMemberQualificationInfoQualifications.degreeClass) &&
        Objects.equals(this.firstSubjectCode, staffMemberQualificationInfoQualifications.firstSubjectCode) &&
        Objects.equals(this.firstSubjectName, staffMemberQualificationInfoQualifications.firstSubjectName) &&
        Objects.equals(this.secondSubjectCode, staffMemberQualificationInfoQualifications.secondSubjectCode) &&
        Objects.equals(this.secondSubjectName, staffMemberQualificationInfoQualifications.secondSubjectName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(object, id, qualificationCode, degreeClass, firstSubjectCode, firstSubjectName, secondSubjectCode, secondSubjectName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StaffMemberQualificationInfoQualifications {\n");
    
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

