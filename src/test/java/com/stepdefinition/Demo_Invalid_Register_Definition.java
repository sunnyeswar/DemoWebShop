package com.stepdefinition;

import java.io.IOException;

import com.pages.Demo_Invalid_Register_Page;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Demo_Invalid_Register_Definition {

	Demo_Invalid_Register_Page myRegister = new Demo_Invalid_Register_Page();

	@Given("^user launch the chrome application$")
	public void user_Launch_The_Chrome_Application() throws IOException {
		// Write code here that turns the phrase above into concrete actions
		myRegister.browser();
	}

	@When("^user open the DemoWebShop Register page$")
	public void user_Open_The_DemoWebShop_Register_page() {
		// Write code here that turns the phrase above into concrete actions
		myRegister.registerPage();
	}

	@Then("^user register by filling all invalid details$")
	public void user_Register_By_Filling_All_Invalid_Details() throws InterruptedException, IOException {
		// Write code here that turns the phrase above into concrete actions

		myRegister.registerInvalidDetails();

	}

	@Then("^click on the register button user should not navigate to the next page$")
	public void click_On_The_Register_Button_User_Should_Not_Nagivate_To_The_Next_Page() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions

		myRegister.quit();

	}
}
