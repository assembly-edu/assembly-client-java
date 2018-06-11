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
import education.assembly.platform.spring.models.StaffContractAllowances;
import education.assembly.platform.spring.models.StaffContractRoles;
import education.assembly.platform.spring.models.StaffContractSalaries;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
import java.io.Serializable;

/**
 * A staff contract object represents a contract for a staff member within a school.
 */
@ApiModel(description = "A staff contract object represents a contract for a staff member within a school.")

public class StaffContract implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("object")
  private String object = null;

  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("staff_member_id")
  private String staffMemberId = null;

  @JsonProperty("start_date")
  private OffsetDateTime startDate = null;

  @JsonProperty("end_date")
  private OffsetDateTime endDate = null;

  @JsonProperty("national_insurance_number")
  private String nationalInsuranceNumber = null;

  @JsonProperty("payroll_number")
  private String payrollNumber = null;

  @JsonProperty("contract_type")
  private String contractType = null;

  @JsonProperty("post")
  private String post = null;

  @JsonProperty("origin")
  private String origin = null;

  @JsonProperty("destination")
  private String destination = null;

  @JsonProperty("daily_rate")
  private Boolean dailyRate = null;

  @JsonProperty("pay_review_date")
  private OffsetDateTime payReviewDate = null;

  @JsonProperty("roles")
  private List<StaffContractRoles> roles = null;

  @JsonProperty("salaries")
  private List<StaffContractSalaries> salaries = null;

  @JsonProperty("allowances")
  private List<StaffContractAllowances> allowances = null;

  public StaffContract object(String object) {
    this.object = object;
    return this;
  }

   /**
   * Object type
   * @return object
  **/
  @ApiModelProperty(example = "staff_contract", value = "Object type")
  public String getObject() {
    return object;
  }

  public void setObject(String object) {
    this.object = object;
  }

  public StaffContract id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Internal stable ID given to each contract in the Platform
   * @return id
  **/
  @ApiModelProperty(example = "2848", value = "Internal stable ID given to each contract in the Platform")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public StaffContract staffMemberId(String staffMemberId) {
    this.staffMemberId = staffMemberId;
    return this;
  }

   /**
   * The ID of the staff member
   * @return staffMemberId
  **/
  @ApiModelProperty(example = "77660", value = "The ID of the staff member")
  public String getStaffMemberId() {
    return staffMemberId;
  }

  public void setStaffMemberId(String staffMemberId) {
    this.staffMemberId = staffMemberId;
  }

  public StaffContract startDate(OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Contract start date
   * @return startDate
  **/
  @ApiModelProperty(example = "2015-09-06T14:00:00.000Z", value = "Contract start date")
  public OffsetDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }

  public StaffContract endDate(OffsetDateTime endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * Contract end date
   * @return endDate
  **/
  @ApiModelProperty(value = "Contract end date")
  public OffsetDateTime getEndDate() {
    return endDate;
  }

  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }

  public StaffContract nationalInsuranceNumber(String nationalInsuranceNumber) {
    this.nationalInsuranceNumber = nationalInsuranceNumber;
    return this;
  }

   /**
   * Employee NI number
   * @return nationalInsuranceNumber
  **/
  @ApiModelProperty(example = "FG800343T", value = "Employee NI number")
  public String getNationalInsuranceNumber() {
    return nationalInsuranceNumber;
  }

  public void setNationalInsuranceNumber(String nationalInsuranceNumber) {
    this.nationalInsuranceNumber = nationalInsuranceNumber;
  }

  public StaffContract payrollNumber(String payrollNumber) {
    this.payrollNumber = payrollNumber;
    return this;
  }

   /**
   * Employee payroll number
   * @return payrollNumber
  **/
  @ApiModelProperty(example = "3356781", value = "Employee payroll number")
  public String getPayrollNumber() {
    return payrollNumber;
  }

  public void setPayrollNumber(String payrollNumber) {
    this.payrollNumber = payrollNumber;
  }

  public StaffContract contractType(String contractType) {
    this.contractType = contractType;
    return this;
  }

   /**
   * Contract type
   * @return contractType
  **/
  @ApiModelProperty(example = "Fixed Term", value = "Contract type")
  public String getContractType() {
    return contractType;
  }

  public void setContractType(String contractType) {
    this.contractType = contractType;
  }

  public StaffContract post(String post) {
    this.post = post;
    return this;
  }

   /**
   * No description
   * @return post
  **/
  @ApiModelProperty(example = "Advisory Teacher", value = "No description")
  public String getPost() {
    return post;
  }

  public void setPost(String post) {
    this.post = post;
  }

  public StaffContract origin(String origin) {
    this.origin = origin;
    return this;
  }

   /**
   * No description
   * @return origin
  **/
  @ApiModelProperty(example = "Other education post in England or Wales", value = "No description")
  public String getOrigin() {
    return origin;
  }

  public void setOrigin(String origin) {
    this.origin = origin;
  }

  public StaffContract destination(String destination) {
    this.destination = destination;
    return this;
  }

   /**
   * Completed after a contract has been terminated; this captures a post-holder’s destination
   * @return destination
  **/
  @ApiModelProperty(example = "Deceased", value = "Completed after a contract has been terminated; this captures a post-holder’s destination")
  public String getDestination() {
    return destination;
  }

  public void setDestination(String destination) {
    this.destination = destination;
  }

  public StaffContract dailyRate(Boolean dailyRate) {
    this.dailyRate = dailyRate;
    return this;
  }

   /**
   * No description
   * @return dailyRate
  **/
  @ApiModelProperty(example = "true", value = "No description")
  public Boolean isDailyRate() {
    return dailyRate;
  }

  public void setDailyRate(Boolean dailyRate) {
    this.dailyRate = dailyRate;
  }

  public StaffContract payReviewDate(OffsetDateTime payReviewDate) {
    this.payReviewDate = payReviewDate;
    return this;
  }

   /**
   * No description
   * @return payReviewDate
  **/
  @ApiModelProperty(example = "2017-11-02T00:00:00.000Z", value = "No description")
  public OffsetDateTime getPayReviewDate() {
    return payReviewDate;
  }

  public void setPayReviewDate(OffsetDateTime payReviewDate) {
    this.payReviewDate = payReviewDate;
  }

  public StaffContract roles(List<StaffContractRoles> roles) {
    this.roles = roles;
    return this;
  }

  public StaffContract addRolesItem(StaffContractRoles rolesItem) {
    if (this.roles == null) {
      this.roles = new ArrayList<StaffContractRoles>();
    }
    this.roles.add(rolesItem);
    return this;
  }

   /**
   * No description
   * @return roles
  **/
  @ApiModelProperty(value = "No description")
  public List<StaffContractRoles> getRoles() {
    return roles;
  }

  public void setRoles(List<StaffContractRoles> roles) {
    this.roles = roles;
  }

  public StaffContract salaries(List<StaffContractSalaries> salaries) {
    this.salaries = salaries;
    return this;
  }

  public StaffContract addSalariesItem(StaffContractSalaries salariesItem) {
    if (this.salaries == null) {
      this.salaries = new ArrayList<StaffContractSalaries>();
    }
    this.salaries.add(salariesItem);
    return this;
  }

   /**
   * No description
   * @return salaries
  **/
  @ApiModelProperty(value = "No description")
  public List<StaffContractSalaries> getSalaries() {
    return salaries;
  }

  public void setSalaries(List<StaffContractSalaries> salaries) {
    this.salaries = salaries;
  }

  public StaffContract allowances(List<StaffContractAllowances> allowances) {
    this.allowances = allowances;
    return this;
  }

  public StaffContract addAllowancesItem(StaffContractAllowances allowancesItem) {
    if (this.allowances == null) {
      this.allowances = new ArrayList<StaffContractAllowances>();
    }
    this.allowances.add(allowancesItem);
    return this;
  }

   /**
   * No description
   * @return allowances
  **/
  @ApiModelProperty(value = "No description")
  public List<StaffContractAllowances> getAllowances() {
    return allowances;
  }

  public void setAllowances(List<StaffContractAllowances> allowances) {
    this.allowances = allowances;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StaffContract staffContract = (StaffContract) o;
    return Objects.equals(this.object, staffContract.object) &&
        Objects.equals(this.id, staffContract.id) &&
        Objects.equals(this.staffMemberId, staffContract.staffMemberId) &&
        Objects.equals(this.startDate, staffContract.startDate) &&
        Objects.equals(this.endDate, staffContract.endDate) &&
        Objects.equals(this.nationalInsuranceNumber, staffContract.nationalInsuranceNumber) &&
        Objects.equals(this.payrollNumber, staffContract.payrollNumber) &&
        Objects.equals(this.contractType, staffContract.contractType) &&
        Objects.equals(this.post, staffContract.post) &&
        Objects.equals(this.origin, staffContract.origin) &&
        Objects.equals(this.destination, staffContract.destination) &&
        Objects.equals(this.dailyRate, staffContract.dailyRate) &&
        Objects.equals(this.payReviewDate, staffContract.payReviewDate) &&
        Objects.equals(this.roles, staffContract.roles) &&
        Objects.equals(this.salaries, staffContract.salaries) &&
        Objects.equals(this.allowances, staffContract.allowances);
  }

  @Override
  public int hashCode() {
    return Objects.hash(object, id, staffMemberId, startDate, endDate, nationalInsuranceNumber, payrollNumber, contractType, post, origin, destination, dailyRate, payReviewDate, roles, salaries, allowances);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StaffContract {\n");
    
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    staffMemberId: ").append(toIndentedString(staffMemberId)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    nationalInsuranceNumber: ").append(toIndentedString(nationalInsuranceNumber)).append("\n");
    sb.append("    payrollNumber: ").append(toIndentedString(payrollNumber)).append("\n");
    sb.append("    contractType: ").append(toIndentedString(contractType)).append("\n");
    sb.append("    post: ").append(toIndentedString(post)).append("\n");
    sb.append("    origin: ").append(toIndentedString(origin)).append("\n");
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    dailyRate: ").append(toIndentedString(dailyRate)).append("\n");
    sb.append("    payReviewDate: ").append(toIndentedString(payReviewDate)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    salaries: ").append(toIndentedString(salaries)).append("\n");
    sb.append("    allowances: ").append(toIndentedString(allowances)).append("\n");
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

