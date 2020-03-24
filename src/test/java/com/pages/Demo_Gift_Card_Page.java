package com.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo_Gift_Card_Page {

	WebDriver driver;

	By loginlink = By.xpath("//a[@class='ico-login']");
	By email = By.xpath("//*[@id=\"Email\"]");
	By password = By.xpath("//*[@id=\"Password\"]");
	By loginbtn = By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input");
	By giftcard = By.xpath("//li[@class='inactive']//a[contains(text(),'Gift Cards')]");
	By virtualgiftcard = By.xpath("//a[contains(text(),'$25 Virtual Gift Card')]");
	By name = By.xpath("//input[@id='giftcard_2_RecipientName']");
	By emailid = By.xpath("//input[@id='giftcard_2_RecipientEmail']");
	By message = By.xpath("//textarea[@id='giftcard_2_Message']");
	By addtocart1 = By.xpath("//input[@id='add-to-cart-button-2']");
	By shopping_cart = By.xpath("//span[contains(text(),'Shopping cart')]");
	By country = By.xpath("//*[@id=\'CountryId\']");
	By i_agree = By.xpath("//*[@id=\'termsofservice\']");
	By checkout = By.xpath("//*[@id=\'checkout\']");

	public void browser() { 
		// browser for launch the chrome
		System.setProperty("webdriver.chrome.driver", "src/test/resources/Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();// maximize the window
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

	}

	public void appPage()
	// using webdriver get visiting the testing website
	{
		driver.get("http://demowebshop.tricentis.com/");
		System.out.println(driver.getTitle());// get the title of page
	}

	public void addToCart() throws IOException, InterruptedException {

		driver.findElement(loginlink).click();//click on the login link
		driver.findElement(email).sendKeys("vineeth13@gmail.com");// enter the valid email
		driver.findElement(password).sendKeys("vineeth13"); // enter the vaild password
		driver.findElement(loginbtn).click();//click on the login button
		driver.findElement(giftcard).click();//click on the gift card link
		driver.findElement(virtualgiftcard).click();//select virtual gift card link
		driver.findElement(name).sendKeys("Kasee");//enter the recipient's name
		driver.findElement(emailid).sendKeys("kasee156@gmail.com");//enter the recipient's email
		driver.findElement(message).sendKeys("Happy gift card");//enter the message to send
		driver.findElement(addtocart1).click();//click on add to cart button
	}

	public void checkOut() throws IOException, InterruptedException {

		driver.findElement(shopping_cart).click();//click on the shopping cart link
		WebElement country_dropdown = driver.findElement(country);// select the country from country drop down
		Select dropdown1 = new Select(country_dropdown);
		dropdown1.selectByVisibleText("India");
		driver.findElement(i_agree).click();//click on the i agree check box
		driver.findElement(checkout).click();//click on the check out button
	}

	public void closeBrowser() throws InterruptedException {
		driver.close(); // close the current tab
	}
}