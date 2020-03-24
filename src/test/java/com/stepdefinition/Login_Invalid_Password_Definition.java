package com.stepdefinition;

import java.io.IOException;
import com.pages.Login_Invalid_Password_Page;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login_Invalid_Password_Definition {

	Login_Invalid_Password_Page myLogin = new Login_Invalid_Password_Page();

	@Given("^launching the chrome$")
	public void launching_The_Chrome() throws IOException {
		// Write code here that turns the phrase above into concrete actions
		myLogin.browser();
	}

	@When("^user login to the home page$")
	public void user_Login_To_The_Home_Page() {
		// Write code here that turns the phrase above into concrete actions
		myLogin.loginPage();
	}

	@Then("^the user login using valid (.+)$")
	public void the_User_Login_Using_Valid_Emailid(String emailid) throws InterruptedException, IOException {
		// Write code here that turns the phrase above into concrete actions
		myLogin.validEmail(emailid);

	}

	@And("^the user login using invalid (.+)$")
	public void invalid_Password(String pass) throws IOException, InterruptedException {
		myLogin.invalidPassword(pass);
	}

	@Then("^click on login button user should not navigate to the next page$")
	public void click_On_Login_Button_User_Should_Not_Navigate_To_The_Next_Page() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		myLogin.close();

	}
}
