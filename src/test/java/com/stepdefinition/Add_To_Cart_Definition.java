package com.stepdefinition;

import java.io.IOException;

import com.pages.Add_To_Cart_Page;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Add_To_Cart_Definition {

	Add_To_Cart_Page addToCart = new Add_To_Cart_Page();

	@Given("^launch the chrome application$")
	public void launch_The_Chrome_Application() throws IOException {
		// Write code here that turns the phrase above into concrete actions
		addToCart.browser();
	}

	@When("^the user logged in to the home page$")
	public void the_User_Logged_In_To_The_Home_Page() {
		// Write code here that turns the phrase above into concrete actions
		addToCart.loginPage();
	}

	@Then("^the user login using id and password$")
	public void the_User_Login_Using_Emailid_And_Password() throws InterruptedException, IOException {
		// Write code here that turns the phrase above into concrete actions
		addToCart.addToCart();

	}

	@Then("^the user click the book and add to cart$")
	public void click_On_The_Book_And_Add_to_the_Cart() throws InterruptedException, IOException {
		// Write code here that turns the phrase above into concrete actions
		addToCart.checkOut();

	}

	@Then("^the user does the checkout$")
	public void the_User_Does_The_Checkout() throws InterruptedException, IOException {
		// Write code here that turns the phrase above into concrete actions
		addToCart.billingAddress();

	}

	@Then("^the user fills the details in billing address$")
	public void the_User_Fills_The_Details_In_Billing_Address() throws InterruptedException, IOException {
		// Write code here that turns the phrase above into concrete actions
		addToCart.closeBrowser();

	}
}
