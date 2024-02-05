package SelectClass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpenInNewWindowActionMethod {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://demowebshop.tricentis.com/");
		Actions a=new Actions(driver);
		
		List<WebElement> all_tabs = driver.findElements(By.xpath("//ul[@class='top-menu']//li"));
		
		for (WebElement web : all_tabs) {
			a.moveToElement(web).keyDown(Keys.SHIFT).click().build().perform();
		}
		driver.quit();
	}

}
