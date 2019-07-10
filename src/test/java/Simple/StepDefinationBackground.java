package Simple;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinationBackground {
 
	@Given("^Browser must be present in the system$")
	public void browser_must_be_present_in_the_system() throws Throwable {
		System.out.println("Chrome is installed");
	}

	@When("^user opens the application in the browser$")
	public void user_opens_the_application_in_the_browser() throws Throwable {
		System.out.println("Open Testme url in chrome");
	}

	@Then("^Testme opens in the browser$")
	public void testme_opens_in_the_browser() throws Throwable {
		System.out.println("Testme opened in Browser page");
	}

	@Given("^User must be already registered$")
	public void user_must_be_already_registered() throws Throwable {
		System.out.println("Registered users must login");
	}

	@When("^User enters the correct credential$")
	public void user_enters_the_correct_credential() throws Throwable {
		System.out.println("Use Login Credentials");
	}

	@Then("^User must be in the home page$")
	public void user_must_be_in_the_home_page() throws Throwable {
		System.out.println("Homepage opened in Browser page");
	}

	@Given("^User must have search option$")
	public void user_must_have_search_option() throws Throwable {
		System.out.println("Search option is displayed");
	}

	@When("^search for the product with name$")
	public void search_for_the_product_with_name() throws Throwable {
		System.out.println("Product is searched");
	}

	@Then("^searched product details must be displayed in page$")
	public void searched_product_details_must_be_displayed_in_page() throws Throwable {
		System.out.println("Product Details are displayed");
	}
}
