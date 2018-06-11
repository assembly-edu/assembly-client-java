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
 * A student contact relationship object represents the relationship between a student and a contact.
 */
@ApiModel(description = "A student contact relationship object represents the relationship between a student and a contact.")

public class ContactRelationship implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("object")
  private String object = null;

  @JsonProperty("relationship_type")
  private String relationshipType = null;

  @JsonProperty("priority")
  private Integer priority = null;

  @JsonProperty("parental_responsibility")
  private Boolean parentalResponsibility = null;

  public ContactRelationship object(String object) {
    this.object = object;
    return this;
  }

   /**
   * Object type
   * @return object
  **/
  @ApiModelProperty(example = "relationship", value = "Object type")
  public String getObject() {
    return object;
  }

  public void setObject(String object) {
    this.object = object;
  }

  public ContactRelationship relationshipType(String relationshipType) {
    this.relationshipType = relationshipType;
    return this;
  }

   /**
   * The relationship between the contact and the student
   * @return relationshipType
  **/
  @ApiModelProperty(example = "Mother", value = "The relationship between the contact and the student")
  public String getRelationshipType() {
    return relationshipType;
  }

  public void setRelationshipType(String relationshipType) {
    this.relationshipType = relationshipType;
  }

  public ContactRelationship priority(Integer priority) {
    this.priority = priority;
    return this;
  }

   /**
   * The priority of this contact for the student
   * @return priority
  **/
  @ApiModelProperty(example = "1", value = "The priority of this contact for the student")
  public Integer getPriority() {
    return priority;
  }

  public void setPriority(Integer priority) {
    this.priority = priority;
  }

  public ContactRelationship parentalResponsibility(Boolean parentalResponsibility) {
    this.parentalResponsibility = parentalResponsibility;
    return this;
  }

   /**
   * Indicates whether the contact has parental responsibility for the student
   * @return parentalResponsibility
  **/
  @ApiModelProperty(example = "true", value = "Indicates whether the contact has parental responsibility for the student")
  public Boolean isParentalResponsibility() {
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
    ContactRelationship contactRelationship = (ContactRelationship) o;
    return Objects.equals(this.object, contactRelationship.object) &&
        Objects.equals(this.relationshipType, contactRelationship.relationshipType) &&
        Objects.equals(this.priority, contactRelationship.priority) &&
        Objects.equals(this.parentalResponsibility, contactRelationship.parentalResponsibility);
  }

  @Override
  public int hashCode() {
    return Objects.hash(object, relationshipType, priority, parentalResponsibility);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactRelationship {\n");
    
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

