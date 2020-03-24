package com.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo_Digital_Page {

	WebDriver driver;

	By loginlink = By.xpath("//a[@class='ico-login']");
	By email = By.xpath("//*[@id=\"Email\"]");
	By password = By.xpath("//*[@id=\"Password\"]");
	By loginbtn = By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input");
	By digital = By.xpath("/html/body/div[4]/div[1]/div[4]/div[1]/div[1]/div[2]/ul/li[5]/a");
	By album = By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[1]/div/div[2]/h2/a");
	By addtocart1 = By.xpath("//*[@id=\"add-to-cart-button-53\"]");
	By shopping_cart = By.xpath("//span[contains(text(),'Shopping cart')]");
	By country = By.xpath("//*[@id=\'CountryId\']");
	By i_agree = By.xpath("//*[@id=\'termsofservice\']");
	By checkout = By.xpath("//*[@id=\'checkout\']");

	By company = By.xpath("//*[@id=\'BillingNewAddress_Company\']");
	By select_country = By.xpath("//*[@id=\'BillingNewAddress_CountryId\']");
	By city = By.xpath("//*[@id=\"BillingNewAddress_City\"]");
	By address = By.xpath("//*[@id=\"BillingNewAddress_Address1\"]");
	By postalCode = By.xpath("//input[@id='BillingNewAddress_ZipPostalCode']");
	By phoneNo = By.xpath("//input[@id='BillingNewAddress_PhoneNumber']");

	/* By logout=By.xpath("//a[@class='ico-logout']"); */

	public void browser() {
		// browser for launch the chrome
		System.setProperty("webdriver.chrome.driver", "src/test/resources/Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();// maximize the window
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

	}

	public void appPage()
	// using webdriver get visting the testing website
	{
		driver.get("http://demowebshop.tricentis.com/");
		System.out.println(driver.getTitle());// get the title of the page
	}

	public void addToCart() throws IOException, InterruptedException {

		driver.findElement(loginlink).click();// click on the login link
		driver.findElement(email).sendKeys("kasee156@gmail.com");// enter the valid email
		driver.findElement(password).sendKeys("kase007"); // enter the vaild password
		driver.findElement(loginbtn).click();// click on the login button
		driver.findElement(digital).click();// click on the digital link
		driver.findElement(album).click();// select the album
		driver.findElement(addtocart1).click();// click on add to cart button
	}

	public void checkOut() throws IOException, InterruptedException {

		driver.findElement(shopping_cart).click();// click on the shopping cart link
		WebElement country_dropdown = driver.findElement(country);// slect country from country drop down
		Select dropdown1 = new Select(country_dropdown);
		dropdown1.selectByVisibleText("India");
		driver.findElement(i_agree).click();// click on the i agree check box
		driver.findElement(checkout).click();// click on the check out button
	}

	public void billingAddress() throws IOException, InterruptedException {

		driver.findElement(company).sendKeys("bluelotus");// enter the company name
		WebElement country_dropdown1 = driver.findElement(select_country);// select country from country drop down
		Select dropdown2 = new Select(country_dropdown1);
		dropdown2.selectByVisibleText("India");
		driver.findElement(city).sendKeys("Vishakapatnam");// enter the city name
		driver.findElement(address).sendKeys("roadno:12, Beach road");// enter the address
		driver.findElement(postalCode).sendKeys("234123");// enter the postal code
		driver.findElement(phoneNo).sendKeys("1234567890");// enter the phone number

	}

	public void closeBrowser() throws InterruptedException {
		driver.close(); // close the current tab
	}
}
