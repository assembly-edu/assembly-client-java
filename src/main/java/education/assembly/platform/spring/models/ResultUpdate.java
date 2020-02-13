/*
 * assembly-client-java 1.2.463
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
 * A result for a student to be updated on the Platform
 */
@ApiModel(description = "A result for a student to be updated on the Platform")

public class ResultUpdate implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("student_id")
  private Integer studentId = ;

  @JsonProperty("result_id")
  private Integer resultId = ;

  @JsonProperty("grade_id")
  private Integer gradeId = ;

  @JsonProperty("result_date")
  private OffsetDateTime resultDate = ;

  public ResultUpdate studentId(Integer studentId) {
    this.studentId = studentId;
    return this;
  }

   /**
   * The ID of the student
   * @return studentId
  **/
  @ApiModelProperty(value = "The ID of the student")
  public Integer getStudentId() {
    return studentId;
  }

  public void setStudentId(Integer studentId) {
    this.studentId = studentId;
  }

  public ResultUpdate resultId(Integer resultId) {
    this.resultId = resultId;
    return this;
  }

   /**
   * The ID of the result
   * @return resultId
  **/
  @ApiModelProperty(value = "The ID of the result")
  public Integer getResultId() {
    return resultId;
  }

  public void setResultId(Integer resultId) {
    this.resultId = resultId;
  }

  public ResultUpdate gradeId(Integer gradeId) {
    this.gradeId = gradeId;
    return this;
  }

   /**
   * The ID of the grade
   * @return gradeId
  **/
  @ApiModelProperty(value = "The ID of the grade")
  public Integer getGradeId() {
    return gradeId;
  }

  public void setGradeId(Integer gradeId) {
    this.gradeId = gradeId;
  }

  public ResultUpdate resultDate(OffsetDateTime resultDate) {
    this.resultDate = resultDate;
    return this;
  }

   /**
   * The date/time that this result was recorded
   * @return resultDate
  **/
  @ApiModelProperty(value = "The date/time that this result was recorded")
  public OffsetDateTime getResultDate() {
    return resultDate;
  }

  public void setResultDate(OffsetDateTime resultDate) {
    this.resultDate = resultDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResultUpdate resultUpdate = (ResultUpdate) o;
    return Objects.equals(this.studentId, resultUpdate.studentId) &&
        Objects.equals(this.resultId, resultUpdate.resultId) &&
        Objects.equals(this.gradeId, resultUpdate.gradeId) &&
        Objects.equals(this.resultDate, resultUpdate.resultDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(studentId, resultId, gradeId, resultDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResultUpdate {\n");
    
    sb.append("    studentId: ").append(toIndentedString(studentId)).append("\n");
    sb.append("    resultId: ").append(toIndentedString(resultId)).append("\n");
    sb.append("    gradeId: ").append(toIndentedString(gradeId)).append("\n");
    sb.append("    resultDate: ").append(toIndentedString(resultDate)).append("\n");
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

