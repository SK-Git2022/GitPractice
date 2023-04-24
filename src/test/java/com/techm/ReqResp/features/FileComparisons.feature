@FileCompare
Feature: Validating APIs

 @PositionReportFileCompare
  Scenario: verify file contains correct output
  Given Files "InstrumentDetails.csv" and "PositionDetails.csv"
  When processed in the system
  Then verify "PositionReport.csv" file 
  
   

