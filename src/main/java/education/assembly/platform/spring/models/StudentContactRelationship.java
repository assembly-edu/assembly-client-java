/*
 * assembly-client-java 1.2.384
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
 * The relationship between a student and a contact person.
 */
@ApiModel(description = "The relationship between a student and a contact person.")

public class StudentContactRelationship implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("object")
  private String object = "relationship";

  @JsonProperty("relationship_type")
  private String relationshipType = ;

  @JsonProperty("priority")
  private Integer priority = ;

  @JsonProperty("parental_responsibility")
  private Boolean parentalResponsibility = ;

  public StudentContactRelationship object(String object) {
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

  public StudentContactRelationship relationshipType(String relationshipType) {
    this.relationshipType = relationshipType;
    return this;
  }

   /**
   * The (unnormalized) relationship between the contact and the student
   * @return relationshipType
  **/
  @ApiModelProperty(value = "The (unnormalized) relationship between the contact and the student")
  public String getRelationshipType() {
    return relationshipType;
  }

  public void setRelationshipType(String relationshipType) {
    this.relationshipType = relationshipType;
  }

  public StudentContactRelationship priority(Integer priority) {
    this.priority = priority;
    return this;
  }

   /**
   * The priority of this contact for the student
   * @return priority
  **/
  @ApiModelProperty(value = "The priority of this contact for the student")
  public Integer getPriority() {
    return priority;
  }

  public void setPriority(Integer priority) {
    this.priority = priority;
  }

  public StudentContactRelationship parentalResponsibility(Boolean parentalResponsibility) {
    this.parentalResponsibility = parentalResponsibility;
    return this;
  }

   /**
   * Indicates whether the contact has parental responsibility for the student, they are a parent or guardian for example
   * @return parentalResponsibility
  **/
  @ApiModelProperty(value = "Indicates whether the contact has parental responsibility for the student, they are a parent or guardian for example")
  public Boolean isgetParentalResponsibility() {
    return parentalResponsibility;
  }

  public void setParentalResponsibility(Boolean parentalResponsibility) {
    this.parentalResponsibility = parentalResponsibility;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StudentContactRelationship studentContactRelationship = (StudentContactRelationship) o;
    return Objects.equals(this.object, studentContactRelationship.object) &&
        Objects.equals(this.relationshipType, studentContactRelationship.relationshipType) &&
        Objects.equals(this.priority, studentContactRelationship.priority) &&
        Objects.equals(this.parentalResponsibility, studentContactRelationship.parentalResponsibility);
  }

  @Override
  public int hashCode() {
    return Objects.hash(object, relationshipType, priority, parentalResponsibility);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StudentContactRelationship {\n");
    
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    relationshipType: ").append(toIndentedString(relationshipType)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    parentalResponsibility: ").append(toIndentedString(parentalResponsibility)).append("\n");
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

