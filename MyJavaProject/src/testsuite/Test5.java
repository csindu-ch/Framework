package testsuite;

import java.util.Scanner;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Test5
{

	public static void main(String[] args) throws Exception 
	{
		Scanner sc= new Scanner(System.in);
		String b= sc.nextLine();
		RemoteWebDriver driver;
		if(b.equalsIgnoreCase("chrome")) 
		{
			System.setProperty("webdriver.chrome.driver", "D:\\Eclipse-Selenium\\Browserdivers\\Chrome\\chromedriver_win32\\chromedriver.exe");
			System.setProperty("webdriver.chrome.silentoutput", "true");
			driver = new ChromeDriver();
			
		}
		 
		else if(b.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "D:\\Eclipse-Selenium\\Browserdivers\\Gechodriver\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		    driver = new FirefoxDriver();
		}
		
		else if(b.equalsIgnoreCase("ie"))
		{
			System.setProperty("webdriver.ie.driver", "D:\\Eclipse-Selenium\\Browserdivers\\IE\\IEDriverServer_x64_3.150.1\\IEDriverServer.exe");
		    driver = new InternetExplorerDriver();
		}
		
		else if(b.equalsIgnoreCase("opera"))
		{
			OperaOptions oo = new OperaOptions();
		    oo.setBinary("D:\\Eclipse-Selenium\\Browserdivers\\Opera\\operadriver_win64\\operadriver_win64\\operadriver.exe");	
		    
		    Thread.sleep(5000);
		    
			System.setProperty("webdriver.opera.driver", "D:\\Eclipse-Selenium\\Browserdivers\\Opera\\operadriver_win64\\operadriver_win64\\operadriver.exe");
		    driver = new OperaDriver();
		    
		}
		
		else
		{
			System.setProperty("webdriver.edge.driver", "D:\\Eclipse-Selenium\\Browserdivers\\EdgeDriver\\edgedriver_win64\\msedgedriver.exe");
		    driver = new EdgeDriver();
		}
		
		Thread.sleep(5000);
		driver.get("http://google.co.in");
		//driver.close();
	}

}
