
# TimetableLessons

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**object** | **String** | Descriminator |  [optional]
**id** | **Integer** | Internal stable ID |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | The start date of the lesson |  [optional]
**group** | [**TimetableGroup**](TimetableGroup.md) |  |  [optional]
**startDate** | [**OffsetDateTime**](OffsetDateTime.md) | The start date of the lesson |  [optional]
**endDate** | [**OffsetDateTime**](OffsetDateTime.md) | The end date of the lesson |  [optional]
**supervisors** | [**List&lt;TimetableSupervisors&gt;**](TimetableSupervisors.md) | The ID of a staff member who supervises a group and their role. |  [optional]
**rooms** | [**List&lt;LessonRooms&gt;**](LessonRooms.md) | Provides details of the rooms that a lessons is assigned to |  [optional]


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
SCHEDULED | &quot;Scheduled&quot;
ROOMCOVER | &quot;RoomCover&quot;
STAFFCOVER | &quot;StaffCover&quot;
INVIGILATIONCOVER | &quot;InvigilationCover&quot;



