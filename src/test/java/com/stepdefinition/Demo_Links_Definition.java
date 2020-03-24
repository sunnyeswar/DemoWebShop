package com.stepdefinition;

import java.io.IOException;

import com.pages.Demo_Links_Page;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Demo_Links_Definition {

	Demo_Links_Page links = new Demo_Links_Page();

	@Given("^chrome browser$")
	public void chrome_Browser() throws IOException {
		// Write code here that turns the phrase above into concrete actions
		links.browser();
	}

	@When("^demowebshop page$")
	public void demoWebShop_Page() {
		// Write code here that turns the phrase above into concrete actions
		links.demoWebShopPage();
	}

	@Then("^counting the number of links$")
	public void counting_The_Number_Of_Links() throws InterruptedException, IOException {
		// Write code here that turns the phrase above into concrete actions
		links.linksCount();

	}

	@Then("^close browser$")
	public void close_Browser() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		links.close();

	}

}
