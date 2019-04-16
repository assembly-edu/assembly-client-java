
# TeachingGroup

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**object** | **String** | Descriminator |  [optional]
**id** | **Integer** | Internal stable ID |  [optional]
**name** | **String** | Name of teaching group |  [optional]
**startDate** | [**OffsetDateTime**](OffsetDateTime.md) | The start date of the teaching group |  [optional]
**endDate** | [**OffsetDateTime**](OffsetDateTime.md) | The end date of the teaching group |  [optional]
**academicYearId** | **Integer** | The ID of the academic year |  [optional]
**supervisorIds** | **List&lt;Integer&gt;** | The IDs of supervisors (staff members) associated with the teaching group |  [optional]
**studentIds** | **List&lt;Integer&gt;** | The IDs of members (students) associated with the teaching group |  [optional]
**subject** | [**Subject**](Subject.md) |  |  [optional]
**misLevel** | **String** | The official examination or assessment \&quot;level\&quot; of the teaching group taken directly from the MIS |  [optional]
**assessment** | [**Assessment**](Assessment.md) |  |  [optional]



