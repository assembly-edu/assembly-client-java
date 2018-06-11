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
        Integer page = 1; // Integer | Page number to return
        Integer perPage = 100; // Integer | Number of results to return
        try {
            AcademicYearList result = api.getAcademicYears(page, perPage);
            System.out.println(result);
        } catch (Exception e) {
            System.err.println("Exception when calling AssemblyApi#getAcademicYears");
            e.printStackTrace();
        }
    }
}


```

## Documentation for API Endpoints

All URIs are relative to *https://api-sandbox.assembly.education*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AssemblyApi* | [**getAcademicYears**](docs/AssemblyApi.md#getAcademicYears) | **GET** /academic_years | 
*AssemblyApi* | [**getAssessmentPoints**](docs/AssemblyApi.md#getAssessmentPoints) | **GET** /assessment_points | 
*AssemblyApi* | [**getAssessmentPointsAssessmentPointRank**](docs/AssemblyApi.md#getAssessmentPointsAssessmentPointRank) | **GET** /assessment_points/{assessment_point_rank} | 
*AssemblyApi* | [**getAssessmentPointsAssessmentPointRankResults**](docs/AssemblyApi.md#getAssessmentPointsAssessmentPointRankResults) | **GET** /assessment_points/{assessment_point_rank}/results | 
*AssemblyApi* | [**getAssessments**](docs/AssemblyApi.md#getAssessments) | **GET** /assessments | 
*AssemblyApi* | [**getAssessmentsAssessmentId**](docs/AssemblyApi.md#getAssessmentsAssessmentId) | **GET** /assessments/{assessment_id} | 
*AssemblyApi* | [**getAssessmentsAssessmentIdGradeSet**](docs/AssemblyApi.md#getAssessmentsAssessmentIdGradeSet) | **GET** /assessments/{assessment_id}/grade_set | 
*AssemblyApi* | [**getAssessmentsAssessmentIdResults**](docs/AssemblyApi.md#getAssessmentsAssessmentIdResults) | **GET** /assessments/{assessment_id}/results | 
*AssemblyApi* | [**getAttendances**](docs/AssemblyApi.md#getAttendances) | **GET** /attendances | 
*AssemblyApi* | [**getCalendarEvents**](docs/AssemblyApi.md#getCalendarEvents) | **GET** /calendar_events | 
*AssemblyApi* | [**getContacts**](docs/AssemblyApi.md#getContacts) | **GET** /contacts | 
*AssemblyApi* | [**getExclusions**](docs/AssemblyApi.md#getExclusions) | **GET** /exclusions | 
*AssemblyApi* | [**getExclusionsStudentId**](docs/AssemblyApi.md#getExclusionsStudentId) | **GET** /exclusions/{student_id} | 
*AssemblyApi* | [**getFacetFacetId**](docs/AssemblyApi.md#getFacetFacetId) | **GET** /facet/{facet_id} | 
*AssemblyApi* | [**getFacets**](docs/AssemblyApi.md#getFacets) | **GET** /facets | 
*AssemblyApi* | [**getRegistrationGroups**](docs/AssemblyApi.md#getRegistrationGroups) | **GET** /registration_groups | 
*AssemblyApi* | [**getRegistrationGroupsGroupId**](docs/AssemblyApi.md#getRegistrationGroupsGroupId) | **GET** /registration_groups/{group_id} | 
*AssemblyApi* | [**getRegistrationGroupsGroupIdStudents**](docs/AssemblyApi.md#getRegistrationGroupsGroupIdStudents) | **GET** /registration_groups/{group_id}/students | 
*AssemblyApi* | [**getSchoolDetails**](docs/AssemblyApi.md#getSchoolDetails) | **GET** /school_details | 
*AssemblyApi* | [**getStaffAbsences**](docs/AssemblyApi.md#getStaffAbsences) | **GET** /staff_absences | 
*AssemblyApi* | [**getStaffContracts**](docs/AssemblyApi.md#getStaffContracts) | **GET** /staff_contracts | 
*AssemblyApi* | [**getStaffContractsStaffMemberId**](docs/AssemblyApi.md#getStaffContractsStaffMemberId) | **GET** /staff_contracts/{staff_member_id} | 
*AssemblyApi* | [**getStaffMembers**](docs/AssemblyApi.md#getStaffMembers) | **GET** /staff_members | 
*AssemblyApi* | [**getStaffMembersStaffMemberId**](docs/AssemblyApi.md#getStaffMembersStaffMemberId) | **GET** /staff_members/{staff_member_id} | 
*AssemblyApi* | [**getStudents**](docs/AssemblyApi.md#getStudents) | **GET** /students | 
*AssemblyApi* | [**getStudentsStudentId**](docs/AssemblyApi.md#getStudentsStudentId) | **GET** /students/{student_id} | 
*AssemblyApi* | [**getSubjects**](docs/AssemblyApi.md#getSubjects) | **GET** /subjects | 
*AssemblyApi* | [**getTeachingGroups**](docs/AssemblyApi.md#getTeachingGroups) | **GET** /teaching_groups | 
*AssemblyApi* | [**getTeachingGroupsGroupId**](docs/AssemblyApi.md#getTeachingGroupsGroupId) | **GET** /teaching_groups/{group_id} | 
*AssemblyApi* | [**getTeachingGroupsGroupIdStudents**](docs/AssemblyApi.md#getTeachingGroupsGroupIdStudents) | **GET** /teaching_groups/{group_id}/students | 
*AssemblyApi* | [**getYearGroups**](docs/AssemblyApi.md#getYearGroups) | **GET** /year_groups | 
*AssemblyApi* | [**getYearGroupsGroupId**](docs/AssemblyApi.md#getYearGroupsGroupId) | **GET** /year_groups/{group_id} | 
*AssemblyApi* | [**getYearGroupsGroupIdStudents**](docs/AssemblyApi.md#getYearGroupsGroupIdStudents) | **GET** /year_groups/{group_id}/students | 
*AssemblyApi* | [**patchResults**](docs/AssemblyApi.md#patchResults) | **PATCH** /results | 
*AssemblyApi* | [**patchResultsResultId**](docs/AssemblyApi.md#patchResultsResultId) | **PATCH** /results/{result_id} | 


## Documentation for Models

 - [AcademicYear](docs/AcademicYear.md)
 - [AcademicYearList](docs/AcademicYearList.md)
 - [AcademicYearListData](docs/AcademicYearListData.md)
 - [AcademicYearTerms](docs/AcademicYearTerms.md)
 - [Assessment](docs/Assessment.md)
 - [AssessmentList](docs/AssessmentList.md)
 - [AssessmentListData](docs/AssessmentListData.md)
 - [AssessmentPoint](docs/AssessmentPoint.md)
 - [AssessmentPointList](docs/AssessmentPointList.md)
 - [AssessmentPointListData](docs/AssessmentPointListData.md)
 - [Attendance](docs/Attendance.md)
 - [AttendanceList](docs/AttendanceList.md)
 - [AttendanceListData](docs/AttendanceListData.md)
 - [CalendarEvent](docs/CalendarEvent.md)
 - [CalendarEventList](docs/CalendarEventList.md)
 - [CalendarEventListData](docs/CalendarEventListData.md)
 - [CalendarEventMisType](docs/CalendarEventMisType.md)
 - [Contact](docs/Contact.md)
 - [ContactEmails](docs/ContactEmails.md)
 - [ContactList](docs/ContactList.md)
 - [ContactListData](docs/ContactListData.md)
 - [ContactRelationship](docs/ContactRelationship.md)
 - [ContactStudents](docs/ContactStudents.md)
 - [ContactTelephoneNumbers](docs/ContactTelephoneNumbers.md)
 - [CreateResultPayload](docs/CreateResultPayload.md)
 - [CreateResultPayloadList](docs/CreateResultPayloadList.md)
 - [CreateResultPayloadListData](docs/CreateResultPayloadListData.md)
 - [CreateResultPayloadResults](docs/CreateResultPayloadResults.md)
 - [CreateResultResponse](docs/CreateResultResponse.md)
 - [CreateResultResponseList](docs/CreateResultResponseList.md)
 - [CreateResultResponseListData](docs/CreateResultResponseListData.md)
 - [Error](docs/Error.md)
 - [ErrorData](docs/ErrorData.md)
 - [ErrorRateLimit](docs/ErrorRateLimit.md)
 - [Exclusion](docs/Exclusion.md)
 - [ExclusionList](docs/ExclusionList.md)
 - [ExclusionListData](docs/ExclusionListData.md)
 - [Facet](docs/Facet.md)
 - [FacetList](docs/FacetList.md)
 - [FacetListData](docs/FacetListData.md)
 - [Gradeset](docs/Gradeset.md)
 - [GradesetGrades](docs/GradesetGrades.md)
 - [GradesetList](docs/GradesetList.md)
 - [GradesetListData](docs/GradesetListData.md)
 - [Oauth](docs/Oauth.md)
 - [RegistrationGroup](docs/RegistrationGroup.md)
 - [RegistrationGroupList](docs/RegistrationGroupList.md)
 - [RegistrationGroupListData](docs/RegistrationGroupListData.md)
 - [Result](docs/Result.md)
 - [ResultList](docs/ResultList.md)
 - [SchoolDetails](docs/SchoolDetails.md)
 - [SchoolDetailsList](docs/SchoolDetailsList.md)
 - [SchoolDetailsListData](docs/SchoolDetailsListData.md)
 - [StaffAbsence](docs/StaffAbsence.md)
 - [StaffAbsenceList](docs/StaffAbsenceList.md)
 - [StaffAbsenceListData](docs/StaffAbsenceListData.md)
 - [StaffContract](docs/StaffContract.md)
 - [StaffContractAllowances](docs/StaffContractAllowances.md)
 - [StaffContractList](docs/StaffContractList.md)
 - [StaffContractListData](docs/StaffContractListData.md)
 - [StaffContractRoles](docs/StaffContractRoles.md)
 - [StaffContractSalaries](docs/StaffContractSalaries.md)
 - [StaffMember](docs/StaffMember.md)
 - [StaffMemberDemographics](docs/StaffMemberDemographics.md)
 - [StaffMemberList](docs/StaffMemberList.md)
 - [StaffMemberListData](docs/StaffMemberListData.md)
 - [StaffMemberQualificationInfo](docs/StaffMemberQualificationInfo.md)
 - [StaffMemberQualificationInfoQualifications](docs/StaffMemberQualificationInfoQualifications.md)
 - [Student](docs/Student.md)
 - [StudentAddresses](docs/StudentAddresses.md)
 - [StudentDemographics](docs/StudentDemographics.md)
 - [StudentDemographicsSenNeeds](docs/StudentDemographicsSenNeeds.md)
 - [StudentLanguages](docs/StudentLanguages.md)
 - [StudentList](docs/StudentList.md)
 - [StudentListData](docs/StudentListData.md)
 - [Subject](docs/Subject.md)
 - [SubjectList](docs/SubjectList.md)
 - [SubjectListData](docs/SubjectListData.md)
 - [SubjectMisSubjects](docs/SubjectMisSubjects.md)
 - [TeachingGroup](docs/TeachingGroup.md)
 - [TeachingGroupList](docs/TeachingGroupList.md)
 - [TeachingGroupListData](docs/TeachingGroupListData.md)
 - [TeachingGroupSubject](docs/TeachingGroupSubject.md)
 - [UpdateMultipleResultPayload](docs/UpdateMultipleResultPayload.md)
 - [UpdateMultipleResultPayloadList](docs/UpdateMultipleResultPayloadList.md)
 - [UpdateMultipleResultPayloadListData](docs/UpdateMultipleResultPayloadListData.md)
 - [UpdateMultipleResultResponse](docs/UpdateMultipleResultResponse.md)
 - [UpdateMultipleResultResponseList](docs/UpdateMultipleResultResponseList.md)
 - [UpdateMultipleResultResponseListData](docs/UpdateMultipleResultResponseListData.md)
 - [UpdateResultResponse](docs/UpdateResultResponse.md)
 - [UpdateResultResponseList](docs/UpdateResultResponseList.md)
 - [UpdateResultResponseListData](docs/UpdateResultResponseListData.md)
 - [YearGroup](docs/YearGroup.md)
 - [YearGroupList](docs/YearGroupList.md)
 - [YearGroupListData](docs/YearGroupListData.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### oauth2

- **Type**: OAuth
- **Flow**: accessCode
- **Authorization URL**: https://platform-sandbox.assembly.education/oauth/authorize
- **Scopes**: 
  - school: This includes school level information that is generally publicly available or non-sensitive. Examples include the school&#39;s name, URN and subject list.
  - calendar: Calendar events from the school&#39;s MIS calendar, as well as details of term dates (currently available on SIMS only).
  - registration_groups: Provides access to a school &#39;s registration groups.
  - teaching_groups: Provides access to teaching group names and subjects. What teaching groups we pull from your MIS is governed by the subject mappings you have configured within the Assembly Platform.
  - students.basic: Provides access to basic student information (for example first name, last name and year group).
  - students.middle_names: Provides access to student middle names.
  - students.legal_names: Provides access to student legal names.
  - students.former_names: Provides access to student former names.
  - students.upn: Provides access to unique pupil numbersfor students.
  - students.former_upn: Provides access to any former unique pupil numbersfor students.
  - students.dates: Provides access to student start and end dates.
  - students.dob: Provides access to dates of birthfor students.
  - students.enrolment_status: Provides access to the enrolment status of students.
  - students.pan: Provides access to student pupil admission numbers.
  - students.mis_id: Provides access to the MIS identifierfor students.
  - students.gender: Provides access to the gender of students.
  - students.country_of_birth: Provides access to the country of birthfor students.
  - students.nationality: Provides access to student nationalities.
  - students.ethnicity: Provides access to the ethnicity of students.
  - students.first_language: Provides access to the first languagefor students.
  - students.home_language: Provides access to the home languagefor students.
  - students.proficiency_in_eng: Provides access to proficiency in Englishfor students.
  - students.eal: Provides access to the English as Additional Language statusfor students.
  - students.pp: Provides access to the pupil premium status of students.
  - students.fsm: Provides access to the free school meal statusfor students.
  - students.fsm_review_dates: Provides access to the review datefor student free school meal eligibility.
  - students.care: Provides access to the in care or &#39;looked after&#39; statusfor students.
  - students.sen_provision: Provides access to special education need provisionfor students.
  - students.sen_needs: Provides access to special education needsfor students.
  - students.addresses: Provides access to student home addresses and postcodes.
  - students.photo: Provides access to student photos.
  - contacts.basic: Provides access to basic contact information(for example first name,last name,title and relationship to students).
  - contacts.middle_names: Provides access to contact middle names.
  - contacts.emails: Provides access to contact email addresses.
  - contacts.gender: Provides access to the gender of contacts.
  - contacts.parental_responsibility: Provides access to the parental responsibility flagfor contacts.
  - contacts.priority: Provides access to the priority of contacts.
  - contacts.telephone_numbers: Provides access to contact telephone numbers.
  - staff_members.basic: Provides access to basic staff member information (for example staff code,first name,last name and title).
  - staff_members.middle_names: Provides access to staff member middle names.
  - staff_members.legal_names: Provides access to staff member legal names.
  - staff_members.former_names: Provides access to the former names of staff members.
  - staff_members.dates: Provides access to staff member start and end dates.
  - staff_members.included_in_census: The scope provides access to whether or not staff members are included in the School Workforce Census.
  - staff_members.teaching_status: Provides access to the teaching status of staff members.
  - staff_members.mis_id: Provides access to the MIS identifierfor staff members.
  - staff_members.dob: Provides access to dates of birthfor staff members.
  - staff_members.gender: Provides access to the gender of staff members.
  - staff_members.ethnicity: Provides access to the ethnicity of staff members.
  - staff_members.disability: Provides access to the disability status of staff members.
  - staff_members.emails: Provides access to staff member email addresses.
  - staff_members.absences: Provides access to staff member absences.
  - staff_members.qualifications: Provides access to staff member qualifications (for example teacher number, QT status, HLTA status and degree information).
  - staff_members.contracts: Provides access to staff contract information (for example NI number, payroll number, contract type, post and roles).No salary information is extracted with this scope.
  - staff_members.salaries: Provides access to staff member salaries and allowances (for example pay scale, pay framework and additional payment amount).
  - attendances: Provides access to morning and afternoon attendance marks (AM / PM roll call).
  - exclusions: Official student exclusions stored in the MIS.
  - assessments.national: Provides access to students&#39; national assessment results (for example, Key  Stage 2 SATs results).
  - assessments.internal: Provides access to the school&#39;s internal assessments.What results are exported is governed by the assessment mappings that you have configured on the Assembly Platform.
  - assessments.write: This scope allows an application to store its assessment data securely in the Assembly platform so that you can use it laterfor analytics tools.


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

help@assembly.education

