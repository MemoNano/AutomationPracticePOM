package pages.classes;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilities.Browser;

public class Page {

	
	
	public static void moveToElement(WebElement element) {
		
		Actions action = new Actions(Browser.getDriver());
		action.moveToElement(element).perform();
	}
	
	/**
	 * This method accepts positive 
	 * @param scrolls
	 * @throws AWTException
	 */
	
	public static void mouseWheel(int scrolls) throws AWTException {
		
		try {
		Robot robot = new Robot();
		robot.mouseWheel(scrolls);
		
			
		}catch(AWTException e) {
			System.out.println(e.getMessage());
			System.out.println("Could not scroll the mouse");
		}
		
	}
}
