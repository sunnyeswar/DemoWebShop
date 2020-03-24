package com.stepdefinition;

import java.io.IOException;

import com.pages.Demo_Login_Page;
import com.pages.Demo_News_Letter_Page;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Demo_News_Letter_Definition {

	Demo_News_Letter_Page newsLetter = new Demo_News_Letter_Page();

	@Given("^launch the chrome8 browser$")
	public void launch_The_Chrome8_Browser() throws IOException {
		// Write code here that turns the phrase above into concrete actions
		newsLetter.browser();
	}

	@When("^open the app page8$")
	public void open_The_App_Page8() {
		// Write code here that turns the phrase above into concrete actions
		newsLetter.loginPage();
	}

	@Then("^subscribe to newsletter$")
	public void subscribe_To_Newsletter() throws InterruptedException, IOException {
		// Write code here that turns the phrase above into concrete actions
		newsLetter.newsLetterSubscribe();

	}

	@Then("^user closes the chrome8 browser$")
	public void user_Closes_The_Chrome8_Browser() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		newsLetter.close();

	}

}
