package PopUp;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UseWindowHandle {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://demowebshop.tricentis.com/");
		
		String dws = driver.getWindowHandle();
		Actions a=new Actions(driver);
		WebElement books = driver.findElement(By.xpath("(//a[contains(text(),'Books')])[1]"));
		
		a.moveToElement(books).keyDown(Keys.SHIFT).click().build().perform();
		
		Set<String> child = driver.getWindowHandles();
		child.remove(dws);
		System.out.println("Child "+child);
		
		for (String string : child) {
			
			driver.switchTo().window(string);
			
			/*if(!string.contains(dws))
			{
				driver.switchTo().window(string);
				System.out.println(driver.getCurrentUrl());
			
			}*/
			
		}
		System.out.println(driver.getWindowHandle());
	}
}
