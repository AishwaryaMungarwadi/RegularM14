package TestNg1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddToCartByChronologicalOrder {
	
	WebDriver driver;
	@BeforeClass
	public void openTheBrowser()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//driver.get("https://demowebshop.tricentis.com/");
	}
	
	@BeforeMethod()
	public void getURL()
	{
		driver.get("https://demowebshop.tricentis.com/");
	}
	
	

	@Test(priority = 0)
	public void login()
	{
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		driver.findElement(By.id("Email")).sendKeys("aishwarya24.m@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Abc@1234");
		driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
	}
	
	@Test(priority = 1)
	public void addToCart()
	{
		driver.findElement(By.xpath("(//input[@value='Add to cart'])[2]")).click();
	}
	
	@Test(priority = 2)
	public void logOut()
	{
		driver.findElement(By.xpath("//a[@class='ico-logout']")).click();
	}
	
	@AfterClass
	public void closeBrowser()
	{
		driver.quit();
	}

}
