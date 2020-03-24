package com.pages;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_Image_Page {

	WebDriver driver;

	public void browser() {
		// browser for launch the chrome
		System.setProperty("webdriver.chrome.driver", "src/test/resources/Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();// maximizes the window
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

	}

	public void demoWebShopPage()
	// using webdriver get visiting the testing website
	{
		driver.get("http://demowebshop.tricentis.com/");
		System.out.println(driver.getTitle());// gets the title of window
	}

	public void imageCount() throws IOException {

		List<WebElement> images = driver.findElements(By.tagName("img"));
		System.out.println(images.size());// gets the number of images count in the opening page of web site

	}

	public void close() throws InterruptedException {

		driver.close(); // close the current tab
	}
}