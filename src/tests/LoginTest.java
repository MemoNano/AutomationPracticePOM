package tests;

import java.lang.module.Configuration;

import org.openqa.selenium.WebDriver;
import static org.testng.Assert.*;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.classes.AccountPage;
import pages.classes.HomePage;
import pages.classes.LoginPage;
import utilities.Browser;
import utilities.Config1;

public class LoginTest {
	
	
		WebDriver driver;
	
	@Test
	public void positiveLoginTest() {
		driver = Browser.getDriver();
		Config1.getPropertyValue("url");
		//Create object from HomePage
		
		HomePage homePage = new HomePage();
		
		//verify at page
		Assert.assertTrue(homePage.isAt());
		
		// verify logo is displayed
		Assert.assertTrue(homePage.logo.isDisplayed());
		
		
		homePage.gotoLoginPage();
		
		LoginPage loginPage = new LoginPage(Browser.getDriver());
		assertTrue(loginPage.isAt());
		
		assertTrue(loginPage.createAccountLabel.isDisplayed());
		assertTrue(loginPage.alreadyRegisteredLabel.isDisplayed());
		
		//Enter valid email and password then click Sign in 
		loginPage.email.sendKeys("memo8812@.gmail.com");
		loginPage.password.sendKeys("password");
		//loginPage.email.sendKeys(Config1.getPropertyValue("email"));
		//loginPage.password.sendKeys(Config1.getPropertyValue("password"));
		loginPage.SubmitLogin.click();
		

	}

}
