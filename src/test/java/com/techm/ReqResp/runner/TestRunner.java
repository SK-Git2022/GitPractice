package com.techm.ReqResp.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/com/techm/ReqResp/features",glue = {"com.techm.ReqResp.stepDefs"},
tags = {"@HomePageGetOptions,@HomePageSupportButton,@RestApiPost,@RestApiGet,@PositionReportFileCompare"}, dryRun = false,plugin = {"pretty","json:target/cucumber-reports/reports.json",
        "junit:target/cucumber-reports/Cucumber.xml",
        "html:target/cucumber-reports/ReqRespDashboard"},
monochrome = true)
public class TestRunner {	
	
}
