
# AttendanceListData

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**object** | **String** | Object type |  [optional]
**id** | **Integer** | Internal stable ID given to all attendances on the Platform |  [optional]
**studentId** | **Integer** | The ID of the student that the attendance is attached to |  [optional]
**registrationGroupId** | **Integer** | The ID of the subject that the attendance is attached to |  [optional]
**sessionDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date of the attendance |  [optional]
**sessionName** | **String** | Denotes whether the attendance is an AM session or PM session (morning or afternoon) |  [optional]
**attendanceMark** | **String** | The attendance mark |  [optional]
**minutesLate** | **Integer** | If the attendance mark is &#39;L&#39; for &#39;Late&#39;, how many minutes late the student was |  [optional]
**comments** | **String** | Any additional comments |  [optional]



