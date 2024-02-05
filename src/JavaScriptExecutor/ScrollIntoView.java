package JavaScriptExecutor;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollIntoView {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://skillrary.com/");
		driver.findElement(By.xpath("//a[@class='close_cookies']")).click();
		WebElement learn_more = driver.findElement(By.xpath("//a[text()=' LEARN MORE']"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(false);",learn_more);
		Thread.sleep(1000);
		learn_more.click();
	}

}
