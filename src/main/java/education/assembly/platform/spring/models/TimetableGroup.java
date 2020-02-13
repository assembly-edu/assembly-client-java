/*
 * assembly-client-java 1.2.463
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
import education.assembly.platform.spring.models.MisSubjectSubject;
import education.assembly.platform.spring.models.TimetableGroupMisSubject;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

/**
 * A grouping of students. A teaching or registration group for example.
 */
@ApiModel(description = "A grouping of students. A teaching or registration group for example.")

public class TimetableGroup implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("object")
  private String object = "group";

  @JsonProperty("id")
  private Integer id = ;

  @JsonProperty("name")
  private String name = ;

  @JsonProperty("code")
  private String code = ;

  /**
   * The type of group
   */
  public enum TypeEnum {
    YEARGROUP("YearGroup"),
    
    TEACHINGGROUP("TeachingGroup"),
    
    REGISTRATIONGROUP("RegistrationGroup"),
    
    HOUSEGROUP("HouseGroup"),
    
    NONTEACHINGGROUP("NonTeachingGroup");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("type")
  private TypeEnum type = ;

  @JsonProperty("mis_subject")
  private TimetableGroupMisSubject misSubject = null;

  @JsonProperty("subject")
  private MisSubjectSubject subject = null;

  public TimetableGroup object(String object) {
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

  public TimetableGroup id(Integer id) {
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

  public TimetableGroup name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the group
   * @return name
  **/
  @ApiModelProperty(value = "Name of the group")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TimetableGroup code(String code) {
    this.code = code;
    return this;
  }

   /**
   * The code of the year that the group belongs to
   * @return code
  **/
  @ApiModelProperty(value = "The code of the year that the group belongs to")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public TimetableGroup type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * The type of group
   * @return type
  **/
  @ApiModelProperty(value = "The type of group")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public TimetableGroup misSubject(TimetableGroupMisSubject misSubject) {
    this.misSubject = misSubject;
    return this;
  }

   /**
   * Get misSubject
   * @return misSubject
  **/
  @ApiModelProperty(value = "")
  public TimetableGroupMisSubject getMisSubject() {
    return misSubject;
  }

  public void setMisSubject(TimetableGroupMisSubject misSubject) {
    this.misSubject = misSubject;
  }

  public TimetableGroup subject(MisSubjectSubject subject) {
    this.subject = subject;
    return this;
  }

   /**
   * Get subject
   * @return subject
  **/
  @ApiModelProperty(value = "")
  public MisSubjectSubject getSubject() {
    return subject;
  }

  public void setSubject(MisSubjectSubject subject) {
    this.subject = subject;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimetableGroup timetableGroup = (TimetableGroup) o;
    return Objects.equals(this.object, timetableGroup.object) &&
        Objects.equals(this.id, timetableGroup.id) &&
        Objects.equals(this.name, timetableGroup.name) &&
        Objects.equals(this.code, timetableGroup.code) &&
        Objects.equals(this.type, timetableGroup.type) &&
        Objects.equals(this.misSubject, timetableGroup.misSubject) &&
        Objects.equals(this.subject, timetableGroup.subject);
  }

  @Override
  public int hashCode() {
    return Objects.hash(object, id, name, code, type, misSubject, subject);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimetableGroup {\n");
    
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    misSubject: ").append(toIndentedString(misSubject)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
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

