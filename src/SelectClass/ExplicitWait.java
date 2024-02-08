package SelectClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shoppersstack.com/");
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(50));
		
		WebElement login_btn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginBtn")));
		login_btn.click();
		Thread.sleep(1000);
		WebElement create_acc = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Create Account']")));
		create_acc.click();
	}
}
