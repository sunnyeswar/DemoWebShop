package com.stepdefinition;

import java.io.IOException;

import com.pages.Demo_Jewelry_Page;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Demo_Jewelry_Definition {

	Demo_Jewelry_Page chain = new Demo_Jewelry_Page();

	@Given("^launch the chrome5 application$")
	public void launch_The_Chrome5_Application() throws IOException {
		// Write code here that turns the phrase above into concrete actions
		chain.browser();
	}

	@When("^the user5 logged in to the home page$")
	public void the_User5_Logged_In_To_The_Home_Page() {
		// Write code here that turns the phrase above into concrete actions
		chain.appPage();
	}

	@Then("^the user5 login using id and password$")
	public void the_User5_Login_Using_Emailid_And_Password() throws InterruptedException, IOException {
		// Write code here that turns the phrase above into concrete actions
		chain.addToCart();

	}

	@Then("^the user5 click the chain and add to cart$")
	public void the_User5_Click_The_chain_And_Add_To_Cart() throws InterruptedException, IOException {
		// Write code here that turns the phrase above into concrete actions
		chain.checkOut();

	}

	@Then("^the user5 does the checkout$")
	public void the_User5_Does_The_Checkout() throws InterruptedException, IOException {
		// Write code here that turns the phrase above into concrete actions
		chain.billingAddress();

	}

	@Then("^the user5 fills the details in billing address$")
	public void the_User5_Fills_The_Details_In_Billing_Address() throws InterruptedException, IOException {
		// Write code here that turns the phrase above into concrete actions
		chain.closeBrowser();

	}

}
