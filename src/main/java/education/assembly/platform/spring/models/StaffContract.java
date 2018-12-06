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
 * StaffContract
 */

public class StaffContract implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("staff_member_id")
  private Integer staffMemberId = null;

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
  private List<StaffRole> roles = null;

  @JsonProperty("salaries")
  private List<StaffSalary> salaries = null;

  @JsonProperty("allowances")
  private List<StaffAllowance> allowances = null;

  public StaffContract id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
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
   * Get staffMemberId
   * @return staffMemberId
  **/
  @ApiModelProperty(value = "")
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
   * Get startDate
   * @return startDate
  **/
  @ApiModelProperty(value = "")
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
   * Get endDate
   * @return endDate
  **/
  @ApiModelProperty(value = "")
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
   * Get nationalInsuranceNumber
   * @return nationalInsuranceNumber
  **/
  @ApiModelProperty(value = "")
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
   * Get payrollNumber
   * @return payrollNumber
  **/
  @ApiModelProperty(value = "")
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
   * Get contractType
   * @return contractType
  **/
  @ApiModelProperty(value = "")
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
   * Get post
   * @return post
  **/
  @ApiModelProperty(value = "")
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
   * Get origin
   * @return origin
  **/
  @ApiModelProperty(value = "")
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
   * Get destination
   * @return destination
  **/
  @ApiModelProperty(value = "")
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
   * Get dailyRate
   * @return dailyRate
  **/
  @ApiModelProperty(value = "")
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
   * Get payReviewDate
   * @return payReviewDate
  **/
  @ApiModelProperty(value = "")
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
   * Get roles
   * @return roles
  **/
  @ApiModelProperty(value = "")
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
   * Get salaries
   * @return salaries
  **/
  @ApiModelProperty(value = "")
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
   * Get allowances
   * @return allowances
  **/
  @ApiModelProperty(value = "")
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
    return Objects.equals(this.id, staffContract.id) &&
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
    return Objects.hash(id, staffMemberId, startDate, endDate, nationalInsuranceNumber, payrollNumber, contractType, post, origin, destination, dailyRate, payReviewDate, roles, salaries, allowances);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StaffContract {\n");
    
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

