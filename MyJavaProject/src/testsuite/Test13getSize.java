package testsuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test13getSize 
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
		WebElement e= driver.findElement(By.xpath("//input[@autocomplete='username']"));
		int x1= e.getSize().getWidth();
		int x2= e.getSize().getHeight();
		int z1= e.getLocation().getX();
		int z2= e.getLocation().getY();
		int y1= e.getRect().getWidth();
		int y2= e.getRect().getHeight();
		int w1= e.getRect().getX();
		int w2= e.getRect().getY();
		System.out.println(x1 + "\n" + x2+ "\n"+ z1+ "\n"+ z2+ "\n"+ y1+ "\n"+ y2+ "\n"+ w1+ "\n"+ w2 );
	}

}
