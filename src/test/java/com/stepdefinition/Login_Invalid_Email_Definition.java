package com.stepdefinition;

import java.io.IOException;

import com.pages.Login_Invalid_Email_Page;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login_Invalid_Email_Definition {

	Login_Invalid_Email_Page myLogin = new Login_Invalid_Email_Page();

	@Given("^launching the chrome appy$")
	public void launching_The_Chrome_Application() throws IOException {
		// Write code here that turns the phrase above into concrete actions
		myLogin.browser();
	}

	@When("^user login too home page$")
	public void the_User_Login_To_Home_Page() {
		// Write code here that turns the phrase above into concrete actions
		myLogin.loginPage();
	}

	@Then("^the user0 login using invalid emailid$")
	public void the_User0_Login_Using_Invalid_Emailid() throws InterruptedException, IOException {
		// Write code here that turns the phrase above into concrete actions
		myLogin.loginInvalidDetails();

	}

	@Then("^click on login button user1 should not navigate to the next page$")
	public void click_On_The_Login_Button_User1_Should_Not_Navigate_To_The_Next_Page() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		myLogin.close();

	}

}
