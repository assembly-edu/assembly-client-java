
# TimetableDays

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**object** | **String** | Descriminator |  [optional]
**id** | **Integer** | Internal stable ID |  [optional]
**shortName** | **String** | The day short name |  [optional]
**longName** | **String** | The day long name |  [optional]
**displayOrder** | **Integer** | The order in which days should be displayed |  [optional]
**occursOn** | [**List&lt;LocalDate&gt;**](LocalDate.md) | An array of dates for when the timetabled day occurs. |  [optional]
**periods** | [**List&lt;TimetablePeriods&gt;**](TimetablePeriods.md) | Provides details of the individual periods that make up the day |  [optional]



