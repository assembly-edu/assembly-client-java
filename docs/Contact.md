
# Contact

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**object** | **String** | Object type |  [optional]
**id** | **Integer** | Internal stable ID given to all contacts on the Platform |  [optional]
**firstName** | **String** | The first name of the contact |  [optional]
**middleName** | **String** | The middle name of the contact |  [optional]
**lastName** | **String** | The last name of the contact |  [optional]
**gender** | [**GenderEnum**](#GenderEnum) | The gender of the contact *Values*  |Value|Description| |---|---| |&#x60;F&#x60;|Female| |&#x60;M&#x60;|Male|  |  [optional]
**title** | **String** | The title of the contact |  [optional]
**salutation** | **String** | The salutation for the contact |  [optional]
**emails** | [**List&lt;ContactEmails&gt;**](ContactEmails.md) | A list of emails for the contact |  [optional]
**telephoneNumbers** | [**List&lt;ContactTelephoneNumbers&gt;**](ContactTelephoneNumbers.md) | A list of telephone numbers for the contact |  [optional]
**students** | [**List&lt;ContactStudents&gt;**](ContactStudents.md) | A list of student IDs that the contact is responsible for |  [optional]


<a name="GenderEnum"></a>
## Enum: GenderEnum
Name | Value
---- | -----
F | &quot;F&quot;
M | &quot;M&quot;



