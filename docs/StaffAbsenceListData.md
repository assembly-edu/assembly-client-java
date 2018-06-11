
# StaffAbsenceListData

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**object** | **String** | Object type |  [optional]
**id** | **Integer** | Internal stable ID given to all absences on the Platform |  [optional]
**staffMemberId** | **Integer** | The ID of the staff member who the absence is for |  [optional]
**startDate** | [**OffsetDateTime**](OffsetDateTime.md) | The start date of the absence |  [optional]
**endDate** | [**OffsetDateTime**](OffsetDateTime.md) | The end date of the absence |  [optional]
**workingDaysLost** | **Float** | Number of working days that were lost during the absence |  [optional]
**absenceCategory** | **String** | The category of the absence |  [optional]
**illnessCategory** | **String** | If the absence category was &#39;Illness&#39;, the specific code |  [optional]
**payRate** | **String** | Whether or not the staff member was paid for the absence, and at what rate |  [optional]



