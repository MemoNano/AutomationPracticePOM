package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * WebDriver factory
 * Takes String as input and returns the implementation of the WebDriver based on that
 * 
 * @author Administrator
 *
 */

public class Driver {
	
	private static WebDriver driver;
	
	public static WebDriver getDriver( String browser) {
	String driverType = browser == null? Config1.getPropertyValue("browser"):browser;
	// If browser has value, use browser
	// else use the value from the configuration file
	
	
	
		
		if(driver == null) {
		
		//1. Read the browser type form the config file
		//String driverType = Config1.getPropertyValue("driver");
		
		//2. Create WebDriver based on the value of browser parameter
		switch(driverType.toLowerCase()) {
		case "chrome":
			//String driverPath = Config1.getPropertyValue("chromePath");
			System.setProperty("webdriver.chrome.driver", Config1.getPropertyValue("chromePath"));
			driver = new  ChromeDriver();
			break;
			
		case "firefox":
			break;
			
		case "ie":
			break;
			
		case "safari":
			break;	
		
		case "edge":
			break;		
		}
		}
		
		//3.return
		return driver;
	}
	static void quit(){
		
		
	}
	

}
