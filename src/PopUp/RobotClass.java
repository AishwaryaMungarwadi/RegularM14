package PopUp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotClass {
	
	public static void main(String[] args) throws AWTException, InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://demowebshop.tricentis.com/");
		/*Robot a = new Robot();
		a.keyPress(KeyEvent.VK_TAB);
		a.keyRelease(KeyEvent.VK_TAB);
		a.keyPress(KeyEvent.VK_TAB);
		a.keyRelease(KeyEvent.VK_TAB);
		a.keyPress(KeyEvent.VK_TAB);
		a.keyRelease(KeyEvent.VK_TAB);
		a.keyPress(KeyEvent.VK_TAB);
		a.keyRelease(KeyEvent.VK_TAB);
		a.keyPress(KeyEvent.VK_TAB);
		a.keyRelease(KeyEvent.VK_TAB);
		a.keyPress(KeyEvent.VK_TAB);
		a.keyRelease(KeyEvent.VK_TAB);*/
		
		Actions action=new Actions(driver);
		action.keyDown(Keys.TAB).build().perform();
		action.keyUp(Keys.TAB).build().perform();
		Thread.sleep(1000);
		
		action.keyDown(Keys.TAB).build().perform();
		action.keyUp(Keys.TAB).build().perform();
		Thread.sleep(1000);
		
		action.keyDown(Keys.TAB).build().perform();
		action.keyUp(Keys.TAB).build().perform();
		Thread.sleep(1000);
		
		action.keyDown(Keys.TAB).build().perform();
		action.keyUp(Keys.TAB).build().perform();
		Thread.sleep(1000);
		
		action.keyDown(Keys.TAB).build().perform();
		action.keyUp(Keys.TAB).build().perform();
		Thread.sleep(1000);
		
		action.keyDown(Keys.TAB).build().perform();
		action.keyUp(Keys.TAB).build().perform();
		
		action.sendKeys("Mobile").build().perform();
		
		
	}

}
