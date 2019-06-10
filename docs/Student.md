
# Student

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**object** | **String** | Descriminator |  [optional]
**id** | **Integer** | Internal stable ID |  [optional]
**yearCode** | **String** | The year group the student currently belongs to |  [optional]
**upn** | **String** | Unique Pupil Number (UPN) - a DfE-mandated 13-character code that identifies each pupil |  [optional]
**formerUpn** | **String** | The previous UPN where a pupil has held another UPN whilst at a school |  [optional]
**uln** | **String** | Unique Learner Number (ULN) - a LRS-mandated 10-character code that identifies each pupil |  [optional]
**misId** | **String** | The ID of a student from the MIS |  [optional]
**pan** | **String** | A student&#39;s \&quot;pupil admission number\&quot;. This field is often exposed in the front end of the MIS, and may be the same as &#x60;mis_id&#x60; |  [optional]
**firstName** | **String** | The first name the student wishes to go by, may be the same as &#x60;legal_first_name&#x60; |  [optional]
**legalFirstName** | **String** | The legal first name of the student |  [optional]
**middleName** | **String** | The middle name of the student |  [optional]
**lastName** | **String** | The last name the student wishes to go by, may be the same as &#x60;legal_last_name&#x60; |  [optional]
**legalLastName** | **String** | The legal first name of the student, may be the same as &#x60;legal_last_name&#x60; |  [optional]
**formerLastName** | **String** | The former last name of the student, may be &#x60;null&#x60; |  [optional]
**dob** | [**OffsetDateTime**](OffsetDateTime.md) | The date of birth of the student |  [optional]
**startDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date that the student first joined the school |  [optional]
**endDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date that the student left the school, or &#x60;null&#x60; if still a current student |  [optional]
**enrolmentStatus** | **String** | The enrolment status of the student |  [optional]
**demographics** | [**StudentDemographics**](StudentDemographics.md) |  |  [optional]
**medical** | [**StudentMedical**](StudentMedical.md) |  |  [optional]
**contacts** | [**List&lt;StudentContacts&gt;**](StudentContacts.md) | A list of contact IDs which are associated with this student, and their relationship |  [optional]
**address** | [**StudentAddress**](StudentAddress.md) |  |  [optional]
**languages** | [**StudentLanguages**](StudentLanguages.md) |  |  [optional]
**photo** | [**StudentPhoto**](StudentPhoto.md) |  |  [optional]



