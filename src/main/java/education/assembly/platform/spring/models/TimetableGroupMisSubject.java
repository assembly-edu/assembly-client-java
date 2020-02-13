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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

/**
 * A subject defined within the MIS.
 */
@ApiModel(description = "A subject defined within the MIS.")

public class TimetableGroupMisSubject implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("object")
  private String object = "mis_subject";

  @JsonProperty("id")
  private Integer id = ;

  @JsonProperty("name")
  private String name = ;

  @JsonProperty("code")
  private String code = ;

  @JsonProperty("alt_name")
  private String altName = ;

  @JsonProperty("alt_code")
  private String altCode = ;

  public TimetableGroupMisSubject object(String object) {
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

  public TimetableGroupMisSubject id(Integer id) {
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

  public TimetableGroupMisSubject name(String name) {
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

  public TimetableGroupMisSubject code(String code) {
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

  public TimetableGroupMisSubject altName(String altName) {
    this.altName = altName;
    return this;
  }

   /**
   * An alternative name of the subject in the MIS
   * @return altName
  **/
  @ApiModelProperty(value = "An alternative name of the subject in the MIS")
  public String getAltName() {
    return altName;
  }

  public void setAltName(String altName) {
    this.altName = altName;
  }

  public TimetableGroupMisSubject altCode(String altCode) {
    this.altCode = altCode;
    return this;
  }

   /**
   * An alternative of the subject in the MIS
   * @return altCode
  **/
  @ApiModelProperty(value = "An alternative of the subject in the MIS")
  public String getAltCode() {
    return altCode;
  }

  public void setAltCode(String altCode) {
    this.altCode = altCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimetableGroupMisSubject timetableGroupMisSubject = (TimetableGroupMisSubject) o;
    return Objects.equals(this.object, timetableGroupMisSubject.object) &&
        Objects.equals(this.id, timetableGroupMisSubject.id) &&
        Objects.equals(this.name, timetableGroupMisSubject.name) &&
        Objects.equals(this.code, timetableGroupMisSubject.code) &&
        Objects.equals(this.altName, timetableGroupMisSubject.altName) &&
        Objects.equals(this.altCode, timetableGroupMisSubject.altCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(object, id, name, code, altName, altCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimetableGroupMisSubject {\n");
    
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    altName: ").append(toIndentedString(altName)).append("\n");
    sb.append("    altCode: ").append(toIndentedString(altCode)).append("\n");
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

