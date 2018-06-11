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
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

/**
 * The assessment is the grouping that knits together a range of concepts. The name of the assessment also refers to the source of the result (for example, a Key Stage national assessment, or a standardised assessment provider).
 */
@ApiModel(description = "The assessment is the grouping that knits together a range of concepts. The name of the assessment also refers to the source of the result (for example, a Key Stage national assessment, or a standardised assessment provider).")

public class Assessment implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("object")
  private String object = null;

  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("family_id")
  private Integer familyId = null;

  @JsonProperty("family_name")
  private String familyName = null;

  @JsonProperty("mis_mappings")
  private List<String> misMappings = null;

  public Assessment object(String object) {
    this.object = object;
    return this;
  }

   /**
   * Object type
   * @return object
  **/
  @ApiModelProperty(example = "assessment", value = "Object type")
  public String getObject() {
    return object;
  }

  public void setObject(String object) {
    this.object = object;
  }

  public Assessment id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Internal stable ID given to all assessments on the Platform
   * @return id
  **/
  @ApiModelProperty(example = "1", value = "Internal stable ID given to all assessments on the Platform")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Assessment name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the assessment
   * @return name
  **/
  @ApiModelProperty(example = "Standardised Assessment - Standardised Score", value = "The name of the assessment")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Assessment familyId(Integer familyId) {
    this.familyId = familyId;
    return this;
  }

   /**
   * Internal stable ID given to all assessment families on the Platform
   * @return familyId
  **/
  @ApiModelProperty(example = "2", value = "Internal stable ID given to all assessment families on the Platform")
  public Integer getFamilyId() {
    return familyId;
  }

  public void setFamilyId(Integer familyId) {
    this.familyId = familyId;
  }

  public Assessment familyName(String familyName) {
    this.familyName = familyName;
    return this;
  }

   /**
   * The name of the assessment family
   * @return familyName
  **/
  @ApiModelProperty(example = "Standardised Assessment Provider 1", value = "The name of the assessment family")
  public String getFamilyName() {
    return familyName;
  }

  public void setFamilyName(String familyName) {
    this.familyName = familyName;
  }

  public Assessment misMappings(List<String> misMappings) {
    this.misMappings = misMappings;
    return this;
  }

  public Assessment addMisMappingsItem(String misMappingsItem) {
    if (this.misMappings == null) {
      this.misMappings = new ArrayList<String>();
    }
    this.misMappings.add(misMappingsItem);
    return this;
  }

   /**
   * Names of any MIS assessments (e.g. SIMS Aspects) that have been mapped to the assessment
   * @return misMappings
  **/
  @ApiModelProperty(value = "Names of any MIS assessments (e.g. SIMS Aspects) that have been mapped to the assessment")
  public List<String> getMisMappings() {
    return misMappings;
  }

  public void setMisMappings(List<String> misMappings) {
    this.misMappings = misMappings;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Assessment assessment = (Assessment) o;
    return Objects.equals(this.object, assessment.object) &&
        Objects.equals(this.id, assessment.id) &&
        Objects.equals(this.name, assessment.name) &&
        Objects.equals(this.familyId, assessment.familyId) &&
        Objects.equals(this.familyName, assessment.familyName) &&
        Objects.equals(this.misMappings, assessment.misMappings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(object, id, name, familyId, familyName, misMappings);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Assessment {\n");
    
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    familyId: ").append(toIndentedString(familyId)).append("\n");
    sb.append("    familyName: ").append(toIndentedString(familyName)).append("\n");
    sb.append("    misMappings: ").append(toIndentedString(misMappings)).append("\n");
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

