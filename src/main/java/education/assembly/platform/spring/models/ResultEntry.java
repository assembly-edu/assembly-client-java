/*
 * assembly-client-java 1.2.450
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
 * A result for a student to be created on the Platform
 */
@ApiModel(description = "A result for a student to be created on the Platform")

public class ResultEntry implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("student_id")
  private Integer studentId = ;

  @JsonProperty("grade_id")
  private Integer gradeId = ;

  @JsonProperty("result_date")
  private OffsetDateTime resultDate = ;

  public ResultEntry studentId(Integer studentId) {
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

  public ResultEntry gradeId(Integer gradeId) {
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

  public ResultEntry resultDate(OffsetDateTime resultDate) {
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
    ResultEntry resultEntry = (ResultEntry) o;
    return Objects.equals(this.studentId, resultEntry.studentId) &&
        Objects.equals(this.gradeId, resultEntry.gradeId) &&
        Objects.equals(this.resultDate, resultEntry.resultDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(studentId, gradeId, resultDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResultEntry {\n");
    
    sb.append("    studentId: ").append(toIndentedString(studentId)).append("\n");
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

