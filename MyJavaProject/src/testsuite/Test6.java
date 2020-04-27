package testsuite;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test6 
{

	public static void main(String[] args) throws Exception 
	{
		//scan the word to be searched
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word to be searched in Google:");
		String w= sc.nextLine();
		
		//launch browser driver without browser driver logs
		
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse-Selenium\\Browserdivers\\Chrome\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.chrome.silentoutput", "true");
		ChromeDriver driver = new ChromeDriver();
		
		//Launch google site and give wait time
		driver.get("http://google.co.in");
		Thread.sleep(5000);
		
		//Enter the word in Google search
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys(w,Keys.ENTER);
		
		//initialize total results count
		int totalrescount=0;
		int pagenumber= 0;
				
		//Infinite loop
		while(2>1)		
		{
			//Add pages each time while loop is executed
			pagenumber++;
			int resperpage= 0;
			//Locate Google Search results
			List<WebElement> l= driver.findElements(By.xpath("//h3[@class='LC20lb DKV0Md']"));
			
			//Iterate through the list of search results located and count the results per page when the result is displayed 
			for(WebElement e:l)
			{
				if(e.isDisplayed())
				{
				resperpage++;
				}
     		}
			
			//Display count
			System.out.println(pagenumber+ " " + "page had" + " " + resperpage+ " " + "results");
			totalrescount=totalrescount+resperpage;
			
			//Goto next page
			try
			{
			driver.findElement(By.xpath("//span[text()= 'Next']")).click();
			Thread.sleep(4000);
			}
			catch(Exception e)
			{
				break;
			}
		}
		//Display total results count
		System.out.println("Total results count is "+totalrescount );
		
		//close site
		driver.close();			
	}
}
