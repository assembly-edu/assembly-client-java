# assembly-client-java

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
/*
 * assembly-client-java 1.1.0
 *
 * Copyright (c) 2018 Assembly
 * http://assembly.education
 * help@assembly.education
 *
 * Licensed under MIT (https://spdx.org/licenses/MIT.html)
 *
 * NOTE: This class has been automatically generated, do not edit manually.
 */


package education.assembly.platform.spring;

import education.assembly.platform.spring.*;
import education.assembly.platform.spring.models.*;
import education.assembly.platform.spring.AssemblyApi;

public class AssemblyApiExample {

    public static void main(String[] args) {
        // Optional. Send requests through Fiddler
        // Requires the Fiddler certificate in a trust store, to do this follow these instructions:
        // https://stackoverflow.com/questions/8549749/how-to-capture-https-with-fiddler-in-java#answer-8588914
        // System.setProperty("http.proxyHost", "127.0.0.1");
        // System.setProperty("https.proxyHost", "127.0.0.1");
        // System.setProperty("http.proxyPort", "8888");
        // System.setProperty("https.proxyPort", "8888");
        // System.setProperty("javax.net.ssl.trustStore", "C:\\dev\\fiddler\\FiddlerKeystore");
        // System.setProperty("javax.net.ssl.trustStorePassword", "password");

        // Create a configuration object with your credentials
        Configuration config = new Configuration(
            AssemblyEnvironment.Sandbox,
            "YOUR CLIENT ID",
            "YOUR CLIENT SECRET",
            "YOUR BASE64 ENCODED ACCESS TOKEN",
            "YOUR REFRESH TOKEN"
        );

        ApiClient client = new ApiClient(config);

        // Recommended. Set your application's name and version as the user agent, e.g.
        client.setUserAgent("AssemblyExampleClient-1.0");

        // Optional. Enable debugging
        // client.setDebugging(true);

        // Create an API instance and start using it:
        AssemblyApi api = new AssemblyApi(client);
        Integer id = 56; // Integer | id of the entity
        try {
            AcademicYear result = api.findAcademicYear(id);
            System.out.println(result);
        } catch (Exception e) {
            System.err.println("Exception when calling AssemblyApi#findAcademicYear");
            e.printStackTrace();
        }
    }
}


```

## Documentation for API Endpoints

All URIs are relative to *https://api-sandbox.assembly.education*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AssemblyApi* | [**findAcademicYear**](docs/AssemblyApi.md#findAcademicYear) | **GET** /academic_years/{id} | View an Academic Year
*AssemblyApi* | [**findAssessment**](docs/AssemblyApi.md#findAssessment) | **GET** /assessments/{id} | View an Assessment
*AssemblyApi* | [**findAssessmentGradeSet**](docs/AssemblyApi.md#findAssessmentGradeSet) | **GET** /assessments/{id}/grade_set | View Grade Set for an Assessment
*AssemblyApi* | [**findAssessmentPoint**](docs/AssemblyApi.md#findAssessmentPoint) | **GET** /assessment_points/{id} | View an Assessment Point
*AssemblyApi* | [**findFacet**](docs/AssemblyApi.md#findFacet) | **GET** /facets/{id} | View a Facet
*AssemblyApi* | [**findRegistrationGroup**](docs/AssemblyApi.md#findRegistrationGroup) | **GET** /registration_groups/{id} | View a Registration Group
*AssemblyApi* | [**findStaffMember**](docs/AssemblyApi.md#findStaffMember) | **GET** /staff_members/{id} | View a Staff Member
*AssemblyApi* | [**findStudent**](docs/AssemblyApi.md#findStudent) | **GET** /students/{id} | View a Student
*AssemblyApi* | [**findTeachingGroup**](docs/AssemblyApi.md#findTeachingGroup) | **GET** /teaching_groups/{id} | View a Teaching Group
*AssemblyApi* | [**findYearGroup**](docs/AssemblyApi.md#findYearGroup) | **GET** /year_groups/{id} | View a Year Group
*AssemblyApi* | [**getAcademicYears**](docs/AssemblyApi.md#getAcademicYears) | **GET** /academic_years | List Academic Years
*AssemblyApi* | [**getAssessmentPointResults**](docs/AssemblyApi.md#getAssessmentPointResults) | **GET** /assessment_points/{id}/results | View Results for an Assessment Point
*AssemblyApi* | [**getAssessmentPoints**](docs/AssemblyApi.md#getAssessmentPoints) | **GET** /assessment_points | List Assessment Points
*AssemblyApi* | [**getAssessmentResults**](docs/AssemblyApi.md#getAssessmentResults) | **GET** /assessments/{id}/results | View Results for an Assessment
*AssemblyApi* | [**getAssessments**](docs/AssemblyApi.md#getAssessments) | **GET** /assessments | List Assessments
*AssemblyApi* | [**getAttendances**](docs/AssemblyApi.md#getAttendances) | **GET** /attendances | List Attendances
*AssemblyApi* | [**getCalendarEvents**](docs/AssemblyApi.md#getCalendarEvents) | **GET** /calendar_events | List Calendar Events
*AssemblyApi* | [**getContacts**](docs/AssemblyApi.md#getContacts) | **GET** /contacts | List Contacts
*AssemblyApi* | [**getExclusions**](docs/AssemblyApi.md#getExclusions) | **GET** /exclusions | List Exclusions
*AssemblyApi* | [**getFacets**](docs/AssemblyApi.md#getFacets) | **GET** /facets | List Facets
*AssemblyApi* | [**getLeftStudents**](docs/AssemblyApi.md#getLeftStudents) | **GET** /students/left | List Left Students
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


## Documentation for Models

 - [AcademicYear](docs/AcademicYear.md)
 - [AcademicYearTerms](docs/AcademicYearTerms.md)
 - [Assessment](docs/Assessment.md)
 - [AssessmentMisAssessments](docs/AssessmentMisAssessments.md)
 - [AssessmentPoint](docs/AssessmentPoint.md)
 - [Attendance](docs/Attendance.md)
 - [CalendarEvent](docs/CalendarEvent.md)
 - [CalendarEventMisType](docs/CalendarEventMisType.md)
 - [Contact](docs/Contact.md)
 - [Email](docs/Email.md)
 - [Exclusion](docs/Exclusion.md)
 - [Facet](docs/Facet.md)
 - [Grade](docs/Grade.md)
 - [GradeSet](docs/GradeSet.md)
 - [MisSubject](docs/MisSubject.md)
 - [RegistrationGroup](docs/RegistrationGroup.md)
 - [Result](docs/Result.md)
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

