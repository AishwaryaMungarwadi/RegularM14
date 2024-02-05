package SelectClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Send_keys {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://demowebshop.tricentis.com/");
		
		String given_url="https://demowebshop.tricentis.com/";
		
		String actual_url=driver.getCurrentUrl();
		if(given_url.contains(actual_url))
		{
			System.out.println("URL verified");
			WebElement search = driver.findElement(By.id("small-searchterms"));
			Actions action= new Actions(driver);
			if(search.isDisplayed())
			{
				System.out.println("Search enabled");
				action.moveToElement(search).click().sendKeys("Books").build().perform();
				driver.findElement(By.xpath("//input[@type='submit']")).click();
				driver.close();
			}
			else
			{
				System.out.println("Search is not enabled");
			}
		}
		else
			System.out.println("URL not verified");
	}

}
