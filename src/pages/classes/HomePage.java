package pages.classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Browser;

public class HomePage {
	
	
	private WebDriver driver;
	
	public HomePage() {
		this.driver=Browser.getDriver();
		// PageFactory --> is a class in Selenium to support POM
		PageFactory.initElements(driver, this);  // this - means this page
		
		
	}
	
	@FindBy(linkText="Sign in")
	public WebElement signInLink;
	
	@FindBy(xpath="//img[@class='logo img-responsive']")
	public WebElement logo;
	
	
public boolean isAt() {
	return driver.getTitle().equals("My Store");
	 
}



public void gotoLoginPage() {
	signInLink.click();
}



}
