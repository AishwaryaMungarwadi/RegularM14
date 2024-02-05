package PopUp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment17iframe {

	public static void main(String[] args) {
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		
		
		driver.get("https://www.speedtest.net/");
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(40));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//button[text()='Continue']")));
		
		System.out.println(driver.getWindowHandles());
		driver.findElement(By.xpath("//button[text()='Continue']")).click();
	//	driver.switchTo().frame("google_ads_iframe_/6692/speedtest.net/stnext_top_rectangle_0");
		driver.switchTo().frame(11);
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("google_ads_iframe_/6692/speedtest.net/stnext_top_rectangle_0")));
		driver.findElement(By.id("google_ads_iframe_/6692/speedtest.net/stnext_top_rectangle_0")).click();
	}
}
