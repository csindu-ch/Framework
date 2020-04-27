package testsuite;

import java.io.File;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Test7 
{

	public static void main(String[] args) throws Exception 
	{
		//Get Username, Password from Keyboard
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Enter Gmail Username");
		String u= sc.nextLine();
		System.out.println("Enter Gmail Password");
		String p= sc.nextLine();
		Thread.sleep(3000);*/
		
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
		int expectedallmailscount= 0;
		
		Thread.sleep(3000);
		
		//infinite loop
		while(2>1)
		{
		 List<WebElement> l = driver.findElements(By.xpath("//table[@role='grid']/tbody/tr"));
		 expectedallmailscount=expectedallmailscount+l.size();
		 Thread.sleep(4000);
		 		 //Goto Next page
		 WebElement e= driver.findElement(By.xpath("//div[@data-tooltip='Older']"));
		 try
		 {
		 if(e.getAttribute("aria-disabled").equals("true"))
			 {
				 break;
			 }
		 }
		 catch(Exception Exc)
		 {
			 e.click();
		 }
		}
		//Display Total emails count
		System.out.println("The total count of Expected emails count is"+ " " + expectedallmailscount);
		
		//Get Actual count of emails
		String temp = driver.findElement(By.xpath("(//span[@class='ts'])[3]")).getText();
		Integer actualmails= Integer.parseInt(temp);
		System.out.println("The total number of Actual mails count is" + " " +actualmails);
		if(expectedallmailscount==actualmails)
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test Failed");
			
			//Take Screenshot of actual count
			File src =  driver.findElement(By.xpath("(//span[@class='ts'])[3]")).getScreenshotAs(OutputType.FILE);
			File dest = new File("D:\\Eclipse-Selenium\\Screenshots\\screenshot.png");
			FileHandler.copy(src, dest);
				
		}
		//Logout from Gmail
		driver.findElement(By.xpath("//a[starts-with(@aria-label,'Google Account')]/child::span")).click();
		driver.findElement(By.xpath("//a[text()='Sign out']")).click();	
		Thread.sleep(4000);
		
	}

}
