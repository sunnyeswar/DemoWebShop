package com.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Add_To_Cart_Page {

	WebDriver driver;

	By loginlink = By.xpath("//a[@class='ico-login']");
	By email = By.xpath("//*[@id=\"Email\"]");
	By password = By.xpath("//*[@id=\"Password\"]");
	By loginbtn = By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input");
	By books = By.xpath("/html/body/div[4]/div[1]/div[4]/div[1]/div[1]/div[2]/ul/li[1]/a");
	By sortby = By.xpath("//select[@id='products-orderby']");
	By computinginternet = By
			.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[1]/div/div[2]/h2/a");
	By quantity = By.xpath("//*[@id=\'addtocart_13_EnteredQuantity\']");
	By addtocart = By.xpath("//*[@id=\'add-to-cart-button-13\']");
	By shopping_cart = By.xpath("//*[@id=\'topcartlink\']/a/span[1]");
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
		driver.manage().window().maximize();// maximize the window
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

	}

	public void loginPage()
	// using web driver get visiting the testing website
	{
		driver.get("http://demowebshop.tricentis.com/");
		System.out.println(driver.getTitle());// gets the title of page
	}

	public void addToCart() throws IOException, InterruptedException {

		driver.findElement(loginlink).click();// click on the login link
		driver.findElement(email).sendKeys("kasee156@gmail.com");// enter the valid email
		driver.findElement(password).sendKeys("kase007");// enter the vaild password
		driver.findElement(loginbtn).click();// click on the login button
		driver.findElement(books).click();// click on the books
		driver.findElement(sortby).click();// select by sort by element
		WebElement bookdropdown = driver.findElement(sortby);
		Select dropdown = new Select(bookdropdown);
		dropdown.selectByVisibleText("Name: A to Z");
		driver.findElement(computinginternet).click();// click on the computing internet book
		driver.findElement(quantity).clear();// clear the quantity
		driver.findElement(quantity).sendKeys("2");// enter the quantity
		driver.findElement(addtocart).click();// click on the add to cart button
	}

	public void checkOut() throws IOException, InterruptedException {

		driver.findElement(shopping_cart).click();// click on the shopping cart link
		WebElement country_dropdown = driver.findElement(country);// select country from country dropdown
		Select dropdown1 = new Select(country_dropdown);
		dropdown1.selectByVisibleText("India");
		driver.findElement(i_agree).click();// click on i agree check box
		driver.findElement(checkout).click();// click on checkout button
	}

	public void billingAddress() throws IOException, InterruptedException {

		driver.findElement(company).sendKeys("bluelotus");// enter the company name
		WebElement country_dropdown1 = driver.findElement(select_country);// select country from country dropdown
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