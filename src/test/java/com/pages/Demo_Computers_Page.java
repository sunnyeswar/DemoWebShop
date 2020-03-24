package com.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo_Computers_Page {

	WebDriver driver;

	By loginlink = By.xpath("//a[@class='ico-login']");
	By email = By.xpath("//*[@id=\"Email\"]");
	By password = By.xpath("//*[@id=\"Password\"]");
	By loginbtn = By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input");
	By computers = By.xpath("/html/body/div[4]/div[1]/div[4]/div[1]/div[1]/div[2]/ul/li[2]/a");
	By desktop = By.xpath("//li[@class='inactive']//a[contains(text(),'Desktops')]");
	By sortby = By.xpath("//select[@id='products-orderby']");
	By buildcheapcomp = By.xpath("//h2[@class='product-title']//a[contains(text(),'Build your own cheap computer')]");
	By processor = By.xpath("//input[@id='product_attribute_72_5_18_65']");
	By ram = By.xpath("//input[@id='product_attribute_72_6_19_55']");
	By hdd = By.xpath("//input[@id='product_attribute_72_3_20_58']");
	By software = By.xpath("//input[@id='product_attribute_72_8_30_95']");
	By quantity = By.xpath("//input[@id='addtocart_72_EnteredQuantity']");
	By addtocart1 = By.xpath("//input[@id='add-to-cart-button-72']");
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

	public void browser() {
		// browser for launch the chrome
		System.setProperty("webdriver.chrome.driver", "src/test/resources/Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();// maximizes the window
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

	}

	public void loginPage()
	// using webdriver get visiting the testing website
	{
		driver.get("http://demowebshop.tricentis.com/");
		System.out.println(driver.getTitle());// gets the title of page
	}

	public void addToCart() throws IOException, InterruptedException {

		driver.findElement(loginlink).click();// click on the login link
		driver.findElement(email).sendKeys("eswar12@gmail.com");// enter the valid email
		driver.findElement(password).sendKeys("eswar186"); // enter the vaild password
		driver.findElement(loginbtn).click();// click on the login button
		driver.findElement(computers).click();// click on the computers link
		driver.findElement(desktop).click();// click on the desktop link
		driver.findElement(sortby).click();// select range using sort by
		WebElement bookdropdown = driver.findElement(sortby);
		Select dropdown = new Select(bookdropdown);
		dropdown.selectByVisibleText("Name: Z to A");
		driver.findElement(buildcheapcomp).click();// select the build cheap comp
		driver.findElement(processor).click();// select the processor
		driver.findElement(ram).click();// select the ram
		driver.findElement(hdd).click();// select the hdd
		driver.findElement(software).click();// select the software
		driver.findElement(quantity).clear();// clear the quantity
		driver.findElement(quantity).sendKeys("2");// enter the amount of quantity
		driver.findElement(addtocart1).click();// click on the add to cart button
	}

	public void checkOut() throws IOException, InterruptedException {

		driver.findElement(shopping_cart).click();// click on the shopping cart link
		WebElement country_dropdown = driver.findElement(country);// select the country from country drop down
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
		driver.findElement(city).sendKeys("Vijayawada");// enter the city name
		driver.findElement(address).sendKeys("roadno:12,benz circle");// enter the address
		driver.findElement(postalCode).sendKeys("234134");// enter the postal code
		driver.findElement(phoneNo).sendKeys("1234534523");// enter the phone number

	}

	public void closeBrowser() throws InterruptedException {
		driver.close(); // close the current tab
	}
}
