package testsuite;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.ie.InternetExplorerDriver;


public class Test2
{

	public static void main(String[] args) throws AWTException, InterruptedException 
	{
		WebDriver driver;
		Scanner sc = new Scanner(System.in);
		String ip= sc.nextLine();
		if(ip.equalsIgnoreCase("ie"))
		{
			System.setProperty("webdriver.ie.driver", "D:\\Eclipse-Selenium\\Browserdivers\\IE\\IEDriverServer_x64_3.150.1\\IEDriverServer.exe");
			driver= new InternetExplorerDriver();
			driver.get("https://www.amazon.com");
		}
		Robot robot = new Robot();  // Robot class throws AWT Exception	
        Thread.sleep(2000); // Thread.sleep throws InterruptedException	
        robot.keyPress(KeyEvent.VK_H);
        robot.keyPress(KeyEvent.VK_H);
	}
	
}