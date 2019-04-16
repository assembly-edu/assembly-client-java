
# StaffMember

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**object** | **String** | Descriminator |  [optional]
**id** | **Integer** | Internal stable ID |  [optional]
**misId** | **String** | The ID of the staff member from the MIS |  [optional]
**staffCode** | **String** | The staff code from the MIS |  [optional]
**firstName** | **String** | The first name the staff member wishes to go by, may be the same as &#x60;legal_first_name&#x60; |  [optional]
**legalFirstName** | **String** | The legal first name of the staff member |  [optional]
**middleName** | **String** | The middle name of the staff member |  [optional]
**lastName** | **String** | The last name the staff member wishes to go by, may be the same as &#x60;legal_last_name&#x60; |  [optional]
**legalLastName** | **String** | The legal first name of the staff member, may be the same as &#x60;legal_last_name&#x60; |  [optional]
**formerLastName** | **String** | The former last name of the staff member, may be &#x60;null&#x60; |  [optional]
**title** | **String** | The title of the staff member |  [optional]
**dob** | [**OffsetDateTime**](OffsetDateTime.md) | The staff member&#39;s date of birth |  [optional]
**email** | **String** | The email address of the staff member. Deprecated in favour of &#x60;emails&#x60; |  [optional]
**emails** | [**List&lt;EmailInfo&gt;**](EmailInfo.md) | The email addresses of the staff member. |  [optional]
**telephoneNumbers** | [**List&lt;TelephoneNumberInfo&gt;**](TelephoneNumberInfo.md) | A list of telephone numbers for the staff member |  [optional]
**isTeachingStaff** | **Boolean** | Indicates whether the staff member is a teacher |  [optional]
**includedInCensus** | **Boolean** | Indicates whether the staff member is included in official statistical returns |  [optional]
**startDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date the staff member first started working at the school |  [optional]
**endDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date the staff member left the school, or &#x60;null&#x60; if still active |  [optional]
**demographics** | [**StaffMemberDemographics**](StaffMemberDemographics.md) |  |  [optional]
**qualificationInfo** | [**StaffMemberQualificationInfo**](StaffMemberQualificationInfo.md) |  |  [optional]



