package utils;

import java.util.List;

import org.openqa.selenium.WebElement;

/**.
 * 
 * @author bobson
 * @version 0.1.0
 * 
 * 
 */
public class Utils {
	
	/**
	 * 
	 * @param element
	 * @param seconds
	 * 
	 * Descriptin: click in an WebElment or wait (int) seconds if it is not available
	 */
	public void click(WebElement element, int seconds) {
		
		int count = 0;
		while(count < seconds) {
			
			if(element.isDisplayed()) {
				element.click();
				break;
			}
			else {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
			}
				count++;
		}
	}
	
	public static void WaitForElementList(List<WebElement> ele) {
		int timeOut = 10;
		while(!(ele.size() > 0) &&  timeOut > 0) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			timeOut--;
		}
	}
	
	public static void WaitForElementList(List<WebElement> ele, int timeOut) {
		while(!(ele.size() > 0) &&  timeOut > 0) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			timeOut--;
		}
	}
}
