package com.stepdefinition;

import java.io.IOException;

import com.pages.Demo_Gift_Card_Page;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Demo_Gift_Card_Definition {

Demo_Gift_Card_Page giftCard =new Demo_Gift_Card_Page();
	
	@Given("^launch the chrome6 application$")
	public void launch_The_Chrome6_Application() throws IOException  {
	    // Write code here that turns the phrase above into concrete actions
		giftCard.browser();
	}

	@When("^the user6 logged in to the home page$")
	public void the_User6_Logged_In_To_The_Home_Page() {
	    // Write code here that turns the phrase above into concrete actions
		giftCard.appPage();
	}

	@Then("^the user6 login using id and password$")
	public void the_User6_Login_Using_Emailid_And_Password() throws InterruptedException, IOException {
	    // Write code here that turns the phrase above into concrete actions			
		giftCard.addToCart();
	 
	}
		
	@Then("^the user6 click the giftCard and add to cart$")
	public void the_User6_Does_The_Checkout()throws InterruptedException, IOException{
		 // Write code here that turns the phrase above into concrete actions
		giftCard.checkOut();
		
	}
	
	@Then("^the user6 does the checkout$")
	public void the_User6_Click_The_chain_And_Add_To_Cart() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		giftCard.closeBrowser();
	
	}
}
