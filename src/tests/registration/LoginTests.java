package tests.registration;




import static org.testng.Assert.assertTrue;

import java.lang.module.Configuration;

import org.testng.annotations.Test;

import com.prestashop.pages.AccountPage;
import com.prestashop.pages.HomePage;
import com.prestashop.pages.LoginPage;

import utilities.Config1;
import utilities.TestBaseClass;

public class LoginTests extends TestBaseClass {
	
	
	

	
	@Test
	public void positiveLoginTest() {
		//create object from Page class:
		HomePage homePage = new HomePage(driver);
		//verify at page
		assertTrue(homePage.isAt());
		//verify logo is displayed
		assertTrue(homePage.logo.isDisplayed());
		
		homePage.gotoLoginPage();
		
		LoginPage loginPage = new LoginPage(driver);
		assertTrue(loginPage.isAt());
		
		assertTrue(loginPage.createAccountlabel.isDisplayed());
		assertTrue(loginPage.alreadyRegisteredLabel.isDisplayed());
	
		//Enter valid email and password then click sign in
		/*
		loginPage.email.sendKeys(Configuration.getProperty("email"));
		loginPage.password.sendKeys(Configuration.getProperty("password"));
		loginPage.SubmitLogin.click();
		*/
		loginPage.login(Config1.getPropertyValue("email"),
				Config1.getPropertyValue("password"));
		
		AccountPage accountPage = new AccountPage(driver);
		assertTrue(accountPage.isAt(), "Account page is not loaded/displayed");
		
		assertTrue(accountPage.verifyUserOptions(
				"ORDER HISTORY AND DETAILS",
				"MY CREDIT SLIPS", 
				"MY ADDRESSES", 
				"MY PERSONAL INFORMATION", 
				"MY WISHLISTS")
				);
		
	}
}
