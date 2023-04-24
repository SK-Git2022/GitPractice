@RestApiTests
Feature: Validating APIs

   @RestApiPost
   Scenario: testRestAPI PostMethod
   Given AddUserPayload
   When user calls "post" http request
   Then the API call got success with status code 201
   And "name" in response body is "morpheus"
   
   @RestApiGet
   Scenario: testRestAPI PostMethod
   Given PathParameter 2
   When user calls "get" http request
   Then the API call got success with status code 200
   And "id" in response body is "2"