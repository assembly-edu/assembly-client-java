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
import org.threeten.bp.OffsetDateTime;
import java.io.Serializable;

/**
 * A medical note about a student, possibly related to a medical condition
 */
@ApiModel(description = "A medical note about a student, possibly related to a medical condition")

public class StudentMedicalNote implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("object")
  private String object = "student_medical_note";

  @JsonProperty("id")
  private Integer id = ;

  @JsonProperty("status")
  private String status = ;

  @JsonProperty("summary")
  private String summary = ;

  @JsonProperty("detail")
  private String detail = ;

  @JsonProperty("created_by_id")
  private Integer createdById = ;

  @JsonProperty("last_modified_by_id")
  private Integer lastModifiedById = ;

  @JsonProperty("last_modified_date")
  private OffsetDateTime lastModifiedDate = ;

  public StudentMedicalNote object(String object) {
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

  public StudentMedicalNote id(Integer id) {
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

  public StudentMedicalNote status(String status) {
    this.status = status;
    return this;
  }

   /**
   * The status of the medical note, such as &#x60;PUBLIC&#x60;
   * @return status
  **/
  @ApiModelProperty(value = "The status of the medical note, such as `PUBLIC`")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public StudentMedicalNote summary(String summary) {
    this.summary = summary;
    return this;
  }

   /**
   * A summary of the note&#39;s content
   * @return summary
  **/
  @ApiModelProperty(value = "A summary of the note's content")
  public String getSummary() {
    return summary;
  }

  public void setSummary(String summary) {
    this.summary = summary;
  }

  public StudentMedicalNote detail(String detail) {
    this.detail = detail;
    return this;
  }

   /**
   * Further detail of the medical note
   * @return detail
  **/
  @ApiModelProperty(value = "Further detail of the medical note")
  public String getDetail() {
    return detail;
  }

  public void setDetail(String detail) {
    this.detail = detail;
  }

  public StudentMedicalNote createdById(Integer createdById) {
    this.createdById = createdById;
    return this;
  }

   /**
   * The ID of the staff member who created the note
   * @return createdById
  **/
  @ApiModelProperty(value = "The ID of the staff member who created the note")
  public Integer getCreatedById() {
    return createdById;
  }

  public void setCreatedById(Integer createdById) {
    this.createdById = createdById;
  }

  public StudentMedicalNote lastModifiedById(Integer lastModifiedById) {
    this.lastModifiedById = lastModifiedById;
    return this;
  }

   /**
   * The ID of the staff member who last modified the note
   * @return lastModifiedById
  **/
  @ApiModelProperty(value = "The ID of the staff member who last modified the note")
  public Integer getLastModifiedById() {
    return lastModifiedById;
  }

  public void setLastModifiedById(Integer lastModifiedById) {
    this.lastModifiedById = lastModifiedById;
  }

  public StudentMedicalNote lastModifiedDate(OffsetDateTime lastModifiedDate) {
    this.lastModifiedDate = lastModifiedDate;
    return this;
  }

   /**
   * The date and time that the note was last changed
   * @return lastModifiedDate
  **/
  @ApiModelProperty(value = "The date and time that the note was last changed")
  public OffsetDateTime getLastModifiedDate() {
    return lastModifiedDate;
  }

  public void setLastModifiedDate(OffsetDateTime lastModifiedDate) {
    this.lastModifiedDate = lastModifiedDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StudentMedicalNote studentMedicalNote = (StudentMedicalNote) o;
    return Objects.equals(this.object, studentMedicalNote.object) &&
        Objects.equals(this.id, studentMedicalNote.id) &&
        Objects.equals(this.status, studentMedicalNote.status) &&
        Objects.equals(this.summary, studentMedicalNote.summary) &&
        Objects.equals(this.detail, studentMedicalNote.detail) &&
        Objects.equals(this.createdById, studentMedicalNote.createdById) &&
        Objects.equals(this.lastModifiedById, studentMedicalNote.lastModifiedById) &&
        Objects.equals(this.lastModifiedDate, studentMedicalNote.lastModifiedDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(object, id, status, summary, detail, createdById, lastModifiedById, lastModifiedDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StudentMedicalNote {\n");
    
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
    sb.append("    createdById: ").append(toIndentedString(createdById)).append("\n");
    sb.append("    lastModifiedById: ").append(toIndentedString(lastModifiedById)).append("\n");
    sb.append("    lastModifiedDate: ").append(toIndentedString(lastModifiedDate)).append("\n");
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

