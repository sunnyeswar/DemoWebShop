package com.pages;



import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Reward_Point_Page {


	WebDriver driver;
	
	By loginlink=By.xpath("//a[@class='ico-login']");
	By email=By.xpath("//*[@id=\"Email\"]");
	By password=By.xpath("//*[@id=\"Password\"]");
	By loginbtn=By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input");	
   
    
    By profile=By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a");
    By rewardpoint=By.xpath("/html/body/div[4]/div[1]/div[4]/div[1]/div/div[2]/ul/li[6]/a");
    By logout=By.xpath("//a[@class='ico-logout']"); 
	
	public void browser() { 
		// browser for launch the chrome
		System.setProperty("webdriver.chrome.driver", "src/test/resources/Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();//maximize the window
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
	}
	
	public void loginPage() 
	//using webdriver get visiting the testing website
	{
		driver.get("http://demowebshop.tricentis.com/");
		System.out.println(driver.getTitle());//gets the title of page
	}
	
	public void rewardPoint()throws IOException{
		
		driver.findElement(loginlink).click();//click on the login link
		driver.findElement(email).sendKeys("candychandu186@gmail.com");//enter the valid email
		driver.findElement(password).sendKeys("chandu123");//enter the password
		driver.findElement(loginbtn).click();//click on the login button
		driver.findElement(profile).click();// click on the profile link
		driver.findElement(rewardpoint).click();//click on the reward point link 
		String actual=driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[1]/h1")).getText();
		String expected="My account - Reward points";
        assertEquals(actual, expected);	
        System.out.println("assert equals");
        
	}
	
	public void close() throws InterruptedException
	{
	    driver.findElement(logout).click();// click on the logout button
		driver.close(); // close the current tab
	}
}
