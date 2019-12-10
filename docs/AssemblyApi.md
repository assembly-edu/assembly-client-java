# AssemblyApi

All URIs are relative to *https://api-sandbox.assembly.education*

Method | HTTP request | Description
------------- | ------------- | -------------
[**bulkUpdateResults**](AssemblyApi.md#bulkUpdateResults) | **PATCH** /results | Update Multiple Results
[**createResult**](AssemblyApi.md#createResult) | **POST** /results | Write Results
[**findAcademicYear**](AssemblyApi.md#findAcademicYear) | **GET** /academic_years/{id} | View an Academic Year
[**findAssessment**](AssemblyApi.md#findAssessment) | **GET** /assessments/{id} | View an Assessment
[**findAssessmentGradeSet**](AssemblyApi.md#findAssessmentGradeSet) | **GET** /assessments/{id}/grade_set | View Grade Set for an Assessment
[**findAssessmentPoint**](AssemblyApi.md#findAssessmentPoint) | **GET** /assessment_points/{assessment_point_rank} | View an Assessment Point
[**findDietaryNeed**](AssemblyApi.md#findDietaryNeed) | **GET** /school/dietary_needs/{id} | View a Dietary Need
[**findFacet**](AssemblyApi.md#findFacet) | **GET** /facets/{id} | View a Facet
[**findGradeSet**](AssemblyApi.md#findGradeSet) | **GET** /grade_sets/{id} | View a Grade Set
[**findGroup**](AssemblyApi.md#findGroup) | **GET** /groups/{id} | View a Group
[**findLearningAim**](AssemblyApi.md#findLearningAim) | **GET** /school/learning_aims/{id} | View a Post-16 Learning Aim
[**findMedicalCondition**](AssemblyApi.md#findMedicalCondition) | **GET** /school/medical_conditions/{id} | View a Medical Condition
[**findRegistrationGroup**](AssemblyApi.md#findRegistrationGroup) | **GET** /registration_groups/{id} | View a Registration Group
[**findRoom**](AssemblyApi.md#findRoom) | **GET** /rooms/{id} | View a Room
[**findSchool**](AssemblyApi.md#findSchool) | **GET** /school | View School Details
[**findStaffMember**](AssemblyApi.md#findStaffMember) | **GET** /staff_members/{id} | View a Staff Member
[**findStudent**](AssemblyApi.md#findStudent) | **GET** /students/{id} | View a Student
[**findTeachingGroup**](AssemblyApi.md#findTeachingGroup) | **GET** /teaching_groups/{id} | View a Teaching Group
[**findTimetable**](AssemblyApi.md#findTimetable) | **GET** /timetables/{id} | View a Timetable
[**findYearGroup**](AssemblyApi.md#findYearGroup) | **GET** /year_groups/{id} | View a Year Group
[**getAcademicYears**](AssemblyApi.md#getAcademicYears) | **GET** /academic_years | List Academic Years
[**getAssessmentPointResults**](AssemblyApi.md#getAssessmentPointResults) | **GET** /assessment_points/{assessment_point_rank}/results | View Results for an Assessment Point
[**getAssessmentPoints**](AssemblyApi.md#getAssessmentPoints) | **GET** /assessment_points | List Assessment Points
[**getAssessmentResults**](AssemblyApi.md#getAssessmentResults) | **GET** /assessments/{id}/results | View Results for an Assessment
[**getAssessments**](AssemblyApi.md#getAssessments) | **GET** /assessments | List Assessments
[**getAttendanceSummaries**](AssemblyApi.md#getAttendanceSummaries) | **GET** /attendances/summaries | List Attendance Summaries
[**getAttendances**](AssemblyApi.md#getAttendances) | **GET** /attendances | List Attendances
[**getCalendarEvents**](AssemblyApi.md#getCalendarEvents) | **GET** /calendar_events | List Calendar Events
[**getClosures**](AssemblyApi.md#getClosures) | **GET** /rooms/{id}/closures | List Closures For a Room
[**getContacts**](AssemblyApi.md#getContacts) | **GET** /contacts | List Contacts
[**getDietaryNeeds**](AssemblyApi.md#getDietaryNeeds) | **GET** /school/dietary_needs | List Dietary Needs
[**getExclusions**](AssemblyApi.md#getExclusions) | **GET** /exclusions | List Exclusions
[**getFacets**](AssemblyApi.md#getFacets) | **GET** /facets | List Facets
[**getGradeSets**](AssemblyApi.md#getGradeSets) | **GET** /grade_sets | List Grade Sets
[**getGroupStudents**](AssemblyApi.md#getGroupStudents) | **GET** /groups/{id}/students | List Students for Group
[**getGroups**](AssemblyApi.md#getGroups) | **GET** /groups | List Groups
[**getLearningAims**](AssemblyApi.md#getLearningAims) | **GET** /school/learning_aims | List Post-16 Learning Aims
[**getLeftStaffMembers**](AssemblyApi.md#getLeftStaffMembers) | **GET** /staff_members/left | List Left Staff Members
[**getLeftStudents**](AssemblyApi.md#getLeftStudents) | **GET** /students/left | List Left Students
[**getLessons**](AssemblyApi.md#getLessons) | **GET** /rooms/{id}/lessons | List Lessons For a Room
[**getMedicalConditions**](AssemblyApi.md#getMedicalConditions) | **GET** /school/medical_conditions | List Medical Conditions
[**getRegistrationGroupStudents**](AssemblyApi.md#getRegistrationGroupStudents) | **GET** /registration_groups/{id}/students | List Students for Registration Group
[**getRegistrationGroups**](AssemblyApi.md#getRegistrationGroups) | **GET** /registration_groups | List Registration Groups
[**getResults**](AssemblyApi.md#getResults) | **GET** /results | List Results
[**getRooms**](AssemblyApi.md#getRooms) | **GET** /rooms | List Rooms
[**getStaffAbsences**](AssemblyApi.md#getStaffAbsences) | **GET** /staff_absences | List Staff Absences
[**getStaffContracts**](AssemblyApi.md#getStaffContracts) | **GET** /staff_contracts | List Staff Contracts
[**getStaffMembers**](AssemblyApi.md#getStaffMembers) | **GET** /staff_members | List Staff Members
[**getStudents**](AssemblyApi.md#getStudents) | **GET** /students | List Students
[**getSubjects**](AssemblyApi.md#getSubjects) | **GET** /subjects | List Subjects
[**getTeachingGroupStudents**](AssemblyApi.md#getTeachingGroupStudents) | **GET** /teaching_groups/{id}/students | List Students for Teaching Group
[**getTeachingGroups**](AssemblyApi.md#getTeachingGroups) | **GET** /teaching_groups | List Teaching Groups
[**getTimetables**](AssemblyApi.md#getTimetables) | **GET** /timetables | List Timetables
[**getYearGroupStudents**](AssemblyApi.md#getYearGroupStudents) | **GET** /year_groups/{id}/students | List Students for Year Group
[**getYearGroups**](AssemblyApi.md#getYearGroups) | **GET** /year_groups | List Year Groups
[**status**](AssemblyApi.md#status) | **GET** /school/status | View School Sync Status
[**updateResults**](AssemblyApi.md#updateResults) | **PATCH** /results/{id} | Update a Single Result


<a name="bulkUpdateResults"></a>
# **bulkUpdateResults**
> BulkResultResponse bulkUpdateResults(bulkResultsBody)

Update Multiple Results

Multiple results can be updated simultaneously by providing the relevant &#x60;result_ids&#x60; in the body of your request. The response will tell you whether the batch of updates has either been successful or failed

### Example
```java
// Import classes:
//import education.assembly.platform.spring.ApiClient;
//import education.assembly.platform.spring.ApiException;
//import education.assembly.platform.spring.Configuration;
//import education.assembly.platform.spring.auth.*;
//import education.assembly.platform.spring.AssemblyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: SchoolToken
HttpBasicAuth SchoolToken = (HttpBasicAuth) defaultClient.getAuthentication("SchoolToken");
SchoolToken.setUsername("YOUR USERNAME");
SchoolToken.setPassword("YOUR PASSWORD");

AssemblyApi apiInstance = new AssemblyApi();
BulkResultsBody bulkResultsBody = new BulkResultsBody(); // BulkResultsBody | 
try {
    BulkResultResponse result = apiInstance.bulkUpdateResults(bulkResultsBody);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssemblyApi#bulkUpdateResults");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bulkResultsBody** | [**BulkResultsBody**](BulkResultsBody.md)|  | [optional]

### Return type

[**BulkResultResponse**](BulkResultResponse.md)

### Authorization

[SchoolToken](../README.md#SchoolToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.assembly+json; version=1.1

<a name="createResult"></a>
# **createResult**
> List&lt;Result&gt; createResult(resultBody)

Write Results

Given a &#x60;subject_id&#x60;, &#x60;facet_id&#x60;, &#x60;assessment_point_rank&#x60; and &#x60;assessment_id&#x60; results can be sent to the Platform, along with a &#x60;student_id&#x60;, the &#x60;grade_id&#x60; and (optionally) the &#x60;result_date&#x60;

### Example
```java
// Import classes:
//import education.assembly.platform.spring.ApiClient;
//import education.assembly.platform.spring.ApiException;
//import education.assembly.platform.spring.Configuration;
//import education.assembly.platform.spring.auth.*;
//import education.assembly.platform.spring.AssemblyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: SchoolToken
HttpBasicAuth SchoolToken = (HttpBasicAuth) defaultClient.getAuthentication("SchoolToken");
SchoolToken.setUsername("YOUR USERNAME");
SchoolToken.setPassword("YOUR PASSWORD");

AssemblyApi apiInstance = new AssemblyApi();
ResultBody resultBody = new ResultBody(); // ResultBody | 
try {
    List<Result> result = apiInstance.createResult(resultBody);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssemblyApi#createResult");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resultBody** | [**ResultBody**](ResultBody.md)|  | [optional]

### Return type

[**List&lt;Result&gt;**](Result.md)

### Authorization

[SchoolToken](../README.md#SchoolToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.assembly+json; version=1.1

<a name="findAcademicYear"></a>
# **findAcademicYear**
> AcademicYear findAcademicYear(id)

View an Academic Year

Returns a single academic year for the school associated with the provided &#x60;access_token&#x60;

### Example
```java
// Import classes:
//import education.assembly.platform.spring.ApiClient;
//import education.assembly.platform.spring.ApiException;
//import education.assembly.platform.spring.Configuration;
//import education.assembly.platform.spring.auth.*;
//import education.assembly.platform.spring.AssemblyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: SchoolToken
HttpBasicAuth SchoolToken = (HttpBasicAuth) defaultClient.getAuthentication("SchoolToken");
SchoolToken.setUsername("YOUR USERNAME");
SchoolToken.setPassword("YOUR PASSWORD");

AssemblyApi apiInstance = new AssemblyApi();
Integer id = 56; // Integer | Internal identifier of the entity
try {
    AcademicYear result = apiInstance.findAcademicYear(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssemblyApi#findAcademicYear");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Internal identifier of the entity |

### Return type

[**AcademicYear**](AcademicYear.md)

### Authorization

[SchoolToken](../README.md#SchoolToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.assembly+json; version=1.1

<a name="findAssessment"></a>
# **findAssessment**
> Assessment findAssessment(id)

View an Assessment

Returns a single assessment for the given ID

### Example
```java
// Import classes:
//import education.assembly.platform.spring.ApiClient;
//import education.assembly.platform.spring.ApiException;
//import education.assembly.platform.spring.Configuration;
//import education.assembly.platform.spring.auth.*;
//import education.assembly.platform.spring.AssemblyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: SchoolToken
HttpBasicAuth SchoolToken = (HttpBasicAuth) defaultClient.getAuthentication("SchoolToken");
SchoolToken.setUsername("YOUR USERNAME");
SchoolToken.setPassword("YOUR PASSWORD");

AssemblyApi apiInstance = new AssemblyApi();
Integer id = 56; // Integer | Internal identifier of the entity
try {
    Assessment result = apiInstance.findAssessment(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssemblyApi#findAssessment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Internal identifier of the entity |

### Return type

[**Assessment**](Assessment.md)

### Authorization

[SchoolToken](../README.md#SchoolToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.assembly+json; version=1.1

<a name="findAssessmentGradeSet"></a>
# **findAssessmentGradeSet**
> GradeSet findAssessmentGradeSet(id)

View Grade Set for an Assessment

Returns a &#x60;grade_set&#x60; (an acceptable list of values) for the assessment identifierentified by the &#x60;assessment_id&#x60;. Grades should be written back to the Platform using the &#x60;grade_id&#x60;

### Example
```java
// Import classes:
//import education.assembly.platform.spring.ApiClient;
//import education.assembly.platform.spring.ApiException;
//import education.assembly.platform.spring.Configuration;
//import education.assembly.platform.spring.auth.*;
//import education.assembly.platform.spring.AssemblyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: SchoolToken
HttpBasicAuth SchoolToken = (HttpBasicAuth) defaultClient.getAuthentication("SchoolToken");
SchoolToken.setUsername("YOUR USERNAME");
SchoolToken.setPassword("YOUR PASSWORD");

AssemblyApi apiInstance = new AssemblyApi();
Integer id = 56; // Integer | Internal identifier of the entity
try {
    GradeSet result = apiInstance.findAssessmentGradeSet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssemblyApi#findAssessmentGradeSet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Internal identifier of the entity |

### Return type

[**GradeSet**](GradeSet.md)

### Authorization

[SchoolToken](../README.md#SchoolToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.assembly+json; version=1.1

<a name="findAssessmentPoint"></a>
# **findAssessmentPoint**
> AssessmentPoint findAssessmentPoint(assessmentPointRank)

View an Assessment Point

Returns a single assessment point for the given rank

### Example
```java
// Import classes:
//import education.assembly.platform.spring.ApiClient;
//import education.assembly.platform.spring.ApiException;
//import education.assembly.platform.spring.Configuration;
//import education.assembly.platform.spring.auth.*;
//import education.assembly.platform.spring.AssemblyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: SchoolToken
HttpBasicAuth SchoolToken = (HttpBasicAuth) defaultClient.getAuthentication("SchoolToken");
SchoolToken.setUsername("YOUR USERNAME");
SchoolToken.setPassword("YOUR PASSWORD");

AssemblyApi apiInstance = new AssemblyApi();
Integer assessmentPointRank = 56; // Integer | The rank of the assessment point as an Integer
try {
    AssessmentPoint result = apiInstance.findAssessmentPoint(assessmentPointRank);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssemblyApi#findAssessmentPoint");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assessmentPointRank** | **Integer**| The rank of the assessment point as an Integer |

### Return type

[**AssessmentPoint**](AssessmentPoint.md)

### Authorization

[SchoolToken](../README.md#SchoolToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.assembly+json; version=1.1

<a name="findDietaryNeed"></a>
# **findDietaryNeed**
> DietaryNeed findDietaryNeed(id)

View a Dietary Need

Returns a single dietary need for the given ID

### Example
```java
// Import classes:
//import education.assembly.platform.spring.ApiClient;
//import education.assembly.platform.spring.ApiException;
//import education.assembly.platform.spring.Configuration;
//import education.assembly.platform.spring.auth.*;
//import education.assembly.platform.spring.AssemblyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: SchoolToken
HttpBasicAuth SchoolToken = (HttpBasicAuth) defaultClient.getAuthentication("SchoolToken");
SchoolToken.setUsername("YOUR USERNAME");
SchoolToken.setPassword("YOUR PASSWORD");

AssemblyApi apiInstance = new AssemblyApi();
Integer id = 56; // Integer | Internal identifier of the entity
try {
    DietaryNeed result = apiInstance.findDietaryNeed(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssemblyApi#findDietaryNeed");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Internal identifier of the entity |

### Return type

[**DietaryNeed**](DietaryNeed.md)

### Authorization

[SchoolToken](../README.md#SchoolToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.assembly+json; version=1.1

<a name="findFacet"></a>
# **findFacet**
> Facet findFacet(id)

View a Facet

Returns a single facet for the given ID

### Example
```java
// Import classes:
//import education.assembly.platform.spring.ApiClient;
//import education.assembly.platform.spring.ApiException;
//import education.assembly.platform.spring.Configuration;
//import education.assembly.platform.spring.auth.*;
//import education.assembly.platform.spring.AssemblyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: SchoolToken
HttpBasicAuth SchoolToken = (HttpBasicAuth) defaultClient.getAuthentication("SchoolToken");
SchoolToken.setUsername("YOUR USERNAME");
SchoolToken.setPassword("YOUR PASSWORD");

AssemblyApi apiInstance = new AssemblyApi();
Integer id = 56; // Integer | Internal identifier of the entity
try {
    Facet result = apiInstance.findFacet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssemblyApi#findFacet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Internal identifier of the entity |

### Return type

[**Facet**](Facet.md)

### Authorization

[SchoolToken](../README.md#SchoolToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.assembly+json; version=1.1

<a name="findGradeSet"></a>
# **findGradeSet**
> GradeSet findGradeSet(id)

View a Grade Set

Returns a single grade set for the given ID

### Example
```java
// Import classes:
//import education.assembly.platform.spring.ApiClient;
//import education.assembly.platform.spring.ApiException;
//import education.assembly.platform.spring.Configuration;
//import education.assembly.platform.spring.auth.*;
//import education.assembly.platform.spring.AssemblyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: SchoolToken
HttpBasicAuth SchoolToken = (HttpBasicAuth) defaultClient.getAuthentication("SchoolToken");
SchoolToken.setUsername("YOUR USERNAME");
SchoolToken.setPassword("YOUR PASSWORD");

AssemblyApi apiInstance = new AssemblyApi();
Integer id = 56; // Integer | Internal identifier of the entity
try {
    GradeSet result = apiInstance.findGradeSet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssemblyApi#findGradeSet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Internal identifier of the entity |

### Return type

[**GradeSet**](GradeSet.md)

### Authorization

[SchoolToken](../README.md#SchoolToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.assembly+json; version=1.1

<a name="findGroup"></a>
# **findGroup**
> Group findGroup(id, date)

View a Group

Returns a list of groups that match the given set of filters

### Example
```java
// Import classes:
//import education.assembly.platform.spring.ApiClient;
//import education.assembly.platform.spring.ApiException;
//import education.assembly.platform.spring.Configuration;
//import education.assembly.platform.spring.auth.*;
//import education.assembly.platform.spring.AssemblyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: SchoolToken
HttpBasicAuth SchoolToken = (HttpBasicAuth) defaultClient.getAuthentication("SchoolToken");
SchoolToken.setUsername("YOUR USERNAME");
SchoolToken.setPassword("YOUR PASSWORD");

AssemblyApi apiInstance = new AssemblyApi();
Integer id = 56; // Integer | Internal identifier of the entity
OffsetDateTime date = new OffsetDateTime(); // OffsetDateTime | Filter by a specific date, used as the `start_date` and `end_date` where applicable
try {
    Group result = apiInstance.findGroup(id, date);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssemblyApi#findGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Internal identifier of the entity |
 **date** | **OffsetDateTime**| Filter by a specific date, used as the &#x60;start_date&#x60; and &#x60;end_date&#x60; where applicable | [optional]

### Return type

[**Group**](Group.md)

### Authorization

[SchoolToken](../README.md#SchoolToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.assembly+json; version=1.1

<a name="findLearningAim"></a>
# **findLearningAim**
> LearningAim findLearningAim(id)

View a Post-16 Learning Aim

Returns a Post-16 Learning Aim retrieved by ID

### Example
```java
// Import classes:
//import education.assembly.platform.spring.ApiClient;
//import education.assembly.platform.spring.ApiException;
//import education.assembly.platform.spring.Configuration;
//import education.assembly.platform.spring.auth.*;
//import education.assembly.platform.spring.AssemblyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: SchoolToken
HttpBasicAuth SchoolToken = (HttpBasicAuth) defaultClient.getAuthentication("SchoolToken");
SchoolToken.setUsername("YOUR USERNAME");
SchoolToken.setPassword("YOUR PASSWORD");

AssemblyApi apiInstance = new AssemblyApi();
Integer id = 56; // Integer | Internal identifier of the entity
try {
    LearningAim result = apiInstance.findLearningAim(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssemblyApi#findLearningAim");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Internal identifier of the entity |

### Return type

[**LearningAim**](LearningAim.md)

### Authorization

[SchoolToken](../README.md#SchoolToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.assembly+json; version=1.1

<a name="findMedicalCondition"></a>
# **findMedicalCondition**
> MedicalCondition findMedicalCondition(id)

View a Medical Condition

Returns a single medical condition for the given ID

### Example
```java
// Import classes:
//import education.assembly.platform.spring.ApiClient;
//import education.assembly.platform.spring.ApiException;
//import education.assembly.platform.spring.Configuration;
//import education.assembly.platform.spring.auth.*;
//import education.assembly.platform.spring.AssemblyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: SchoolToken
HttpBasicAuth SchoolToken = (HttpBasicAuth) defaultClient.getAuthentication("SchoolToken");
SchoolToken.setUsername("YOUR USERNAME");
SchoolToken.setPassword("YOUR PASSWORD");

AssemblyApi apiInstance = new AssemblyApi();
Integer id = 56; // Integer | Internal identifier of the entity
try {
    MedicalCondition result = apiInstance.findMedicalCondition(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssemblyApi#findMedicalCondition");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Internal identifier of the entity |

### Return type

[**MedicalCondition**](MedicalCondition.md)

### Authorization

[SchoolToken](../README.md#SchoolToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.assembly+json; version=1.1

<a name="findRegistrationGroup"></a>
# **findRegistrationGroup**
> RegistrationGroup findRegistrationGroup(id, date)

View a Registration Group

Returns a list of registration groups that match the given set of filters

### Example
```java
// Import classes:
//import education.assembly.platform.spring.ApiClient;
//import education.assembly.platform.spring.ApiException;
//import education.assembly.platform.spring.Configuration;
//import education.assembly.platform.spring.auth.*;
//import education.assembly.platform.spring.AssemblyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: SchoolToken
HttpBasicAuth SchoolToken = (HttpBasicAuth) defaultClient.getAuthentication("SchoolToken");
SchoolToken.setUsername("YOUR USERNAME");
SchoolToken.setPassword("YOUR PASSWORD");

AssemblyApi apiInstance = new AssemblyApi();
Integer id = 56; // Integer | Internal identifier of the entity
OffsetDateTime date = new OffsetDateTime(); // OffsetDateTime | Filter by a specific date, used as the `start_date` and `end_date` where applicable
try {
    RegistrationGroup result = apiInstance.findRegistrationGroup(id, date);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssemblyApi#findRegistrationGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Internal identifier of the entity |
 **date** | **OffsetDateTime**| Filter by a specific date, used as the &#x60;start_date&#x60; and &#x60;end_date&#x60; where applicable | [optional]

### Return type

[**RegistrationGroup**](RegistrationGroup.md)

### Authorization

[SchoolToken](../README.md#SchoolToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.assembly+json; version=1.1

<a name="findRoom"></a>
# **findRoom**
> Room findRoom(id, ifModifiedSince, date, startDate, endDate)

View a Room

Returns a single room for the school associated with the provided &#x60;access_token&#x60;

### Example
```java
// Import classes:
//import education.assembly.platform.spring.ApiClient;
//import education.assembly.platform.spring.ApiException;
//import education.assembly.platform.spring.Configuration;
//import education.assembly.platform.spring.auth.*;
//import education.assembly.platform.spring.AssemblyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: SchoolToken
HttpBasicAuth SchoolToken = (HttpBasicAuth) defaultClient.getAuthentication("SchoolToken");
SchoolToken.setUsername("YOUR USERNAME");
SchoolToken.setPassword("YOUR PASSWORD");

AssemblyApi apiInstance = new AssemblyApi();
Integer id = 56; // Integer | Internal identifier of the entity
OffsetDateTime ifModifiedSince = new OffsetDateTime(); // OffsetDateTime | Filter results since it was last fetched (see [Conditional Requests](/#section/Concepts/Conditional-Requests))
String date = "date_example"; // String | Filter by a specific date, used as the `start_date` and `end_date` where applicable
String startDate = "startDate_example"; // String | The start date of the period to filter by
String endDate = "endDate_example"; // String | The end date of the period to filter by
try {
    Room result = apiInstance.findRoom(id, ifModifiedSince, date, startDate, endDate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssemblyApi#findRoom");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Internal identifier of the entity |
 **ifModifiedSince** | **OffsetDateTime**| Filter results since it was last fetched (see [Conditional Requests](/#section/Concepts/Conditional-Requests)) | [optional]
 **date** | **String**| Filter by a specific date, used as the &#x60;start_date&#x60; and &#x60;end_date&#x60; where applicable | [optional]
 **startDate** | **String**| The start date of the period to filter by | [optional]
 **endDate** | **String**| The end date of the period to filter by | [optional]

### Return type

[**Room**](Room.md)

### Authorization

[SchoolToken](../README.md#SchoolToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.assembly+json; version=1.1

<a name="findSchool"></a>
# **findSchool**
> School findSchool()

View School Details

Returns details for the school associated with the provided &#x60;access_token&#x60;

### Example
```java
// Import classes:
//import education.assembly.platform.spring.ApiClient;
//import education.assembly.platform.spring.ApiException;
//import education.assembly.platform.spring.Configuration;
//import education.assembly.platform.spring.auth.*;
//import education.assembly.platform.spring.AssemblyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: SchoolToken
HttpBasicAuth SchoolToken = (HttpBasicAuth) defaultClient.getAuthentication("SchoolToken");
SchoolToken.setUsername("YOUR USERNAME");
SchoolToken.setPassword("YOUR PASSWORD");

AssemblyApi apiInstance = new AssemblyApi();
try {
    School result = apiInstance.findSchool();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssemblyApi#findSchool");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**School**](School.md)

### Authorization

[SchoolToken](../README.md#SchoolToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.assembly+json; version=1.1

<a name="findStaffMember"></a>
# **findStaffMember**
> StaffMember findStaffMember(id, addresses, demographics, qualifications)

View a Staff Member

Returns an individual staff member record for the given ID

### Example
```java
// Import classes:
//import education.assembly.platform.spring.ApiClient;
//import education.assembly.platform.spring.ApiException;
//import education.assembly.platform.spring.Configuration;
//import education.assembly.platform.spring.auth.*;
//import education.assembly.platform.spring.AssemblyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: SchoolToken
HttpBasicAuth SchoolToken = (HttpBasicAuth) defaultClient.getAuthentication("SchoolToken");
SchoolToken.setUsername("YOUR USERNAME");
SchoolToken.setPassword("YOUR PASSWORD");

AssemblyApi apiInstance = new AssemblyApi();
Integer id = 56; // Integer | Internal identifier of the entity
Boolean addresses = true; // Boolean | Include address data
Boolean demographics = true; // Boolean | Include demographics data
Boolean qualifications = true; // Boolean | Include HLTA status, QT status, QT route and previous degree information (requires `staff_members.qualifications` scope)
try {
    StaffMember result = apiInstance.findStaffMember(id, addresses, demographics, qualifications);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssemblyApi#findStaffMember");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Internal identifier of the entity |
 **addresses** | **Boolean**| Include address data | [optional]
 **demographics** | **Boolean**| Include demographics data | [optional]
 **qualifications** | **Boolean**| Include HLTA status, QT status, QT route and previous degree information (requires &#x60;staff_members.qualifications&#x60; scope) | [optional]

### Return type

[**StaffMember**](StaffMember.md)

### Authorization

[SchoolToken](../README.md#SchoolToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.assembly+json; version=1.1

<a name="findStudent"></a>
# **findStudent**
> Student findStudent(id, demographics, contacts, senNeeds, emails, addresses, care, everInCare, languages, photo)

View a Student

Returns an individual student record for the given ID.  **Note:** the response shown includes student demographics, contacts, student SEN needs, student addresses, photo and student care data but these will only be present if you have permission to access it and pass &#x60;demographics&#x60;, &#x60;contacts&#x60;, &#x60;sen_needs&#x60;, &#x60;addresses&#x60;, &#x60;photo&#x60;, &#x60;care&#x60; and &#x60;ever_in_care&#x60; respectively.  ### Photo Notes When requesting photo information the response includes a &#x60;photo.url&#x60; property, this URL should be treated as confidential and used to download the students photo to your storage system of choice. The URL is *not designed for hotlinking directly in the browser* for end users. URLs are signed and only valid for 1 hour after which time you will receive a 400 error.  Once downloaded to avoid repeatedly syncing unchanged photos you should code your application to compare the &#x60;photo.hash&#x60; property to detect changes in student photos since your last sync, it is guaranteed that changes in a photo will change the hash, however the hash is only intended to be used to detect photo changes and is not guaranteed to match a checksum of the files contents.  Photos are currently provided on an \&quot;as is\&quot; basis straight from the source MIS, this means the format, quality, metadata and dimensions are not guaranteed. We reserve the right to normalise this data in the future but your application should be resistant to differing photo formats. 

### Example
```java
// Import classes:
//import education.assembly.platform.spring.ApiClient;
//import education.assembly.platform.spring.ApiException;
//import education.assembly.platform.spring.Configuration;
//import education.assembly.platform.spring.auth.*;
//import education.assembly.platform.spring.AssemblyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: SchoolToken
HttpBasicAuth SchoolToken = (HttpBasicAuth) defaultClient.getAuthentication("SchoolToken");
SchoolToken.setUsername("YOUR USERNAME");
SchoolToken.setPassword("YOUR PASSWORD");

AssemblyApi apiInstance = new AssemblyApi();
Integer id = 56; // Integer | Internal identifier of the entity
Boolean demographics = true; // Boolean | Include demographics data
Boolean contacts = true; // Boolean | Include contacts data
Boolean senNeeds = true; // Boolean | Include SEN needs data
Boolean emails = true; // Boolean | Include email addresses
Boolean addresses = true; // Boolean | Include address data
Boolean care = true; // Boolean | Include student care data (you must also supply the demographics parameter)
Boolean everInCare = true; // Boolean | Include whether the student has ever been in care (you must also supply the demographics parameter)
Boolean languages = true; // Boolean | Include student language data
Boolean photo = true; // Boolean | Include student photo data
try {
    Student result = apiInstance.findStudent(id, demographics, contacts, senNeeds, emails, addresses, care, everInCare, languages, photo);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssemblyApi#findStudent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Internal identifier of the entity |
 **demographics** | **Boolean**| Include demographics data | [optional]
 **contacts** | **Boolean**| Include contacts data | [optional]
 **senNeeds** | **Boolean**| Include SEN needs data | [optional]
 **emails** | **Boolean**| Include email addresses | [optional]
 **addresses** | **Boolean**| Include address data | [optional]
 **care** | **Boolean**| Include student care data (you must also supply the demographics parameter) | [optional]
 **everInCare** | **Boolean**| Include whether the student has ever been in care (you must also supply the demographics parameter) | [optional]
 **languages** | **Boolean**| Include student language data | [optional]
 **photo** | **Boolean**| Include student photo data | [optional]

### Return type

[**Student**](Student.md)

### Authorization

[SchoolToken](../README.md#SchoolToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.assembly+json; version=1.1

<a name="findTeachingGroup"></a>
# **findTeachingGroup**
> TeachingGroup findTeachingGroup(id, date)

View a Teaching Group

Returns a list of teaching groups that match the given set of filters

### Example
```java
// Import classes:
//import education.assembly.platform.spring.ApiClient;
//import education.assembly.platform.spring.ApiException;
//import education.assembly.platform.spring.Configuration;
//import education.assembly.platform.spring.auth.*;
//import education.assembly.platform.spring.AssemblyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: SchoolToken
HttpBasicAuth SchoolToken = (HttpBasicAuth) defaultClient.getAuthentication("SchoolToken");
SchoolToken.setUsername("YOUR USERNAME");
SchoolToken.setPassword("YOUR PASSWORD");

AssemblyApi apiInstance = new AssemblyApi();
Integer id = 56; // Integer | Internal identifier of the entity
OffsetDateTime date = new OffsetDateTime(); // OffsetDateTime | Filter by a specific date, used as the `start_date` and `end_date` where applicable
try {
    TeachingGroup result = apiInstance.findTeachingGroup(id, date);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssemblyApi#findTeachingGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Internal identifier of the entity |
 **date** | **OffsetDateTime**| Filter by a specific date, used as the &#x60;start_date&#x60; and &#x60;end_date&#x60; where applicable | [optional]

### Return type

[**TeachingGroup**](TeachingGroup.md)

### Authorization

[SchoolToken](../README.md#SchoolToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.assembly+json; version=1.1

<a name="findTimetable"></a>
# **findTimetable**
> Timetable findTimetable(id, ifModifiedSince, date, startDate, endDate)

View a Timetable

Returns an individual timetable for the given ID.

### Example
```java
// Import classes:
//import education.assembly.platform.spring.ApiClient;
//import education.assembly.platform.spring.ApiException;
//import education.assembly.platform.spring.Configuration;
//import education.assembly.platform.spring.auth.*;
//import education.assembly.platform.spring.AssemblyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: SchoolToken
HttpBasicAuth SchoolToken = (HttpBasicAuth) defaultClient.getAuthentication("SchoolToken");
SchoolToken.setUsername("YOUR USERNAME");
SchoolToken.setPassword("YOUR PASSWORD");

AssemblyApi apiInstance = new AssemblyApi();
Integer id = 56; // Integer | Internal identifier of the entity
OffsetDateTime ifModifiedSince = new OffsetDateTime(); // OffsetDateTime | Filter results since it was last fetched (see [Conditional Requests](/#section/Concepts/Conditional-Requests))
OffsetDateTime date = new OffsetDateTime(); // OffsetDateTime | Filter by a specific date, used as the `start_date` and `end_date` where applicable
OffsetDateTime startDate = new OffsetDateTime(); // OffsetDateTime | The start date of the period to filter by
OffsetDateTime endDate = new OffsetDateTime(); // OffsetDateTime | The end date of the period to filter by
try {
    Timetable result = apiInstance.findTimetable(id, ifModifiedSince, date, startDate, endDate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssemblyApi#findTimetable");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Internal identifier of the entity |
 **ifModifiedSince** | **OffsetDateTime**| Filter results since it was last fetched (see [Conditional Requests](/#section/Concepts/Conditional-Requests)) | [optional]
 **date** | **OffsetDateTime**| Filter by a specific date, used as the &#x60;start_date&#x60; and &#x60;end_date&#x60; where applicable | [optional]
 **startDate** | **OffsetDateTime**| The start date of the period to filter by | [optional]
 **endDate** | **OffsetDateTime**| The end date of the period to filter by | [optional]

### Return type

[**Timetable**](Timetable.md)

### Authorization

[SchoolToken](../README.md#SchoolToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.assembly+json; version=1.1

<a name="findYearGroup"></a>
# **findYearGroup**
> YearGroup findYearGroup(id, date)

View a Year Group

Returns a list of year groups that match the given set of filters

### Example
```java
// Import classes:
//import education.assembly.platform.spring.ApiClient;
//import education.assembly.platform.spring.ApiException;
//import education.assembly.platform.spring.Configuration;
//import education.assembly.platform.spring.auth.*;
//import education.assembly.platform.spring.AssemblyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: SchoolToken
HttpBasicAuth SchoolToken = (HttpBasicAuth) defaultClient.getAuthentication("SchoolToken");
SchoolToken.setUsername("YOUR USERNAME");
SchoolToken.setPassword("YOUR PASSWORD");

AssemblyApi apiInstance = new AssemblyApi();
Integer id = 56; // Integer | Internal identifier of the entity
OffsetDateTime date = new OffsetDateTime(); // OffsetDateTime | Filter by a specific date, used as the `start_date` and `end_date` where applicable
try {
    YearGroup result = apiInstance.findYearGroup(id, date);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssemblyApi#findYearGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Internal identifier of the entity |
 **date** | **OffsetDateTime**| Filter by a specific date, used as the &#x60;start_date&#x60; and &#x60;end_date&#x60; where applicable | [optional]

### Return type

[**YearGroup**](YearGroup.md)

### Authorization

[SchoolToken](../README.md#SchoolToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.assembly+json; version=1.1

<a name="getAcademicYears"></a>
# **getAcademicYears**
> List&lt;AcademicYear&gt; getAcademicYears(perPage, page)

List Academic Years

Returns a list of academic years for the school associated with the provided &#x60;access_token&#x60;. The dates of these academic years can be used to filter data in other API endpoints

### Example
```java
// Import classes:
//import education.assembly.platform.spring.ApiClient;
//import education.assembly.platform.spring.ApiException;
//import education.assembly.platform.spring.Configuration;
//import education.assembly.platform.spring.auth.*;
//import education.assembly.platform.spring.AssemblyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: SchoolToken
HttpBasicAuth SchoolToken = (HttpBasicAuth) defaultClient.getAuthentication("SchoolToken");
SchoolToken.setUsername("YOUR USERNAME");
SchoolToken.setPassword("YOUR PASSWORD");

AssemblyApi apiInstance = new AssemblyApi();
Integer perPage = 50; // Integer | Number of results to return
Integer page = 5; // Integer | Page number to return
try {
    List<AcademicYear> result = apiInstance.getAcademicYears(perPage, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssemblyApi#getAcademicYears");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **perPage** | **Integer**| Number of results to return | [optional] [default to 100]
 **page** | **Integer**| Page number to return | [optional] [default to 1]

### Return type

[**List&lt;AcademicYear&gt;**](AcademicYear.md)

### Authorization

[SchoolToken](../README.md#SchoolToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.assembly+json; version=1.1

<a name="getAssessmentPointResults"></a>
# **getAssessmentPointResults**
> List&lt;Result&gt; getAssessmentPointResults(assessmentPointRank, students, perPage, page)

View Results for an Assessment Point

Returns a list of results for the given &#x60;assessment_point_rank&#x60; and students

### Example
```java
// Import classes:
//import education.assembly.platform.spring.ApiClient;
//import education.assembly.platform.spring.ApiException;
//import education.assembly.platform.spring.Configuration;
//import education.assembly.platform.spring.auth.*;
//import education.assembly.platform.spring.AssemblyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: SchoolToken
HttpBasicAuth SchoolToken = (HttpBasicAuth) defaultClient.getAuthentication("SchoolToken");
SchoolToken.setUsername("YOUR USERNAME");
SchoolToken.setPassword("YOUR PASSWORD");

AssemblyApi apiInstance = new AssemblyApi();
Integer assessmentPointRank = 56; // Integer | The rank of the assessment point as an Integer
List<Integer> students = Arrays.asList(); // List<Integer> | ID(s) of the student(s) as an Integer. Multiple IDs can be separated with a space (so a + URL encoded)
Integer perPage = 50; // Integer | Number of results to return
Integer page = 5; // Integer | Page number to return
try {
    List<Result> result = apiInstance.getAssessmentPointResults(assessmentPointRank, students, perPage, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssemblyApi#getAssessmentPointResults");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assessmentPointRank** | **Integer**| The rank of the assessment point as an Integer |
 **students** | [**List&lt;Integer&gt;**](Integer.md)| ID(s) of the student(s) as an Integer. Multiple IDs can be separated with a space (so a + URL encoded) | [default to new ArrayList&lt;Integer&gt;()]
 **perPage** | **Integer**| Number of results to return | [optional] [default to 100]
 **page** | **Integer**| Page number to return | [optional] [default to 1]

### Return type

[**List&lt;Result&gt;**](Result.md)

### Authorization

[SchoolToken](../README.md#SchoolToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.assembly+json; version=1.1

<a name="getAssessmentPoints"></a>
# **getAssessmentPoints**
> List&lt;AssessmentPoint&gt; getAssessmentPoints(yearCode, type, perPage, page)

List Assessment Points

Returns a list of assessment points. An &#x60;assessment_point&#x60; object represents a point in the school key stage, year, term or half-term that results can be attached to. When sending results back to the Platform, the &#x60;assessment_point_rank&#x60; should be used - this will remain constant across all environments

### Example
```java
// Import classes:
//import education.assembly.platform.spring.ApiClient;
//import education.assembly.platform.spring.ApiException;
//import education.assembly.platform.spring.Configuration;
//import education.assembly.platform.spring.auth.*;
//import education.assembly.platform.spring.AssemblyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: SchoolToken
HttpBasicAuth SchoolToken = (HttpBasicAuth) defaultClient.getAuthentication("SchoolToken");
SchoolToken.setUsername("YOUR USERNAME");
SchoolToken.setPassword("YOUR PASSWORD");

AssemblyApi apiInstance = new AssemblyApi();
Integer yearCode = 56; // Integer | Filter by school year
String type = "type_example"; // String | Filter by type
Integer perPage = 50; // Integer | Number of results to return
Integer page = 5; // Integer | Page number to return
try {
    List<AssessmentPoint> result = apiInstance.getAssessmentPoints(yearCode, type, perPage, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssemblyApi#getAssessmentPoints");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **yearCode** | **Integer**| Filter by school year | [optional]
 **type** | **String**| Filter by type | [optional]
 **perPage** | **Integer**| Number of results to return | [optional] [default to 100]
 **page** | **Integer**| Page number to return | [optional] [default to 1]

### Return type

[**List&lt;AssessmentPoint&gt;**](AssessmentPoint.md)

### Authorization

[SchoolToken](../README.md#SchoolToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.assembly+json; version=1.1

<a name="getAssessmentResults"></a>
# **getAssessmentResults**
> List&lt;Result&gt; getAssessmentResults(id, students, perPage, page)

View Results for an Assessment

Returns a list of results for the given &#x60;assessment_id&#x60; and students. For a full list of national assessment data (Key stage 1 and 2 SATs results) available on the Platform, please see this [support article](http://help.assembly.education/article/89-getting-prior-attainment-from-the-platform)

### Example
```java
// Import classes:
//import education.assembly.platform.spring.ApiClient;
//import education.assembly.platform.spring.ApiException;
//import education.assembly.platform.spring.Configuration;
//import education.assembly.platform.spring.auth.*;
//import education.assembly.platform.spring.AssemblyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: SchoolToken
HttpBasicAuth SchoolToken = (HttpBasicAuth) defaultClient.getAuthentication("SchoolToken");
SchoolToken.setUsername("YOUR USERNAME");
SchoolToken.setPassword("YOUR PASSWORD");

AssemblyApi apiInstance = new AssemblyApi();
Integer id = 56; // Integer | Internal identifier of the entity
List<Integer> students = Arrays.asList(); // List<Integer> | ID(s) of the student(s) as an Integer. Multiple IDs can be separated with a space (so a + URL encoded)
Integer perPage = 50; // Integer | Number of results to return
Integer page = 5; // Integer | Page number to return
try {
    List<Result> result = apiInstance.getAssessmentResults(id, students, perPage, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssemblyApi#getAssessmentResults");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Internal identifier of the entity |
 **students** | [**List&lt;Integer&gt;**](Integer.md)| ID(s) of the student(s) as an Integer. Multiple IDs can be separated with a space (so a + URL encoded) | [default to new ArrayList&lt;Integer&gt;()]
 **perPage** | **Integer**| Number of results to return | [optional] [default to 100]
 **page** | **Integer**| Page number to return | [optional] [default to 1]

### Return type

[**List&lt;Result&gt;**](Result.md)

### Authorization

[SchoolToken](../README.md#SchoolToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.assembly+json; version=1.1

<a name="getAssessments"></a>
# **getAssessments**
> List&lt;Assessment&gt; getAssessments(perPage, page)

List Assessments

Returns a list of assessment objects. The assessment is the grouping that knits together a range of concepts. The name of the assessment also refers to the source of the result

### Example
```java
// Import classes:
//import education.assembly.platform.spring.ApiClient;
//import education.assembly.platform.spring.ApiException;
//import education.assembly.platform.spring.Configuration;
//import education.assembly.platform.spring.auth.*;
//import education.assembly.platform.spring.AssemblyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: SchoolToken
HttpBasicAuth SchoolToken = (HttpBasicAuth) defaultClient.getAuthentication("SchoolToken");
SchoolToken.setUsername("YOUR USERNAME");
SchoolToken.setPassword("YOUR PASSWORD");

AssemblyApi apiInstance = new AssemblyApi();
Integer perPage = 50; // Integer | Number of results to return
Integer page = 5; // Integer | Page number to return
try {
    List<Assessment> result = apiInstance.getAssessments(perPage, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssemblyApi#getAssessments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **perPage** | **Integer**| Number of results to return | [optional] [default to 100]
 **page** | **Integer**| Page number to return | [optional] [default to 1]

### Return type

[**List&lt;Assessment&gt;**](Assessment.md)

### Authorization

[SchoolToken](../README.md#SchoolToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.assembly+json; version=1.1

<a name="getAttendanceSummaries"></a>
# **getAttendanceSummaries**
> List&lt;AttendanceSummary&gt; getAttendanceSummaries(ifModifiedSince, studentId, registrationGroupId, groupId, academicYearId, perPage, page)

List Attendance Summaries

Returns a list of attendance summaries

### Example
```java
// Import classes:
//import education.assembly.platform.spring.ApiClient;
//import education.assembly.platform.spring.ApiException;
//import education.assembly.platform.spring.Configuration;
//import education.assembly.platform.spring.auth.*;
//import education.assembly.platform.spring.AssemblyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: SchoolToken
HttpBasicAuth SchoolToken = (HttpBasicAuth) defaultClient.getAuthentication("SchoolToken");
SchoolToken.setUsername("YOUR USERNAME");
SchoolToken.setPassword("YOUR PASSWORD");

AssemblyApi apiInstance = new AssemblyApi();
OffsetDateTime ifModifiedSince = new OffsetDateTime(); // OffsetDateTime | Filter results since it was last fetched (see [Conditional Requests](/#section/Concepts/Conditional-Requests))
Integer studentId = 56; // Integer | Filter to the specified student
Integer registrationGroupId = 56; // Integer | ID of a registration group
Integer groupId = 56; // Integer | Filter to the specified group
Integer academicYearId = 56; // Integer | Include all groups and group memberships from the specified academic year
Integer perPage = 50; // Integer | Number of results to return
Integer page = 5; // Integer | Page number to return
try {
    List<AttendanceSummary> result = apiInstance.getAttendanceSummaries(ifModifiedSince, studentId, registrationGroupId, groupId, academicYearId, perPage, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssemblyApi#getAttendanceSummaries");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ifModifiedSince** | **OffsetDateTime**| Filter results since it was last fetched (see [Conditional Requests](/#section/Concepts/Conditional-Requests)) | [optional]
 **studentId** | **Integer**| Filter to the specified student | [optional]
 **registrationGroupId** | **Integer**| ID of a registration group | [optional]
 **groupId** | **Integer**| Filter to the specified group | [optional]
 **academicYearId** | **Integer**| Include all groups and group memberships from the specified academic year | [optional]
 **perPage** | **Integer**| Number of results to return | [optional] [default to 100]
 **page** | **Integer**| Page number to return | [optional] [default to 1]

### Return type

[**List&lt;AttendanceSummary&gt;**](AttendanceSummary.md)

### Authorization

[SchoolToken](../README.md#SchoolToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.assembly+json; version=1.1

<a name="getAttendances"></a>
# **getAttendances**
> List&lt;Attendance&gt; getAttendances(ifModifiedSince, studentId, registrationGroupId, groupId, startDate, endDate, perPage, page)

List Attendances

Returns a list of attendances. By default, attendances are returned from the start to the end of the current week

### Example
```java
// Import classes:
//import education.assembly.platform.spring.ApiClient;
//import education.assembly.platform.spring.ApiException;
//import education.assembly.platform.spring.Configuration;
//import education.assembly.platform.spring.auth.*;
//import education.assembly.platform.spring.AssemblyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: SchoolToken
HttpBasicAuth SchoolToken = (HttpBasicAuth) defaultClient.getAuthentication("SchoolToken");
SchoolToken.setUsername("YOUR USERNAME");
SchoolToken.setPassword("YOUR PASSWORD");

AssemblyApi apiInstance = new AssemblyApi();
OffsetDateTime ifModifiedSince = new OffsetDateTime(); // OffsetDateTime | Filter results since it was last fetched (see [Conditional Requests](/#section/Concepts/Conditional-Requests))
Integer studentId = 56; // Integer | Filter to the specified student
Integer registrationGroupId = 56; // Integer | ID of a registration group
Integer groupId = 56; // Integer | Filter to the specified group
OffsetDateTime startDate = new OffsetDateTime(); // OffsetDateTime | The start date of the period to filter by
OffsetDateTime endDate = new OffsetDateTime(); // OffsetDateTime | The end date of the period to filter by
Integer perPage = 50; // Integer | Number of results to return
Integer page = 5; // Integer | Page number to return
try {
    List<Attendance> result = apiInstance.getAttendances(ifModifiedSince, studentId, registrationGroupId, groupId, startDate, endDate, perPage, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssemblyApi#getAttendances");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ifModifiedSince** | **OffsetDateTime**| Filter results since it was last fetched (see [Conditional Requests](/#section/Concepts/Conditional-Requests)) | [optional]
 **studentId** | **Integer**| Filter to the specified student | [optional]
 **registrationGroupId** | **Integer**| ID of a registration group | [optional]
 **groupId** | **Integer**| Filter to the specified group | [optional]
 **startDate** | **OffsetDateTime**| The start date of the period to filter by | [optional]
 **endDate** | **OffsetDateTime**| The end date of the period to filter by | [optional]
 **perPage** | **Integer**| Number of results to return | [optional] [default to 100]
 **page** | **Integer**| Page number to return | [optional] [default to 1]

### Return type

[**List&lt;Attendance&gt;**](Attendance.md)

### Authorization

[SchoolToken](../README.md#SchoolToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.assembly+json; version=1.1

<a name="getCalendarEvents"></a>
# **getCalendarEvents**
> List&lt;CalendarEvent&gt; getCalendarEvents(ifModifiedSince, type, perPage, page)

List Calendar Events

Returns a list of calendar events from the school calendar. This category includes items such as staff meetings and school assembly times as you can see from the sample response below

### Example
```java
// Import classes:
//import education.assembly.platform.spring.ApiClient;
//import education.assembly.platform.spring.ApiException;
//import education.assembly.platform.spring.Configuration;
//import education.assembly.platform.spring.auth.*;
//import education.assembly.platform.spring.AssemblyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: SchoolToken
HttpBasicAuth SchoolToken = (HttpBasicAuth) defaultClient.getAuthentication("SchoolToken");
SchoolToken.setUsername("YOUR USERNAME");
SchoolToken.setPassword("YOUR PASSWORD");

AssemblyApi apiInstance = new AssemblyApi();
OffsetDateTime ifModifiedSince = new OffsetDateTime(); // OffsetDateTime | Filter results since it was last fetched (see [Conditional Requests](/#section/Concepts/Conditional-Requests))
String type = "type_example"; // String | Filter by type
Integer perPage = 50; // Integer | Number of results to return
Integer page = 5; // Integer | Page number to return
try {
    List<CalendarEvent> result = apiInstance.getCalendarEvents(ifModifiedSince, type, perPage, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssemblyApi#getCalendarEvents");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ifModifiedSince** | **OffsetDateTime**| Filter results since it was last fetched (see [Conditional Requests](/#section/Concepts/Conditional-Requests)) | [optional]
 **type** | **String**| Filter by type | [optional]
 **perPage** | **Integer**| Number of results to return | [optional] [default to 100]
 **page** | **Integer**| Page number to return | [optional] [default to 1]

### Return type

[**List&lt;CalendarEvent&gt;**](CalendarEvent.md)

### Authorization

[SchoolToken](../README.md#SchoolToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.assembly+json; version=1.1

<a name="getClosures"></a>
# **getClosures**
> List&lt;Closure&gt; getClosures(id, ifModifiedSince, date, startDate, endDate)

List Closures For a Room

Returns a list of room closures for the school associated with the provided &#x60;access_token&#x60;.

### Example
```java
// Import classes:
//import education.assembly.platform.spring.ApiClient;
//import education.assembly.platform.spring.ApiException;
//import education.assembly.platform.spring.Configuration;
//import education.assembly.platform.spring.auth.*;
//import education.assembly.platform.spring.AssemblyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: SchoolToken
HttpBasicAuth SchoolToken = (HttpBasicAuth) defaultClient.getAuthentication("SchoolToken");
SchoolToken.setUsername("YOUR USERNAME");
SchoolToken.setPassword("YOUR PASSWORD");

AssemblyApi apiInstance = new AssemblyApi();
Integer id = 56; // Integer | Internal identifier of the entity
OffsetDateTime ifModifiedSince = new OffsetDateTime(); // OffsetDateTime | Filter results since it was last fetched (see [Conditional Requests](/#section/Concepts/Conditional-Requests))
OffsetDateTime date = new OffsetDateTime(); // OffsetDateTime | Filter by a specific date, used as the `start_date` and `end_date` where applicable
OffsetDateTime startDate = new OffsetDateTime(); // OffsetDateTime | The start date of the period to filter by
OffsetDateTime endDate = new OffsetDateTime(); // OffsetDateTime | The end date of the period to filter by
try {
    List<Closure> result = apiInstance.getClosures(id, ifModifiedSince, date, startDate, endDate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssemblyApi#getClosures");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Internal identifier of the entity |
 **ifModifiedSince** | **OffsetDateTime**| Filter results since it was last fetched (see [Conditional Requests](/#section/Concepts/Conditional-Requests)) | [optional]
 **date** | **OffsetDateTime**| Filter by a specific date, used as the &#x60;start_date&#x60; and &#x60;end_date&#x60; where applicable | [optional]
 **startDate** | **OffsetDateTime**| The start date of the period to filter by | [optional]
 **endDate** | **OffsetDateTime**| The end date of the period to filter by | [optional]

### Return type

[**List&lt;Closure&gt;**](Closure.md)

### Authorization

[SchoolToken](../README.md#SchoolToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.assembly+json; version=1.1

<a name="getContacts"></a>
# **getContacts**
> List&lt;Contact&gt; getContacts(studentId, addresses, perPage, page)

List Contacts

Returns a list of contacts that match the given set of filters

### Example
```java
// Import classes:
//import education.assembly.platform.spring.ApiClient;
//import education.assembly.platform.spring.ApiException;
//import education.assembly.platform.spring.Configuration;
//import education.assembly.platform.spring.auth.*;
//import education.assembly.platform.spring.AssemblyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: SchoolToken
HttpBasicAuth SchoolToken = (HttpBasicAuth) defaultClient.getAuthentication("SchoolToken");
SchoolToken.setUsername("YOUR USERNAME");
SchoolToken.setPassword("YOUR PASSWORD");

AssemblyApi apiInstance = new AssemblyApi();
Integer studentId = 56; // Integer | Filter to the specified student
Boolean addresses = true; // Boolean | Include address data
Integer perPage = 50; // Integer | Number of results to return
Integer page = 5; // Integer | Page number to return
try {
    List<Contact> result = apiInstance.getContacts(studentId, addresses, perPage, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssemblyApi#getContacts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **studentId** | **Integer**| Filter to the specified student | [optional]
 **addresses** | **Boolean**| Include address data | [optional]
 **perPage** | **Integer**| Number of results to return | [optional] [default to 100]
 **page** | **Integer**| Page number to return | [optional] [default to 1]

### Return type

[**List&lt;Contact&gt;**](Contact.md)

### Authorization

[SchoolToken](../README.md#SchoolToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.assembly+json; version=1.1

<a name="getDietaryNeeds"></a>
# **getDietaryNeeds**
> List&lt;DietaryNeed&gt; getDietaryNeeds(perPage, page)

List Dietary Needs

Returns a list of all the Dietary Needs defined by the school

### Example
```java
// Import classes:
//import education.assembly.platform.spring.ApiClient;
//import education.assembly.platform.spring.ApiException;
//import education.assembly.platform.spring.Configuration;
//import education.assembly.platform.spring.auth.*;
//import education.assembly.platform.spring.AssemblyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: SchoolToken
HttpBasicAuth SchoolToken = (HttpBasicAuth) defaultClient.getAuthentication("SchoolToken");
SchoolToken.setUsername("YOUR USERNAME");
SchoolToken.setPassword("YOUR PASSWORD");

AssemblyApi apiInstance = new AssemblyApi();
Integer perPage = 50; // Integer | Number of results to return
Integer page = 5; // Integer | Page number to return
try {
    List<DietaryNeed> result = apiInstance.getDietaryNeeds(perPage, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssemblyApi#getDietaryNeeds");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **perPage** | **Integer**| Number of results to return | [optional] [default to 100]
 **page** | **Integer**| Page number to return | [optional] [default to 1]

### Return type

[**List&lt;DietaryNeed&gt;**](DietaryNeed.md)

### Authorization

[SchoolToken](../README.md#SchoolToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.assembly+json; version=1.1

<a name="getExclusions"></a>
# **getExclusions**
> List&lt;Exclusion&gt; getExclusions(studentId, startDate, endDate, perPage, page)

List Exclusions

Returns a list of exclusions. *By default, exclusions are returned that occurred during the current academic year.*

### Example
```java
// Import classes:
//import education.assembly.platform.spring.ApiClient;
//import education.assembly.platform.spring.ApiException;
//import education.assembly.platform.spring.Configuration;
//import education.assembly.platform.spring.auth.*;
//import education.assembly.platform.spring.AssemblyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: SchoolToken
HttpBasicAuth SchoolToken = (HttpBasicAuth) defaultClient.getAuthentication("SchoolToken");
SchoolToken.setUsername("YOUR USERNAME");
SchoolToken.setPassword("YOUR PASSWORD");

AssemblyApi apiInstance = new AssemblyApi();
Integer studentId = 56; // Integer | Filter to the specified student
OffsetDateTime startDate = new OffsetDateTime(); // OffsetDateTime | The start date of the period to filter by
OffsetDateTime endDate = new OffsetDateTime(); // OffsetDateTime | The end date of the period to filter by
Integer perPage = 50; // Integer | Number of results to return
Integer page = 5; // Integer | Page number to return
try {
    List<Exclusion> result = apiInstance.getExclusions(studentId, startDate, endDate, perPage, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssemblyApi#getExclusions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **studentId** | **Integer**| Filter to the specified student | [optional]
 **startDate** | **OffsetDateTime**| The start date of the period to filter by | [optional]
 **endDate** | **OffsetDateTime**| The end date of the period to filter by | [optional]
 **perPage** | **Integer**| Number of results to return | [optional] [default to 100]
 **page** | **Integer**| Page number to return | [optional] [default to 1]

### Return type

[**List&lt;Exclusion&gt;**](Exclusion.md)

### Authorization

[SchoolToken](../README.md#SchoolToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.assembly+json; version=1.1

<a name="getFacets"></a>
# **getFacets**
> List&lt;Facet&gt; getFacets(perPage, page)

List Facets

Returns a list of facets. The facet is used to reflect a different type of grade and allows 2 grades of the same assessment to be compared

### Example
```java
// Import classes:
//import education.assembly.platform.spring.ApiClient;
//import education.assembly.platform.spring.ApiException;
//import education.assembly.platform.spring.Configuration;
//import education.assembly.platform.spring.auth.*;
//import education.assembly.platform.spring.AssemblyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: SchoolToken
HttpBasicAuth SchoolToken = (HttpBasicAuth) defaultClient.getAuthentication("SchoolToken");
SchoolToken.setUsername("YOUR USERNAME");
SchoolToken.setPassword("YOUR PASSWORD");

AssemblyApi apiInstance = new AssemblyApi();
Integer perPage = 50; // Integer | Number of results to return
Integer page = 5; // Integer | Page number to return
try {
    List<Facet> result = apiInstance.getFacets(perPage, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssemblyApi#getFacets");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **perPage** | **Integer**| Number of results to return | [optional] [default to 100]
 **page** | **Integer**| Page number to return | [optional] [default to 1]

### Return type

[**List&lt;Facet&gt;**](Facet.md)

### Authorization

[SchoolToken](../README.md#SchoolToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.assembly+json; version=1.1

<a name="getGradeSets"></a>
# **getGradeSets**
> List&lt;GradeSet&gt; getGradeSets(perPage, page)

List Grade Sets

Returns a list of grade sets

### Example
```java
// Import classes:
//import education.assembly.platform.spring.ApiClient;
//import education.assembly.platform.spring.ApiException;
//import education.assembly.platform.spring.Configuration;
//import education.assembly.platform.spring.auth.*;
//import education.assembly.platform.spring.AssemblyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: SchoolToken
HttpBasicAuth SchoolToken = (HttpBasicAuth) defaultClient.getAuthentication("SchoolToken");
SchoolToken.setUsername("YOUR USERNAME");
SchoolToken.setPassword("YOUR PASSWORD");

AssemblyApi apiInstance = new AssemblyApi();
Integer perPage = 50; // Integer | Number of results to return
Integer page = 5; // Integer | Page number to return
try {
    List<GradeSet> result = apiInstance.getGradeSets(perPage, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssemblyApi#getGradeSets");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **perPage** | **Integer**| Number of results to return | [optional] [default to 100]
 **page** | **Integer**| Page number to return | [optional] [default to 1]

### Return type

[**List&lt;GradeSet&gt;**](GradeSet.md)

### Authorization

[SchoolToken](../README.md#SchoolToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.assembly+json; version=1.1

<a name="getGroupStudents"></a>
# **getGroupStudents**
> List&lt;Student&gt; getGroupStudents(id, ifModifiedSince, academicYearId, date, yearCode, demographics, contacts, senNeeds, emails, addresses, care, everInCare, languages, photo)

List Students for Group

Returns a list of all the students that are present in the group identified by &#x60;group_id&#x60;

### Example
```java
// Import classes:
//import education.assembly.platform.spring.ApiClient;
//import education.assembly.platform.spring.ApiException;
//import education.assembly.platform.spring.Configuration;
//import education.assembly.platform.spring.auth.*;
//import education.assembly.platform.spring.AssemblyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: SchoolToken
HttpBasicAuth SchoolToken = (HttpBasicAuth) defaultClient.getAuthentication("SchoolToken");
SchoolToken.setUsername("YOUR USERNAME");
SchoolToken.setPassword("YOUR PASSWORD");

AssemblyApi apiInstance = new AssemblyApi();
Integer id = 56; // Integer | Internal identifier of the entity
OffsetDateTime ifModifiedSince = new OffsetDateTime(); // OffsetDateTime | Filter results since it was last fetched (see [Conditional Requests](/#section/Concepts/Conditional-Requests))
Integer academicYearId = 56; // Integer | Include all groups and group memberships from the specified academic year
String date = "date_example"; // String | Filter by a specific date, used as the `start_date` and `end_date` where applicable
String yearCode = "yearCode_example"; // String | Filter by school year
Boolean demographics = true; // Boolean | Include demographics data
Boolean contacts = true; // Boolean | Include contacts data
Boolean senNeeds = true; // Boolean | Include SEN needs data
Boolean emails = true; // Boolean | Include email addresses
Boolean addresses = true; // Boolean | Include address data
Boolean care = true; // Boolean | Include student care data (you must also supply the demographics parameter)
Boolean everInCare = true; // Boolean | Include whether the student has ever been in care (you must also supply the demographics parameter)
Boolean languages = true; // Boolean | Include student language data
Boolean photo = true; // Boolean | Include student photo data
try {
    List<Student> result = apiInstance.getGroupStudents(id, ifModifiedSince, academicYearId, date, yearCode, demographics, contacts, senNeeds, emails, addresses, care, everInCare, languages, photo);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssemblyApi#getGroupStudents");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Internal identifier of the entity |
 **ifModifiedSince** | **OffsetDateTime**| Filter results since it was last fetched (see [Conditional Requests](/#section/Concepts/Conditional-Requests)) | [optional]
 **academicYearId** | **Integer**| Include all groups and group memberships from the specified academic year | [optional]
 **date** | **String**| Filter by a specific date, used as the &#x60;start_date&#x60; and &#x60;end_date&#x60; where applicable | [optional]
 **yearCode** | **String**| Filter by school year | [optional]
 **demographics** | **Boolean**| Include demographics data | [optional]
 **contacts** | **Boolean**| Include contacts data | [optional]
 **senNeeds** | **Boolean**| Include SEN needs data | [optional]
 **emails** | **Boolean**| Include email addresses | [optional]
 **addresses** | **Boolean**| Include address data | [optional]
 **care** | **Boolean**| Include student care data (you must also supply the demographics parameter) | [optional]
 **everInCare** | **Boolean**| Include whether the student has ever been in care (you must also supply the demographics parameter) | [optional]
 **languages** | **Boolean**| Include student language data | [optional]
 **photo** | **Boolean**| Include student photo data | [optional]

### Return type

[**List&lt;Student&gt;**](Student.md)

### Authorization

[SchoolToken](../README.md#SchoolToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.assembly+json; version=1.1

<a name="getGroups"></a>
# **getGroups**
> List&lt;Group&gt; getGroups(ifModifiedSince, yearCode, date, academicYearId, type, perPage, page)

List Groups

Returns a list of groups that match the given set of filters.  If a date parameter is provided then the list of groups returned is filtered to only those where the provided date falls between the groups &#x60;start_date&#x60; and &#x60;end_date&#x60;. Additionally when a date parameter is provided &#x60;student_ids&#x60; and &#x60;supervior_ids&#x60; are restricted to only those students who were enrolled in the group on the given date. 

### Example
```java
// Import classes:
//import education.assembly.platform.spring.ApiClient;
//import education.assembly.platform.spring.ApiException;
//import education.assembly.platform.spring.Configuration;
//import education.assembly.platform.spring.auth.*;
//import education.assembly.platform.spring.AssemblyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: SchoolToken
HttpBasicAuth SchoolToken = (HttpBasicAuth) defaultClient.getAuthentication("SchoolToken");
SchoolToken.setUsername("YOUR USERNAME");
SchoolToken.setPassword("YOUR PASSWORD");

AssemblyApi apiInstance = new AssemblyApi();
OffsetDateTime ifModifiedSince = new OffsetDateTime(); // OffsetDateTime | Filter results since it was last fetched (see [Conditional Requests](/#section/Concepts/Conditional-Requests))
String yearCode = "yearCode_example"; // String | Filter by school year
OffsetDateTime date = new OffsetDateTime(); // OffsetDateTime | Filter by a specific date, used as the `start_date` and `end_date` where applicable
Integer academicYearId = 56; // Integer | Include all groups and group memberships from the specified academic year
String type = "type_example"; // String | Filter by type
Integer perPage = 50; // Integer | Number of results to return
Integer page = 5; // Integer | Page number to return
try {
    List<Group> result = apiInstance.getGroups(ifModifiedSince, yearCode, date, academicYearId, type, perPage, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssemblyApi#getGroups");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ifModifiedSince** | **OffsetDateTime**| Filter results since it was last fetched (see [Conditional Requests](/#section/Concepts/Conditional-Requests)) | [optional]
 **yearCode** | **String**| Filter by school year | [optional]
 **date** | **OffsetDateTime**| Filter by a specific date, used as the &#x60;start_date&#x60; and &#x60;end_date&#x60; where applicable | [optional]
 **academicYearId** | **Integer**| Include all groups and group memberships from the specified academic year | [optional]
 **type** | **String**| Filter by type | [optional]
 **perPage** | **Integer**| Number of results to return | [optional] [default to 100]
 **page** | **Integer**| Page number to return | [optional] [default to 1]

### Return type

[**List&lt;Group&gt;**](Group.md)

### Authorization

[SchoolToken](../README.md#SchoolToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.assembly+json; version=1.1

<a name="getLearningAims"></a>
# **getLearningAims**
> List&lt;LearningAim&gt; getLearningAims(perPage, page)

List Post-16 Learning Aims

Returns a list of Post-16 Learning Aims defined within the school

### Example
```java
// Import classes:
//import education.assembly.platform.spring.ApiClient;
//import education.assembly.platform.spring.ApiException;
//import education.assembly.platform.spring.Configuration;
//import education.assembly.platform.spring.auth.*;
//import education.assembly.platform.spring.AssemblyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: SchoolToken
HttpBasicAuth SchoolToken = (HttpBasicAuth) defaultClient.getAuthentication("SchoolToken");
SchoolToken.setUsername("YOUR USERNAME");
SchoolToken.setPassword("YOUR PASSWORD");

AssemblyApi apiInstance = new AssemblyApi();
Integer perPage = 50; // Integer | Number of results to return
Integer page = 5; // Integer | Page number to return
try {
    List<LearningAim> result = apiInstance.getLearningAims(perPage, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssemblyApi#getLearningAims");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **perPage** | **Integer**| Number of results to return | [optional] [default to 100]
 **page** | **Integer**| Page number to return | [optional] [default to 1]

### Return type

[**List&lt;LearningAim&gt;**](LearningAim.md)

### Authorization

[SchoolToken](../README.md#SchoolToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.assembly+json; version=1.1

<a name="getLeftStaffMembers"></a>
# **getLeftStaffMembers**
> List&lt;StaffMember&gt; getLeftStaffMembers(ifModifiedSince, teachersOnly, addresses, demographics, qualifications, perPage, page)

List Left Staff Members

Returns a list of staff members who have left the school

### Example
```java
// Import classes:
//import education.assembly.platform.spring.ApiClient;
//import education.assembly.platform.spring.ApiException;
//import education.assembly.platform.spring.Configuration;
//import education.assembly.platform.spring.auth.*;
//import education.assembly.platform.spring.AssemblyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: SchoolToken
HttpBasicAuth SchoolToken = (HttpBasicAuth) defaultClient.getAuthentication("SchoolToken");
SchoolToken.setUsername("YOUR USERNAME");
SchoolToken.setPassword("YOUR PASSWORD");

AssemblyApi apiInstance = new AssemblyApi();
OffsetDateTime ifModifiedSince = new OffsetDateTime(); // OffsetDateTime | Filter results since it was last fetched (see [Conditional Requests](/#section/Concepts/Conditional-Requests))
Boolean teachersOnly = true; // Boolean | Filter to staff who are teachers
Boolean addresses = true; // Boolean | Include address data
Boolean demographics = true; // Boolean | Include demographics data
Boolean qualifications = true; // Boolean | Include HLTA status, QT status, QT route and previous degree information (requires `staff_members.qualifications` scope)
Integer perPage = 50; // Integer | Number of results to return
Integer page = 5; // Integer | Page number to return
try {
    List<StaffMember> result = apiInstance.getLeftStaffMembers(ifModifiedSince, teachersOnly, addresses, demographics, qualifications, perPage, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssemblyApi#getLeftStaffMembers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ifModifiedSince** | **OffsetDateTime**| Filter results since it was last fetched (see [Conditional Requests](/#section/Concepts/Conditional-Requests)) | [optional]
 **teachersOnly** | **Boolean**| Filter to staff who are teachers | [optional]
 **addresses** | **Boolean**| Include address data | [optional]
 **demographics** | **Boolean**| Include demographics data | [optional]
 **qualifications** | **Boolean**| Include HLTA status, QT status, QT route and previous degree information (requires &#x60;staff_members.qualifications&#x60; scope) | [optional]
 **perPage** | **Integer**| Number of results to return | [optional] [default to 100]
 **page** | **Integer**| Page number to return | [optional] [default to 1]

### Return type

[**List&lt;StaffMember&gt;**](StaffMember.md)

### Authorization

[SchoolToken](../README.md#SchoolToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.assembly+json; version=1.1

<a name="getLeftStudents"></a>
# **getLeftStudents**
> List&lt;Student&gt; getLeftStudents(ifModifiedSince, perPage, page)

List Left Students

Returns a list of students who have left the school

### Example
```java
// Import classes:
//import education.assembly.platform.spring.ApiClient;
//import education.assembly.platform.spring.ApiException;
//import education.assembly.platform.spring.Configuration;
//import education.assembly.platform.spring.auth.*;
//import education.assembly.platform.spring.AssemblyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: SchoolToken
HttpBasicAuth SchoolToken = (HttpBasicAuth) defaultClient.getAuthentication("SchoolToken");
SchoolToken.setUsername("YOUR USERNAME");
SchoolToken.setPassword("YOUR PASSWORD");

AssemblyApi apiInstance = new AssemblyApi();
OffsetDateTime ifModifiedSince = new OffsetDateTime(); // OffsetDateTime | Filter results since it was last fetched (see [Conditional Requests](/#section/Concepts/Conditional-Requests))
Integer perPage = 50; // Integer | Number of results to return
Integer page = 5; // Integer | Page number to return
try {
    List<Student> result = apiInstance.getLeftStudents(ifModifiedSince, perPage, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssemblyApi#getLeftStudents");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ifModifiedSince** | **OffsetDateTime**| Filter results since it was last fetched (see [Conditional Requests](/#section/Concepts/Conditional-Requests)) | [optional]
 **perPage** | **Integer**| Number of results to return | [optional] [default to 100]
 **page** | **Integer**| Page number to return | [optional] [default to 1]

### Return type

[**List&lt;Student&gt;**](Student.md)

### Authorization

[SchoolToken](../README.md#SchoolToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.assembly+json; version=1.1

<a name="getLessons"></a>
# **getLessons**
> List&lt;Lesson&gt; getLessons(id, ifModifiedSince, date, startDate, endDate, perPage, page)

List Lessons For a Room

Returns a list of lessons in a room for the school associated with the provided &#x60;access_token&#x60;.

### Example
```java
// Import classes:
//import education.assembly.platform.spring.ApiClient;
//import education.assembly.platform.spring.ApiException;
//import education.assembly.platform.spring.Configuration;
//import education.assembly.platform.spring.auth.*;
//import education.assembly.platform.spring.AssemblyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: SchoolToken
HttpBasicAuth SchoolToken = (HttpBasicAuth) defaultClient.getAuthentication("SchoolToken");
SchoolToken.setUsername("YOUR USERNAME");
SchoolToken.setPassword("YOUR PASSWORD");

AssemblyApi apiInstance = new AssemblyApi();
Integer id = 56; // Integer | Internal identifier of the entity
OffsetDateTime ifModifiedSince = new OffsetDateTime(); // OffsetDateTime | Filter results since it was last fetched (see [Conditional Requests](/#section/Concepts/Conditional-Requests))
OffsetDateTime date = new OffsetDateTime(); // OffsetDateTime | Filter by a specific date, used as the `start_date` and `end_date` where applicable
OffsetDateTime startDate = new OffsetDateTime(); // OffsetDateTime | The start date of the period to filter by
OffsetDateTime endDate = new OffsetDateTime(); // OffsetDateTime | The end date of the period to filter by
Integer perPage = 50; // Integer | Number of results to return
Integer page = 5; // Integer | Page number to return
try {
    List<Lesson> result = apiInstance.getLessons(id, ifModifiedSince, date, startDate, endDate, perPage, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssemblyApi#getLessons");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Internal identifier of the entity |
 **ifModifiedSince** | **OffsetDateTime**| Filter results since it was last fetched (see [Conditional Requests](/#section/Concepts/Conditional-Requests)) | [optional]
 **date** | **OffsetDateTime**| Filter by a specific date, used as the &#x60;start_date&#x60; and &#x60;end_date&#x60; where applicable | [optional]
 **startDate** | **OffsetDateTime**| The start date of the period to filter by | [optional]
 **endDate** | **OffsetDateTime**| The end date of the period to filter by | [optional]
 **perPage** | **Integer**| Number of results to return | [optional] [default to 100]
 **page** | **Integer**| Page number to return | [optional] [default to 1]

### Return type

[**List&lt;Lesson&gt;**](Lesson.md)

### Authorization

[SchoolToken](../README.md#SchoolToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.assembly+json; version=1.1

<a name="getMedicalConditions"></a>
# **getMedicalConditions**
> List&lt;MedicalCondition&gt; getMedicalConditions(perPage, page)

List Medical Conditions

Returns a list of all the Medical Conditions defined by the school

### Example
```java
// Import classes:
//import education.assembly.platform.spring.ApiClient;
//import education.assembly.platform.spring.ApiException;
//import education.assembly.platform.spring.Configuration;
//import education.assembly.platform.spring.auth.*;
//import education.assembly.platform.spring.AssemblyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: SchoolToken
HttpBasicAuth SchoolToken = (HttpBasicAuth) defaultClient.getAuthentication("SchoolToken");
SchoolToken.setUsername("YOUR USERNAME");
SchoolToken.setPassword("YOUR PASSWORD");

AssemblyApi apiInstance = new AssemblyApi();
Integer perPage = 50; // Integer | Number of results to return
Integer page = 5; // Integer | Page number to return
try {
    List<MedicalCondition> result = apiInstance.getMedicalConditions(perPage, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssemblyApi#getMedicalConditions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **perPage** | **Integer**| Number of results to return | [optional] [default to 100]
 **page** | **Integer**| Page number to return | [optional] [default to 1]

### Return type

[**List&lt;MedicalCondition&gt;**](MedicalCondition.md)

### Authorization

[SchoolToken](../README.md#SchoolToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.assembly+json; version=1.1

<a name="getRegistrationGroupStudents"></a>
# **getRegistrationGroupStudents**
> List&lt;Student&gt; getRegistrationGroupStudents(id, ifModifiedSince, date, yearCode, demographics, contacts, senNeeds, emails, addresses, care, everInCare, languages, photo, perPage, page)

List Students for Registration Group

Returns a list of all the students that are present in the registration group identified by &#x60;group_id&#x60;

### Example
```java
// Import classes:
//import education.assembly.platform.spring.ApiClient;
//import education.assembly.platform.spring.ApiException;
//import education.assembly.platform.spring.Configuration;
//import education.assembly.platform.spring.auth.*;
//import education.assembly.platform.spring.AssemblyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: SchoolToken
HttpBasicAuth SchoolToken = (HttpBasicAuth) defaultClient.getAuthentication("SchoolToken");
SchoolToken.setUsername("YOUR USERNAME");
SchoolToken.setPassword("YOUR PASSWORD");

AssemblyApi apiInstance = new AssemblyApi();
Integer id = 56; // Integer | Internal identifier of the entity
OffsetDateTime ifModifiedSince = new OffsetDateTime(); // OffsetDateTime | Filter results since it was last fetched (see [Conditional Requests](/#section/Concepts/Conditional-Requests))
OffsetDateTime date = new OffsetDateTime(); // OffsetDateTime | Filter by a specific date, used as the `start_date` and `end_date` where applicable
Integer yearCode = 56; // Integer | Filter by school year
Boolean demographics = true; // Boolean | Include demographics data
Boolean contacts = true; // Boolean | Include contacts data
Boolean senNeeds = true; // Boolean | Include SEN needs data
Boolean emails = true; // Boolean | Include email addresses
Boolean addresses = true; // Boolean | Include address data
Boolean care = true; // Boolean | Include student care data (you must also supply the demographics parameter)
Boolean everInCare = true; // Boolean | Include whether the student has ever been in care (you must also supply the demographics parameter)
Boolean languages = true; // Boolean | Include student language data
Boolean photo = true; // Boolean | Include student photo data
Integer perPage = 50; // Integer | Number of results to return
Integer page = 5; // Integer | Page number to return
try {
    List<Student> result = apiInstance.getRegistrationGroupStudents(id, ifModifiedSince, date, yearCode, demographics, contacts, senNeeds, emails, addresses, care, everInCare, languages, photo, perPage, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssemblyApi#getRegistrationGroupStudents");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Internal identifier of the entity |
 **ifModifiedSince** | **OffsetDateTime**| Filter results since it was last fetched (see [Conditional Requests](/#section/Concepts/Conditional-Requests)) | [optional]
 **date** | **OffsetDateTime**| Filter by a specific date, used as the &#x60;start_date&#x60; and &#x60;end_date&#x60; where applicable | [optional]
 **yearCode** | **Integer**| Filter by school year | [optional]
 **demographics** | **Boolean**| Include demographics data | [optional]
 **contacts** | **Boolean**| Include contacts data | [optional]
 **senNeeds** | **Boolean**| Include SEN needs data | [optional]
 **emails** | **Boolean**| Include email addresses | [optional]
 **addresses** | **Boolean**| Include address data | [optional]
 **care** | **Boolean**| Include student care data (you must also supply the demographics parameter) | [optional]
 **everInCare** | **Boolean**| Include whether the student has ever been in care (you must also supply the demographics parameter) | [optional]
 **languages** | **Boolean**| Include student language data | [optional]
 **photo** | **Boolean**| Include student photo data | [optional]
 **perPage** | **Integer**| Number of results to return | [optional] [default to 100]
 **page** | **Integer**| Page number to return | [optional] [default to 1]

### Return type

[**List&lt;Student&gt;**](Student.md)

### Authorization

[SchoolToken](../README.md#SchoolToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.assembly+json; version=1.1

<a name="getRegistrationGroups"></a>
# **getRegistrationGroups**
> List&lt;RegistrationGroup&gt; getRegistrationGroups(ifModifiedSince, yearCode, date, academicYearId, perPage, page)

List Registration Groups

Returns a list of registration groups that match the given set of filters.  If a date parameter is provided then the list of groups returned is filtered to only those where the provided date falls between the groups &#x60;start_date&#x60; and &#x60;end_date&#x60;. Additionally when a date parameter is provided &#x60;student_ids&#x60; and &#x60;supervior_ids&#x60; are restricted to only those students who were enrolled in the group on the given date. 

### Example
```java
// Import classes:
//import education.assembly.platform.spring.ApiClient;
//import education.assembly.platform.spring.ApiException;
//import education.assembly.platform.spring.Configuration;
//import education.assembly.platform.spring.auth.*;
//import education.assembly.platform.spring.AssemblyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: SchoolToken
HttpBasicAuth SchoolToken = (HttpBasicAuth) defaultClient.getAuthentication("SchoolToken");
SchoolToken.setUsername("YOUR USERNAME");
SchoolToken.setPassword("YOUR PASSWORD");

AssemblyApi apiInstance = new AssemblyApi();
OffsetDateTime ifModifiedSince = new OffsetDateTime(); // OffsetDateTime | Filter results since it was last fetched (see [Conditional Requests](/#section/Concepts/Conditional-Requests))
Integer yearCode = 56; // Integer | Filter by school year
OffsetDateTime date = new OffsetDateTime(); // OffsetDateTime | Filter by a specific date, used as the `start_date` and `end_date` where applicable
Integer academicYearId = 56; // Integer | Include all groups and group memberships from the specified academic year
Integer perPage = 50; // Integer | Number of results to return
Integer page = 5; // Integer | Page number to return
try {
    List<RegistrationGroup> result = apiInstance.getRegistrationGroups(ifModifiedSince, yearCode, date, academicYearId, perPage, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssemblyApi#getRegistrationGroups");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ifModifiedSince** | **OffsetDateTime**| Filter results since it was last fetched (see [Conditional Requests](/#section/Concepts/Conditional-Requests)) | [optional]
 **yearCode** | **Integer**| Filter by school year | [optional]
 **date** | **OffsetDateTime**| Filter by a specific date, used as the &#x60;start_date&#x60; and &#x60;end_date&#x60; where applicable | [optional]
 **academicYearId** | **Integer**| Include all groups and group memberships from the specified academic year | [optional]
 **perPage** | **Integer**| Number of results to return | [optional] [default to 100]
 **page** | **Integer**| Page number to return | [optional] [default to 1]

### Return type

[**List&lt;RegistrationGroup&gt;**](RegistrationGroup.md)

### Authorization

[SchoolToken](../README.md#SchoolToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.assembly+json; version=1.1

<a name="getResults"></a>
# **getResults**
> List&lt;Result&gt; getResults(students, ifModifiedSince, perPage, page)

List Results

Returns a list of results for the student ID(s) specified by the students parameter

### Example
```java
// Import classes:
//import education.assembly.platform.spring.ApiClient;
//import education.assembly.platform.spring.ApiException;
//import education.assembly.platform.spring.Configuration;
//import education.assembly.platform.spring.auth.*;
//import education.assembly.platform.spring.AssemblyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: SchoolToken
HttpBasicAuth SchoolToken = (HttpBasicAuth) defaultClient.getAuthentication("SchoolToken");
SchoolToken.setUsername("YOUR USERNAME");
SchoolToken.setPassword("YOUR PASSWORD");

AssemblyApi apiInstance = new AssemblyApi();
List<Integer> students = Arrays.asList(); // List<Integer> | ID(s) of the student(s) as an Integer. Multiple IDs can be separated with a space (so a + URL encoded)
OffsetDateTime ifModifiedSince = new OffsetDateTime(); // OffsetDateTime | Filter results since it was last fetched (see [Conditional Requests](/#section/Concepts/Conditional-Requests))
Integer perPage = 50; // Integer | Number of results to return
Integer page = 5; // Integer | Page number to return
try {
    List<Result> result = apiInstance.getResults(students, ifModifiedSince, perPage, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssemblyApi#getResults");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **students** | [**List&lt;Integer&gt;**](Integer.md)| ID(s) of the student(s) as an Integer. Multiple IDs can be separated with a space (so a + URL encoded) | [default to new ArrayList&lt;Integer&gt;()]
 **ifModifiedSince** | **OffsetDateTime**| Filter results since it was last fetched (see [Conditional Requests](/#section/Concepts/Conditional-Requests)) | [optional]
 **perPage** | **Integer**| Number of results to return | [optional] [default to 100]
 **page** | **Integer**| Page number to return | [optional] [default to 1]

### Return type

[**List&lt;Result&gt;**](Result.md)

### Authorization

[SchoolToken](../README.md#SchoolToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.assembly+json; version=1.1

<a name="getRooms"></a>
# **getRooms**
> List&lt;Room&gt; getRooms(ifModifiedSince, perPage, page)

List Rooms

Returns a list of rooms for the school associated with the provided &#x60;access_token&#x60;.

### Example
```java
// Import classes:
//import education.assembly.platform.spring.ApiClient;
//import education.assembly.platform.spring.ApiException;
//import education.assembly.platform.spring.Configuration;
//import education.assembly.platform.spring.auth.*;
//import education.assembly.platform.spring.AssemblyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: SchoolToken
HttpBasicAuth SchoolToken = (HttpBasicAuth) defaultClient.getAuthentication("SchoolToken");
SchoolToken.setUsername("YOUR USERNAME");
SchoolToken.setPassword("YOUR PASSWORD");

AssemblyApi apiInstance = new AssemblyApi();
OffsetDateTime ifModifiedSince = new OffsetDateTime(); // OffsetDateTime | Filter results since it was last fetched (see [Conditional Requests](/#section/Concepts/Conditional-Requests))
Integer perPage = 50; // Integer | Number of results to return
Integer page = 5; // Integer | Page number to return
try {
    List<Room> result = apiInstance.getRooms(ifModifiedSince, perPage, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssemblyApi#getRooms");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ifModifiedSince** | **OffsetDateTime**| Filter results since it was last fetched (see [Conditional Requests](/#section/Concepts/Conditional-Requests)) | [optional]
 **perPage** | **Integer**| Number of results to return | [optional] [default to 100]
 **page** | **Integer**| Page number to return | [optional] [default to 1]

### Return type

[**List&lt;Room&gt;**](Room.md)

### Authorization

[SchoolToken](../README.md#SchoolToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.assembly+json; version=1.1

<a name="getStaffAbsences"></a>
# **getStaffAbsences**
> List&lt;StaffAbsence&gt; getStaffAbsences(staffMemberId, startDate, endDate, perPage, page)

List Staff Absences

Returns a list of staff member absences for the school accociated with the provided &#x60;access_token&#x60;. A school level access token with the &#x60;staff_members.absences&#x60; scope is required to access staff member absence information

### Example
```java
// Import classes:
//import education.assembly.platform.spring.ApiClient;
//import education.assembly.platform.spring.ApiException;
//import education.assembly.platform.spring.Configuration;
//import education.assembly.platform.spring.auth.*;
//import education.assembly.platform.spring.AssemblyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: SchoolToken
HttpBasicAuth SchoolToken = (HttpBasicAuth) defaultClient.getAuthentication("SchoolToken");
SchoolToken.setUsername("YOUR USERNAME");
SchoolToken.setPassword("YOUR PASSWORD");

AssemblyApi apiInstance = new AssemblyApi();
Integer staffMemberId = 56; // Integer | Filter to the specified staff member
OffsetDateTime startDate = new OffsetDateTime(); // OffsetDateTime | The start date of the period to filter by
OffsetDateTime endDate = new OffsetDateTime(); // OffsetDateTime | The end date of the period to filter by
Integer perPage = 50; // Integer | Number of results to return
Integer page = 5; // Integer | Page number to return
try {
    List<StaffAbsence> result = apiInstance.getStaffAbsences(staffMemberId, startDate, endDate, perPage, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssemblyApi#getStaffAbsences");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **staffMemberId** | **Integer**| Filter to the specified staff member | [optional]
 **startDate** | **OffsetDateTime**| The start date of the period to filter by | [optional]
 **endDate** | **OffsetDateTime**| The end date of the period to filter by | [optional]
 **perPage** | **Integer**| Number of results to return | [optional] [default to 100]
 **page** | **Integer**| Page number to return | [optional] [default to 1]

### Return type

[**List&lt;StaffAbsence&gt;**](StaffAbsence.md)

### Authorization

[SchoolToken](../README.md#SchoolToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.assembly+json; version=1.1

<a name="getStaffContracts"></a>
# **getStaffContracts**
> List&lt;StaffContract&gt; getStaffContracts(staffMemberId, date, roles, salaries, allowances, perPage, page)

List Staff Contracts

Returns a list of staff member contracts for the school accociated with the provided &#x60;access_token&#x60;. A school level access token with the &#x60;staff_members.contracts&#x60; scope is required to access staff member contract information

### Example
```java
// Import classes:
//import education.assembly.platform.spring.ApiClient;
//import education.assembly.platform.spring.ApiException;
//import education.assembly.platform.spring.Configuration;
//import education.assembly.platform.spring.auth.*;
//import education.assembly.platform.spring.AssemblyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: SchoolToken
HttpBasicAuth SchoolToken = (HttpBasicAuth) defaultClient.getAuthentication("SchoolToken");
SchoolToken.setUsername("YOUR USERNAME");
SchoolToken.setPassword("YOUR PASSWORD");

AssemblyApi apiInstance = new AssemblyApi();
Integer staffMemberId = 56; // Integer | Filter to the specified staff member
String date = "date_example"; // String | Filter by a specific date, used as the `start_date` and `end_date` where applicable
Boolean roles = true; // Boolean | Include role information along with a staff contract
Boolean salaries = true; // Boolean | Include salaries information along with a staff contract (requires `staff_members.salaries` scope for full information - only the `hours_per_week`, `fte` and `weeks_per_year` fields are shown without it)
Boolean allowances = true; // Boolean | Include allowances information along with a staff contract (requires `staff_members.salaries` scope)
Integer perPage = 50; // Integer | Number of results to return
Integer page = 5; // Integer | Page number to return
try {
    List<StaffContract> result = apiInstance.getStaffContracts(staffMemberId, date, roles, salaries, allowances, perPage, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssemblyApi#getStaffContracts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **staffMemberId** | **Integer**| Filter to the specified staff member | [optional]
 **date** | **String**| Filter by a specific date, used as the &#x60;start_date&#x60; and &#x60;end_date&#x60; where applicable | [optional]
 **roles** | **Boolean**| Include role information along with a staff contract | [optional]
 **salaries** | **Boolean**| Include salaries information along with a staff contract (requires &#x60;staff_members.salaries&#x60; scope for full information - only the &#x60;hours_per_week&#x60;, &#x60;fte&#x60; and &#x60;weeks_per_year&#x60; fields are shown without it) | [optional]
 **allowances** | **Boolean**| Include allowances information along with a staff contract (requires &#x60;staff_members.salaries&#x60; scope) | [optional]
 **perPage** | **Integer**| Number of results to return | [optional] [default to 100]
 **page** | **Integer**| Page number to return | [optional] [default to 1]

### Return type

[**List&lt;StaffContract&gt;**](StaffContract.md)

### Authorization

[SchoolToken](../README.md#SchoolToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.assembly+json; version=1.1

<a name="getStaffMembers"></a>
# **getStaffMembers**
> List&lt;StaffMember&gt; getStaffMembers(ifModifiedSince, teachersOnly, addresses, demographics, qualifications, perPage, page)

List Staff Members

Returns a list of staff members for the school accociated with the provided &#x60;access_token&#x60;

### Example
```java
// Import classes:
//import education.assembly.platform.spring.ApiClient;
//import education.assembly.platform.spring.ApiException;
//import education.assembly.platform.spring.Configuration;
//import education.assembly.platform.spring.auth.*;
//import education.assembly.platform.spring.AssemblyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: SchoolToken
HttpBasicAuth SchoolToken = (HttpBasicAuth) defaultClient.getAuthentication("SchoolToken");
SchoolToken.setUsername("YOUR USERNAME");
SchoolToken.setPassword("YOUR PASSWORD");

AssemblyApi apiInstance = new AssemblyApi();
OffsetDateTime ifModifiedSince = new OffsetDateTime(); // OffsetDateTime | Filter results since it was last fetched (see [Conditional Requests](/#section/Concepts/Conditional-Requests))
Boolean teachersOnly = true; // Boolean | Filter to staff who are teachers
Boolean addresses = true; // Boolean | Include address data
Boolean demographics = true; // Boolean | Include demographics data
Boolean qualifications = true; // Boolean | Include HLTA status, QT status, QT route and previous degree information (requires `staff_members.qualifications` scope)
Integer perPage = 50; // Integer | Number of results to return
Integer page = 5; // Integer | Page number to return
try {
    List<StaffMember> result = apiInstance.getStaffMembers(ifModifiedSince, teachersOnly, addresses, demographics, qualifications, perPage, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssemblyApi#getStaffMembers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ifModifiedSince** | **OffsetDateTime**| Filter results since it was last fetched (see [Conditional Requests](/#section/Concepts/Conditional-Requests)) | [optional]
 **teachersOnly** | **Boolean**| Filter to staff who are teachers | [optional]
 **addresses** | **Boolean**| Include address data | [optional]
 **demographics** | **Boolean**| Include demographics data | [optional]
 **qualifications** | **Boolean**| Include HLTA status, QT status, QT route and previous degree information (requires &#x60;staff_members.qualifications&#x60; scope) | [optional]
 **perPage** | **Integer**| Number of results to return | [optional] [default to 100]
 **page** | **Integer**| Page number to return | [optional] [default to 1]

### Return type

[**List&lt;StaffMember&gt;**](StaffMember.md)

### Authorization

[SchoolToken](../README.md#SchoolToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.assembly+json; version=1.1

<a name="getStudents"></a>
# **getStudents**
> List&lt;Student&gt; getStudents(ifModifiedSince, students, date, yearCode, demographics, contacts, senNeeds, emails, addresses, care, everInCare, languages, photo, perPage, page)

List Students

Returns a list of students for the school associated with the provided &#x60;access_token&#x60;

### Example
```java
// Import classes:
//import education.assembly.platform.spring.ApiClient;
//import education.assembly.platform.spring.ApiException;
//import education.assembly.platform.spring.Configuration;
//import education.assembly.platform.spring.auth.*;
//import education.assembly.platform.spring.AssemblyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: SchoolToken
HttpBasicAuth SchoolToken = (HttpBasicAuth) defaultClient.getAuthentication("SchoolToken");
SchoolToken.setUsername("YOUR USERNAME");
SchoolToken.setPassword("YOUR PASSWORD");

AssemblyApi apiInstance = new AssemblyApi();
OffsetDateTime ifModifiedSince = new OffsetDateTime(); // OffsetDateTime | Filter results since it was last fetched (see [Conditional Requests](/#section/Concepts/Conditional-Requests))
List<Integer> students = Arrays.asList(); // List<Integer> | ID(s) of the student(s) as an Integer. Multiple IDs can be separated with a space (so a + URL encoded)
OffsetDateTime date = new OffsetDateTime(); // OffsetDateTime | Filter by a specific date, used as the `start_date` and `end_date` where applicable
String yearCode = "yearCode_example"; // String | Filter by school year
Boolean demographics = true; // Boolean | Include demographics data
Boolean contacts = true; // Boolean | Include contacts data
Boolean senNeeds = true; // Boolean | Include SEN needs data
Boolean emails = true; // Boolean | Include email addresses
Boolean addresses = true; // Boolean | Include address data
Boolean care = true; // Boolean | Include student care data (you must also supply the demographics parameter)
Boolean everInCare = true; // Boolean | Include whether the student has ever been in care (you must also supply the demographics parameter)
Boolean languages = true; // Boolean | Include student language data
Boolean photo = true; // Boolean | Include student photo data
Integer perPage = 50; // Integer | Number of results to return
Integer page = 5; // Integer | Page number to return
try {
    List<Student> result = apiInstance.getStudents(ifModifiedSince, students, date, yearCode, demographics, contacts, senNeeds, emails, addresses, care, everInCare, languages, photo, perPage, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssemblyApi#getStudents");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ifModifiedSince** | **OffsetDateTime**| Filter results since it was last fetched (see [Conditional Requests](/#section/Concepts/Conditional-Requests)) | [optional]
 **students** | [**List&lt;Integer&gt;**](Integer.md)| ID(s) of the student(s) as an Integer. Multiple IDs can be separated with a space (so a + URL encoded) | [optional] [default to new ArrayList&lt;Integer&gt;()]
 **date** | **OffsetDateTime**| Filter by a specific date, used as the &#x60;start_date&#x60; and &#x60;end_date&#x60; where applicable | [optional]
 **yearCode** | **String**| Filter by school year | [optional]
 **demographics** | **Boolean**| Include demographics data | [optional]
 **contacts** | **Boolean**| Include contacts data | [optional]
 **senNeeds** | **Boolean**| Include SEN needs data | [optional]
 **emails** | **Boolean**| Include email addresses | [optional]
 **addresses** | **Boolean**| Include address data | [optional]
 **care** | **Boolean**| Include student care data (you must also supply the demographics parameter) | [optional]
 **everInCare** | **Boolean**| Include whether the student has ever been in care (you must also supply the demographics parameter) | [optional]
 **languages** | **Boolean**| Include student language data | [optional]
 **photo** | **Boolean**| Include student photo data | [optional]
 **perPage** | **Integer**| Number of results to return | [optional] [default to 100]
 **page** | **Integer**| Page number to return | [optional] [default to 1]

### Return type

[**List&lt;Student&gt;**](Student.md)

### Authorization

[SchoolToken](../README.md#SchoolToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.assembly+json; version=1.1

<a name="getSubjects"></a>
# **getSubjects**
> List&lt;Subject&gt; getSubjects(perPage, page)

List Subjects

Returns a list of the Assembly Platform&#39;s subjects

### Example
```java
// Import classes:
//import education.assembly.platform.spring.ApiClient;
//import education.assembly.platform.spring.ApiException;
//import education.assembly.platform.spring.Configuration;
//import education.assembly.platform.spring.auth.*;
//import education.assembly.platform.spring.AssemblyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: SchoolToken
HttpBasicAuth SchoolToken = (HttpBasicAuth) defaultClient.getAuthentication("SchoolToken");
SchoolToken.setUsername("YOUR USERNAME");
SchoolToken.setPassword("YOUR PASSWORD");

AssemblyApi apiInstance = new AssemblyApi();
Integer perPage = 50; // Integer | Number of results to return
Integer page = 5; // Integer | Page number to return
try {
    List<Subject> result = apiInstance.getSubjects(perPage, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssemblyApi#getSubjects");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **perPage** | **Integer**| Number of results to return | [optional] [default to 100]
 **page** | **Integer**| Page number to return | [optional] [default to 1]

### Return type

[**List&lt;Subject&gt;**](Subject.md)

### Authorization

[SchoolToken](../README.md#SchoolToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.assembly+json; version=1.1

<a name="getTeachingGroupStudents"></a>
# **getTeachingGroupStudents**
> List&lt;Student&gt; getTeachingGroupStudents(id, ifModifiedSince, academicYearId, date, yearCode, demographics, contacts, senNeeds, emails, addresses, care, everInCare, languages, photo, perPage, page)

List Students for Teaching Group

Returns a list of all the students that are present in the teaching group identified by &#x60;group_id&#x60;

### Example
```java
// Import classes:
//import education.assembly.platform.spring.ApiClient;
//import education.assembly.platform.spring.ApiException;
//import education.assembly.platform.spring.Configuration;
//import education.assembly.platform.spring.auth.*;
//import education.assembly.platform.spring.AssemblyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: SchoolToken
HttpBasicAuth SchoolToken = (HttpBasicAuth) defaultClient.getAuthentication("SchoolToken");
SchoolToken.setUsername("YOUR USERNAME");
SchoolToken.setPassword("YOUR PASSWORD");

AssemblyApi apiInstance = new AssemblyApi();
Integer id = 56; // Integer | Internal identifier of the entity
OffsetDateTime ifModifiedSince = new OffsetDateTime(); // OffsetDateTime | Filter results since it was last fetched (see [Conditional Requests](/#section/Concepts/Conditional-Requests))
Integer academicYearId = 56; // Integer | Include all groups and group memberships from the specified academic year
String date = "date_example"; // String | Filter by a specific date, used as the `start_date` and `end_date` where applicable
Integer yearCode = 56; // Integer | Filter by school year
Boolean demographics = true; // Boolean | Include demographics data
Boolean contacts = true; // Boolean | Include contacts data
Boolean senNeeds = true; // Boolean | Include SEN needs data
Boolean emails = true; // Boolean | Include email addresses
Boolean addresses = true; // Boolean | Include address data
Boolean care = true; // Boolean | Include student care data (you must also supply the demographics parameter)
Boolean everInCare = true; // Boolean | Include whether the student has ever been in care (you must also supply the demographics parameter)
Boolean languages = true; // Boolean | Include student language data
Boolean photo = true; // Boolean | Include student photo data
Integer perPage = 50; // Integer | Number of results to return
Integer page = 5; // Integer | Page number to return
try {
    List<Student> result = apiInstance.getTeachingGroupStudents(id, ifModifiedSince, academicYearId, date, yearCode, demographics, contacts, senNeeds, emails, addresses, care, everInCare, languages, photo, perPage, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssemblyApi#getTeachingGroupStudents");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Internal identifier of the entity |
 **ifModifiedSince** | **OffsetDateTime**| Filter results since it was last fetched (see [Conditional Requests](/#section/Concepts/Conditional-Requests)) | [optional]
 **academicYearId** | **Integer**| Include all groups and group memberships from the specified academic year | [optional]
 **date** | **String**| Filter by a specific date, used as the &#x60;start_date&#x60; and &#x60;end_date&#x60; where applicable | [optional]
 **yearCode** | **Integer**| Filter by school year | [optional]
 **demographics** | **Boolean**| Include demographics data | [optional]
 **contacts** | **Boolean**| Include contacts data | [optional]
 **senNeeds** | **Boolean**| Include SEN needs data | [optional]
 **emails** | **Boolean**| Include email addresses | [optional]
 **addresses** | **Boolean**| Include address data | [optional]
 **care** | **Boolean**| Include student care data (you must also supply the demographics parameter) | [optional]
 **everInCare** | **Boolean**| Include whether the student has ever been in care (you must also supply the demographics parameter) | [optional]
 **languages** | **Boolean**| Include student language data | [optional]
 **photo** | **Boolean**| Include student photo data | [optional]
 **perPage** | **Integer**| Number of results to return | [optional] [default to 100]
 **page** | **Integer**| Page number to return | [optional] [default to 1]

### Return type

[**List&lt;Student&gt;**](Student.md)

### Authorization

[SchoolToken](../README.md#SchoolToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.assembly+json; version=1.1

<a name="getTeachingGroups"></a>
# **getTeachingGroups**
> List&lt;TeachingGroup&gt; getTeachingGroups(ifModifiedSince, subjectCode, yearCode, date, academicYearId, perPage, page)

List Teaching Groups

Returns a list of teaching groups that match the given set of filters.  If a date parameter is provided then the list of groups returned is filtered to only those where the provided date falls between the groups start_date and end_date. Additionally when a date parameter is provided student_ids and supervior_ids are restricted to only those students who were enrolled in the group on the given date. 

### Example
```java
// Import classes:
//import education.assembly.platform.spring.ApiClient;
//import education.assembly.platform.spring.ApiException;
//import education.assembly.platform.spring.Configuration;
//import education.assembly.platform.spring.auth.*;
//import education.assembly.platform.spring.AssemblyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: SchoolToken
HttpBasicAuth SchoolToken = (HttpBasicAuth) defaultClient.getAuthentication("SchoolToken");
SchoolToken.setUsername("YOUR USERNAME");
SchoolToken.setPassword("YOUR PASSWORD");

AssemblyApi apiInstance = new AssemblyApi();
OffsetDateTime ifModifiedSince = new OffsetDateTime(); // OffsetDateTime | Filter results since it was last fetched (see [Conditional Requests](/#section/Concepts/Conditional-Requests))
String subjectCode = "subjectCode_example"; // String | Filter by subject
Integer yearCode = 56; // Integer | Filter by school year
OffsetDateTime date = new OffsetDateTime(); // OffsetDateTime | Filter by a specific date, used as the `start_date` and `end_date` where applicable
Integer academicYearId = 56; // Integer | Include all groups and group memberships from the specified academic year
Integer perPage = 50; // Integer | Number of results to return
Integer page = 5; // Integer | Page number to return
try {
    List<TeachingGroup> result = apiInstance.getTeachingGroups(ifModifiedSince, subjectCode, yearCode, date, academicYearId, perPage, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssemblyApi#getTeachingGroups");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ifModifiedSince** | **OffsetDateTime**| Filter results since it was last fetched (see [Conditional Requests](/#section/Concepts/Conditional-Requests)) | [optional]
 **subjectCode** | **String**| Filter by subject | [optional]
 **yearCode** | **Integer**| Filter by school year | [optional]
 **date** | **OffsetDateTime**| Filter by a specific date, used as the &#x60;start_date&#x60; and &#x60;end_date&#x60; where applicable | [optional]
 **academicYearId** | **Integer**| Include all groups and group memberships from the specified academic year | [optional]
 **perPage** | **Integer**| Number of results to return | [optional] [default to 100]
 **page** | **Integer**| Page number to return | [optional] [default to 1]

### Return type

[**List&lt;TeachingGroup&gt;**](TeachingGroup.md)

### Authorization

[SchoolToken](../README.md#SchoolToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.assembly+json; version=1.1

<a name="getTimetables"></a>
# **getTimetables**
> List&lt;Timetable&gt; getTimetables(ifModifiedSince, perPage, page)

List Timetables

Returns a list of timetables that match the given set of filters.  If a date parameter is provided then the list of groups returned is filtered to only those where the provided date falls between the groups start_date and end_date. Additionally when a date parameter is provided student_ids and supervior_ids are restricted to only those students who were enrolled in the group on the given date. 

### Example
```java
// Import classes:
//import education.assembly.platform.spring.ApiClient;
//import education.assembly.platform.spring.ApiException;
//import education.assembly.platform.spring.Configuration;
//import education.assembly.platform.spring.auth.*;
//import education.assembly.platform.spring.AssemblyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: SchoolToken
HttpBasicAuth SchoolToken = (HttpBasicAuth) defaultClient.getAuthentication("SchoolToken");
SchoolToken.setUsername("YOUR USERNAME");
SchoolToken.setPassword("YOUR PASSWORD");

AssemblyApi apiInstance = new AssemblyApi();
OffsetDateTime ifModifiedSince = new OffsetDateTime(); // OffsetDateTime | Filter results since it was last fetched (see [Conditional Requests](/#section/Concepts/Conditional-Requests))
Integer perPage = 50; // Integer | Number of results to return
Integer page = 5; // Integer | Page number to return
try {
    List<Timetable> result = apiInstance.getTimetables(ifModifiedSince, perPage, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssemblyApi#getTimetables");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ifModifiedSince** | **OffsetDateTime**| Filter results since it was last fetched (see [Conditional Requests](/#section/Concepts/Conditional-Requests)) | [optional]
 **perPage** | **Integer**| Number of results to return | [optional] [default to 100]
 **page** | **Integer**| Page number to return | [optional] [default to 1]

### Return type

[**List&lt;Timetable&gt;**](Timetable.md)

### Authorization

[SchoolToken](../README.md#SchoolToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.assembly+json; version=1.1

<a name="getYearGroupStudents"></a>
# **getYearGroupStudents**
> List&lt;Student&gt; getYearGroupStudents(id, ifModifiedSince, date, demographics, contacts, senNeeds, emails, addresses, care, everInCare, languages, photo, perPage, page)

List Students for Year Group

Returns a list of all the students that are present in the year group identified by &#x60;group_id&#x60;

### Example
```java
// Import classes:
//import education.assembly.platform.spring.ApiClient;
//import education.assembly.platform.spring.ApiException;
//import education.assembly.platform.spring.Configuration;
//import education.assembly.platform.spring.auth.*;
//import education.assembly.platform.spring.AssemblyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: SchoolToken
HttpBasicAuth SchoolToken = (HttpBasicAuth) defaultClient.getAuthentication("SchoolToken");
SchoolToken.setUsername("YOUR USERNAME");
SchoolToken.setPassword("YOUR PASSWORD");

AssemblyApi apiInstance = new AssemblyApi();
Integer id = 56; // Integer | Internal identifier of the entity
OffsetDateTime ifModifiedSince = new OffsetDateTime(); // OffsetDateTime | Filter results since it was last fetched (see [Conditional Requests](/#section/Concepts/Conditional-Requests))
OffsetDateTime date = new OffsetDateTime(); // OffsetDateTime | Filter by a specific date, used as the `start_date` and `end_date` where applicable
Boolean demographics = true; // Boolean | Include demographics data
Boolean contacts = true; // Boolean | Include contacts data
Boolean senNeeds = true; // Boolean | Include SEN needs data
Boolean emails = true; // Boolean | Include email addresses
Boolean addresses = true; // Boolean | Include address data
Boolean care = true; // Boolean | Include student care data (you must also supply the demographics parameter)
Boolean everInCare = true; // Boolean | Include whether the student has ever been in care (you must also supply the demographics parameter)
Boolean languages = true; // Boolean | Include student language data
Boolean photo = true; // Boolean | Include student photo data
Integer perPage = 50; // Integer | Number of results to return
Integer page = 5; // Integer | Page number to return
try {
    List<Student> result = apiInstance.getYearGroupStudents(id, ifModifiedSince, date, demographics, contacts, senNeeds, emails, addresses, care, everInCare, languages, photo, perPage, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssemblyApi#getYearGroupStudents");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Internal identifier of the entity |
 **ifModifiedSince** | **OffsetDateTime**| Filter results since it was last fetched (see [Conditional Requests](/#section/Concepts/Conditional-Requests)) | [optional]
 **date** | **OffsetDateTime**| Filter by a specific date, used as the &#x60;start_date&#x60; and &#x60;end_date&#x60; where applicable | [optional]
 **demographics** | **Boolean**| Include demographics data | [optional]
 **contacts** | **Boolean**| Include contacts data | [optional]
 **senNeeds** | **Boolean**| Include SEN needs data | [optional]
 **emails** | **Boolean**| Include email addresses | [optional]
 **addresses** | **Boolean**| Include address data | [optional]
 **care** | **Boolean**| Include student care data (you must also supply the demographics parameter) | [optional]
 **everInCare** | **Boolean**| Include whether the student has ever been in care (you must also supply the demographics parameter) | [optional]
 **languages** | **Boolean**| Include student language data | [optional]
 **photo** | **Boolean**| Include student photo data | [optional]
 **perPage** | **Integer**| Number of results to return | [optional] [default to 100]
 **page** | **Integer**| Page number to return | [optional] [default to 1]

### Return type

[**List&lt;Student&gt;**](Student.md)

### Authorization

[SchoolToken](../README.md#SchoolToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.assembly+json; version=1.1

<a name="getYearGroups"></a>
# **getYearGroups**
> List&lt;YearGroup&gt; getYearGroups(ifModifiedSince, date, yearCode, academicYearId, perPage, page)

List Year Groups

Returns a list of year groups that match the given set of filters.  If a date parameter is provided then the list of groups returned is filtered to only those where the provided date falls between the groups &#x60;start_date&#x60; and &#x60;end_date&#x60;. Additionally when a date parameter is provided &#x60;student_ids&#x60; and &#x60;supervior_ids&#x60; are restricted to only those students who were enrolled in the group on the given date. 

### Example
```java
// Import classes:
//import education.assembly.platform.spring.ApiClient;
//import education.assembly.platform.spring.ApiException;
//import education.assembly.platform.spring.Configuration;
//import education.assembly.platform.spring.auth.*;
//import education.assembly.platform.spring.AssemblyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: SchoolToken
HttpBasicAuth SchoolToken = (HttpBasicAuth) defaultClient.getAuthentication("SchoolToken");
SchoolToken.setUsername("YOUR USERNAME");
SchoolToken.setPassword("YOUR PASSWORD");

AssemblyApi apiInstance = new AssemblyApi();
OffsetDateTime ifModifiedSince = new OffsetDateTime(); // OffsetDateTime | Filter results since it was last fetched (see [Conditional Requests](/#section/Concepts/Conditional-Requests))
OffsetDateTime date = new OffsetDateTime(); // OffsetDateTime | Filter by a specific date, used as the `start_date` and `end_date` where applicable
String yearCode = "yearCode_example"; // String | Filter by school year
Integer academicYearId = 56; // Integer | Include all groups and group memberships from the specified academic year
Integer perPage = 50; // Integer | Number of results to return
Integer page = 5; // Integer | Page number to return
try {
    List<YearGroup> result = apiInstance.getYearGroups(ifModifiedSince, date, yearCode, academicYearId, perPage, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssemblyApi#getYearGroups");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ifModifiedSince** | **OffsetDateTime**| Filter results since it was last fetched (see [Conditional Requests](/#section/Concepts/Conditional-Requests)) | [optional]
 **date** | **OffsetDateTime**| Filter by a specific date, used as the &#x60;start_date&#x60; and &#x60;end_date&#x60; where applicable | [optional]
 **yearCode** | **String**| Filter by school year | [optional]
 **academicYearId** | **Integer**| Include all groups and group memberships from the specified academic year | [optional]
 **perPage** | **Integer**| Number of results to return | [optional] [default to 100]
 **page** | **Integer**| Page number to return | [optional] [default to 1]

### Return type

[**List&lt;YearGroup&gt;**](YearGroup.md)

### Authorization

[SchoolToken](../README.md#SchoolToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.assembly+json; version=1.1

<a name="status"></a>
# **status**
> SchoolStatus status()

View School Sync Status

Returns status for the school associated with the provided &#x60;access_token&#x60;

### Example
```java
// Import classes:
//import education.assembly.platform.spring.ApiClient;
//import education.assembly.platform.spring.ApiException;
//import education.assembly.platform.spring.Configuration;
//import education.assembly.platform.spring.auth.*;
//import education.assembly.platform.spring.AssemblyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: SchoolToken
HttpBasicAuth SchoolToken = (HttpBasicAuth) defaultClient.getAuthentication("SchoolToken");
SchoolToken.setUsername("YOUR USERNAME");
SchoolToken.setPassword("YOUR PASSWORD");

AssemblyApi apiInstance = new AssemblyApi();
try {
    SchoolStatus result = apiInstance.status();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssemblyApi#status");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**SchoolStatus**](SchoolStatus.md)

### Authorization

[SchoolToken](../README.md#SchoolToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.assembly+json; version=1.1

<a name="updateResults"></a>
# **updateResults**
> Result updateResults(id, resultUpdate)

Update a Single Result

Once a result has been created, it can be updated on the Platform by passing the required field values in the request body. A list of the fields that were changed are returned in the response

### Example
```java
// Import classes:
//import education.assembly.platform.spring.ApiClient;
//import education.assembly.platform.spring.ApiException;
//import education.assembly.platform.spring.Configuration;
//import education.assembly.platform.spring.auth.*;
//import education.assembly.platform.spring.AssemblyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: SchoolToken
HttpBasicAuth SchoolToken = (HttpBasicAuth) defaultClient.getAuthentication("SchoolToken");
SchoolToken.setUsername("YOUR USERNAME");
SchoolToken.setPassword("YOUR PASSWORD");

AssemblyApi apiInstance = new AssemblyApi();
Integer id = 56; // Integer | Internal identifier of the entity
ResultUpdate resultUpdate = new ResultUpdate(); // ResultUpdate | 
try {
    Result result = apiInstance.updateResults(id, resultUpdate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssemblyApi#updateResults");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Internal identifier of the entity |
 **resultUpdate** | [**ResultUpdate**](ResultUpdate.md)|  | [optional]

### Return type

[**Result**](Result.md)

### Authorization

[SchoolToken](../README.md#SchoolToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.assembly+json; version=1.1

