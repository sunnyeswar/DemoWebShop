package com.stepdefinition;

import java.io.IOException;

import com.pages.Demo_Contactus_Page;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Demo_Contactus_Definition {

	Demo_Contactus_Page contactUs = new Demo_Contactus_Page();

	@Given("^launch the chrome7 browser$")
	public void launch_The_Chrome7_Browser() throws IOException {
		// Write code here that turns the phrase above into concrete actions
		contactUs.browser();
	}

	@When("^open the app page7$")
	public void user7_Logged_Into_App() {
		// Write code here that turns the phrase above into concrete actions
		contactUs.appPage();
	}

	@Then("^user7 login using email (.+)$")
	public void user7_Login_Using_Emailid1(String emailid7) throws InterruptedException, IOException {
		// Write code here that turns the phrase above into concrete actions
		contactUs.email(emailid7);

	}

	@And("^user7 login using password (.+)$")
	public void user7_Login_Using_Pass1(String password7) throws IOException, InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		contactUs.password(password7);

	}

	@Then("^user7 writes his (.+)$")
	public void user7_Writes_His_Enquiry1(String enquiry1) throws IOException {
		// Write code here that turns the phrase above into concrete actions
		contactUs.enquiry(enquiry1);

	}

	@Then("^user closes the chrome7 browser$")
	public void user_Closes_The_Chrome7_Browser() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		contactUs.close();
	}
}
