package application;

import static config.Xpaths.newMessages;

import config.Session;
import main.Login;

public class App {
	public static Session session = new Session();
	public static Login login = new Login();
	
	public static void main(String[] args)  {
		System.out.println("Total of new chat messages: " + newMessages.size());
		
		session.listenForNewMessages();
		
		session.endSession();
	}
}
