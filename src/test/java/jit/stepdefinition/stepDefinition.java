package jit.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.*;


public class stepDefinition {
	WebDriver driver;
	WebElement element;
	@Given("The system property and browser driver driver is setup properly")
	public void the_system_property_and_browser_driver_driver_is_setup_properly() {
	    // Write code here that turns the phrase above into concrete actions
	    System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
	    driver = new ChromeDriver();
	}

	@When("Open the URL {string}")
	public void open_the_url(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    driver.get(string);
	}

	@When("Enter first name {string}")
	public void enter_first_name(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys(string);
	}

	@When("Enter Last name {string}")
	public void enter_last_name(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(string);
	}

	@When("Enter Address as {string}")
	public void enter_address_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.xpath("//label[text()='Address']/following::textarea[1]")).sendKeys(string);
	}

	@When("Enter email {string}")
	public void enter_email(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.xpath("//label[contains(text(),'Email')]/following::input[1]")).sendKeys(string);
	}

	@When("Enter phone {string}")
	public void enter_phone(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.xpath("//label[contains(text(),'Phone')]/following::input[1]")).sendKeys(string);
	}

	@When("Select gender as {string}")
	public void select_gender_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    if(string.contains("Male")) {
	    	driver.findElement(By.xpath("//label[contains(text(),'Gender')]/following::input[1]")).click();
	    }else {
	    	driver.findElement(By.xpath("//label[contains(text(),'Gender')]/following::input[2]")).click();
	    }
	}

	@When("Select hobbies as {string}")
	public void select_hobbies_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.xpath("//label[contains(text(),\'"+string+"\')]/preceding::input[1]")).click();
	    
	}

	@When("Choose language {string} from dropdown")
	public void choose_language_from_dropdown(String string) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("msdd")).click();
	    driver.findElement(By.xpath("//a[text()='English']")).click();
	    
	}

	@When("Choose Skills {string} from dropdown")
	public void choose_skills_from_dropdown(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    element = driver.findElement(By.xpath("//select[@id='Skills']"));
	    Select skill = new Select(element);
	    //skill.selectByVisibleText(string);
	    skill.selectByValue(string);
	}

	@When("Choose select country {string} from dropdown")
	public void choose_select_country_from_dropdown(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("Choose date of birth as {string} then {string} and {string}")
	public void choose_date_of_birth_as_then_and(String string, String string2, String string3) {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("Print success message")
	public void print_success_message() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

}
