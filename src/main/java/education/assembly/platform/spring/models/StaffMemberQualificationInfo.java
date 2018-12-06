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
import education.assembly.platform.spring.models.StaffQualification;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

/**
 * StaffMemberQualificationInfo
 */

public class StaffMemberQualificationInfo implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("teacher_number")
  private String teacherNumber = null;

  @JsonProperty("qt_status")
  private Boolean qtStatus = null;

  @JsonProperty("hlta_status")
  private Boolean hltaStatus = null;

  @JsonProperty("qts_route")
  private String qtsRoute = null;

  @JsonProperty("qualifications")
  private List<StaffQualification> qualifications = null;

  public StaffMemberQualificationInfo teacherNumber(String teacherNumber) {
    this.teacherNumber = teacherNumber;
    return this;
  }

   /**
   * Get teacherNumber
   * @return teacherNumber
  **/
  @ApiModelProperty(value = "")
  public String getTeacherNumber() {
    return teacherNumber;
  }

  public void setTeacherNumber(String teacherNumber) {
    this.teacherNumber = teacherNumber;
  }

  public StaffMemberQualificationInfo qtStatus(Boolean qtStatus) {
    this.qtStatus = qtStatus;
    return this;
  }

   /**
   * Get qtStatus
   * @return qtStatus
  **/
  @ApiModelProperty(value = "")
  public Boolean isgetQtStatus() {
    return qtStatus;
  }

  public void setQtStatus(Boolean qtStatus) {
    this.qtStatus = qtStatus;
  }

  public StaffMemberQualificationInfo hltaStatus(Boolean hltaStatus) {
    this.hltaStatus = hltaStatus;
    return this;
  }

   /**
   * Get hltaStatus
   * @return hltaStatus
  **/
  @ApiModelProperty(value = "")
  public Boolean isgetHltaStatus() {
    return hltaStatus;
  }

  public void setHltaStatus(Boolean hltaStatus) {
    this.hltaStatus = hltaStatus;
  }

  public StaffMemberQualificationInfo qtsRoute(String qtsRoute) {
    this.qtsRoute = qtsRoute;
    return this;
  }

   /**
   * Get qtsRoute
   * @return qtsRoute
  **/
  @ApiModelProperty(value = "")
  public String getQtsRoute() {
    return qtsRoute;
  }

  public void setQtsRoute(String qtsRoute) {
    this.qtsRoute = qtsRoute;
  }

  public StaffMemberQualificationInfo qualifications(List<StaffQualification> qualifications) {
    this.qualifications = qualifications;
    return this;
  }

  public StaffMemberQualificationInfo addQualificationsItem(StaffQualification qualificationsItem) {
    if (this.qualifications == null) {
      this.qualifications = new ArrayList<StaffQualification>();
    }
    this.qualifications.add(qualificationsItem);
    return this;
  }

   /**
   * Get qualifications
   * @return qualifications
  **/
  @ApiModelProperty(value = "")
  public List<StaffQualification> getQualifications() {
    return qualifications;
  }

  public void setQualifications(List<StaffQualification> qualifications) {
    this.qualifications = qualifications;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StaffMemberQualificationInfo staffMemberQualificationInfo = (StaffMemberQualificationInfo) o;
    return Objects.equals(this.teacherNumber, staffMemberQualificationInfo.teacherNumber) &&
        Objects.equals(this.qtStatus, staffMemberQualificationInfo.qtStatus) &&
        Objects.equals(this.hltaStatus, staffMemberQualificationInfo.hltaStatus) &&
        Objects.equals(this.qtsRoute, staffMemberQualificationInfo.qtsRoute) &&
        Objects.equals(this.qualifications, staffMemberQualificationInfo.qualifications);
  }

  @Override
  public int hashCode() {
    return Objects.hash(teacherNumber, qtStatus, hltaStatus, qtsRoute, qualifications);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StaffMemberQualificationInfo {\n");
    
    sb.append("    teacherNumber: ").append(toIndentedString(teacherNumber)).append("\n");
    sb.append("    qtStatus: ").append(toIndentedString(qtStatus)).append("\n");
    sb.append("    hltaStatus: ").append(toIndentedString(hltaStatus)).append("\n");
    sb.append("    qtsRoute: ").append(toIndentedString(qtsRoute)).append("\n");
    sb.append("    qualifications: ").append(toIndentedString(qualifications)).append("\n");
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

