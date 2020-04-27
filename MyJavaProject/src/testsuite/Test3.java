package testsuite;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;

public class Test3 {

	{
		WebDriver driver;
		Scanner sc = new Scanner(System.in);
		String ip= sc.nextLine();
		if(ip.equalsIgnoreCase("Opera"))
		{
			System.setProperty("webdriver.opera.driver", "D:\\Eclipse-Selenium\\Browserdivers\\Opera\\operadriver_win64\\operadriver_win64\\operadriver.exe");
			driver= new OperaDriver();
			OperaOptions oo= new OperaOptions();
			oo.setBinary("D:\\Eclipse-Selenium\\Browserdivers\\Opera\\OperaSetup.exe");
			driver.get("https://www.makemytrip.com");

	}

		
}
}
