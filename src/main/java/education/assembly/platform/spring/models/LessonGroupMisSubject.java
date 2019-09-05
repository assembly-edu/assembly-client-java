/*
 * assembly-client-java 1.2.424
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
 * A subject defined within the MIS.
 */
@ApiModel(description = "A subject defined within the MIS.")

public class LessonGroupMisSubject implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("object")
  private String object = "mis_subject";

  @JsonProperty("id")
  private Integer id = ;

  @JsonProperty("name")
  private String name = ;

  @JsonProperty("code")
  private String code = ;

  public LessonGroupMisSubject object(String object) {
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

  public LessonGroupMisSubject id(Integer id) {
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

  public LessonGroupMisSubject name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the subject in the MIS
   * @return name
  **/
  @ApiModelProperty(value = "The name of the subject in the MIS")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LessonGroupMisSubject code(String code) {
    this.code = code;
    return this;
  }

   /**
   * The code of the subject in the MIS
   * @return code
  **/
  @ApiModelProperty(value = "The code of the subject in the MIS")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LessonGroupMisSubject lessonGroupMisSubject = (LessonGroupMisSubject) o;
    return Objects.equals(this.object, lessonGroupMisSubject.object) &&
        Objects.equals(this.id, lessonGroupMisSubject.id) &&
        Objects.equals(this.name, lessonGroupMisSubject.name) &&
        Objects.equals(this.code, lessonGroupMisSubject.code);
  }

  @Override
  public int hashCode() {
    return Objects.hash(object, id, name, code);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LessonGroupMisSubject {\n");
    
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
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

