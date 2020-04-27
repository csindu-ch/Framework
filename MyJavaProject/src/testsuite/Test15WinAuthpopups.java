package testsuite;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test15WinAuthpopups 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse-Selenium\\Browserdivers\\Chrome\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput", "true");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://admin:admin@the-internet.herokuapp.com");
		
		driver.findElement(By.xpath("//a[text()='Basic Auth']")).click();
		String msg=driver.findElement(By.xpath("//div[@class='example']/p")).getText();
		System.out.println(msg);
		driver.close();
	}
}
