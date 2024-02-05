import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReusableCode {

	public static WebDriver driver;
	
	public  void ChromeBrowser()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	public void OpenDWS()
	{
		driver.get("https://demowebshop.tricentis.com/");
	}
	
	public void verifyTitle(String givenTitle,String actualTitle)
	{
		if(givenTitle.contains(actualTitle))
		{
			System.out.println(givenTitle+" Title is verified successfully");
		}
		else
		{
			System.out.println(givenTitle+" Title is not verified successfully");
			driver.close();
		}
	}
	
	public void verifyURLWebelement(WebElement DemoPageWebElement,WebDriver driver)
	{
		if(DemoPageWebElement.isEnabled())
		{
			System.out.println(driver.getTitle()+" Page is verified using web element");
		}
		else
		{
			System.out.println(driver.getTitle()+" Page is not verified using web element");
			driver.close();
		}
	}
	
	public void Register()
	{
		driver.findElement(By.id("gender-female")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Aishwarya");
		driver.findElement(By.id("LastName")).sendKeys("Mungarwadi");
		driver.findElement(By.id("Email")).sendKeys("ash.m@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Abc@1234");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("Abc@1234");
		driver.findElement(By.id("register-button")).click();
	}
	
	public void Login()
	{
		driver.findElement(By.id("Email")).sendKeys("aishwarya24.m@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Abc@1234");
		driver.findElement(By.id("RememberMe")).click();
		driver.findElement(By.cssSelector("input[value='Log in']")).click();
	}
	
	
	public void AddToCart() throws InterruptedException
	{
		List<WebElement> cartOptions = driver.findElements(By.cssSelector("input[value='Add to cart']"));
		
		for (WebElement webElement : cartOptions) {
			webElement.click();
			Thread.sleep(1000);
		}
	}
	
	public void EmptyCart() throws InterruptedException
	{
		List<WebElement> options = driver.findElements(By.cssSelector("input[name='removefromcart']"));
		
		for (WebElement webElement : options) {
			webElement.click();
			Thread.sleep(1000);
		}
		
		driver.findElement(By.cssSelector("input[name='updatecart']")).click();
	}
	
	public static void CloseBrowser()
	{
		driver.close();
	}
}
