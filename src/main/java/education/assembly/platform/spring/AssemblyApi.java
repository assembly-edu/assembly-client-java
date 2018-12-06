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

import education.assembly.platform.spring.ApiClient;

import education.assembly.platform.spring.models.AcademicYear;
import education.assembly.platform.spring.models.Assessment;
import education.assembly.platform.spring.models.AssessmentPoint;
import education.assembly.platform.spring.models.Attendance;
import education.assembly.platform.spring.models.CalendarEvent;
import education.assembly.platform.spring.models.Contact;
import education.assembly.platform.spring.models.Exclusion;
import education.assembly.platform.spring.models.Facet;
import education.assembly.platform.spring.models.GradeSet;
import org.threeten.bp.OffsetDateTime;
import education.assembly.platform.spring.models.RegistrationGroup;
import education.assembly.platform.spring.models.Result;
import education.assembly.platform.spring.models.StaffAbsence;
import education.assembly.platform.spring.models.StaffContract;
import education.assembly.platform.spring.models.StaffMember;
import education.assembly.platform.spring.models.Student;
import education.assembly.platform.spring.models.Subject;
import education.assembly.platform.spring.models.TeachingGroup;
import education.assembly.platform.spring.models.YearGroup;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;


@Component("education.assembly.platform.spring.AssemblyApi")
public class AssemblyApi {
    private ApiClient apiClient;

    @Autowired
    public AssemblyApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * View an Academic Year
     * Returns a single academic year for the school associated with the provided access_token.
     * <p><b>200</b> - success
     * <p><b>404</b> - { \&quot;message\&quot;: \&quot;not found\&quot; }
     * @param id id of the entity
     * @return AcademicYear
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public AcademicYear findAcademicYear(Integer id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling findAcademicYear");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/academic_years/{id}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/vnd.assembly+json; version=1.1"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<AcademicYear> returnType = new ParameterizedTypeReference<AcademicYear>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * View an Assessment
     * Returns a single assessment for the given id.
     * <p><b>200</b> - success
     * <p><b>404</b> - { \&quot;message\&quot;: \&quot;not found\&quot; }
     * @param id id of the entity
     * @return Assessment
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Assessment findAssessment(Integer id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling findAssessment");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/assessments/{id}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/vnd.assembly+json; version=1.1"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<Assessment> returnType = new ParameterizedTypeReference<Assessment>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * View Grade Set for an Assessment
     * Returns a grade_set (an acceptable list of values) for the assessment identified by the assessment_id. Grades should be written back to the Platform using the grade_id.
     * <p><b>200</b> - success
     * @param id id of the entity
     * @return GradeSet
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GradeSet findAssessmentGradeSet(Integer id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling findAssessmentGradeSet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/assessments/{id}/grade_set").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/vnd.assembly+json; version=1.1"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<GradeSet> returnType = new ParameterizedTypeReference<GradeSet>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * View an Assessment Point
     * Returns a single assessment point for the given rank.
     * <p><b>200</b> - success
     * <p><b>404</b> - { \&quot;message\&quot;: \&quot;not found\&quot; }
     * @param id id of the entity
     * @return AssessmentPoint
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public AssessmentPoint findAssessmentPoint(Integer id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling findAssessmentPoint");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/assessment_points/{id}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/vnd.assembly+json; version=1.1"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<AssessmentPoint> returnType = new ParameterizedTypeReference<AssessmentPoint>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * View a Facet
     * Returns a single facet for the given id.
     * <p><b>200</b> - success
     * <p><b>404</b> - { \&quot;message\&quot;: \&quot;not found\&quot; }
     * @param id id of the entity
     * @return Facet
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Facet findFacet(Integer id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling findFacet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/facets/{id}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/vnd.assembly+json; version=1.1"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<Facet> returnType = new ParameterizedTypeReference<Facet>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * View a Registration Group
     * Returns a list of registration groups that match the given set of filters.
     * <p><b>200</b> - success
     * <p><b>404</b> - { \&quot;message\&quot;: \&quot;not found\&quot; }
     * @param id id of the entity
     * @param date returns results for a specific date
     * @param academicYearId returns all groups and group memberships from the specified academic year
     * @return RegistrationGroup
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public RegistrationGroup findRegistrationGroup(Integer id, OffsetDateTime date, Integer academicYearId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling findRegistrationGroup");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/registration_groups/{id}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "date", date));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "academic_year_id", academicYearId));

        final String[] accepts = { 
            "application/vnd.assembly+json; version=1.1"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<RegistrationGroup> returnType = new ParameterizedTypeReference<RegistrationGroup>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * View a Staff Member
     * Returns an individual staff member record for the given ID.  **Note:** Note the &#x60;If-Modified-Since&#x60; header is optional (see the page on [Conditional Requests](/api#conditional-requests) for more details). 
     * <p><b>200</b> - success
     * <p><b>404</b> - { \&quot;message\&quot;: \&quot;not found\&quot; }
     * @param id id of the entity
     * @param demographics include demographics data
     * @param qualifications include HLTA status, QT status, QT route and previous degree information (requires &#x60;staff_members.qualifications&#x60; scope)
     * @return StaffMember
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public StaffMember findStaffMember(Integer id, Boolean demographics, Boolean qualifications) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling findStaffMember");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/staff_members/{id}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "demographics", demographics));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "qualifications", qualifications));

        final String[] accepts = { 
            "application/vnd.assembly+json; version=1.1"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<StaffMember> returnType = new ParameterizedTypeReference<StaffMember>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * View a Student
     * Returns an individual student record for the given ID.  **Note:** the response shown includes student demographics, contacts, student SEN needs, student addresses, photo and student care data but these will only be present if you have permission to access it and pass &#x60;demographics&#x60;, &#x60;contacts&#x60;, &#x60;sen_needs&#x60;, &#x60;addresses&#x60;, &#x60;photo&#x60;, &#x60;care&#x60; and &#x60;ever_in_care&#x60; respectively  **Note:** Note the &#x60;If-Modified-Since&#x60; header is optional (see the page on [Conditional Requests](/api#conditional-requests) for more details).  ### Photo Notes When requesting photo information the response includes a &#x60;photo.url&#x60; property, this URL should be treated as confidential and used to download the students photo to your storage system of choice. The URL is *not designed for hotlinking directly in the browser* for end users. URLs are signed and only valid for 1 hour after which time you will receive a 400 error.  Once downloaded to avoid repeatedly syncing unchanged photos you should code your application to compare the &#x60;photo.hash&#x60; property to detect changes in student photos since your last sync, it is guaranteed that changes in a photo will change the hash, however the hash is only intended to be used to detect photo changes and is not guaranteed to match a checksum of the files contents.  Photos are currently provided on an \&quot;as is\&quot; basis straight from the source MIS, this means the format, quality, metadata and dimensions are not guaranteed. We reserve the right to normalise this data in the future but your application should be resistant to differing photo formats. 
     * <p><b>200</b> - success
     * <p><b>404</b> - { \&quot;message\&quot;: \&quot;not found\&quot; }
     * @param id id of the entity
     * @param demographics include demographics data
     * @param contacts include contacts data
     * @param senNeeds include SEN needs data
     * @param addresses include student address data
     * @param care include student care data (you must also supply the demographics parameter)
     * @param everInCare include whether the student has ever been in care (you must also supply the demographics parameter)
     * @param languages include student language data
     * @param photo include student photo data
     * @return Student
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Student findStudent(Integer id, Boolean demographics, Boolean contacts, Boolean senNeeds, Boolean addresses, Boolean care, Boolean everInCare, Boolean languages, Boolean photo) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling findStudent");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/students/{id}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "demographics", demographics));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "contacts", contacts));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "sen_needs", senNeeds));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "addresses", addresses));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "care", care));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "ever_in_care", everInCare));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "languages", languages));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "photo", photo));

        final String[] accepts = { 
            "application/vnd.assembly+json; version=1.1"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<Student> returnType = new ParameterizedTypeReference<Student>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * View a Teaching Group
     * Returns a list of teaching groups that match the given set of filters.
     * <p><b>200</b> - success
     * <p><b>404</b> - { \&quot;message\&quot;: \&quot;not found\&quot; }
     * @param id id of the entity
     * @param date returns results for a specific date
     * @param academicYearId returns all groups and group memberships from the specified academic year
     * @param groupId a group_id to filter by
     * @return TeachingGroup
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TeachingGroup findTeachingGroup(Integer id, OffsetDateTime date, Integer academicYearId, Integer groupId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling findTeachingGroup");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/teaching_groups/{id}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "date", date));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "academic_year_id", academicYearId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "group_id", groupId));

        final String[] accepts = { 
            "application/vnd.assembly+json; version=1.1"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<TeachingGroup> returnType = new ParameterizedTypeReference<TeachingGroup>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * View a Year Group
     * Returns a list of year groups that match the given set of filters.
     * <p><b>200</b> - success
     * <p><b>404</b> - { \&quot;message\&quot;: \&quot;not found\&quot; }
     * @param id id of the entity
     * @param date returns results for a specific date
     * @param academicYearId returns all groups and group memberships from the specified academic year
     * @return YearGroup
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public YearGroup findYearGroup(Integer id, OffsetDateTime date, Integer academicYearId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling findYearGroup");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/year_groups/{id}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "date", date));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "academic_year_id", academicYearId));

        final String[] accepts = { 
            "application/vnd.assembly+json; version=1.1"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<YearGroup> returnType = new ParameterizedTypeReference<YearGroup>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * List Academic Years
     * Returns a list of academic years for the school associated with the provided access_token. The dates of these academic years can be used to filter data in other API endpoints.
     * <p><b>200</b> - success
     * @param perPage Number of results to return
     * @param page Page number to return
     * @return List&lt;AcademicYear&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<AcademicYear> getAcademicYears(Integer perPage, Integer page) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/academic_years").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "per_page", perPage));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));

        final String[] accepts = { 
            "application/vnd.assembly+json; version=1.1"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<List<AcademicYear>> returnType = new ParameterizedTypeReference<List<AcademicYear>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * View Results for an Assessment Point
     * Returns a list of results for the given assessment_point_rank and students.
     * <p><b>200</b> - success
     * @param id id of the entity
     * @param students ID(s) of the student(s) as an Integer. Multiple IDs can be separated with a space (so a + URL encoded).
     * @param assessmentPointRank the Assessment Point rank
     * @return List&lt;Result&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Result> getAssessmentPointResults(Integer id, List<Integer> students, Integer assessmentPointRank) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getAssessmentPointResults");
        }
        
        // verify the required parameter 'students' is set
        if (students == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'students' when calling getAssessmentPointResults");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/assessment_points/{id}/results").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "assessment_point_rank", assessmentPointRank));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase()), "students[]", students));

        final String[] accepts = { 
            "application/vnd.assembly+json; version=1.1"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<List<Result>> returnType = new ParameterizedTypeReference<List<Result>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * List Assessment Points
     * Returns a list of assessment points. An assessment_point object represents a point in the school key stage, year, term or half-term that results can be attached to. When sending results back to the Platform, the assessment_point_rank should be used - this will remain constant across all environments.
     * <p><b>200</b> - success
     * @param perPage Number of results to return
     * @param page Page number to return
     * @return List&lt;AssessmentPoint&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<AssessmentPoint> getAssessmentPoints(Integer perPage, Integer page) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/assessment_points").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "per_page", perPage));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));

        final String[] accepts = { 
            "application/vnd.assembly+json; version=1.1"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<List<AssessmentPoint>> returnType = new ParameterizedTypeReference<List<AssessmentPoint>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * View Results for an Assessment
     * Returns a list of results for the given assessment_id and students. For a full list of national assessment data (Key stage 1 and 2 SATs results) available on the Platform, please see this support article.
     * <p><b>200</b> - success
     * @param id id of the entity
     * @param students ID(s) of the student(s) as an Integer. Multiple IDs can be separated with a space (so a + URL encoded).
     * @return List&lt;Result&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Result> getAssessmentResults(Integer id, List<Integer> students) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getAssessmentResults");
        }
        
        // verify the required parameter 'students' is set
        if (students == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'students' when calling getAssessmentResults");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/assessments/{id}/results").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase()), "students[]", students));

        final String[] accepts = { 
            "application/vnd.assembly+json; version=1.1"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<List<Result>> returnType = new ParameterizedTypeReference<List<Result>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * List Assessments
     * Returns a list of assessment objects. The assessment is the grouping that knits together a range of concepts. The name of the assessment also refers to the source of the result.
     * <p><b>200</b> - success
     * @param perPage Number of results to return
     * @param page Page number to return
     * @return List&lt;Assessment&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Assessment> getAssessments(Integer perPage, Integer page) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/assessments").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "per_page", perPage));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));

        final String[] accepts = { 
            "application/vnd.assembly+json; version=1.1"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<List<Assessment>> returnType = new ParameterizedTypeReference<List<Assessment>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * List Attendances
     * Returns a list of attendances. By default, attendances are returned from the start to the end of the current week.  **Note:** Note the &#x60;If-Modified-Since&#x60; header is optional (see the page on [Conditional Requests](/api#conditional-requests) for more details). 
     * <p><b>200</b> - success
     * @param studentId a student_id to filter by
     * @param registrationGroupId id of a registration group
     * @param startDate the start date of the period to query
     * @param endDate the end date of the period to query
     * @param perPage Number of results to return
     * @param page Page number to return
     * @return List&lt;Attendance&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Attendance> getAttendances(Integer studentId, Integer registrationGroupId, OffsetDateTime startDate, OffsetDateTime endDate, Integer perPage, Integer page) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/attendances").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "student_id", studentId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "registration_group_id", registrationGroupId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "start_date", startDate));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "end_date", endDate));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "per_page", perPage));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));

        final String[] accepts = { 
            "application/vnd.assembly+json; version=1.1"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<List<Attendance>> returnType = new ParameterizedTypeReference<List<Attendance>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * List Calendar Events
     * Returns a list of calendar events from the school calendar. We strongly recommend that you use an object type to filter the events that will be returned to you. Presently, with SIMS only support, we&#39;ve exposed the raw types from the underlying MIS. As such, it&#39;s most likely that you&#39;ll mostly be interested in &#39;User&#39; events. This category includes items such as staff meetings and school assembly times as you can see from the sample response below.  **Note:** Note the &#x60;If-Modified-Since&#x60; header is optional (see the page on [Conditional Requests](/api#conditional-requests) for more details). 
     * <p><b>200</b> - success
     * @param eventType a calendar object type from the underlying MIS
     * @param perPage Number of results to return
     * @param page Page number to return
     * @return List&lt;CalendarEvent&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<CalendarEvent> getCalendarEvents(String eventType, Integer perPage, Integer page) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/calendar_events").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "event_type", eventType));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "per_page", perPage));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));

        final String[] accepts = { 
            "application/vnd.assembly+json; version=1.1"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<List<CalendarEvent>> returnType = new ParameterizedTypeReference<List<CalendarEvent>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * List Contacts
     * Returns a list of contacts that match the given set of filters.
     * <p><b>200</b> - success
     * @param studentId a student_id to filter by
     * @param perPage Number of results to return
     * @param page Page number to return
     * @return List&lt;Contact&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Contact> getContacts(Integer studentId, Integer perPage, Integer page) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/contacts").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "student_id", studentId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "per_page", perPage));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));

        final String[] accepts = { 
            "application/vnd.assembly+json; version=1.1"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<List<Contact>> returnType = new ParameterizedTypeReference<List<Contact>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * List Exclusions
     * Returns a list of exclusions. *By default, exclusions are returned that occurred during the current academic year.*
     * <p><b>200</b> - success
     * @param studentId a student_id to filter by
     * @param startDate the start date of the period to query
     * @param endDate the end date of the period to query
     * @param perPage Number of results to return
     * @param page Page number to return
     * @return List&lt;Exclusion&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Exclusion> getExclusions(Integer studentId, OffsetDateTime startDate, OffsetDateTime endDate, Integer perPage, Integer page) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/exclusions").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "student_id", studentId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "start_date", startDate));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "end_date", endDate));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "per_page", perPage));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));

        final String[] accepts = { 
            "application/vnd.assembly+json; version=1.1"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<List<Exclusion>> returnType = new ParameterizedTypeReference<List<Exclusion>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * List Facets
     * Returns a list of facets. The facet is used to reflect a different type of grade and allows 2 grades of the same assessment to be compared.
     * <p><b>200</b> - success
     * @param perPage Number of results to return
     * @param page Page number to return
     * @return List&lt;Facet&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Facet> getFacets(Integer perPage, Integer page) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/facets").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "per_page", perPage));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));

        final String[] accepts = { 
            "application/vnd.assembly+json; version=1.1"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<List<Facet>> returnType = new ParameterizedTypeReference<List<Facet>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * List Left Students
     * Returns a list of students who have left the school.&lt;br&gt;&lt;br&gt;**Note:** This will include any students who have left the school during the current academic year. If the school has been connected to Assembly for more than one academic year, all left students will be returned. The &#x60;If-Modified-Since&#x60; header is optional (see the page on [Conditional Requests](/api#conditional-requests) for more details).
     * <p><b>200</b> - success
     * @param ifModifiedSince If-Modified-Since is optional (see the page on Conditional Requests for more details).
     * @return List&lt;Student&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Student> getLeftStudents(OffsetDateTime ifModifiedSince) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/students/left").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (ifModifiedSince != null)
        headerParams.add("If-Modified-Since", apiClient.parameterToString(ifModifiedSince));

        final String[] accepts = { 
            "application/vnd.assembly+json; version=1.1"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<List<Student>> returnType = new ParameterizedTypeReference<List<Student>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * List Students for Registration Group
     * Returns a list of all the students that are present in the registration group identified by group_id.  **Note:** Note the &#x60;If-Modified-Since&#x60; header is optional (see the page on [Conditional Requests](/api#conditional-requests) for more details). 
     * <p><b>200</b> - success
     * @param id id of the entity
     * @param ifModifiedSince If-Modified-Since is optional (see the page on Conditional Requests for more details).
     * @param date returns results for a specific date
     * @param academicYearId returns all groups and group memberships from the specified academic year
     * @param demographics include demographics data
     * @param contacts include contacts data
     * @param senNeeds include SEN needs data
     * @param addresses include student address data
     * @param care include student care data (you must also supply the demographics parameter)
     * @param everInCare include whether the student has ever been in care (you must also supply the demographics parameter)
     * @param languages include student language data
     * @param photo include student photo data
     * @return List&lt;Student&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Student> getRegistrationGroupStudents(Integer id, OffsetDateTime ifModifiedSince, OffsetDateTime date, Integer academicYearId, Boolean demographics, Boolean contacts, Boolean senNeeds, Boolean addresses, Boolean care, Boolean everInCare, Boolean languages, Boolean photo) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getRegistrationGroupStudents");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/registration_groups/{id}/students").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "date", date));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "academic_year_id", academicYearId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "demographics", demographics));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "contacts", contacts));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "sen_needs", senNeeds));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "addresses", addresses));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "care", care));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "ever_in_care", everInCare));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "languages", languages));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "photo", photo));

        if (ifModifiedSince != null)
        headerParams.add("If-Modified-Since", apiClient.parameterToString(ifModifiedSince));

        final String[] accepts = { 
            "application/vnd.assembly+json; version=1.1"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<List<Student>> returnType = new ParameterizedTypeReference<List<Student>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * List Registration Group
     * Returns a list of registration groups that match the given set of filters.  If a date parameter is provided then the list of groups returned is filtered to only those where the provided date falls between the groups start_date and end_date. Additionally when a date parameter is provided student_ids and supervior_ids are restricted to only those students who were enrolled in the group on the given date.  **Note:** Note the &#x60;If-Modified-Since&#x60; header is optional (see the page on [Conditional Requests](/api#conditional-requests) for more details). 
     * <p><b>200</b> - success
     * @param ifModifiedSince If-Modified-Since is optional (see the page on Conditional Requests for more details).
     * @param yearCode filter by school year (cannot be supplied at the same time as the students parameter)
     * @param date returns results for a specific date
     * @param academicYearId returns all groups and group memberships from the specified academic year
     * @param perPage Number of results to return
     * @param page Page number to return
     * @return List&lt;RegistrationGroup&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<RegistrationGroup> getRegistrationGroups(OffsetDateTime ifModifiedSince, Integer yearCode, OffsetDateTime date, Integer academicYearId, Integer perPage, Integer page) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/registration_groups").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "year_code", yearCode));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "date", date));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "academic_year_id", academicYearId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "per_page", perPage));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));

        if (ifModifiedSince != null)
        headerParams.add("If-Modified-Since", apiClient.parameterToString(ifModifiedSince));

        final String[] accepts = { 
            "application/vnd.assembly+json; version=1.1"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<List<RegistrationGroup>> returnType = new ParameterizedTypeReference<List<RegistrationGroup>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * List Results
     * Returns a list of results for the student ID(s) specified by the students parameter.
     * <p><b>200</b> - success
     * @param students ID(s) of the student(s) as an Integer. Multiple IDs can be separated with a space (so a + URL encoded).
     * @param ifModifiedSince If-Modified-Since is optional (see the page on Conditional Requests for more details).
     * @param perPage Number of results to return
     * @param page Page number to return
     * @return List&lt;Result&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Result> getResults(List<Integer> students, OffsetDateTime ifModifiedSince, Integer perPage, Integer page) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'students' is set
        if (students == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'students' when calling getResults");
        }
        
        String path = UriComponentsBuilder.fromPath("/results").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase()), "students[]", students));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "per_page", perPage));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));

        if (ifModifiedSince != null)
        headerParams.add("If-Modified-Since", apiClient.parameterToString(ifModifiedSince));

        final String[] accepts = { 
            "application/vnd.assembly+json; version=1.1"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<List<Result>> returnType = new ParameterizedTypeReference<List<Result>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * List Staff Absences
     * Returns a list of staff member absences for the school accociated with the provided &#x60;access_token&#x60;. A school level access token with the &#x60;staff_members.absences&#x60; scope is required to access staff member absence information.
     * <p><b>200</b> - success
     * @param ifModifiedSince If-Modified-Since is optional (see the page on Conditional Requests for more details).
     * @param staffMemberId show only absences fot the specified staff member
     * @param startDate the start date of the period to query
     * @param qualifications include HLTA status, QT status, QT route and previous degree information (requires &#x60;staff_members.qualifications&#x60; scope)
     * @param perPage Number of results to return
     * @param page Page number to return
     * @return List&lt;StaffAbsence&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<StaffAbsence> getStaffAbsences(OffsetDateTime ifModifiedSince, Integer staffMemberId, OffsetDateTime startDate, Integer qualifications, Integer perPage, Integer page) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/staff_absences").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "staff_member_id", staffMemberId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "start_date", startDate));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "qualifications", qualifications));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "per_page", perPage));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));

        if (ifModifiedSince != null)
        headerParams.add("If-Modified-Since", apiClient.parameterToString(ifModifiedSince));

        final String[] accepts = { 
            "application/vnd.assembly+json; version=1.1"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<List<StaffAbsence>> returnType = new ParameterizedTypeReference<List<StaffAbsence>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * List Staff Contracts
     * Returns a list of staff member contracts for the school accociated with the provided &#x60;access_token&#x60;. A school level access token with the &#x60;staff_members.contracts&#x60; scope is required to access staff member contract information.
     * <p><b>200</b> - success
     * @param ifModifiedSince If-Modified-Since is optional (see the page on Conditional Requests for more details).
     * @param staffMemberId show only absences fot the specified staff member
     * @param date returns results for a specific date
     * @param roles return roles information along with a staff contract
     * @param salaries return salaries information along with a staff contract (requires staff_members.salaries scope for full information - only the hours_per_week, fte and weeks_per_year fields are shown without it)
     * @param allowances return allowances information along with a staff contract (requires staff_members.salaries scope)
     * @param perPage Number of results to return
     * @param page Page number to return
     * @return List&lt;StaffContract&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<StaffContract> getStaffContracts(OffsetDateTime ifModifiedSince, Integer staffMemberId, Boolean date, Boolean roles, Boolean salaries, Boolean allowances, Integer perPage, Integer page) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/staff_contracts").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "staff_member_id", staffMemberId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "date", date));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "roles", roles));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "salaries", salaries));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "allowances", allowances));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "per_page", perPage));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));

        if (ifModifiedSince != null)
        headerParams.add("If-Modified-Since", apiClient.parameterToString(ifModifiedSince));

        final String[] accepts = { 
            "application/vnd.assembly+json; version=1.1"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<List<StaffContract>> returnType = new ParameterizedTypeReference<List<StaffContract>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * List Staff Members
     * Returns a list of staff members for the school accociated with the provided &#x60;access_token&#x60;.  **Note:** Note the &#x60;If-Modified-Since&#x60; header is optional (see the page on [Conditional Requests](/api#conditional-requests) for more details). 
     * <p><b>200</b> - success
     * @param ifModifiedSince If-Modified-Since is optional (see the page on Conditional Requests for more details).
     * @param teachersOnly return only staff who are teachers
     * @param demographics include demographics data
     * @param qualifications include HLTA status, QT status, QT route and previous degree information (requires &#x60;staff_members.qualifications&#x60; scope)
     * @param perPage Number of results to return
     * @param page Page number to return
     * @return List&lt;StaffMember&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<StaffMember> getStaffMembers(OffsetDateTime ifModifiedSince, Boolean teachersOnly, Boolean demographics, Boolean qualifications, Integer perPage, Integer page) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/staff_members").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "teachers_only", teachersOnly));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "demographics", demographics));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "qualifications", qualifications));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "per_page", perPage));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));

        if (ifModifiedSince != null)
        headerParams.add("If-Modified-Since", apiClient.parameterToString(ifModifiedSince));

        final String[] accepts = { 
            "application/vnd.assembly+json; version=1.1"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<List<StaffMember>> returnType = new ParameterizedTypeReference<List<StaffMember>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * List Students
     * Returns a list of students for the school associated with the provided &#x60;access_token.&#x60; **Note:** the &#x60;If-Modified-Since&#x60; header is optional (see the page on [Conditional Requests](/api#conditional-requests) for more details). 
     * <p><b>200</b> - success
     * @param ifModifiedSince If-Modified-Since is optional (see the page on Conditional Requests for more details).
     * @param students ID(s) of the student(s) as an Integer. Multiple IDs can be separated with a space (so a + URL encoded).
     * @param date returns results for a specific date
     * @param yearCode filter by school year (cannot be supplied at the same time as the students parameter)
     * @param demographics include demographics data
     * @param contacts include contacts data
     * @param senNeeds include SEN needs data
     * @param addresses include student address data
     * @param care include student care data (you must also supply the demographics parameter)
     * @param everInCare include whether the student has ever been in care (you must also supply the demographics parameter)
     * @param languages include student language data
     * @param photo include student photo data
     * @param perPage Number of results to return
     * @param page Page number to return
     * @return List&lt;Student&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Student> getStudents(OffsetDateTime ifModifiedSince, List<Integer> students, OffsetDateTime date, Integer yearCode, Boolean demographics, Boolean contacts, Boolean senNeeds, Boolean addresses, Boolean care, Boolean everInCare, Boolean languages, Boolean photo, Integer perPage, Integer page) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/students").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase()), "students[]", students));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "date", date));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "year_code", yearCode));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "demographics", demographics));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "contacts", contacts));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "sen_needs", senNeeds));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "addresses", addresses));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "care", care));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "ever_in_care", everInCare));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "languages", languages));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "photo", photo));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "per_page", perPage));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));

        if (ifModifiedSince != null)
        headerParams.add("If-Modified-Since", apiClient.parameterToString(ifModifiedSince));

        final String[] accepts = { 
            "application/vnd.assembly+json; version=1.1"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<List<Student>> returnType = new ParameterizedTypeReference<List<Student>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * List Subjects
     * Returns a list of the Assembly Platform&#39;s subjects.
     * <p><b>200</b> - success
     * @param perPage Number of results to return
     * @param page Page number to return
     * @return List&lt;Subject&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Subject> getSubjects(Integer perPage, Integer page) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/subjects").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "per_page", perPage));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));

        final String[] accepts = { 
            "application/vnd.assembly+json; version=1.1"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<List<Subject>> returnType = new ParameterizedTypeReference<List<Subject>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * List Students for Teaching Group
     * Returns a list of all the students that are present in the teaching group identified by group_id.  **Note:** Note the &#x60;If-Modified-Since&#x60; header is optional (see the page on [Conditional Requests](/api#conditional-requests) for more details). 
     * <p><b>200</b> - success
     * @param id id of the entity
     * @param ifModifiedSince If-Modified-Since is optional (see the page on Conditional Requests for more details).
     * @param demographics include demographics data
     * @param contacts include contacts data
     * @param senNeeds include SEN needs data
     * @param addresses include student address data
     * @param care include student care data (you must also supply the demographics parameter)
     * @param everInCare include whether the student has ever been in care (you must also supply the demographics parameter)
     * @param languages include student language data
     * @param photo include student photo data
     * @return List&lt;Student&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Student> getTeachingGroupStudents(Integer id, OffsetDateTime ifModifiedSince, Boolean demographics, Boolean contacts, Boolean senNeeds, Boolean addresses, Boolean care, Boolean everInCare, Boolean languages, Boolean photo) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getTeachingGroupStudents");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/teaching_groups/{id}/students").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "demographics", demographics));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "contacts", contacts));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "sen_needs", senNeeds));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "addresses", addresses));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "care", care));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "ever_in_care", everInCare));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "languages", languages));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "photo", photo));

        if (ifModifiedSince != null)
        headerParams.add("If-Modified-Since", apiClient.parameterToString(ifModifiedSince));

        final String[] accepts = { 
            "application/vnd.assembly+json; version=1.1"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<List<Student>> returnType = new ParameterizedTypeReference<List<Student>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * List Teaching Groups
     * Returns a list of teaching groups that match the given set of filters.  If a date parameter is provided then the list of groups returned is filtered to only those where the provided date falls between the groups start_date and end_date. Additionally when a date parameter is provided student_ids and supervior_ids are restricted to only those students who were enrolled in the group on the given date.  **Note:** Note the &#x60;If-Modified-Since&#x60; header is optional (see the page on [Conditional Requests](/api#conditional-requests) for more details). 
     * <p><b>200</b> - success
     * @param ifModifiedSince If-Modified-Since is optional (see the page on Conditional Requests for more details).
     * @param subjectCode filter by subject
     * @param yearCode filter by school year (cannot be supplied at the same time as the students parameter)
     * @param date returns results for a specific date
     * @param academicYearId returns all groups and group memberships from the specified academic year
     * @param perPage Number of results to return
     * @param page Page number to return
     * @return List&lt;TeachingGroup&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<TeachingGroup> getTeachingGroups(OffsetDateTime ifModifiedSince, String subjectCode, Integer yearCode, OffsetDateTime date, Integer academicYearId, Integer perPage, Integer page) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/teaching_groups").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "subject_code", subjectCode));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "year_code", yearCode));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "date", date));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "academic_year_id", academicYearId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "per_page", perPage));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));

        if (ifModifiedSince != null)
        headerParams.add("If-Modified-Since", apiClient.parameterToString(ifModifiedSince));

        final String[] accepts = { 
            "application/vnd.assembly+json; version=1.1"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<List<TeachingGroup>> returnType = new ParameterizedTypeReference<List<TeachingGroup>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * List Students for Year Group
     * Returns a list of all the students that are present in the year group identified by group_id.  **Note:** Note the &#x60;If-Modified-Since&#x60; header is optional (see the page on [Conditional Requests](/api#conditional-requests) for more details). 
     * <p><b>200</b> - success
     * @param id id of the entity
     * @param ifModifiedSince If-Modified-Since is optional (see the page on Conditional Requests for more details).
     * @param date returns results for a specific date
     * @param academicYearId returns all groups and group memberships from the specified academic year
     * @param demographics include demographics data
     * @param contacts include contacts data
     * @param senNeeds include SEN needs data
     * @param addresses include student address data
     * @param care include student care data (you must also supply the demographics parameter)
     * @param everInCare include whether the student has ever been in care (you must also supply the demographics parameter)
     * @param languages include student language data
     * @param photo include student photo data
     * @return List&lt;Student&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Student> getYearGroupStudents(Integer id, OffsetDateTime ifModifiedSince, OffsetDateTime date, Integer academicYearId, Boolean demographics, Boolean contacts, Boolean senNeeds, Boolean addresses, Boolean care, Boolean everInCare, Boolean languages, Boolean photo) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getYearGroupStudents");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/year_groups/{id}/students").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "date", date));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "academic_year_id", academicYearId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "demographics", demographics));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "contacts", contacts));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "sen_needs", senNeeds));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "addresses", addresses));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "care", care));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "ever_in_care", everInCare));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "languages", languages));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "photo", photo));

        if (ifModifiedSince != null)
        headerParams.add("If-Modified-Since", apiClient.parameterToString(ifModifiedSince));

        final String[] accepts = { 
            "application/vnd.assembly+json; version=1.1"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<List<Student>> returnType = new ParameterizedTypeReference<List<Student>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * List Year Groups
     * Returns a list of year groups that match the given set of filters.  If a date parameter is provided then the list of groups returned is filtered to only those where the provided date falls between the groups start_date and end_date. Additionally when a date parameter is provided student_ids and supervior_ids are restricted to only those students who were enrolled in the group on the given date.  **Note:** Note the &#x60;If-Modified-Since&#x60; header is optional (see the page on [Conditional Requests](/api#conditional-requests) for more details). 
     * <p><b>200</b> - success
     * @param ifModifiedSince If-Modified-Since is optional (see the page on Conditional Requests for more details).
     * @param yearCode filter by school year (cannot be supplied at the same time as the students parameter)
     * @param date returns results for a specific date
     * @param academicYearId returns all groups and group memberships from the specified academic year
     * @param perPage Number of results to return
     * @param page Page number to return
     * @return List&lt;YearGroup&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<YearGroup> getYearGroups(OffsetDateTime ifModifiedSince, Integer yearCode, OffsetDateTime date, Integer academicYearId, Integer perPage, Integer page) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/year_groups").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "year_code", yearCode));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "date", date));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "academic_year_id", academicYearId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "per_page", perPage));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));

        if (ifModifiedSince != null)
        headerParams.add("If-Modified-Since", apiClient.parameterToString(ifModifiedSince));

        final String[] accepts = { 
            "application/vnd.assembly+json; version=1.1"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<List<YearGroup>> returnType = new ParameterizedTypeReference<List<YearGroup>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
