/*
 * assembly-client-java 1.2.416
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
 * A category of grades - there are four facets (&#x60;achieved&#x60;, &#x60;target&#x60;, &#x60;prediction&#x60;, &#x60;baseline&#x60;). Facets can be used to compare 2 grades of the same assessment.
 */
@ApiModel(description = "A category of grades - there are four facets (`achieved`, `target`, `prediction`, `baseline`). Facets can be used to compare 2 grades of the same assessment.")

public class Facet implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("object")
  private String object = "facet";

  @JsonProperty("id")
  private Integer id = ;

  /**
   * The name of the facet
   */
  public enum NameEnum {
    ACHIEVED("achieved"),
    
    TARGET("target"),
    
    PREDICTION("prediction"),
    
    BASELINE("baseline");

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
  private NameEnum name = ;

  public Facet object(String object) {
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

  public Facet id(Integer id) {
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

  public Facet name(NameEnum name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the facet
   * @return name
  **/
  @ApiModelProperty(value = "The name of the facet")
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
    Facet facet = (Facet) o;
    return Objects.equals(this.object, facet.object) &&
        Objects.equals(this.id, facet.id) &&
        Objects.equals(this.name, facet.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(object, id, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Facet {\n");
    
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

