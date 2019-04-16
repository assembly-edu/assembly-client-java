
# SchoolStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**object** | **String** | Descriminator |  [optional]
**lastChangesAt** | [**OffsetDateTime**](OffsetDateTime.md) | When the data in the Platform was last changed, this may be recent or several days in the past as it depends  on how regularly the school update their MIS records |  [optional]
**lastSyncAt** | [**OffsetDateTime**](OffsetDateTime.md) | The last time data has been collected (synced) from the source MIS, typically within the last 24 hours. |  [optional]
**lastSyncStatus** | **String** | Whether the last sync was a &#x60;success&#x60;, &#x60;failure&#x60;, or that there were &#x60;no_changes&#x60; |  [optional]



