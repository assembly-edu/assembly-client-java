
# StudentMedicalCondition

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**object** | **String** | Descriminator |  [optional]
**id** | **Integer** | Internal stable ID |  [optional]
**informationReceivedOn** | [**OffsetDateTime**](OffsetDateTime.md) | The date and time that the medical condition was recorded within the MIS |  [optional]
**code** | **String** | The code of the medical condition |  [optional]
**name** | **String** | The name of the medical condition |  [optional]
**notes** | [**List&lt;StudentMedicalNote&gt;**](StudentMedicalNote.md) | Additional information attached to the medical condition |  [optional]



