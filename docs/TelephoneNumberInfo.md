
# TelephoneNumberInfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**object** | **String** | Descriminator |  [optional]
**id** | **Integer** | Internal stable ID |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | The location associated with the telephone number |  [optional]
**telephoneNumber** | **String** | The telephone number |  [optional]
**isPrimary** | **Boolean** | Indicates whether this is the primary telephone number |  [optional]


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
HOME | &quot;Home&quot;
WORK | &quot;Work&quot;
MOBILE | &quot;Mobile&quot;
OTHER | &quot;Other&quot;
NULL | &quot;null&quot;



