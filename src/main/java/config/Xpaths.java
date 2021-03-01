package config;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.Utils;

public class Xpaths extends PageBase{
	/*
	 * 
	 * WebElements
	 * 
	 */
	public static WebElement searchArea = driver.findElement(By.xpath("//div[contains(@class, '_2_1wd')]"));
	public static WebElement messageArea = driver.findElement(By.xpath("//div[contains(@class, '_2_1wd')]"));
	public static WebElement firstChat = driver.findElement(By.xpath("//div[contains(@style, 'translateY(0px)')]"));
	
	
	/*
	 * 
	 * List of WebElements
	 * 
	 */
	public static List<WebElement> newMessages = Utils.buildElement("//span[contains(@aria-label, 'mensagem não lida')] | //span[contains(@aria-label, 'mensagens não lida')]");
}
