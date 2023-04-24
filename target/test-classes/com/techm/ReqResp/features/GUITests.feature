@GUITests
Feature: Validating APIs

  @HomePageGetOptions
  Scenario Outline: Verify if User is able to click on various get options
  Given "Chrome" browser is opened
  When user opens application url in the browser
  Then user click on "<name>" with "GET" http request
  Then users sees "<Request>" and "<ResponseCode>" and "<Response>"  
  	
Examples:
	|name 	                     | Request                 |ResponseCode   |Response    |
	|List users                  |  /api/users?page=2      |200            |   total,12 |
	|List <resource>             |  /api/unknown           |200            |   total,12 |
	#|Single user                 |  /api/users/2           |200            |   id,2     |
	#|Single user not found       |  /api/users/23          |404            |   {}       |
	#|Single <resource>           |  /api/unknown/2         |200            |   id,2     |
	#|Single <resource> not found |  /api/unknown/23        |404            |   {}       |
	#|Delayed response            |  /api/users?delay=3     |200            |   total,12 |
	
	@HomePagePostOptions
  Scenario Outline: Verify if User is able to click on various post options
  Given "Chrome" browser is opened
  When user opens application url in the browser
  Then user click on "<name>" with "POST" http request
  Then users sees "<Request>" and "<ResponseCode>" and "<Response>"  
  	
Examples:
	|name 	                     | Request                 |ResponseCode   |Response                  |
	| Create                     |  /api/users             |201            |   name morpheus          |    
	| Register - successful      |  /api/register          |200            |   id 4                   |
	| Register - unsuccessful    |  /api/register          |400            |   error Missing password |
	| Login - successful         |  /api/login             |200            |   token                  | 
	| Login - unsuccessful       |  /api/login             |400            |   error Missing password |
	
	
	@HomePageSupportButton
  Scenario: verify Support button is displayed
   Given "Chrome" browser is opened
   When user opens application url in the browser
   Then user click on SupportReqResp button
   Then user sees one time support option
   And sees monthlysupport option
   And sees SupportReqResp button to upgrade
   
   @HomePage
  Scenario: verify Home page is displayed
   Given "Chrome" browser is opened
   When user opens application url in the browser
   Then user sees different request endpoints 
   
  @HomePagePut
  Scenario: verify if User is able to click on Put option
   Given "Chrome" browser is opened
   When user opens application url in the browser
   Then click on "Update" with "put" http request  
   Then user sees "/api/users/2" and "200" and "name morpheus"
   
  @HomePagePatch
  Scenario: verify if User is able to click on Patch option
   Given "Chrome" browser is opened
   When user opens application url in the browser
   Then click on "Update" with "patch" http request  
   Then user sees "/api/users/2" and "200" and "name morpheus"
   
  @HomePageDelete
  Scenario: verify if User is able to click on Delete option
   Given "Chrome" browser is opened
   When user opens application url in the browser
   Then click on "Delete" with "delete" http request  
   Then user sees "/api/users/2" and "204" and ""
  
