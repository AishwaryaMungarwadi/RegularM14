package JavaScriptExecutor;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecuter1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://skillrary.com/");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		Thread.sleep(1000);
		//js.executeScript("window.scrollBy(0,2000);");
		Thread.sleep(1000);
		//js.executeScript("window.scrollBy(0,2000);");
		js.executeScript("window.scrollTo(0,2000);");
	}

}
