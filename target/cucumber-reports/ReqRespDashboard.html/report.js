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
  "name": "Files \"InstrumentDetails.csv\" and \"ositionDetails.csv\"",
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
});