package testsuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test11getCssvalue 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","D:\\Eclipse-Selenium\\Browserdivers\\Chrome\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput", "true");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://google.co.in");
		
		WebElement e= driver.findElement(By.linkText("Gmail"));
		String x= driver.findElement(By.linkText("Gmail")).getCssValue("opacity");
		String y= driver.findElement(By.linkText("Gmail")).getCssValue("text-decoration");
		System.out.println("Opacity is"+" "+x);
		System.out.println("Text decoration is"+" "+y);
		
		Actions a = new Actions(driver);
		a.moveToElement(e).perform();
		String x2= driver.findElement(By.linkText("Gmail")).getCssValue("opacity");
		String y2= driver.findElement(By.linkText("Gmail")).getCssValue("text-decoration");
		System.out.println("Opacity is"+" "+x2);
		System.out.println("Text decoration is"+" "+y2);
		if(y2.contains("underline"))
		{
			System.out.println("Underline is present after hovering");
		}
		else
		{
			System.out.println("Underline is not present after hovering");
		}
		
		float f = Float.parseFloat(x2);
		if(f!=1)
		{
			System.out.println("Text color is shaded after hovering");
		}
		else
		{
			System.out.println("Text color is not shaded after hovering");
		}
	}

}
