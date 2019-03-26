# Java SDK for the Assembly API
## Description
The Assembly API is built around the REST and a collection of open standards/protocols in order to comply with as many consumers as possible.

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>education.assembly</groupId>
  <artifactId>assembly-client-java</artifactId>
  <version>1.1.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "education.assembly:assembly-client-java:1.1.0"
```

### Others

At first generate the JAR by executing:

  mvn package

Then manually install the following JARs:

* target/assembly-client-java-1.1.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import education.assembly.platform.spring.*;
import education.assembly.platform.spring.auth.*;
import education.assembly.platform.spring.models.*;
import education.assembly.platform.spring.AssemblyApi;

import java.io.File;
import java.util.*;

public class AssemblyApiExample {

  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: bearerAuth
    HttpBasicAuth bearerAuth = (HttpBasicAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setUsername("YOUR USERNAME");
    bearerAuth.setPassword("YOUR PASSWORD");

    AssemblyApi apiInstance = new AssemblyApi();
    BulkResultsBody bulkResultsBody = new BulkResultsBody(); // BulkResultsBody | 
    try {
      ModelApiResponse result = apiInstance.bulkUpdateResults(bulkResultsBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssemblyApi#bulkUpdateResults");
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api-sandbox.assembly.education*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AssemblyApi* | [**bulkUpdateResults**](docs/AssemblyApi.md#bulkUpdateResults) | **PATCH** /results | Update Multiple Results
*AssemblyApi* | [**createResult**](docs/AssemblyApi.md#createResult) | **POST** /results | Write Results
*AssemblyApi* | [**findAcademicYear**](docs/AssemblyApi.md#findAcademicYear) | **GET** /academic_years/{id} | View an Academic Year
*AssemblyApi* | [**findAssessment**](docs/AssemblyApi.md#findAssessment) | **GET** /assessments/{id} | View an Assessment
*AssemblyApi* | [**findAssessmentGradeSet**](docs/AssemblyApi.md#findAssessmentGradeSet) | **GET** /assessments/{id}/grade_set | View Grade Set for an Assessment
*AssemblyApi* | [**findAssessmentPoint**](docs/AssemblyApi.md#findAssessmentPoint) | **GET** /assessment_points/{id} | View an Assessment Point
*AssemblyApi* | [**findDietaryNeed**](docs/AssemblyApi.md#findDietaryNeed) | **GET** /school/dietary_needs/{id} | View an Dietary Need
*AssemblyApi* | [**findFacet**](docs/AssemblyApi.md#findFacet) | **GET** /facets/{id} | View a Facet
*AssemblyApi* | [**findGradeSet**](docs/AssemblyApi.md#findGradeSet) | **GET** /grade_sets/{id} | View a Grade Set
*AssemblyApi* | [**findMedicalCondition**](docs/AssemblyApi.md#findMedicalCondition) | **GET** /school/medical_conditions/{id} | View an Medical Condition
*AssemblyApi* | [**findRegistrationGroup**](docs/AssemblyApi.md#findRegistrationGroup) | **GET** /registration_groups/{id} | View a Registration Group
*AssemblyApi* | [**findSchool**](docs/AssemblyApi.md#findSchool) | **GET** /school | Get School Details
*AssemblyApi* | [**findStaffMember**](docs/AssemblyApi.md#findStaffMember) | **GET** /staff_members/{id} | View a Staff Member
*AssemblyApi* | [**findStudent**](docs/AssemblyApi.md#findStudent) | **GET** /students/{id} | View a Student
*AssemblyApi* | [**findTeachingGroup**](docs/AssemblyApi.md#findTeachingGroup) | **GET** /teaching_groups/{id} | View a Teaching Group
*AssemblyApi* | [**findYearGroup**](docs/AssemblyApi.md#findYearGroup) | **GET** /year_groups/{id} | View a Year Group
*AssemblyApi* | [**getAcademicYears**](docs/AssemblyApi.md#getAcademicYears) | **GET** /academic_years | List Academic Years
*AssemblyApi* | [**getAssessmentPointResults**](docs/AssemblyApi.md#getAssessmentPointResults) | **GET** /assessment_points/{id}/results | View Results for an Assessment Point
*AssemblyApi* | [**getAssessmentPoints**](docs/AssemblyApi.md#getAssessmentPoints) | **GET** /assessment_points | List Assessment Points
*AssemblyApi* | [**getAssessmentResults**](docs/AssemblyApi.md#getAssessmentResults) | **GET** /assessments/{id}/results | View Results for an Assessment
*AssemblyApi* | [**getAssessmentSummaries**](docs/AssemblyApi.md#getAssessmentSummaries) | **GET** /attendances/summaries | List Attendance Summaries
*AssemblyApi* | [**getAssessments**](docs/AssemblyApi.md#getAssessments) | **GET** /assessments | List Assessments
*AssemblyApi* | [**getAttendances**](docs/AssemblyApi.md#getAttendances) | **GET** /attendances | List Attendances
*AssemblyApi* | [**getCalendarEvents**](docs/AssemblyApi.md#getCalendarEvents) | **GET** /calendar_events | List Calendar Events
*AssemblyApi* | [**getContacts**](docs/AssemblyApi.md#getContacts) | **GET** /contacts | List Contacts
*AssemblyApi* | [**getDietaryNeeds**](docs/AssemblyApi.md#getDietaryNeeds) | **GET** /school/dietary_needs | Dietary Needs
*AssemblyApi* | [**getExclusions**](docs/AssemblyApi.md#getExclusions) | **GET** /exclusions | List Exclusions
*AssemblyApi* | [**getFacets**](docs/AssemblyApi.md#getFacets) | **GET** /facets | List Facets
*AssemblyApi* | [**getGradeSets**](docs/AssemblyApi.md#getGradeSets) | **GET** /grade_sets | List Grade Sets
*AssemblyApi* | [**getLeftStaffMembers**](docs/AssemblyApi.md#getLeftStaffMembers) | **GET** /staff_members/left | List Left Staff Members
*AssemblyApi* | [**getLeftStudents**](docs/AssemblyApi.md#getLeftStudents) | **GET** /students/left | List Left Students
*AssemblyApi* | [**getMedicalConditions**](docs/AssemblyApi.md#getMedicalConditions) | **GET** /school/medical_conditions | Medical Conditions
*AssemblyApi* | [**getRegistrationGroupStudents**](docs/AssemblyApi.md#getRegistrationGroupStudents) | **GET** /registration_groups/{id}/students | List Students for Registration Group
*AssemblyApi* | [**getRegistrationGroups**](docs/AssemblyApi.md#getRegistrationGroups) | **GET** /registration_groups | List Registration Group
*AssemblyApi* | [**getResults**](docs/AssemblyApi.md#getResults) | **GET** /results | List Results
*AssemblyApi* | [**getStaffAbsences**](docs/AssemblyApi.md#getStaffAbsences) | **GET** /staff_absences | List Staff Absences
*AssemblyApi* | [**getStaffContracts**](docs/AssemblyApi.md#getStaffContracts) | **GET** /staff_contracts | List Staff Contracts
*AssemblyApi* | [**getStaffMembers**](docs/AssemblyApi.md#getStaffMembers) | **GET** /staff_members | List Staff Members
*AssemblyApi* | [**getStudents**](docs/AssemblyApi.md#getStudents) | **GET** /students | List Students
*AssemblyApi* | [**getSubjects**](docs/AssemblyApi.md#getSubjects) | **GET** /subjects | List Subjects
*AssemblyApi* | [**getTeachingGroupStudents**](docs/AssemblyApi.md#getTeachingGroupStudents) | **GET** /teaching_groups/{id}/students | List Students for Teaching Group
*AssemblyApi* | [**getTeachingGroups**](docs/AssemblyApi.md#getTeachingGroups) | **GET** /teaching_groups | List Teaching Groups
*AssemblyApi* | [**getYearGroupStudents**](docs/AssemblyApi.md#getYearGroupStudents) | **GET** /year_groups/{id}/students | List Students for Year Group
*AssemblyApi* | [**getYearGroups**](docs/AssemblyApi.md#getYearGroups) | **GET** /year_groups | List Year Groups
*AssemblyApi* | [**status**](docs/AssemblyApi.md#status) | **GET** /school/status | Get School Sync Status
*AssemblyApi* | [**updateResults**](docs/AssemblyApi.md#updateResults) | **PATCH** /results/{id} | Update a Single Result


## Documentation for Models

 - [AcademicYear](docs/AcademicYear.md)
 - [AcademicYearTerms](docs/AcademicYearTerms.md)
 - [Assessment](docs/Assessment.md)
 - [AssessmentMisAssessments](docs/AssessmentMisAssessments.md)
 - [AssessmentPoint](docs/AssessmentPoint.md)
 - [Attendance](docs/Attendance.md)
 - [AttendanceSummary](docs/AttendanceSummary.md)
 - [BulkResultsBody](docs/BulkResultsBody.md)
 - [CalendarEvent](docs/CalendarEvent.md)
 - [CalendarEventMisType](docs/CalendarEventMisType.md)
 - [Contact](docs/Contact.md)
 - [DietaryNeed](docs/DietaryNeed.md)
 - [Email](docs/Email.md)
 - [Exclusion](docs/Exclusion.md)
 - [Facet](docs/Facet.md)
 - [Grade](docs/Grade.md)
 - [GradeSet](docs/GradeSet.md)
 - [MedicalCondition](docs/MedicalCondition.md)
 - [MisSubject](docs/MisSubject.md)
 - [ModelApiResponse](docs/ModelApiResponse.md)
 - [RegistrationGroup](docs/RegistrationGroup.md)
 - [Result](docs/Result.md)
 - [ResultBody](docs/ResultBody.md)
 - [ResultEntry](docs/ResultEntry.md)
 - [School](docs/School.md)
 - [SchoolStatus](docs/SchoolStatus.md)
 - [SenNeed](docs/SenNeed.md)
 - [StaffAbsence](docs/StaffAbsence.md)
 - [StaffAllowance](docs/StaffAllowance.md)
 - [StaffContract](docs/StaffContract.md)
 - [StaffMember](docs/StaffMember.md)
 - [StaffMemberDemographics](docs/StaffMemberDemographics.md)
 - [StaffMemberQualificationInfo](docs/StaffMemberQualificationInfo.md)
 - [StaffQualification](docs/StaffQualification.md)
 - [StaffRole](docs/StaffRole.md)
 - [StaffSalary](docs/StaffSalary.md)
 - [Student](docs/Student.md)
 - [StudentAddress](docs/StudentAddress.md)
 - [StudentDemographics](docs/StudentDemographics.md)
 - [StudentLanguages](docs/StudentLanguages.md)
 - [StudentMedical](docs/StudentMedical.md)
 - [StudentPhoto](docs/StudentPhoto.md)
 - [Subject](docs/Subject.md)
 - [TeachingGroup](docs/TeachingGroup.md)
 - [TelephoneNumber](docs/TelephoneNumber.md)
 - [YearGroup](docs/YearGroup.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### bearerAuth

- **Type**: HTTP basic authentication


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

help@assembly.education

