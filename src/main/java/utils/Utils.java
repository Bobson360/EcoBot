package utils;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import config.PageBase;

/**.
 * 
 * @author bobson
 * @version 0.1.0
 * 
 * 
 */
public class Utils extends PageBase{
	
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
	
	public static List<WebElement> waitForElementList(List<WebElement> element) {
		int timeOut = 10;
		while(!(element.size() > 0) &&  timeOut > 0) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			timeOut--;
		}
		return element;
	}
	
	
	
	public static List<WebElement> waitForElementList(List<WebElement> element, int timeOut) {
		while(!(element.size() > 0) &&  timeOut > 0) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			timeOut--;
		}
		return element;
	}
	
	public static List<WebElement> buildElement(String xpath){
		int timeOut = 10;
		while(!(driver.findElements(By.xpath(xpath)).size() > 0) &&  timeOut > 0) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			timeOut--;
		}
		List<WebElement> el = driver.findElements(By.xpath(xpath));
		return el;
	}
}
