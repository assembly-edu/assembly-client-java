
# TimetablePeriods

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**object** | **String** | Descriminator |  [optional]
**id** | **Integer** | Internal stable ID |  [optional]
**shortName** | **String** | The period short name |  [optional]
**longName** | **String** | The period long name |  [optional]
**startDate** | [**OffsetDateTime**](OffsetDateTime.md) | The start time of the period |  [optional]
**endDate** | [**OffsetDateTime**](OffsetDateTime.md) | The end time of the period |  [optional]
**lessons** | [**List&lt;TimetableLessons&gt;**](TimetableLessons.md) | Provides details of the individual lessons that make up the period |  [optional]



