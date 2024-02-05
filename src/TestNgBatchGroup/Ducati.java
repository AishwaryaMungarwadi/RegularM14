package TestNgBatchGroup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class Ducati {
	
	WebDriver driver;
	@Test
	public void ducati() throws InterruptedException
	{
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.ducati.com/in/en/home");
	//	Thread.sleep(1000);
	//	driver.findElement(By.xpath("//button[text()='Accept All Cookies']")).click();
		driver.quit();
	}

}
