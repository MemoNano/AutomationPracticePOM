package pages.classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Browser;

public class LoginPage {
	
	private WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver=Browser.getDriver();
		
		PageFactory.initElements(driver, this);
				
	}
	
	
	@FindBy(xpath="//h3[.='Already registered?']")
	public WebElement createAccountLabel;
	
	@FindBy(xpath="//h3[.='Create an account']")
	public WebElement alreadyRegisteredLabel;
	
	@FindBy(name="email")
	public WebElement email;
	
	@FindBy(id="passwd")
	public WebElement password;
	
	// It will search the element by ID=SubmitLogin or name=SubmitLogin (sameThing)
	public WebElement SubmitLogin;
	
	
	public boolean isAt() {
		return driver.getTitle().equals("My Store");
		
		
		
	}
	
	public void login(String lEmail, String lPassword) {
		email.sendKeys(lEmail);
		password.sendKeys(lPassword);
		SubmitLogin.click();
		
		
		
	}

}
