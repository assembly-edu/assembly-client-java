
# StudentDemographics

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**object** | **String** | Descriminator |  [optional]
**ethnicityCode** | **String** | A detailed, Dfe standardised way of categorising the ethnicity of a student |  [optional]
**ethnicityGroup** | **String** | A broader categorisation of ethnicity that is standardised across the country, with all ethnicity codes grouped in to 8 sections |  [optional]
**gender** | **String** | The gender of the student |  [optional]
**isPp** | **Boolean** | Pupil Premium (PP) - schools receive extra funding for students who qualify as Pupil Premium. The includes any student who has qualified for Free School Meals (FSM) in the last 6 years, and any student in local-authority care |  [optional]
**ppHistory** | [**List&lt;PpEntitlement&gt;**](PpEntitlement.md) | Pupil Premium (PP) entitlement history |  [optional]
**isEal** | **Boolean** | English as an Additional Language (EAL) - this field will be true for a student whose first language is not English |  [optional]
**senCategory** | **String** | Special Education Need (SEN) - indicates a student has learning difficulties and requires special education provision. Can be null for those not eligible |  [optional]
**senCategoryHistory** | [**List&lt;SenCategory&gt;**](SenCategory.md) | Special Education Need (SEN) category history |  [optional]
**countryOfBirth** | **String** | The country of birth of the student |  [optional]
**nationalities** | **List&lt;String&gt;** | The nationality or nationalities of the student |  [optional]
**fsmReviewDate** | **String** | Free school meal review date -Review date for pupil&#39;s free school meal eligibility |  [optional]
**isFsm** | **Boolean** | Free School Meals (FSM) - indicates if the student is eligible for free school meals |  [optional]
**isFsm6** | **Boolean** | Free School Meals 6 (FSM6) - indicates if the student has been eligible for free school meals within the last 6 years |  [optional]
**fsmHistory** | [**List&lt;FsmEntitlement&gt;**](FsmEntitlement.md) | Free School Meal (FSM) entitlement history |  [optional]
**inCare** | **Boolean** | Looked after status - indicates whether the student is &#39;looked after&#39; by the local authority |  [optional]
**everInCare** | **Boolean** | Ever in care status - indicates whether the student is either currently &#39;looked after&#39;, or has been at any point in the past |  [optional]
**serviceChild** | **Boolean** | Service Child - indicates whether the student has parent(s) who are Service personnel serving in regular military units of all forces and exercising parental care and responsibility |  [optional]
**senNeeds** | [**List&lt;SenNeed&gt;**](SenNeed.md) | Information about a student&#39;s SEN Needs. This will only be returned if &#x60;&amp;sen_needs&#x3D;true&#x60; is included in your request |  [optional]



