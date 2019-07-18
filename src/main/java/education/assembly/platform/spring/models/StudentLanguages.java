/*
 * assembly-client-java 1.2.376
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
 * Information about a student&#39;s languages (this will only be returned if &#x60;&amp;languages&#x3D;true&#x60; is included in your request)
 */
@ApiModel(description = "Information about a student's languages (this will only be returned if `&languages=true` is included in your request)")

public class StudentLanguages implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("object")
  private String object = "student_languages";

  @JsonProperty("home_language_code")
  private String homeLanguageCode = ;

  @JsonProperty("home_language_name")
  private String homeLanguageName = ;

  @JsonProperty("first_language_code")
  private String firstLanguageCode = ;

  @JsonProperty("first_language_name")
  private String firstLanguageName = ;

  @JsonProperty("proficiency_in_english_code")
  private String proficiencyInEnglishCode = ;

  @JsonProperty("proficiency_in_english_name")
  private String proficiencyInEnglishName = ;

  public StudentLanguages object(String object) {
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

  public StudentLanguages homeLanguageCode(String homeLanguageCode) {
    this.homeLanguageCode = homeLanguageCode;
    return this;
  }

   /**
   * The code of a student&#39;s home language
   * @return homeLanguageCode
  **/
  @ApiModelProperty(value = "The code of a student's home language")
  public String getHomeLanguageCode() {
    return homeLanguageCode;
  }

  public void setHomeLanguageCode(String homeLanguageCode) {
    this.homeLanguageCode = homeLanguageCode;
  }

  public StudentLanguages homeLanguageName(String homeLanguageName) {
    this.homeLanguageName = homeLanguageName;
    return this;
  }

   /**
   * The name of a student&#39;s home language
   * @return homeLanguageName
  **/
  @ApiModelProperty(value = "The name of a student's home language")
  public String getHomeLanguageName() {
    return homeLanguageName;
  }

  public void setHomeLanguageName(String homeLanguageName) {
    this.homeLanguageName = homeLanguageName;
  }

  public StudentLanguages firstLanguageCode(String firstLanguageCode) {
    this.firstLanguageCode = firstLanguageCode;
    return this;
  }

   /**
   * The code of a student&#39;s first language
   * @return firstLanguageCode
  **/
  @ApiModelProperty(value = "The code of a student's first language")
  public String getFirstLanguageCode() {
    return firstLanguageCode;
  }

  public void setFirstLanguageCode(String firstLanguageCode) {
    this.firstLanguageCode = firstLanguageCode;
  }

  public StudentLanguages firstLanguageName(String firstLanguageName) {
    this.firstLanguageName = firstLanguageName;
    return this;
  }

   /**
   * The name of a student&#39;s first language
   * @return firstLanguageName
  **/
  @ApiModelProperty(value = "The name of a student's first language")
  public String getFirstLanguageName() {
    return firstLanguageName;
  }

  public void setFirstLanguageName(String firstLanguageName) {
    this.firstLanguageName = firstLanguageName;
  }

  public StudentLanguages proficiencyInEnglishCode(String proficiencyInEnglishCode) {
    this.proficiencyInEnglishCode = proficiencyInEnglishCode;
    return this;
  }

   /**
   * A student&#39;s proficiency in English code
   * @return proficiencyInEnglishCode
  **/
  @ApiModelProperty(value = "A student's proficiency in English code")
  public String getProficiencyInEnglishCode() {
    return proficiencyInEnglishCode;
  }

  public void setProficiencyInEnglishCode(String proficiencyInEnglishCode) {
    this.proficiencyInEnglishCode = proficiencyInEnglishCode;
  }

  public StudentLanguages proficiencyInEnglishName(String proficiencyInEnglishName) {
    this.proficiencyInEnglishName = proficiencyInEnglishName;
    return this;
  }

   /**
   * A student&#39;s proficiency in English name
   * @return proficiencyInEnglishName
  **/
  @ApiModelProperty(value = "A student's proficiency in English name")
  public String getProficiencyInEnglishName() {
    return proficiencyInEnglishName;
  }

  public void setProficiencyInEnglishName(String proficiencyInEnglishName) {
    this.proficiencyInEnglishName = proficiencyInEnglishName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StudentLanguages studentLanguages = (StudentLanguages) o;
    return Objects.equals(this.object, studentLanguages.object) &&
        Objects.equals(this.homeLanguageCode, studentLanguages.homeLanguageCode) &&
        Objects.equals(this.homeLanguageName, studentLanguages.homeLanguageName) &&
        Objects.equals(this.firstLanguageCode, studentLanguages.firstLanguageCode) &&
        Objects.equals(this.firstLanguageName, studentLanguages.firstLanguageName) &&
        Objects.equals(this.proficiencyInEnglishCode, studentLanguages.proficiencyInEnglishCode) &&
        Objects.equals(this.proficiencyInEnglishName, studentLanguages.proficiencyInEnglishName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(object, homeLanguageCode, homeLanguageName, firstLanguageCode, firstLanguageName, proficiencyInEnglishCode, proficiencyInEnglishName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StudentLanguages {\n");
    
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    homeLanguageCode: ").append(toIndentedString(homeLanguageCode)).append("\n");
    sb.append("    homeLanguageName: ").append(toIndentedString(homeLanguageName)).append("\n");
    sb.append("    firstLanguageCode: ").append(toIndentedString(firstLanguageCode)).append("\n");
    sb.append("    firstLanguageName: ").append(toIndentedString(firstLanguageName)).append("\n");
    sb.append("    proficiencyInEnglishCode: ").append(toIndentedString(proficiencyInEnglishCode)).append("\n");
    sb.append("    proficiencyInEnglishName: ").append(toIndentedString(proficiencyInEnglishName)).append("\n");
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

