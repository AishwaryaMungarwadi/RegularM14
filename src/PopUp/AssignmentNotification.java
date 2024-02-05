package PopUp;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AssignmentNotification {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.easemytrip.com/");
		
		Actions action=new Actions(driver);
		Thread.sleep(7000);
		
		action.keyDown(Keys.TAB).build().perform();
		action.keyUp(Keys.TAB).build().perform();
		Thread.sleep(1000);
		
		action.keyDown(Keys.TAB).build().perform();
		action.keyUp(Keys.TAB).build().perform();
		Thread.sleep(1000);
		
		action.keyDown(Keys.TAB).build().perform();
		action.keyUp(Keys.TAB).build().perform();
		Thread.sleep(1000);
		
		action.keyDown(Keys.ENTER).build().perform();
		action.keyUp(Keys.ENTER).build().perform();
		
		//in mac tab did not work so this did not work ...did not use rorbot class
	}

}
