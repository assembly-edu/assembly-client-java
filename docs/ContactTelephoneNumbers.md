
# ContactTelephoneNumbers

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**object** | **String** | Object type |  [optional]
**id** | **Integer** | Internal stable ID given to all telephone numbers on the Platform |  [optional]
**telephoneNumber** | **String** | The telephone number |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | The location associated with the telephone number. *Values*  |Value|Description| |---|---| |&#x60;Home&#x60;|Home| |&#x60;Work&#x60;|Work| |&#x60;null&#x60;|Not Applicable / Unknown| |&#x60;Other&#x60;|Other|  |  [optional]
**isPrimary** | **Boolean** | Indicates whether this is the primary telephone number |  [optional]


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
HOME | &quot;Home&quot;
WORK | &quot;Work&quot;
NULL | &quot;null&quot;
OTHER | &quot;Other&quot;



