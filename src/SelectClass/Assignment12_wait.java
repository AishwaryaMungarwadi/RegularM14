package SelectClass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment12_wait {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='dropbtn']")));
		
		driver.findElement(By.xpath("//button[@class='dropbtn']")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='myDropdown']")));
		
		driver.findElement(By.xpath("//div[@id='myDropdown']/a[1]")).click();
		
		WebElement create_acc = driver.findElement(By.xpath("//div[@class='_6ltg']/a"));
		
		if(create_acc.isDisplayed())
		{
			System.out.println("You are in facebook page");
			driver.close();
		}
		else
			System.out.println("You are not in facebook page");
		
	}
}
