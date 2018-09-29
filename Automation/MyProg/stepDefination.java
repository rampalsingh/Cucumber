package stepDefinations;

import java.util.List;

import org.junit.runner.RunWith;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
public class stepDefination {

	@Given("^User is on Netbanking landing page$")
	public void user_is_on_netbanking_landing_page() throws Throwable {
		// System.out.println("User is on Netbanking landing page");
	}

	@Then("^Home page is populated$")
	public void home_page_is_populated() throws Throwable {
		// System.out.println("Home page is populated");
	}

	@When("^user login into application with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_login_into_application_with_and(String arg1, String arg2) throws Throwable {
		System.out.println("Username : " + arg1 + " " + arg2);
	}

	@Then("^Cards displayed are \"([^\"]*)\"$")
	public void cards_displayed_are(String arg1) throws Throwable {
		System.out.println("cards_displayed_are : " + arg1 + "\n\n");
	}

	@When("^user sign up with following details$")
	public void user_sign_up_with_following_details(DataTable data) throws Throwable {
		List<List<String>> obj = data.raw();
		System.out.println(obj.get(0).get(0));
		System.out.println(obj.get(0).get(1));
		System.out.println(obj.get(0).get(2));
		System.out.println(obj.get(0).get(3));
		System.out.println(obj.get(0).get(4));
	}

	@When("^user login in to application (.+) and (.+)$")
	public void user_login_into_application_and(String username, String password) throws Throwable {
		System.out.println(username + " : " + password);
	}

	@Given("^validate the browser$")
	public void validate_the_browser() throws Throwable {
		System.out.println("validate_the_browser");
	}

	@When("^Browser is triggred$")
	public void browser_is_triggred() throws Throwable {
		System.out.println("browser_is_triggred");
	}

	@Then("^check if browser is started$")
	public void check_if_browser_is_started() throws Throwable {
		System.out.println("check_if_browser_is_started");
	}

}