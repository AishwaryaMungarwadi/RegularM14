package Parameterized;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class differentBrowsers {

	WebDriver driver;
	@Parameters("Driver")
	@Test
	public void browsers(String div)
	{
		if(div.equalsIgnoreCase("Chrome"))
		{
			driver=new ChromeDriver();
			System.out.println("hi i am from chrome driver");
			Reporter.log("ChromeDriver");
		}
		else if(div.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
			System.out.println("hi i am from edge driver");
			Reporter.log("EdgeDriver");
		}
		else if(div.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
			System.out.println("hi i am from firefox driver");
			Reporter.log("FirefoxDriver");
		}
	}
}
