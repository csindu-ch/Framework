package testsuite;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test16YahootoGmail
{

	public static void main(String[] args) throws Exception
	{
		//Launch Chrome browser without browser driver logs
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse-Selenium\\Browserdivers\\Chrome\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput","true");
		ChromeDriver driver = new ChromeDriver();
		//Open Yahoo in Chrome browser and maximize window
		driver.get("http://www.yahoo.com");
		driver.manage().window().maximize();
		//Sign into Yahoo
		driver.findElementByLinkText("Sign in").click();
		Thread.sleep(4000);
		driver.findElement(By.name("username")).sendKeys("sindhuchittibothula");
		driver.findElement(By.name("signin")).submit();
		Thread.sleep(4000);
		driver.findElement(By.name("password")).sendKeys("indus567");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@name='verifyPassword']")).sendKeys(Keys.ENTER);
		Thread.sleep(4000);
		driver.findElement(By.id("header-mail-button")).click();
		Thread.sleep(4000);
		//Compose and send Yahoo email to gmail address
		driver.findElement(By.xpath("//a[text()='Compose']")).click();
		driver.findElement(By.xpath("//div[@data-test-id='compose-header-field-to']/descendant::input[@role='combobox']")).sendKeys("seleniumeveryday@gmail.com");
		driver.findElement(By.xpath("//input[@data-test-id='compose-subject']")).sendKeys("test");
		driver.findElement(By.xpath("//div[@data-test-id='rte']")).sendKeys("Intersystem Test scenario:" + "/n" + "send email from Yahoo to Gmail");
		driver.findElement(By.xpath("//span[text()='Send']")).click();
		//Open Gmail in new tab
		((JavascriptExecutor) driver).executeScript("window.open()");
		Set<String> w= driver.getWindowHandles();
		ArrayList<String> tabs = new ArrayList<String>(w);
		driver.switchTo().window(tabs.get(1));
		driver.get("http://www.gmail.com");
		//Sign into Gmail
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
		
		String fromemailaddress=driver.findElement(By.xpath("(//table[@role='grid'])[2]/tbody/tr/td[5]/descendant::span/span")).getAttribute("email");
		
		if(fromemailaddress.contains("yahoo"))
		{
			System.out.println("Email is received from Yahoo");
		}
		else
		{
			System.out.println("Email is not received from Yahoo");
		}
		//Logout from Gmail
		driver.findElement(By.xpath("//a[starts-with(@aria-label,'Google Account')]/child::span")).click();
		driver.findElement(By.xpath("//a[text()='Sign out']")).click();	
		Thread.sleep(4000);
		driver.close();
		//Back to Yahoo
		driver.switchTo().window(tabs.get(0));
		//Logout from Yahoo
		
		driver.findElement(By.xpath("//label[@for='ybarAccountMenu']")).click();
		driver.findElement(By.xpath("//span[text()='Sign out']")).click();
		Thread.sleep(5000);
		driver.close();
		
	}

}
