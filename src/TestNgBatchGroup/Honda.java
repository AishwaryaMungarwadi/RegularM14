package TestNgBatchGroup;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Honda {
	
	WebDriver driver;
	@Test(groups = {"smoke","regression"})
	public void honda()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.honda2wheelersindia.com/");
		driver.close();
	}
	
	

}
