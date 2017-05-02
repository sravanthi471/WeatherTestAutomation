package features;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

import cucumber.api.PendingException;


public class WeatherSteps {
	@Given("^I want to get weather$")
	public void i_want_to_get_weather() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("I am here ins tep defs");
	    throw new PendingException();
	}

	@When("^I complete action$")
	public void i_complete_action() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^I validate the outcomes$")
	public void i_validate_the_outcomes() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

}
