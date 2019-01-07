/*
 * assembly-client-java 1.1.0
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
 * StudentLanguages
 */

public class StudentLanguages implements Serializable {
  private static final long serialVersionUID = 1L;

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

  public StudentLanguages homeLanguageCode(String homeLanguageCode) {
    this.homeLanguageCode = homeLanguageCode;
    return this;
  }

   /**
   * Get homeLanguageCode
   * @return homeLanguageCode
  **/
  @ApiModelProperty(value = "")
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
   * Get homeLanguageName
   * @return homeLanguageName
  **/
  @ApiModelProperty(value = "")
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
   * Get firstLanguageCode
   * @return firstLanguageCode
  **/
  @ApiModelProperty(value = "")
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
   * Get firstLanguageName
   * @return firstLanguageName
  **/
  @ApiModelProperty(value = "")
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
   * Get proficiencyInEnglishCode
   * @return proficiencyInEnglishCode
  **/
  @ApiModelProperty(value = "")
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
   * Get proficiencyInEnglishName
   * @return proficiencyInEnglishName
  **/
  @ApiModelProperty(value = "")
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
    return Objects.equals(this.homeLanguageCode, studentLanguages.homeLanguageCode) &&
        Objects.equals(this.homeLanguageName, studentLanguages.homeLanguageName) &&
        Objects.equals(this.firstLanguageCode, studentLanguages.firstLanguageCode) &&
        Objects.equals(this.firstLanguageName, studentLanguages.firstLanguageName) &&
        Objects.equals(this.proficiencyInEnglishCode, studentLanguages.proficiencyInEnglishCode) &&
        Objects.equals(this.proficiencyInEnglishName, studentLanguages.proficiencyInEnglishName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(homeLanguageCode, homeLanguageName, firstLanguageCode, firstLanguageName, proficiencyInEnglishCode, proficiencyInEnglishName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StudentLanguages {\n");
    
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

