
# CalendarEventListData

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**object** | **String** | Object type |  [optional]
**id** | **Integer** | Internal stable ID given to all calendar events on the Platform |  [optional]
**name** | **String** | This details the user-defined &#39;category&#39; that the event is assigned to on SIMS. |  [optional]
**description** | **String** | The name of the instance of the event, usually more detailed and specific than the &#39;name&#39; |  [optional]
**startDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date and time of when the event starts |  [optional]
**endDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date and time of when the event ends |  [optional]
**isActive** | **Boolean** | Whether the event is active or not |  [optional]
**isRecurrent** | **Boolean** | Whether the event recurs and (soon) details of recurrences |  [optional]
**misType** | [**CalendarEventMisType**](CalendarEventMisType.md) |  |  [optional]



