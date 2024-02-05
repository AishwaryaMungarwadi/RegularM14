package PopUp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment15PopUp {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Aishwarya");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Mungarwadi");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("aishwarya24.m@gmail.com");
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("1234567890");
		driver.findElement(By.xpath("//input[@value='FeMale']")).click();
		driver.findElement(By.id("countries")).click();
		driver.findElement(By.xpath("//span[@role='combobox']")).click();
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("India");
		Actions action=new Actions(driver);
		action.keyDown(Keys.ENTER).build().perform();
		driver.findElement(By.id("yearbox")).click();
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//option[@value='1977']")));
		driver.findElement(By.xpath("//option[@value='1977']")).click();
		driver.findElement(By.xpath("//select[@placeholder='Month']")).click();
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//option[@value='November']")));
		driver.findElement(By.xpath("//option[@value='November']")).click();
		driver.findElement(By.id("daybox")).click();
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//option[@value='30']")));
		driver.findElement(By.xpath("//option[@value='30']")).click();
		
	}

}
