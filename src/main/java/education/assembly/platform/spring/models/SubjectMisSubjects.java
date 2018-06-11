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
 * The MIS subjects or courses that have been mapped to the subject
 */
@ApiModel(description = "The MIS subjects or courses that have been mapped to the subject")

public class SubjectMisSubjects implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("object")
  private String object = null;

  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("code")
  private String code = null;

  @JsonProperty("name")
  private String name = null;

  public SubjectMisSubjects object(String object) {
    this.object = object;
    return this;
  }

   /**
   * Object type
   * @return object
  **/
  @ApiModelProperty(example = "mis_subject", value = "Object type")
  public String getObject() {
    return object;
  }

  public void setObject(String object) {
    this.object = object;
  }

  public SubjectMisSubjects id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Internal subject ID
   * @return id
  **/
  @ApiModelProperty(example = "72", value = "Internal subject ID")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public SubjectMisSubjects code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Subject code
   * @return code
  **/
  @ApiModelProperty(example = "Ma/KStg3", value = "Subject code")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public SubjectMisSubjects name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Subject name
   * @return name
  **/
  @ApiModelProperty(example = "Mathematics (KStg3)", value = "Subject name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubjectMisSubjects subjectMisSubjects = (SubjectMisSubjects) o;
    return Objects.equals(this.object, subjectMisSubjects.object) &&
        Objects.equals(this.id, subjectMisSubjects.id) &&
        Objects.equals(this.code, subjectMisSubjects.code) &&
        Objects.equals(this.name, subjectMisSubjects.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(object, id, code, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubjectMisSubjects {\n");
    
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

