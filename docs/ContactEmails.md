
# ContactEmails

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**object** | **String** | Object type |  [optional]
**id** | **Integer** | Internal stable ID given to all email addresses on the Platform |  [optional]
**email** | **String** | The email address |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | The location associated with the email address. *Values*  |Value|Description| |---|---| |&#x60;Home&#x60;|Home| |&#x60;Work&#x60;|Work| |&#x60;null&#x60;|Not Applicable / Unknown| |&#x60;Other&#x60;|Other|  |  [optional]
**isPrimary** | **Boolean** | Indicates whether this is the primary email address |  [optional]


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
HOME | &quot;Home&quot;
WORK | &quot;Work&quot;
NULL | &quot;null&quot;
OTHER | &quot;Other&quot;



