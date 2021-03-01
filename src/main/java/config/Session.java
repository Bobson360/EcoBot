package config;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Session{
	
	public static WebDriver driver;
	
	public static void main(String[] args) {
		
	}
	
	public void startSession() {
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		driver.get("https://web.whatsapp.com/");
		PageBase.driver = driver;
	}
	
	public void endSession() {
		driver.quit();
	}
}
