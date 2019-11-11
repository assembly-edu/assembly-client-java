
# AttendanceSummary

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**object** | **String** | Descriminator |  [optional]
**id** | **Integer** | Internal stable ID |  [optional]
**studentId** | **Integer** | The ID of the student |  [optional]
**registrationGroupId** | **Integer** | The ID of the student&#39;s registration group |  [optional]
**groupId** | **Integer** | The ID of the group that the attendance summary is attached to (requires &#x60;groups&#x60; scope) |  [optional]
**academicYearId** | **Integer** | The ID of the academic year |  [optional]
**startDate** | [**OffsetDateTime**](OffsetDateTime.md) | Start date for the attendance summary |  [optional]
**endDate** | [**OffsetDateTime**](OffsetDateTime.md) | End date for the attendance summary |  [optional]
**possibleSessions** | **Float** | Number of possible sessions that could have been attended |  [optional]
**attendedSessions** | **Float** | Number of sessions with present mark recorded |  [optional]
**lateSessions** | **Float** | Number of sessions with late mark recorded |  [optional]
**authorisedAbsenceSessions** | **Float** | Number of sessions with authorised absence recorded |  [optional]
**unauthorisedAbsenceSessions** | **Float** | Number of sessions with unauthorised absence recorded |  [optional]



