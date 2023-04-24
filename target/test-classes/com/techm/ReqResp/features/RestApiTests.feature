
@RestApiTests
Feature: Validating APIs

   @RestApiGet
   Scenario: testRestAPI GetMethod
   When user calls "get" http request verifies "id" in response as "2"
      
   
   @RestApiPost
   Scenario: testRestAPI PostMethod
   When user calls "post" http request verifies "name" in response as "morpheus"
   

