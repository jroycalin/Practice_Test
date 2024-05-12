package com.stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginsteps {
	WebDriver driver;
	WebElement webelement;
	
	@Given("Launch browser")
	public void launch_browser() {
		
		System.setProperty("webdriver.chrome.driver", "Driver//chromedriver.exe");
		driver= new ChromeDriver();
	    System.out.println("Launch browser");
	    
	    
	}

	@When("Hit the URL")
	public void hit_the_url() {
		System.out.println("Hit the URL");
	    
	}

	@When("Click on Login icon")
	public void click_on_login_icon() {
		System.out.println("Click on Login icon");
	    
	}

	@When("User needs to provide credentials as {string} and {string}")
	public void user_needs_to_provide_credentials(String id, String pwd) {
		System.out.println("User needs to provide credentials "+id+" "+pwd);
	    
	}

	@Then("Successful Login message would appear")
	public void successful_login_message_would_appear() {
		System.out.println("Successful Login message would appear");
	    
	}
	
	
	@Then("Failure Login message would appear")  //this is for scenario 2
	public void failure_login_message_would_appear() {
		System.out.println("Successful Login message would appear");
	    
	}
	
}
