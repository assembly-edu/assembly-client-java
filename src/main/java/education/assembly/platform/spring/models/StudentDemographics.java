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
import education.assembly.platform.spring.models.SenNeed;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

/**
 * StudentDemographics
 */

public class StudentDemographics implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("ethnicity_code")
  private String ethnicityCode = ;

  @JsonProperty("ethnicity_group")
  private String ethnicityGroup = ;

  @JsonProperty("gender")
  private String gender = ;

  @JsonProperty("is_pp")
  private Boolean isPp = ;

  @JsonProperty("is_eal")
  private Boolean isEal = ;

  @JsonProperty("sen_category")
  private String senCategory = ;

  @JsonProperty("country_of_birth")
  private String countryOfBirth = ;

  @JsonProperty("nationalities")
  private List<String> nationalities = null;

  @JsonProperty("fsm_review_date")
  private String fsmReviewDate = ;

  @JsonProperty("is_fsm")
  private Boolean isFsm = ;

  @JsonProperty("is_fsm6")
  private Boolean isFsm6 = ;

  @JsonProperty("looked_after")
  private Boolean lookedAfter = ;

  @JsonProperty("in_care")
  private Boolean inCare = ;

  @JsonProperty("ever_in_care")
  private Boolean everInCare = ;

  @JsonProperty("service_child")
  private Boolean serviceChild = ;

  @JsonProperty("sen_needs")
  private List<SenNeed> senNeeds = null;

  public StudentDemographics ethnicityCode(String ethnicityCode) {
    this.ethnicityCode = ethnicityCode;
    return this;
  }

   /**
   * Get ethnicityCode
   * @return ethnicityCode
  **/
  @ApiModelProperty(value = "")
  public String getEthnicityCode() {
    return ethnicityCode;
  }

  public void setEthnicityCode(String ethnicityCode) {
    this.ethnicityCode = ethnicityCode;
  }

  public StudentDemographics ethnicityGroup(String ethnicityGroup) {
    this.ethnicityGroup = ethnicityGroup;
    return this;
  }

   /**
   * Get ethnicityGroup
   * @return ethnicityGroup
  **/
  @ApiModelProperty(value = "")
  public String getEthnicityGroup() {
    return ethnicityGroup;
  }

  public void setEthnicityGroup(String ethnicityGroup) {
    this.ethnicityGroup = ethnicityGroup;
  }

  public StudentDemographics gender(String gender) {
    this.gender = gender;
    return this;
  }

   /**
   * Get gender
   * @return gender
  **/
  @ApiModelProperty(value = "")
  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public StudentDemographics isPp(Boolean isPp) {
    this.isPp = isPp;
    return this;
  }

   /**
   * Get isPp
   * @return isPp
  **/
  @ApiModelProperty(value = "")
  public Boolean isgetIsPp() {
    return isPp;
  }

  public void setIsPp(Boolean isPp) {
    this.isPp = isPp;
  }

  public StudentDemographics isEal(Boolean isEal) {
    this.isEal = isEal;
    return this;
  }

   /**
   * Get isEal
   * @return isEal
  **/
  @ApiModelProperty(value = "")
  public Boolean isgetIsEal() {
    return isEal;
  }

  public void setIsEal(Boolean isEal) {
    this.isEal = isEal;
  }

  public StudentDemographics senCategory(String senCategory) {
    this.senCategory = senCategory;
    return this;
  }

   /**
   * Get senCategory
   * @return senCategory
  **/
  @ApiModelProperty(value = "")
  public String getSenCategory() {
    return senCategory;
  }

  public void setSenCategory(String senCategory) {
    this.senCategory = senCategory;
  }

  public StudentDemographics countryOfBirth(String countryOfBirth) {
    this.countryOfBirth = countryOfBirth;
    return this;
  }

   /**
   * Get countryOfBirth
   * @return countryOfBirth
  **/
  @ApiModelProperty(value = "")
  public String getCountryOfBirth() {
    return countryOfBirth;
  }

  public void setCountryOfBirth(String countryOfBirth) {
    this.countryOfBirth = countryOfBirth;
  }

  public StudentDemographics nationalities(List<String> nationalities) {
    this.nationalities = nationalities;
    return this;
  }

  public StudentDemographics addNationalitiesItem(String nationalitiesItem) {
    if (this.nationalities == null) {
      this.nationalities = new ArrayList<String>();
    }
    this.nationalities.add(nationalitiesItem);
    return this;
  }

   /**
   * Get nationalities
   * @return nationalities
  **/
  @ApiModelProperty(value = "")
  public List<String> getNationalities() {
    return nationalities;
  }

  public void setNationalities(List<String> nationalities) {
    this.nationalities = nationalities;
  }

  public StudentDemographics fsmReviewDate(String fsmReviewDate) {
    this.fsmReviewDate = fsmReviewDate;
    return this;
  }

   /**
   * Get fsmReviewDate
   * @return fsmReviewDate
  **/
  @ApiModelProperty(value = "")
  public String getFsmReviewDate() {
    return fsmReviewDate;
  }

  public void setFsmReviewDate(String fsmReviewDate) {
    this.fsmReviewDate = fsmReviewDate;
  }

  public StudentDemographics isFsm(Boolean isFsm) {
    this.isFsm = isFsm;
    return this;
  }

   /**
   * Get isFsm
   * @return isFsm
  **/
  @ApiModelProperty(value = "")
  public Boolean isgetIsFsm() {
    return isFsm;
  }

  public void setIsFsm(Boolean isFsm) {
    this.isFsm = isFsm;
  }

  public StudentDemographics isFsm6(Boolean isFsm6) {
    this.isFsm6 = isFsm6;
    return this;
  }

   /**
   * Get isFsm6
   * @return isFsm6
  **/
  @ApiModelProperty(value = "")
  public Boolean isgetIsFsm6() {
    return isFsm6;
  }

  public void setIsFsm6(Boolean isFsm6) {
    this.isFsm6 = isFsm6;
  }

  public StudentDemographics lookedAfter(Boolean lookedAfter) {
    this.lookedAfter = lookedAfter;
    return this;
  }

   /**
   * Get lookedAfter
   * @return lookedAfter
  **/
  @ApiModelProperty(value = "")
  public Boolean isgetLookedAfter() {
    return lookedAfter;
  }

  public void setLookedAfter(Boolean lookedAfter) {
    this.lookedAfter = lookedAfter;
  }

  public StudentDemographics inCare(Boolean inCare) {
    this.inCare = inCare;
    return this;
  }

   /**
   * Get inCare
   * @return inCare
  **/
  @ApiModelProperty(value = "")
  public Boolean isgetInCare() {
    return inCare;
  }

  public void setInCare(Boolean inCare) {
    this.inCare = inCare;
  }

  public StudentDemographics everInCare(Boolean everInCare) {
    this.everInCare = everInCare;
    return this;
  }

   /**
   * Get everInCare
   * @return everInCare
  **/
  @ApiModelProperty(value = "")
  public Boolean isgetEverInCare() {
    return everInCare;
  }

  public void setEverInCare(Boolean everInCare) {
    this.everInCare = everInCare;
  }

  public StudentDemographics serviceChild(Boolean serviceChild) {
    this.serviceChild = serviceChild;
    return this;
  }

   /**
   * Get serviceChild
   * @return serviceChild
  **/
  @ApiModelProperty(value = "")
  public Boolean isgetServiceChild() {
    return serviceChild;
  }

  public void setServiceChild(Boolean serviceChild) {
    this.serviceChild = serviceChild;
  }

  public StudentDemographics senNeeds(List<SenNeed> senNeeds) {
    this.senNeeds = senNeeds;
    return this;
  }

  public StudentDemographics addSenNeedsItem(SenNeed senNeedsItem) {
    if (this.senNeeds == null) {
      this.senNeeds = new ArrayList<SenNeed>();
    }
    this.senNeeds.add(senNeedsItem);
    return this;
  }

   /**
   * Get senNeeds
   * @return senNeeds
  **/
  @ApiModelProperty(value = "")
  public List<SenNeed> getSenNeeds() {
    return senNeeds;
  }

  public void setSenNeeds(List<SenNeed> senNeeds) {
    this.senNeeds = senNeeds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StudentDemographics studentDemographics = (StudentDemographics) o;
    return Objects.equals(this.ethnicityCode, studentDemographics.ethnicityCode) &&
        Objects.equals(this.ethnicityGroup, studentDemographics.ethnicityGroup) &&
        Objects.equals(this.gender, studentDemographics.gender) &&
        Objects.equals(this.isPp, studentDemographics.isPp) &&
        Objects.equals(this.isEal, studentDemographics.isEal) &&
        Objects.equals(this.senCategory, studentDemographics.senCategory) &&
        Objects.equals(this.countryOfBirth, studentDemographics.countryOfBirth) &&
        Objects.equals(this.nationalities, studentDemographics.nationalities) &&
        Objects.equals(this.fsmReviewDate, studentDemographics.fsmReviewDate) &&
        Objects.equals(this.isFsm, studentDemographics.isFsm) &&
        Objects.equals(this.isFsm6, studentDemographics.isFsm6) &&
        Objects.equals(this.lookedAfter, studentDemographics.lookedAfter) &&
        Objects.equals(this.inCare, studentDemographics.inCare) &&
        Objects.equals(this.everInCare, studentDemographics.everInCare) &&
        Objects.equals(this.serviceChild, studentDemographics.serviceChild) &&
        Objects.equals(this.senNeeds, studentDemographics.senNeeds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ethnicityCode, ethnicityGroup, gender, isPp, isEal, senCategory, countryOfBirth, nationalities, fsmReviewDate, isFsm, isFsm6, lookedAfter, inCare, everInCare, serviceChild, senNeeds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StudentDemographics {\n");
    
    sb.append("    ethnicityCode: ").append(toIndentedString(ethnicityCode)).append("\n");
    sb.append("    ethnicityGroup: ").append(toIndentedString(ethnicityGroup)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    isPp: ").append(toIndentedString(isPp)).append("\n");
    sb.append("    isEal: ").append(toIndentedString(isEal)).append("\n");
    sb.append("    senCategory: ").append(toIndentedString(senCategory)).append("\n");
    sb.append("    countryOfBirth: ").append(toIndentedString(countryOfBirth)).append("\n");
    sb.append("    nationalities: ").append(toIndentedString(nationalities)).append("\n");
    sb.append("    fsmReviewDate: ").append(toIndentedString(fsmReviewDate)).append("\n");
    sb.append("    isFsm: ").append(toIndentedString(isFsm)).append("\n");
    sb.append("    isFsm6: ").append(toIndentedString(isFsm6)).append("\n");
    sb.append("    lookedAfter: ").append(toIndentedString(lookedAfter)).append("\n");
    sb.append("    inCare: ").append(toIndentedString(inCare)).append("\n");
    sb.append("    everInCare: ").append(toIndentedString(everInCare)).append("\n");
    sb.append("    serviceChild: ").append(toIndentedString(serviceChild)).append("\n");
    sb.append("    senNeeds: ").append(toIndentedString(senNeeds)).append("\n");
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

