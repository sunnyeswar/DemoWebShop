package com.stepdefinition;

import java.io.IOException;

import com.pages.Forgot_Password_Page;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Forgot_Password_Definition {

	Forgot_Password_Page forgotPassword = new Forgot_Password_Page();

	@Given("^launch chrome browser$")
	public void launch_Chrome_Browser() throws IOException {
		// Write code here that turns the phrase above into concrete actions
		forgotPassword.browser();
	}

	@When("^user forgot password$")
	public void user_Forgot_Password() {
		// Write code here that turns the phrase above into concrete actions
		forgotPassword.loginPage();
	}

	@Then("^user recover password$")
	public void user_Recover_Password() throws InterruptedException, IOException {
		// Write code here that turns the phrase above into concrete actions
		forgotPassword.accountInfo();

	}

	@Then("^close the browser$")
	public void close_The_Browser() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		forgotPassword.close();

	}
}
