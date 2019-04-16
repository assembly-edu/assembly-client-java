
# StaffContract

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**object** | **String** | Descriminator |  [optional]
**id** | **Integer** | Internal stable ID |  [optional]
**staffMemberId** | **Integer** | The ID of the staff member |  [optional]
**startDate** | [**OffsetDateTime**](OffsetDateTime.md) | The start date of the contract |  [optional]
**endDate** | [**OffsetDateTime**](OffsetDateTime.md) | The end date of the contract |  [optional]
**nationalInsuranceNumber** | **String** | The staff member&#39;s NI Number |  [optional]
**payrollNumber** | **String** | The staff member&#39;s payroll number |  [optional]
**contractType** | **String** | The type of contract |  [optional]
**post** | **String** | The post of the contract |  [optional]
**origin** | **String** | Indicates the role undertaken by the staff member before this contract |  [optional]
**destination** | **String** | The destination of the staff member if they have moved on from this contract |  [optional]
**dailyRate** | **Boolean** | Indicates if the staff member is paid a daily rate |  [optional]
**payReviewDate** | [**OffsetDateTime**](OffsetDateTime.md) | Shows the date of the staff member&#39;s most recent pay review |  [optional]
**roles** | [**List&lt;StaffRole&gt;**](StaffRole.md) | The roles associated to this contract |  [optional]
**salaries** | [**List&lt;StaffSalary&gt;**](StaffSalary.md) | The salaries associated with this contract |  [optional]
**allowances** | [**List&lt;StaffAllowance&gt;**](StaffAllowance.md) | The allowances associated with this contract |  [optional]



