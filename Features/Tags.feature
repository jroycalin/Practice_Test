Feature: Feature file for Tags in Cucumber

  @SmokeTest
  Scenario: Search Selenium
    Given we are google page Selenium
    
    
    @RegressionTest
  Scenario: Search API Testing
    Given we are google page API Testing
  
    @SmokeTest @RegressionTest
  Scenario: Search Cucumber
    Given we are google page Cucumber
    
    
    @FunctionalTest
  Scenario: Search Functional Testing
    Given we are google page Functional Testing
  
    
    @SmokeTest @FunctionalTest
  Scenario: Search Capgemini
    Given we are google page Capgemini
  
    
    @SmokeTest
  Scenario: Search Postman
    Given we are google page Postman
   
   
  