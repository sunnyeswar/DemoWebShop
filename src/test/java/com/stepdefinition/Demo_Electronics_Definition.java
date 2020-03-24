package com.stepdefinition;

import java.io.IOException;

import com.pages.Demo_Electronics_Page;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Demo_Electronics_Definition {

	Demo_Electronics_Page cellPhone = new Demo_Electronics_Page();

	@Given("^launch the chrome2 application$")
	public void launch_the_chrome2_application() throws IOException {
		// Write code here that turns the phrase above into concrete actions
		cellPhone.browser();
	}

	@When("^the user2 logged in to the home page$")
	public void the_User2_Logged_In_To_The_Home_Page() {
		// Write code here that turns the phrase above into concrete actions
		cellPhone.loginPage();
	}

	@Then("^the user2 login using id and password$")
	public void the_User2_Login_Using_Emailid_And_Password() throws InterruptedException, IOException {
		// Write code here that turns the phrase above into concrete actions

		cellPhone.addToCart();

	}

	@Then("^the user2 click the cellPhone and add to cart$")
	public void the_User2_Click_The_Cellphone_And_Add_To_Cart() throws InterruptedException, IOException {
		// Write code here that turns the phrase above into concrete actions
		cellPhone.checkOut();

	}

	@Then("^the user2 does the checkout$")
	public void the_User2_Does_The_Checkout() throws InterruptedException, IOException {
		// Write code here that turns the phrase above into concrete actions
		cellPhone.billingAddress();

	}

	@Then("^the user2 fills the details in billing address$")
	public void the_User2_Fills_The_Details_In_Billing_Address() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		cellPhone.closeBrowser();

	}
}
