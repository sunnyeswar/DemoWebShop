package com.stepdefinition;

import java.io.IOException;
import com.pages.Demo_Digital_Page;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Demo_Digital_Definition {

	Demo_Digital_Page album = new Demo_Digital_Page();

	@Given("^launch the chrome4 application$")
	public void launch_The_Chrome4_Application() throws IOException {
		// Write code here that turns the phrase above into concrete actions
		album.browser();
	}

	@When("^the user4 logged in to the home page$")
	public void the_User4_Logged_In_To_The_Home_Page() {
		// Write code here that turns the phrase above into concrete actions
		album.appPage();
	}

	@Then("^the user4 login using id and password$")
	public void the_User4_Login_Using_Emailid_And_Password() throws InterruptedException, IOException {
		// Write code here that turns the phrase above into concrete actions
		album.addToCart();

	}

	@Then("^the user4 click the album and add to cart$")
	public void the_User4_Click_The_album_And_Add_To_Cart() throws InterruptedException, IOException {
		// Write code here that turns the phrase above into concrete actions
		album.checkOut();

	}

	@Then("^the user4 does the checkout$")
	public void the_User4_Does_The_Checkout() throws InterruptedException, IOException {
		// Write code here that turns the phrase above into concrete actions
		album.billingAddress();

	}

	@Then("^the user4 fills the details in billing address$")
	public void the_user4_fills_the_details_in_billing_address() throws InterruptedException, IOException {
		// Write code here that turns the phrase above into concrete actions
		album.closeBrowser();

	}
}
