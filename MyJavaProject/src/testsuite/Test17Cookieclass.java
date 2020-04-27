package testsuite;

import org.openqa.selenium.chrome.ChromeDriver;

public class Test17Cookieclass 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Eclipse-Selenium\\Browserdivers\\Chrome\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput", "true");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("http://www.makemytrip.com");
	    

	}

}
