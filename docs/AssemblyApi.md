# AssemblyApi

All URIs are relative to *https://api-sandbox.assembly.education*

Method | HTTP request | Description
------------- | ------------- | -------------
[**find**](AssemblyApi.md#find) | **GET** /academic_years/{id} | View an Academic Year
[**find_0**](AssemblyApi.md#find_0) | **GET** /assessment_points/{id} | View an Assessment Point
[**find_1**](AssemblyApi.md#find_1) | **GET** /assessments/{id} | View an Assessment
[**find_2**](AssemblyApi.md#find_2) | **GET** /facets/{id} | View a Facet
[**find_3**](AssemblyApi.md#find_3) | **GET** /registration_groups/{id} | View a Registration Group
[**find_4**](AssemblyApi.md#find_4) | **GET** /staff_members/{id} | View a Staff Member
[**find_5**](AssemblyApi.md#find_5) | **GET** /students/{id} | View a Student
[**find_6**](AssemblyApi.md#find_6) | **GET** /teaching_groups/{id} | View a Teaching Group
[**find_7**](AssemblyApi.md#find_7) | **GET** /year_groups/{id} | View a Year Group
[**get**](AssemblyApi.md#get) | **GET** /academic_years | List Academic Years
[**get_0**](AssemblyApi.md#get_0) | **GET** /assessment_points | List Assessment Points
[**get_1**](AssemblyApi.md#get_1) | **GET** /assessments | List Assessments
[**get_10**](AssemblyApi.md#get_10) | **GET** /staff_contracts | List Staff Contracts
[**get_11**](AssemblyApi.md#get_11) | **GET** /staff_members | List Staff Members
[**get_12**](AssemblyApi.md#get_12) | **GET** /students | List Students
[**get_13**](AssemblyApi.md#get_13) | **GET** /subjects | List Subjects
[**get_14**](AssemblyApi.md#get_14) | **GET** /teaching_groups | List Teaching Groups
[**get_15**](AssemblyApi.md#get_15) | **GET** /year_groups | List Year Groups
[**get_2**](AssemblyApi.md#get_2) | **GET** /attendances | List Attendances
[**get_3**](AssemblyApi.md#get_3) | **GET** /calendar_events | List Calendar Events
[**get_4**](AssemblyApi.md#get_4) | **GET** /contacts | List Contacts
[**get_5**](AssemblyApi.md#get_5) | **GET** /exclusions | List Exclusions
[**get_6**](AssemblyApi.md#get_6) | **GET** /facets | List Facets
[**get_7**](AssemblyApi.md#get_7) | **GET** /registration_groups | List Registration Group
[**get_8**](AssemblyApi.md#get_8) | **GET** /results | List Results
[**get_9**](AssemblyApi.md#get_9) | **GET** /staff_absences | List Staff Absences
[**gradeSet**](AssemblyApi.md#gradeSet) | **GET** /assessments/{id}/grade_set | View Grade Set for an Assessment
[**left**](AssemblyApi.md#left) | **GET** /students/left | List Left Students
[**results**](AssemblyApi.md#results) | **GET** /assessment_points/{id}/results | View Results for an Assessment Point
[**results_0**](AssemblyApi.md#results_0) | **GET** /assessments/{id}/results | View Results for an Assessment
[**show**](AssemblyApi.md#show) | **GET** /school_details | List School Details
[**students**](AssemblyApi.md#students) | **GET** /registration_groups/{id}/students | List Students for Registration Group
[**students_0**](AssemblyApi.md#students_0) | **GET** /teaching_groups/{id}/students | List Students for Teaching Group
[**students_1**](AssemblyApi.md#students_1) | **GET** /year_groups/{id}/students | List Students for Year Group


<a name="find"></a>
# **find**
> AcademicYear find(id)

View an Academic Year

Returns a single academic year for the school associated with the provided access_token.

### Example
```java
// Import classes:
//import education.assembly.platform.spring.ApiClient;
//import education.assembly.platform.spring.ApiException;
//import education.assembly.platform.spring.Configuration;
//import education.assembly.platform.spring.auth.*;
//import education.assembly.platform.spring.AssemblyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: bearerAuth
HttpBasicAuth bearerAuth = (HttpBasicAuth) defaultClient.getAuthentication("bearerAuth");
bearerAuth.setUsername("YOUR USERNAME");
bearerAuth.setPassword("YOUR PASSWORD");

AssemblyApi apiInstance = new AssemblyApi();
Integer id = 56; // Integer | id of the entity
try {
    AcademicYear result = apiInstance.find(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssemblyApi#find");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| id of the entity |

### Return type

[**AcademicYear**](AcademicYear.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.assembly+json; version=1.1

<a name="find_0"></a>
# **find_0**
> AssessmentPoint find_0(id)

View an Assessment Point

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

// Configure HTTP basic authorization: bearerAuth
HttpBasicAuth bearerAuth = (HttpBasicAuth) defaultClient.getAuthentication("bearerAuth");
bearerAuth.setUsername("YOUR USERNAME");
bearerAuth.setPassword("YOUR PASSWORD");

AssemblyApi apiInstance = new AssemblyApi();
Integer id = 56; // Integer | id of the entity
try {
    AssessmentPoint result = apiInstance.find_0(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssemblyApi#find_0");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| id of the entity |

### Return type

[**AssessmentPoint**](AssessmentPoint.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.assembly+json; version=1.1

<a name="find_1"></a>
# **find_1**
> Assessment find_1(id)

View an Assessment

Returns a single assessment for the given id.

### Example
```java
// Import classes:
//import education.assembly.platform.spring.ApiClient;
//import education.assembly.platform.spring.ApiException;
//import education.assembly.platform.spring.Configuration;
//import education.assembly.platform.spring.auth.*;
//import education.assembly.platform.spring.AssemblyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: bearerAuth
HttpBasicAuth bearerAuth = (HttpBasicAuth) defaultClient.getAuthentication("bearerAuth");
bearerAuth.setUsername("YOUR USERNAME");
bearerAuth.setPassword("YOUR PASSWORD");

AssemblyApi apiInstance = new AssemblyApi();
Integer id = 56; // Integer | id of the entity
try {
    Assessment result = apiInstance.find_1(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssemblyApi#find_1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| id of the entity |

### Return type

[**Assessment**](Assessment.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.assembly+json; version=1.1

<a name="find_2"></a>
# **find_2**
> Facet find_2(id)

View a Facet

Returns a single facet for the given id.

### Example
```java
// Import classes:
//import education.assembly.platform.spring.ApiClient;
//import education.assembly.platform.spring.ApiException;
//import education.assembly.platform.spring.Configuration;
//import education.assembly.platform.spring.auth.*;
//import education.assembly.platform.spring.AssemblyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: bearerAuth
HttpBasicAuth bearerAuth = (HttpBasicAuth) defaultClient.getAuthentication("bearerAuth");
bearerAuth.setUsername("YOUR USERNAME");
bearerAuth.setPassword("YOUR PASSWORD");

AssemblyApi apiInstance = new AssemblyApi();
Integer id = 56; // Integer | id of the entity
try {
    Facet result = apiInstance.find_2(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssemblyApi#find_2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| id of the entity |

### Return type

[**Facet**](Facet.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.assembly+json; version=1.1

<a name="find_3"></a>
# **find_3**
> RegistrationGroup find_3(id, date, academicYearId)

View a Registration Group

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

// Configure HTTP basic authorization: bearerAuth
HttpBasicAuth bearerAuth = (HttpBasicAuth) defaultClient.getAuthentication("bearerAuth");
bearerAuth.setUsername("YOUR USERNAME");
bearerAuth.setPassword("YOUR PASSWORD");

AssemblyApi apiInstance = new AssemblyApi();
Integer id = 56; // Integer | id of the entity
OffsetDateTime date = new OffsetDateTime(); // OffsetDateTime | returns results for a specific date
Integer academicYearId = 56; // Integer | returns all groups and group memberships from the specified academic year
try {
    RegistrationGroup result = apiInstance.find_3(id, date, academicYearId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssemblyApi#find_3");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| id of the entity |
 **date** | **OffsetDateTime**| returns results for a specific date | [optional]
 **academicYearId** | **Integer**| returns all groups and group memberships from the specified academic year | [optional]

### Return type

[**RegistrationGroup**](RegistrationGroup.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.assembly+json; version=1.1

<a name="find_4"></a>
# **find_4**
> StaffMember find_4(id, demographics, qualifications)

View a Staff Member

Returns an individual staff member record for the given ID.  **Note:** Note the &#x60;If-Modified-Since&#x60; header is optional (see the page on [Conditional Requests](/api#conditional-requests) for more details). 

### Example
```java
// Import classes:
//import education.assembly.platform.spring.ApiClient;
//import education.assembly.platform.spring.ApiException;
//import education.assembly.platform.spring.Configuration;
//import education.assembly.platform.spring.auth.*;
//import education.assembly.platform.spring.AssemblyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: bearerAuth
HttpBasicAuth bearerAuth = (HttpBasicAuth) defaultClient.getAuthentication("bearerAuth");
bearerAuth.setUsername("YOUR USERNAME");
bearerAuth.setPassword("YOUR PASSWORD");

AssemblyApi apiInstance = new AssemblyApi();
Integer id = 56; // Integer | id of the entity
Boolean demographics = true; // Boolean | include demographics data
Boolean qualifications = true; // Boolean | include HLTA status, QT status, QT route and previous degree information (requires `staff_members.qualifications` scope)
try {
    StaffMember result = apiInstance.find_4(id, demographics, qualifications);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssemblyApi#find_4");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| id of the entity |
 **demographics** | **Boolean**| include demographics data | [optional]
 **qualifications** | **Boolean**| include HLTA status, QT status, QT route and previous degree information (requires &#x60;staff_members.qualifications&#x60; scope) | [optional]

### Return type

[**StaffMember**](StaffMember.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.assembly+json; version=1.1

<a name="find_5"></a>
# **find_5**
> Student find_5(id, demographics, contacts, senNeeds, addresses, care, everInCare, languages, photo)

View a Student

Returns an individual student record for the given ID.  **Note:** the response shown includes student demographics, contacts, student SEN needs, student addresses, photo and student care data but these will only be present if you have permission to access it and pass &#x60;demographics&#x60;, &#x60;contacts&#x60;, &#x60;sen_needs&#x60;, &#x60;addresses&#x60;, &#x60;photo&#x60;, &#x60;care&#x60; and &#x60;ever_in_care&#x60; respectively  **Note:** Note the &#x60;If-Modified-Since&#x60; header is optional (see the page on [Conditional Requests](/api#conditional-requests) for more details).  ### Photo Notes When requesting photo information the response includes a &#x60;photo.url&#x60; property, this URL should be treated as confidential and used to download the students photo to your storage system of choice. The URL is *not designed for hotlinking directly in the browser* for end users. URLs are signed and only valid for 1 hour after which time you will receive a 400 error.  Once downloaded to avoid repeatedly syncing unchanged photos you should code your application to compare the &#x60;photo.hash&#x60; property to detect changes in student photos since your last sync, it is guaranteed that changes in a photo will change the hash, however the hash is only intended to be used to detect photo changes and is not guaranteed to match a checksum of the files contents.  Photos are currently provided on an \&quot;as is\&quot; basis straight from the source MIS, this means the format, quality, metadata and dimensions are not guaranteed. We reserve the right to normalise this data in the future but your application should be resistant to differing photo formats. 

### Example
```java
// Import classes:
//import education.assembly.platform.spring.ApiClient;
//import education.assembly.platform.spring.ApiException;
//import education.assembly.platform.spring.Configuration;
//import education.assembly.platform.spring.auth.*;
//import education.assembly.platform.spring.AssemblyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: bearerAuth
HttpBasicAuth bearerAuth = (HttpBasicAuth) defaultClient.getAuthentication("bearerAuth");
bearerAuth.setUsername("YOUR USERNAME");
bearerAuth.setPassword("YOUR PASSWORD");

AssemblyApi apiInstance = new AssemblyApi();
Integer id = 56; // Integer | id of the entity
Boolean demographics = true; // Boolean | include demographics data
Boolean contacts = true; // Boolean | include contacts data
Boolean senNeeds = true; // Boolean | include SEN needs data
Boolean addresses = true; // Boolean | include student address data
Boolean care = true; // Boolean | include student care data (you must also supply the demographics parameter)
Boolean everInCare = true; // Boolean | include whether the student has ever been in care (you must also supply the demographics parameter)
Boolean languages = true; // Boolean | include student language data
Boolean photo = true; // Boolean | include student photo data
try {
    Student result = apiInstance.find_5(id, demographics, contacts, senNeeds, addresses, care, everInCare, languages, photo);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssemblyApi#find_5");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| id of the entity |
 **demographics** | **Boolean**| include demographics data | [optional]
 **contacts** | **Boolean**| include contacts data | [optional]
 **senNeeds** | **Boolean**| include SEN needs data | [optional]
 **addresses** | **Boolean**| include student address data | [optional]
 **care** | **Boolean**| include student care data (you must also supply the demographics parameter) | [optional]
 **everInCare** | **Boolean**| include whether the student has ever been in care (you must also supply the demographics parameter) | [optional]
 **languages** | **Boolean**| include student language data | [optional]
 **photo** | **Boolean**| include student photo data | [optional]

### Return type

[**Student**](Student.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.assembly+json; version=1.1

<a name="find_6"></a>
# **find_6**
> TeachingGroup find_6(id, date, academicYearId, groupId)

View a Teaching Group

Returns a list of teaching groups that match the given set of filters.

### Example
```java
// Import classes:
//import education.assembly.platform.spring.ApiClient;
//import education.assembly.platform.spring.ApiException;
//import education.assembly.platform.spring.Configuration;
//import education.assembly.platform.spring.auth.*;
//import education.assembly.platform.spring.AssemblyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: bearerAuth
HttpBasicAuth bearerAuth = (HttpBasicAuth) defaultClient.getAuthentication("bearerAuth");
bearerAuth.setUsername("YOUR USERNAME");
bearerAuth.setPassword("YOUR PASSWORD");

AssemblyApi apiInstance = new AssemblyApi();
Integer id = 56; // Integer | id of the entity
OffsetDateTime date = new OffsetDateTime(); // OffsetDateTime | returns results for a specific date
Integer academicYearId = 56; // Integer | returns all groups and group memberships from the specified academic year
Integer groupId = 56; // Integer | a group_id to filter by
try {
    TeachingGroup result = apiInstance.find_6(id, date, academicYearId, groupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssemblyApi#find_6");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| id of the entity |
 **date** | **OffsetDateTime**| returns results for a specific date | [optional]
 **academicYearId** | **Integer**| returns all groups and group memberships from the specified academic year | [optional]
 **groupId** | **Integer**| a group_id to filter by | [optional]

### Return type

[**TeachingGroup**](TeachingGroup.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.assembly+json; version=1.1

<a name="find_7"></a>
# **find_7**
> YearGroup find_7(id, date, academicYearId)

View a Year Group

Returns a list of year groups that match the given set of filters.

### Example
```java
// Import classes:
//import education.assembly.platform.spring.ApiClient;
//import education.assembly.platform.spring.ApiException;
//import education.assembly.platform.spring.Configuration;
//import education.assembly.platform.spring.auth.*;
//import education.assembly.platform.spring.AssemblyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: bearerAuth
HttpBasicAuth bearerAuth = (HttpBasicAuth) defaultClient.getAuthentication("bearerAuth");
bearerAuth.setUsername("YOUR USERNAME");
bearerAuth.setPassword("YOUR PASSWORD");

AssemblyApi apiInstance = new AssemblyApi();
Integer id = 56; // Integer | id of the entity
OffsetDateTime date = new OffsetDateTime(); // OffsetDateTime | returns results for a specific date
Integer academicYearId = 56; // Integer | returns all groups and group memberships from the specified academic year
try {
    YearGroup result = apiInstance.find_7(id, date, academicYearId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssemblyApi#find_7");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| id of the entity |
 **date** | **OffsetDateTime**| returns results for a specific date | [optional]
 **academicYearId** | **Integer**| returns all groups and group memberships from the specified academic year | [optional]

### Return type

[**YearGroup**](YearGroup.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.assembly+json; version=1.1

<a name="get"></a>
# **get**
> List&lt;AcademicYear&gt; get(perPage, page)

List Academic Years

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

// Configure HTTP basic authorization: bearerAuth
HttpBasicAuth bearerAuth = (HttpBasicAuth) defaultClient.getAuthentication("bearerAuth");
bearerAuth.setUsername("YOUR USERNAME");
bearerAuth.setPassword("YOUR PASSWORD");

AssemblyApi apiInstance = new AssemblyApi();
Integer perPage = 100; // Integer | Number of results to return
Integer page = 1; // Integer | Page number to return
try {
    List<AcademicYear> result = apiInstance.get(perPage, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssemblyApi#get");
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

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.assembly+json; version=1.1

<a name="get_0"></a>
# **get_0**
> List&lt;AssessmentPoint&gt; get_0(perPage, page)

List Assessment Points

Returns a list of assessment points. An assessment_point object represents a point in the school key stage, year, term or half-term that results can be attached to. When sending results back to the Platform, the assessment_point_rank should be used - this will remain constant across all environments.

### Example
```java
// Import classes:
//import education.assembly.platform.spring.ApiClient;
//import education.assembly.platform.spring.ApiException;
//import education.assembly.platform.spring.Configuration;
//import education.assembly.platform.spring.auth.*;
//import education.assembly.platform.spring.AssemblyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: bearerAuth
HttpBasicAuth bearerAuth = (HttpBasicAuth) defaultClient.getAuthentication("bearerAuth");
bearerAuth.setUsername("YOUR USERNAME");
bearerAuth.setPassword("YOUR PASSWORD");

AssemblyApi apiInstance = new AssemblyApi();
Integer perPage = 100; // Integer | Number of results to return
Integer page = 1; // Integer | Page number to return
try {
    List<AssessmentPoint> result = apiInstance.get_0(perPage, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssemblyApi#get_0");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **perPage** | **Integer**| Number of results to return | [optional] [default to 100]
 **page** | **Integer**| Page number to return | [optional] [default to 1]

### Return type

[**List&lt;AssessmentPoint&gt;**](AssessmentPoint.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.assembly+json; version=1.1

<a name="get_1"></a>
# **get_1**
> List&lt;Assessment&gt; get_1(perPage, page)

List Assessments

Returns a list of assessment objects. The assessment is the grouping that knits together a range of concepts. The name of the assessment also refers to the source of the result.

### Example
```java
// Import classes:
//import education.assembly.platform.spring.ApiClient;
//import education.assembly.platform.spring.ApiException;
//import education.assembly.platform.spring.Configuration;
//import education.assembly.platform.spring.auth.*;
//import education.assembly.platform.spring.AssemblyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: bearerAuth
HttpBasicAuth bearerAuth = (HttpBasicAuth) defaultClient.getAuthentication("bearerAuth");
bearerAuth.setUsername("YOUR USERNAME");
bearerAuth.setPassword("YOUR PASSWORD");

AssemblyApi apiInstance = new AssemblyApi();
Integer perPage = 100; // Integer | Number of results to return
Integer page = 1; // Integer | Page number to return
try {
    List<Assessment> result = apiInstance.get_1(perPage, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssemblyApi#get_1");
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

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.assembly+json; version=1.1

<a name="get_10"></a>
# **get_10**
> List&lt;StaffContract&gt; get_10(ifModifiedSince, staffMemberId, date, roles, salaries, allowances, perPage, page)

List Staff Contracts

Returns a list of staff member contracts for the school accociated with the provided &#x60;access_token&#x60;. A school level access token with the &#x60;staff_members.contracts&#x60; scope is required to access staff member contract information.

### Example
```java
// Import classes:
//import education.assembly.platform.spring.ApiClient;
//import education.assembly.platform.spring.ApiException;
//import education.assembly.platform.spring.Configuration;
//import education.assembly.platform.spring.auth.*;
//import education.assembly.platform.spring.AssemblyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: bearerAuth
HttpBasicAuth bearerAuth = (HttpBasicAuth) defaultClient.getAuthentication("bearerAuth");
bearerAuth.setUsername("YOUR USERNAME");
bearerAuth.setPassword("YOUR PASSWORD");

AssemblyApi apiInstance = new AssemblyApi();
OffsetDateTime ifModifiedSince = new OffsetDateTime(); // OffsetDateTime | If-Modified-Since is optional (see the page on Conditional Requests for more details).
Integer staffMemberId = 56; // Integer | show only absences fot the specified staff member
Boolean date = true; // Boolean | returns results for a specific date
Boolean roles = true; // Boolean | return roles information along with a staff contract
Boolean salaries = true; // Boolean | return salaries information along with a staff contract (requires staff_members.salaries scope for full information - only the hours_per_week, fte and weeks_per_year fields are shown without it)
Boolean allowances = true; // Boolean | return allowances information along with a staff contract (requires staff_members.salaries scope)
Integer perPage = 100; // Integer | Number of results to return
Integer page = 1; // Integer | Page number to return
try {
    List<StaffContract> result = apiInstance.get_10(ifModifiedSince, staffMemberId, date, roles, salaries, allowances, perPage, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssemblyApi#get_10");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ifModifiedSince** | **OffsetDateTime**| If-Modified-Since is optional (see the page on Conditional Requests for more details). | [optional]
 **staffMemberId** | **Integer**| show only absences fot the specified staff member | [optional]
 **date** | **Boolean**| returns results for a specific date | [optional]
 **roles** | **Boolean**| return roles information along with a staff contract | [optional]
 **salaries** | **Boolean**| return salaries information along with a staff contract (requires staff_members.salaries scope for full information - only the hours_per_week, fte and weeks_per_year fields are shown without it) | [optional]
 **allowances** | **Boolean**| return allowances information along with a staff contract (requires staff_members.salaries scope) | [optional]
 **perPage** | **Integer**| Number of results to return | [optional] [default to 100]
 **page** | **Integer**| Page number to return | [optional] [default to 1]

### Return type

[**List&lt;StaffContract&gt;**](StaffContract.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.assembly+json; version=1.1

<a name="get_11"></a>
# **get_11**
> List&lt;StaffMember&gt; get_11(ifModifiedSince, teachersOnly, demographics, qualifications, perPage, page)

List Staff Members

Returns a list of staff members for the school accociated with the provided &#x60;access_token&#x60;.  **Note:** Note the &#x60;If-Modified-Since&#x60; header is optional (see the page on [Conditional Requests](/api#conditional-requests) for more details). 

### Example
```java
// Import classes:
//import education.assembly.platform.spring.ApiClient;
//import education.assembly.platform.spring.ApiException;
//import education.assembly.platform.spring.Configuration;
//import education.assembly.platform.spring.auth.*;
//import education.assembly.platform.spring.AssemblyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: bearerAuth
HttpBasicAuth bearerAuth = (HttpBasicAuth) defaultClient.getAuthentication("bearerAuth");
bearerAuth.setUsername("YOUR USERNAME");
bearerAuth.setPassword("YOUR PASSWORD");

AssemblyApi apiInstance = new AssemblyApi();
OffsetDateTime ifModifiedSince = new OffsetDateTime(); // OffsetDateTime | If-Modified-Since is optional (see the page on Conditional Requests for more details).
Boolean teachersOnly = true; // Boolean | return only staff who are teachers
Boolean demographics = true; // Boolean | include demographics data
Boolean qualifications = true; // Boolean | include HLTA status, QT status, QT route and previous degree information (requires `staff_members.qualifications` scope)
Integer perPage = 100; // Integer | Number of results to return
Integer page = 1; // Integer | Page number to return
try {
    List<StaffMember> result = apiInstance.get_11(ifModifiedSince, teachersOnly, demographics, qualifications, perPage, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssemblyApi#get_11");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ifModifiedSince** | **OffsetDateTime**| If-Modified-Since is optional (see the page on Conditional Requests for more details). | [optional]
 **teachersOnly** | **Boolean**| return only staff who are teachers | [optional]
 **demographics** | **Boolean**| include demographics data | [optional]
 **qualifications** | **Boolean**| include HLTA status, QT status, QT route and previous degree information (requires &#x60;staff_members.qualifications&#x60; scope) | [optional]
 **perPage** | **Integer**| Number of results to return | [optional] [default to 100]
 **page** | **Integer**| Page number to return | [optional] [default to 1]

### Return type

[**List&lt;StaffMember&gt;**](StaffMember.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.assembly+json; version=1.1

<a name="get_12"></a>
# **get_12**
> List&lt;Student&gt; get_12(ifModifiedSince, students, date, yearCode, demographics, contacts, senNeeds, addresses, care, everInCare, languages, photo, perPage, page)

List Students

Returns a list of students for the school associated with the provided &#x60;access_token.&#x60; **Note:** the &#x60;If-Modified-Since&#x60; header is optional (see the page on [Conditional Requests](/api#conditional-requests) for more details). 

### Example
```java
// Import classes:
//import education.assembly.platform.spring.ApiClient;
//import education.assembly.platform.spring.ApiException;
//import education.assembly.platform.spring.Configuration;
//import education.assembly.platform.spring.auth.*;
//import education.assembly.platform.spring.AssemblyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: bearerAuth
HttpBasicAuth bearerAuth = (HttpBasicAuth) defaultClient.getAuthentication("bearerAuth");
bearerAuth.setUsername("YOUR USERNAME");
bearerAuth.setPassword("YOUR PASSWORD");

AssemblyApi apiInstance = new AssemblyApi();
OffsetDateTime ifModifiedSince = new OffsetDateTime(); // OffsetDateTime | If-Modified-Since is optional (see the page on Conditional Requests for more details).
List<Integer> students = Arrays.asList(56); // List<Integer> | ID(s) of the student(s) as an Integer. Multiple IDs can be separated with a space (so a + URL encoded).
OffsetDateTime date = new OffsetDateTime(); // OffsetDateTime | returns results for a specific date
Integer yearCode = 56; // Integer | filter by school year (cannot be supplied at the same time as the students parameter)
Boolean demographics = true; // Boolean | include demographics data
Boolean contacts = true; // Boolean | include contacts data
Boolean senNeeds = true; // Boolean | include SEN needs data
Boolean addresses = true; // Boolean | include student address data
Boolean care = true; // Boolean | include student care data (you must also supply the demographics parameter)
Boolean everInCare = true; // Boolean | include whether the student has ever been in care (you must also supply the demographics parameter)
Boolean languages = true; // Boolean | include student language data
Boolean photo = true; // Boolean | include student photo data
Integer perPage = 100; // Integer | Number of results to return
Integer page = 1; // Integer | Page number to return
try {
    List<Student> result = apiInstance.get_12(ifModifiedSince, students, date, yearCode, demographics, contacts, senNeeds, addresses, care, everInCare, languages, photo, perPage, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssemblyApi#get_12");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ifModifiedSince** | **OffsetDateTime**| If-Modified-Since is optional (see the page on Conditional Requests for more details). | [optional]
 **students** | [**List&lt;Integer&gt;**](Integer.md)| ID(s) of the student(s) as an Integer. Multiple IDs can be separated with a space (so a + URL encoded). | [optional]
 **date** | **OffsetDateTime**| returns results for a specific date | [optional]
 **yearCode** | **Integer**| filter by school year (cannot be supplied at the same time as the students parameter) | [optional]
 **demographics** | **Boolean**| include demographics data | [optional]
 **contacts** | **Boolean**| include contacts data | [optional]
 **senNeeds** | **Boolean**| include SEN needs data | [optional]
 **addresses** | **Boolean**| include student address data | [optional]
 **care** | **Boolean**| include student care data (you must also supply the demographics parameter) | [optional]
 **everInCare** | **Boolean**| include whether the student has ever been in care (you must also supply the demographics parameter) | [optional]
 **languages** | **Boolean**| include student language data | [optional]
 **photo** | **Boolean**| include student photo data | [optional]
 **perPage** | **Integer**| Number of results to return | [optional] [default to 100]
 **page** | **Integer**| Page number to return | [optional] [default to 1]

### Return type

[**List&lt;Student&gt;**](Student.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.assembly+json; version=1.1

<a name="get_13"></a>
# **get_13**
> List&lt;Subject&gt; get_13(perPage, page)

List Subjects

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

// Configure HTTP basic authorization: bearerAuth
HttpBasicAuth bearerAuth = (HttpBasicAuth) defaultClient.getAuthentication("bearerAuth");
bearerAuth.setUsername("YOUR USERNAME");
bearerAuth.setPassword("YOUR PASSWORD");

AssemblyApi apiInstance = new AssemblyApi();
Integer perPage = 100; // Integer | Number of results to return
Integer page = 1; // Integer | Page number to return
try {
    List<Subject> result = apiInstance.get_13(perPage, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssemblyApi#get_13");
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

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.assembly+json; version=1.1

<a name="get_14"></a>
# **get_14**
> List&lt;TeachingGroup&gt; get_14(ifModifiedSince, subjectCode, yearCode, date, academicYearId, perPage, page)

List Teaching Groups

Returns a list of teaching groups that match the given set of filters.  If a date parameter is provided then the list of groups returned is filtered to only those where the provided date falls between the groups start_date and end_date. Additionally when a date parameter is provided student_ids and supervior_ids are restricted to only those students who were enrolled in the group on the given date.  **Note:** Note the &#x60;If-Modified-Since&#x60; header is optional (see the page on [Conditional Requests](/api#conditional-requests) for more details). 

### Example
```java
// Import classes:
//import education.assembly.platform.spring.ApiClient;
//import education.assembly.platform.spring.ApiException;
//import education.assembly.platform.spring.Configuration;
//import education.assembly.platform.spring.auth.*;
//import education.assembly.platform.spring.AssemblyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: bearerAuth
HttpBasicAuth bearerAuth = (HttpBasicAuth) defaultClient.getAuthentication("bearerAuth");
bearerAuth.setUsername("YOUR USERNAME");
bearerAuth.setPassword("YOUR PASSWORD");

AssemblyApi apiInstance = new AssemblyApi();
OffsetDateTime ifModifiedSince = new OffsetDateTime(); // OffsetDateTime | If-Modified-Since is optional (see the page on Conditional Requests for more details).
String subjectCode = "subjectCode_example"; // String | filter by subject
Integer yearCode = 56; // Integer | filter by school year (cannot be supplied at the same time as the students parameter)
OffsetDateTime date = new OffsetDateTime(); // OffsetDateTime | returns results for a specific date
Integer academicYearId = 56; // Integer | returns all groups and group memberships from the specified academic year
Integer perPage = 100; // Integer | Number of results to return
Integer page = 1; // Integer | Page number to return
try {
    List<TeachingGroup> result = apiInstance.get_14(ifModifiedSince, subjectCode, yearCode, date, academicYearId, perPage, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssemblyApi#get_14");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ifModifiedSince** | **OffsetDateTime**| If-Modified-Since is optional (see the page on Conditional Requests for more details). | [optional]
 **subjectCode** | **String**| filter by subject | [optional]
 **yearCode** | **Integer**| filter by school year (cannot be supplied at the same time as the students parameter) | [optional]
 **date** | **OffsetDateTime**| returns results for a specific date | [optional]
 **academicYearId** | **Integer**| returns all groups and group memberships from the specified academic year | [optional]
 **perPage** | **Integer**| Number of results to return | [optional] [default to 100]
 **page** | **Integer**| Page number to return | [optional] [default to 1]

### Return type

[**List&lt;TeachingGroup&gt;**](TeachingGroup.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.assembly+json; version=1.1

<a name="get_15"></a>
# **get_15**
> List&lt;YearGroup&gt; get_15(ifModifiedSince, yearCode, date, academicYearId, perPage, page)

List Year Groups

Returns a list of year groups that match the given set of filters.  If a date parameter is provided then the list of groups returned is filtered to only those where the provided date falls between the groups start_date and end_date. Additionally when a date parameter is provided student_ids and supervior_ids are restricted to only those students who were enrolled in the group on the given date.  **Note:** Note the &#x60;If-Modified-Since&#x60; header is optional (see the page on [Conditional Requests](/api#conditional-requests) for more details). 

### Example
```java
// Import classes:
//import education.assembly.platform.spring.ApiClient;
//import education.assembly.platform.spring.ApiException;
//import education.assembly.platform.spring.Configuration;
//import education.assembly.platform.spring.auth.*;
//import education.assembly.platform.spring.AssemblyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: bearerAuth
HttpBasicAuth bearerAuth = (HttpBasicAuth) defaultClient.getAuthentication("bearerAuth");
bearerAuth.setUsername("YOUR USERNAME");
bearerAuth.setPassword("YOUR PASSWORD");

AssemblyApi apiInstance = new AssemblyApi();
OffsetDateTime ifModifiedSince = new OffsetDateTime(); // OffsetDateTime | If-Modified-Since is optional (see the page on Conditional Requests for more details).
Integer yearCode = 56; // Integer | filter by school year (cannot be supplied at the same time as the students parameter)
OffsetDateTime date = new OffsetDateTime(); // OffsetDateTime | returns results for a specific date
Integer academicYearId = 56; // Integer | returns all groups and group memberships from the specified academic year
Integer perPage = 100; // Integer | Number of results to return
Integer page = 1; // Integer | Page number to return
try {
    List<YearGroup> result = apiInstance.get_15(ifModifiedSince, yearCode, date, academicYearId, perPage, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssemblyApi#get_15");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ifModifiedSince** | **OffsetDateTime**| If-Modified-Since is optional (see the page on Conditional Requests for more details). | [optional]
 **yearCode** | **Integer**| filter by school year (cannot be supplied at the same time as the students parameter) | [optional]
 **date** | **OffsetDateTime**| returns results for a specific date | [optional]
 **academicYearId** | **Integer**| returns all groups and group memberships from the specified academic year | [optional]
 **perPage** | **Integer**| Number of results to return | [optional] [default to 100]
 **page** | **Integer**| Page number to return | [optional] [default to 1]

### Return type

[**List&lt;YearGroup&gt;**](YearGroup.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.assembly+json; version=1.1

<a name="get_2"></a>
# **get_2**
> List&lt;Attendance&gt; get_2(studentId, registrationGroupId, startDate, endDate, perPage, page)

List Attendances

Returns a list of attendances. By default, attendances are returned from the start to the end of the current week.  **Note:** Note the &#x60;If-Modified-Since&#x60; header is optional (see the page on [Conditional Requests](/api#conditional-requests) for more details). 

### Example
```java
// Import classes:
//import education.assembly.platform.spring.ApiClient;
//import education.assembly.platform.spring.ApiException;
//import education.assembly.platform.spring.Configuration;
//import education.assembly.platform.spring.auth.*;
//import education.assembly.platform.spring.AssemblyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: bearerAuth
HttpBasicAuth bearerAuth = (HttpBasicAuth) defaultClient.getAuthentication("bearerAuth");
bearerAuth.setUsername("YOUR USERNAME");
bearerAuth.setPassword("YOUR PASSWORD");

AssemblyApi apiInstance = new AssemblyApi();
Integer studentId = 56; // Integer | a student_id to filter by
Integer registrationGroupId = 56; // Integer | id of a registration group
OffsetDateTime startDate = new OffsetDateTime(); // OffsetDateTime | the start date of the period to query
OffsetDateTime endDate = new OffsetDateTime(); // OffsetDateTime | the end date of the period to query
Integer perPage = 100; // Integer | Number of results to return
Integer page = 1; // Integer | Page number to return
try {
    List<Attendance> result = apiInstance.get_2(studentId, registrationGroupId, startDate, endDate, perPage, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssemblyApi#get_2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **studentId** | **Integer**| a student_id to filter by | [optional]
 **registrationGroupId** | **Integer**| id of a registration group | [optional]
 **startDate** | **OffsetDateTime**| the start date of the period to query | [optional]
 **endDate** | **OffsetDateTime**| the end date of the period to query | [optional]
 **perPage** | **Integer**| Number of results to return | [optional] [default to 100]
 **page** | **Integer**| Page number to return | [optional] [default to 1]

### Return type

[**List&lt;Attendance&gt;**](Attendance.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.assembly+json; version=1.1

<a name="get_3"></a>
# **get_3**
> List&lt;CalendarEvent&gt; get_3(eventType, perPage, page)

List Calendar Events

Returns a list of calendar events from the school calendar. We strongly recommend that you use an object type to filter the events that will be returned to you. Presently, with SIMS only support, we&#39;ve exposed the raw types from the underlying MIS. As such, it&#39;s most likely that you&#39;ll mostly be interested in &#39;User&#39; events. This category includes items such as staff meetings and school assembly times as you can see from the sample response below.  **Note:** Note the &#x60;If-Modified-Since&#x60; header is optional (see the page on [Conditional Requests](/api#conditional-requests) for more details). 

### Example
```java
// Import classes:
//import education.assembly.platform.spring.ApiClient;
//import education.assembly.platform.spring.ApiException;
//import education.assembly.platform.spring.Configuration;
//import education.assembly.platform.spring.auth.*;
//import education.assembly.platform.spring.AssemblyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: bearerAuth
HttpBasicAuth bearerAuth = (HttpBasicAuth) defaultClient.getAuthentication("bearerAuth");
bearerAuth.setUsername("YOUR USERNAME");
bearerAuth.setPassword("YOUR PASSWORD");

AssemblyApi apiInstance = new AssemblyApi();
String eventType = "eventType_example"; // String | a calendar object type from the underlying MIS
Integer perPage = 100; // Integer | Number of results to return
Integer page = 1; // Integer | Page number to return
try {
    List<CalendarEvent> result = apiInstance.get_3(eventType, perPage, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssemblyApi#get_3");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventType** | **String**| a calendar object type from the underlying MIS | [optional]
 **perPage** | **Integer**| Number of results to return | [optional] [default to 100]
 **page** | **Integer**| Page number to return | [optional] [default to 1]

### Return type

[**List&lt;CalendarEvent&gt;**](CalendarEvent.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.assembly+json; version=1.1

<a name="get_4"></a>
# **get_4**
> List&lt;Contact&gt; get_4(studentId, perPage, page)

List Contacts

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

// Configure HTTP basic authorization: bearerAuth
HttpBasicAuth bearerAuth = (HttpBasicAuth) defaultClient.getAuthentication("bearerAuth");
bearerAuth.setUsername("YOUR USERNAME");
bearerAuth.setPassword("YOUR PASSWORD");

AssemblyApi apiInstance = new AssemblyApi();
Integer studentId = 56; // Integer | a student_id to filter by
Integer perPage = 100; // Integer | Number of results to return
Integer page = 1; // Integer | Page number to return
try {
    List<Contact> result = apiInstance.get_4(studentId, perPage, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssemblyApi#get_4");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **studentId** | **Integer**| a student_id to filter by | [optional]
 **perPage** | **Integer**| Number of results to return | [optional] [default to 100]
 **page** | **Integer**| Page number to return | [optional] [default to 1]

### Return type

[**List&lt;Contact&gt;**](Contact.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.assembly+json; version=1.1

<a name="get_5"></a>
# **get_5**
> List&lt;Exclusion&gt; get_5(studentId, startDate, endDate, perPage, page)

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

// Configure HTTP basic authorization: bearerAuth
HttpBasicAuth bearerAuth = (HttpBasicAuth) defaultClient.getAuthentication("bearerAuth");
bearerAuth.setUsername("YOUR USERNAME");
bearerAuth.setPassword("YOUR PASSWORD");

AssemblyApi apiInstance = new AssemblyApi();
Integer studentId = 56; // Integer | a student_id to filter by
OffsetDateTime startDate = new OffsetDateTime(); // OffsetDateTime | the start date of the period to query
OffsetDateTime endDate = new OffsetDateTime(); // OffsetDateTime | the end date of the period to query
Integer perPage = 100; // Integer | Number of results to return
Integer page = 1; // Integer | Page number to return
try {
    List<Exclusion> result = apiInstance.get_5(studentId, startDate, endDate, perPage, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssemblyApi#get_5");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **studentId** | **Integer**| a student_id to filter by | [optional]
 **startDate** | **OffsetDateTime**| the start date of the period to query | [optional]
 **endDate** | **OffsetDateTime**| the end date of the period to query | [optional]
 **perPage** | **Integer**| Number of results to return | [optional] [default to 100]
 **page** | **Integer**| Page number to return | [optional] [default to 1]

### Return type

[**List&lt;Exclusion&gt;**](Exclusion.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.assembly+json; version=1.1

<a name="get_6"></a>
# **get_6**
> List&lt;Facet&gt; get_6(perPage, page)

List Facets

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

// Configure HTTP basic authorization: bearerAuth
HttpBasicAuth bearerAuth = (HttpBasicAuth) defaultClient.getAuthentication("bearerAuth");
bearerAuth.setUsername("YOUR USERNAME");
bearerAuth.setPassword("YOUR PASSWORD");

AssemblyApi apiInstance = new AssemblyApi();
Integer perPage = 100; // Integer | Number of results to return
Integer page = 1; // Integer | Page number to return
try {
    List<Facet> result = apiInstance.get_6(perPage, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssemblyApi#get_6");
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

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.assembly+json; version=1.1

<a name="get_7"></a>
# **get_7**
> List&lt;RegistrationGroup&gt; get_7(ifModifiedSince, yearCode, date, academicYearId, perPage, page)

List Registration Group

Returns a list of registration groups that match the given set of filters.  If a date parameter is provided then the list of groups returned is filtered to only those where the provided date falls between the groups start_date and end_date. Additionally when a date parameter is provided student_ids and supervior_ids are restricted to only those students who were enrolled in the group on the given date.  **Note:** Note the &#x60;If-Modified-Since&#x60; header is optional (see the page on [Conditional Requests](/api#conditional-requests) for more details). 

### Example
```java
// Import classes:
//import education.assembly.platform.spring.ApiClient;
//import education.assembly.platform.spring.ApiException;
//import education.assembly.platform.spring.Configuration;
//import education.assembly.platform.spring.auth.*;
//import education.assembly.platform.spring.AssemblyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: bearerAuth
HttpBasicAuth bearerAuth = (HttpBasicAuth) defaultClient.getAuthentication("bearerAuth");
bearerAuth.setUsername("YOUR USERNAME");
bearerAuth.setPassword("YOUR PASSWORD");

AssemblyApi apiInstance = new AssemblyApi();
OffsetDateTime ifModifiedSince = new OffsetDateTime(); // OffsetDateTime | If-Modified-Since is optional (see the page on Conditional Requests for more details).
Integer yearCode = 56; // Integer | filter by school year (cannot be supplied at the same time as the students parameter)
OffsetDateTime date = new OffsetDateTime(); // OffsetDateTime | returns results for a specific date
Integer academicYearId = 56; // Integer | returns all groups and group memberships from the specified academic year
Integer perPage = 100; // Integer | Number of results to return
Integer page = 1; // Integer | Page number to return
try {
    List<RegistrationGroup> result = apiInstance.get_7(ifModifiedSince, yearCode, date, academicYearId, perPage, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssemblyApi#get_7");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ifModifiedSince** | **OffsetDateTime**| If-Modified-Since is optional (see the page on Conditional Requests for more details). | [optional]
 **yearCode** | **Integer**| filter by school year (cannot be supplied at the same time as the students parameter) | [optional]
 **date** | **OffsetDateTime**| returns results for a specific date | [optional]
 **academicYearId** | **Integer**| returns all groups and group memberships from the specified academic year | [optional]
 **perPage** | **Integer**| Number of results to return | [optional] [default to 100]
 **page** | **Integer**| Page number to return | [optional] [default to 1]

### Return type

[**List&lt;RegistrationGroup&gt;**](RegistrationGroup.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.assembly+json; version=1.1

<a name="get_8"></a>
# **get_8**
> List&lt;Result&gt; get_8(students, ifModifiedSince, perPage, page)

List Results

Returns a list of results for the student ID(s) specified by the students parameter.

### Example
```java
// Import classes:
//import education.assembly.platform.spring.ApiClient;
//import education.assembly.platform.spring.ApiException;
//import education.assembly.platform.spring.Configuration;
//import education.assembly.platform.spring.auth.*;
//import education.assembly.platform.spring.AssemblyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: bearerAuth
HttpBasicAuth bearerAuth = (HttpBasicAuth) defaultClient.getAuthentication("bearerAuth");
bearerAuth.setUsername("YOUR USERNAME");
bearerAuth.setPassword("YOUR PASSWORD");

AssemblyApi apiInstance = new AssemblyApi();
List<Integer> students = Arrays.asList(56); // List<Integer> | ID(s) of the student(s) as an Integer. Multiple IDs can be separated with a space (so a + URL encoded).
OffsetDateTime ifModifiedSince = new OffsetDateTime(); // OffsetDateTime | If-Modified-Since is optional (see the page on Conditional Requests for more details).
Integer perPage = 100; // Integer | Number of results to return
Integer page = 1; // Integer | Page number to return
try {
    List<Result> result = apiInstance.get_8(students, ifModifiedSince, perPage, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssemblyApi#get_8");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **students** | [**List&lt;Integer&gt;**](Integer.md)| ID(s) of the student(s) as an Integer. Multiple IDs can be separated with a space (so a + URL encoded). |
 **ifModifiedSince** | **OffsetDateTime**| If-Modified-Since is optional (see the page on Conditional Requests for more details). | [optional]
 **perPage** | **Integer**| Number of results to return | [optional] [default to 100]
 **page** | **Integer**| Page number to return | [optional] [default to 1]

### Return type

[**List&lt;Result&gt;**](Result.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.assembly+json; version=1.1

<a name="get_9"></a>
# **get_9**
> List&lt;StaffAbsence&gt; get_9(ifModifiedSince, staffMemberId, startDate, qualifications, perPage, page)

List Staff Absences

Returns a list of staff member absences for the school accociated with the provided &#x60;access_token&#x60;. A school level access token with the &#x60;staff_members.absences&#x60; scope is required to access staff member absence information.

### Example
```java
// Import classes:
//import education.assembly.platform.spring.ApiClient;
//import education.assembly.platform.spring.ApiException;
//import education.assembly.platform.spring.Configuration;
//import education.assembly.platform.spring.auth.*;
//import education.assembly.platform.spring.AssemblyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: bearerAuth
HttpBasicAuth bearerAuth = (HttpBasicAuth) defaultClient.getAuthentication("bearerAuth");
bearerAuth.setUsername("YOUR USERNAME");
bearerAuth.setPassword("YOUR PASSWORD");

AssemblyApi apiInstance = new AssemblyApi();
OffsetDateTime ifModifiedSince = new OffsetDateTime(); // OffsetDateTime | If-Modified-Since is optional (see the page on Conditional Requests for more details).
Integer staffMemberId = 56; // Integer | show only absences fot the specified staff member
OffsetDateTime startDate = new OffsetDateTime(); // OffsetDateTime | the start date of the period to query
Integer qualifications = 56; // Integer | include HLTA status, QT status, QT route and previous degree information (requires `staff_members.qualifications` scope)
Integer perPage = 100; // Integer | Number of results to return
Integer page = 1; // Integer | Page number to return
try {
    List<StaffAbsence> result = apiInstance.get_9(ifModifiedSince, staffMemberId, startDate, qualifications, perPage, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssemblyApi#get_9");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ifModifiedSince** | **OffsetDateTime**| If-Modified-Since is optional (see the page on Conditional Requests for more details). | [optional]
 **staffMemberId** | **Integer**| show only absences fot the specified staff member | [optional]
 **startDate** | **OffsetDateTime**| the start date of the period to query | [optional]
 **qualifications** | **Integer**| include HLTA status, QT status, QT route and previous degree information (requires &#x60;staff_members.qualifications&#x60; scope) | [optional]
 **perPage** | **Integer**| Number of results to return | [optional] [default to 100]
 **page** | **Integer**| Page number to return | [optional] [default to 1]

### Return type

[**List&lt;StaffAbsence&gt;**](StaffAbsence.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.assembly+json; version=1.1

<a name="gradeSet"></a>
# **gradeSet**
> GradeSet gradeSet(id)

View Grade Set for an Assessment

Returns a grade_set (an acceptable list of values) for the assessment identified by the assessment_id. Grades should be written back to the Platform using the grade_id.

### Example
```java
// Import classes:
//import education.assembly.platform.spring.ApiClient;
//import education.assembly.platform.spring.ApiException;
//import education.assembly.platform.spring.Configuration;
//import education.assembly.platform.spring.auth.*;
//import education.assembly.platform.spring.AssemblyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: bearerAuth
HttpBasicAuth bearerAuth = (HttpBasicAuth) defaultClient.getAuthentication("bearerAuth");
bearerAuth.setUsername("YOUR USERNAME");
bearerAuth.setPassword("YOUR PASSWORD");

AssemblyApi apiInstance = new AssemblyApi();
Integer id = 56; // Integer | id of the entity
try {
    GradeSet result = apiInstance.gradeSet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssemblyApi#gradeSet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| id of the entity |

### Return type

[**GradeSet**](GradeSet.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.assembly+json; version=1.1

<a name="left"></a>
# **left**
> List&lt;Student&gt; left(ifModifiedSince)

List Left Students

Returns a list of students who have left the school.&lt;br&gt;&lt;br&gt;**Note:** This will include any students who have left the school during the current academic year. If the school has been connected to Assembly for more than one academic year, all left students will be returned. The &#x60;If-Modified-Since&#x60; header is optional (see the page on [Conditional Requests](/api#conditional-requests) for more details).

### Example
```java
// Import classes:
//import education.assembly.platform.spring.ApiClient;
//import education.assembly.platform.spring.ApiException;
//import education.assembly.platform.spring.Configuration;
//import education.assembly.platform.spring.auth.*;
//import education.assembly.platform.spring.AssemblyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: bearerAuth
HttpBasicAuth bearerAuth = (HttpBasicAuth) defaultClient.getAuthentication("bearerAuth");
bearerAuth.setUsername("YOUR USERNAME");
bearerAuth.setPassword("YOUR PASSWORD");

AssemblyApi apiInstance = new AssemblyApi();
OffsetDateTime ifModifiedSince = new OffsetDateTime(); // OffsetDateTime | If-Modified-Since is optional (see the page on Conditional Requests for more details).
try {
    List<Student> result = apiInstance.left(ifModifiedSince);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssemblyApi#left");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ifModifiedSince** | **OffsetDateTime**| If-Modified-Since is optional (see the page on Conditional Requests for more details). | [optional]

### Return type

[**List&lt;Student&gt;**](Student.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.assembly+json; version=1.1

<a name="results"></a>
# **results**
> List&lt;Result&gt; results(id, students, assessmentPointRank)

View Results for an Assessment Point

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

// Configure HTTP basic authorization: bearerAuth
HttpBasicAuth bearerAuth = (HttpBasicAuth) defaultClient.getAuthentication("bearerAuth");
bearerAuth.setUsername("YOUR USERNAME");
bearerAuth.setPassword("YOUR PASSWORD");

AssemblyApi apiInstance = new AssemblyApi();
Integer id = 56; // Integer | id of the entity
List<Integer> students = Arrays.asList(56); // List<Integer> | ID(s) of the student(s) as an Integer. Multiple IDs can be separated with a space (so a + URL encoded).
Integer assessmentPointRank = 56; // Integer | the Assessment Point rank
try {
    List<Result> result = apiInstance.results(id, students, assessmentPointRank);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssemblyApi#results");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| id of the entity |
 **students** | [**List&lt;Integer&gt;**](Integer.md)| ID(s) of the student(s) as an Integer. Multiple IDs can be separated with a space (so a + URL encoded). |
 **assessmentPointRank** | **Integer**| the Assessment Point rank | [optional]

### Return type

[**List&lt;Result&gt;**](Result.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.assembly+json; version=1.1

<a name="results_0"></a>
# **results_0**
> List&lt;Result&gt; results_0(id, students)

View Results for an Assessment

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

// Configure HTTP basic authorization: bearerAuth
HttpBasicAuth bearerAuth = (HttpBasicAuth) defaultClient.getAuthentication("bearerAuth");
bearerAuth.setUsername("YOUR USERNAME");
bearerAuth.setPassword("YOUR PASSWORD");

AssemblyApi apiInstance = new AssemblyApi();
Integer id = 56; // Integer | id of the entity
List<Integer> students = Arrays.asList(56); // List<Integer> | ID(s) of the student(s) as an Integer. Multiple IDs can be separated with a space (so a + URL encoded).
try {
    List<Result> result = apiInstance.results_0(id, students);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssemblyApi#results_0");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| id of the entity |
 **students** | [**List&lt;Integer&gt;**](Integer.md)| ID(s) of the student(s) as an Integer. Multiple IDs can be separated with a space (so a + URL encoded). |

### Return type

[**List&lt;Result&gt;**](Result.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.assembly+json; version=1.1

<a name="show"></a>
# **show**
> SchoolDetails show()

List School Details

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

// Configure HTTP basic authorization: bearerAuth
HttpBasicAuth bearerAuth = (HttpBasicAuth) defaultClient.getAuthentication("bearerAuth");
bearerAuth.setUsername("YOUR USERNAME");
bearerAuth.setPassword("YOUR PASSWORD");

AssemblyApi apiInstance = new AssemblyApi();
try {
    SchoolDetails result = apiInstance.show();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssemblyApi#show");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**SchoolDetails**](SchoolDetails.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.assembly+json; version=1.1

<a name="students"></a>
# **students**
> List&lt;Student&gt; students(id, ifModifiedSince, date, academicYearId, demographics, contacts, senNeeds, addresses, care, everInCare, languages, photo)

List Students for Registration Group

Returns a list of all the students that are present in the registration group identified by group_id.  **Note:** Note the &#x60;If-Modified-Since&#x60; header is optional (see the page on [Conditional Requests](/api#conditional-requests) for more details). 

### Example
```java
// Import classes:
//import education.assembly.platform.spring.ApiClient;
//import education.assembly.platform.spring.ApiException;
//import education.assembly.platform.spring.Configuration;
//import education.assembly.platform.spring.auth.*;
//import education.assembly.platform.spring.AssemblyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: bearerAuth
HttpBasicAuth bearerAuth = (HttpBasicAuth) defaultClient.getAuthentication("bearerAuth");
bearerAuth.setUsername("YOUR USERNAME");
bearerAuth.setPassword("YOUR PASSWORD");

AssemblyApi apiInstance = new AssemblyApi();
Integer id = 56; // Integer | id of the entity
OffsetDateTime ifModifiedSince = new OffsetDateTime(); // OffsetDateTime | If-Modified-Since is optional (see the page on Conditional Requests for more details).
OffsetDateTime date = new OffsetDateTime(); // OffsetDateTime | returns results for a specific date
Integer academicYearId = 56; // Integer | returns all groups and group memberships from the specified academic year
Boolean demographics = true; // Boolean | include demographics data
Boolean contacts = true; // Boolean | include contacts data
Boolean senNeeds = true; // Boolean | include SEN needs data
Boolean addresses = true; // Boolean | include student address data
Boolean care = true; // Boolean | include student care data (you must also supply the demographics parameter)
Boolean everInCare = true; // Boolean | include whether the student has ever been in care (you must also supply the demographics parameter)
Boolean languages = true; // Boolean | include student language data
Boolean photo = true; // Boolean | include student photo data
try {
    List<Student> result = apiInstance.students(id, ifModifiedSince, date, academicYearId, demographics, contacts, senNeeds, addresses, care, everInCare, languages, photo);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssemblyApi#students");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| id of the entity |
 **ifModifiedSince** | **OffsetDateTime**| If-Modified-Since is optional (see the page on Conditional Requests for more details). | [optional]
 **date** | **OffsetDateTime**| returns results for a specific date | [optional]
 **academicYearId** | **Integer**| returns all groups and group memberships from the specified academic year | [optional]
 **demographics** | **Boolean**| include demographics data | [optional]
 **contacts** | **Boolean**| include contacts data | [optional]
 **senNeeds** | **Boolean**| include SEN needs data | [optional]
 **addresses** | **Boolean**| include student address data | [optional]
 **care** | **Boolean**| include student care data (you must also supply the demographics parameter) | [optional]
 **everInCare** | **Boolean**| include whether the student has ever been in care (you must also supply the demographics parameter) | [optional]
 **languages** | **Boolean**| include student language data | [optional]
 **photo** | **Boolean**| include student photo data | [optional]

### Return type

[**List&lt;Student&gt;**](Student.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.assembly+json; version=1.1

<a name="students_0"></a>
# **students_0**
> List&lt;Student&gt; students_0(id, ifModifiedSince, demographics, contacts, senNeeds, addresses, care, everInCare, languages, photo)

List Students for Teaching Group

Returns a list of all the students that are present in the teaching group identified by group_id.  **Note:** Note the &#x60;If-Modified-Since&#x60; header is optional (see the page on [Conditional Requests](/api#conditional-requests) for more details). 

### Example
```java
// Import classes:
//import education.assembly.platform.spring.ApiClient;
//import education.assembly.platform.spring.ApiException;
//import education.assembly.platform.spring.Configuration;
//import education.assembly.platform.spring.auth.*;
//import education.assembly.platform.spring.AssemblyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: bearerAuth
HttpBasicAuth bearerAuth = (HttpBasicAuth) defaultClient.getAuthentication("bearerAuth");
bearerAuth.setUsername("YOUR USERNAME");
bearerAuth.setPassword("YOUR PASSWORD");

AssemblyApi apiInstance = new AssemblyApi();
Integer id = 56; // Integer | id of the entity
OffsetDateTime ifModifiedSince = new OffsetDateTime(); // OffsetDateTime | If-Modified-Since is optional (see the page on Conditional Requests for more details).
Boolean demographics = true; // Boolean | include demographics data
Boolean contacts = true; // Boolean | include contacts data
Boolean senNeeds = true; // Boolean | include SEN needs data
Boolean addresses = true; // Boolean | include student address data
Boolean care = true; // Boolean | include student care data (you must also supply the demographics parameter)
Boolean everInCare = true; // Boolean | include whether the student has ever been in care (you must also supply the demographics parameter)
Boolean languages = true; // Boolean | include student language data
Boolean photo = true; // Boolean | include student photo data
try {
    List<Student> result = apiInstance.students_0(id, ifModifiedSince, demographics, contacts, senNeeds, addresses, care, everInCare, languages, photo);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssemblyApi#students_0");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| id of the entity |
 **ifModifiedSince** | **OffsetDateTime**| If-Modified-Since is optional (see the page on Conditional Requests for more details). | [optional]
 **demographics** | **Boolean**| include demographics data | [optional]
 **contacts** | **Boolean**| include contacts data | [optional]
 **senNeeds** | **Boolean**| include SEN needs data | [optional]
 **addresses** | **Boolean**| include student address data | [optional]
 **care** | **Boolean**| include student care data (you must also supply the demographics parameter) | [optional]
 **everInCare** | **Boolean**| include whether the student has ever been in care (you must also supply the demographics parameter) | [optional]
 **languages** | **Boolean**| include student language data | [optional]
 **photo** | **Boolean**| include student photo data | [optional]

### Return type

[**List&lt;Student&gt;**](Student.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.assembly+json; version=1.1

<a name="students_1"></a>
# **students_1**
> List&lt;Student&gt; students_1(id, ifModifiedSince, date, academicYearId, demographics, contacts, senNeeds, addresses, care, everInCare, languages, photo)

List Students for Year Group

Returns a list of all the students that are present in the year group identified by group_id.  **Note:** Note the &#x60;If-Modified-Since&#x60; header is optional (see the page on [Conditional Requests](/api#conditional-requests) for more details). 

### Example
```java
// Import classes:
//import education.assembly.platform.spring.ApiClient;
//import education.assembly.platform.spring.ApiException;
//import education.assembly.platform.spring.Configuration;
//import education.assembly.platform.spring.auth.*;
//import education.assembly.platform.spring.AssemblyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: bearerAuth
HttpBasicAuth bearerAuth = (HttpBasicAuth) defaultClient.getAuthentication("bearerAuth");
bearerAuth.setUsername("YOUR USERNAME");
bearerAuth.setPassword("YOUR PASSWORD");

AssemblyApi apiInstance = new AssemblyApi();
Integer id = 56; // Integer | id of the entity
OffsetDateTime ifModifiedSince = new OffsetDateTime(); // OffsetDateTime | If-Modified-Since is optional (see the page on Conditional Requests for more details).
OffsetDateTime date = new OffsetDateTime(); // OffsetDateTime | returns results for a specific date
Integer academicYearId = 56; // Integer | returns all groups and group memberships from the specified academic year
Boolean demographics = true; // Boolean | include demographics data
Boolean contacts = true; // Boolean | include contacts data
Boolean senNeeds = true; // Boolean | include SEN needs data
Boolean addresses = true; // Boolean | include student address data
Boolean care = true; // Boolean | include student care data (you must also supply the demographics parameter)
Boolean everInCare = true; // Boolean | include whether the student has ever been in care (you must also supply the demographics parameter)
Boolean languages = true; // Boolean | include student language data
Boolean photo = true; // Boolean | include student photo data
try {
    List<Student> result = apiInstance.students_1(id, ifModifiedSince, date, academicYearId, demographics, contacts, senNeeds, addresses, care, everInCare, languages, photo);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssemblyApi#students_1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| id of the entity |
 **ifModifiedSince** | **OffsetDateTime**| If-Modified-Since is optional (see the page on Conditional Requests for more details). | [optional]
 **date** | **OffsetDateTime**| returns results for a specific date | [optional]
 **academicYearId** | **Integer**| returns all groups and group memberships from the specified academic year | [optional]
 **demographics** | **Boolean**| include demographics data | [optional]
 **contacts** | **Boolean**| include contacts data | [optional]
 **senNeeds** | **Boolean**| include SEN needs data | [optional]
 **addresses** | **Boolean**| include student address data | [optional]
 **care** | **Boolean**| include student care data (you must also supply the demographics parameter) | [optional]
 **everInCare** | **Boolean**| include whether the student has ever been in care (you must also supply the demographics parameter) | [optional]
 **languages** | **Boolean**| include student language data | [optional]
 **photo** | **Boolean**| include student photo data | [optional]

### Return type

[**List&lt;Student&gt;**](Student.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.assembly+json; version=1.1

