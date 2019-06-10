/*
 * assembly-client-java 1.2.363
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
 * Demographic information about the student.
 */
@ApiModel(description = "Demographic information about the student.")

public class StudentDemographics implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("object")
  private String object = "student_demographics";

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

  @JsonProperty("in_care")
  private Boolean inCare = ;

  @JsonProperty("ever_in_care")
  private Boolean everInCare = ;

  @JsonProperty("service_child")
  private Boolean serviceChild = ;

  @JsonProperty("sen_needs")
  private List<SenNeed> senNeeds = null;

  public StudentDemographics object(String object) {
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

  public StudentDemographics ethnicityCode(String ethnicityCode) {
    this.ethnicityCode = ethnicityCode;
    return this;
  }

   /**
   * A detailed, Dfe standardised way of categorising the ethnicity of a student
   * @return ethnicityCode
  **/
  @ApiModelProperty(value = "A detailed, Dfe standardised way of categorising the ethnicity of a student")
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
   * A broader categorisation of ethnicity that is standardised across the country, with all ethnicity codes grouped in to 8 sections
   * @return ethnicityGroup
  **/
  @ApiModelProperty(value = "A broader categorisation of ethnicity that is standardised across the country, with all ethnicity codes grouped in to 8 sections")
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
   * The gender of the student
   * @return gender
  **/
  @ApiModelProperty(value = "The gender of the student")
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
   * Pupil Premium (PP) - schools receive extra funding for students who qualify as Pupil Premium. The includes any student who has qualified for Free School Meals (FSM) in the last 6 years, and any student in local-authority care
   * @return isPp
  **/
  @ApiModelProperty(value = "Pupil Premium (PP) - schools receive extra funding for students who qualify as Pupil Premium. The includes any student who has qualified for Free School Meals (FSM) in the last 6 years, and any student in local-authority care")
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
   * English as an Additional Language (EAL) - this field will be true for a student whose first language is not English
   * @return isEal
  **/
  @ApiModelProperty(value = "English as an Additional Language (EAL) - this field will be true for a student whose first language is not English")
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
   * Special Education Need (SEN) - indicates a student has learning difficulties and requires special education provision. Can be null for those not eligible
   * @return senCategory
  **/
  @ApiModelProperty(value = "Special Education Need (SEN) - indicates a student has learning difficulties and requires special education provision. Can be null for those not eligible")
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
   * The country of birth of the student
   * @return countryOfBirth
  **/
  @ApiModelProperty(value = "The country of birth of the student")
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
   * The nationality or nationalities of the student
   * @return nationalities
  **/
  @ApiModelProperty(value = "The nationality or nationalities of the student")
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
   * Free school meal review date -Review date for pupil&#39;s free school meal eligibility
   * @return fsmReviewDate
  **/
  @ApiModelProperty(value = "Free school meal review date -Review date for pupil's free school meal eligibility")
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
   * Free School Meals (FSM) - indicates if the student is eligible for free school meals
   * @return isFsm
  **/
  @ApiModelProperty(value = "Free School Meals (FSM) - indicates if the student is eligible for free school meals")
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
   * Free School Meals 6 (FSM6) - indicates if the student has been eligible for free school meals within the last 6 years
   * @return isFsm6
  **/
  @ApiModelProperty(value = "Free School Meals 6 (FSM6) - indicates if the student has been eligible for free school meals within the last 6 years")
  public Boolean isgetIsFsm6() {
    return isFsm6;
  }

  public void setIsFsm6(Boolean isFsm6) {
    this.isFsm6 = isFsm6;
  }

  public StudentDemographics inCare(Boolean inCare) {
    this.inCare = inCare;
    return this;
  }

   /**
   * Looked after status - indicates whether the student is &#39;looked after&#39; by the local authority
   * @return inCare
  **/
  @ApiModelProperty(value = "Looked after status - indicates whether the student is 'looked after' by the local authority")
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
   * Ever in care status - indicates whether the student is either currently &#39;looked after&#39;, or has been at any point in the past
   * @return everInCare
  **/
  @ApiModelProperty(value = "Ever in care status - indicates whether the student is either currently 'looked after', or has been at any point in the past")
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
   * Service Child - indicates whether the student has parent(s) who are Service personnel serving in regular military units of all forces and exercising parental care and responsibility
   * @return serviceChild
  **/
  @ApiModelProperty(value = "Service Child - indicates whether the student has parent(s) who are Service personnel serving in regular military units of all forces and exercising parental care and responsibility")
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
   * Information about a student&#39;s SEN Needs. This will only be returned if &#x60;&amp;sen_needs&#x3D;true&#x60; is included in your request
   * @return senNeeds
  **/
  @ApiModelProperty(value = "Information about a student's SEN Needs. This will only be returned if `&sen_needs=true` is included in your request")
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
    return Objects.equals(this.object, studentDemographics.object) &&
        Objects.equals(this.ethnicityCode, studentDemographics.ethnicityCode) &&
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
        Objects.equals(this.inCare, studentDemographics.inCare) &&
        Objects.equals(this.everInCare, studentDemographics.everInCare) &&
        Objects.equals(this.serviceChild, studentDemographics.serviceChild) &&
        Objects.equals(this.senNeeds, studentDemographics.senNeeds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(object, ethnicityCode, ethnicityGroup, gender, isPp, isEal, senCategory, countryOfBirth, nationalities, fsmReviewDate, isFsm, isFsm6, inCare, everInCare, serviceChild, senNeeds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StudentDemographics {\n");
    
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
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

