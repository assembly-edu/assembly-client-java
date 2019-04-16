
# Exclusion

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**object** | **String** | Descriminator |  [optional]
**id** | **Integer** | Internal stable ID |  [optional]
**studentId** | **Integer** | The ID of the student that the exclusion is attached to |  [optional]
**exclusionType** | [**ExclusionTypeEnum**](#ExclusionTypeEnum) | The exclusions type, where &#x60;Reinstated&#x60; may be from a fixed term or permanent exclusion |  [optional]
**exclusionReason** | **String** | The exclusion reason, normalized to values as in Pupil Exclusion Reason (CS010/D00024) in CBDS |  [optional]
**startDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date on which the exclusions starts |  [optional]
**startSession** | **String** | The session (AM/PM) in which the exclusion starts |  [optional]
**endDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date on which the exclusion ends |  [optional]
**endSession** | **String** | The session (AM/PM) in which the exclusion ends |  [optional]
**exclusionLength** | **Integer** | The total length, in sessions, of the exclusion |  [optional]


<a name="ExclusionTypeEnum"></a>
## Enum: ExclusionTypeEnum
Name | Value
---- | -----
FIXED_TERM | &quot;Fixed Term&quot;
LUNCHTIME | &quot;Lunchtime&quot;
PERMANENT | &quot;Permanent&quot;
REINSTATED | &quot;Reinstated&quot;



