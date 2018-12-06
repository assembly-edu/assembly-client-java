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
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "education.assembly:assembly-client-java:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/assembly-client-java-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
/*
 * assembly-client-java 1.0.0
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
            AcademicYear result = api.find(id);
            System.out.println(result);
        } catch (Exception e) {
            System.err.println("Exception when calling AssemblyApi#find");
            e.printStackTrace();
        }
    }
}


```

## Documentation for API Endpoints

All URIs are relative to *https://api-sandbox.assembly.education*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AssemblyApi* | [**find**](docs/AssemblyApi.md#find) | **GET** /academic_years/{id} | View an Academic Year
*AssemblyApi* | [**find_0**](docs/AssemblyApi.md#find_0) | **GET** /assessment_points/{id} | View an Assessment Point
*AssemblyApi* | [**find_1**](docs/AssemblyApi.md#find_1) | **GET** /assessments/{id} | View an Assessment
*AssemblyApi* | [**find_2**](docs/AssemblyApi.md#find_2) | **GET** /facets/{id} | View a Facet
*AssemblyApi* | [**find_3**](docs/AssemblyApi.md#find_3) | **GET** /registration_groups/{id} | View a Registration Group
*AssemblyApi* | [**find_4**](docs/AssemblyApi.md#find_4) | **GET** /staff_members/{id} | View a Staff Member
*AssemblyApi* | [**find_5**](docs/AssemblyApi.md#find_5) | **GET** /students/{id} | View a Student
*AssemblyApi* | [**find_6**](docs/AssemblyApi.md#find_6) | **GET** /teaching_groups/{id} | View a Teaching Group
*AssemblyApi* | [**find_7**](docs/AssemblyApi.md#find_7) | **GET** /year_groups/{id} | View a Year Group
*AssemblyApi* | [**get**](docs/AssemblyApi.md#get) | **GET** /academic_years | List Academic Years
*AssemblyApi* | [**get_0**](docs/AssemblyApi.md#get_0) | **GET** /assessment_points | List Assessment Points
*AssemblyApi* | [**get_1**](docs/AssemblyApi.md#get_1) | **GET** /assessments | List Assessments
*AssemblyApi* | [**get_10**](docs/AssemblyApi.md#get_10) | **GET** /staff_contracts | List Staff Contracts
*AssemblyApi* | [**get_11**](docs/AssemblyApi.md#get_11) | **GET** /staff_members | List Staff Members
*AssemblyApi* | [**get_12**](docs/AssemblyApi.md#get_12) | **GET** /students | List Students
*AssemblyApi* | [**get_13**](docs/AssemblyApi.md#get_13) | **GET** /subjects | List Subjects
*AssemblyApi* | [**get_14**](docs/AssemblyApi.md#get_14) | **GET** /teaching_groups | List Teaching Groups
*AssemblyApi* | [**get_15**](docs/AssemblyApi.md#get_15) | **GET** /year_groups | List Year Groups
*AssemblyApi* | [**get_2**](docs/AssemblyApi.md#get_2) | **GET** /attendances | List Attendances
*AssemblyApi* | [**get_3**](docs/AssemblyApi.md#get_3) | **GET** /calendar_events | List Calendar Events
*AssemblyApi* | [**get_4**](docs/AssemblyApi.md#get_4) | **GET** /contacts | List Contacts
*AssemblyApi* | [**get_5**](docs/AssemblyApi.md#get_5) | **GET** /exclusions | List Exclusions
*AssemblyApi* | [**get_6**](docs/AssemblyApi.md#get_6) | **GET** /facets | List Facets
*AssemblyApi* | [**get_7**](docs/AssemblyApi.md#get_7) | **GET** /registration_groups | List Registration Group
*AssemblyApi* | [**get_8**](docs/AssemblyApi.md#get_8) | **GET** /results | List Results
*AssemblyApi* | [**get_9**](docs/AssemblyApi.md#get_9) | **GET** /staff_absences | List Staff Absences
*AssemblyApi* | [**gradeSet**](docs/AssemblyApi.md#gradeSet) | **GET** /assessments/{id}/grade_set | View Grade Set for an Assessment
*AssemblyApi* | [**left**](docs/AssemblyApi.md#left) | **GET** /students/left | List Left Students
*AssemblyApi* | [**results**](docs/AssemblyApi.md#results) | **GET** /assessment_points/{id}/results | View Results for an Assessment Point
*AssemblyApi* | [**results_0**](docs/AssemblyApi.md#results_0) | **GET** /assessments/{id}/results | View Results for an Assessment
*AssemblyApi* | [**show**](docs/AssemblyApi.md#show) | **GET** /school_details | List School Details
*AssemblyApi* | [**students**](docs/AssemblyApi.md#students) | **GET** /registration_groups/{id}/students | List Students for Registration Group
*AssemblyApi* | [**students_0**](docs/AssemblyApi.md#students_0) | **GET** /teaching_groups/{id}/students | List Students for Teaching Group
*AssemblyApi* | [**students_1**](docs/AssemblyApi.md#students_1) | **GET** /year_groups/{id}/students | List Students for Year Group


## Documentation for Models

 - [AcademicYear](docs/AcademicYear.md)
 - [AcademicYearTerms](docs/AcademicYearTerms.md)
 - [Assessment](docs/Assessment.md)
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
 - [SchoolDetails](docs/SchoolDetails.md)
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

