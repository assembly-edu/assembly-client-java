
# CalendarEvent

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**object** | **String** | Descriminator |  [optional]
**id** | **Integer** | Internal stable ID |  [optional]
**name** | **String** | This details the user-defined \&quot;category\&quot; that the event is assigned to on SIMS. |  [optional]
**description** | **String** | The name of the instance of the event, usually more detailed and specific than the \&quot;name\&quot; |  [optional]
**startDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date and time of when the event starts |  [optional]
**endDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date and time of when the event ends |  [optional]
**isActive** | **Boolean** | Whether the event is active or not |  [optional]
**isRecurrent** | **Boolean** | Whether the event recurs and (soon) details of recurrences |  [optional]
**misType** | [**CalendarEventMisType**](CalendarEventMisType.md) |  |  [optional]



