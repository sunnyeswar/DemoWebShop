package com.stepdefinition;

import java.io.IOException;

import com.pages.Demo_Computers_Page;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Demo_Computers_Definition {

	Demo_Computers_Page computer = new Demo_Computers_Page();

	@Given("^launch the chrome1 application$")
	public void launch_the_chrome1_application() throws IOException {
		// Write code here that turns the phrase above into concrete actions
		computer.browser();
	}

	@When("^the user1 logged in to the home page$")
	public void the_user1_logged_in_to_the_home_page() {
		// Write code here that turns the phrase above into concrete actions
		computer.loginPage();
	}

	@Then("^the user1 login using id and password$")
	public void the_user_login_using_emailid_and_password() throws InterruptedException, IOException {
		// Write code here that turns the phrase above into concrete actions
		computer.addToCart();

	}
	
	@Then("^the user1 click the computer and add to cart$")
	public void click_on_the_login_button_user_nagivate_to_the_next_page() throws InterruptedException, IOException {	
		// Write code here that turns the phrase above into concrete actions
		computer.checkOut();

	}
	
	@Then("^the user1 does the checkout$")
	public void the_user_does_the_checkout() throws InterruptedException, IOException {	
		// Write code here that turns the phrase above into concrete actions
		computer.billingAddress();

	}

	@Then("^the user1 fills the details in billing address$")
	public void the_user_fills_the_details_in_billing_address() throws InterruptedException, IOException {
		// Write code here that turns the phrase above into concrete actions
		computer.closeBrowser();

	}
}
