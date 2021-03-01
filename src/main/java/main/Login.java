package main;

import org.openqa.selenium.By;

import config.PageBase;

public class Login extends PageBase{

	public Login(int seconds) {
		boolean logged = true;
		
		while(logged) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			logged = !driver.findElements(By.xpath("//*[@class='-A_bA']")).isEmpty();
			seconds--;
			System.out.println("Waiting for login");
			if(seconds == 0) {
				System.out.println("Login Não efetuado");
				break;
			} else if(seconds > 0 && !logged) {
				System.out.println("Logged SUCCESS");
				break;
			} 
			
		}
		
	}
	
	public Login() {
		System.out.println("Login Method");
		int seconds = 30;
		boolean logged = true;
		
		while(logged) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			logged = !driver.findElements(By.xpath("//*[@class='-A_bA']")).isEmpty();
			seconds--;
			System.out.println("Waiting for login");
			if(seconds == 0) {
				System.out.println("Login Não efetuado");
				break;
			} else if(seconds > 0 && !logged) {
				System.out.println("Logged SUCCESS");
				break;
			} 
			
		}
		
	}
}
