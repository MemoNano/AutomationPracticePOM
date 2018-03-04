package tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import utilities.Browser;
import utilities.Config1;

public class Amazon {
	
	WebDriver driver;
	
	@FindBy(id="twotabsearchtextbox")
	WebElement seachBox;

	
	@Test
	public void set() {
		driver = Browser.getDriver();
		Browser.getDriver().get(Config1.getPropertyValue("url"));
		
		
		
		seachBox.sendKeys("Corolla 2006 S", Keys.ENTER);
		
		
	}
	
}
