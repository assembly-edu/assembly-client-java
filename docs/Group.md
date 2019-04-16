
# Group

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**object** | **String** | Descriminator |  [optional]
**id** | **Integer** | Internal stable ID |  [optional]
**name** | **String** | Name of the group |  [optional]
**code** | **String** | The code of the year that the group belongs to |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | The type of group |  [optional]
**startDate** | [**OffsetDateTime**](OffsetDateTime.md) | The start date of the group |  [optional]
**endDate** | [**OffsetDateTime**](OffsetDateTime.md) | The end date of the group |  [optional]
**supervisors** | [**List&lt;Supervisor&gt;**](Supervisor.md) | The IDs of supervisors (staff members) associated with the group and their role |  [optional]
**studentIds** | **List&lt;Integer&gt;** | The IDs of members (students) associated with the group |  [optional]


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
YEARGROUP | &quot;YearGroup&quot;
TEACHINGGROUP | &quot;TeachingGroup&quot;
REGISTRATIONGROUP | &quot;RegistrationGroup&quot;



