package config;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static config.Constants.DRIVER_PATH;
import static config.Constants.DRIVER_PROPERTIES;
import static config.Constants.URL_WHATSAPP_WEB;

public class Session{
	
	public static WebDriver driver;
	
	public static void main(String[] args) {
		
	}
	
	public Session() {
		System.setProperty(DRIVER_PROPERTIES, DRIVER_PATH);
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		driver.get(URL_WHATSAPP_WEB);
		PageBase.driver = driver;
	}
	
	public void endSession() {
		driver.quit();
	}
	
	public void listenForNewMessages() {
		while(Xpaths.newMessages.size() > 0) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if(!driver.getTitle().equals("WhatsApp")) {
				System.out.println("Response messages");
			}else {
				System.out.println("Listem for new messages");
			}
		}
	}
}
