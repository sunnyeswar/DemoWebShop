package com.stepdefinition;

import java.io.IOException;

import com.pages.Reward_Point_Page;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Reward_Point_Definition {

	Reward_Point_Page myReward = new Reward_Point_Page();

	@Given("^launch chrome app$")
	public void launch_Chrome_App() throws IOException {
		// Write code here that turns the phrase above into concrete actions
		myReward.browser();
	}

	@When("^user get logged$")
	public void user_Get_Logged() {
		// Write code here that turns the phrase above into concrete actions
		myReward.loginPage();
	}

	@Then("^user get reward point info$")
	public void user_Get_Reward_Point_Info() throws InterruptedException, IOException {
		// Write code here that turns the phrase above into concrete actions
		myReward.rewardPoint();

	}

	@Then("^browser gets closed$")
	public void browser_Gets_Closed() throws InterruptedException, IOException {
		// Write code here that turns the phrase above into concrete actions
		myReward.close();

	}
}
