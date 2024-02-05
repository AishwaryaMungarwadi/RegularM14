package PopUp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Dream11Assignment {

	public static void main(String[] args) {
			
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.dream11.com/");
		
	//	driver.switchTo().frame(0);
	//	driver.switchTo().frame("send-sms-iframe");
		WebElement iframe = driver.findElement(By.xpath("//iframe[@class='send-sms-iframe']"));
		driver.switchTo().frame(iframe);
		driver.findElement(By.id("regEmail")).sendKeys("1234567890");
		driver.switchTo().parentFrame();
	//	driver.switchTo().defaultContent();
		driver.findElement(By.id("hamburger")).click();
	}
}
