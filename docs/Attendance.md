
# Attendance

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**object** | **String** | Descriminator |  [optional]
**id** | **Integer** | Internal stable ID |  [optional]
**studentId** | **Integer** | The ID of the student that the attendance is attached to |  [optional]
**registrationGroupId** | **Integer** | The ID of the registration group that the attendance is attached to |  [optional]
**groupId** | **Integer** | The ID of the group that the attendance is attached to (requires &#x60;groups&#x60; scope) |  [optional]
**sessionDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date of the attendance |  [optional]
**sessionName** | **String** | Denotes whether the attendance is an AM session or PM session (morning or afternoon) |  [optional]
**attendanceMark** | **String** | The attendance mark standardised to code set CS066/D00225 in CBDS |  [optional]
**minutesLate** | **Integer** | If the attendance mark is \&quot;L\&quot; for \&quot;Late\&quot;, how many minutes late the student was |  [optional]
**comments** | **String** | Any additional comments |  [optional]



