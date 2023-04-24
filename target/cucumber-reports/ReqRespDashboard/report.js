$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/com/techm/ReqResp/features/FileComparisons.feature");
formatter.feature({
  "name": "Validating APIs",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@FileCompare"
    }
  ]
});
formatter.scenario({
  "name": "verify file contains correct output",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@FileCompare"
    },
    {
      "name": "@PositionReportFileCompare"
    }
  ]
});
formatter.step({
  "name": "Files \"InstrumentDetails.csv\" and \"PositionDetails.csv\"",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.files_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "processed in the system",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.processed_in_the_system()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify \"PositionReport.csv\" file",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.verify_file(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/java/com/techm/ReqResp/features/GUITests.feature");
formatter.feature({
  "name": "Validating APIs",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@GUITests"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Verify if User is able to click on various get options",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@HomePageGetOptions"
    }
  ]
});
formatter.step({
  "name": "\"Chrome\" browser is opened",
  "keyword": "Given "
});
formatter.step({
  "name": "user opens application url in the browser",
  "keyword": "When "
});
formatter.step({
  "name": "user click on \"\u003cname\u003e\" with \"GET\" http request",
  "keyword": "Then "
});
formatter.step({
  "name": "users sees \"\u003cRequest\u003e\" and \"\u003cResponseCode\u003e\" and \"\u003cResponse\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "name",
        "Request",
        "ResponseCode",
        "Response"
      ]
    },
    {
      "cells": [
        "List users",
        "/api/users?page\u003d2",
        "200",
        "total,12"
      ]
    },
    {
      "cells": [
        "List \u003cresource\u003e",
        "/api/unknown",
        "200",
        "total,12"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verify if User is able to click on various get options",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@GUITests"
    },
    {
      "name": "@HomePageGetOptions"
    }
  ]
});
formatter.step({
  "name": "\"Chrome\" browser is opened",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.browser_is_opened(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user opens application url in the browser",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_opens_application_url_in_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on \"List users\" with \"GET\" http request",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_click_on_with_http_request(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "users sees \"/api/users?page\u003d2\" and \"200\" and \"total,12\"",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.users_sees_and_and(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify if User is able to click on various get options",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@GUITests"
    },
    {
      "name": "@HomePageGetOptions"
    }
  ]
});
formatter.step({
  "name": "\"Chrome\" browser is opened",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.browser_is_opened(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user opens application url in the browser",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_opens_application_url_in_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on \"List \u003cresource\u003e\" with \"GET\" http request",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_click_on_with_http_request(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "users sees \"/api/unknown\" and \"200\" and \"total,12\"",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.users_sees_and_and(String,String,String)"
});
formatter.result({
  "error_message": "io.restassured.path.json.exception.JsonPathException: Failed to parse the JSON document\r\n\tat io.restassured.path.json.JsonPath$ExceptionCatcher.invoke(JsonPath.java:1002)\r\n\tat io.restassured.path.json.JsonPath$4.doParseWith(JsonPath.java:967)\r\n\tat io.restassured.path.json.JsonPath$JsonParser.parseWith(JsonPath.java:1047)\r\n\tat io.restassured.path.json.JsonPath.get(JsonPath.java:202)\r\n\tat com.techm.ReqResp.pageobjects.HomePage.verifyDetailsForEachMethod(HomePage.java:64)\r\n\tat com.techm.ReqResp.stepDefs.StepDefinition.users_sees_and_and(StepDefinition.java:129)\r\n\tat ✽.users sees \"/api/unknown\" and \"200\" and \"total,12\"(file:src/test/java/com/techm/ReqResp/features/GUITests.feature:9)\r\nCaused by: java.lang.IllegalArgumentException: The JSON input text should neither be null nor empty.\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:77)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:499)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:480)\r\n\tat org.codehaus.groovy.reflection.CachedConstructor.invoke(CachedConstructor.java:73)\r\n\tat org.codehaus.groovy.runtime.callsite.ConstructorSite$ConstructorSiteNoUnwrapNoCoerce.callConstructor(ConstructorSite.java:108)\r\n\tat org.codehaus.groovy.runtime.callsite.CallSiteArray.defaultCallConstructor(CallSiteArray.java:58)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.callConstructor(AbstractCallSite.java:263)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.callConstructor(AbstractCallSite.java:277)\r\n\tat io.restassured.internal.path.json.ConfigurableJsonSlurper.parseText(ConfigurableJsonSlurper.groovy:80)\r\n\tat io.restassured.path.json.JsonPath$4$1.method(JsonPath.java:965)\r\n\tat io.restassured.path.json.JsonPath$ExceptionCatcher.invoke(JsonPath.java:1000)\r\n\tat io.restassured.path.json.JsonPath$4.doParseWith(JsonPath.java:967)\r\n\tat io.restassured.path.json.JsonPath$JsonParser.parseWith(JsonPath.java:1047)\r\n\tat io.restassured.path.json.JsonPath.get(JsonPath.java:202)\r\n\tat com.techm.ReqResp.pageobjects.HomePage.verifyDetailsForEachMethod(HomePage.java:64)\r\n\tat com.techm.ReqResp.stepDefs.StepDefinition.users_sees_and_and(StepDefinition.java:129)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)\r\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:568)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:26)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:20)\r\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:57)\r\n\tat cucumber.runner.PickleStepDefinitionMatch.runStep(PickleStepDefinitionMatch.java:50)\r\n\tat cucumber.runner.TestStep.executeStep(TestStep.java:65)\r\n\tat cucumber.runner.TestStep.run(TestStep.java:50)\r\n\tat cucumber.runner.PickleStepTestStep.run(PickleStepTestStep.java:43)\r\n\tat cucumber.runner.TestCase.run(TestCase.java:46)\r\n\tat cucumber.runner.Runner.runPickle(Runner.java:50)\r\n\tat io.cucumber.junit.PickleRunners$NoStepDescriptions.run(PickleRunners.java:146)\r\n\tat io.cucumber.junit.FeatureRunner.runChild(FeatureRunner.java:68)\r\n\tat io.cucumber.junit.FeatureRunner.runChild(FeatureRunner.java:23)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:309)\r\n\tat io.cucumber.junit.Cucumber.runChild(Cucumber.java:144)\r\n\tat io.cucumber.junit.Cucumber.runChild(Cucumber.java:65)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)\r\n\tat io.cucumber.junit.Cucumber$RunCucumber.evaluate(Cucumber.java:174)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:309)\r\n\tat org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:93)\r\n\tat org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:40)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:529)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:756)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:452)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:210)\r\n",
  "status": "failed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "verify Support button is displayed",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@GUITests"
    },
    {
      "name": "@HomePageSupportButton"
    }
  ]
});
formatter.step({
  "name": "\"Chrome\" browser is opened",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.browser_is_opened(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user opens application url in the browser",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_opens_application_url_in_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on SupportReqResp button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_click_on_SupportReqResp_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user sees one time support option",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_sees_one_time_support_option()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "sees monthlysupport option",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.sees_monthlysupport_option()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "sees SupportReqResp button to upgrade",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.sees_SupportReqResp_button_to_upgrade()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/java/com/techm/ReqResp/features/RestApiTests.feature");
formatter.feature({
  "name": "Validating APIs",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@RestApiTests"
    }
  ]
});
formatter.scenario({
  "name": "testRestAPI PostMethod",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@RestApiTests"
    },
    {
      "name": "@RestApiPost"
    }
  ]
});
formatter.step({
  "name": "AddUserPayload",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.adduserpayload()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user calls \"post\" http request",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_calls_http_request(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the API call got success with status code 201",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.the_API_call_got_success_with_status_code(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"name\" in response body is \"morpheus\"",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.in_response_body_is(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "testRestAPI PostMethod",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@RestApiTests"
    },
    {
      "name": "@RestApiGet"
    }
  ]
});
formatter.step({
  "name": "PathParameter 2",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.pathparameter(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user calls \"get\" http request",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_calls_http_request(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the API call got success with status code 200",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.the_API_call_got_success_with_status_code(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"id\" in response body is \"2\"",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.in_response_body_is(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});