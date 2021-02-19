/*
 * assembly-client-java 1.2.475
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
 * Post-16 Learning Aim studied by this student
 */
@ApiModel(description = "Post-16 Learning Aim studied by this student")

public class StudentLearningAims implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("object")
  private String object = "learning_aim_learner";

  @JsonProperty("learning_aim_source_id")
  private Integer learningAimSourceId = ;

  @JsonProperty("start_date")
  private OffsetDateTime startDate = ;

  @JsonProperty("planned_end_date")
  private OffsetDateTime plannedEndDate = ;

  @JsonProperty("actual_end_date")
  private OffsetDateTime actualEndDate = ;

  @JsonProperty("completion_status")
  private String completionStatus = ;

  @JsonProperty("withdrawal_reason")
  private String withdrawalReason = ;

  @JsonProperty("core_aim_indicator")
  private Boolean coreAimIndicator = ;

  public StudentLearningAims object(String object) {
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

  public StudentLearningAims learningAimSourceId(Integer learningAimSourceId) {
    this.learningAimSourceId = learningAimSourceId;
    return this;
  }

   /**
   * ID of the associated learning aim
   * @return learningAimSourceId
  **/
  @ApiModelProperty(value = "ID of the associated learning aim")
  public Integer getLearningAimSourceId() {
    return learningAimSourceId;
  }

  public void setLearningAimSourceId(Integer learningAimSourceId) {
    this.learningAimSourceId = learningAimSourceId;
  }

  public StudentLearningAims startDate(OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Date the student started the learning aim
   * @return startDate
  **/
  @ApiModelProperty(value = "Date the student started the learning aim")
  public OffsetDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }

  public StudentLearningAims plannedEndDate(OffsetDateTime plannedEndDate) {
    this.plannedEndDate = plannedEndDate;
    return this;
  }

   /**
   * Date the student is expected to complete the learning aim
   * @return plannedEndDate
  **/
  @ApiModelProperty(value = "Date the student is expected to complete the learning aim")
  public OffsetDateTime getPlannedEndDate() {
    return plannedEndDate;
  }

  public void setPlannedEndDate(OffsetDateTime plannedEndDate) {
    this.plannedEndDate = plannedEndDate;
  }

  public StudentLearningAims actualEndDate(OffsetDateTime actualEndDate) {
    this.actualEndDate = actualEndDate;
    return this;
  }

   /**
   * Date the student actually completed the learning aim
   * @return actualEndDate
  **/
  @ApiModelProperty(value = "Date the student actually completed the learning aim")
  public OffsetDateTime getActualEndDate() {
    return actualEndDate;
  }

  public void setActualEndDate(OffsetDateTime actualEndDate) {
    this.actualEndDate = actualEndDate;
  }

  public StudentLearningAims completionStatus(String completionStatus) {
    this.completionStatus = completionStatus;
    return this;
  }

   /**
   * Completion Status
   * @return completionStatus
  **/
  @ApiModelProperty(value = "Completion Status")
  public String getCompletionStatus() {
    return completionStatus;
  }

  public void setCompletionStatus(String completionStatus) {
    this.completionStatus = completionStatus;
  }

  public StudentLearningAims withdrawalReason(String withdrawalReason) {
    this.withdrawalReason = withdrawalReason;
    return this;
  }

   /**
   * Withdrawl Reason
   * @return withdrawalReason
  **/
  @ApiModelProperty(value = "Withdrawl Reason")
  public String getWithdrawalReason() {
    return withdrawalReason;
  }

  public void setWithdrawalReason(String withdrawalReason) {
    this.withdrawalReason = withdrawalReason;
  }

  public StudentLearningAims coreAimIndicator(Boolean coreAimIndicator) {
    this.coreAimIndicator = coreAimIndicator;
    return this;
  }

   /**
   * Core Aim Indicator
   * @return coreAimIndicator
  **/
  @ApiModelProperty(value = "Core Aim Indicator")
  public Boolean isgetCoreAimIndicator() {
    return coreAimIndicator;
  }

  public void setCoreAimIndicator(Boolean coreAimIndicator) {
    this.coreAimIndicator = coreAimIndicator;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StudentLearningAims studentLearningAims = (StudentLearningAims) o;
    return Objects.equals(this.object, studentLearningAims.object) &&
        Objects.equals(this.learningAimSourceId, studentLearningAims.learningAimSourceId) &&
        Objects.equals(this.startDate, studentLearningAims.startDate) &&
        Objects.equals(this.plannedEndDate, studentLearningAims.plannedEndDate) &&
        Objects.equals(this.actualEndDate, studentLearningAims.actualEndDate) &&
        Objects.equals(this.completionStatus, studentLearningAims.completionStatus) &&
        Objects.equals(this.withdrawalReason, studentLearningAims.withdrawalReason) &&
        Objects.equals(this.coreAimIndicator, studentLearningAims.coreAimIndicator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(object, learningAimSourceId, startDate, plannedEndDate, actualEndDate, completionStatus, withdrawalReason, coreAimIndicator);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StudentLearningAims {\n");
    
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    learningAimSourceId: ").append(toIndentedString(learningAimSourceId)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    plannedEndDate: ").append(toIndentedString(plannedEndDate)).append("\n");
    sb.append("    actualEndDate: ").append(toIndentedString(actualEndDate)).append("\n");
    sb.append("    completionStatus: ").append(toIndentedString(completionStatus)).append("\n");
    sb.append("    withdrawalReason: ").append(toIndentedString(withdrawalReason)).append("\n");
    sb.append("    coreAimIndicator: ").append(toIndentedString(coreAimIndicator)).append("\n");
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

