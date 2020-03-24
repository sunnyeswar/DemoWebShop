package com.pages;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Invalid_Password_Page {

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
	// using web driver get visiting the testing website
	{
		driver.get("http://demowebshop.tricentis.com/");
		System.out.println(driver.getTitle());// gets the title of page
	}

	public void validEmail(String emailid) throws IOException, InterruptedException {
		driver.findElement(loginlink).click();// click on the login link
		driver.findElement(email).sendKeys(emailid);// enter the valid email
	}

	// login using invalid password
	public void invalidPassword(String pass) throws IOException, InterruptedException {
		driver.findElement(password).sendKeys(pass); // enter the invalid password
		driver.findElement(rememberme).click();// click on remember me
		driver.findElement(loginbtn).click();// click on login button
		String actual = driver.findElement(By.xpath("//li[contains(text(),'The credentials provided are incorrect')]"))
				.getText();
		String expected = "The credentials provided are incorrect";
		assertEquals(actual, expected);
		System.out.println("assert equals");

	}

	public void close() throws InterruptedException {

		driver.close(); // close the current tab
	}
}
