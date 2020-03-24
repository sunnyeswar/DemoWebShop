package com.stepdefinition;

import java.io.IOException;

import com.pages.Account_Info_Page;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Account_Info_Definition {

	Account_Info_Page myInfo = new Account_Info_Page();

	@Given("^launching chrome application$")
	public void the_User_Launches_The_Chrome_Application() throws IOException {
		// Write code here that turns the phrase above into concrete actions
		myInfo.browser();
	}

	@When("^the user login to home page$")
	public void the_User_Loggedin_To_The_Home_Page() {
		// Write code here that turns the phrase above into concrete actions
		myInfo.loginPage();
	}

	@Then("^the user get logged in$")
	public void the_User_Login_Using_Emailid_And_Password() throws InterruptedException, IOException {
		// Write code here that turns the phrase above into concrete actions
		myInfo.accountInfo();

	}

	@Then("^user get the customer info$")
	public void click_On_The_Login_Button_User_Nagivate_To_The_Next_Page() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		myInfo.close();

	}

}
