package testsuite;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test8 
{

	public static void main(String[] args) throws Exception
		{
		//Launch Chrome Driver without driver logs
				System.setProperty("webdriver.chrome.driver", "D:\\Eclipse-Selenium\\Browserdivers\\Chrome\\chromedriver_win32\\chromedriver.exe");
				System.setProperty("webdriver.chrome.silentOutput", "true");
				ChromeDriver driver = new ChromeDriver();
				
				//Launch Gmail (parameterization of Username and Password)
				driver.get("http://www.gmail.com");
				driver.manage().window().maximize();
				Thread.sleep(4000);
				
				//Enter Username
				driver.findElement(By.xpath("//input[@autocomplete='username']")).sendKeys("seleniumeveryday");
				
				//Click Next
				driver.findElement(By.xpath("//span[text()='Next']")).click();
				Thread.sleep(4000);
						
				//Enter Password
				driver.findElement(By.xpath("//input[@autocomplete='current-password']")).sendKeys("indus567");
				
				//Click Next
				driver.findElement(By.xpath("//span[text()='Next']")).click();
							
				Thread.sleep(3000);
				
				//Logout
				driver.findElement(By.xpath("//a[starts-with(@aria-label,'Google Account')]/child::span")).click();
				driver.findElement(By.xpath("//a[text()='Sign out']")).click();	
				Thread.sleep(4000);

	}

}
