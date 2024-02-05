package PopUp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalendarPopUp {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.agoda.com/");
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//button[text()='No thanks']")));
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='No thanks']")).click();
		driver.findElement(By.xpath("//div[@data-selenium='checkInBox']")).click();
		driver.findElement(By.xpath("//span[@data-selenium-date='2024-01-20']")).click();
		WebElement nextMonth = driver.findElement(By.xpath("//button[@aria-label='Next Month']"));
		/*nextMonth.click();
		nextMonth.click();
		nextMonth.click();*/
		WebElement arrival_date = driver.findElement(By.xpath("//span[@data-selenium-date='2024-05-23']"));
		while(!arrival_date.isEnabled())
		{
		try {
			driver.findElement(By.xpath("//span[@data-selenium-date='2024-05-23']")).click();
			System.out.println("Script got successfully");
		} catch (Exception e) {
			// TODO: handle exception
			nextMonth.click();
		}
		}
		
	}
}
