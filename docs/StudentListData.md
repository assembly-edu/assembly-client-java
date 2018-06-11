
# StudentListData

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**object** | **String** | Object type |  [optional]
**id** | **Integer** | Internal stable ID given to students in the Platform |  [optional]
**firstName** | **String** | The first name of the student |  [optional]
**legalFirstName** | **String** | The legal first name of the student |  [optional]
**middleName** | **String** | The middle name of the student |  [optional]
**lastName** | **String** | The last name of the student |  [optional]
**legalLastName** | **String** | The legal last name of the student |  [optional]
**formerLastName** | **String** | The former last name of the student |  [optional]
**dob** | [**LocalDate**](LocalDate.md) | The date of birth of the student |  [optional]
**yearCode** | [**YearCodeEnum**](#YearCodeEnum) | The year group the student currently belongs to *Values*  |Value|Description| |---|---| |&#x60;1&#x60;|Year 1| |&#x60;2&#x60;|Year 2| |&#x60;3&#x60;|Year 3| |&#x60;4&#x60;|Year 4| |&#x60;5&#x60;|Year 5| |&#x60;6&#x60;|Year 6| |&#x60;7&#x60;|Year 7| |&#x60;8&#x60;|Year 8| |&#x60;9&#x60;|Year 9| |&#x60;R&#x60;|Reception| |&#x60;10&#x60;|Year 10| |&#x60;11&#x60;|Year 11| |&#x60;12&#x60;|Year 12| |&#x60;13&#x60;|Year 13| |&#x60;N1&#x60;|Nursery first year| |&#x60;N2&#x60;|Nursery second year|  |  [optional]
**upn** | **String** | Unique Pupil Number (UPN) - a DfE-mandated 13-character code that identifies each pupil |  [optional]
**formerUpn** | **String** | The previous UPN where a pupil has held another UPN whilst at a school |  [optional]
**misId** | **String** | The ID of a student from the MIS |  [optional]
**pan** | **String** | A student&#39;s &#39;Pupil Admission Number&#39;. This field is exposed in the front end of the MIS, and may be the same as mis_id |  [optional]
**startDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date when the student joined the school |  [optional]
**endDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date when the student left the school (this will default to 2079-06-06T23:59:00.000Z) |  [optional]
**enrolmentStatus** | **String** | The enrolment status of the student |  [optional]
**demographics** | [**StudentDemographics**](StudentDemographics.md) |  |  [optional]
**contact** | [**List&lt;ContactListData&gt;**](ContactListData.md) | List of contact IDs for the student. |  [optional]
**addresses** | [**StudentAddresses**](StudentAddresses.md) |  |  [optional]
**languages** | [**StudentLanguages**](StudentLanguages.md) |  |  [optional]


<a name="YearCodeEnum"></a>
## Enum: YearCodeEnum
Name | Value
---- | -----
_1 | &quot;1&quot;
_2 | &quot;2&quot;
_3 | &quot;3&quot;
_4 | &quot;4&quot;
_5 | &quot;5&quot;
_6 | &quot;6&quot;
_7 | &quot;7&quot;
_8 | &quot;8&quot;
_9 | &quot;9&quot;
R | &quot;R&quot;
_10 | &quot;10&quot;
_11 | &quot;11&quot;
_12 | &quot;12&quot;
_13 | &quot;13&quot;
N1 | &quot;N1&quot;
N2 | &quot;N2&quot;



