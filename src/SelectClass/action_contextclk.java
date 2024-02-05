package SelectClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class action_contextclk {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		Actions action=new Actions(driver);
		WebElement right_clk = driver.findElement(By.xpath("//span[text()='right click me']"));
		action.contextClick(right_clk).build().perform();
		
		WebElement delete = driver.findElement(By.xpath("//span[text()='Delete']"));
		driver.findElement(By.xpath("//span[text()='Delete']")).click();
		try {
			delete.click();
			System.out.println("Program is wrong");
		} catch (Exception e) {
			System.out.println("Program is correct");
			driver.close();
		}
		
	}

}
