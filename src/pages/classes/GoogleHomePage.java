package pages.classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleHomePage {
	
	private WebDriver driver;
	
	public GoogleHomePage(WebDriver driver) {
		this.driver=driver;
		
		PageFactory .initElements(driver, this); 
		
	}
	
	public boolean isAt() {
		return driver.getTitle().equals("Google");
		 
	}
	
	
	@FindBy(name="q")
	public WebElement seachFor;
	
	@FindBy(id="resultStats")
	public WebElement resultStats;
	

}
