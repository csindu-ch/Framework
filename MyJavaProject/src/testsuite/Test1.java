package testsuite;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;

public class Test1
{

	public static void main(String[] args) 
	{
		WebDriver driver;
		Scanner sc = new Scanner(System.in);
		String ip= sc.nextLine();
		if(ip.equalsIgnoreCase("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse-Selenium\\Browserdivers\\Chrome\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://google.co.in");
		}
		else if(ip.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "D:\\Eclipse-Selenium\\Browserdivers\\Gechodriver\\geckodriver-v0.26.0-win64\\geckodriver.exe");
			driver= new FirefoxDriver();
			driver.get("https://www.facebook.com");
		}
		else if(ip.equalsIgnoreCase("Opera"))
		{
			System.setProperty("webdriver.opera.driver", "D:\\Eclipse-Selenium\\Browserdivers\\Opera\\operadriver_win64\\operadriver_win64\\operadriver.exe");
			driver= new OperaDriver();
			OperaOptions oo= new OperaOptions();
			oo.setBinary("D:\\Eclipse-Selenium\\Browserdivers\\Opera\\OperaSetup.exe");
			driver.get("https://www.makemytrip.com");
		}
		else if(ip.equalsIgnoreCase("ie"))
		{
			System.setProperty("webdriver.ie.driver", "D:\\Eclipse-Selenium\\Browserdivers\\IE\\IEDriverServer_x64_3.150.1\\IEDriverServer.exe");
			driver= new InternetExplorerDriver();
			driver.get("https://www.amazon.com");
		}
		else 
		{
			System.setProperty("webdriver.edge.driver", "D:\\Eclipse-Selenium\\Browserdivers\\EdgeDriver\\edgedriver_win64\\msedgedriver.exe");
			driver= new EdgeDriver();
			driver.get("https://www.flipkart.com");
		}
		
		

	}

}