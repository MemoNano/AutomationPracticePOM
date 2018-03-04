package tests;

import java.awt.AWTException;
import java.io.ObjectInputFilter.Config;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pages.classes.Page;
import utilities.Browser;
import utilities.Config1;

public class PageTest {
	
	
	WebDriver driver;
	
	@Test
	public void test() throws AWTException {
		
		driver = Browser.getDriver();
		driver.get(Config1.getPropertyValue("url"));
		Page.mouseWheel(20);
	}
	
	
	

}
