package AppachePOI;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	public WebDriver driver;
	
	@BeforeClass
	public void precondition()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}
	
	@BeforeMethod
	public void login()
	{
		System.out.println("login successfully");
	}
	
	@AfterMethod
	public void logOut()
	{
		System.out.println("Logout successfull");
	}
	
	@AfterClass
	public void postcondition()
	{
		driver.quit();
	}

}
