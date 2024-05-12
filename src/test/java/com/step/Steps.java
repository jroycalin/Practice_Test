package com.step;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps 
{
	public static WebDriver driver;
	public static WebElement element;
	static
	{
		System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");		
	}
	
	@Before(order=0)//lower order value will execute first
	public void startBrowser()
	{
		driver=new ChromeDriver();
		System.out.println("Browser Opened");
	}
	
	@Before(order=1)
	public void beforeScenario()
	{
		System.out.println("Before scenario method");
	}
	
	@Before("@FunctionalTest")
	public void beforeFunctional()
	{
		System.out.println("Before Functional Test..");
	}
	
	@After
	public void closeBrowser()
	{
		driver.quit();
	}
	
	@Given("we are google page Selenium")
	public void we_are_google_page_selenium() throws InterruptedException {
		
	 driver.get("https://www.google.com/search?q=selenium");
	 Thread.sleep(1000);
	 
	}
	@Given("we are google page API Testing")
	public void we_are_google_page_api_testing() throws InterruptedException {
		
		driver.get("https://www.google.com/search?q=API+Testing");
		 Thread.sleep(1000);
	}

	@Given("we are google page Cucumber")
	public void we_are_google_page_cucumber() throws InterruptedException {
		
		driver.get("https://www.google.com/search?q=Cucumber");
		 Thread.sleep(1000);
	}

	//When user enter user name "Jit"
	
	
	
	@Given("we are google page Functional Testing")
	public void we_are_google_page_functional_testing() throws InterruptedException {
		
		driver.get("https://www.google.com/search?q=Functional+Testing");
		 Thread.sleep(1000);
	}

	@Given("we are google page Capgemini")
	public void we_are_google_page_capgemini() throws InterruptedException {
		
		driver.get("https://www.google.com/search?q=Capgemini");
		 Thread.sleep(1000);
	}

	@Given("we are google page Postman")
	public void we_are_google_page_postman() throws InterruptedException {
		
		//driver.get("https://www.google.com/search?q=Postman");
		driver.get("https://www.google.com/search?q=current+time&rlz=1C1UEAD_enIN1012IN1012&oq=current+time&aqs=chrome..69i57j0i402l2j0i433i512j0i512j0i433i512j0i512j0i433i512j0i512l2.2325j1j7&sourceid=chrome&ie=UTF-8");
		 Thread.sleep(1000);
	}
	
	@AfterStep
	public void addScreenshot(Scenario scenario){

		final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
		scenario.attach(screenshot, "image/png", "image"); 

	}

//screenshots only for failed scenarios
//@AfterStep
//public void addScreenshot(Scenario scenario)
//{
//	if(scenario.isFailed())
//	{
//
//		final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
//		scenario.attach(screenshot, "image/png", "image"); 
//	}
//
//}
	
}
