package com.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_Login_Page {
	WebDriver driver;

	By loginlink = By.xpath("//a[@class='ico-login']");
	By email = By.xpath("//*[@id=\"Email\"]");
	By password = By.xpath("//*[@id=\"Password\"]");
	By rememberme = By.xpath("//*[@id=\"RememberMe\"]");
	By loginbtn = By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input");
	
	By profile = By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a");
	By customerinfo = By.xpath("/html/body/div[4]/div[1]/div[4]/div[1]/div/div[2]/ul/li[1]/a");
	
	By logout = By.xpath("//a[@class='ico-logout']");


	public void browser() { // browser for launch the chrome
		System.setProperty("webdriver.chrome.driver", "src/test/resources/Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();// maximizes the window
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

	}

	public void loginPage() // using web driver get visiting the testing web site
	{
		driver.get("http://demowebshop.tricentis.com/");
		System.out.println(driver.getTitle());// gets the title of page
	}

	// valid login
	public void loginDetails() throws IOException, InterruptedException {

		driver.findElement(loginlink).click();// click on the login link
		driver.findElement(email).sendKeys("kasee156@gmail.com");// enter the valid email
		driver.findElement(password).sendKeys("kase007"); // enter the valid password
		driver.findElement(rememberme).click();// clicks the remember me button
		driver.findElement(loginbtn).click(); // clicks the login button
	}

	public void close() throws InterruptedException {
		driver.findElement(logout).click(); // logout button
		Thread.sleep(3000);
		driver.close(); // close the current tab
	}

}