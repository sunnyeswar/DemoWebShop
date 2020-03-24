package com.pages;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Invalid_Email_Page {
	
	WebDriver driver;

	By loginlink = By.xpath("//a[@class='ico-login']");
	By email = By.xpath("//*[@id=\"Email\"]");
	By password = By.xpath("//*[@id=\"Password\"]");
	By rememberme = By.xpath("//*[@id=\"RememberMe\"]");
	By loginbtn = By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input");
	By logout = By.xpath("//a[@class='ico-logout']");

	By profile = By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a");
	By customerinfo = By.xpath("/html/body/div[4]/div[1]/div[4]/div[1]/div/div[2]/ul/li[1]/a");

	public void browser() { 
		// url for launch the chrome
		System.setProperty("webdriver.chrome.driver", "src/test/resources/Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();// maximizes the window
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

	}

	public void loginPage() 
	// using web driver get visiting the testing web site
	{
		driver.get("http://demowebshop.tricentis.com/");
		System.out.println(driver.getTitle());// gets the title of page
	}

	// login using invalid email id
	public void loginInvalidDetails() throws IOException, InterruptedException {

		driver.findElement(loginlink).click();// click the login link
		driver.findElement(email).sendKeys("eswar@12@gmail.com");// enter the valid email
		driver.findElement(password).sendKeys("eswar186");// enter the valid password
		driver.findElement(rememberme).click();// click the remember button
		driver.findElement(loginbtn).click(); // click the login button
		String actual = driver
				.findElement(By.xpath(
						"/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[2]/span/span"))
				.getText();
		String expected = "Please enter a valid email address.";
		assertEquals(actual, expected);
		System.out.println("assert equals");

	}

	public void close() throws InterruptedException {

		driver.close(); // close the current tab
	}
}
