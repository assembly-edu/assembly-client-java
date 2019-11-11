/*
 * assembly-client-java 1.2.432
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
import education.assembly.platform.spring.models.AttendanceSummary;
import education.assembly.platform.spring.models.BulkResultResponse;
import education.assembly.platform.spring.models.BulkResultsBody;
import education.assembly.platform.spring.models.CalendarEvent;
import education.assembly.platform.spring.models.Closure;
import education.assembly.platform.spring.models.Contact;
import education.assembly.platform.spring.models.DietaryNeed;
import education.assembly.platform.spring.models.Exclusion;
import education.assembly.platform.spring.models.Facet;
import education.assembly.platform.spring.models.GradeSet;
import education.assembly.platform.spring.models.Group;
import education.assembly.platform.spring.models.LearningAim;
import education.assembly.platform.spring.models.Lesson;
import education.assembly.platform.spring.models.MedicalCondition;
import org.threeten.bp.OffsetDateTime;
import education.assembly.platform.spring.models.RegistrationGroup;
import education.assembly.platform.spring.models.Result;
import education.assembly.platform.spring.models.ResultBody;
import education.assembly.platform.spring.models.ResultEntry;
import education.assembly.platform.spring.models.Room;
import education.assembly.platform.spring.models.School;
import education.assembly.platform.spring.models.SchoolStatus;
import education.assembly.platform.spring.models.StaffAbsence;
import education.assembly.platform.spring.models.StaffContract;
import education.assembly.platform.spring.models.StaffMember;
import education.assembly.platform.spring.models.StandardError;
import education.assembly.platform.spring.models.Student;
import education.assembly.platform.spring.models.Subject;
import education.assembly.platform.spring.models.TeachingGroup;
import education.assembly.platform.spring.models.Timetable;
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
     * Update Multiple Results
     * Multiple results can be updated simultaneously by providing the relevant &#x60;result_ids&#x60; in the body of your request. The response will tell you whether the batch of updates has either been successful or failed
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>406</b> - Unsupported Version
     * <p><b>429</b> - Too Many Requests
     * @param bulkResultsBody The bulkResultsBody parameter
     * @return BulkResultResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public BulkResultResponse bulkUpdateResults(BulkResultsBody bulkResultsBody) throws RestClientException {
        Object postBody = bulkResultsBody;
        
        String path = UriComponentsBuilder.fromPath("/results").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/vnd.assembly+json; version=1.1"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "SchoolToken" };

        ParameterizedTypeReference<BulkResultResponse> returnType = new ParameterizedTypeReference<BulkResultResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Write Results
     * Given a &#x60;subject_id&#x60;, &#x60;facet_id&#x60;, &#x60;assessment_point_rank&#x60; and &#x60;assessment_id&#x60; results can be sent to the Platform, along with a &#x60;student_id&#x60;, the &#x60;grade_id&#x60; and (optionally) the &#x60;result_date&#x60;
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>406</b> - Unsupported Version
     * <p><b>429</b> - Too Many Requests
     * @param resultBody The resultBody parameter
     * @return List&lt;Result&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Result> createResult(ResultBody resultBody) throws RestClientException {
        Object postBody = resultBody;
        
        String path = UriComponentsBuilder.fromPath("/results").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/vnd.assembly+json; version=1.1"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "SchoolToken" };

        ParameterizedTypeReference<List<Result>> returnType = new ParameterizedTypeReference<List<Result>>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * View an Academic Year
     * Returns a single academic year for the school associated with the provided &#x60;access_token&#x60;
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not Found
     * <p><b>406</b> - Unsupported Version
     * <p><b>429</b> - Too Many Requests
     * @param id Internal identifier of the entity
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

        String[] authNames = new String[] { "SchoolToken" };

        ParameterizedTypeReference<AcademicYear> returnType = new ParameterizedTypeReference<AcademicYear>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * View an Assessment
     * Returns a single assessment for the given ID
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not Found
     * <p><b>406</b> - Unsupported Version
     * <p><b>429</b> - Too Many Requests
     * @param id Internal identifier of the entity
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

        String[] authNames = new String[] { "SchoolToken" };

        ParameterizedTypeReference<Assessment> returnType = new ParameterizedTypeReference<Assessment>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * View Grade Set for an Assessment
     * Returns a &#x60;grade_set&#x60; (an acceptable list of values) for the assessment identifierentified by the &#x60;assessment_id&#x60;. Grades should be written back to the Platform using the &#x60;grade_id&#x60;
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>406</b> - Unsupported Version
     * <p><b>429</b> - Too Many Requests
     * @param id Internal identifier of the entity
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

        String[] authNames = new String[] { "SchoolToken" };

        ParameterizedTypeReference<GradeSet> returnType = new ParameterizedTypeReference<GradeSet>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * View an Assessment Point
     * Returns a single assessment point for the given rank
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not Found
     * <p><b>406</b> - Unsupported Version
     * <p><b>429</b> - Too Many Requests
     * @param assessmentPointRank The rank of the assessment point as an Integer
     * @return AssessmentPoint
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public AssessmentPoint findAssessmentPoint(Integer assessmentPointRank) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'assessmentPointRank' is set
        if (assessmentPointRank == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'assessmentPointRank' when calling findAssessmentPoint");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("assessment_point_rank", assessmentPointRank);
        String path = UriComponentsBuilder.fromPath("/assessment_points/{assessment_point_rank}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/vnd.assembly+json; version=1.1"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "SchoolToken" };

        ParameterizedTypeReference<AssessmentPoint> returnType = new ParameterizedTypeReference<AssessmentPoint>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * View a Dietary Need
     * Returns a single dietary need for the given ID
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not Found
     * <p><b>406</b> - Unsupported Version
     * <p><b>429</b> - Too Many Requests
     * @param id Internal identifier of the entity
     * @return DietaryNeed
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DietaryNeed findDietaryNeed(Integer id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling findDietaryNeed");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/school/dietary_needs/{id}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/vnd.assembly+json; version=1.1"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "SchoolToken" };

        ParameterizedTypeReference<DietaryNeed> returnType = new ParameterizedTypeReference<DietaryNeed>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * View a Facet
     * Returns a single facet for the given ID
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not Found
     * <p><b>406</b> - Unsupported Version
     * <p><b>429</b> - Too Many Requests
     * @param id Internal identifier of the entity
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

        String[] authNames = new String[] { "SchoolToken" };

        ParameterizedTypeReference<Facet> returnType = new ParameterizedTypeReference<Facet>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * View a Grade Set
     * Returns a single grade set for the given ID
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not Found
     * <p><b>406</b> - Unsupported Version
     * <p><b>429</b> - Too Many Requests
     * @param id Internal identifier of the entity
     * @return GradeSet
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GradeSet findGradeSet(Integer id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling findGradeSet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/grade_sets/{id}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/vnd.assembly+json; version=1.1"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "SchoolToken" };

        ParameterizedTypeReference<GradeSet> returnType = new ParameterizedTypeReference<GradeSet>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * View a Group
     * Returns a list of groups that match the given set of filters
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not Found
     * <p><b>406</b> - Unsupported Version
     * <p><b>429</b> - Too Many Requests
     * @param id Internal identifier of the entity
     * @param date Filter by a specific date, used as the &#x60;start_date&#x60; and &#x60;end_date&#x60; where applicable
     * @return Group
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Group findGroup(Integer id, OffsetDateTime date) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling findGroup");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/groups/{id}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "date", date));

        final String[] accepts = { 
            "application/vnd.assembly+json; version=1.1"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "SchoolToken" };

        ParameterizedTypeReference<Group> returnType = new ParameterizedTypeReference<Group>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * View a Post-16 Learning Aim
     * Returns a Post-16 Learning Aim retrieved by ID
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not Found
     * <p><b>406</b> - Unsupported Version
     * <p><b>429</b> - Too Many Requests
     * @param id Internal identifier of the entity
     * @return LearningAim
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public LearningAim findLearningAim(Integer id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling findLearningAim");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/school/learning_aims/{id}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/vnd.assembly+json; version=1.1"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "SchoolToken" };

        ParameterizedTypeReference<LearningAim> returnType = new ParameterizedTypeReference<LearningAim>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * View a Medical Condition
     * Returns a single medical condition for the given ID
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not Found
     * <p><b>406</b> - Unsupported Version
     * <p><b>429</b> - Too Many Requests
     * @param id Internal identifier of the entity
     * @return MedicalCondition
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public MedicalCondition findMedicalCondition(Integer id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling findMedicalCondition");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/school/medical_conditions/{id}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/vnd.assembly+json; version=1.1"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "SchoolToken" };

        ParameterizedTypeReference<MedicalCondition> returnType = new ParameterizedTypeReference<MedicalCondition>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * View a Registration Group
     * Returns a list of registration groups that match the given set of filters
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not Found
     * <p><b>406</b> - Unsupported Version
     * <p><b>429</b> - Too Many Requests
     * @param id Internal identifier of the entity
     * @param date Filter by a specific date, used as the &#x60;start_date&#x60; and &#x60;end_date&#x60; where applicable
     * @return RegistrationGroup
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public RegistrationGroup findRegistrationGroup(Integer id, OffsetDateTime date) throws RestClientException {
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

        final String[] accepts = { 
            "application/vnd.assembly+json; version=1.1"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "SchoolToken" };

        ParameterizedTypeReference<RegistrationGroup> returnType = new ParameterizedTypeReference<RegistrationGroup>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * View a Room
     * Returns a single room for the school associated with the provided &#x60;access_token&#x60;
     * <p><b>200</b> - Success
     * <p><b>304</b> - Not Modified
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not Found
     * <p><b>406</b> - Unsupported Version
     * <p><b>429</b> - Too Many Requests
     * @param id Internal identifier of the entity
     * @param ifModifiedSince Filter results since it was last fetched (see [Conditional Requests](/#section/Concepts/Conditional-Requests))
     * @param date Filter by a specific date, used as the &#x60;start_date&#x60; and &#x60;end_date&#x60; where applicable
     * @param startDate The start date of the period to filter by
     * @param endDate The end date of the period to filter by
     * @return Room
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Room findRoom(Integer id, OffsetDateTime ifModifiedSince, String date, String startDate, String endDate) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling findRoom");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/rooms/{id}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "date", date));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "start_date", startDate));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "end_date", endDate));

        if (ifModifiedSince != null)
        headerParams.add("If-Modified-Since", apiClient.parameterToString(ifModifiedSince));

        final String[] accepts = { 
            "application/vnd.assembly+json; version=1.1"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "SchoolToken" };

        ParameterizedTypeReference<Room> returnType = new ParameterizedTypeReference<Room>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * View School Details
     * Returns details for the school associated with the provided &#x60;access_token&#x60;
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not Found
     * <p><b>406</b> - Unsupported Version
     * <p><b>429</b> - Too Many Requests
     * @return School
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public School findSchool() throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/school").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/vnd.assembly+json; version=1.1"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "SchoolToken" };

        ParameterizedTypeReference<School> returnType = new ParameterizedTypeReference<School>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * View a Staff Member
     * Returns an individual staff member record for the given ID
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not Found
     * <p><b>406</b> - Unsupported Version
     * <p><b>429</b> - Too Many Requests
     * @param id Internal identifier of the entity
     * @param addresses Include address data
     * @param demographics Include demographics data
     * @param qualifications Include HLTA status, QT status, QT route and previous degree information (requires &#x60;staff_members.qualifications&#x60; scope)
     * @return StaffMember
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public StaffMember findStaffMember(Integer id, Boolean addresses, Boolean demographics, Boolean qualifications) throws RestClientException {
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

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "addresses", addresses));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "demographics", demographics));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "qualifications", qualifications));

        final String[] accepts = { 
            "application/vnd.assembly+json; version=1.1"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "SchoolToken" };

        ParameterizedTypeReference<StaffMember> returnType = new ParameterizedTypeReference<StaffMember>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * View a Student
     * Returns an individual student record for the given ID.  **Note:** the response shown includes student demographics, contacts, student SEN needs, student addresses, photo and student care data but these will only be present if you have permission to access it and pass &#x60;demographics&#x60;, &#x60;contacts&#x60;, &#x60;sen_needs&#x60;, &#x60;addresses&#x60;, &#x60;photo&#x60;, &#x60;care&#x60; and &#x60;ever_in_care&#x60; respectively.  ### Photo Notes When requesting photo information the response includes a &#x60;photo.url&#x60; property, this URL should be treated as confidential and used to download the students photo to your storage system of choice. The URL is *not designed for hotlinking directly in the browser* for end users. URLs are signed and only valid for 1 hour after which time you will receive a 400 error.  Once downloaded to avoid repeatedly syncing unchanged photos you should code your application to compare the &#x60;photo.hash&#x60; property to detect changes in student photos since your last sync, it is guaranteed that changes in a photo will change the hash, however the hash is only intended to be used to detect photo changes and is not guaranteed to match a checksum of the files contents.  Photos are currently provided on an \&quot;as is\&quot; basis straight from the source MIS, this means the format, quality, metadata and dimensions are not guaranteed. We reserve the right to normalise this data in the future but your application should be resistant to differing photo formats. 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not Found
     * <p><b>406</b> - Unsupported Version
     * <p><b>429</b> - Too Many Requests
     * @param id Internal identifier of the entity
     * @param demographics Include demographics data
     * @param contacts Include contacts data
     * @param senNeeds Include SEN needs data
     * @param emails Include email addresses
     * @param addresses Include address data
     * @param care Include student care data (you must also supply the demographics parameter)
     * @param everInCare Include whether the student has ever been in care (you must also supply the demographics parameter)
     * @param languages Include student language data
     * @param photo Include student photo data
     * @return Student
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Student findStudent(Integer id, Boolean demographics, Boolean contacts, Boolean senNeeds, Boolean emails, Boolean addresses, Boolean care, Boolean everInCare, Boolean languages, Boolean photo) throws RestClientException {
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
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "emails", emails));
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

        String[] authNames = new String[] { "SchoolToken" };

        ParameterizedTypeReference<Student> returnType = new ParameterizedTypeReference<Student>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * View a Teaching Group
     * Returns a list of teaching groups that match the given set of filters
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not Found
     * <p><b>406</b> - Unsupported Version
     * <p><b>429</b> - Too Many Requests
     * @param id Internal identifier of the entity
     * @param date Filter by a specific date, used as the &#x60;start_date&#x60; and &#x60;end_date&#x60; where applicable
     * @return TeachingGroup
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TeachingGroup findTeachingGroup(Integer id, OffsetDateTime date) throws RestClientException {
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

        final String[] accepts = { 
            "application/vnd.assembly+json; version=1.1"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "SchoolToken" };

        ParameterizedTypeReference<TeachingGroup> returnType = new ParameterizedTypeReference<TeachingGroup>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * View a Timetable
     * Returns an individual timetable for the given ID.
     * <p><b>200</b> - Success
     * <p><b>304</b> - Not Modified
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not Found
     * <p><b>406</b> - Unsupported Version
     * <p><b>429</b> - Too Many Requests
     * @param id Internal identifier of the entity
     * @param ifModifiedSince Filter results since it was last fetched (see [Conditional Requests](/#section/Concepts/Conditional-Requests))
     * @param date Filter by a specific date, used as the &#x60;start_date&#x60; and &#x60;end_date&#x60; where applicable
     * @param startDate The start date of the period to filter by
     * @param endDate The end date of the period to filter by
     * @return Timetable
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Timetable findTimetable(Integer id, OffsetDateTime ifModifiedSince, OffsetDateTime date, OffsetDateTime startDate, OffsetDateTime endDate) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling findTimetable");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/timetables/{id}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "date", date));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "start_date", startDate));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "end_date", endDate));

        if (ifModifiedSince != null)
        headerParams.add("If-Modified-Since", apiClient.parameterToString(ifModifiedSince));

        final String[] accepts = { 
            "application/vnd.assembly+json; version=1.1"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "SchoolToken" };

        ParameterizedTypeReference<Timetable> returnType = new ParameterizedTypeReference<Timetable>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * View a Year Group
     * Returns a list of year groups that match the given set of filters
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not Found
     * <p><b>406</b> - Unsupported Version
     * <p><b>429</b> - Too Many Requests
     * @param id Internal identifier of the entity
     * @param date Filter by a specific date, used as the &#x60;start_date&#x60; and &#x60;end_date&#x60; where applicable
     * @return YearGroup
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public YearGroup findYearGroup(Integer id, OffsetDateTime date) throws RestClientException {
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

        final String[] accepts = { 
            "application/vnd.assembly+json; version=1.1"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "SchoolToken" };

        ParameterizedTypeReference<YearGroup> returnType = new ParameterizedTypeReference<YearGroup>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * List Academic Years
     * Returns a list of academic years for the school associated with the provided &#x60;access_token&#x60;. The dates of these academic years can be used to filter data in other API endpoints
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>406</b> - Unsupported Version
     * <p><b>429</b> - Too Many Requests
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

        String[] authNames = new String[] { "SchoolToken" };

        ParameterizedTypeReference<List<AcademicYear>> returnType = new ParameterizedTypeReference<List<AcademicYear>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * View Results for an Assessment Point
     * Returns a list of results for the given &#x60;assessment_point_rank&#x60; and students
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>406</b> - Unsupported Version
     * <p><b>429</b> - Too Many Requests
     * @param assessmentPointRank The rank of the assessment point as an Integer
     * @param students ID(s) of the student(s) as an Integer. Multiple IDs can be separated with a space (so a + URL encoded)
     * @param perPage Number of results to return
     * @param page Page number to return
     * @return List&lt;Result&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Result> getAssessmentPointResults(Integer assessmentPointRank, List<Integer> students, Integer perPage, Integer page) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'assessmentPointRank' is set
        if (assessmentPointRank == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'assessmentPointRank' when calling getAssessmentPointResults");
        }
        
        // verify the required parameter 'students' is set
        if (students == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'students' when calling getAssessmentPointResults");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("assessment_point_rank", assessmentPointRank);
        String path = UriComponentsBuilder.fromPath("/assessment_points/{assessment_point_rank}/results").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase()), "students[]", students));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "per_page", perPage));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));

        final String[] accepts = { 
            "application/vnd.assembly+json; version=1.1"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "SchoolToken" };

        ParameterizedTypeReference<List<Result>> returnType = new ParameterizedTypeReference<List<Result>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * List Assessment Points
     * Returns a list of assessment points. An &#x60;assessment_point&#x60; object represents a point in the school key stage, year, term or half-term that results can be attached to. When sending results back to the Platform, the &#x60;assessment_point_rank&#x60; should be used - this will remain constant across all environments
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>406</b> - Unsupported Version
     * <p><b>429</b> - Too Many Requests
     * @param yearCode Filter by school year
     * @param type Filter by type
     * @param perPage Number of results to return
     * @param page Page number to return
     * @return List&lt;AssessmentPoint&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<AssessmentPoint> getAssessmentPoints(Integer yearCode, String type, Integer perPage, Integer page) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/assessment_points").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "year_code", yearCode));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "type", type));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "per_page", perPage));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));

        final String[] accepts = { 
            "application/vnd.assembly+json; version=1.1"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "SchoolToken" };

        ParameterizedTypeReference<List<AssessmentPoint>> returnType = new ParameterizedTypeReference<List<AssessmentPoint>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * View Results for an Assessment
     * Returns a list of results for the given &#x60;assessment_id&#x60; and students. For a full list of national assessment data (Key stage 1 and 2 SATs results) available on the Platform, please see this [support article](http://help.assembly.education/article/89-getting-prior-attainment-from-the-platform)
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>406</b> - Unsupported Version
     * <p><b>429</b> - Too Many Requests
     * @param id Internal identifier of the entity
     * @param students ID(s) of the student(s) as an Integer. Multiple IDs can be separated with a space (so a + URL encoded)
     * @param perPage Number of results to return
     * @param page Page number to return
     * @return List&lt;Result&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Result> getAssessmentResults(Integer id, List<Integer> students, Integer perPage, Integer page) throws RestClientException {
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
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "per_page", perPage));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));

        final String[] accepts = { 
            "application/vnd.assembly+json; version=1.1"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "SchoolToken" };

        ParameterizedTypeReference<List<Result>> returnType = new ParameterizedTypeReference<List<Result>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * List Assessments
     * Returns a list of assessment objects. The assessment is the grouping that knits together a range of concepts. The name of the assessment also refers to the source of the result
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>406</b> - Unsupported Version
     * <p><b>429</b> - Too Many Requests
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

        String[] authNames = new String[] { "SchoolToken" };

        ParameterizedTypeReference<List<Assessment>> returnType = new ParameterizedTypeReference<List<Assessment>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * List Attendance Summaries
     * Returns a list of attendance summaries
     * <p><b>200</b> - Success
     * <p><b>304</b> - Not Modified
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>406</b> - Unsupported Version
     * <p><b>429</b> - Too Many Requests
     * @param ifModifiedSince Filter results since it was last fetched (see [Conditional Requests](/#section/Concepts/Conditional-Requests))
     * @param studentId Filter to the specified student
     * @param registrationGroupId ID of a registration group
     * @param groupId Filter to the specified group
     * @param academicYearId Include all groups and group memberships from the specified academic year
     * @param perPage Number of results to return
     * @param page Page number to return
     * @return List&lt;AttendanceSummary&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<AttendanceSummary> getAttendanceSummaries(OffsetDateTime ifModifiedSince, Integer studentId, Integer registrationGroupId, Integer groupId, Integer academicYearId, Integer perPage, Integer page) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/attendances/summaries").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "student_id", studentId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "registration_group_id", registrationGroupId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "group_id", groupId));
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

        String[] authNames = new String[] { "SchoolToken" };

        ParameterizedTypeReference<List<AttendanceSummary>> returnType = new ParameterizedTypeReference<List<AttendanceSummary>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * List Attendances
     * Returns a list of attendances. By default, attendances are returned from the start to the end of the current week
     * <p><b>200</b> - Success
     * <p><b>304</b> - Not Modified
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>406</b> - Unsupported Version
     * <p><b>429</b> - Too Many Requests
     * @param ifModifiedSince Filter results since it was last fetched (see [Conditional Requests](/#section/Concepts/Conditional-Requests))
     * @param studentId Filter to the specified student
     * @param registrationGroupId ID of a registration group
     * @param groupId Filter to the specified group
     * @param startDate The start date of the period to filter by
     * @param endDate The end date of the period to filter by
     * @param perPage Number of results to return
     * @param page Page number to return
     * @return List&lt;Attendance&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Attendance> getAttendances(OffsetDateTime ifModifiedSince, Integer studentId, Integer registrationGroupId, Integer groupId, OffsetDateTime startDate, OffsetDateTime endDate, Integer perPage, Integer page) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/attendances").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "student_id", studentId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "registration_group_id", registrationGroupId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "group_id", groupId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "start_date", startDate));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "end_date", endDate));
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

        String[] authNames = new String[] { "SchoolToken" };

        ParameterizedTypeReference<List<Attendance>> returnType = new ParameterizedTypeReference<List<Attendance>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * List Calendar Events
     * Returns a list of calendar events from the school calendar. This category includes items such as staff meetings and school assembly times as you can see from the sample response below
     * <p><b>200</b> - Success
     * <p><b>304</b> - Not Modified
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>406</b> - Unsupported Version
     * <p><b>429</b> - Too Many Requests
     * @param ifModifiedSince Filter results since it was last fetched (see [Conditional Requests](/#section/Concepts/Conditional-Requests))
     * @param type Filter by type
     * @param perPage Number of results to return
     * @param page Page number to return
     * @return List&lt;CalendarEvent&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<CalendarEvent> getCalendarEvents(OffsetDateTime ifModifiedSince, String type, Integer perPage, Integer page) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/calendar_events").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "type", type));
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

        String[] authNames = new String[] { "SchoolToken" };

        ParameterizedTypeReference<List<CalendarEvent>> returnType = new ParameterizedTypeReference<List<CalendarEvent>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * List Closures For a Room
     * Returns a list of room closures for the school associated with the provided &#x60;access_token&#x60;.
     * <p><b>200</b> - Success
     * <p><b>304</b> - Not Modified
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>406</b> - Unsupported Version
     * <p><b>429</b> - Too Many Requests
     * @param id Internal identifier of the entity
     * @param ifModifiedSince Filter results since it was last fetched (see [Conditional Requests](/#section/Concepts/Conditional-Requests))
     * @param date Filter by a specific date, used as the &#x60;start_date&#x60; and &#x60;end_date&#x60; where applicable
     * @param startDate The start date of the period to filter by
     * @param endDate The end date of the period to filter by
     * @return List&lt;Closure&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Closure> getClosures(Integer id, OffsetDateTime ifModifiedSince, OffsetDateTime date, OffsetDateTime startDate, OffsetDateTime endDate) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getClosures");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/rooms/{id}/closures").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "date", date));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "start_date", startDate));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "end_date", endDate));

        if (ifModifiedSince != null)
        headerParams.add("If-Modified-Since", apiClient.parameterToString(ifModifiedSince));

        final String[] accepts = { 
            "application/vnd.assembly+json; version=1.1"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "SchoolToken" };

        ParameterizedTypeReference<List<Closure>> returnType = new ParameterizedTypeReference<List<Closure>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * List Contacts
     * Returns a list of contacts that match the given set of filters
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>406</b> - Unsupported Version
     * <p><b>429</b> - Too Many Requests
     * @param studentId Filter to the specified student
     * @param addresses Include address data
     * @param perPage Number of results to return
     * @param page Page number to return
     * @return List&lt;Contact&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Contact> getContacts(Integer studentId, Boolean addresses, Integer perPage, Integer page) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/contacts").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "student_id", studentId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "addresses", addresses));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "per_page", perPage));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));

        final String[] accepts = { 
            "application/vnd.assembly+json; version=1.1"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "SchoolToken" };

        ParameterizedTypeReference<List<Contact>> returnType = new ParameterizedTypeReference<List<Contact>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * List Dietary Needs
     * Returns a list of all the Dietary Needs defined by the school
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>406</b> - Unsupported Version
     * <p><b>429</b> - Too Many Requests
     * @param perPage Number of results to return
     * @param page Page number to return
     * @return List&lt;DietaryNeed&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<DietaryNeed> getDietaryNeeds(Integer perPage, Integer page) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/school/dietary_needs").build().toUriString();

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

        String[] authNames = new String[] { "SchoolToken" };

        ParameterizedTypeReference<List<DietaryNeed>> returnType = new ParameterizedTypeReference<List<DietaryNeed>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * List Exclusions
     * Returns a list of exclusions. *By default, exclusions are returned that occurred during the current academic year.*
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>406</b> - Unsupported Version
     * <p><b>429</b> - Too Many Requests
     * @param studentId Filter to the specified student
     * @param startDate The start date of the period to filter by
     * @param endDate The end date of the period to filter by
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

        String[] authNames = new String[] { "SchoolToken" };

        ParameterizedTypeReference<List<Exclusion>> returnType = new ParameterizedTypeReference<List<Exclusion>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * List Facets
     * Returns a list of facets. The facet is used to reflect a different type of grade and allows 2 grades of the same assessment to be compared
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>406</b> - Unsupported Version
     * <p><b>429</b> - Too Many Requests
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

        String[] authNames = new String[] { "SchoolToken" };

        ParameterizedTypeReference<List<Facet>> returnType = new ParameterizedTypeReference<List<Facet>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * List Grade Sets
     * Returns a list of grade sets
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>406</b> - Unsupported Version
     * <p><b>429</b> - Too Many Requests
     * @param perPage Number of results to return
     * @param page Page number to return
     * @return List&lt;GradeSet&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<GradeSet> getGradeSets(Integer perPage, Integer page) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/grade_sets").build().toUriString();

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

        String[] authNames = new String[] { "SchoolToken" };

        ParameterizedTypeReference<List<GradeSet>> returnType = new ParameterizedTypeReference<List<GradeSet>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * List Students for Group
     * Returns a list of all the students that are present in the group identified by &#x60;group_id&#x60;
     * <p><b>200</b> - Success
     * <p><b>304</b> - Not Modified
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>406</b> - Unsupported Version
     * <p><b>429</b> - Too Many Requests
     * @param id Internal identifier of the entity
     * @param ifModifiedSince Filter results since it was last fetched (see [Conditional Requests](/#section/Concepts/Conditional-Requests))
     * @param academicYearId Include all groups and group memberships from the specified academic year
     * @param date Filter by a specific date, used as the &#x60;start_date&#x60; and &#x60;end_date&#x60; where applicable
     * @param yearCode Filter by school year
     * @param demographics Include demographics data
     * @param contacts Include contacts data
     * @param senNeeds Include SEN needs data
     * @param emails Include email addresses
     * @param addresses Include address data
     * @param care Include student care data (you must also supply the demographics parameter)
     * @param everInCare Include whether the student has ever been in care (you must also supply the demographics parameter)
     * @param languages Include student language data
     * @param photo Include student photo data
     * @return List&lt;Student&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Student> getGroupStudents(Integer id, OffsetDateTime ifModifiedSince, Integer academicYearId, String date, String yearCode, Boolean demographics, Boolean contacts, Boolean senNeeds, Boolean emails, Boolean addresses, Boolean care, Boolean everInCare, Boolean languages, Boolean photo) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getGroupStudents");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/groups/{id}/students").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "academic_year_id", academicYearId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "date", date));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "year_code", yearCode));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "demographics", demographics));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "contacts", contacts));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "sen_needs", senNeeds));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "emails", emails));
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

        String[] authNames = new String[] { "SchoolToken" };

        ParameterizedTypeReference<List<Student>> returnType = new ParameterizedTypeReference<List<Student>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * List Groups
     * Returns a list of groups that match the given set of filters.  If a date parameter is provided then the list of groups returned is filtered to only those where the provided date falls between the groups &#x60;start_date&#x60; and &#x60;end_date&#x60;. Additionally when a date parameter is provided &#x60;student_ids&#x60; and &#x60;supervior_ids&#x60; are restricted to only those students who were enrolled in the group on the given date. 
     * <p><b>200</b> - Success
     * <p><b>304</b> - Not Modified
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>406</b> - Unsupported Version
     * <p><b>429</b> - Too Many Requests
     * @param ifModifiedSince Filter results since it was last fetched (see [Conditional Requests](/#section/Concepts/Conditional-Requests))
     * @param yearCode Filter by school year
     * @param date Filter by a specific date, used as the &#x60;start_date&#x60; and &#x60;end_date&#x60; where applicable
     * @param academicYearId Include all groups and group memberships from the specified academic year
     * @param type Filter by type
     * @param perPage Number of results to return
     * @param page Page number to return
     * @return List&lt;Group&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Group> getGroups(OffsetDateTime ifModifiedSince, String yearCode, OffsetDateTime date, Integer academicYearId, String type, Integer perPage, Integer page) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/groups").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "year_code", yearCode));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "date", date));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "academic_year_id", academicYearId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "type", type));
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

        String[] authNames = new String[] { "SchoolToken" };

        ParameterizedTypeReference<List<Group>> returnType = new ParameterizedTypeReference<List<Group>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * List Post-16 Learning Aims
     * Returns a list of Post-16 Learning Aims defined within the school
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>406</b> - Unsupported Version
     * <p><b>429</b> - Too Many Requests
     * @param perPage Number of results to return
     * @param page Page number to return
     * @return List&lt;LearningAim&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<LearningAim> getLearningAims(Integer perPage, Integer page) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/school/learning_aims").build().toUriString();

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

        String[] authNames = new String[] { "SchoolToken" };

        ParameterizedTypeReference<List<LearningAim>> returnType = new ParameterizedTypeReference<List<LearningAim>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * List Left Staff Members
     * Returns a list of staff members who have left the school
     * <p><b>200</b> - Success
     * <p><b>304</b> - Not Modified
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>406</b> - Unsupported Version
     * <p><b>429</b> - Too Many Requests
     * @param ifModifiedSince Filter results since it was last fetched (see [Conditional Requests](/#section/Concepts/Conditional-Requests))
     * @param teachersOnly Filter to staff who are teachers
     * @param addresses Include address data
     * @param demographics Include demographics data
     * @param qualifications Include HLTA status, QT status, QT route and previous degree information (requires &#x60;staff_members.qualifications&#x60; scope)
     * @param perPage Number of results to return
     * @param page Page number to return
     * @return List&lt;StaffMember&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<StaffMember> getLeftStaffMembers(OffsetDateTime ifModifiedSince, Boolean teachersOnly, Boolean addresses, Boolean demographics, Boolean qualifications, Integer perPage, Integer page) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/staff_members/left").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "teachers_only", teachersOnly));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "addresses", addresses));
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

        String[] authNames = new String[] { "SchoolToken" };

        ParameterizedTypeReference<List<StaffMember>> returnType = new ParameterizedTypeReference<List<StaffMember>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * List Left Students
     * Returns a list of students who have left the school
     * <p><b>200</b> - Success
     * <p><b>304</b> - Not Modified
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>406</b> - Unsupported Version
     * <p><b>429</b> - Too Many Requests
     * @param ifModifiedSince Filter results since it was last fetched (see [Conditional Requests](/#section/Concepts/Conditional-Requests))
     * @param perPage Number of results to return
     * @param page Page number to return
     * @return List&lt;Student&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Student> getLeftStudents(OffsetDateTime ifModifiedSince, Integer perPage, Integer page) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/students/left").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

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

        String[] authNames = new String[] { "SchoolToken" };

        ParameterizedTypeReference<List<Student>> returnType = new ParameterizedTypeReference<List<Student>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * List Lessons For a Room
     * Returns a list of lessons in a room for the school associated with the provided &#x60;access_token&#x60;.
     * <p><b>200</b> - Success
     * <p><b>304</b> - Not Modified
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>406</b> - Unsupported Version
     * <p><b>429</b> - Too Many Requests
     * @param id Internal identifier of the entity
     * @param ifModifiedSince Filter results since it was last fetched (see [Conditional Requests](/#section/Concepts/Conditional-Requests))
     * @param date Filter by a specific date, used as the &#x60;start_date&#x60; and &#x60;end_date&#x60; where applicable
     * @param startDate The start date of the period to filter by
     * @param endDate The end date of the period to filter by
     * @param perPage Number of results to return
     * @param page Page number to return
     * @return List&lt;Lesson&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Lesson> getLessons(Integer id, OffsetDateTime ifModifiedSince, OffsetDateTime date, OffsetDateTime startDate, OffsetDateTime endDate, Integer perPage, Integer page) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getLessons");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/rooms/{id}/lessons").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "date", date));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "start_date", startDate));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "end_date", endDate));
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

        String[] authNames = new String[] { "SchoolToken" };

        ParameterizedTypeReference<List<Lesson>> returnType = new ParameterizedTypeReference<List<Lesson>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * List Medical Conditions
     * Returns a list of all the Medical Conditions defined by the school
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>406</b> - Unsupported Version
     * <p><b>429</b> - Too Many Requests
     * @param perPage Number of results to return
     * @param page Page number to return
     * @return List&lt;MedicalCondition&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<MedicalCondition> getMedicalConditions(Integer perPage, Integer page) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/school/medical_conditions").build().toUriString();

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

        String[] authNames = new String[] { "SchoolToken" };

        ParameterizedTypeReference<List<MedicalCondition>> returnType = new ParameterizedTypeReference<List<MedicalCondition>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * List Students for Registration Group
     * Returns a list of all the students that are present in the registration group identified by &#x60;group_id&#x60;
     * <p><b>200</b> - Success
     * <p><b>304</b> - Not Modified
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>406</b> - Unsupported Version
     * <p><b>429</b> - Too Many Requests
     * @param id Internal identifier of the entity
     * @param ifModifiedSince Filter results since it was last fetched (see [Conditional Requests](/#section/Concepts/Conditional-Requests))
     * @param date Filter by a specific date, used as the &#x60;start_date&#x60; and &#x60;end_date&#x60; where applicable
     * @param yearCode Filter by school year
     * @param demographics Include demographics data
     * @param contacts Include contacts data
     * @param senNeeds Include SEN needs data
     * @param emails Include email addresses
     * @param addresses Include address data
     * @param care Include student care data (you must also supply the demographics parameter)
     * @param everInCare Include whether the student has ever been in care (you must also supply the demographics parameter)
     * @param languages Include student language data
     * @param photo Include student photo data
     * @param perPage Number of results to return
     * @param page Page number to return
     * @return List&lt;Student&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Student> getRegistrationGroupStudents(Integer id, OffsetDateTime ifModifiedSince, OffsetDateTime date, Integer yearCode, Boolean demographics, Boolean contacts, Boolean senNeeds, Boolean emails, Boolean addresses, Boolean care, Boolean everInCare, Boolean languages, Boolean photo, Integer perPage, Integer page) throws RestClientException {
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
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "year_code", yearCode));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "demographics", demographics));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "contacts", contacts));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "sen_needs", senNeeds));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "emails", emails));
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

        String[] authNames = new String[] { "SchoolToken" };

        ParameterizedTypeReference<List<Student>> returnType = new ParameterizedTypeReference<List<Student>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * List Registration Groups
     * Returns a list of registration groups that match the given set of filters.  If a date parameter is provided then the list of groups returned is filtered to only those where the provided date falls between the groups &#x60;start_date&#x60; and &#x60;end_date&#x60;. Additionally when a date parameter is provided &#x60;student_ids&#x60; and &#x60;supervior_ids&#x60; are restricted to only those students who were enrolled in the group on the given date. 
     * <p><b>200</b> - Success
     * <p><b>304</b> - Not Modified
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>406</b> - Unsupported Version
     * <p><b>429</b> - Too Many Requests
     * @param ifModifiedSince Filter results since it was last fetched (see [Conditional Requests](/#section/Concepts/Conditional-Requests))
     * @param yearCode Filter by school year
     * @param date Filter by a specific date, used as the &#x60;start_date&#x60; and &#x60;end_date&#x60; where applicable
     * @param academicYearId Include all groups and group memberships from the specified academic year
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

        String[] authNames = new String[] { "SchoolToken" };

        ParameterizedTypeReference<List<RegistrationGroup>> returnType = new ParameterizedTypeReference<List<RegistrationGroup>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * List Results
     * Returns a list of results for the student ID(s) specified by the students parameter
     * <p><b>200</b> - Success
     * <p><b>304</b> - Not Modified
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>406</b> - Unsupported Version
     * <p><b>429</b> - Too Many Requests
     * @param students ID(s) of the student(s) as an Integer. Multiple IDs can be separated with a space (so a + URL encoded)
     * @param ifModifiedSince Filter results since it was last fetched (see [Conditional Requests](/#section/Concepts/Conditional-Requests))
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

        String[] authNames = new String[] { "SchoolToken" };

        ParameterizedTypeReference<List<Result>> returnType = new ParameterizedTypeReference<List<Result>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * List Rooms
     * Returns a list of rooms for the school associated with the provided &#x60;access_token&#x60;.
     * <p><b>200</b> - Success
     * <p><b>304</b> - Not Modified
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>406</b> - Unsupported Version
     * <p><b>429</b> - Too Many Requests
     * @param ifModifiedSince Filter results since it was last fetched (see [Conditional Requests](/#section/Concepts/Conditional-Requests))
     * @param perPage Number of results to return
     * @param page Page number to return
     * @return List&lt;Room&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Room> getRooms(OffsetDateTime ifModifiedSince, Integer perPage, Integer page) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/rooms").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

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

        String[] authNames = new String[] { "SchoolToken" };

        ParameterizedTypeReference<List<Room>> returnType = new ParameterizedTypeReference<List<Room>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * List Staff Absences
     * Returns a list of staff member absences for the school accociated with the provided &#x60;access_token&#x60;. A school level access token with the &#x60;staff_members.absences&#x60; scope is required to access staff member absence information
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>406</b> - Unsupported Version
     * <p><b>429</b> - Too Many Requests
     * @param staffMemberId Filter to the specified staff member
     * @param startDate The start date of the period to filter by
     * @param endDate The end date of the period to filter by
     * @param perPage Number of results to return
     * @param page Page number to return
     * @return List&lt;StaffAbsence&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<StaffAbsence> getStaffAbsences(Integer staffMemberId, OffsetDateTime startDate, OffsetDateTime endDate, Integer perPage, Integer page) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/staff_absences").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "staff_member_id", staffMemberId));
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

        String[] authNames = new String[] { "SchoolToken" };

        ParameterizedTypeReference<List<StaffAbsence>> returnType = new ParameterizedTypeReference<List<StaffAbsence>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * List Staff Contracts
     * Returns a list of staff member contracts for the school accociated with the provided &#x60;access_token&#x60;. A school level access token with the &#x60;staff_members.contracts&#x60; scope is required to access staff member contract information
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>406</b> - Unsupported Version
     * <p><b>429</b> - Too Many Requests
     * @param staffMemberId Filter to the specified staff member
     * @param date Filter by a specific date, used as the &#x60;start_date&#x60; and &#x60;end_date&#x60; where applicable
     * @param roles Include role information along with a staff contract
     * @param salaries Include salaries information along with a staff contract (requires &#x60;staff_members.salaries&#x60; scope for full information - only the &#x60;hours_per_week&#x60;, &#x60;fte&#x60; and &#x60;weeks_per_year&#x60; fields are shown without it)
     * @param allowances Include allowances information along with a staff contract (requires &#x60;staff_members.salaries&#x60; scope)
     * @param perPage Number of results to return
     * @param page Page number to return
     * @return List&lt;StaffContract&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<StaffContract> getStaffContracts(Integer staffMemberId, String date, Boolean roles, Boolean salaries, Boolean allowances, Integer perPage, Integer page) throws RestClientException {
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

        final String[] accepts = { 
            "application/vnd.assembly+json; version=1.1"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "SchoolToken" };

        ParameterizedTypeReference<List<StaffContract>> returnType = new ParameterizedTypeReference<List<StaffContract>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * List Staff Members
     * Returns a list of staff members for the school accociated with the provided &#x60;access_token&#x60;
     * <p><b>200</b> - Success
     * <p><b>304</b> - Not Modified
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>406</b> - Unsupported Version
     * <p><b>429</b> - Too Many Requests
     * @param ifModifiedSince Filter results since it was last fetched (see [Conditional Requests](/#section/Concepts/Conditional-Requests))
     * @param teachersOnly Filter to staff who are teachers
     * @param addresses Include address data
     * @param demographics Include demographics data
     * @param qualifications Include HLTA status, QT status, QT route and previous degree information (requires &#x60;staff_members.qualifications&#x60; scope)
     * @param perPage Number of results to return
     * @param page Page number to return
     * @return List&lt;StaffMember&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<StaffMember> getStaffMembers(OffsetDateTime ifModifiedSince, Boolean teachersOnly, Boolean addresses, Boolean demographics, Boolean qualifications, Integer perPage, Integer page) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/staff_members").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "teachers_only", teachersOnly));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "addresses", addresses));
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

        String[] authNames = new String[] { "SchoolToken" };

        ParameterizedTypeReference<List<StaffMember>> returnType = new ParameterizedTypeReference<List<StaffMember>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * List Students
     * Returns a list of students for the school associated with the provided &#x60;access_token&#x60;
     * <p><b>200</b> - Success
     * <p><b>304</b> - Not Modified
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>406</b> - Unsupported Version
     * <p><b>429</b> - Too Many Requests
     * @param ifModifiedSince Filter results since it was last fetched (see [Conditional Requests](/#section/Concepts/Conditional-Requests))
     * @param students ID(s) of the student(s) as an Integer. Multiple IDs can be separated with a space (so a + URL encoded)
     * @param date Filter by a specific date, used as the &#x60;start_date&#x60; and &#x60;end_date&#x60; where applicable
     * @param yearCode Filter by school year
     * @param demographics Include demographics data
     * @param contacts Include contacts data
     * @param senNeeds Include SEN needs data
     * @param emails Include email addresses
     * @param addresses Include address data
     * @param care Include student care data (you must also supply the demographics parameter)
     * @param everInCare Include whether the student has ever been in care (you must also supply the demographics parameter)
     * @param languages Include student language data
     * @param photo Include student photo data
     * @param perPage Number of results to return
     * @param page Page number to return
     * @return List&lt;Student&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Student> getStudents(OffsetDateTime ifModifiedSince, List<Integer> students, OffsetDateTime date, String yearCode, Boolean demographics, Boolean contacts, Boolean senNeeds, Boolean emails, Boolean addresses, Boolean care, Boolean everInCare, Boolean languages, Boolean photo, Integer perPage, Integer page) throws RestClientException {
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
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "emails", emails));
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

        String[] authNames = new String[] { "SchoolToken" };

        ParameterizedTypeReference<List<Student>> returnType = new ParameterizedTypeReference<List<Student>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * List Subjects
     * Returns a list of the Assembly Platform&#39;s subjects
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>406</b> - Unsupported Version
     * <p><b>429</b> - Too Many Requests
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

        String[] authNames = new String[] { "SchoolToken" };

        ParameterizedTypeReference<List<Subject>> returnType = new ParameterizedTypeReference<List<Subject>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * List Students for Teaching Group
     * Returns a list of all the students that are present in the teaching group identified by &#x60;group_id&#x60;
     * <p><b>200</b> - Success
     * <p><b>304</b> - Not Modified
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>406</b> - Unsupported Version
     * <p><b>429</b> - Too Many Requests
     * @param id Internal identifier of the entity
     * @param ifModifiedSince Filter results since it was last fetched (see [Conditional Requests](/#section/Concepts/Conditional-Requests))
     * @param academicYearId Include all groups and group memberships from the specified academic year
     * @param date Filter by a specific date, used as the &#x60;start_date&#x60; and &#x60;end_date&#x60; where applicable
     * @param yearCode Filter by school year
     * @param demographics Include demographics data
     * @param contacts Include contacts data
     * @param senNeeds Include SEN needs data
     * @param emails Include email addresses
     * @param addresses Include address data
     * @param care Include student care data (you must also supply the demographics parameter)
     * @param everInCare Include whether the student has ever been in care (you must also supply the demographics parameter)
     * @param languages Include student language data
     * @param photo Include student photo data
     * @param perPage Number of results to return
     * @param page Page number to return
     * @return List&lt;Student&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Student> getTeachingGroupStudents(Integer id, OffsetDateTime ifModifiedSince, Integer academicYearId, String date, Integer yearCode, Boolean demographics, Boolean contacts, Boolean senNeeds, Boolean emails, Boolean addresses, Boolean care, Boolean everInCare, Boolean languages, Boolean photo, Integer perPage, Integer page) throws RestClientException {
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

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "academic_year_id", academicYearId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "date", date));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "year_code", yearCode));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "demographics", demographics));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "contacts", contacts));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "sen_needs", senNeeds));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "emails", emails));
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

        String[] authNames = new String[] { "SchoolToken" };

        ParameterizedTypeReference<List<Student>> returnType = new ParameterizedTypeReference<List<Student>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * List Teaching Groups
     * Returns a list of teaching groups that match the given set of filters.  If a date parameter is provided then the list of groups returned is filtered to only those where the provided date falls between the groups start_date and end_date. Additionally when a date parameter is provided student_ids and supervior_ids are restricted to only those students who were enrolled in the group on the given date. 
     * <p><b>200</b> - Success
     * <p><b>304</b> - Not Modified
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>406</b> - Unsupported Version
     * <p><b>429</b> - Too Many Requests
     * @param ifModifiedSince Filter results since it was last fetched (see [Conditional Requests](/#section/Concepts/Conditional-Requests))
     * @param subjectCode Filter by subject
     * @param yearCode Filter by school year
     * @param date Filter by a specific date, used as the &#x60;start_date&#x60; and &#x60;end_date&#x60; where applicable
     * @param academicYearId Include all groups and group memberships from the specified academic year
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

        String[] authNames = new String[] { "SchoolToken" };

        ParameterizedTypeReference<List<TeachingGroup>> returnType = new ParameterizedTypeReference<List<TeachingGroup>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * List Timetables
     * Returns a list of timetables that match the given set of filters.  If a date parameter is provided then the list of groups returned is filtered to only those where the provided date falls between the groups start_date and end_date. Additionally when a date parameter is provided student_ids and supervior_ids are restricted to only those students who were enrolled in the group on the given date. 
     * <p><b>200</b> - Success
     * <p><b>304</b> - Not Modified
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>406</b> - Unsupported Version
     * <p><b>429</b> - Too Many Requests
     * @param ifModifiedSince Filter results since it was last fetched (see [Conditional Requests](/#section/Concepts/Conditional-Requests))
     * @param perPage Number of results to return
     * @param page Page number to return
     * @return List&lt;Timetable&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Timetable> getTimetables(OffsetDateTime ifModifiedSince, Integer perPage, Integer page) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/timetables").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

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

        String[] authNames = new String[] { "SchoolToken" };

        ParameterizedTypeReference<List<Timetable>> returnType = new ParameterizedTypeReference<List<Timetable>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * List Students for Year Group
     * Returns a list of all the students that are present in the year group identified by &#x60;group_id&#x60;
     * <p><b>200</b> - Success
     * <p><b>304</b> - Not Modified
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>406</b> - Unsupported Version
     * <p><b>429</b> - Too Many Requests
     * @param id Internal identifier of the entity
     * @param ifModifiedSince Filter results since it was last fetched (see [Conditional Requests](/#section/Concepts/Conditional-Requests))
     * @param date Filter by a specific date, used as the &#x60;start_date&#x60; and &#x60;end_date&#x60; where applicable
     * @param demographics Include demographics data
     * @param contacts Include contacts data
     * @param senNeeds Include SEN needs data
     * @param emails Include email addresses
     * @param addresses Include address data
     * @param care Include student care data (you must also supply the demographics parameter)
     * @param everInCare Include whether the student has ever been in care (you must also supply the demographics parameter)
     * @param languages Include student language data
     * @param photo Include student photo data
     * @param perPage Number of results to return
     * @param page Page number to return
     * @return List&lt;Student&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Student> getYearGroupStudents(Integer id, OffsetDateTime ifModifiedSince, OffsetDateTime date, Boolean demographics, Boolean contacts, Boolean senNeeds, Boolean emails, Boolean addresses, Boolean care, Boolean everInCare, Boolean languages, Boolean photo, Integer perPage, Integer page) throws RestClientException {
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
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "demographics", demographics));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "contacts", contacts));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "sen_needs", senNeeds));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "emails", emails));
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

        String[] authNames = new String[] { "SchoolToken" };

        ParameterizedTypeReference<List<Student>> returnType = new ParameterizedTypeReference<List<Student>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * List Year Groups
     * Returns a list of year groups that match the given set of filters.  If a date parameter is provided then the list of groups returned is filtered to only those where the provided date falls between the groups &#x60;start_date&#x60; and &#x60;end_date&#x60;. Additionally when a date parameter is provided &#x60;student_ids&#x60; and &#x60;supervior_ids&#x60; are restricted to only those students who were enrolled in the group on the given date. 
     * <p><b>200</b> - Success
     * <p><b>304</b> - Not Modified
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>406</b> - Unsupported Version
     * <p><b>429</b> - Too Many Requests
     * @param ifModifiedSince Filter results since it was last fetched (see [Conditional Requests](/#section/Concepts/Conditional-Requests))
     * @param date Filter by a specific date, used as the &#x60;start_date&#x60; and &#x60;end_date&#x60; where applicable
     * @param yearCode Filter by school year
     * @param academicYearId Include all groups and group memberships from the specified academic year
     * @param perPage Number of results to return
     * @param page Page number to return
     * @return List&lt;YearGroup&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<YearGroup> getYearGroups(OffsetDateTime ifModifiedSince, OffsetDateTime date, String yearCode, Integer academicYearId, Integer perPage, Integer page) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/year_groups").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "date", date));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "year_code", yearCode));
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

        String[] authNames = new String[] { "SchoolToken" };

        ParameterizedTypeReference<List<YearGroup>> returnType = new ParameterizedTypeReference<List<YearGroup>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * View School Sync Status
     * Returns status for the school associated with the provided &#x60;access_token&#x60;
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>406</b> - Unsupported Version
     * <p><b>429</b> - Too Many Requests
     * @return SchoolStatus
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SchoolStatus status() throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/school/status").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/vnd.assembly+json; version=1.1"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "SchoolToken" };

        ParameterizedTypeReference<SchoolStatus> returnType = new ParameterizedTypeReference<SchoolStatus>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Update a Single Result
     * Once a result has been created, it can be updated on the Platform by passing the required field values in the request body. A list of the fields that were changed are returned in the response
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>406</b> - Unsupported Version
     * <p><b>429</b> - Too Many Requests
     * @param id Internal identifier of the entity
     * @param resultEntry The resultEntry parameter
     * @return Result
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Result updateResults(Integer id, ResultEntry resultEntry) throws RestClientException {
        Object postBody = resultEntry;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling updateResults");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/results/{id}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/vnd.assembly+json; version=1.1"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "SchoolToken" };

        ParameterizedTypeReference<Result> returnType = new ParameterizedTypeReference<Result>() {};
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
