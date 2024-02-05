package SelectClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class implicitwait {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		
		driver.findElement(By.xpath("//div[@class='_6ltg']/a")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Aishwarya");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Mungarwadi");
		driver.findElement(By.xpath("//div[@class='_8ien']/img")).click();
		
		WebElement fb_home = driver.findElement(By.xpath("//div[@class='_6ltg']/a"));
		if(fb_home.isDisplayed())
		{
			System.out.println("You are in facebook home page");
			driver.close();
		}
		else
			System.out.println("You are not in facebook home page");
		
		
	}
}
