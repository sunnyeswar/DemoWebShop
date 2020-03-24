package com.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_Remove_Page {

	WebDriver driver;

	By loginlink = By.xpath("//a[@class='ico-login']");
	By email = By.xpath("//*[@id=\"Email\"]");
	By password = By.xpath("//*[@id=\"Password\"]");
	By rememberme = By.xpath("//*[@id=\"RememberMe\"]");
	By loginbtn = By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input");
	By shoppingCartLink = By.xpath("//span[contains(text(),'Shopping cart')]");
	By remove = By.xpath("//tr[1]//td[1]//input[1]");
	By updateCart=By.xpath("//input[@name='updatecart']");
	By home=By.xpath("//div[@class='header-logo']//a//img");

	public void browser() { // browser for launch the chrome
		System.setProperty("webdriver.chrome.driver", "src/test/resources/Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();// maximizes the window
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

	}

	public void appPage() // using web driver get visiting the testing web site
	{
		driver.get("http://demowebshop.tricentis.com/");
		System.out.println(driver.getTitle());// gets the title of page
	}

	public void loginDetails() throws IOException, InterruptedException {

		driver.findElement(loginlink).click();// click on the login link
		driver.findElement(email).sendKeys("candychandu186@gmail.com");// enter the valid email
		driver.findElement(password).sendKeys("chandu123"); // enter the valid password
		driver.findElement(rememberme).click();// clicks the remember me button
		driver.findElement(loginbtn).click(); // clicks the login button

	}

	public void remove() throws IOException, InterruptedException {

		driver.findElement(shoppingCartLink).click();// click on the shopping cart link
		driver.findElement(remove).click();// click on the remove button
        driver.findElement(updateCart).click();//click on update cart button
        driver.findElement(home).click();//click on demo web shop image
	}

	public void close() throws InterruptedException {
		driver.close(); // close the current tab
	}

}
