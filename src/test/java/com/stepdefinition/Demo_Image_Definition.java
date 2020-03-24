package com.stepdefinition;

import java.io.IOException;

import com.pages.Demo_Image_Page;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Demo_Image_Definition {

	Demo_Image_Page image = new Demo_Image_Page();

	@Given("^chromes browser$")
	public void chromes_Browser() throws IOException {
		// Write code here that turns the phrase above into concrete actions
		image.browser();
	}

	@When("^demowebshop pages$")
	public void demoWebShop_Pages() {
		// Write code here that turns the phrase above into concrete actions
		image.demoWebShopPage();
	}

	@Then("^counting the number of images$")
	public void counting_The_Number_Of_Images() throws InterruptedException, IOException {
		// Write code here that turns the phrase above into concrete actions
		image.imageCount();

	}

	@Then("^closing browser$")
	public void closing_Browser() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		image.close();

	}
}
