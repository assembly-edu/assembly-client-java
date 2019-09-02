/*
 * assembly-client-java 1.2.416
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
import education.assembly.platform.spring.models.StudentMedicalCondition;
import education.assembly.platform.spring.models.StudentMedicalNote;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

/**
 * Student medical information (this will only be returned if &#x60;&amp;medical&#x3D;true&#x60; is included in your request)
 */
@ApiModel(description = "Student medical information (this will only be returned if `&medical=true` is included in your request)")

public class StudentMedical implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("object")
  private String object = "student_medical";

  @JsonProperty("nhs_number")
  private String nhsNumber = ;

  @JsonProperty("is_pregnant")
  private Boolean isPregnant = ;

  @JsonProperty("has_emergency_consent")
  private Boolean hasEmergencyConsent = ;

  @JsonProperty("conditions")
  private List<StudentMedicalCondition> conditions = null;

  @JsonProperty("dietary_needs")
  private List<String> dietaryNeeds = null;

  @JsonProperty("notes")
  private List<StudentMedicalNote> notes = null;

  public StudentMedical object(String object) {
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

  public StudentMedical nhsNumber(String nhsNumber) {
    this.nhsNumber = nhsNumber;
    return this;
  }

   /**
   * Student&#39;s NHS number
   * @return nhsNumber
  **/
  @ApiModelProperty(value = "Student's NHS number")
  public String getNhsNumber() {
    return nhsNumber;
  }

  public void setNhsNumber(String nhsNumber) {
    this.nhsNumber = nhsNumber;
  }

  public StudentMedical isPregnant(Boolean isPregnant) {
    this.isPregnant = isPregnant;
    return this;
  }

   /**
   * If the student has been marked as pregnant
   * @return isPregnant
  **/
  @ApiModelProperty(value = "If the student has been marked as pregnant")
  public Boolean isgetIsPregnant() {
    return isPregnant;
  }

  public void setIsPregnant(Boolean isPregnant) {
    this.isPregnant = isPregnant;
  }

  public StudentMedical hasEmergencyConsent(Boolean hasEmergencyConsent) {
    this.hasEmergencyConsent = hasEmergencyConsent;
    return this;
  }

   /**
   * Whether or not medical consent has been given
   * @return hasEmergencyConsent
  **/
  @ApiModelProperty(value = "Whether or not medical consent has been given")
  public Boolean isgetHasEmergencyConsent() {
    return hasEmergencyConsent;
  }

  public void setHasEmergencyConsent(Boolean hasEmergencyConsent) {
    this.hasEmergencyConsent = hasEmergencyConsent;
  }

  public StudentMedical conditions(List<StudentMedicalCondition> conditions) {
    this.conditions = conditions;
    return this;
  }

  public StudentMedical addConditionsItem(StudentMedicalCondition conditionsItem) {
    if (this.conditions == null) {
      this.conditions = new ArrayList<StudentMedicalCondition>();
    }
    this.conditions.add(conditionsItem);
    return this;
  }

   /**
   * The medical conditions associated with the student
   * @return conditions
  **/
  @ApiModelProperty(value = "The medical conditions associated with the student")
  public List<StudentMedicalCondition> getConditions() {
    return conditions;
  }

  public void setConditions(List<StudentMedicalCondition> conditions) {
    this.conditions = conditions;
  }

  public StudentMedical dietaryNeeds(List<String> dietaryNeeds) {
    this.dietaryNeeds = dietaryNeeds;
    return this;
  }

  public StudentMedical addDietaryNeedsItem(String dietaryNeedsItem) {
    if (this.dietaryNeeds == null) {
      this.dietaryNeeds = new ArrayList<String>();
    }
    this.dietaryNeeds.add(dietaryNeedsItem);
    return this;
  }

   /**
   * The dietary need codes associated with the student
   * @return dietaryNeeds
  **/
  @ApiModelProperty(value = "The dietary need codes associated with the student")
  public List<String> getDietaryNeeds() {
    return dietaryNeeds;
  }

  public void setDietaryNeeds(List<String> dietaryNeeds) {
    this.dietaryNeeds = dietaryNeeds;
  }

  public StudentMedical notes(List<StudentMedicalNote> notes) {
    this.notes = notes;
    return this;
  }

  public StudentMedical addNotesItem(StudentMedicalNote notesItem) {
    if (this.notes == null) {
      this.notes = new ArrayList<StudentMedicalNote>();
    }
    this.notes.add(notesItem);
    return this;
  }

   /**
   * Additional information attached to the medical condition
   * @return notes
  **/
  @ApiModelProperty(value = "Additional information attached to the medical condition")
  public List<StudentMedicalNote> getNotes() {
    return notes;
  }

  public void setNotes(List<StudentMedicalNote> notes) {
    this.notes = notes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StudentMedical studentMedical = (StudentMedical) o;
    return Objects.equals(this.object, studentMedical.object) &&
        Objects.equals(this.nhsNumber, studentMedical.nhsNumber) &&
        Objects.equals(this.isPregnant, studentMedical.isPregnant) &&
        Objects.equals(this.hasEmergencyConsent, studentMedical.hasEmergencyConsent) &&
        Objects.equals(this.conditions, studentMedical.conditions) &&
        Objects.equals(this.dietaryNeeds, studentMedical.dietaryNeeds) &&
        Objects.equals(this.notes, studentMedical.notes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(object, nhsNumber, isPregnant, hasEmergencyConsent, conditions, dietaryNeeds, notes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StudentMedical {\n");
    
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    nhsNumber: ").append(toIndentedString(nhsNumber)).append("\n");
    sb.append("    isPregnant: ").append(toIndentedString(isPregnant)).append("\n");
    sb.append("    hasEmergencyConsent: ").append(toIndentedString(hasEmergencyConsent)).append("\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    dietaryNeeds: ").append(toIndentedString(dietaryNeeds)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
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

