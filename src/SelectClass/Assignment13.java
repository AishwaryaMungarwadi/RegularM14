package SelectClass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment13 {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.kalkifashion.com/in/");
		
		Actions a=new Actions(driver);
		
		List<WebElement> all_options = driver.findElements(By.xpath("//div[@id='desktop-nav']/div"));
		for (WebElement web : all_options) {
			Thread.sleep(1000);
			a.moveToElement(web).keyDown(Keys.COMMAND).click(web).keyUp(Keys.COMMAND).build().perform();
		}
		driver.quit();	
	
	}

}
