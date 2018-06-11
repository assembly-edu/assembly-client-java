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
import education.assembly.platform.spring.models.StaffMemberQualificationInfoQualifications;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

/**
 * Information about staff member qualifications
 */
@ApiModel(description = "Information about staff member qualifications")

public class StaffMemberQualificationInfo implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("object")
  private String object = null;

  @JsonProperty("teacher_number")
  private String teacherNumber = null;

  @JsonProperty("qt_status")
  private Boolean qtStatus = null;

  @JsonProperty("hlta_status")
  private Boolean hltaStatus = null;

  @JsonProperty("qts_route")
  private String qtsRoute = null;

  @JsonProperty("qualifications")
  private List<StaffMemberQualificationInfoQualifications> qualifications = null;

  public StaffMemberQualificationInfo object(String object) {
    this.object = object;
    return this;
  }

   /**
   * Object type
   * @return object
  **/
  @ApiModelProperty(example = "qualification_info", value = "Object type")
  public String getObject() {
    return object;
  }

  public void setObject(String object) {
    this.object = object;
  }

  public StaffMemberQualificationInfo teacherNumber(String teacherNumber) {
    this.teacherNumber = teacherNumber;
    return this;
  }

   /**
   * The DfE Teacher Reference number (also known as GTC number). For members of staff who have one this is a unique identifier
   * @return teacherNumber
  **/
  @ApiModelProperty(example = "31333332", value = "The DfE Teacher Reference number (also known as GTC number). For members of staff who have one this is a unique identifier")
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
   * Whether or not the staff member holds Qualified Teacher Status
   * @return qtStatus
  **/
  @ApiModelProperty(example = "true", value = "Whether or not the staff member holds Qualified Teacher Status")
  public Boolean isQtStatus() {
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
   * Whether or not the staff member holds Higher Level Teaching Assistant Status
   * @return hltaStatus
  **/
  @ApiModelProperty(example = "false", value = "Whether or not the staff member holds Higher Level Teaching Assistant Status")
  public Boolean isHltaStatus() {
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
   * The route by which a teacher obtains Qualified Teacher Status (e.g. the Graduate Teacher programme).
   * @return qtsRoute
  **/
  @ApiModelProperty(example = "School Direct (Salaried)", value = "The route by which a teacher obtains Qualified Teacher Status (e.g. the Graduate Teacher programme).")
  public String getQtsRoute() {
    return qtsRoute;
  }

  public void setQtsRoute(String qtsRoute) {
    this.qtsRoute = qtsRoute;
  }

  public StaffMemberQualificationInfo qualifications(List<StaffMemberQualificationInfoQualifications> qualifications) {
    this.qualifications = qualifications;
    return this;
  }

  public StaffMemberQualificationInfo addQualificationsItem(StaffMemberQualificationInfoQualifications qualificationsItem) {
    if (this.qualifications == null) {
      this.qualifications = new ArrayList<StaffMemberQualificationInfoQualifications>();
    }
    this.qualifications.add(qualificationsItem);
    return this;
  }

   /**
   * A list of all qualifications/degrees completed by a staff member
   * @return qualifications
  **/
  @ApiModelProperty(value = "A list of all qualifications/degrees completed by a staff member")
  public List<StaffMemberQualificationInfoQualifications> getQualifications() {
    return qualifications;
  }

  public void setQualifications(List<StaffMemberQualificationInfoQualifications> qualifications) {
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
    return Objects.equals(this.object, staffMemberQualificationInfo.object) &&
        Objects.equals(this.teacherNumber, staffMemberQualificationInfo.teacherNumber) &&
        Objects.equals(this.qtStatus, staffMemberQualificationInfo.qtStatus) &&
        Objects.equals(this.hltaStatus, staffMemberQualificationInfo.hltaStatus) &&
        Objects.equals(this.qtsRoute, staffMemberQualificationInfo.qtsRoute) &&
        Objects.equals(this.qualifications, staffMemberQualificationInfo.qualifications);
  }

  @Override
  public int hashCode() {
    return Objects.hash(object, teacherNumber, qtStatus, hltaStatus, qtsRoute, qualifications);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StaffMemberQualificationInfo {\n");
    
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
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

