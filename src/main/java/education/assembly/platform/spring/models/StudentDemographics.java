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
import education.assembly.platform.spring.models.StudentDemographicsSenNeeds;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
import java.io.Serializable;

/**
 * Demographics information about the student.
 */
@ApiModel(description = "Demographics information about the student.")

public class StudentDemographics implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("object")
  private String object = null;

  @JsonProperty("ethnicity_code")
  private String ethnicityCode = null;

  @JsonProperty("ethnicity_group")
  private String ethnicityGroup = null;

  /**
   * The gender of the student *Values*  |Value|Description| |---|---| |&#x60;F&#x60;|Female| |&#x60;M&#x60;|Male| 
   */
  public enum GenderEnum {
    F("F"),
    
    M("M");

    private String value;

    GenderEnum(String value) {
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
    public static GenderEnum fromValue(String text) {
      for (GenderEnum b : GenderEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("gender")
  private GenderEnum gender = null;

  @JsonProperty("in_care")
  private Boolean inCare = null;

  @JsonProperty("is_eal")
  private Boolean isEal = null;

  @JsonProperty("is_fsm")
  private Boolean isFsm = null;

  @JsonProperty("fsm_review_date")
  private OffsetDateTime fsmReviewDate = null;

  @JsonProperty("is_pp")
  private Boolean isPp = null;

  /**
   * Special Education Need (SEN) - indicates a student has learning difficulties and requires special education provision. *Values*  |Value|Description| |---|---| |&#x60;A&#x60;|School Action (no longer valid)| |&#x60;E&#x60;|Education, Health and Care Plan| |&#x60;K&#x60;|SEN Support| |&#x60;N&#x60;|None| |&#x60;P&#x60;|School Action Plus (no longer valid)| |&#x60;S&#x60;|Statement| |&#x60;null&#x60;|Not eligable| 
   */
  public enum SenCategoryEnum {
    A("A"),
    
    E("E"),
    
    K("K"),
    
    N("N"),
    
    P("P"),
    
    S("S"),
    
    NULL("null");

    private String value;

    SenCategoryEnum(String value) {
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
    public static SenCategoryEnum fromValue(String text) {
      for (SenCategoryEnum b : SenCategoryEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("sen_category")
  private SenCategoryEnum senCategory = SenCategoryEnum.NULL;

  @JsonProperty("sen_needs")
  private StudentDemographicsSenNeeds senNeeds = null;

  @JsonProperty("country_of_birth")
  private String countryOfBirth = null;

  @JsonProperty("nationalities")
  private List<String> nationalities = null;

  public StudentDemographics object(String object) {
    this.object = object;
    return this;
  }

   /**
   * Object type
   * @return object
  **/
  @ApiModelProperty(example = "student_demographics", value = "Object type")
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
  @ApiModelProperty(example = "MOTH", value = "A detailed, Dfe standardised way of categorising the ethnicity of a student")
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
  @ApiModelProperty(example = "Mixed/ Dual Background", value = "A broader categorisation of ethnicity that is standardised across the country, with all ethnicity codes grouped in to 8 sections")
  public String getEthnicityGroup() {
    return ethnicityGroup;
  }

  public void setEthnicityGroup(String ethnicityGroup) {
    this.ethnicityGroup = ethnicityGroup;
  }

  public StudentDemographics gender(GenderEnum gender) {
    this.gender = gender;
    return this;
  }

   /**
   * The gender of the student *Values*  |Value|Description| |---|---| |&#x60;F&#x60;|Female| |&#x60;M&#x60;|Male| 
   * @return gender
  **/
  @ApiModelProperty(example = "M", value = "The gender of the student *Values*  |Value|Description| |---|---| |`F`|Female| |`M`|Male| ")
  public GenderEnum getGender() {
    return gender;
  }

  public void setGender(GenderEnum gender) {
    this.gender = gender;
  }

  public StudentDemographics inCare(Boolean inCare) {
    this.inCare = inCare;
    return this;
  }

   /**
   * Looked after status - indicates whether the student is &#39;looked after&#39; by the local authority (this field will only be returned if &amp;demographics&#x3D;true and &amp;care&#x3D;true is included in your request)
   * @return inCare
  **/
  @ApiModelProperty(example = "false", value = "Looked after status - indicates whether the student is 'looked after' by the local authority (this field will only be returned if &demographics=true and &care=true is included in your request)")
  public Boolean isInCare() {
    return inCare;
  }

  public void setInCare(Boolean inCare) {
    this.inCare = inCare;
  }

  public StudentDemographics isEal(Boolean isEal) {
    this.isEal = isEal;
    return this;
  }

   /**
   * English as an Additional Language (EAL) - this field will be true for a student whose first language is not English
   * @return isEal
  **/
  @ApiModelProperty(example = "true", value = "English as an Additional Language (EAL) - this field will be true for a student whose first language is not English")
  public Boolean isIsEal() {
    return isEal;
  }

  public void setIsEal(Boolean isEal) {
    this.isEal = isEal;
  }

  public StudentDemographics isFsm(Boolean isFsm) {
    this.isFsm = isFsm;
    return this;
  }

   /**
   * Free School Meals (FSM) - indicates if the student is eligible for free school meals
   * @return isFsm
  **/
  @ApiModelProperty(example = "true", value = "Free School Meals (FSM) - indicates if the student is eligible for free school meals")
  public Boolean isIsFsm() {
    return isFsm;
  }

  public void setIsFsm(Boolean isFsm) {
    this.isFsm = isFsm;
  }

  public StudentDemographics fsmReviewDate(OffsetDateTime fsmReviewDate) {
    this.fsmReviewDate = fsmReviewDate;
    return this;
  }

   /**
   * Free school meal review date -Review date for pupil&#39;s free school meal eligibility
   * @return fsmReviewDate
  **/
  @ApiModelProperty(example = "2020-01-01", value = "Free school meal review date -Review date for pupil's free school meal eligibility")
  public OffsetDateTime getFsmReviewDate() {
    return fsmReviewDate;
  }

  public void setFsmReviewDate(OffsetDateTime fsmReviewDate) {
    this.fsmReviewDate = fsmReviewDate;
  }

  public StudentDemographics isPp(Boolean isPp) {
    this.isPp = isPp;
    return this;
  }

   /**
   * Pupil Premium (PP) - schools receive extra funding for students who qualify as Pupil Premium. The includes any student who has qualified for Free School Meals (FSM) in the last 6 years, and any student in local-authority care
   * @return isPp
  **/
  @ApiModelProperty(example = "true", value = "Pupil Premium (PP) - schools receive extra funding for students who qualify as Pupil Premium. The includes any student who has qualified for Free School Meals (FSM) in the last 6 years, and any student in local-authority care")
  public Boolean isIsPp() {
    return isPp;
  }

  public void setIsPp(Boolean isPp) {
    this.isPp = isPp;
  }

  public StudentDemographics senCategory(SenCategoryEnum senCategory) {
    this.senCategory = senCategory;
    return this;
  }

   /**
   * Special Education Need (SEN) - indicates a student has learning difficulties and requires special education provision. *Values*  |Value|Description| |---|---| |&#x60;A&#x60;|School Action (no longer valid)| |&#x60;E&#x60;|Education, Health and Care Plan| |&#x60;K&#x60;|SEN Support| |&#x60;N&#x60;|None| |&#x60;P&#x60;|School Action Plus (no longer valid)| |&#x60;S&#x60;|Statement| |&#x60;null&#x60;|Not eligable| 
   * @return senCategory
  **/
  @ApiModelProperty(example = "K", value = "Special Education Need (SEN) - indicates a student has learning difficulties and requires special education provision. *Values*  |Value|Description| |---|---| |`A`|School Action (no longer valid)| |`E`|Education, Health and Care Plan| |`K`|SEN Support| |`N`|None| |`P`|School Action Plus (no longer valid)| |`S`|Statement| |`null`|Not eligable| ")
  public SenCategoryEnum getSenCategory() {
    return senCategory;
  }

  public void setSenCategory(SenCategoryEnum senCategory) {
    this.senCategory = senCategory;
  }

  public StudentDemographics senNeeds(StudentDemographicsSenNeeds senNeeds) {
    this.senNeeds = senNeeds;
    return this;
  }

   /**
   * Get senNeeds
   * @return senNeeds
  **/
  @ApiModelProperty(value = "")
  public StudentDemographicsSenNeeds getSenNeeds() {
    return senNeeds;
  }

  public void setSenNeeds(StudentDemographicsSenNeeds senNeeds) {
    this.senNeeds = senNeeds;
  }

  public StudentDemographics countryOfBirth(String countryOfBirth) {
    this.countryOfBirth = countryOfBirth;
    return this;
  }

   /**
   * The country of birth of the student
   * @return countryOfBirth
  **/
  @ApiModelProperty(example = "United Kingdom", value = "The country of birth of the student")
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
        Objects.equals(this.inCare, studentDemographics.inCare) &&
        Objects.equals(this.isEal, studentDemographics.isEal) &&
        Objects.equals(this.isFsm, studentDemographics.isFsm) &&
        Objects.equals(this.fsmReviewDate, studentDemographics.fsmReviewDate) &&
        Objects.equals(this.isPp, studentDemographics.isPp) &&
        Objects.equals(this.senCategory, studentDemographics.senCategory) &&
        Objects.equals(this.senNeeds, studentDemographics.senNeeds) &&
        Objects.equals(this.countryOfBirth, studentDemographics.countryOfBirth) &&
        Objects.equals(this.nationalities, studentDemographics.nationalities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(object, ethnicityCode, ethnicityGroup, gender, inCare, isEal, isFsm, fsmReviewDate, isPp, senCategory, senNeeds, countryOfBirth, nationalities);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StudentDemographics {\n");
    
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    ethnicityCode: ").append(toIndentedString(ethnicityCode)).append("\n");
    sb.append("    ethnicityGroup: ").append(toIndentedString(ethnicityGroup)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    inCare: ").append(toIndentedString(inCare)).append("\n");
    sb.append("    isEal: ").append(toIndentedString(isEal)).append("\n");
    sb.append("    isFsm: ").append(toIndentedString(isFsm)).append("\n");
    sb.append("    fsmReviewDate: ").append(toIndentedString(fsmReviewDate)).append("\n");
    sb.append("    isPp: ").append(toIndentedString(isPp)).append("\n");
    sb.append("    senCategory: ").append(toIndentedString(senCategory)).append("\n");
    sb.append("    senNeeds: ").append(toIndentedString(senNeeds)).append("\n");
    sb.append("    countryOfBirth: ").append(toIndentedString(countryOfBirth)).append("\n");
    sb.append("    nationalities: ").append(toIndentedString(nationalities)).append("\n");
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

