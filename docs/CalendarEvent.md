
# CalendarEvent

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**object** | **String** | Descriminator |  [optional]
**id** | **Integer** | Internal stable ID |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | The type of the event |  [optional]
**name** | **String** | This details the user-defined \&quot;category\&quot; that the event is assigned to on SIMS. |  [optional]
**description** | **String** | The name of the instance of the event, usually more detailed and specific than the \&quot;name\&quot; |  [optional]
**startDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date and time of when the event starts |  [optional]
**endDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date and time of when the event ends |  [optional]


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
EVENT | &quot;Event&quot;
MEETING | &quot;Meeting&quot;
INSET | &quot;Inset&quot;
HOLIDAY | &quot;Holiday&quot;



