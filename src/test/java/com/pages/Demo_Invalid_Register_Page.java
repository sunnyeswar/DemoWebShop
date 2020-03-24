package com.pages;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_Invalid_Register_Page {
	WebDriver driver;

	By registerlink = By.xpath("//a[@class='ico-register']");
	By radiofemale = By.xpath("//label[contains(text(),'Female')]");
	By firstname = By.xpath("//input[@id='FirstName']");
	By lastname = By.xpath("//input[@id='LastName']");
	By email = By.xpath("//input[@id='Email']");
	By password = By.xpath("//input[@id='Password']");
	By confirmpassword = By.xpath("//input[@id='ConfirmPassword']");
	By registerbtn = By.xpath("//input[@id='register-button']");
	By continuetohome = By.xpath("//input[@class='button-1 register-continue-button']");
	By logout = By.xpath("//a[@class='ico-logout']");

	public void browser() {
		// url for launch the chrome
		System.setProperty("webdriver.chrome.driver", "src/test/resources/Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();// maximizes the window
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

	}

	public void registerPage()
	// using web driver get visiting the testing website
	{
		driver.get("http://demowebshop.tricentis.com/");
		System.out.println(driver.getTitle());// gets the title of page
	}

	public void registerInvalidDetails() throws IOException, InterruptedException {

		driver.findElement(registerlink).click(); // clicking on register link
		driver.findElement(radiofemale).click();// clicking on radio button
		driver.findElement(firstname).sendKeys("Vineeth");// entering the first name
		driver.findElement(lastname).sendKeys("korivi");// entering last name
		driver.findElement(email).sendKeys("vineeth@12@gmail.com");// enter the invalid email
		driver.findElement(password).sendKeys("vineeth 007!"); // enter the valid password
		driver.findElement(confirmpassword).sendKeys("vineeth 007!");// confirm password
		String actual = driver
				.findElement(By.xpath(
						"/html/body/div[4]/div[1]/div[4]/div[2]/form/div/div[2]/div[2]/div[2]/div[4]/span[2]/span"))
				.getText();
		String expected = "Wrong email";
		assertEquals(actual, expected);
		System.out.println("assert equals");

	}

	public void quit() throws InterruptedException {

		driver.close(); // close the current tab
	}

}
