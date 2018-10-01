package stepDefinations;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
public class stepDefination1 {

	public WebDriver driver = null;

	@Given("^validate the browser setting$")
	public void validate_the_browser_setting() throws Throwable {
		System.setProperty("webdriver.chrome.driver", ".//chromedriver.exe");

	}

	@Then("^browsers initializes and navigates to URL$")
	public void browsers_initializes_and_navigates_to_URL() {
		driver = new ChromeDriver();
		driver.get("http://google.com");
	}

	@When("^Users enters \"([^\"]*)\" in the search bar$")
	public void users_enters_in_the_search_bar(String arg1) throws Throwable {
		driver.findElement(By.id("lst-ib")).sendKeys(arg1);
	}

	@Then("^User hits the Enter keyword$")
	public void user_hits_the_Enter_keyword() throws Throwable {
		driver.findElement(By.id("lst-ib")).sendKeys(Keys.RETURN);
	}

}