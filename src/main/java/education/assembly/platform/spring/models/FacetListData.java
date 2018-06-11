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
 * All results belong to one of four facets, with each facet reflecting a different type of grade. Facets can be used to compare 2 grades of the same assessment.
 */
@ApiModel(description = "All results belong to one of four facets, with each facet reflecting a different type of grade. Facets can be used to compare 2 grades of the same assessment.")

public class FacetListData implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("object")
  private String object = null;

  @JsonProperty("id")
  private Integer id = null;

  /**
   * The name of the facet *Values*  |Value|Description| |---|---| |&#x60;target&#x60;|Result has been set as a target to achieve| |&#x60;achieved&#x60;|Result has been achieved| |&#x60;baseline&#x60;|Result is a baseline comparison value| |&#x60;prediction&#x60;|Result is a prediction| 
   */
  public enum NameEnum {
    TARGET("target"),
    
    ACHIEVED("achieved"),
    
    BASELINE("baseline"),
    
    PREDICTION("prediction");

    private String value;

    NameEnum(String value) {
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
    public static NameEnum fromValue(String text) {
      for (NameEnum b : NameEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("name")
  private NameEnum name = null;

  public FacetListData object(String object) {
    this.object = object;
    return this;
  }

   /**
   * Object type
   * @return object
  **/
  @ApiModelProperty(example = "facet", value = "Object type")
  public String getObject() {
    return object;
  }

  public void setObject(String object) {
    this.object = object;
  }

  public FacetListData id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Internal stable ID given to all facets on the Platform
   * @return id
  **/
  @ApiModelProperty(example = "6", value = "Internal stable ID given to all facets on the Platform")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public FacetListData name(NameEnum name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the facet *Values*  |Value|Description| |---|---| |&#x60;target&#x60;|Result has been set as a target to achieve| |&#x60;achieved&#x60;|Result has been achieved| |&#x60;baseline&#x60;|Result is a baseline comparison value| |&#x60;prediction&#x60;|Result is a prediction| 
   * @return name
  **/
  @ApiModelProperty(example = "baseline", value = "The name of the facet *Values*  |Value|Description| |---|---| |`target`|Result has been set as a target to achieve| |`achieved`|Result has been achieved| |`baseline`|Result is a baseline comparison value| |`prediction`|Result is a prediction| ")
  public NameEnum getName() {
    return name;
  }

  public void setName(NameEnum name) {
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
    FacetListData facetListData = (FacetListData) o;
    return Objects.equals(this.object, facetListData.object) &&
        Objects.equals(this.id, facetListData.id) &&
        Objects.equals(this.name, facetListData.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(object, id, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FacetListData {\n");
    
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

