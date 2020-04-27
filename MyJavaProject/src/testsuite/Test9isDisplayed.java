package testsuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test9isDisplayed {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Eclipse-Selenium\\Browserdivers\\Chrome\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.chrome.silenOutput", "true");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.gmail.com");
		// Enter Username
		WebElement u = driver.findElement(By.xpath("//input[@autocomplete='username']"));
		if (u.isDisplayed()) {
			if (u.isEnabled()) {
				System.out.println("Username is displayed and enabled");
			} else {
				System.out.println("Username is displayed and disabled");
			}
		} else {
			System.out.println("Username is hideen");
		}
		WebElement p = driver.findElement(By.name("hiddenPassword"));
		if (p.isDisplayed()) {
			if (p.isEnabled()) {
				System.out.println("Password is displayed and enabled");
			} else {
				System.out.println("Password is displayed and disabled");
			}
		} else {
			System.out.println("Password is hidden");
		}
		Thread.sleep(4000);

		// Enter Password

	}

}
