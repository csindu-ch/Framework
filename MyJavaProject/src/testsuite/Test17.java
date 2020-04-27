package testsuite;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test17
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
				Thread.sleep(4000);
				((JavascriptExecutor) driver).executeScript("window.open()");
				Set<String> w= driver.getWindowHandles();
				ArrayList<String> tabs = new ArrayList<String>(w);
				driver.switchTo().window(tabs.get(1));
				driver.get("http://www.gmail.com");
				

	}

}
