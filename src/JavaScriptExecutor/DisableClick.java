package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DisableClick {
	
	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.oracle.com/java/technologies/javase/jdk11-archive-downloads.html");
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//a[@class='browser-button']")));
		driver.findElement(By.xpath("//a[@class='browser-button']")).click();
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		WebElement download_link = driver.findElement(By.linkText("jdk-11.0.21_windows-x64_bin.zip"));
		js.executeScript("arguments[0].scrollIntoView(false);",download_link);
		download_link.click();
		WebElement hindden_link = driver.findElement(By.linkText("Download jdk-11.0.21_windows-x64_bin.zip"));
		js.executeScript("arguments[0].click();",hindden_link);
	}

}
