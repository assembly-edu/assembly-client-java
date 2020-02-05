
# TimetableGroup

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**object** | **String** | Descriminator |  [optional]
**id** | **Integer** | Internal stable ID |  [optional]
**name** | **String** | Name of the group |  [optional]
**code** | **String** | The code of the year that the group belongs to |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | The type of group |  [optional]
**misSubject** | [**TimetableGroupMisSubject**](TimetableGroupMisSubject.md) |  |  [optional]
**subject** | [**MisSubjectSubject**](MisSubjectSubject.md) |  |  [optional]


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
YEARGROUP | &quot;YearGroup&quot;
TEACHINGGROUP | &quot;TeachingGroup&quot;
REGISTRATIONGROUP | &quot;RegistrationGroup&quot;
HOUSEGROUP | &quot;HouseGroup&quot;
NONTEACHINGGROUP | &quot;NonTeachingGroup&quot;



