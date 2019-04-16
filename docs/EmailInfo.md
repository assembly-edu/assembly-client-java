
# EmailInfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**object** | **String** | Descriminator |  [optional]
**id** | **Integer** | Internal stable ID |  [optional]
**email** | **String** | The email address |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | The location associated with the email address |  [optional]
**isPrimary** | **Boolean** | Indicates whether this is the primary email address |  [optional]


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
HOME | &quot;Home&quot;
WORK | &quot;Work&quot;
OTHER | &quot;Other&quot;
NULL | &quot;null&quot;



