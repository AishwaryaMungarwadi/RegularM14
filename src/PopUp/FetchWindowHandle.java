package PopUp;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FetchWindowHandle {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://demowebshop.tricentis.com/");
		String dws = driver.getWindowHandle();
		System.out.println(dws);
		
		Actions a=new Actions(driver);
		a.keyDown(Keys.PAGE_DOWN).build().perform();
		a.keyDown(Keys.PAGE_DOWN).build().perform();
		WebElement twitter = driver.findElement(By.xpath("//a[text()='Twitter']"));
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Twitter']")));
		
		a.moveToElement(twitter).keyDown(Keys.SHIFT).click().build().perform();
		
		Set<String> child = driver.getWindowHandles();
		//System.out.println(twitter);
		
		child.remove(dws);
		for (String str : child) {
			driver.switchTo().window(str);
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Not now']")).click();
		driver.close();
		driver.switchTo().window(dws);
		driver.close();
		
	}

}
