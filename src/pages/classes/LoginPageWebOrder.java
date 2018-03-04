package pages.classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageWebOrder {
	
	
	private WebDriver driver;

	public LoginPageWebOrder(WebDriver driver) {
	this.driver=driver;

	PageFactory.initElements(driver, this);

	}


	@FindBy(name="ctl00$MainContent$username")
	public WebElement userName;

	@FindBy(name="ctl00$MainContent$password")
	public WebElement userPassword;


	@FindBy(xpath="//input[@class='button']")
	public WebElement loginButton;

	public void login(String username, String password) {
	userName.sendKeys(username);
	userName.sendKeys(password);
	loginButton.click();

	}

	public boolean isAt() {
	return driver.getTitle().equals("\r\n" + 
	" Web Orders Login");

	}

}
