
# StudentDemographics

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**object** | **String** | Object type |  [optional]
**ethnicityCode** | **String** | A detailed, Dfe standardised way of categorising the ethnicity of a student |  [optional]
**ethnicityGroup** | **String** | A broader categorisation of ethnicity that is standardised across the country, with all ethnicity codes grouped in to 8 sections |  [optional]
**gender** | [**GenderEnum**](#GenderEnum) | The gender of the student *Values*  |Value|Description| |---|---| |&#x60;F&#x60;|Female| |&#x60;M&#x60;|Male|  |  [optional]
**inCare** | **Boolean** | Looked after status - indicates whether the student is &#39;looked after&#39; by the local authority (this field will only be returned if &amp;demographics&#x3D;true and &amp;care&#x3D;true is included in your request) |  [optional]
**isEal** | **Boolean** | English as an Additional Language (EAL) - this field will be true for a student whose first language is not English |  [optional]
**isFsm** | **Boolean** | Free School Meals (FSM) - indicates if the student is eligible for free school meals |  [optional]
**fsmReviewDate** | [**OffsetDateTime**](OffsetDateTime.md) | Free school meal review date -Review date for pupil&#39;s free school meal eligibility |  [optional]
**isPp** | **Boolean** | Pupil Premium (PP) - schools receive extra funding for students who qualify as Pupil Premium. The includes any student who has qualified for Free School Meals (FSM) in the last 6 years, and any student in local-authority care |  [optional]
**senCategory** | [**SenCategoryEnum**](#SenCategoryEnum) | Special Education Need (SEN) - indicates a student has learning difficulties and requires special education provision. *Values*  |Value|Description| |---|---| |&#x60;A&#x60;|School Action (no longer valid)| |&#x60;E&#x60;|Education, Health and Care Plan| |&#x60;K&#x60;|SEN Support| |&#x60;N&#x60;|None| |&#x60;P&#x60;|School Action Plus (no longer valid)| |&#x60;S&#x60;|Statement| |&#x60;null&#x60;|Not eligable|  |  [optional]
**senNeeds** | [**StudentDemographicsSenNeeds**](StudentDemographicsSenNeeds.md) |  |  [optional]
**countryOfBirth** | **String** | The country of birth of the student |  [optional]
**nationalities** | **List&lt;String&gt;** | The nationality or nationalities of the student |  [optional]


<a name="GenderEnum"></a>
## Enum: GenderEnum
Name | Value
---- | -----
F | &quot;F&quot;
M | &quot;M&quot;


<a name="SenCategoryEnum"></a>
## Enum: SenCategoryEnum
Name | Value
---- | -----
A | &quot;A&quot;
E | &quot;E&quot;
K | &quot;K&quot;
N | &quot;N&quot;
P | &quot;P&quot;
S | &quot;S&quot;
NULL | &quot;null&quot;



