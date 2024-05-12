
package com.Runner;
  
import org.junit.runner.RunWith;
  
import io.cucumber.junit.Cucumber; 
import io.cucumber.junit.CucumberOptions;
  
@RunWith(Cucumber.class)
  
  @CucumberOptions(features="Feature", glue="com.stepDefinition", dryRun=true, plugin = {"pretty","json:target//cucumber.json","html:target//cucumber.html"}, monochrome = true) 

public class TestRunner {
  
 }
 
