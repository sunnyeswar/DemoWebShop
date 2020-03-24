package com.pages;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Account_Info_Page {

	WebDriver driver;

	By loginlink = By.xpath("//a[@class='ico-login']");
	By email = By.xpath("//*[@id=\"Email\"]");
	By password = By.xpath("//*[@id=\"Password\"]");
	By loginbtn = By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input");

	By profile = By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a");
	By customerinfo = By.xpath("/html/body/div[4]/div[1]/div[4]/div[1]/div/div[2]/ul/li[1]/a");

	By logout = By.xpath("//a[@class='ico-logout']");

	public void browser() {
		// browser for launch the chrome
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

	public void accountInfo() throws IOException {

		driver.findElement(loginlink).click();// click on the login link
		driver.findElement(email).sendKeys("vineeth13@gmail.com");// enter valid email
		driver.findElement(password).sendKeys("vineeth13");// enter valid password
		driver.findElement(loginbtn).click();// click on login button
		driver.findElement(profile).click();// click on profile link
		driver.findElement(customerinfo).click();// click on customer info
		String actual = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[1]/h1")).getText();
		String expected = "My account - Customer info";
		assertEquals(actual, expected);
		System.out.println("assert equals");

	}

	public void close() throws InterruptedException {
		driver.findElement(logout).click();// click on the logout button
		driver.close(); // close the current tab
	}
}
