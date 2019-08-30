/*
 * assembly-client-java 1.2.412
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
import education.assembly.platform.spring.models.StudentMedicalNote;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
import java.io.Serializable;

/**
 * A student&#39;s medical condition
 */
@ApiModel(description = "A student's medical condition")

public class StudentMedicalCondition implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("object")
  private String object = "student_medical_condition";

  @JsonProperty("id")
  private Integer id = ;

  @JsonProperty("information_received_on")
  private OffsetDateTime informationReceivedOn = ;

  @JsonProperty("code")
  private String code = ;

  @JsonProperty("name")
  private String name = ;

  @JsonProperty("notes")
  private List<StudentMedicalNote> notes = null;

  public StudentMedicalCondition object(String object) {
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

  public StudentMedicalCondition id(Integer id) {
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

  public StudentMedicalCondition informationReceivedOn(OffsetDateTime informationReceivedOn) {
    this.informationReceivedOn = informationReceivedOn;
    return this;
  }

   /**
   * The date and time that the medical condition was recorded within the MIS
   * @return informationReceivedOn
  **/
  @ApiModelProperty(value = "The date and time that the medical condition was recorded within the MIS")
  public OffsetDateTime getInformationReceivedOn() {
    return informationReceivedOn;
  }

  public void setInformationReceivedOn(OffsetDateTime informationReceivedOn) {
    this.informationReceivedOn = informationReceivedOn;
  }

  public StudentMedicalCondition code(String code) {
    this.code = code;
    return this;
  }

   /**
   * The code of the medical condition
   * @return code
  **/
  @ApiModelProperty(value = "The code of the medical condition")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public StudentMedicalCondition name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the medical condition
   * @return name
  **/
  @ApiModelProperty(value = "The name of the medical condition")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public StudentMedicalCondition notes(List<StudentMedicalNote> notes) {
    this.notes = notes;
    return this;
  }

  public StudentMedicalCondition addNotesItem(StudentMedicalNote notesItem) {
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
    StudentMedicalCondition studentMedicalCondition = (StudentMedicalCondition) o;
    return Objects.equals(this.object, studentMedicalCondition.object) &&
        Objects.equals(this.id, studentMedicalCondition.id) &&
        Objects.equals(this.informationReceivedOn, studentMedicalCondition.informationReceivedOn) &&
        Objects.equals(this.code, studentMedicalCondition.code) &&
        Objects.equals(this.name, studentMedicalCondition.name) &&
        Objects.equals(this.notes, studentMedicalCondition.notes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(object, id, informationReceivedOn, code, name, notes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StudentMedicalCondition {\n");
    
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    informationReceivedOn: ").append(toIndentedString(informationReceivedOn)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

