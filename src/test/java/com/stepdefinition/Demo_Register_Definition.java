package com.stepdefinition;

import java.io.IOException;
import com.pages.Demo_Register_Page;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Demo_Register_Definition {
	Demo_Register_Page myRegister = new Demo_Register_Page();

	@Given("^the user launch the chrome application$")
	public void the_User_Launch_The_Chrome_Application() throws IOException {
		// Write code here that turns the phrase above into concrete actions
		myRegister.browser();
	}

	@When("^the user open the DemoWebShop Register page$")
	public void the_User_Open_The_DemoWebShop_Register_page() {
		// Write code here that turns the phrase above into concrete actions
		myRegister.registerPage();
	}

	@Then("^the user register by filling all the necessary details$")
	public void the_User_Register_By_Filling_All_The_Necessary_Details() throws InterruptedException, IOException {
		// Write code here that turns the phrase above into concrete actions
		myRegister.registerDetails();

	}

	@Then("^click on the register button user navigate to the next page$")
	public void click_On_The_Register_Button_User_Nagivate_To_The_Next_Page() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		myRegister.submit();

	}

}
