package com.stepdefinition;

import java.io.IOException;

import com.pages.Demo_Remove_Page;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Demo_Remove_Definition {


	Demo_Remove_Page remove = new Demo_Remove_Page();

	@Given("^launch the chrome9 browser$")
	public void launch_The_Chrome9_Browser() throws IOException {
		// Write code here that turns the phrase above into concrete actions
		remove.browser();
	}
	
	@When("^open the app page9$")
	public void open_The_App_Page9() {
		// Write code here that turns the phrase above into concrete actions
		remove.appPage();
	}


	@Then("^user9 login in to the home page$")
	public void user9_Login_In_To_The_Home_Page() throws IOException, InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		remove.loginDetails();
	}

	@Then("^user9 remove item from the cart$")
	public void user9_Remove_Item_From_The_Cart() throws InterruptedException, IOException {
		// Write code here that turns the phrase above into concrete actions
		remove.remove();

	}

	@Then("^user9 closes the browser$")
	public void user9_Closes_The_Browser() throws InterruptedException, IOException {
		// Write code here that turns the phrase above into concrete actions
		remove.close();

	}
}


