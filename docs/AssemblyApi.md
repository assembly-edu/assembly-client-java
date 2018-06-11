# AssemblyApi

All URIs are relative to *https://api-sandbox.assembly.education*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAcademicYears**](AssemblyApi.md#getAcademicYears) | **GET** /academic_years | 
[**getAssessmentPoints**](AssemblyApi.md#getAssessmentPoints) | **GET** /assessment_points | 
[**getAssessmentPointsAssessmentPointRank**](AssemblyApi.md#getAssessmentPointsAssessmentPointRank) | **GET** /assessment_points/{assessment_point_rank} | 
[**getAssessmentPointsAssessmentPointRankResults**](AssemblyApi.md#getAssessmentPointsAssessmentPointRankResults) | **GET** /assessment_points/{assessment_point_rank}/results | 
[**getAssessments**](AssemblyApi.md#getAssessments) | **GET** /assessments | 
[**getAssessmentsAssessmentId**](AssemblyApi.md#getAssessmentsAssessmentId) | **GET** /assessments/{assessment_id} | 
[**getAssessmentsAssessmentIdGradeSet**](AssemblyApi.md#getAssessmentsAssessmentIdGradeSet) | **GET** /assessments/{assessment_id}/grade_set | 
[**getAssessmentsAssessmentIdResults**](AssemblyApi.md#getAssessmentsAssessmentIdResults) | **GET** /assessments/{assessment_id}/results | 
[**getAttendances**](AssemblyApi.md#getAttendances) | **GET** /attendances | 
[**getCalendarEvents**](AssemblyApi.md#getCalendarEvents) | **GET** /calendar_events | 
[**getContacts**](AssemblyApi.md#getContacts) | **GET** /contacts | 
[**getExclusions**](AssemblyApi.md#getExclusions) | **GET** /exclusions | 
[**getExclusionsStudentId**](AssemblyApi.md#getExclusionsStudentId) | **GET** /exclusions/{student_id} | 
[**getFacetFacetId**](AssemblyApi.md#getFacetFacetId) | **GET** /facet/{facet_id} | 
[**getFacets**](AssemblyApi.md#getFacets) | **GET** /facets | 
[**getRegistrationGroups**](AssemblyApi.md#getRegistrationGroups) | **GET** /registration_groups | 
[**getRegistrationGroupsGroupId**](AssemblyApi.md#getRegistrationGroupsGroupId) | **GET** /registration_groups/{group_id} | 
[**getRegistrationGroupsGroupIdStudents**](AssemblyApi.md#getRegistrationGroupsGroupIdStudents) | **GET** /registration_groups/{group_id}/students | 
[**getSchoolDetails**](AssemblyApi.md#getSchoolDetails) | **GET** /school_details | 
[**getStaffAbsences**](AssemblyApi.md#getStaffAbsences) | **GET** /staff_absences | 
[**getStaffContracts**](AssemblyApi.md#getStaffContracts) | **GET** /staff_contracts | 
[**getStaffContractsStaffMemberId**](AssemblyApi.md#getStaffContractsStaffMemberId) | **GET** /staff_contracts/{staff_member_id} | 
[**getStaffMembers**](AssemblyApi.md#getStaffMembers) | **GET** /staff_members | 
[**getStaffMembersStaffMemberId**](AssemblyApi.md#getStaffMembersStaffMemberId) | **GET** /staff_members/{staff_member_id} | 
[**getStudents**](AssemblyApi.md#getStudents) | **GET** /students | 
[**getStudentsStudentId**](AssemblyApi.md#getStudentsStudentId) | **GET** /students/{student_id} | 
[**getSubjects**](AssemblyApi.md#getSubjects) | **GET** /subjects | 
[**getTeachingGroups**](AssemblyApi.md#getTeachingGroups) | **GET** /teaching_groups | 
[**getTeachingGroupsGroupId**](AssemblyApi.md#getTeachingGroupsGroupId) | **GET** /teaching_groups/{group_id} | 
[**getTeachingGroupsGroupIdStudents**](AssemblyApi.md#getTeachingGroupsGroupIdStudents) | **GET** /teaching_groups/{group_id}/students | 
[**getYearGroups**](AssemblyApi.md#getYearGroups) | **GET** /year_groups | 
[**getYearGroupsGroupId**](AssemblyApi.md#getYearGroupsGroupId) | **GET** /year_groups/{group_id} | 
[**getYearGroupsGroupIdStudents**](AssemblyApi.md#getYearGroupsGroupIdStudents) | **GET** /year_groups/{group_id}/students | 
[**patchResults**](AssemblyApi.md#patchResults) | **PATCH** /results | 
[**patchResultsResultId**](AssemblyApi.md#patchResultsResultId) | **PATCH** /results/{result_id} | 


<a name="getAcademicYears"></a>
# **getAcademicYears**
> AcademicYearList getAcademicYears(page, perPage)



Returns a list of academic years for the school associated with the provided access_token. The dates of these academic years can be used to filter data in other API endpoints.

### Example
```java
// Import classes:
//import education.assembly.platform.spring.ApiClient;
//import education.assembly.platform.spring.ApiException;
//import education.assembly.platform.spring.Configuration;
//import education.assembly.platform.spring.auth.*;
//import education.assembly.platform.spring.AssemblyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

AssemblyApi apiInstance = new AssemblyApi();
Integer page = 1; // Integer | Page number to return
Integer perPage = 100; // Integer | Number of results to return
try {
    AcademicYearList result = apiInstance.getAcademicYears(page, perPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssemblyApi#getAcademicYears");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| Page number to return | [optional] [default to 1]
 **perPage** | **Integer**| Number of results to return | [optional] [default to 100]

### Return type

[**AcademicYearList**](AcademicYearList.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.assembly+json; version=1

<a name="getAssessmentPoints"></a>
# **getAssessmentPoints**
> AssessmentPointList getAssessmentPoints(yearCode, type, page, perPage)



Returns a list of assessment points. An assessment_point object represents a point in the school key stage, year, term or half-term that results can be attached to. When sending results back to the Platform, the &#x60;assessment_point_rank&#x60; should be used - this will remain constant across all environments.

### Example
```java
// Import classes:
//import education.assembly.platform.spring.ApiClient;
//import education.assembly.platform.spring.ApiException;
//import education.assembly.platform.spring.Configuration;
//import education.assembly.platform.spring.auth.*;
//import education.assembly.platform.spring.AssemblyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

AssemblyApi apiInstance = new AssemblyApi();
String yearCode = "yearCode_example"; // String | Filter by a specific NC year code
String type = "type_example"; // String | Filter by assessment point type
Integer page = 1; // Integer | Page number to return
Integer perPage = 100; // Integer | Number of results to return
try {
    AssessmentPointList result = apiInstance.getAssessmentPoints(yearCode, type, page, perPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssemblyApi#getAssessmentPoints");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **yearCode** | **String**| Filter by a specific NC year code | [optional]
 **type** | **String**| Filter by assessment point type | [optional]
 **page** | **Integer**| Page number to return | [optional] [default to 1]
 **perPage** | **Integer**| Number of results to return | [optional] [default to 100]

### Return type

[**AssessmentPointList**](AssessmentPointList.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.assembly+json; version=1

<a name="getAssessmentPointsAssessmentPointRank"></a>
# **getAssessmentPointsAssessmentPointRank**
> AssessmentPoint getAssessmentPointsAssessmentPointRank(assessmentPointRank)



Returns a single assessment point for the given rank.

### Example
```java
// Import classes:
//import education.assembly.platform.spring.ApiClient;
//import education.assembly.platform.spring.ApiException;
//import education.assembly.platform.spring.Configuration;
//import education.assembly.platform.spring.auth.*;
//import education.assembly.platform.spring.AssemblyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

AssemblyApi apiInstance = new AssemblyApi();
String assessmentPointRank = "assessmentPointRank_example"; // String | The rank of the assessment point as an Integer
try {
    AssessmentPoint result = apiInstance.getAssessmentPointsAssessmentPointRank(assessmentPointRank);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssemblyApi#getAssessmentPointsAssessmentPointRank");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assessmentPointRank** | **String**| The rank of the assessment point as an Integer |

### Return type

[**AssessmentPoint**](AssessmentPoint.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.assembly+json; version=1

<a name="getAssessmentPointsAssessmentPointRankResults"></a>
# **getAssessmentPointsAssessmentPointRankResults**
> ResultList getAssessmentPointsAssessmentPointRankResults(assessmentPointRank, students, page, perPage)



Returns a list of results for the given assessment_point_rank and students.

### Example
```java
// Import classes:
//import education.assembly.platform.spring.ApiClient;
//import education.assembly.platform.spring.ApiException;
//import education.assembly.platform.spring.Configuration;
//import education.assembly.platform.spring.auth.*;
//import education.assembly.platform.spring.AssemblyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

AssemblyApi apiInstance = new AssemblyApi();
String assessmentPointRank = "assessmentPointRank_example"; // String | The rank of the assessment point as an Integer
String students = "students_example"; // String | ID(s) of the student(s) as an Integer. Multiple IDs can be separated with a space (so a + URL encoded).
Integer page = 1; // Integer | Page number to return
Integer perPage = 100; // Integer | Number of results to return
try {
    ResultList result = apiInstance.getAssessmentPointsAssessmentPointRankResults(assessmentPointRank, students, page, perPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssemblyApi#getAssessmentPointsAssessmentPointRankResults");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assessmentPointRank** | **String**| The rank of the assessment point as an Integer |
 **students** | **String**| ID(s) of the student(s) as an Integer. Multiple IDs can be separated with a space (so a + URL encoded). | [optional]
 **page** | **Integer**| Page number to return | [optional] [default to 1]
 **perPage** | **Integer**| Number of results to return | [optional] [default to 100]

### Return type

[**ResultList**](ResultList.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.assembly+json; version=1

<a name="getAssessments"></a>
# **getAssessments**
> AssessmentList getAssessments(misMappings, page, perPage)



Returns a list of assessment objects.

### Example
```java
// Import classes:
//import education.assembly.platform.spring.ApiClient;
//import education.assembly.platform.spring.ApiException;
//import education.assembly.platform.spring.Configuration;
//import education.assembly.platform.spring.auth.*;
//import education.assembly.platform.spring.AssemblyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

AssemblyApi apiInstance = new AssemblyApi();
Boolean misMappings = false; // Boolean | Includes the names of any MIS components to this object
Integer page = 1; // Integer | Page number to return
Integer perPage = 100; // Integer | Number of results to return
try {
    AssessmentList result = apiInstance.getAssessments(misMappings, page, perPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssemblyApi#getAssessments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **misMappings** | **Boolean**| Includes the names of any MIS components to this object | [optional] [default to false]
 **page** | **Integer**| Page number to return | [optional] [default to 1]
 **perPage** | **Integer**| Number of results to return | [optional] [default to 100]

### Return type

[**AssessmentList**](AssessmentList.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.assembly+json; version=1

<a name="getAssessmentsAssessmentId"></a>
# **getAssessmentsAssessmentId**
> Assessment getAssessmentsAssessmentId(assessmentId)



Returns a single assessment for the given ID.

### Example
```java
// Import classes:
//import education.assembly.platform.spring.ApiClient;
//import education.assembly.platform.spring.ApiException;
//import education.assembly.platform.spring.Configuration;
//import education.assembly.platform.spring.auth.*;
//import education.assembly.platform.spring.AssemblyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

AssemblyApi apiInstance = new AssemblyApi();
String assessmentId = "assessmentId_example"; // String | ID of the assessment as an Integer.
try {
    Assessment result = apiInstance.getAssessmentsAssessmentId(assessmentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssemblyApi#getAssessmentsAssessmentId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assessmentId** | **String**| ID of the assessment as an Integer. |

### Return type

[**Assessment**](Assessment.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.assembly+json; version=1

<a name="getAssessmentsAssessmentIdGradeSet"></a>
# **getAssessmentsAssessmentIdGradeSet**
> Gradeset getAssessmentsAssessmentIdGradeSet(assessmentId)



Returns a gradeset (an acceptable list of values) for the assessment identified by the assessment_id. Grades should be written back to the Platform using the grade_id.

### Example
```java
// Import classes:
//import education.assembly.platform.spring.ApiClient;
//import education.assembly.platform.spring.ApiException;
//import education.assembly.platform.spring.Configuration;
//import education.assembly.platform.spring.auth.*;
//import education.assembly.platform.spring.AssemblyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

AssemblyApi apiInstance = new AssemblyApi();
String assessmentId = "assessmentId_example"; // String | ID of the assessment as an Integer.
try {
    Gradeset result = apiInstance.getAssessmentsAssessmentIdGradeSet(assessmentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssemblyApi#getAssessmentsAssessmentIdGradeSet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assessmentId** | **String**| ID of the assessment as an Integer. |

### Return type

[**Gradeset**](Gradeset.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.assembly+json; version=1

<a name="getAssessmentsAssessmentIdResults"></a>
# **getAssessmentsAssessmentIdResults**
> Result getAssessmentsAssessmentIdResults(assessmentId, students)



Returns a list of results for the given assessment_id and students. For a full list of national assessment data (Key stage 1 and 2 SATs results) available on the Platform, please see this support article.

### Example
```java
// Import classes:
//import education.assembly.platform.spring.ApiClient;
//import education.assembly.platform.spring.ApiException;
//import education.assembly.platform.spring.Configuration;
//import education.assembly.platform.spring.auth.*;
//import education.assembly.platform.spring.AssemblyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

AssemblyApi apiInstance = new AssemblyApi();
String assessmentId = "assessmentId_example"; // String | ID of the assessment as an Integer.
String students = "students_example"; // String | ID(s) of the student(s) as an Integer. Multiple IDs can be separated with a space (so a + URL encoded).
try {
    Result result = apiInstance.getAssessmentsAssessmentIdResults(assessmentId, students);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssemblyApi#getAssessmentsAssessmentIdResults");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assessmentId** | **String**| ID of the assessment as an Integer. |
 **students** | **String**| ID(s) of the student(s) as an Integer. Multiple IDs can be separated with a space (so a + URL encoded). | [optional]

### Return type

[**Result**](Result.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.assembly+json; version=1

<a name="getAttendances"></a>
# **getAttendances**
> AttendanceList getAttendances(studentId, registrationGroupId, startDate, endDate, page, perPage, ifModifiedSince)



Returns a list of attendances, filtered by date, student, or registration group. By default, attendances are returned from the start to the end of the current week.

### Example
```java
// Import classes:
//import education.assembly.platform.spring.ApiClient;
//import education.assembly.platform.spring.ApiException;
//import education.assembly.platform.spring.Configuration;
//import education.assembly.platform.spring.auth.*;
//import education.assembly.platform.spring.AssemblyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

AssemblyApi apiInstance = new AssemblyApi();
Integer studentId = 56; // Integer | ID of the Student as an Integer
Integer registrationGroupId = 56; // Integer | ID of the registration group as an Integer
String startDate = "startDate_example"; // String | The start date of the period to return data for
String endDate = "endDate_example"; // String | The end date of the period to return data for
Integer page = 1; // Integer | Page number to return
Integer perPage = 100; // Integer | Number of results to return
String ifModifiedSince = "ifModifiedSince_example"; // String | Timestamp of the last response.
try {
    AttendanceList result = apiInstance.getAttendances(studentId, registrationGroupId, startDate, endDate, page, perPage, ifModifiedSince);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssemblyApi#getAttendances");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **studentId** | **Integer**| ID of the Student as an Integer | [optional]
 **registrationGroupId** | **Integer**| ID of the registration group as an Integer | [optional]
 **startDate** | **String**| The start date of the period to return data for | [optional]
 **endDate** | **String**| The end date of the period to return data for | [optional]
 **page** | **Integer**| Page number to return | [optional] [default to 1]
 **perPage** | **Integer**| Number of results to return | [optional] [default to 100]
 **ifModifiedSince** | **String**| Timestamp of the last response. | [optional]

### Return type

[**AttendanceList**](AttendanceList.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.assembly+json; version=1

<a name="getCalendarEvents"></a>
# **getCalendarEvents**
> CalendarEventList getCalendarEvents(eventType, page, perPage, ifModifiedSince)



Returns a list of calendar events from the school calendar. We strongly recommend that you use an object type to filter the events that will be returned to you. Presently, with SIMS only support, we&#39;ve exposed the raw types from the underlying MIS. As such, it&#39;s most likely that you&#39;ll mostly be interested in &#39;User&#39; events. This category includes items such as staff meetings and school assembly times as you can see from the sample response below.

### Example
```java
// Import classes:
//import education.assembly.platform.spring.ApiClient;
//import education.assembly.platform.spring.ApiException;
//import education.assembly.platform.spring.Configuration;
//import education.assembly.platform.spring.auth.*;
//import education.assembly.platform.spring.AssemblyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

AssemblyApi apiInstance = new AssemblyApi();
String eventType = "eventType_example"; // String | Return a calendar object type from the underlying MIS
Integer page = 1; // Integer | Page number to return
Integer perPage = 100; // Integer | Number of results to return
String ifModifiedSince = "ifModifiedSince_example"; // String | Timestamp of the last response.
try {
    CalendarEventList result = apiInstance.getCalendarEvents(eventType, page, perPage, ifModifiedSince);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssemblyApi#getCalendarEvents");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventType** | **String**| Return a calendar object type from the underlying MIS | [optional]
 **page** | **Integer**| Page number to return | [optional] [default to 1]
 **perPage** | **Integer**| Number of results to return | [optional] [default to 100]
 **ifModifiedSince** | **String**| Timestamp of the last response. | [optional]

### Return type

[**CalendarEventList**](CalendarEventList.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.assembly+json; version=1

<a name="getContacts"></a>
# **getContacts**
> ContactList getContacts(studentId, page, perPage)



Returns a list of contacts that match the given set of filters.

### Example
```java
// Import classes:
//import education.assembly.platform.spring.ApiClient;
//import education.assembly.platform.spring.ApiException;
//import education.assembly.platform.spring.Configuration;
//import education.assembly.platform.spring.auth.*;
//import education.assembly.platform.spring.AssemblyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

AssemblyApi apiInstance = new AssemblyApi();
Integer studentId = 56; // Integer | ID of the Student as an Integer
Integer page = 1; // Integer | Page number to return
Integer perPage = 100; // Integer | Number of results to return
try {
    ContactList result = apiInstance.getContacts(studentId, page, perPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssemblyApi#getContacts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **studentId** | **Integer**| ID of the Student as an Integer | [optional]
 **page** | **Integer**| Page number to return | [optional] [default to 1]
 **perPage** | **Integer**| Number of results to return | [optional] [default to 100]

### Return type

[**ContactList**](ContactList.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.assembly+json; version=1

<a name="getExclusions"></a>
# **getExclusions**
> ExclusionList getExclusions(startDate, endDate, page, perPage)



Returns a list of exclusions. By default, exclusions are returned that occurred during the current academic year.

### Example
```java
// Import classes:
//import education.assembly.platform.spring.ApiClient;
//import education.assembly.platform.spring.ApiException;
//import education.assembly.platform.spring.Configuration;
//import education.assembly.platform.spring.auth.*;
//import education.assembly.platform.spring.AssemblyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

AssemblyApi apiInstance = new AssemblyApi();
String startDate = "startDate_example"; // String | The start date of the period to return data for
String endDate = "endDate_example"; // String | The end date of the period to return data for
Integer page = 1; // Integer | Page number to return
Integer perPage = 100; // Integer | Number of results to return
try {
    ExclusionList result = apiInstance.getExclusions(startDate, endDate, page, perPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssemblyApi#getExclusions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startDate** | **String**| The start date of the period to return data for | [optional]
 **endDate** | **String**| The end date of the period to return data for | [optional]
 **page** | **Integer**| Page number to return | [optional] [default to 1]
 **perPage** | **Integer**| Number of results to return | [optional] [default to 100]

### Return type

[**ExclusionList**](ExclusionList.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.assembly+json; version=1

<a name="getExclusionsStudentId"></a>
# **getExclusionsStudentId**
> ExclusionList getExclusionsStudentId(studentId, startDate, endDate, page, perPage)



Returns a list of exclusions for a given student. By default, exclusions are returned that occurred during the current academic year.

### Example
```java
// Import classes:
//import education.assembly.platform.spring.ApiClient;
//import education.assembly.platform.spring.ApiException;
//import education.assembly.platform.spring.Configuration;
//import education.assembly.platform.spring.auth.*;
//import education.assembly.platform.spring.AssemblyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

AssemblyApi apiInstance = new AssemblyApi();
String studentId = "studentId_example"; // String | ID of the Student as an Integer
String startDate = "startDate_example"; // String | The start date of the period to return data for
String endDate = "endDate_example"; // String | The end date of the period to return data for
Integer page = 1; // Integer | Page number to return
Integer perPage = 100; // Integer | Number of results to return
try {
    ExclusionList result = apiInstance.getExclusionsStudentId(studentId, startDate, endDate, page, perPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssemblyApi#getExclusionsStudentId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **studentId** | **String**| ID of the Student as an Integer |
 **startDate** | **String**| The start date of the period to return data for | [optional]
 **endDate** | **String**| The end date of the period to return data for | [optional]
 **page** | **Integer**| Page number to return | [optional] [default to 1]
 **perPage** | **Integer**| Number of results to return | [optional] [default to 100]

### Return type

[**ExclusionList**](ExclusionList.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.assembly+json; version=1

<a name="getFacetFacetId"></a>
# **getFacetFacetId**
> Facet getFacetFacetId(facetId)



Returns a single facet for the given ID.

### Example
```java
// Import classes:
//import education.assembly.platform.spring.ApiClient;
//import education.assembly.platform.spring.ApiException;
//import education.assembly.platform.spring.Configuration;
//import education.assembly.platform.spring.auth.*;
//import education.assembly.platform.spring.AssemblyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

AssemblyApi apiInstance = new AssemblyApi();
String facetId = "facetId_example"; // String | ID of the facet as an Integer.
try {
    Facet result = apiInstance.getFacetFacetId(facetId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssemblyApi#getFacetFacetId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **facetId** | **String**| ID of the facet as an Integer. |

### Return type

[**Facet**](Facet.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.assembly+json; version=1

<a name="getFacets"></a>
# **getFacets**
> FacetList getFacets(page, perPage)



Returns a list of facets. The facet is used to reflect a different type of grade and allows 2 grades of the same assessment to be compared.

### Example
```java
// Import classes:
//import education.assembly.platform.spring.ApiClient;
//import education.assembly.platform.spring.ApiException;
//import education.assembly.platform.spring.Configuration;
//import education.assembly.platform.spring.auth.*;
//import education.assembly.platform.spring.AssemblyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

AssemblyApi apiInstance = new AssemblyApi();
Integer page = 1; // Integer | Page number to return
Integer perPage = 100; // Integer | Number of results to return
try {
    FacetList result = apiInstance.getFacets(page, perPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssemblyApi#getFacets");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| Page number to return | [optional] [default to 1]
 **perPage** | **Integer**| Number of results to return | [optional] [default to 100]

### Return type

[**FacetList**](FacetList.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.assembly+json; version=1

<a name="getRegistrationGroups"></a>
# **getRegistrationGroups**
> RegistrationGroupList getRegistrationGroups(yearCode, date, academicYearId, page, perPage, ifModifiedSince)



Returns a list of registration groups that match the given set of filters.

### Example
```java
// Import classes:
//import education.assembly.platform.spring.ApiClient;
//import education.assembly.platform.spring.ApiException;
//import education.assembly.platform.spring.Configuration;
//import education.assembly.platform.spring.auth.*;
//import education.assembly.platform.spring.AssemblyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

AssemblyApi apiInstance = new AssemblyApi();
String yearCode = "yearCode_example"; // String | Filter by a specific NC year code
String date = "date_example"; // String | Filter for a specific date
Integer academicYearId = 56; // Integer | Filter based on the specified academic year
Integer page = 1; // Integer | Page number to return
Integer perPage = 100; // Integer | Number of results to return
String ifModifiedSince = "ifModifiedSince_example"; // String | Timestamp of the last response.
try {
    RegistrationGroupList result = apiInstance.getRegistrationGroups(yearCode, date, academicYearId, page, perPage, ifModifiedSince);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssemblyApi#getRegistrationGroups");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **yearCode** | **String**| Filter by a specific NC year code | [optional]
 **date** | **String**| Filter for a specific date | [optional]
 **academicYearId** | **Integer**| Filter based on the specified academic year | [optional]
 **page** | **Integer**| Page number to return | [optional] [default to 1]
 **perPage** | **Integer**| Number of results to return | [optional] [default to 100]
 **ifModifiedSince** | **String**| Timestamp of the last response. | [optional]

### Return type

[**RegistrationGroupList**](RegistrationGroupList.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.assembly+json; version=1

<a name="getRegistrationGroupsGroupId"></a>
# **getRegistrationGroupsGroupId**
> RegistrationGroup getRegistrationGroupsGroupId(groupId, date, academicYearId, ifModifiedSince)



Returns a single registration group whose code matches the provided group_id. Additionally includes a list of all the student identifiers that are present in the group.

### Example
```java
// Import classes:
//import education.assembly.platform.spring.ApiClient;
//import education.assembly.platform.spring.ApiException;
//import education.assembly.platform.spring.Configuration;
//import education.assembly.platform.spring.auth.*;
//import education.assembly.platform.spring.AssemblyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

AssemblyApi apiInstance = new AssemblyApi();
String groupId = "groupId_example"; // String | ID of the Year Group as an Integer
String date = "date_example"; // String | Filter for a specific date
Integer academicYearId = 56; // Integer | Filter based on the specified academic year
String ifModifiedSince = "ifModifiedSince_example"; // String | Timestamp of the last response.
try {
    RegistrationGroup result = apiInstance.getRegistrationGroupsGroupId(groupId, date, academicYearId, ifModifiedSince);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssemblyApi#getRegistrationGroupsGroupId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **String**| ID of the Year Group as an Integer |
 **date** | **String**| Filter for a specific date | [optional]
 **academicYearId** | **Integer**| Filter based on the specified academic year | [optional]
 **ifModifiedSince** | **String**| Timestamp of the last response. | [optional]

### Return type

[**RegistrationGroup**](RegistrationGroup.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.assembly+json; version=1

<a name="getRegistrationGroupsGroupIdStudents"></a>
# **getRegistrationGroupsGroupIdStudents**
> StudentList getRegistrationGroupsGroupIdStudents(groupId, yearCode, date, academicYearId, demographics, care, page, perPage, ifModifiedSince)



Returns a list of all the students that are present in the registration group identified by group_id.

### Example
```java
// Import classes:
//import education.assembly.platform.spring.ApiClient;
//import education.assembly.platform.spring.ApiException;
//import education.assembly.platform.spring.Configuration;
//import education.assembly.platform.spring.auth.*;
//import education.assembly.platform.spring.AssemblyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

AssemblyApi apiInstance = new AssemblyApi();
String groupId = "groupId_example"; // String | ID of the Year Group as an Integer
String yearCode = "yearCode_example"; // String | Filter by a specific NC year code
String date = "date_example"; // String | Filter for a specific date
Integer academicYearId = 56; // Integer | Filter based on the specified academic year
Boolean demographics = false; // Boolean | Return demographic information along with the person (requires appropriate scope)
Boolean care = false; // Boolean | Return care information along with this object, depends on inclusion of demographics
Integer page = 1; // Integer | Page number to return
Integer perPage = 100; // Integer | Number of results to return
String ifModifiedSince = "ifModifiedSince_example"; // String | Timestamp of the last response.
try {
    StudentList result = apiInstance.getRegistrationGroupsGroupIdStudents(groupId, yearCode, date, academicYearId, demographics, care, page, perPage, ifModifiedSince);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssemblyApi#getRegistrationGroupsGroupIdStudents");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **String**| ID of the Year Group as an Integer |
 **yearCode** | **String**| Filter by a specific NC year code | [optional]
 **date** | **String**| Filter for a specific date | [optional]
 **academicYearId** | **Integer**| Filter based on the specified academic year | [optional]
 **demographics** | **Boolean**| Return demographic information along with the person (requires appropriate scope) | [optional] [default to false]
 **care** | **Boolean**| Return care information along with this object, depends on inclusion of demographics | [optional] [default to false]
 **page** | **Integer**| Page number to return | [optional] [default to 1]
 **perPage** | **Integer**| Number of results to return | [optional] [default to 100]
 **ifModifiedSince** | **String**| Timestamp of the last response. | [optional]

### Return type

[**StudentList**](StudentList.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.assembly+json; version=1

<a name="getSchoolDetails"></a>
# **getSchoolDetails**
> SchoolDetails getSchoolDetails()



Returns details for the school associated with the provided access_token.

### Example
```java
// Import classes:
//import education.assembly.platform.spring.ApiClient;
//import education.assembly.platform.spring.ApiException;
//import education.assembly.platform.spring.Configuration;
//import education.assembly.platform.spring.auth.*;
//import education.assembly.platform.spring.AssemblyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

AssemblyApi apiInstance = new AssemblyApi();
try {
    SchoolDetails result = apiInstance.getSchoolDetails();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssemblyApi#getSchoolDetails");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**SchoolDetails**](SchoolDetails.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.assembly+json; version=1

<a name="getStaffAbsences"></a>
# **getStaffAbsences**
> StaffAbsenceList getStaffAbsences(startDate, endDate, page, perPage, ifModifiedSince)



Returns a list of staff member absences for the school accociated with the provided access_token. A school level access token with the staff_members.absences scope is required to access staff member absence information.

### Example
```java
// Import classes:
//import education.assembly.platform.spring.ApiClient;
//import education.assembly.platform.spring.ApiException;
//import education.assembly.platform.spring.Configuration;
//import education.assembly.platform.spring.auth.*;
//import education.assembly.platform.spring.AssemblyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

AssemblyApi apiInstance = new AssemblyApi();
String startDate = "startDate_example"; // String | The start date of the period to return data for
String endDate = "endDate_example"; // String | The end date of the period to return data for
Integer page = 1; // Integer | Page number to return
Integer perPage = 100; // Integer | Number of results to return
String ifModifiedSince = "ifModifiedSince_example"; // String | Timestamp of the last response.
try {
    StaffAbsenceList result = apiInstance.getStaffAbsences(startDate, endDate, page, perPage, ifModifiedSince);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssemblyApi#getStaffAbsences");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startDate** | **String**| The start date of the period to return data for | [optional]
 **endDate** | **String**| The end date of the period to return data for | [optional]
 **page** | **Integer**| Page number to return | [optional] [default to 1]
 **perPage** | **Integer**| Number of results to return | [optional] [default to 100]
 **ifModifiedSince** | **String**| Timestamp of the last response. | [optional]

### Return type

[**StaffAbsenceList**](StaffAbsenceList.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.assembly+json; version=1

<a name="getStaffContracts"></a>
# **getStaffContracts**
> StaffContractList getStaffContracts(date, roles, salaries, allowances, page, perPage, ifModifiedSince)



Returns a list of staff member contracts for the school accociated with the provided access_token. A school level access token with the staff_members.contracts scope is required to access staff member contract information.

### Example
```java
// Import classes:
//import education.assembly.platform.spring.ApiClient;
//import education.assembly.platform.spring.ApiException;
//import education.assembly.platform.spring.Configuration;
//import education.assembly.platform.spring.auth.*;
//import education.assembly.platform.spring.AssemblyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

AssemblyApi apiInstance = new AssemblyApi();
String date = "date_example"; // String | Filter for a specific date
Boolean roles = false; // Boolean | Return roles information along with this object
Boolean salaries = false; // Boolean | Return salary information along with this object
Boolean allowances = false; // Boolean | Return allowances information along with this object
Integer page = 1; // Integer | Page number to return
Integer perPage = 100; // Integer | Number of results to return
String ifModifiedSince = "ifModifiedSince_example"; // String | Timestamp of the last response.
try {
    StaffContractList result = apiInstance.getStaffContracts(date, roles, salaries, allowances, page, perPage, ifModifiedSince);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssemblyApi#getStaffContracts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **date** | **String**| Filter for a specific date | [optional]
 **roles** | **Boolean**| Return roles information along with this object | [optional] [default to false]
 **salaries** | **Boolean**| Return salary information along with this object | [optional] [default to false]
 **allowances** | **Boolean**| Return allowances information along with this object | [optional] [default to false]
 **page** | **Integer**| Page number to return | [optional] [default to 1]
 **perPage** | **Integer**| Number of results to return | [optional] [default to 100]
 **ifModifiedSince** | **String**| Timestamp of the last response. | [optional]

### Return type

[**StaffContractList**](StaffContractList.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.assembly+json; version=1

<a name="getStaffContractsStaffMemberId"></a>
# **getStaffContractsStaffMemberId**
> StaffContractList getStaffContractsStaffMemberId(staffMemberId, date, roles, salaries, allowances, page, perPage, ifModifiedSince)



Returns a list of staff member contracts for the school accociated with the provided access_token. A school level access token with the staff_members.contracts scope is required to access staff member contract information.

### Example
```java
// Import classes:
//import education.assembly.platform.spring.ApiClient;
//import education.assembly.platform.spring.ApiException;
//import education.assembly.platform.spring.Configuration;
//import education.assembly.platform.spring.auth.*;
//import education.assembly.platform.spring.AssemblyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

AssemblyApi apiInstance = new AssemblyApi();
String staffMemberId = "staffMemberId_example"; // String | ID of the Staff Member as an Integer
String date = "date_example"; // String | Filter for a specific date
Boolean roles = false; // Boolean | Return roles information along with this object
Boolean salaries = false; // Boolean | Return salary information along with this object
Boolean allowances = false; // Boolean | Return allowances information along with this object
Integer page = 1; // Integer | Page number to return
Integer perPage = 100; // Integer | Number of results to return
String ifModifiedSince = "ifModifiedSince_example"; // String | Timestamp of the last response.
try {
    StaffContractList result = apiInstance.getStaffContractsStaffMemberId(staffMemberId, date, roles, salaries, allowances, page, perPage, ifModifiedSince);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssemblyApi#getStaffContractsStaffMemberId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **staffMemberId** | **String**| ID of the Staff Member as an Integer |
 **date** | **String**| Filter for a specific date | [optional]
 **roles** | **Boolean**| Return roles information along with this object | [optional] [default to false]
 **salaries** | **Boolean**| Return salary information along with this object | [optional] [default to false]
 **allowances** | **Boolean**| Return allowances information along with this object | [optional] [default to false]
 **page** | **Integer**| Page number to return | [optional] [default to 1]
 **perPage** | **Integer**| Number of results to return | [optional] [default to 100]
 **ifModifiedSince** | **String**| Timestamp of the last response. | [optional]

### Return type

[**StaffContractList**](StaffContractList.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.assembly+json; version=1

<a name="getStaffMembers"></a>
# **getStaffMembers**
> StaffMemberList getStaffMembers(teachersOnly, demographics, qualifications, page, perPage, ifModifiedSince)



Returns a list of staff members for the school accociated with the provided access_token.

### Example
```java
// Import classes:
//import education.assembly.platform.spring.ApiClient;
//import education.assembly.platform.spring.ApiException;
//import education.assembly.platform.spring.Configuration;
//import education.assembly.platform.spring.auth.*;
//import education.assembly.platform.spring.AssemblyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

AssemblyApi apiInstance = new AssemblyApi();
Boolean teachersOnly = false; // Boolean | Return only staff who are teachers
Boolean demographics = false; // Boolean | Return demographic information along with the person (requires appropriate scope)
Boolean qualifications = false; // Boolean | Include HLTA status, QT status, QT route and previous degree information (requires appropriate scope)
Integer page = 1; // Integer | Page number to return
Integer perPage = 100; // Integer | Number of results to return
String ifModifiedSince = "ifModifiedSince_example"; // String | Timestamp of the last response.
try {
    StaffMemberList result = apiInstance.getStaffMembers(teachersOnly, demographics, qualifications, page, perPage, ifModifiedSince);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssemblyApi#getStaffMembers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teachersOnly** | **Boolean**| Return only staff who are teachers | [optional] [default to false]
 **demographics** | **Boolean**| Return demographic information along with the person (requires appropriate scope) | [optional] [default to false]
 **qualifications** | **Boolean**| Include HLTA status, QT status, QT route and previous degree information (requires appropriate scope) | [optional] [default to false]
 **page** | **Integer**| Page number to return | [optional] [default to 1]
 **perPage** | **Integer**| Number of results to return | [optional] [default to 100]
 **ifModifiedSince** | **String**| Timestamp of the last response. | [optional]

### Return type

[**StaffMemberList**](StaffMemberList.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.assembly+json; version=1

<a name="getStaffMembersStaffMemberId"></a>
# **getStaffMembersStaffMemberId**
> StaffMember getStaffMembersStaffMemberId(staffMemberId, demographics, qualifications, ifModifiedSince)



Returns an individual staff member record for the given ID.

### Example
```java
// Import classes:
//import education.assembly.platform.spring.ApiClient;
//import education.assembly.platform.spring.ApiException;
//import education.assembly.platform.spring.Configuration;
//import education.assembly.platform.spring.auth.*;
//import education.assembly.platform.spring.AssemblyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

AssemblyApi apiInstance = new AssemblyApi();
String staffMemberId = "staffMemberId_example"; // String | ID of the Staff Member as an Integer
Boolean demographics = false; // Boolean | Return demographic information along with the person (requires appropriate scope)
Boolean qualifications = false; // Boolean | Include HLTA status, QT status, QT route and previous degree information (requires appropriate scope)
String ifModifiedSince = "ifModifiedSince_example"; // String | Timestamp of the last response.
try {
    StaffMember result = apiInstance.getStaffMembersStaffMemberId(staffMemberId, demographics, qualifications, ifModifiedSince);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssemblyApi#getStaffMembersStaffMemberId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **staffMemberId** | **String**| ID of the Staff Member as an Integer |
 **demographics** | **Boolean**| Return demographic information along with the person (requires appropriate scope) | [optional] [default to false]
 **qualifications** | **Boolean**| Include HLTA status, QT status, QT route and previous degree information (requires appropriate scope) | [optional] [default to false]
 **ifModifiedSince** | **String**| Timestamp of the last response. | [optional]

### Return type

[**StaffMember**](StaffMember.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.assembly+json; version=1

<a name="getStudents"></a>
# **getStudents**
> StudentList getStudents(yearCode, students, date, demographics, contacts, senNeeds, addresses, care, languages, page, perPage, ifModifiedSince)



Returns a list of students for the school associated with the provided access_token.

### Example
```java
// Import classes:
//import education.assembly.platform.spring.ApiClient;
//import education.assembly.platform.spring.ApiException;
//import education.assembly.platform.spring.Configuration;
//import education.assembly.platform.spring.auth.*;
//import education.assembly.platform.spring.AssemblyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

AssemblyApi apiInstance = new AssemblyApi();
String yearCode = "yearCode_example"; // String | Filter by a specific NC year code
String students = "students_example"; // String | ID(s) of the student(s) as an Integer. Multiple IDs can be separated with a space (so a + URL encoded).
String date = "date_example"; // String | Filter for a specific date
Boolean demographics = false; // Boolean | Return demographic information along with the person (requires appropriate scope)
Boolean contacts = false; // Boolean | Return contact information along with this object
Boolean senNeeds = false; // Boolean | Return Special Educational Need information along with this object
Boolean addresses = false; // Boolean | Return address information along with this object
Boolean care = false; // Boolean | Return care information along with this object, depends on inclusion of demographics
Boolean languages = false; // Boolean | Return language information along with this object
Integer page = 1; // Integer | Page number to return
Integer perPage = 100; // Integer | Number of results to return
String ifModifiedSince = "ifModifiedSince_example"; // String | Timestamp of the last response.
try {
    StudentList result = apiInstance.getStudents(yearCode, students, date, demographics, contacts, senNeeds, addresses, care, languages, page, perPage, ifModifiedSince);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssemblyApi#getStudents");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **yearCode** | **String**| Filter by a specific NC year code | [optional]
 **students** | **String**| ID(s) of the student(s) as an Integer. Multiple IDs can be separated with a space (so a + URL encoded). | [optional]
 **date** | **String**| Filter for a specific date | [optional]
 **demographics** | **Boolean**| Return demographic information along with the person (requires appropriate scope) | [optional] [default to false]
 **contacts** | **Boolean**| Return contact information along with this object | [optional] [default to false]
 **senNeeds** | **Boolean**| Return Special Educational Need information along with this object | [optional] [default to false]
 **addresses** | **Boolean**| Return address information along with this object | [optional] [default to false]
 **care** | **Boolean**| Return care information along with this object, depends on inclusion of demographics | [optional] [default to false]
 **languages** | **Boolean**| Return language information along with this object | [optional] [default to false]
 **page** | **Integer**| Page number to return | [optional] [default to 1]
 **perPage** | **Integer**| Number of results to return | [optional] [default to 100]
 **ifModifiedSince** | **String**| Timestamp of the last response. | [optional]

### Return type

[**StudentList**](StudentList.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.assembly+json; version=1

<a name="getStudentsStudentId"></a>
# **getStudentsStudentId**
> Student getStudentsStudentId(studentId, date, demographics, contacts, senNeeds, addresses, care, languages, ifModifiedSince)



Returns an individual student record for the given ID. Note: the response shown includes student demographics, contacts, student SEN needs, student addresses and student care data but these will only be present if you have permission to access it and pass demographics&#x3D;true, contacts&#x3D;true, sen_needs&#x3D;true, addresses&#x3D;true and care&#x3D;true respectively

### Example
```java
// Import classes:
//import education.assembly.platform.spring.ApiClient;
//import education.assembly.platform.spring.ApiException;
//import education.assembly.platform.spring.Configuration;
//import education.assembly.platform.spring.auth.*;
//import education.assembly.platform.spring.AssemblyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

AssemblyApi apiInstance = new AssemblyApi();
String studentId = "studentId_example"; // String | ID of the Student as an Integer
String date = "date_example"; // String | Filter for a specific date
Boolean demographics = false; // Boolean | Return demographic information along with the person (requires appropriate scope)
Boolean contacts = false; // Boolean | Return contact information along with this object
Boolean senNeeds = false; // Boolean | Return Special Educational Need information along with this object
Boolean addresses = false; // Boolean | Return address information along with this object
Boolean care = false; // Boolean | Return care information along with this object, depends on inclusion of demographics
Boolean languages = false; // Boolean | Return language information along with this object
String ifModifiedSince = "ifModifiedSince_example"; // String | Timestamp of the last response.
try {
    Student result = apiInstance.getStudentsStudentId(studentId, date, demographics, contacts, senNeeds, addresses, care, languages, ifModifiedSince);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssemblyApi#getStudentsStudentId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **studentId** | **String**| ID of the Student as an Integer |
 **date** | **String**| Filter for a specific date | [optional]
 **demographics** | **Boolean**| Return demographic information along with the person (requires appropriate scope) | [optional] [default to false]
 **contacts** | **Boolean**| Return contact information along with this object | [optional] [default to false]
 **senNeeds** | **Boolean**| Return Special Educational Need information along with this object | [optional] [default to false]
 **addresses** | **Boolean**| Return address information along with this object | [optional] [default to false]
 **care** | **Boolean**| Return care information along with this object, depends on inclusion of demographics | [optional] [default to false]
 **languages** | **Boolean**| Return language information along with this object | [optional] [default to false]
 **ifModifiedSince** | **String**| Timestamp of the last response. | [optional]

### Return type

[**Student**](Student.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.assembly+json; version=1

<a name="getSubjects"></a>
# **getSubjects**
> SubjectList getSubjects(misMappings, page, perPage)



Returns a list of the Assembly Platform&#39;s subjects.

### Example
```java
// Import classes:
//import education.assembly.platform.spring.ApiClient;
//import education.assembly.platform.spring.ApiException;
//import education.assembly.platform.spring.Configuration;
//import education.assembly.platform.spring.auth.*;
//import education.assembly.platform.spring.AssemblyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

AssemblyApi apiInstance = new AssemblyApi();
Boolean misMappings = false; // Boolean | Includes the names of any MIS components to this object
Integer page = 1; // Integer | Page number to return
Integer perPage = 100; // Integer | Number of results to return
try {
    SubjectList result = apiInstance.getSubjects(misMappings, page, perPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssemblyApi#getSubjects");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **misMappings** | **Boolean**| Includes the names of any MIS components to this object | [optional] [default to false]
 **page** | **Integer**| Page number to return | [optional] [default to 1]
 **perPage** | **Integer**| Number of results to return | [optional] [default to 100]

### Return type

[**SubjectList**](SubjectList.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.assembly+json; version=1

<a name="getTeachingGroups"></a>
# **getTeachingGroups**
> TeachingGroupList getTeachingGroups(subjectCode, yearCode, date, academicYearId, page, perPage)



Returns a list of teaching groups that match the given set of filters. If a date parameter is provided then the list of groups returned is filtered to only those where the provided date falls between the groups start_date and end_date. Additionally when a date parameter is provided student_ids and supervior_ids are restricted to only those students who were enrolled in the group on the given date.

### Example
```java
// Import classes:
//import education.assembly.platform.spring.ApiClient;
//import education.assembly.platform.spring.ApiException;
//import education.assembly.platform.spring.Configuration;
//import education.assembly.platform.spring.auth.*;
//import education.assembly.platform.spring.AssemblyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

AssemblyApi apiInstance = new AssemblyApi();
String subjectCode = "subjectCode_example"; // String | Filter by subject
String yearCode = "yearCode_example"; // String | Filter by a specific NC year code
String date = "date_example"; // String | Filter for a specific date
Integer academicYearId = 56; // Integer | Filter based on the specified academic year
Integer page = 1; // Integer | Page number to return
Integer perPage = 100; // Integer | Number of results to return
try {
    TeachingGroupList result = apiInstance.getTeachingGroups(subjectCode, yearCode, date, academicYearId, page, perPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssemblyApi#getTeachingGroups");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subjectCode** | **String**| Filter by subject | [optional]
 **yearCode** | **String**| Filter by a specific NC year code | [optional]
 **date** | **String**| Filter for a specific date | [optional]
 **academicYearId** | **Integer**| Filter based on the specified academic year | [optional]
 **page** | **Integer**| Page number to return | [optional] [default to 1]
 **perPage** | **Integer**| Number of results to return | [optional] [default to 100]

### Return type

[**TeachingGroupList**](TeachingGroupList.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.assembly+json; version=1

<a name="getTeachingGroupsGroupId"></a>
# **getTeachingGroupsGroupId**
> TeachingGroup getTeachingGroupsGroupId(groupId, date, academicYearId)



Returns a single teaching group whose ID matches the provided group_id. Additionally includes a list of all the student and supervisor identifiers that have ever been enrolled in the group.

### Example
```java
// Import classes:
//import education.assembly.platform.spring.ApiClient;
//import education.assembly.platform.spring.ApiException;
//import education.assembly.platform.spring.Configuration;
//import education.assembly.platform.spring.auth.*;
//import education.assembly.platform.spring.AssemblyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

AssemblyApi apiInstance = new AssemblyApi();
String groupId = "groupId_example"; // String | ID of the Year Group as an Integer
String date = "date_example"; // String | Filter for a specific date
Integer academicYearId = 56; // Integer | Filter based on the specified academic year
try {
    TeachingGroup result = apiInstance.getTeachingGroupsGroupId(groupId, date, academicYearId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssemblyApi#getTeachingGroupsGroupId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **String**| ID of the Year Group as an Integer |
 **date** | **String**| Filter for a specific date | [optional]
 **academicYearId** | **Integer**| Filter based on the specified academic year | [optional]

### Return type

[**TeachingGroup**](TeachingGroup.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.assembly+json; version=1

<a name="getTeachingGroupsGroupIdStudents"></a>
# **getTeachingGroupsGroupIdStudents**
> StudentList getTeachingGroupsGroupIdStudents(groupId, yearCode, date, academicYearId, demographics, care, page, perPage, ifModifiedSince)



Returns a list of all the students that are present in the teaching group identified by group_id.

### Example
```java
// Import classes:
//import education.assembly.platform.spring.ApiClient;
//import education.assembly.platform.spring.ApiException;
//import education.assembly.platform.spring.Configuration;
//import education.assembly.platform.spring.auth.*;
//import education.assembly.platform.spring.AssemblyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

AssemblyApi apiInstance = new AssemblyApi();
String groupId = "groupId_example"; // String | ID of the Year Group as an Integer
String yearCode = "yearCode_example"; // String | Filter by a specific NC year code
String date = "date_example"; // String | Filter for a specific date
Integer academicYearId = 56; // Integer | Filter based on the specified academic year
Boolean demographics = false; // Boolean | Return demographic information along with the person (requires appropriate scope)
Boolean care = false; // Boolean | Return care information along with this object, depends on inclusion of demographics
Integer page = 1; // Integer | Page number to return
Integer perPage = 100; // Integer | Number of results to return
String ifModifiedSince = "ifModifiedSince_example"; // String | Timestamp of the last response.
try {
    StudentList result = apiInstance.getTeachingGroupsGroupIdStudents(groupId, yearCode, date, academicYearId, demographics, care, page, perPage, ifModifiedSince);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssemblyApi#getTeachingGroupsGroupIdStudents");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **String**| ID of the Year Group as an Integer |
 **yearCode** | **String**| Filter by a specific NC year code | [optional]
 **date** | **String**| Filter for a specific date | [optional]
 **academicYearId** | **Integer**| Filter based on the specified academic year | [optional]
 **demographics** | **Boolean**| Return demographic information along with the person (requires appropriate scope) | [optional] [default to false]
 **care** | **Boolean**| Return care information along with this object, depends on inclusion of demographics | [optional] [default to false]
 **page** | **Integer**| Page number to return | [optional] [default to 1]
 **perPage** | **Integer**| Number of results to return | [optional] [default to 100]
 **ifModifiedSince** | **String**| Timestamp of the last response. | [optional]

### Return type

[**StudentList**](StudentList.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.assembly+json; version=1

<a name="getYearGroups"></a>
# **getYearGroups**
> YearGroupList getYearGroups(yearCode, date, academicYearId, page, perPage, ifModifiedSince)



Returns a list of year groups that match the given set of filters. The default behaviour is to return the year groups for the school&#39;s current academic year.

### Example
```java
// Import classes:
//import education.assembly.platform.spring.ApiClient;
//import education.assembly.platform.spring.ApiException;
//import education.assembly.platform.spring.Configuration;
//import education.assembly.platform.spring.auth.*;
//import education.assembly.platform.spring.AssemblyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

AssemblyApi apiInstance = new AssemblyApi();
String yearCode = "yearCode_example"; // String | Filter by a specific NC year code
String date = "date_example"; // String | Filter for a specific date
Integer academicYearId = 56; // Integer | Filter based on the specified academic year
Integer page = 1; // Integer | Page number to return
Integer perPage = 100; // Integer | Number of results to return
String ifModifiedSince = "ifModifiedSince_example"; // String | Timestamp of the last response.
try {
    YearGroupList result = apiInstance.getYearGroups(yearCode, date, academicYearId, page, perPage, ifModifiedSince);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssemblyApi#getYearGroups");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **yearCode** | **String**| Filter by a specific NC year code | [optional]
 **date** | **String**| Filter for a specific date | [optional]
 **academicYearId** | **Integer**| Filter based on the specified academic year | [optional]
 **page** | **Integer**| Page number to return | [optional] [default to 1]
 **perPage** | **Integer**| Number of results to return | [optional] [default to 100]
 **ifModifiedSince** | **String**| Timestamp of the last response. | [optional]

### Return type

[**YearGroupList**](YearGroupList.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.assembly+json; version=1

<a name="getYearGroupsGroupId"></a>
# **getYearGroupsGroupId**
> YearGroup getYearGroupsGroupId(groupId, date, academicYearId)



Returns a single year group whose code matches the provided year_code. Additionally includes a list of all the student identifiers that are present in the group.

### Example
```java
// Import classes:
//import education.assembly.platform.spring.ApiClient;
//import education.assembly.platform.spring.ApiException;
//import education.assembly.platform.spring.Configuration;
//import education.assembly.platform.spring.auth.*;
//import education.assembly.platform.spring.AssemblyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

AssemblyApi apiInstance = new AssemblyApi();
String groupId = "groupId_example"; // String | ID of the Year Group as an Integer
String date = "date_example"; // String | Filter for a specific date
Integer academicYearId = 56; // Integer | Filter based on the specified academic year
try {
    YearGroup result = apiInstance.getYearGroupsGroupId(groupId, date, academicYearId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssemblyApi#getYearGroupsGroupId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **String**| ID of the Year Group as an Integer |
 **date** | **String**| Filter for a specific date | [optional]
 **academicYearId** | **Integer**| Filter based on the specified academic year | [optional]

### Return type

[**YearGroup**](YearGroup.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.assembly+json; version=1

<a name="getYearGroupsGroupIdStudents"></a>
# **getYearGroupsGroupIdStudents**
> StudentList getYearGroupsGroupIdStudents(groupId, date, academicYearId, page, perPage, ifModifiedSince)



Returns a list of all the students that are present in the year group identified by year_code.

### Example
```java
// Import classes:
//import education.assembly.platform.spring.ApiClient;
//import education.assembly.platform.spring.ApiException;
//import education.assembly.platform.spring.Configuration;
//import education.assembly.platform.spring.auth.*;
//import education.assembly.platform.spring.AssemblyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

AssemblyApi apiInstance = new AssemblyApi();
String groupId = "groupId_example"; // String | ID of the Year Group as an Integer
String date = "date_example"; // String | Filter for a specific date
Integer academicYearId = 56; // Integer | Filter based on the specified academic year
Integer page = 1; // Integer | Page number to return
Integer perPage = 100; // Integer | Number of results to return
String ifModifiedSince = "ifModifiedSince_example"; // String | Timestamp of the last response.
try {
    StudentList result = apiInstance.getYearGroupsGroupIdStudents(groupId, date, academicYearId, page, perPage, ifModifiedSince);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssemblyApi#getYearGroupsGroupIdStudents");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **String**| ID of the Year Group as an Integer |
 **date** | **String**| Filter for a specific date | [optional]
 **academicYearId** | **Integer**| Filter based on the specified academic year | [optional]
 **page** | **Integer**| Page number to return | [optional] [default to 1]
 **perPage** | **Integer**| Number of results to return | [optional] [default to 100]
 **ifModifiedSince** | **String**| Timestamp of the last response. | [optional]

### Return type

[**StudentList**](StudentList.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.assembly+json; version=1

<a name="patchResults"></a>
# **patchResults**
> UpdateMultipleResultResponse patchResults(updateMultipleResultPayload)



Multiple results can be updated simultaneously by providing the relevant result_ids in the body of your request. The response will tell you whether the batch of updates has either been successful or failed.

### Example
```java
// Import classes:
//import education.assembly.platform.spring.ApiClient;
//import education.assembly.platform.spring.ApiException;
//import education.assembly.platform.spring.Configuration;
//import education.assembly.platform.spring.auth.*;
//import education.assembly.platform.spring.AssemblyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

AssemblyApi apiInstance = new AssemblyApi();
UpdateMultipleResultResponse updateMultipleResultPayload = new UpdateMultipleResultResponse(); // UpdateMultipleResultResponse | Payload for update multiple Result request
try {
    UpdateMultipleResultResponse result = apiInstance.patchResults(updateMultipleResultPayload);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssemblyApi#patchResults");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **updateMultipleResultPayload** | [**UpdateMultipleResultResponse**](UpdateMultipleResultResponse.md)| Payload for update multiple Result request | [optional]

### Return type

[**UpdateMultipleResultResponse**](UpdateMultipleResultResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.assembly+json; version=1

<a name="patchResultsResultId"></a>
# **patchResultsResultId**
> Result patchResultsResultId(resultId, updateResultPayload)



Once a result has been created, it can be updated on the Platform by passing the required field values in the request body. A list of the fields that were changed are returned in the response.

### Example
```java
// Import classes:
//import education.assembly.platform.spring.ApiClient;
//import education.assembly.platform.spring.ApiException;
//import education.assembly.platform.spring.Configuration;
//import education.assembly.platform.spring.auth.*;
//import education.assembly.platform.spring.AssemblyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

AssemblyApi apiInstance = new AssemblyApi();
String resultId = "resultId_example"; // String | ID of the Result as an Integer
Result updateResultPayload = new Result(); // Result | Payload for update Result request
try {
    Result result = apiInstance.patchResultsResultId(resultId, updateResultPayload);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssemblyApi#patchResultsResultId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resultId** | **String**| ID of the Result as an Integer |
 **updateResultPayload** | [**Result**](Result.md)| Payload for update Result request | [optional]

### Return type

[**Result**](Result.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.assembly+json; version=1

