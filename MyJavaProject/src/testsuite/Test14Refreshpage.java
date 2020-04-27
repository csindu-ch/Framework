package testsuite;

import org.openqa.selenium.chrome.ChromeDriver;

public class Test14Refreshpage 
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
		driver.navigate().refresh();
		//driver.get(driver.getCurrentUrl());
		//driver.navigate().to(driver.getCurrentUrl());
	    //driver.findElement(loc).sendKeys(Keys.F5)
		//driver.findElement(loc).sendKeys("\uE035");

	}

}
