package JavaScriptExecutor;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollIntoViewDWS {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://demowebshop.tricentis.com/");
		//List<WebElement> add_to_cart = driver.findElements(By.xpath("//input[@value='Add to cart']"));
		WebElement add_to_cart1 = driver.findElement(By.xpath("(//input[@value='Add to cart'])[2]"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(false);", add_to_cart1);
		Thread.sleep(1000);
		add_to_cart1.click();
	}
}
