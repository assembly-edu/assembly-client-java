# Java SDK for the Assembly API
## Description
# Introduction  The Assembly API gives developers access to information about their applications and school data they have been authorised to access.  The Assembly API is built around REST and a collection of open standards/protocols in order to comply with as many consumers as possible. We recommend that developers wishing to work with our APIs are familiar with the following technologies before continuing:  - [HTTP / REST](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol) All communication is handled over HTTPS using standard HTTP verbs, status codes and headers. - [JSON](http://json.org/) All response bodies are returned in JSON format. - [OAuth](http://tools.ietf.org/html/rfc6749) Authorisation is handled via OAuth 2.0. - [Bearer Tokens](http://tools.ietf.org/html/draft-ietf-oauth-v2-bearer-06) Resource Authentication is managed with Bearer Tokens.  This site will be updated as we make improvements to the Assembly API. If you require further assistance, or spot an error, please [contact Assembly support](https://help.assembly.education/contact).  ## Developer Account  A developer account is required to access the Assembly API. If you don't yet have your own developer account you can [sign up here](https://dashboard.assembly.education/developers/sign_up).  We also have a series of [Developer Support Articles](https://help.assembly.education/collection/4-developers) to help get you started.  ## Endpoints  All live API calls should be made over HTTPS to:  ```HTTP https://api.assembly.education ```  All Sandbox API calls should be made over HTTPS to:  ```HTTP https://api-sandbox.assembly.education ```  All live OAuth flow requests should be made to:  ```HTTP https://platform.assembly.education ```  All Sandbox OAuth flow requests should be made to:  ```HTTP https://sandbox.assembly.education ```  ## Data Availability  The value of some fields may be `null` where either:  - the MIS doesn't provide the data, or - we do not yet support collecting the data  We document our [support for each MIS by scope](https://docs.google.com/spreadsheets/d/12i5BrffROKXV1b9xFCrLpDE7Fv1olmF8NZn61nP3O2U) and are continually working to improve our coverage of MIS data. If you have any queries about data availability please [contact Assembly support](https://help.assembly.education/contact).  # Upgrading to Version 1.1  Version 1.0 and 1.1 are almost identical, but there are a few significant differences to be aware of. All other endpoints and data structures documented here for version 1.1 also apply to version 1.0.  ## Pagination in Header  In version 1.0 pagination was handled by _enveloping_ response data allowing for pagination information to be included in the response. For example:  ```HTTP HTTP/1.1 200 Ok Content-Type: application/json; charset=utf-8  {   \"object\": \"list\",   \"total_count\": 10,   \"total_pages\": 2,   \"current_page\": 1,   \"prev_page\": null,   \"next_page\": 2,   \"data\": [ 1, 2, 3, 4, 5 ] } ```  In 1.1 we have moved [pagination to header values](#section/Concepts/Pagination). This makes our responses cleaner, which makes it easier to document and produce up to date clients. If you are using one of our [client SDKs](#section/Client-SDKs) then this change will likely have little or no impact on your application.  ## Grade Sets from Assessments  In version 1.0 the `/assessments/{assessment_id}/grade_set` endpoint was returning a combination of an assessment and grade set information. This has been revised to be more RESTful, in that it now returns just the grade set. The assessment information is still available from `/assessments/{assessment_id}`. This change only affects applications that use this endpoint.  ## User Info Endpoint  In version 1.0 the `/me` endpoint provided a bit of a mash-up of application, token and school information in the form:  ```HTTP {   \"level\": TOKEN_LEVEL,   \"app\": {     \"id\": AN_APP_ID,     \"name\": AN_APP NAME   },   \"school\": {     \"id\": SCHOOL_ID,     \"urn\": SCHOOL_URN,     \"name\": SCHOOL_NAME,     \"slug\": SCHOOL_SLUG,     \"la_code\": SCHOOL_LA_CODE,     \"establishment_number\": SCHOOL_ESTAB,     \"phase\": SCHOOL_PHASE,     \"scopes\": SCOPES_AUTHED   } } ```  where the `school` object was only available when accessed with a School Token. We have cleaned this up so that the `/me` endpoint returns standard information about the application connecting to Assembly and the token used. The school information is available through `/school`, which provides more detail.  ## Authorizations Endpoint  In version 1.0 the `/authorizations` endpoint provided a bit of a mash-up of application and the schools that have authorised for it to access their data:  ```HTTP {   \"object\": \"authorizations\",   \"id\": AN_APP_ID,   \"name\": AN_APP_NAME,   \"data\": [ {     \"object\": \"authorization\",     \"school_id\": A_SCHOOL_ID,     \"school_name\": A_SCHOOL_NAME,     \"school_urn\": A_SCHOOL_URN   } ] } ```  In version 1.1 we keep the `/authorizations` endpoint for legacy applications, but have introduced the new `/schools/registered` endpoint to list the schools registered. More detailed application information can be found from the `/me` endpoint.  # Versioning  The API requires that you specify the version of the api that you which to consume in the Accept request header. The current version of the API is version 1.1.  ```Bash curl -H \"Accept: application/vnd.assembly+json; version=1.1\" ```  Version 1 is still available, but is __deprecated__. Any new implementation should use version 1.1.  ```Bash curl -H \"Accept: application/vnd.assembly+json; version=1\" ```  Failure to provide a valid version will result in a `406 Not Acceptable` response.  ```HTTP HTTP/1.1 406 Not Acceptable Content-Type: application/json; charset=utf-8  {\"error\": \"unsupported_version\"} ```  _Within a given API version additional features and functionality (including new: endpoints, attributes, headers or optional parameters) may be added without warning but backwards compatibility will be maintained._  # Authentication  Assembly rely on OAuth to manage access to school data and Bearer Tokens to authorise API requests. The platform can issue two types of access tokens:  - __ApplicationToken__. These tokens grant access to data on the application itself. - __SchoolToken__. These tokens grant access to data for a specific school.  __It is vitally important that access / refresh tokens are treated as highly confidential and handled / stored accordingly. Any suspected breach of a token's security should be reported to Assembly immediately.__  ## ApplicationToken  These can be generated at any time through the [Assembly Platform](https://dashboard.assembly.education), they currently do not expire, and give access to application level resources such as checking if a school has registered with us yet.  They can also be generated programmatically by sending a `POST` request to the `/oauth/token` and passing your `client_id` and `client_secret` credentials via an [HTTP Basic Authentication header](http://tools.ietf.org/html/rfc1945#section-11). For example, the request:  ```HTTP POST /oauth/token?grant_type=client_credentials Accept: application/json Authorization: Basic QWxhZGRpbjpvcGVuIHNlc2FtZQ== ```  will respond with an object containing an `access_token` for your application:   ```HTTP HTTP/1.1 200 OK Content-Type: application/json; charset=utf-8  {   \"access_token\": \"ABCDE\",   \"token_type\": \"bearer\",   \"level\": \"app\",   \"expires_in\": null } ```  **Note**: Use `https://platform.assembly.education` to obtain a token for live system, and `https://sandbox.assembly.education` to obtain a token for our sandbox system.  Once you have an application token it should be used as a `bearer` token in the `Authorization` request header.  ```Bash curl -H \"Authorization: Bearer b2s7a9s8BQokikJOvBiI2HlWgH4olfQ2\" ```  API requests that are missing an `Authorization` header will receive a 401 response:  ```HTTP HTTP/1.1 401 Unauthorized Content-Type: application/json; charset=utf-8  {   \"error\": \"invalid_request\",   \"message\": \"an access_token is required.\" } ```  ## SchoolToken  In our live environment, school tokens can only be acquired by a school explicitly authorising your Application to access their data (although on Sandbox you can manually generate a token for your test school). School tokens have scopes that limit access to only the data your application has been authorised to access by the school. They expire after a period of time, currently 86400 seconds (or 1 days), but this may reduced in the future.  School tokens are created by starting an OAuth flow by forwarding an appropriate school representative to `/oauth/authorize` in their browser. On viewing the page the user will be asked to log into their Assembly account and then approve/deny the request, authorising any optional scopes they decide are appropriate.  The request must include:  - `client_id`: the string used to identify your application - `redirect_uri`: this must  must match the `redirect_uri` set up for your application on the Assembly Platform, and is where the user will be sent once they approve the request - `scope`: a space separated list (url escaped as a `+`) of (possibly `:optional`) scopes to request access for - `state`: a unique opaque string that will be passed back to you your `redirect_uri` in order to mitigate CSRF attacks   An example URL looks like this:  ```HTTP /oauth/authorize?client_id=123&redirect_uri=https://example.com/callback&scope=students.basic+contacts.basic:optional&state=nrboh24tfopnvd24 ```  If additional scopes are required in the future the school must re-approve your application.  When the user is redirected to `redirect_uri` a `code` will be included in the query parameters. This is your `authorization_code` which must be exchanged for an `access_token` and a `refresh_token` that you must store.  To exchange an `authorization_code` for tokens send a `POST` request to the `/oauth/token` endpoint with `grant_type=authorization_code`, your `redirect_uri`, and your `code` as query parameters. Your `client_id` and `client_secret` credentials must also be included as an [HTTP Basic Authentication header](http://tools.ietf.org/html/rfc1945#section-11). For example, the request:  ```HTTP POST /oauth/token?grant_type=authorization_code&code=oehibebvero0v23&redirect_uri=https://example.com/callback Accept: application/json ```  will respond with an object containing an `access_token` and `refresh_token` for your application:   ```HTTP HTTP 1.1 200 OK Content-Type: application/json  {   \"access_token\": \"ABCDE\",   \"refresh_token\": \"WXYZ\",   \"token_type\": \"bearer\",   \"level\": \"school\",   \"expires_in\": 108000,   \"school_id\": 123,   \"scopes\": [\"school\", \"students\"] } ```  Make sure to store this data in your application. The `access_token` is valid for 86400 seconds (or 1 days), and will need to be refreshed upon expiry.  Once you have an application token it should be used as a `Bearer` token in the `Authorization` request header.  ```Bash curl -H \"Authorization: Bearer b2s7a9s8BQokikJOvBiI2HlWgH4olfQ2\" ```  API requests that are missing an `Authorization` header will receive a `401 Unauthorized` response:  ```HTTP HTTP/1.1 401 Unauthorized Content-Type: application/json; charset=utf-8  {   \"error\": \"invalid_request\",   \"message\": \"an access_token is required.\" } ```  To refresh an `access_token` send a `POST` request to the `/oauth/token` endpoint with `grant_type=refresh_token` and your `refresh_token` as query parameters. Your `client_id` and `client_secret` credentials must also be included as an [HTTP Basic Authentication header](http://tools.ietf.org/html/rfc1945#section-11). For example, the request:  ```HTTP POST /oauth/token?grant_type=refresh_token&refresh_token=WXYZ Accept: application/json Authorization: Basic QWxhZGRpbjpvcGVuIHNlc2FtZQ== ```  will respond with an object containing a new `access_token`:  ```HTTP HTTP 1.1 OK 200 Content-Type: application/json  {   \"access_token\": \"eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ0sZZxr3r...\",   \"token_type\": \"bearer\",   \"level\": \"school\",   \"expires_in\": 108000,   \"school_id\": 123,   \"scopes\": [\"school\", \"students\"] } ```  **Note**: Use `https://platform.assembly.education` to obtain tokens for our live system, and `https://sandbox.assembly.education` to obtain tokens for our sandbox system.  ## Scopes  The available scopes for a school token are:  | Scope | Description | | --- | --- | | `assessments.examinations` | Provides access to students' examination assessment results | | `assessments.internal` | Provides access to the school's internal assessments. What results are exported is governed by the assessment mappings that you have configured on the Assembly Platform | | `assessments.national` | Provides access to students' national assessment results | | `assessments.write` | Allows the application to store its assessment data securely in the Assembly platform so that you can use it later for analytics tools | | `attendances` | Provides access to morning and afternoon attendance marks | | `attendances.summaries` | Provides access to student's attendance summary | | `calendar` | Provides access to the school calendar | | `contacts.basic` | Provides access to basic contact information (for example first name, last name, title and relationship to students) | | `contacts.emails` | Provides access to contact email addresses | | `contacts.gender` | Provides access to the gender of contacts | | `contacts.middle_names` | Provides access to contact middle names | | `contacts.parental_responsibility` | Provides access to the parental responsibility flag for contacts | | `contacts.priority` | Provides access to the priority of contacts | | `contacts.telephone_numbers` | Provides access to contact telephone numbers | | `exclusions` | Provides access to student exclusions | | `groups` | Provides access to a school's groups | | `registration_groups` | Provides access to a school's registration groups | | `school` | Provides access to school level information that is generally publicly available or non-sensitive. Examples include the school's name, URN and subject list | | `staff_members.absences` | Provides access to staff member absences | | `staff_members.basic` | Provides access to basic staff member information (for example staff code, first name, last name and title) | | `staff_members.contracts` | Provides access to staff contract information (for example NI number, payroll number, contract type, post and roles). No salary information is extracted with this scope | | `staff_members.dates` | Provides access to staff member start and end dates | | `staff_members.disability` | Provides access to the disability status of staff members | | `staff_members.dob` | Provides access to dates of birth for staff members | | `staff_members.emails` | Provides access to staff member email addresses | | `staff_members.ethnicity` | Provides access to the ethnicity of staff members | | `staff_members.former_names` | Provides access to the former names of staff members | | `staff_members.gender` | Provides access to the gender of staff members | | `staff_members.included_in_census` | The scope provides access to whether or not staff members are included in the School Workforce Census | | `staff_members.legal_names` | Provides access to staff member legal names | | `staff_members.middle_names` | Provides access to staff member middle names | | `staff_members.mis_id` | Provides access to the MIS identifier for staff members | | `staff_members.qualifications` | Provides access to staff member qualifications (for example teacher number, QT status, HLTA status and degree information) | | `staff_members.salaries` | Provides access to staff member salaries and allowances (for example pay scale, pay framework and additional payment amount) | | `staff_members.teaching_status` | Provides access to the teaching status of staff members | | `staff_members.telephone_numbers` | Provides access to the telephone numbers of staff members | | `students.addresses` | Provides access to student home addresses and postcodes | | `students.basic` | Provides access to basic student information (for example first name, last name and year group) | | `students.care` | Provides access to the in care or \"looked after\" status for students | | `students.country_of_birth` | Provides access to the country of birth for students | | `students.dates` | Provides access to student start and end dates | | `students.dob` | Provides access to dates of birth for students | | `students.eal` | Provides access to the English as Additional Language status for students | | `students.enrolment_status` | Provides access to the enrolment status of students | | `students.ethnicity` | Provides access to the ethnicity of students | | `students.ever_in_care` | Provides access to whether a student has been in care at any point | | `students.first_language` | Provides access to the first language for students | | `students.former_names` | Provides access to student former names | | `students.former_upn` | Provides access to any former unique pupil numbers for students | | `students.fsm` | Provides access to the free school meal status for students | | `students.fsm_review_dates` | Provides access to the review date for student free school meal eligibility | | `students.gender` | Provides access to the gender of students | | `students.home_language` | Provides access to the home language for students | | `students.legal_names` | Provides access to student legal names | | `students.medical.conditions` | Provides access to medical conditions for students (for example Asthma) | | `students.medical.dietary_needs` | Provides access to dietary needs for students (for example Halal) | | `students.medical.emergency_consent` | Provides access to the if the student (or guardian) has given emergency consent | | `students.medical.nhs_number` | Provides access to the NHS number of the student | | `students.medical.notes` | Provides access to medical notes for students and their medical conditions | | `students.medical.pregnancy` | Provides access to the the student's pregnancy status | | `students.middle_names` | Provides access to student middle names | | `students.mis_id` | Provides access to the MIS identifier for students | | `students.nationality` | Provides access to student nationalities | | `students.pan` | Provides access to student pupil admission numbers | | `students.photo` | Provides access to student photographs | | `students.pp` | Provides access to the pupil premium status of students | | `students.proficiency_in_eng` | Provides access to proficiency in English for students | | `students.sen_needs` | Provides access to special education needs for students | | `students.sen_provision` | Provides access to special education need provision for students | | `students.service_child` | Provides access to whether a student is a child of service personnel | | `students.siblings` | Provides access to student siblings | | `students.upn` | Provides access to unique pupil numbers for students | | `teaching_groups` | Provides access to teaching group names and subjects. What teaching groups we pull from your MIS is governed by the subject mappings you have configured within the Assembly Platform |   ### Optional and Required Scopes  Scopes can be defined as either `required` or `optional`. __To comply with data protection regulations and good practice, all scopes that are not necessary for the core purpose of an app should be defined as `optional`__.  If a scope is defined as `required`, it will be listed on a school's Data Access Request, and the school must agree to sharing this scope of data in order to authorise an app. Scopes can be defined as required by including `:required` after the scope in an authorisation request (for example: `students.basic:required`).  If a scope is defined as `optional`, it will be listed on a school's Data Access Request with a check box next to it, which is by default not ticked. A school can then opt in to these scopes when authorising an app by ticking the relevant boxes. Scopes can be defined as optional by including `:optional` after the scope in an authorisation request (for example: `students.ethnicity:optional`).  Please note: if `:required` or `:optional` is not specified after the scope name, scopes behave as if they are `required`.  ### Scope Dependencies  Some scopes of data have dependencies on others. All student scopes are dependent on the `students.basic` scope (likewise with staff members and contacts). Therefore, requesting one of these in your `access_token` will also return the `students.basic` scope.  # Concepts  ## Conditional Requests  Some of the API endpoint responses contain a `Last-Modified` header. You can use this value to make subsequent requests to these endpoints using the `If-Modified-Since` header; the server will then return only data which has changed since this date. If no data has changed since this date, then the server will return a response of `304 Not Modified`.  __Note__ if a 'full sync' has been performed on a school then all data will be flagged as having changed, which means that using this header will result in all data being returned.  ## Errors  Assembly uses HTTP response status codes to indicate the status of an API request.  - Status codes in the __200__ range indicate a successful request. - Status codes in the __300__ range indicate a successful request, but the client may need to take additional action. - Status codes in the __400__ range indicate that the request has failed, usually due to a client error. - Status codes in the __500__ range indicate that the request has failed due to a server error.  Generally error responses contain a JSON body made up of an error key and a more descriptive message however this is not guaranteed. For example:  ```HTTP HTTP/1.1 401 Unauthorized Content-Type: application/json; charset=utf-8  {   \"error\": \"invalid_request\",   \"message\": \"an access_token is required.\" } ```  ## Rate Limiting  In order to protect the availability and security of our systems all HTTP calls are subject to rate limiting. Except where noted the following limits are in place.  In extreme circumstances very abusive clients may be subject to blacklisting.  *__Please note__: We are evaluating these limits and they are subject to change. If you feel you require a higher limit please [contact support](https://help.assembly.education/contact).*  Each Access Token is limited to 600 requests within a 5 minute window, or two requests per second. If you exceed this limit you will receive a response that tells you:  - `count` the number of requests you have made with the current token. - `period` the number of seconds until the current token may make another request. - `limit` the total number of requests the current token may make within a 5 minute window.  The response will look something like this:  ```HTTP HTTP/1.1 429 Too Many Requests Content-Type: application/json; charset=utf-8  {   \"error\": \"too many requests\",   \"data\": {     \"count\": 601,     \"period\": 300,     \"limit\": 600   } } ```  ## Pagination  Any request that results in a list type being returned is presented as a paged response. The header in the response gives you the information to navigate through the paged data set. Further pages can be requested using the `page` query parameter. Optionally the number of results to be included on each page can be specified with the query parameter `per_page`, which defaults to a value of 100 and has a maximum value of 1500.  ```HTTP HTTP/1.1 200 Ok Content-Type: application/json; charset=utf-8 Page: 1 Next-Page: 2 Prev-Page: Per-Page: 5  [ 1, 2, 3, 4, 5 ] ```  # Getting Schools Connected  As part of the Assembly service, we handle the onboarding process of schools connecting to the platform. All you need to do is:  1. Decide whether you're onboarding all your existing schools at once, or if you're beginning with a selection. 2. Contact the schools you'd like to onboard. We can provide a [template for this email](https://help.assembly.education/article/50-onboarding-schools). 3. Send us the list of schools who want to use an Assembly connection. 4. We'll email schools with instructions on [how to connect to Assembly](https://help.assembly.education/) and [how to authorise your application](https://help.assembly.education/article/73-how-to-build-and-oauth-integration-with-the-assembly-platform), and chase politely if we don't hear from them. We'll also report to you periodically with updates on how many are signed up. 5. If you began with a limited selection of schools, repeat steps 2-4 for the rest!  # Client SDKs  To help you build your application against our API quickly we provide clients for the following languages:  <div class=\"row\">   <div class=\"col-md-3\">     <a class=\"panel sdk-btn\" href=\"https://github.com/assembly-edu/assembly-client-dotnet\">         <svg role=\"img\" viewBox=\"0 0 24 24\" xmlns=\"http://www.w3.org/2000/svg\" style=\"height: 4em; fill: #5C2D91;\">           <title>.NET icon</title>           <path d=\"M3.1672 7.5655v8.749H4.19v-6.325a8.979 8.979 0 0 0-.0488-1.1998h.0384a2.9082 2.9082 0 0 0 .2784.5473l4.4973 6.9774h1.2569V7.5655H9.1904v6.1526a9.2574 9.2574 0 0 0 .0619 1.286h-.0234c-.0544-.1056-.173-.3002-.3553-.585L4.4964 7.5656zm9.315 0v8.749h4.65l.0048-.9599h-3.6087v-3.0331h3.1579V11.4h-3.1579V8.4916h3.3884v-.926zm5.4374 0v.926h2.5149v7.823h1.0216v-7.823H24v-.926zM.6534 15.067a.643.643 0 0 0-.4565.2062A.6719.6719 0 0 0 0 15.753a.6623.6623 0 0 0 .1968.4799.6479.6479 0 0 0 .4799.2015.6623.6623 0 0 0 .4799-.2015.6575.6575 0 0 0 .2015-.48.667.667 0 0 0-.2015-.4798.6575.6575 0 0 0-.4799-.2062.643.643 0 0 0-.0234 0z\"/>         </svg>       <p>.NET</p>     </a>   </div>   <div class=\"col-md-3\">     <a class=\"panel sdk-btn\" href=\"https://github.com/assembly-edu/assembly-client-php\">         <svg role=\"img\" viewBox=\"0 0 24 24\" xmlns=\"http://www.w3.org/2000/svg\" style=\"height: 4em; fill: #777BB4;\">           <title>PHP icon</title>           <path d=\"M7.01 10.207h-.944l-.515 2.648h.838c.556 0 .97-.105 1.242-.314.272-.21.455-.559.55-1.049.092-.47.05-.802-.124-.995-.175-.193-.523-.29-1.047-.29z\"/>           <path d=\"M12 5.688C5.373 5.688 0 8.514 0 12s5.373 6.313 12 6.313S24 15.486 24 12c0-3.486-5.373-6.312-12-6.312zm-3.26 7.451c-.261.25-.575.438-.917.551-.336.108-.765.164-1.285.164H5.357l-.327 1.681H3.652l1.23-6.326h2.65c.797 0 1.378.209 1.744.628.366.418.476 1.002.33 1.752a2.836 2.836 0 0 1-.305.847c-.143.255-.33.49-.561.703zm4.024.715l.543-2.799c.063-.318.039-.536-.068-.651-.107-.116-.336-.174-.687-.174H11.46l-.704 3.625H9.388l1.23-6.327h1.367l-.327 1.682h1.218c.767 0 1.295.134 1.586.401s.378.7.263 1.299l-.572 2.944h-1.389zm7.597-2.265a2.782 2.782 0 0 1-.305.847c-.143.255-.33.49-.561.703a2.44 2.44 0 0 1-.917.551c-.336.108-.765.164-1.286.164h-1.18l-.327 1.682h-1.378l1.23-6.326h2.649c.797 0 1.378.209 1.744.628.366.417.477 1.001.331 1.751z\"/>           <path d=\"M17.766 10.207h-.943l-.516 2.648h.838c.557 0 .971-.105 1.242-.314.272-.21.455-.559.551-1.049.092-.47.049-.802-.125-.995s-.524-.29-1.047-.29z\"/>         </svg>       <p>PHP</p>     </a>   </div>   <div class=\"col-md-3\">     <a class=\"panel sdk-btn\" href=\"https://github.com/assembly-edu/assembly-client-ruby\">         <svg role=\"img\" viewBox=\"0 0 24 24\" xmlns=\"http://www.w3.org/2000/svg\" style=\"height: 4em; fill: #CC342D;\">           <title>Ruby icon</title>           <path d=\"M20.156.083c3.033.525 3.893 2.598 3.829 4.77L24 4.822 22.635 22.71 4.89 23.926h.016C3.433 23.864.15 23.729 0 19.139l1.645-3 2.819 6.586.503 1.172 2.805-9.144-.03.007.016-.03 9.255 2.956-1.396-5.431-.99-3.9 8.82-.569-.615-.51L16.5 2.114 20.159.073l-.003.01zM0 19.089v.026-.029.003zM5.13 5.073c3.561-3.533 8.157-5.621 9.922-3.84 1.762 1.777-.105 6.105-3.673 9.636-3.563 3.532-8.103 5.734-9.864 3.957-1.766-1.777.045-6.217 3.612-9.75l.003-.003z\"/>         </svg>       <p>Ruby</p>     </a>   </div>   <div class=\"col-md-3\">     <a class=\"panel sdk-btn\" href=\"./assembly-platform.postman.json\">         <svg role=\"img\" viewBox=\"0 0 24 24\" xmlns=\"http://www.w3.org/2000/svg\" style=\"height: 4em; fill: #FF6C37;\">           <title>Postman Icon</title>           <path d=\"M13.527.099C6.955-.744.942 3.9.099 10.473c-.843 6.572 3.8 12.584 10.373 13.428 6.573.843 12.587-3.801 13.428-10.374C24.744 6.955 20.101.943 13.527.099zm2.471 7.485a.855.855 0 0 0-.593.25l-4.453 4.453-.307-.307-.643-.643c4.389-4.376 5.18-4.418 5.996-3.753zm-4.863 4.861l4.44-4.44a.62.62 0 1 1 .847.903l-4.699 4.125-.588-.588zm.33.694l-1.1.238a.06.06 0 0 1-.067-.032.06.06 0 0 1 .01-.073l.645-.645.512.512zm-2.803-.459l1.172-1.172.879.878-1.979.426a.074.074 0 0 1-.085-.039.072.072 0 0 1 .013-.093zm-3.646 6.058a.076.076 0 0 1-.069-.083.077.077 0 0 1 .022-.046h.002l.946-.946 1.222 1.222-2.123-.147zm2.425-1.256a.228.228 0 0 0-.117.256l.203.865a.125.125 0 0 1-.211.117h-.003l-.934-.934-.294-.295 3.762-3.758 1.82-.393.874.874c-1.255 1.102-2.971 2.201-5.1 3.268zm5.279-3.428h-.002l-.839-.839 4.699-4.125a.952.952 0 0 0 .119-.127c-.148 1.345-2.029 3.245-3.977 5.091zm3.657-6.46l-.003-.002a1.822 1.822 0 0 1 2.459-2.684l-1.61 1.613a.119.119 0 0 0 0 .169l1.247 1.247a1.817 1.817 0 0 1-2.093-.343zm2.578 0a1.714 1.714 0 0 1-.271.218h-.001l-1.207-1.207 1.533-1.533c.661.72.637 1.832-.054 2.522z\"/>           <path d=\"M18.855 6.05a.143.143 0 0 0-.053.157.416.416 0 0 1-.053.45.14.14 0 0 0 .023.197.141.141 0 0 0 .084.03.14.14 0 0 0 .106-.05.691.691 0 0 0 .087-.751.138.138 0 0 0-.194-.033z\"/>         </svg>       <p>Postman</p>     </a>   </div> </div>  # Test Schools  All developers on the Assembly Platform are invited to sign up to their own sandbox environment for testing purposes. If you don't yet have your own developer account you can [sign up here](https://dashboard.assembly.education/developers/sign_up).  Each sandbox environment contains a test school with a randomly generated name and a complete set of Secondary school data.  This test school (along with a test app) can be used to test the OAuth flow end-to-end. Alternatively you can manually generate an access token and focus on testing your integration straight away.  One important feature of the Assembly platform is that we normalise the data we extract from a school’s MIS wherever possible. Your test school therefore contains data in a normalised form that should be comparable to what you find when you connect your app to real schools.  During development your app will use the test school data set by default. Real school data will become available when the app transitions to live and schools sign up. 

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
*AssemblyApi* | [**findAssessmentPoint**](docs/AssemblyApi.md#findAssessmentPoint) | **GET** /assessment_points/{assessment_point_rank} | View an Assessment Point
*AssemblyApi* | [**findDietaryNeed**](docs/AssemblyApi.md#findDietaryNeed) | **GET** /school/dietary_needs/{id} | View a Dietary Need
*AssemblyApi* | [**findFacet**](docs/AssemblyApi.md#findFacet) | **GET** /facets/{id} | View a Facet
*AssemblyApi* | [**findGradeSet**](docs/AssemblyApi.md#findGradeSet) | **GET** /grade_sets/{id} | View a Grade Set
*AssemblyApi* | [**findGroup**](docs/AssemblyApi.md#findGroup) | **GET** /groups/{id} | View a Group
*AssemblyApi* | [**findMedicalCondition**](docs/AssemblyApi.md#findMedicalCondition) | **GET** /school/medical_conditions/{id} | View a Medical Condition
*AssemblyApi* | [**findRegistrationGroup**](docs/AssemblyApi.md#findRegistrationGroup) | **GET** /registration_groups/{id} | View a Registration Group
*AssemblyApi* | [**findSchool**](docs/AssemblyApi.md#findSchool) | **GET** /school | View School Details
*AssemblyApi* | [**findStaffMember**](docs/AssemblyApi.md#findStaffMember) | **GET** /staff_members/{id} | View a Staff Member
*AssemblyApi* | [**findStudent**](docs/AssemblyApi.md#findStudent) | **GET** /students/{id} | View a Student
*AssemblyApi* | [**findTeachingGroup**](docs/AssemblyApi.md#findTeachingGroup) | **GET** /teaching_groups/{id} | View a Teaching Group
*AssemblyApi* | [**findYearGroup**](docs/AssemblyApi.md#findYearGroup) | **GET** /year_groups/{id} | View a Year Group
*AssemblyApi* | [**getAcademicYears**](docs/AssemblyApi.md#getAcademicYears) | **GET** /academic_years | List Academic Years
*AssemblyApi* | [**getAssessmentPointResults**](docs/AssemblyApi.md#getAssessmentPointResults) | **GET** /assessment_points/{assessment_point_rank}/results | View Results for an Assessment Point
*AssemblyApi* | [**getAssessmentPoints**](docs/AssemblyApi.md#getAssessmentPoints) | **GET** /assessment_points | List Assessment Points
*AssemblyApi* | [**getAssessmentResults**](docs/AssemblyApi.md#getAssessmentResults) | **GET** /assessments/{id}/results | View Results for an Assessment
*AssemblyApi* | [**getAssessments**](docs/AssemblyApi.md#getAssessments) | **GET** /assessments | List Assessments
*AssemblyApi* | [**getAttendanceSummaries**](docs/AssemblyApi.md#getAttendanceSummaries) | **GET** /attendances/summaries | List Attendance Summaries
*AssemblyApi* | [**getAttendances**](docs/AssemblyApi.md#getAttendances) | **GET** /attendances | List Attendances
*AssemblyApi* | [**getCalendarEvents**](docs/AssemblyApi.md#getCalendarEvents) | **GET** /calendar_events | List Calendar Events
*AssemblyApi* | [**getContacts**](docs/AssemblyApi.md#getContacts) | **GET** /contacts | List Contacts
*AssemblyApi* | [**getDietaryNeeds**](docs/AssemblyApi.md#getDietaryNeeds) | **GET** /school/dietary_needs | List Dietary Needs
*AssemblyApi* | [**getExclusions**](docs/AssemblyApi.md#getExclusions) | **GET** /exclusions | List Exclusions
*AssemblyApi* | [**getFacets**](docs/AssemblyApi.md#getFacets) | **GET** /facets | List Facets
*AssemblyApi* | [**getGradeSets**](docs/AssemblyApi.md#getGradeSets) | **GET** /grade_sets | List Grade Sets
*AssemblyApi* | [**getGroups**](docs/AssemblyApi.md#getGroups) | **GET** /groups | List Groups
*AssemblyApi* | [**getLeftStaffMembers**](docs/AssemblyApi.md#getLeftStaffMembers) | **GET** /staff_members/left | List Left Staff Members
*AssemblyApi* | [**getLeftStudents**](docs/AssemblyApi.md#getLeftStudents) | **GET** /students/left | List Left Students
*AssemblyApi* | [**getMedicalConditions**](docs/AssemblyApi.md#getMedicalConditions) | **GET** /school/medical_conditions | List Medical Conditions
*AssemblyApi* | [**getRegistrationGroupStudents**](docs/AssemblyApi.md#getRegistrationGroupStudents) | **GET** /registration_groups/{id}/students | List Students for Registration Group
*AssemblyApi* | [**getRegistrationGroups**](docs/AssemblyApi.md#getRegistrationGroups) | **GET** /registration_groups | List Registration Groups
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
*AssemblyApi* | [**status**](docs/AssemblyApi.md#status) | **GET** /school/status | View School Sync Status
*AssemblyApi* | [**updateResults**](docs/AssemblyApi.md#updateResults) | **PATCH** /results/{id} | Update a Single Result


## Documentation for Models

 - [AcademicYear](docs/AcademicYear.md)
 - [AcademicYearTerms](docs/AcademicYearTerms.md)
 - [Assessment](docs/Assessment.md)
 - [AssessmentPoint](docs/AssessmentPoint.md)
 - [Attendance](docs/Attendance.md)
 - [AttendanceSummary](docs/AttendanceSummary.md)
 - [BulkResultResponse](docs/BulkResultResponse.md)
 - [BulkResultsBody](docs/BulkResultsBody.md)
 - [CalendarEvent](docs/CalendarEvent.md)
 - [CalendarEventMisType](docs/CalendarEventMisType.md)
 - [Contact](docs/Contact.md)
 - [ContactStudents](docs/ContactStudents.md)
 - [DietaryNeed](docs/DietaryNeed.md)
 - [EmailInfo](docs/EmailInfo.md)
 - [Exclusion](docs/Exclusion.md)
 - [Facet](docs/Facet.md)
 - [Grade](docs/Grade.md)
 - [GradeSet](docs/GradeSet.md)
 - [Group](docs/Group.md)
 - [Me](docs/Me.md)
 - [MeToken](docs/MeToken.md)
 - [MedicalCondition](docs/MedicalCondition.md)
 - [MisSubject](docs/MisSubject.md)
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
 - [StandardError](docs/StandardError.md)
 - [StandardErrorData](docs/StandardErrorData.md)
 - [Student](docs/Student.md)
 - [StudentAddress](docs/StudentAddress.md)
 - [StudentContactRelationship](docs/StudentContactRelationship.md)
 - [StudentContacts](docs/StudentContacts.md)
 - [StudentDemographics](docs/StudentDemographics.md)
 - [StudentLanguages](docs/StudentLanguages.md)
 - [StudentMedical](docs/StudentMedical.md)
 - [StudentMedicalCondition](docs/StudentMedicalCondition.md)
 - [StudentMedicalNote](docs/StudentMedicalNote.md)
 - [StudentPhoto](docs/StudentPhoto.md)
 - [Subject](docs/Subject.md)
 - [Supervisor](docs/Supervisor.md)
 - [TeachingGroup](docs/TeachingGroup.md)
 - [TelephoneNumberInfo](docs/TelephoneNumberInfo.md)
 - [YearGroup](docs/YearGroup.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### ApplicationToken

- **Type**: HTTP basic authentication

### SchoolToken

- **Type**: HTTP basic authentication


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

help@assembly.education

