/*
 * assembly-client-java 1.2.474
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
import org.threeten.bp.OffsetDateTime;
import java.io.Serializable;

/**
 * A Post-16 Learning Aim.
 */
@ApiModel(description = "A Post-16 Learning Aim.")

public class LearningAim implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("object")
  private String object = "learning_aim";

  @JsonProperty("qualification_name")
  private String qualificationName = ;

  @JsonProperty("qualification_number")
  private String qualificationNumber = ;

  @JsonProperty("discount_code")
  private String discountCode = ;

  @JsonProperty("qan_subject")
  private String qanSubject = ;

  @JsonProperty("expiry_date")
  private OffsetDateTime expiryDate = ;

  public LearningAim object(String object) {
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

  public LearningAim qualificationName(String qualificationName) {
    this.qualificationName = qualificationName;
    return this;
  }

   /**
   * Title of the learning aim
   * @return qualificationName
  **/
  @ApiModelProperty(value = "Title of the learning aim")
  public String getQualificationName() {
    return qualificationName;
  }

  public void setQualificationName(String qualificationName) {
    this.qualificationName = qualificationName;
  }

  public LearningAim qualificationNumber(String qualificationNumber) {
    this.qualificationNumber = qualificationNumber;
    return this;
  }

   /**
   * Qualification number of the learning aim
   * @return qualificationNumber
  **/
  @ApiModelProperty(value = "Qualification number of the learning aim")
  public String getQualificationNumber() {
    return qualificationNumber;
  }

  public void setQualificationNumber(String qualificationNumber) {
    this.qualificationNumber = qualificationNumber;
  }

  public LearningAim discountCode(String discountCode) {
    this.discountCode = discountCode;
    return this;
  }

   /**
   * Discount code of the learning aim
   * @return discountCode
  **/
  @ApiModelProperty(value = "Discount code of the learning aim")
  public String getDiscountCode() {
    return discountCode;
  }

  public void setDiscountCode(String discountCode) {
    this.discountCode = discountCode;
  }

  public LearningAim qanSubject(String qanSubject) {
    this.qanSubject = qanSubject;
    return this;
  }

   /**
   * QAN subject
   * @return qanSubject
  **/
  @ApiModelProperty(value = "QAN subject")
  public String getQanSubject() {
    return qanSubject;
  }

  public void setQanSubject(String qanSubject) {
    this.qanSubject = qanSubject;
  }

  public LearningAim expiryDate(OffsetDateTime expiryDate) {
    this.expiryDate = expiryDate;
    return this;
  }

   /**
   * Expiry date
   * @return expiryDate
  **/
  @ApiModelProperty(value = "Expiry date")
  public OffsetDateTime getExpiryDate() {
    return expiryDate;
  }

  public void setExpiryDate(OffsetDateTime expiryDate) {
    this.expiryDate = expiryDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LearningAim learningAim = (LearningAim) o;
    return Objects.equals(this.object, learningAim.object) &&
        Objects.equals(this.qualificationName, learningAim.qualificationName) &&
        Objects.equals(this.qualificationNumber, learningAim.qualificationNumber) &&
        Objects.equals(this.discountCode, learningAim.discountCode) &&
        Objects.equals(this.qanSubject, learningAim.qanSubject) &&
        Objects.equals(this.expiryDate, learningAim.expiryDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(object, qualificationName, qualificationNumber, discountCode, qanSubject, expiryDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LearningAim {\n");
    
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    qualificationName: ").append(toIndentedString(qualificationName)).append("\n");
    sb.append("    qualificationNumber: ").append(toIndentedString(qualificationNumber)).append("\n");
    sb.append("    discountCode: ").append(toIndentedString(discountCode)).append("\n");
    sb.append("    qanSubject: ").append(toIndentedString(qanSubject)).append("\n");
    sb.append("    expiryDate: ").append(toIndentedString(expiryDate)).append("\n");
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

