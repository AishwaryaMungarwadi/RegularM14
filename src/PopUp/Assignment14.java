package PopUp;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Assignment14 {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		WebElement right_clk = driver.findElement(By.xpath("//span[text()='right click me']"));
		Actions a=new Actions(driver);
		
		List<WebElement> options = driver.findElements(By.xpath("//ul[@class='context-menu-list context-menu-root']//li//span"));

		for (WebElement web : options) {
			a.moveToElement(right_clk).contextClick().build().perform();
			System.out.println(web.getText());
			web.click();
			Thread.sleep(1000);
			Alert pop_up = driver.switchTo().alert();
			pop_up.accept();
			Thread.sleep(1000);
			
		}
		driver.close();
	}
	

}
