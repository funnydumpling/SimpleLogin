package com.interview.webapp.login;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class DemoTest {
	
	WebDriver driver = new ChromeDriver();
	DemoOR demoOR = new DemoOR(driver);
	
	@BeforeTest
	  public void beforeTest() 
	{
		driver.navigate().to(Constants.URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
   }

	@Test
  public void login() 
	{
		try
		{	demoOR.getTextBoxUsername().sendKeys(Constants.USERNAME);
			demoOR.getTextBoxPassword().sendKeys(Constants.PASSWORD);
			demoOR.getButtonLogin().click();
			
			System.out.println(driver.getTitle());
			Assert.assertTrue(driver.getTitle().equals(Constants.MAINPAGETITLE), "User logged in successfully");
			
			//demoOR.display();
			
			demoOR.selectMenuOption(Constants.menuOption1);
			
			System.out.println("Navigated to Manager Tab");
			
		}catch(Exception e)
		{
			System.out.println(e.getClass());
		}
	}
  @AfterTest
  public void afterTest() {
	  
	  driver.close();
  }

}
