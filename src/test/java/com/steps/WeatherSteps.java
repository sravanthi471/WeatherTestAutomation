package com.steps;

import static org.junit.Assert.assertEquals;

import com.weather.WeatherTest;

import utility.ExcelUtils;
import com.weather.WeatherTest;
import com.weather.*;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

public class WeatherSteps {
	
	public String response;
	public RequestObject request;
	
	@Given("^I want to get weather report$")
	public void i_want_to_get_weather() throws Throwable {
		ExcelUtils excelData=new ExcelUtils();
		excelData.getTestData(request);
	}

	@When("^I request to get weather$")
	public void i_complete_action() throws Throwable {
		
		WeatherTest weather=new WeatherTest();
		response=weather.getWeather(request.getCity(),request.getCountry());
		
	}

	@Then("^I validate the outcomes$")
	public void i_validate_the_outcomes() throws Throwable {
		assertEquals(response,"Data Not Found");
	}

}
