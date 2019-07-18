
# TimetableStructure

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**object** | **String** | Descriminator |  [optional]
**id** | **Integer** | Internal stable ID |  [optional]
**name** | **String** | The name of the timetable |  [optional]
**description** | **String** | The description of the timetable cycle |  [optional]
**startDate** | [**OffsetDateTime**](OffsetDateTime.md) | The start date of the timetable cycle |  [optional]
**endDate** | [**OffsetDateTime**](OffsetDateTime.md) | The end date of the timetable cycle |  [optional]
**daysPerWeek** | **Integer** | Number of days per week |  [optional]
**periodsPerDay** | **Integer** | Number of periods per day |  [optional]
**days** | [**List&lt;TimetableStructureDays&gt;**](TimetableStructureDays.md) | Provides details of the individual days that make up the timetable |  [optional]



