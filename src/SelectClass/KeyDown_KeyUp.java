package SelectClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class KeyDown_KeyUp {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://demowebshop.tricentis.com/");
		
		Actions action=new Actions(driver);
		action.keyDown(Keys.PAGE_DOWN).build().perform();
		action.keyUp(Keys.PAGE_DOWN).build().perform();
		
		//WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(50));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='New products']")));
		
		Thread.sleep(1000);
		
		action.keyDown(Keys.PAGE_UP).build().perform();
		action.keyUp(Keys.PAGE_UP).build().perform();
		
	}

}
