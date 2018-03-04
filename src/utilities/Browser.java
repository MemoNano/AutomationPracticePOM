package utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import bsh.Remote;

public class Browser {
	
	

	private static WebDriver driver;

	public static WebDriver getDriver() {
		
		if(driver == null || ((RemoteWebDriver) driver).getSessionId() == null) {
			
		
		
		
		if(Config1.getPropertyValue("browser").equalsIgnoreCase("chrome")) {
		System.out.println("Setting up for Selenium");
		Config1.getPropertyValue("ChromePath");
		System.setProperty("webdriver.chrome.driver", Config1.getPropertyValue("ChromePath"));
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return driver;
		
		}
		
		else if(Config1.getPropertyValue("browser").equalsIgnoreCase("firefox")) {
				System.out.println("Setting up for Selenium");
				String driverPath = "C:\\Users\\Administrator\\Documents\\selenium dependencies\\drivers\\chromedriver.exe";
				System.setProperty("webdriver.gecko.driver", driverPath);
				driver = new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				
				return driver;
	}
		}		
		
				

		return driver;

}
}