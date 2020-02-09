package stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import utils.BrowserUtils;

public class Flights {
	
	public static WebDriver driver;
	@Given("^user should be in serachflights page$")
	public void user_should_be_in_serachflights_page() throws Throwable {
		BrowserUtils.openBrowser();
		BrowserUtils.launchApp();
	}

	@When("^user should enter valid fileds$")
	public void user_should_enter_valid_fileds() throws Throwable {
	
	}

	@Then("^user should navigate to listof flights page$")
	public void user_should_navigate_to_listof_flights_page() throws Throwable {
	
	}

}
