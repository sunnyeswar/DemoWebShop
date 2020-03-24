package com.stepdefinition;

import java.io.IOException;

import com.pages.Demo_Login_Page;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Demo_Login_Definition {
	Demo_Login_Page myLogin = new Demo_Login_Page();

	@Given("^user launches the chrome application$")
	public void the_user_launches_the_chrome_application() throws IOException {
		// Write code here that turns the phrase above into concrete actions
		myLogin.browser();
	}

	@When("^the user loggedin to the home page$")
	public void the_user_loggedin_to_the_home_page() {
		// Write code here that turns the phrase above into concrete actions
		myLogin.loginPage();
	}

	@Then("^the user login using emailid and password$")
	public void the_user_login_using_emailid_and_password() throws InterruptedException, IOException {
		// Write code here that turns the phrase above into concrete actions
		myLogin.loginDetails();

	}

	@Then("^click on the login button user navigate to the next page$")
	public void click_on_the_login_button_user_nagivate_to_the_next_page() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		myLogin.close();

	}

}