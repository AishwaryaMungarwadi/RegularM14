package TestNgBatchGroup1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Bata {
	WebDriver driver;
	@Test
	public void bata() throws InterruptedException
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.bata.com/in/");
		Thread.sleep(1000);
		driver.quit();
	}
}
