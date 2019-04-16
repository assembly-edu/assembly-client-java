
# StudentMedical

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**object** | **String** | Descriminator |  [optional]
**nhsNumber** | **String** | Student&#39;s NHS number |  [optional]
**isPregnant** | **Boolean** | If the student has been marked as pregnant |  [optional]
**hasEmergencyConsent** | **Boolean** | Whether or not medical consent has been given |  [optional]
**conditions** | [**List&lt;StudentMedicalCondition&gt;**](StudentMedicalCondition.md) | The medical conditions associated with the student |  [optional]
**dietaryNeeds** | **List&lt;String&gt;** | The dietary need codes associated with the student |  [optional]
**notes** | [**List&lt;StudentMedicalNote&gt;**](StudentMedicalNote.md) | Additional information attached to the medical condition |  [optional]



