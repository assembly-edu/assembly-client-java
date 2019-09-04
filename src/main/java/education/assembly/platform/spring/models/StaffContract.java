/*
 * assembly-client-java 1.2.419
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
import education.assembly.platform.spring.models.StaffAllowance;
import education.assembly.platform.spring.models.StaffRole;
import education.assembly.platform.spring.models.StaffSalary;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
import java.io.Serializable;

/**
 * A contract held by a staff member.
 */
@ApiModel(description = "A contract held by a staff member.")

public class StaffContract implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("object")
  private String object = "staff_contract";

  @JsonProperty("id")
  private Integer id = ;

  @JsonProperty("staff_member_id")
  private Integer staffMemberId = ;

  @JsonProperty("start_date")
  private OffsetDateTime startDate = ;

  @JsonProperty("end_date")
  private OffsetDateTime endDate = ;

  @JsonProperty("national_insurance_number")
  private String nationalInsuranceNumber = ;

  @JsonProperty("payroll_number")
  private String payrollNumber = ;

  @JsonProperty("contract_type")
  private String contractType = ;

  @JsonProperty("post")
  private String post = ;

  @JsonProperty("origin")
  private String origin = ;

  @JsonProperty("destination")
  private String destination = ;

  @JsonProperty("daily_rate")
  private Boolean dailyRate = ;

  @JsonProperty("pay_review_date")
  private OffsetDateTime payReviewDate = ;

  @JsonProperty("roles")
  private List<StaffRole> roles = null;

  @JsonProperty("salaries")
  private List<StaffSalary> salaries = null;

  @JsonProperty("allowances")
  private List<StaffAllowance> allowances = null;

  public StaffContract object(String object) {
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

  public StaffContract id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Internal stable ID
   * @return id
  **/
  @ApiModelProperty(value = "Internal stable ID")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public StaffContract staffMemberId(Integer staffMemberId) {
    this.staffMemberId = staffMemberId;
    return this;
  }

   /**
   * The ID of the staff member
   * @return staffMemberId
  **/
  @ApiModelProperty(value = "The ID of the staff member")
  public Integer getStaffMemberId() {
    return staffMemberId;
  }

  public void setStaffMemberId(Integer staffMemberId) {
    this.staffMemberId = staffMemberId;
  }

  public StaffContract startDate(OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * The start date of the contract
   * @return startDate
  **/
  @ApiModelProperty(value = "The start date of the contract")
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
   * The end date of the contract
   * @return endDate
  **/
  @ApiModelProperty(value = "The end date of the contract")
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
   * The staff member&#39;s NI Number
   * @return nationalInsuranceNumber
  **/
  @ApiModelProperty(value = "The staff member's NI Number")
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
   * The staff member&#39;s payroll number
   * @return payrollNumber
  **/
  @ApiModelProperty(value = "The staff member's payroll number")
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
   * The type of contract
   * @return contractType
  **/
  @ApiModelProperty(value = "The type of contract")
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
   * The post of the contract
   * @return post
  **/
  @ApiModelProperty(value = "The post of the contract")
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
   * Indicates the role undertaken by the staff member before this contract
   * @return origin
  **/
  @ApiModelProperty(value = "Indicates the role undertaken by the staff member before this contract")
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
   * The destination of the staff member if they have moved on from this contract
   * @return destination
  **/
  @ApiModelProperty(value = "The destination of the staff member if they have moved on from this contract")
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
   * Indicates if the staff member is paid a daily rate
   * @return dailyRate
  **/
  @ApiModelProperty(value = "Indicates if the staff member is paid a daily rate")
  public Boolean isgetDailyRate() {
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
   * Shows the date of the staff member&#39;s most recent pay review
   * @return payReviewDate
  **/
  @ApiModelProperty(value = "Shows the date of the staff member's most recent pay review")
  public OffsetDateTime getPayReviewDate() {
    return payReviewDate;
  }

  public void setPayReviewDate(OffsetDateTime payReviewDate) {
    this.payReviewDate = payReviewDate;
  }

  public StaffContract roles(List<StaffRole> roles) {
    this.roles = roles;
    return this;
  }

  public StaffContract addRolesItem(StaffRole rolesItem) {
    if (this.roles == null) {
      this.roles = new ArrayList<StaffRole>();
    }
    this.roles.add(rolesItem);
    return this;
  }

   /**
   * The roles associated to this contract
   * @return roles
  **/
  @ApiModelProperty(value = "The roles associated to this contract")
  public List<StaffRole> getRoles() {
    return roles;
  }

  public void setRoles(List<StaffRole> roles) {
    this.roles = roles;
  }

  public StaffContract salaries(List<StaffSalary> salaries) {
    this.salaries = salaries;
    return this;
  }

  public StaffContract addSalariesItem(StaffSalary salariesItem) {
    if (this.salaries == null) {
      this.salaries = new ArrayList<StaffSalary>();
    }
    this.salaries.add(salariesItem);
    return this;
  }

   /**
   * The salaries associated with this contract
   * @return salaries
  **/
  @ApiModelProperty(value = "The salaries associated with this contract")
  public List<StaffSalary> getSalaries() {
    return salaries;
  }

  public void setSalaries(List<StaffSalary> salaries) {
    this.salaries = salaries;
  }

  public StaffContract allowances(List<StaffAllowance> allowances) {
    this.allowances = allowances;
    return this;
  }

  public StaffContract addAllowancesItem(StaffAllowance allowancesItem) {
    if (this.allowances == null) {
      this.allowances = new ArrayList<StaffAllowance>();
    }
    this.allowances.add(allowancesItem);
    return this;
  }

   /**
   * The allowances associated with this contract
   * @return allowances
  **/
  @ApiModelProperty(value = "The allowances associated with this contract")
  public List<StaffAllowance> getAllowances() {
    return allowances;
  }

  public void setAllowances(List<StaffAllowance> allowances) {
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

