package com.pages;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Forgot_Password_Page {

	WebDriver driver;

	By loginlink = By.xpath("//a[@class='ico-login']");
	By email = By.xpath("//*[@id=\'Email\']");
	By forgotpassword = By.xpath("//a[contains(text(),'Forgot password?')]");
	By recoveremail = By.xpath("//input[@id='Email']");
	By recover = By.xpath("//input[@name='send-email']");

	public void browser() {
		// browser for launch the chrome
		System.setProperty("webdriver.chrome.driver", "src/test/resources/Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();// maximize the window
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

	}

	public void loginPage()
	// using webdriver get visiting the testing website
	{
		driver.get("http://demowebshop.tricentis.com/");
		System.out.println(driver.getTitle());// gets the title of page
	}

	public void accountInfo() throws IOException {

		driver.findElement(loginlink).click();// click on the login link
		driver.findElement(email).sendKeys("eswar12@gmail.com");// enter the valid email
		driver.findElement(forgotpassword).click();// click on the forgot password link
		driver.findElement(recoveremail).sendKeys("eswar12@gmail.com");// enter the email for recovery
		driver.findElement(recover).click();// click on the recover button
		String actual = driver.findElement(By.xpath("//div[@class='result']")).getText();// comparing
		String expected = "Email with instructions has been sent to you.";
		assertEquals(actual, expected);
		System.out.println("assert equals");

	}

	public void close() throws InterruptedException {
		driver.close(); // close the current tab
	}
}
