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
import education.assembly.platform.spring.models.SubjectMisSubjects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

/**
 * A subject object represents an Assembly Platform subject. These subjects are mapped to one or multiple subjects within a school&#39;s MIS and are used to normalise school to school variance in subject naming to a known and fixed set within the Assembly Platform.
 */
@ApiModel(description = "A subject object represents an Assembly Platform subject. These subjects are mapped to one or multiple subjects within a school's MIS and are used to normalise school to school variance in subject naming to a known and fixed set within the Assembly Platform.")

public class Subject implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("object")
  private String object = null;

  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("code")
  private String code = null;

  @JsonProperty("mis_subjects")
  private SubjectMisSubjects misSubjects = null;

  public Subject object(String object) {
    this.object = object;
    return this;
  }

   /**
   * Object type
   * @return object
  **/
  @ApiModelProperty(example = "subject", value = "Object type")
  public String getObject() {
    return object;
  }

  public void setObject(String object) {
    this.object = object;
  }

  public Subject id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Internal stable ID given to all subjects in the Platform
   * @return id
  **/
  @ApiModelProperty(example = "22", value = "Internal stable ID given to all subjects in the Platform")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Subject name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Full name of subject 
   * @return name
  **/
  @ApiModelProperty(example = "Mathematics", value = "Full name of subject ")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Subject code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Shortened code of subject
   * @return code
  **/
  @ApiModelProperty(example = "MAT", value = "Shortened code of subject")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public Subject misSubjects(SubjectMisSubjects misSubjects) {
    this.misSubjects = misSubjects;
    return this;
  }

   /**
   * Get misSubjects
   * @return misSubjects
  **/
  @ApiModelProperty(value = "")
  public SubjectMisSubjects getMisSubjects() {
    return misSubjects;
  }

  public void setMisSubjects(SubjectMisSubjects misSubjects) {
    this.misSubjects = misSubjects;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Subject subject = (Subject) o;
    return Objects.equals(this.object, subject.object) &&
        Objects.equals(this.id, subject.id) &&
        Objects.equals(this.name, subject.name) &&
        Objects.equals(this.code, subject.code) &&
        Objects.equals(this.misSubjects, subject.misSubjects);
  }

  @Override
  public int hashCode() {
    return Objects.hash(object, id, name, code, misSubjects);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Subject {\n");
    
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    misSubjects: ").append(toIndentedString(misSubjects)).append("\n");
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

