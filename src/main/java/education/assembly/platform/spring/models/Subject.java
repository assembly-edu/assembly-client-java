/*
 * assembly-client-java 1.2.474
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
import education.assembly.platform.spring.models.MisSubject;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

/**
 * An Assembly Platform subject. These subjects are mapped to one or multiple subjects within a school&#39;s MIS and are used to normalise school to school variance in subject naming to a known and fixed set within the Assembly Platform.
 */
@ApiModel(description = "An Assembly Platform subject. These subjects are mapped to one or multiple subjects within a school's MIS and are used to normalise school to school variance in subject naming to a known and fixed set within the Assembly Platform.")

public class Subject implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("object")
  private String object = "subject";

  @JsonProperty("id")
  private Integer id = ;

  @JsonProperty("code")
  private String code = ;

  @JsonProperty("name")
  private String name = ;

  @JsonProperty("mis_subjects")
  private List<MisSubject> misSubjects = null;

  public Subject object(String object) {
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

  public Subject id(Integer id) {
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

  public Subject code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Shortened code of subject
   * @return code
  **/
  @ApiModelProperty(value = "Shortened code of subject")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public Subject name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Full name of subject
   * @return name
  **/
  @ApiModelProperty(value = "Full name of subject")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Subject misSubjects(List<MisSubject> misSubjects) {
    this.misSubjects = misSubjects;
    return this;
  }

  public Subject addMisSubjectsItem(MisSubject misSubjectsItem) {
    if (this.misSubjects == null) {
      this.misSubjects = new ArrayList<MisSubject>();
    }
    this.misSubjects.add(misSubjectsItem);
    return this;
  }

   /**
   * The MIS subjects that have been mapped to this Assembly Subject.
   * @return misSubjects
  **/
  @ApiModelProperty(value = "The MIS subjects that have been mapped to this Assembly Subject.")
  public List<MisSubject> getMisSubjects() {
    return misSubjects;
  }

  public void setMisSubjects(List<MisSubject> misSubjects) {
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
        Objects.equals(this.code, subject.code) &&
        Objects.equals(this.name, subject.name) &&
        Objects.equals(this.misSubjects, subject.misSubjects);
  }

  @Override
  public int hashCode() {
    return Objects.hash(object, id, code, name, misSubjects);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Subject {\n");
    
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

