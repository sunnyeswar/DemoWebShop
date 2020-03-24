package com.pages;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_Contactus_Page {

	WebDriver driver;

	By loginLink = By.xpath("//a[@class='ico-login']");
	By email = By.xpath("//*[@id=\"Email\"]");
	By password = By.xpath("//*[@id=\"Password\"]");
	By rememberMe = By.xpath("//*[@id=\"RememberMe\"]");
	By loginBtn = By.xpath("//input[@class='button-1 login-button']");

	By contactUs = By.xpath("//a[contains(text(),'Contact us')]");
	By enquiry = By.xpath("//textarea[@id='Enquiry']");
	By submit = By.xpath("//input[@name='send-email']");

	By logout = By.xpath("//a[@class='ico-logout']");

	public void browser()
	// browser for launch the chrome
	{
		System.setProperty("webdriver.chrome.driver", "src/test/resources/Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();// maximizes the window
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

	}

	public void appPage()
	// using webdriver get visiting the testing website
	{
		driver.get("http://demowebshop.tricentis.com/");
		System.out.println(driver.getTitle());// get the title of the page
	}

	public void email(String emailid7) throws IOException, InterruptedException {
		driver.findElement(loginLink).click();// click on the login link
		driver.findElement(email).sendKeys(emailid7);// enter the email
	}

	public void password(String password7) throws IOException, InterruptedException {
		driver.findElement(password).sendKeys(password7);// enter the password
		driver.findElement(rememberMe).click();// click on the remember me che
		driver.findElement(loginBtn).click();// click on the login button
	}

	public void enquiry(String enquiry1) throws IOException {
		driver.findElement(contactUs).click();// click on the contact us link
		driver.findElement(enquiry).sendKeys(enquiry1);// enter the enquiry to be sent
		driver.findElement(submit).click();// click on the submit button
		String actual = driver.findElement(By.xpath("//div[@class='result']")).getText();
		String expected = "Your enquiry has been successfully sent to the store owner.";
		assertEquals(actual, expected);
		System.out.println("Assert Equals");
	}

	public void close() throws InterruptedException {
		driver.findElement(logout).click(); // logout button
		driver.close(); // close the current tab
	}

}
