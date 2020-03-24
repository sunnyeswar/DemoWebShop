package com.pages;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_News_Letter_Page {

	WebDriver driver;

	By Letter = By.xpath("//input[@id='newsletter-email']");
	By subscribe = By.xpath("//input[@id='newsletter-subscribe-button']");

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

	public void newsLetterSubscribe() throws InterruptedException {

		driver.findElement(Letter).sendKeys("kasee156@gmail.com");// enter valid email
		driver.findElement(subscribe).click();// click on the subscribe link
		Thread.sleep(3000);
		String actual = driver.findElement(By.xpath("//*[@id=\"newsletter-result-block\"]")).getText();
		String expected = "Thank you for signing up! A verification email has been sent. We appreciate your interest.";
		Thread.sleep(3000);
		assertEquals(actual, expected);
		System.out.println("thanks for subscribing");

	}

	public void close() throws InterruptedException {
		driver.close();// close the current tab

	}
}
