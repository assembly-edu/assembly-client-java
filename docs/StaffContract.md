
# StaffContract

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**object** | **String** | Object type |  [optional]
**id** | **Integer** | Internal stable ID given to each contract in the Platform |  [optional]
**staffMemberId** | **String** | The ID of the staff member |  [optional]
**startDate** | [**OffsetDateTime**](OffsetDateTime.md) | Contract start date |  [optional]
**endDate** | [**OffsetDateTime**](OffsetDateTime.md) | Contract end date |  [optional]
**nationalInsuranceNumber** | **String** | Employee NI number |  [optional]
**payrollNumber** | **String** | Employee payroll number |  [optional]
**contractType** | **String** | Contract type |  [optional]
**post** | **String** | No description |  [optional]
**origin** | **String** | No description |  [optional]
**destination** | **String** | Completed after a contract has been terminated; this captures a post-holder’s destination |  [optional]
**dailyRate** | **Boolean** | No description |  [optional]
**payReviewDate** | [**OffsetDateTime**](OffsetDateTime.md) | No description |  [optional]
**roles** | [**List&lt;StaffContractRoles&gt;**](StaffContractRoles.md) | No description |  [optional]
**salaries** | [**List&lt;StaffContractSalaries&gt;**](StaffContractSalaries.md) | No description |  [optional]
**allowances** | [**List&lt;StaffContractAllowances&gt;**](StaffContractAllowances.md) | No description |  [optional]



