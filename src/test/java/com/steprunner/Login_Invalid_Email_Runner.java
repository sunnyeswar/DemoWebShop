package com.steprunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/main/resources/feature/TestCase.feature",
		plugin = {"pretty", "html:Report/cucumber_html_report"},
		tags = {"@TC04_LoginInvalidEmailid"},
			//	dryRun = true, gives the scenario
		glue = {"com.stepdefinition"},
		monochrome = true
		)

public class Login_Invalid_Email_Runner {

}
