package com.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_Register_Page {
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
		driver.manage().window().maximize();//maximizes the window
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

	}

	public void registerPage()
	// using web driver get visiting the testing website
	{
		driver.get("http://demowebshop.tricentis.com/");
		System.out.println(driver.getTitle());// gets the title of page
	}

	public void registerDetails() throws IOException, InterruptedException {

		driver.findElement(registerlink).click(); // clicking on register link
		driver.findElement(radiofemale).click();// clicking on radio button
		driver.findElement(firstname).sendKeys("chandana");// entering the first name
		driver.findElement(lastname).sendKeys("surendra");// entering last name
		driver.findElement(email).sendKeys("chandana14229@gmail.com");// enter the valid email
		driver.findElement(password).sendKeys("chandu007!"); // enter the valid password
		driver.findElement(confirmpassword).sendKeys("chandu007!");// confirm password
		driver.findElement(registerbtn).click();// click on the register button
		driver.findElement(continuetohome).click();// click on continue to home

	}

	public void submit() throws InterruptedException {
		driver.findElement(logout).click();// click on the logout button
		Thread.sleep(3000);//waits for 3seconds
		driver.close(); // close the current tab
	}

}
