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

import education.assembly.platform.spring.ApiClient;

import education.assembly.platform.spring.models.AcademicYearList;
import education.assembly.platform.spring.models.Assessment;
import education.assembly.platform.spring.models.AssessmentList;
import education.assembly.platform.spring.models.AssessmentPoint;
import education.assembly.platform.spring.models.AssessmentPointList;
import education.assembly.platform.spring.models.AttendanceList;
import education.assembly.platform.spring.models.CalendarEventList;
import education.assembly.platform.spring.models.ContactList;
import education.assembly.platform.spring.models.Error;
import education.assembly.platform.spring.models.ExclusionList;
import education.assembly.platform.spring.models.Facet;
import education.assembly.platform.spring.models.FacetList;
import education.assembly.platform.spring.models.Gradeset;
import education.assembly.platform.spring.models.RegistrationGroup;
import education.assembly.platform.spring.models.RegistrationGroupList;
import education.assembly.platform.spring.models.Result;
import education.assembly.platform.spring.models.ResultList;
import education.assembly.platform.spring.models.SchoolDetails;
import education.assembly.platform.spring.models.StaffAbsenceList;
import education.assembly.platform.spring.models.StaffContractList;
import education.assembly.platform.spring.models.StaffMember;
import education.assembly.platform.spring.models.StaffMemberList;
import education.assembly.platform.spring.models.Student;
import education.assembly.platform.spring.models.StudentList;
import education.assembly.platform.spring.models.SubjectList;
import education.assembly.platform.spring.models.TeachingGroup;
import education.assembly.platform.spring.models.TeachingGroupList;
import education.assembly.platform.spring.models.UpdateMultipleResultResponse;
import education.assembly.platform.spring.models.YearGroup;
import education.assembly.platform.spring.models.YearGroupList;

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
     * 
     * Returns a list of academic years for the school associated with the provided access_token. The dates of these academic years can be used to filter data in other API endpoints.
     * <p><b>200</b> - Success Response
     * <p><b>401</b> - Unauthorized.
     * <p><b>406</b> - No Acceptable. Accept header does not contain the expected value &#x60;application/vnd.assembly+json; version&#x3D;1&#x60;.
     * <p><b>429</b> - No Acceptable. Accept header does not contain the expected value &#x60;application/vnd.assembly+json; version&#x3D;1&#x60;.
     * @param page Page number to return
     * @param perPage Number of results to return
     * @return AcademicYearList
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public AcademicYearList getAcademicYears(Integer page, Integer perPage) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/academic_years").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "per_page", perPage));

        final String[] accepts = { 
            "application/vnd.assembly+json; version=1"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "oauth2" };

        ParameterizedTypeReference<AcademicYearList> returnType = new ParameterizedTypeReference<AcademicYearList>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Returns a list of assessment points. An assessment_point object represents a point in the school key stage, year, term or half-term that results can be attached to. When sending results back to the Platform, the &#x60;assessment_point_rank&#x60; should be used - this will remain constant across all environments.
     * <p><b>200</b> - Success Response
     * <p><b>401</b> - Unauthorized.
     * <p><b>406</b> - No Acceptable. Accept header does not contain the expected value &#x60;application/vnd.assembly+json; version&#x3D;1&#x60;.
     * <p><b>429</b> - No Acceptable. Accept header does not contain the expected value &#x60;application/vnd.assembly+json; version&#x3D;1&#x60;.
     * @param yearCode Filter by a specific NC year code
     * @param type Filter by assessment point type
     * @param page Page number to return
     * @param perPage Number of results to return
     * @return AssessmentPointList
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public AssessmentPointList getAssessmentPoints(String yearCode, String type, Integer page, Integer perPage) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/assessment_points").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "year_code", yearCode));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "type", type));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "per_page", perPage));

        final String[] accepts = { 
            "application/vnd.assembly+json; version=1"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "oauth2" };

        ParameterizedTypeReference<AssessmentPointList> returnType = new ParameterizedTypeReference<AssessmentPointList>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Returns a single assessment point for the given rank.
     * <p><b>200</b> - Success Response
     * <p><b>401</b> - Unauthorized.
     * <p><b>406</b> - No Acceptable. Accept header does not contain the expected value &#x60;application/vnd.assembly+json; version&#x3D;1&#x60;.
     * <p><b>429</b> - No Acceptable. Accept header does not contain the expected value &#x60;application/vnd.assembly+json; version&#x3D;1&#x60;.
     * @param assessmentPointRank The rank of the assessment point as an Integer
     * @return AssessmentPoint
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public AssessmentPoint getAssessmentPointsAssessmentPointRank(String assessmentPointRank) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'assessmentPointRank' is set
        if (assessmentPointRank == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'assessmentPointRank' when calling getAssessmentPointsAssessmentPointRank");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("assessment_point_rank", assessmentPointRank);
        String path = UriComponentsBuilder.fromPath("/assessment_points/{assessment_point_rank}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/vnd.assembly+json; version=1"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "oauth2" };

        ParameterizedTypeReference<AssessmentPoint> returnType = new ParameterizedTypeReference<AssessmentPoint>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Returns a list of results for the given assessment_point_rank and students.
     * <p><b>200</b> - Success Response
     * <p><b>401</b> - Unauthorized.
     * <p><b>406</b> - No Acceptable. Accept header does not contain the expected value &#x60;application/vnd.assembly+json; version&#x3D;1&#x60;.
     * <p><b>429</b> - No Acceptable. Accept header does not contain the expected value &#x60;application/vnd.assembly+json; version&#x3D;1&#x60;.
     * @param assessmentPointRank The rank of the assessment point as an Integer
     * @param students ID(s) of the student(s) as an Integer. Multiple IDs can be separated with a space (so a + URL encoded).
     * @param page Page number to return
     * @param perPage Number of results to return
     * @return ResultList
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultList getAssessmentPointsAssessmentPointRankResults(String assessmentPointRank, String students, Integer page, Integer perPage) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'assessmentPointRank' is set
        if (assessmentPointRank == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'assessmentPointRank' when calling getAssessmentPointsAssessmentPointRankResults");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("assessment_point_rank", assessmentPointRank);
        String path = UriComponentsBuilder.fromPath("/assessment_points/{assessment_point_rank}/results").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "students", students));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "per_page", perPage));

        final String[] accepts = { 
            "application/vnd.assembly+json; version=1"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "oauth2" };

        ParameterizedTypeReference<ResultList> returnType = new ParameterizedTypeReference<ResultList>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Returns a list of assessment objects.
     * <p><b>200</b> - Success Response
     * <p><b>401</b> - Unauthorized.
     * <p><b>406</b> - No Acceptable. Accept header does not contain the expected value &#x60;application/vnd.assembly+json; version&#x3D;1&#x60;.
     * <p><b>429</b> - No Acceptable. Accept header does not contain the expected value &#x60;application/vnd.assembly+json; version&#x3D;1&#x60;.
     * @param misMappings Includes the names of any MIS components to this object
     * @param page Page number to return
     * @param perPage Number of results to return
     * @return AssessmentList
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public AssessmentList getAssessments(Boolean misMappings, Integer page, Integer perPage) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/assessments").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "mis_mappings", misMappings));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "per_page", perPage));

        final String[] accepts = { 
            "application/vnd.assembly+json; version=1"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "oauth2" };

        ParameterizedTypeReference<AssessmentList> returnType = new ParameterizedTypeReference<AssessmentList>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Returns a single assessment for the given ID.
     * <p><b>200</b> - Success Response
     * <p><b>401</b> - Unauthorized.
     * <p><b>406</b> - No Acceptable. Accept header does not contain the expected value &#x60;application/vnd.assembly+json; version&#x3D;1&#x60;.
     * <p><b>429</b> - No Acceptable. Accept header does not contain the expected value &#x60;application/vnd.assembly+json; version&#x3D;1&#x60;.
     * @param assessmentId ID of the assessment as an Integer.
     * @return Assessment
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Assessment getAssessmentsAssessmentId(String assessmentId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'assessmentId' is set
        if (assessmentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'assessmentId' when calling getAssessmentsAssessmentId");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("assessment_id", assessmentId);
        String path = UriComponentsBuilder.fromPath("/assessments/{assessment_id}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/vnd.assembly+json; version=1"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "oauth2" };

        ParameterizedTypeReference<Assessment> returnType = new ParameterizedTypeReference<Assessment>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Returns a gradeset (an acceptable list of values) for the assessment identified by the assessment_id. Grades should be written back to the Platform using the grade_id.
     * <p><b>200</b> - Success Response
     * <p><b>401</b> - Unauthorized.
     * <p><b>406</b> - No Acceptable. Accept header does not contain the expected value &#x60;application/vnd.assembly+json; version&#x3D;1&#x60;.
     * <p><b>429</b> - No Acceptable. Accept header does not contain the expected value &#x60;application/vnd.assembly+json; version&#x3D;1&#x60;.
     * @param assessmentId ID of the assessment as an Integer.
     * @return Gradeset
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Gradeset getAssessmentsAssessmentIdGradeSet(String assessmentId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'assessmentId' is set
        if (assessmentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'assessmentId' when calling getAssessmentsAssessmentIdGradeSet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("assessment_id", assessmentId);
        String path = UriComponentsBuilder.fromPath("/assessments/{assessment_id}/grade_set").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/vnd.assembly+json; version=1"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "oauth2" };

        ParameterizedTypeReference<Gradeset> returnType = new ParameterizedTypeReference<Gradeset>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Returns a list of results for the given assessment_id and students. For a full list of national assessment data (Key stage 1 and 2 SATs results) available on the Platform, please see this support article.
     * <p><b>200</b> - Success Response
     * <p><b>401</b> - Unauthorized.
     * <p><b>406</b> - No Acceptable. Accept header does not contain the expected value &#x60;application/vnd.assembly+json; version&#x3D;1&#x60;.
     * <p><b>429</b> - No Acceptable. Accept header does not contain the expected value &#x60;application/vnd.assembly+json; version&#x3D;1&#x60;.
     * @param assessmentId ID of the assessment as an Integer.
     * @param students ID(s) of the student(s) as an Integer. Multiple IDs can be separated with a space (so a + URL encoded).
     * @return Result
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Result getAssessmentsAssessmentIdResults(String assessmentId, String students) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'assessmentId' is set
        if (assessmentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'assessmentId' when calling getAssessmentsAssessmentIdResults");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("assessment_id", assessmentId);
        String path = UriComponentsBuilder.fromPath("/assessments/{assessment_id}/results").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "students", students));

        final String[] accepts = { 
            "application/vnd.assembly+json; version=1"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "oauth2" };

        ParameterizedTypeReference<Result> returnType = new ParameterizedTypeReference<Result>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Returns a list of attendances, filtered by date, student, or registration group. By default, attendances are returned from the start to the end of the current week.
     * <p><b>200</b> - Success Response
     * <p><b>401</b> - Unauthorized.
     * <p><b>406</b> - No Acceptable. Accept header does not contain the expected value &#x60;application/vnd.assembly+json; version&#x3D;1&#x60;.
     * <p><b>429</b> - No Acceptable. Accept header does not contain the expected value &#x60;application/vnd.assembly+json; version&#x3D;1&#x60;.
     * @param studentId ID of the Student as an Integer
     * @param registrationGroupId ID of the registration group as an Integer
     * @param startDate The start date of the period to return data for
     * @param endDate The end date of the period to return data for
     * @param page Page number to return
     * @param perPage Number of results to return
     * @param ifModifiedSince Timestamp of the last response.
     * @return AttendanceList
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public AttendanceList getAttendances(Integer studentId, Integer registrationGroupId, String startDate, String endDate, Integer page, Integer perPage, String ifModifiedSince) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/attendances").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "student_id", studentId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "registration_group_id", registrationGroupId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "start_date", startDate));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "end_date", endDate));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "per_page", perPage));

        if (ifModifiedSince != null)
        headerParams.add("If-Modified-Since", apiClient.parameterToString(ifModifiedSince));

        final String[] accepts = { 
            "application/vnd.assembly+json; version=1"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "oauth2" };

        ParameterizedTypeReference<AttendanceList> returnType = new ParameterizedTypeReference<AttendanceList>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Returns a list of calendar events from the school calendar. We strongly recommend that you use an object type to filter the events that will be returned to you. Presently, with SIMS only support, we&#39;ve exposed the raw types from the underlying MIS. As such, it&#39;s most likely that you&#39;ll mostly be interested in &#39;User&#39; events. This category includes items such as staff meetings and school assembly times as you can see from the sample response below.
     * <p><b>200</b> - Success Response
     * <p><b>401</b> - Unauthorized.
     * <p><b>406</b> - No Acceptable. Accept header does not contain the expected value &#x60;application/vnd.assembly+json; version&#x3D;1&#x60;.
     * <p><b>429</b> - No Acceptable. Accept header does not contain the expected value &#x60;application/vnd.assembly+json; version&#x3D;1&#x60;.
     * @param eventType Return a calendar object type from the underlying MIS
     * @param page Page number to return
     * @param perPage Number of results to return
     * @param ifModifiedSince Timestamp of the last response.
     * @return CalendarEventList
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CalendarEventList getCalendarEvents(String eventType, Integer page, Integer perPage, String ifModifiedSince) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/calendar_events").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "event_type", eventType));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "per_page", perPage));

        if (ifModifiedSince != null)
        headerParams.add("If-Modified-Since", apiClient.parameterToString(ifModifiedSince));

        final String[] accepts = { 
            "application/vnd.assembly+json; version=1"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "oauth2" };

        ParameterizedTypeReference<CalendarEventList> returnType = new ParameterizedTypeReference<CalendarEventList>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Returns a list of contacts that match the given set of filters.
     * <p><b>200</b> - Success Response
     * <p><b>401</b> - Unauthorized.
     * <p><b>406</b> - No Acceptable. Accept header does not contain the expected value &#x60;application/vnd.assembly+json; version&#x3D;1&#x60;.
     * <p><b>429</b> - No Acceptable. Accept header does not contain the expected value &#x60;application/vnd.assembly+json; version&#x3D;1&#x60;.
     * @param studentId ID of the Student as an Integer
     * @param page Page number to return
     * @param perPage Number of results to return
     * @return ContactList
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ContactList getContacts(Integer studentId, Integer page, Integer perPage) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/contacts").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "student_id", studentId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "per_page", perPage));

        final String[] accepts = { 
            "application/vnd.assembly+json; version=1"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "oauth2" };

        ParameterizedTypeReference<ContactList> returnType = new ParameterizedTypeReference<ContactList>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Returns a list of exclusions. By default, exclusions are returned that occurred during the current academic year.
     * <p><b>200</b> - Success Response
     * <p><b>401</b> - Unauthorized.
     * <p><b>406</b> - No Acceptable. Accept header does not contain the expected value &#x60;application/vnd.assembly+json; version&#x3D;1&#x60;.
     * <p><b>429</b> - No Acceptable. Accept header does not contain the expected value &#x60;application/vnd.assembly+json; version&#x3D;1&#x60;.
     * @param startDate The start date of the period to return data for
     * @param endDate The end date of the period to return data for
     * @param page Page number to return
     * @param perPage Number of results to return
     * @return ExclusionList
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ExclusionList getExclusions(String startDate, String endDate, Integer page, Integer perPage) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/exclusions").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "start_date", startDate));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "end_date", endDate));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "per_page", perPage));

        final String[] accepts = { 
            "application/vnd.assembly+json; version=1"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "oauth2" };

        ParameterizedTypeReference<ExclusionList> returnType = new ParameterizedTypeReference<ExclusionList>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Returns a list of exclusions for a given student. By default, exclusions are returned that occurred during the current academic year.
     * <p><b>200</b> - Success Response
     * <p><b>401</b> - Unauthorized.
     * <p><b>406</b> - No Acceptable. Accept header does not contain the expected value &#x60;application/vnd.assembly+json; version&#x3D;1&#x60;.
     * <p><b>429</b> - No Acceptable. Accept header does not contain the expected value &#x60;application/vnd.assembly+json; version&#x3D;1&#x60;.
     * @param studentId ID of the Student as an Integer
     * @param startDate The start date of the period to return data for
     * @param endDate The end date of the period to return data for
     * @param page Page number to return
     * @param perPage Number of results to return
     * @return ExclusionList
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ExclusionList getExclusionsStudentId(String studentId, String startDate, String endDate, Integer page, Integer perPage) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'studentId' is set
        if (studentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'studentId' when calling getExclusionsStudentId");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("student_id", studentId);
        String path = UriComponentsBuilder.fromPath("/exclusions/{student_id}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "start_date", startDate));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "end_date", endDate));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "per_page", perPage));

        final String[] accepts = { 
            "application/vnd.assembly+json; version=1"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "oauth2" };

        ParameterizedTypeReference<ExclusionList> returnType = new ParameterizedTypeReference<ExclusionList>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Returns a single facet for the given ID.
     * <p><b>200</b> - Success Response
     * <p><b>401</b> - Unauthorized.
     * <p><b>406</b> - No Acceptable. Accept header does not contain the expected value &#x60;application/vnd.assembly+json; version&#x3D;1&#x60;.
     * <p><b>429</b> - No Acceptable. Accept header does not contain the expected value &#x60;application/vnd.assembly+json; version&#x3D;1&#x60;.
     * @param facetId ID of the facet as an Integer.
     * @return Facet
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Facet getFacetFacetId(String facetId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'facetId' is set
        if (facetId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'facetId' when calling getFacetFacetId");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("facet_id", facetId);
        String path = UriComponentsBuilder.fromPath("/facet/{facet_id}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/vnd.assembly+json; version=1"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "oauth2" };

        ParameterizedTypeReference<Facet> returnType = new ParameterizedTypeReference<Facet>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Returns a list of facets. The facet is used to reflect a different type of grade and allows 2 grades of the same assessment to be compared.
     * <p><b>200</b> - Success Response
     * <p><b>401</b> - Unauthorized.
     * <p><b>406</b> - No Acceptable. Accept header does not contain the expected value &#x60;application/vnd.assembly+json; version&#x3D;1&#x60;.
     * <p><b>429</b> - No Acceptable. Accept header does not contain the expected value &#x60;application/vnd.assembly+json; version&#x3D;1&#x60;.
     * @param page Page number to return
     * @param perPage Number of results to return
     * @return FacetList
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public FacetList getFacets(Integer page, Integer perPage) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/facets").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "per_page", perPage));

        final String[] accepts = { 
            "application/vnd.assembly+json; version=1"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "oauth2" };

        ParameterizedTypeReference<FacetList> returnType = new ParameterizedTypeReference<FacetList>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Returns a list of registration groups that match the given set of filters.
     * <p><b>200</b> - Success Response
     * <p><b>401</b> - Unauthorized.
     * <p><b>406</b> - No Acceptable. Accept header does not contain the expected value &#x60;application/vnd.assembly+json; version&#x3D;1&#x60;.
     * <p><b>429</b> - No Acceptable. Accept header does not contain the expected value &#x60;application/vnd.assembly+json; version&#x3D;1&#x60;.
     * @param yearCode Filter by a specific NC year code
     * @param date Filter for a specific date
     * @param academicYearId Filter based on the specified academic year
     * @param page Page number to return
     * @param perPage Number of results to return
     * @param ifModifiedSince Timestamp of the last response.
     * @return RegistrationGroupList
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public RegistrationGroupList getRegistrationGroups(String yearCode, String date, Integer academicYearId, Integer page, Integer perPage, String ifModifiedSince) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/registration_groups").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "year_code", yearCode));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "date", date));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "academic_year_id", academicYearId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "per_page", perPage));

        if (ifModifiedSince != null)
        headerParams.add("If-Modified-Since", apiClient.parameterToString(ifModifiedSince));

        final String[] accepts = { 
            "application/vnd.assembly+json; version=1"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "oauth2" };

        ParameterizedTypeReference<RegistrationGroupList> returnType = new ParameterizedTypeReference<RegistrationGroupList>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Returns a single registration group whose code matches the provided group_id. Additionally includes a list of all the student identifiers that are present in the group.
     * <p><b>200</b> - Success Response
     * <p><b>401</b> - Unauthorized.
     * <p><b>406</b> - No Acceptable. Accept header does not contain the expected value &#x60;application/vnd.assembly+json; version&#x3D;1&#x60;.
     * <p><b>429</b> - No Acceptable. Accept header does not contain the expected value &#x60;application/vnd.assembly+json; version&#x3D;1&#x60;.
     * @param groupId ID of the Year Group as an Integer
     * @param date Filter for a specific date
     * @param academicYearId Filter based on the specified academic year
     * @param ifModifiedSince Timestamp of the last response.
     * @return RegistrationGroup
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public RegistrationGroup getRegistrationGroupsGroupId(String groupId, String date, Integer academicYearId, String ifModifiedSince) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'groupId' is set
        if (groupId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'groupId' when calling getRegistrationGroupsGroupId");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("group_id", groupId);
        String path = UriComponentsBuilder.fromPath("/registration_groups/{group_id}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "date", date));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "academic_year_id", academicYearId));

        if (ifModifiedSince != null)
        headerParams.add("If-Modified-Since", apiClient.parameterToString(ifModifiedSince));

        final String[] accepts = { 
            "application/vnd.assembly+json; version=1"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "oauth2" };

        ParameterizedTypeReference<RegistrationGroup> returnType = new ParameterizedTypeReference<RegistrationGroup>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Returns a list of all the students that are present in the registration group identified by group_id.
     * <p><b>200</b> - Success Response
     * <p><b>401</b> - Unauthorized.
     * <p><b>406</b> - No Acceptable. Accept header does not contain the expected value &#x60;application/vnd.assembly+json; version&#x3D;1&#x60;.
     * <p><b>429</b> - No Acceptable. Accept header does not contain the expected value &#x60;application/vnd.assembly+json; version&#x3D;1&#x60;.
     * @param groupId ID of the Year Group as an Integer
     * @param yearCode Filter by a specific NC year code
     * @param date Filter for a specific date
     * @param academicYearId Filter based on the specified academic year
     * @param demographics Return demographic information along with the person (requires appropriate scope)
     * @param care Return care information along with this object, depends on inclusion of demographics
     * @param page Page number to return
     * @param perPage Number of results to return
     * @param ifModifiedSince Timestamp of the last response.
     * @return StudentList
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public StudentList getRegistrationGroupsGroupIdStudents(String groupId, String yearCode, String date, Integer academicYearId, Boolean demographics, Boolean care, Integer page, Integer perPage, String ifModifiedSince) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'groupId' is set
        if (groupId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'groupId' when calling getRegistrationGroupsGroupIdStudents");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("group_id", groupId);
        String path = UriComponentsBuilder.fromPath("/registration_groups/{group_id}/students").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "year_code", yearCode));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "date", date));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "academic_year_id", academicYearId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "demographics", demographics));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "care", care));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "per_page", perPage));

        if (ifModifiedSince != null)
        headerParams.add("If-Modified-Since", apiClient.parameterToString(ifModifiedSince));

        final String[] accepts = { 
            "application/vnd.assembly+json; version=1"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "oauth2" };

        ParameterizedTypeReference<StudentList> returnType = new ParameterizedTypeReference<StudentList>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Returns details for the school associated with the provided access_token.
     * <p><b>200</b> - Success Response
     * <p><b>401</b> - Unauthorized.
     * <p><b>406</b> - No Acceptable. Accept header does not contain the expected value &#x60;application/vnd.assembly+json; version&#x3D;1&#x60;.
     * <p><b>429</b> - No Acceptable. Accept header does not contain the expected value &#x60;application/vnd.assembly+json; version&#x3D;1&#x60;.
     * @return SchoolDetails
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SchoolDetails getSchoolDetails() throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/school_details").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/vnd.assembly+json; version=1"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "oauth2" };

        ParameterizedTypeReference<SchoolDetails> returnType = new ParameterizedTypeReference<SchoolDetails>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Returns a list of staff member absences for the school accociated with the provided access_token. A school level access token with the staff_members.absences scope is required to access staff member absence information.
     * <p><b>200</b> - Success Response
     * <p><b>401</b> - Unauthorized.
     * <p><b>406</b> - No Acceptable. Accept header does not contain the expected value &#x60;application/vnd.assembly+json; version&#x3D;1&#x60;.
     * <p><b>429</b> - No Acceptable. Accept header does not contain the expected value &#x60;application/vnd.assembly+json; version&#x3D;1&#x60;.
     * @param startDate The start date of the period to return data for
     * @param endDate The end date of the period to return data for
     * @param page Page number to return
     * @param perPage Number of results to return
     * @param ifModifiedSince Timestamp of the last response.
     * @return StaffAbsenceList
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public StaffAbsenceList getStaffAbsences(String startDate, String endDate, Integer page, Integer perPage, String ifModifiedSince) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/staff_absences").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "start_date", startDate));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "end_date", endDate));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "per_page", perPage));

        if (ifModifiedSince != null)
        headerParams.add("If-Modified-Since", apiClient.parameterToString(ifModifiedSince));

        final String[] accepts = { 
            "application/vnd.assembly+json; version=1"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "oauth2" };

        ParameterizedTypeReference<StaffAbsenceList> returnType = new ParameterizedTypeReference<StaffAbsenceList>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Returns a list of staff member contracts for the school accociated with the provided access_token. A school level access token with the staff_members.contracts scope is required to access staff member contract information.
     * <p><b>200</b> - Success Response
     * <p><b>401</b> - Unauthorized.
     * <p><b>406</b> - No Acceptable. Accept header does not contain the expected value &#x60;application/vnd.assembly+json; version&#x3D;1&#x60;.
     * <p><b>429</b> - No Acceptable. Accept header does not contain the expected value &#x60;application/vnd.assembly+json; version&#x3D;1&#x60;.
     * @param date Filter for a specific date
     * @param roles Return roles information along with this object
     * @param salaries Return salary information along with this object
     * @param allowances Return allowances information along with this object
     * @param page Page number to return
     * @param perPage Number of results to return
     * @param ifModifiedSince Timestamp of the last response.
     * @return StaffContractList
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public StaffContractList getStaffContracts(String date, Boolean roles, Boolean salaries, Boolean allowances, Integer page, Integer perPage, String ifModifiedSince) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/staff_contracts").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "date", date));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "roles", roles));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "salaries", salaries));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "allowances", allowances));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "per_page", perPage));

        if (ifModifiedSince != null)
        headerParams.add("If-Modified-Since", apiClient.parameterToString(ifModifiedSince));

        final String[] accepts = { 
            "application/vnd.assembly+json; version=1"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "oauth2" };

        ParameterizedTypeReference<StaffContractList> returnType = new ParameterizedTypeReference<StaffContractList>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Returns a list of staff member contracts for the school accociated with the provided access_token. A school level access token with the staff_members.contracts scope is required to access staff member contract information.
     * <p><b>200</b> - Success Response
     * <p><b>401</b> - Unauthorized.
     * <p><b>406</b> - No Acceptable. Accept header does not contain the expected value &#x60;application/vnd.assembly+json; version&#x3D;1&#x60;.
     * <p><b>429</b> - No Acceptable. Accept header does not contain the expected value &#x60;application/vnd.assembly+json; version&#x3D;1&#x60;.
     * @param staffMemberId ID of the Staff Member as an Integer
     * @param date Filter for a specific date
     * @param roles Return roles information along with this object
     * @param salaries Return salary information along with this object
     * @param allowances Return allowances information along with this object
     * @param page Page number to return
     * @param perPage Number of results to return
     * @param ifModifiedSince Timestamp of the last response.
     * @return StaffContractList
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public StaffContractList getStaffContractsStaffMemberId(String staffMemberId, String date, Boolean roles, Boolean salaries, Boolean allowances, Integer page, Integer perPage, String ifModifiedSince) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'staffMemberId' is set
        if (staffMemberId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'staffMemberId' when calling getStaffContractsStaffMemberId");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("staff_member_id", staffMemberId);
        String path = UriComponentsBuilder.fromPath("/staff_contracts/{staff_member_id}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "date", date));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "roles", roles));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "salaries", salaries));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "allowances", allowances));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "per_page", perPage));

        if (ifModifiedSince != null)
        headerParams.add("If-Modified-Since", apiClient.parameterToString(ifModifiedSince));

        final String[] accepts = { 
            "application/vnd.assembly+json; version=1"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "oauth2" };

        ParameterizedTypeReference<StaffContractList> returnType = new ParameterizedTypeReference<StaffContractList>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Returns a list of staff members for the school accociated with the provided access_token.
     * <p><b>200</b> - Success Response
     * <p><b>401</b> - Unauthorized.
     * <p><b>406</b> - No Acceptable. Accept header does not contain the expected value &#x60;application/vnd.assembly+json; version&#x3D;1&#x60;.
     * <p><b>429</b> - No Acceptable. Accept header does not contain the expected value &#x60;application/vnd.assembly+json; version&#x3D;1&#x60;.
     * @param teachersOnly Return only staff who are teachers
     * @param demographics Return demographic information along with the person (requires appropriate scope)
     * @param qualifications Include HLTA status, QT status, QT route and previous degree information (requires appropriate scope)
     * @param page Page number to return
     * @param perPage Number of results to return
     * @param ifModifiedSince Timestamp of the last response.
     * @return StaffMemberList
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public StaffMemberList getStaffMembers(Boolean teachersOnly, Boolean demographics, Boolean qualifications, Integer page, Integer perPage, String ifModifiedSince) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/staff_members").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "teachers_only", teachersOnly));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "demographics", demographics));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "qualifications", qualifications));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "per_page", perPage));

        if (ifModifiedSince != null)
        headerParams.add("If-Modified-Since", apiClient.parameterToString(ifModifiedSince));

        final String[] accepts = { 
            "application/vnd.assembly+json; version=1"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "oauth2" };

        ParameterizedTypeReference<StaffMemberList> returnType = new ParameterizedTypeReference<StaffMemberList>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Returns an individual staff member record for the given ID.
     * <p><b>200</b> - Success Response
     * <p><b>401</b> - Unauthorized.
     * <p><b>406</b> - No Acceptable. Accept header does not contain the expected value &#x60;application/vnd.assembly+json; version&#x3D;1&#x60;.
     * <p><b>429</b> - No Acceptable. Accept header does not contain the expected value &#x60;application/vnd.assembly+json; version&#x3D;1&#x60;.
     * @param staffMemberId ID of the Staff Member as an Integer
     * @param demographics Return demographic information along with the person (requires appropriate scope)
     * @param qualifications Include HLTA status, QT status, QT route and previous degree information (requires appropriate scope)
     * @param ifModifiedSince Timestamp of the last response.
     * @return StaffMember
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public StaffMember getStaffMembersStaffMemberId(String staffMemberId, Boolean demographics, Boolean qualifications, String ifModifiedSince) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'staffMemberId' is set
        if (staffMemberId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'staffMemberId' when calling getStaffMembersStaffMemberId");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("staff_member_id", staffMemberId);
        String path = UriComponentsBuilder.fromPath("/staff_members/{staff_member_id}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "demographics", demographics));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "qualifications", qualifications));

        if (ifModifiedSince != null)
        headerParams.add("If-Modified-Since", apiClient.parameterToString(ifModifiedSince));

        final String[] accepts = { 
            "application/vnd.assembly+json; version=1"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "oauth2" };

        ParameterizedTypeReference<StaffMember> returnType = new ParameterizedTypeReference<StaffMember>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Returns a list of students for the school associated with the provided access_token.
     * <p><b>200</b> - Success Response
     * <p><b>401</b> - Unauthorized.
     * <p><b>406</b> - No Acceptable. Accept header does not contain the expected value &#x60;application/vnd.assembly+json; version&#x3D;1&#x60;.
     * <p><b>429</b> - No Acceptable. Accept header does not contain the expected value &#x60;application/vnd.assembly+json; version&#x3D;1&#x60;.
     * @param yearCode Filter by a specific NC year code
     * @param students ID(s) of the student(s) as an Integer. Multiple IDs can be separated with a space (so a + URL encoded).
     * @param date Filter for a specific date
     * @param demographics Return demographic information along with the person (requires appropriate scope)
     * @param contacts Return contact information along with this object
     * @param senNeeds Return Special Educational Need information along with this object
     * @param addresses Return address information along with this object
     * @param care Return care information along with this object, depends on inclusion of demographics
     * @param languages Return language information along with this object
     * @param page Page number to return
     * @param perPage Number of results to return
     * @param ifModifiedSince Timestamp of the last response.
     * @return StudentList
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public StudentList getStudents(String yearCode, String students, String date, Boolean demographics, Boolean contacts, Boolean senNeeds, Boolean addresses, Boolean care, Boolean languages, Integer page, Integer perPage, String ifModifiedSince) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/students").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "year_code", yearCode));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "students", students));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "date", date));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "demographics", demographics));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "contacts", contacts));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "sen_needs", senNeeds));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "addresses", addresses));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "care", care));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "languages", languages));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "per_page", perPage));

        if (ifModifiedSince != null)
        headerParams.add("If-Modified-Since", apiClient.parameterToString(ifModifiedSince));

        final String[] accepts = { 
            "application/vnd.assembly+json; version=1"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "oauth2" };

        ParameterizedTypeReference<StudentList> returnType = new ParameterizedTypeReference<StudentList>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Returns an individual student record for the given ID. Note: the response shown includes student demographics, contacts, student SEN needs, student addresses and student care data but these will only be present if you have permission to access it and pass demographics&#x3D;true, contacts&#x3D;true, sen_needs&#x3D;true, addresses&#x3D;true and care&#x3D;true respectively
     * <p><b>200</b> - Success Response
     * <p><b>401</b> - Unauthorized.
     * <p><b>406</b> - No Acceptable. Accept header does not contain the expected value &#x60;application/vnd.assembly+json; version&#x3D;1&#x60;.
     * <p><b>429</b> - No Acceptable. Accept header does not contain the expected value &#x60;application/vnd.assembly+json; version&#x3D;1&#x60;.
     * @param studentId ID of the Student as an Integer
     * @param date Filter for a specific date
     * @param demographics Return demographic information along with the person (requires appropriate scope)
     * @param contacts Return contact information along with this object
     * @param senNeeds Return Special Educational Need information along with this object
     * @param addresses Return address information along with this object
     * @param care Return care information along with this object, depends on inclusion of demographics
     * @param languages Return language information along with this object
     * @param ifModifiedSince Timestamp of the last response.
     * @return Student
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Student getStudentsStudentId(String studentId, String date, Boolean demographics, Boolean contacts, Boolean senNeeds, Boolean addresses, Boolean care, Boolean languages, String ifModifiedSince) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'studentId' is set
        if (studentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'studentId' when calling getStudentsStudentId");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("student_id", studentId);
        String path = UriComponentsBuilder.fromPath("/students/{student_id}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "date", date));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "demographics", demographics));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "contacts", contacts));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "sen_needs", senNeeds));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "addresses", addresses));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "care", care));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "languages", languages));

        if (ifModifiedSince != null)
        headerParams.add("If-Modified-Since", apiClient.parameterToString(ifModifiedSince));

        final String[] accepts = { 
            "application/vnd.assembly+json; version=1"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "oauth2" };

        ParameterizedTypeReference<Student> returnType = new ParameterizedTypeReference<Student>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Returns a list of the Assembly Platform&#39;s subjects.
     * <p><b>200</b> - Success Response
     * <p><b>401</b> - Unauthorized.
     * <p><b>406</b> - No Acceptable. Accept header does not contain the expected value &#x60;application/vnd.assembly+json; version&#x3D;1&#x60;.
     * <p><b>429</b> - No Acceptable. Accept header does not contain the expected value &#x60;application/vnd.assembly+json; version&#x3D;1&#x60;.
     * @param misMappings Includes the names of any MIS components to this object
     * @param page Page number to return
     * @param perPage Number of results to return
     * @return SubjectList
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SubjectList getSubjects(Boolean misMappings, Integer page, Integer perPage) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/subjects").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "mis_mappings", misMappings));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "per_page", perPage));

        final String[] accepts = { 
            "application/vnd.assembly+json; version=1"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "oauth2" };

        ParameterizedTypeReference<SubjectList> returnType = new ParameterizedTypeReference<SubjectList>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Returns a list of teaching groups that match the given set of filters. If a date parameter is provided then the list of groups returned is filtered to only those where the provided date falls between the groups start_date and end_date. Additionally when a date parameter is provided student_ids and supervior_ids are restricted to only those students who were enrolled in the group on the given date.
     * <p><b>200</b> - Success Response
     * <p><b>401</b> - Unauthorized.
     * <p><b>406</b> - No Acceptable. Accept header does not contain the expected value &#x60;application/vnd.assembly+json; version&#x3D;1&#x60;.
     * <p><b>429</b> - No Acceptable. Accept header does not contain the expected value &#x60;application/vnd.assembly+json; version&#x3D;1&#x60;.
     * @param subjectCode Filter by subject
     * @param yearCode Filter by a specific NC year code
     * @param date Filter for a specific date
     * @param academicYearId Filter based on the specified academic year
     * @param page Page number to return
     * @param perPage Number of results to return
     * @return TeachingGroupList
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TeachingGroupList getTeachingGroups(String subjectCode, String yearCode, String date, Integer academicYearId, Integer page, Integer perPage) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/teaching_groups").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "subject_code", subjectCode));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "year_code", yearCode));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "date", date));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "academic_year_id", academicYearId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "per_page", perPage));

        final String[] accepts = { 
            "application/vnd.assembly+json; version=1"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "oauth2" };

        ParameterizedTypeReference<TeachingGroupList> returnType = new ParameterizedTypeReference<TeachingGroupList>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Returns a single teaching group whose ID matches the provided group_id. Additionally includes a list of all the student and supervisor identifiers that have ever been enrolled in the group.
     * <p><b>200</b> - Success Response
     * <p><b>401</b> - Unauthorized.
     * <p><b>406</b> - No Acceptable. Accept header does not contain the expected value &#x60;application/vnd.assembly+json; version&#x3D;1&#x60;.
     * <p><b>429</b> - No Acceptable. Accept header does not contain the expected value &#x60;application/vnd.assembly+json; version&#x3D;1&#x60;.
     * @param groupId ID of the Year Group as an Integer
     * @param date Filter for a specific date
     * @param academicYearId Filter based on the specified academic year
     * @return TeachingGroup
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TeachingGroup getTeachingGroupsGroupId(String groupId, String date, Integer academicYearId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'groupId' is set
        if (groupId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'groupId' when calling getTeachingGroupsGroupId");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("group_id", groupId);
        String path = UriComponentsBuilder.fromPath("/teaching_groups/{group_id}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "date", date));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "academic_year_id", academicYearId));

        final String[] accepts = { 
            "application/vnd.assembly+json; version=1"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "oauth2" };

        ParameterizedTypeReference<TeachingGroup> returnType = new ParameterizedTypeReference<TeachingGroup>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Returns a list of all the students that are present in the teaching group identified by group_id.
     * <p><b>200</b> - Success Response
     * <p><b>401</b> - Unauthorized.
     * <p><b>406</b> - No Acceptable. Accept header does not contain the expected value &#x60;application/vnd.assembly+json; version&#x3D;1&#x60;.
     * <p><b>429</b> - No Acceptable. Accept header does not contain the expected value &#x60;application/vnd.assembly+json; version&#x3D;1&#x60;.
     * @param groupId ID of the Year Group as an Integer
     * @param yearCode Filter by a specific NC year code
     * @param date Filter for a specific date
     * @param academicYearId Filter based on the specified academic year
     * @param demographics Return demographic information along with the person (requires appropriate scope)
     * @param care Return care information along with this object, depends on inclusion of demographics
     * @param page Page number to return
     * @param perPage Number of results to return
     * @param ifModifiedSince Timestamp of the last response.
     * @return StudentList
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public StudentList getTeachingGroupsGroupIdStudents(String groupId, String yearCode, String date, Integer academicYearId, Boolean demographics, Boolean care, Integer page, Integer perPage, String ifModifiedSince) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'groupId' is set
        if (groupId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'groupId' when calling getTeachingGroupsGroupIdStudents");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("group_id", groupId);
        String path = UriComponentsBuilder.fromPath("/teaching_groups/{group_id}/students").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "year_code", yearCode));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "date", date));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "academic_year_id", academicYearId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "demographics", demographics));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "care", care));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "per_page", perPage));

        if (ifModifiedSince != null)
        headerParams.add("If-Modified-Since", apiClient.parameterToString(ifModifiedSince));

        final String[] accepts = { 
            "application/vnd.assembly+json; version=1"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "oauth2" };

        ParameterizedTypeReference<StudentList> returnType = new ParameterizedTypeReference<StudentList>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Returns a list of year groups that match the given set of filters. The default behaviour is to return the year groups for the school&#39;s current academic year.
     * <p><b>200</b> - Success Response
     * <p><b>401</b> - Unauthorized.
     * <p><b>406</b> - No Acceptable. Accept header does not contain the expected value &#x60;application/vnd.assembly+json; version&#x3D;1&#x60;.
     * <p><b>429</b> - No Acceptable. Accept header does not contain the expected value &#x60;application/vnd.assembly+json; version&#x3D;1&#x60;.
     * @param yearCode Filter by a specific NC year code
     * @param date Filter for a specific date
     * @param academicYearId Filter based on the specified academic year
     * @param page Page number to return
     * @param perPage Number of results to return
     * @param ifModifiedSince Timestamp of the last response.
     * @return YearGroupList
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public YearGroupList getYearGroups(String yearCode, String date, Integer academicYearId, Integer page, Integer perPage, String ifModifiedSince) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/year_groups").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "year_code", yearCode));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "date", date));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "academic_year_id", academicYearId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "per_page", perPage));

        if (ifModifiedSince != null)
        headerParams.add("If-Modified-Since", apiClient.parameterToString(ifModifiedSince));

        final String[] accepts = { 
            "application/vnd.assembly+json; version=1"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "oauth2" };

        ParameterizedTypeReference<YearGroupList> returnType = new ParameterizedTypeReference<YearGroupList>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Returns a single year group whose code matches the provided year_code. Additionally includes a list of all the student identifiers that are present in the group.
     * <p><b>200</b> - Success Response
     * <p><b>401</b> - Unauthorized.
     * <p><b>406</b> - No Acceptable. Accept header does not contain the expected value &#x60;application/vnd.assembly+json; version&#x3D;1&#x60;.
     * <p><b>429</b> - No Acceptable. Accept header does not contain the expected value &#x60;application/vnd.assembly+json; version&#x3D;1&#x60;.
     * @param groupId ID of the Year Group as an Integer
     * @param date Filter for a specific date
     * @param academicYearId Filter based on the specified academic year
     * @return YearGroup
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public YearGroup getYearGroupsGroupId(String groupId, String date, Integer academicYearId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'groupId' is set
        if (groupId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'groupId' when calling getYearGroupsGroupId");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("group_id", groupId);
        String path = UriComponentsBuilder.fromPath("/year_groups/{group_id}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "date", date));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "academic_year_id", academicYearId));

        final String[] accepts = { 
            "application/vnd.assembly+json; version=1"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "oauth2" };

        ParameterizedTypeReference<YearGroup> returnType = new ParameterizedTypeReference<YearGroup>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Returns a list of all the students that are present in the year group identified by year_code.
     * <p><b>200</b> - Success Response
     * <p><b>401</b> - Unauthorized.
     * <p><b>406</b> - No Acceptable. Accept header does not contain the expected value &#x60;application/vnd.assembly+json; version&#x3D;1&#x60;.
     * <p><b>429</b> - No Acceptable. Accept header does not contain the expected value &#x60;application/vnd.assembly+json; version&#x3D;1&#x60;.
     * @param groupId ID of the Year Group as an Integer
     * @param date Filter for a specific date
     * @param academicYearId Filter based on the specified academic year
     * @param page Page number to return
     * @param perPage Number of results to return
     * @param ifModifiedSince Timestamp of the last response.
     * @return StudentList
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public StudentList getYearGroupsGroupIdStudents(String groupId, String date, Integer academicYearId, Integer page, Integer perPage, String ifModifiedSince) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'groupId' is set
        if (groupId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'groupId' when calling getYearGroupsGroupIdStudents");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("group_id", groupId);
        String path = UriComponentsBuilder.fromPath("/year_groups/{group_id}/students").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "date", date));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "academic_year_id", academicYearId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "per_page", perPage));

        if (ifModifiedSince != null)
        headerParams.add("If-Modified-Since", apiClient.parameterToString(ifModifiedSince));

        final String[] accepts = { 
            "application/vnd.assembly+json; version=1"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "oauth2" };

        ParameterizedTypeReference<StudentList> returnType = new ParameterizedTypeReference<StudentList>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Multiple results can be updated simultaneously by providing the relevant result_ids in the body of your request. The response will tell you whether the batch of updates has either been successful or failed.
     * <p><b>200</b> - Success Response
     * <p><b>401</b> - Unauthorized.
     * <p><b>406</b> - No Acceptable. Accept header does not contain the expected value &#x60;application/vnd.assembly+json; version&#x3D;1&#x60;.
     * <p><b>429</b> - No Acceptable. Accept header does not contain the expected value &#x60;application/vnd.assembly+json; version&#x3D;1&#x60;.
     * @param updateMultipleResultPayload Payload for update multiple Result request
     * @return UpdateMultipleResultResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public UpdateMultipleResultResponse patchResults(UpdateMultipleResultResponse updateMultipleResultPayload) throws RestClientException {
        Object postBody = updateMultipleResultPayload;
        
        String path = UriComponentsBuilder.fromPath("/results").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/vnd.assembly+json; version=1"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "oauth2" };

        ParameterizedTypeReference<UpdateMultipleResultResponse> returnType = new ParameterizedTypeReference<UpdateMultipleResultResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Once a result has been created, it can be updated on the Platform by passing the required field values in the request body. A list of the fields that were changed are returned in the response.
     * <p><b>200</b> - Success Response
     * <p><b>401</b> - Unauthorized.
     * <p><b>406</b> - No Acceptable. Accept header does not contain the expected value &#x60;application/vnd.assembly+json; version&#x3D;1&#x60;.
     * <p><b>429</b> - No Acceptable. Accept header does not contain the expected value &#x60;application/vnd.assembly+json; version&#x3D;1&#x60;.
     * @param resultId ID of the Result as an Integer
     * @param updateResultPayload Payload for update Result request
     * @return Result
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Result patchResultsResultId(String resultId, Result updateResultPayload) throws RestClientException {
        Object postBody = updateResultPayload;
        
        // verify the required parameter 'resultId' is set
        if (resultId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'resultId' when calling patchResultsResultId");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("result_id", resultId);
        String path = UriComponentsBuilder.fromPath("/results/{result_id}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/vnd.assembly+json; version=1"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "oauth2" };

        ParameterizedTypeReference<Result> returnType = new ParameterizedTypeReference<Result>() {};
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
