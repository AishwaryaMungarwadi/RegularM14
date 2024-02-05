import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentVerifyingWebElement {

public static void main(String[] args) throws InterruptedException {
		
	//UtilityForDemoWebShop u=new UtilityForDemoWebShop();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		WebElement welcomeStore = driver.findElement(By.cssSelector("h2[class='topic-html-content-header']"));
		if(welcomeStore.isDisplayed())
		{
			System.out.println("You are in home page");
			driver.findElement(By.partialLinkText("Digital")).click();
			
			WebElement digitalDownload = driver.findElement(By.cssSelector("div[class='page-title']"));
			
			if(digitalDownload.isDisplayed())
			{
				System.out.println("You are in digital download page");
				List<WebElement> options = driver.findElements(By.cssSelector("input[value='Add to cart']"));
				
				for (WebElement webElement : options) {
					
					webElement.click();
					Thread.sleep(1000);
				}	
				driver.findElement(By.cssSelector("a[class='ico-cart'] span[class='cart-label']")).click();
				
				WebElement shoppingCart = driver.findElement(By.cssSelector("div[class='page-title']"));
				
				if(shoppingCart.isDisplayed())
				{
					System.out.println("You are in shopping cart page");
					
					List<WebElement> checkboxOptions = driver.findElements(By.cssSelector("input[type='checkbox']"));
					
					checkboxOptions.remove(checkboxOptions.size()-1);
				
					for (WebElement webElement : checkboxOptions) {
						webElement.click();
						Thread.sleep(1000);
					}
					
					driver.findElement(By.name("updatecart")).click();
					
					if(driver.findElement(By.cssSelector("div[class='page-body']")).isDisplayed())
					{
						System.out.println("Your shopping cart is empty");
						Thread.sleep(1000);
						driver.close();
					}
					else
					{
						System.out.println("Your shopping cart is not empty");
					}			
				}
				else
				{
					System.out.println("You are not in shopping cart page");
					driver.close();
				}		
			}
			else
			{
				System.out.println("You are not in digital download page");
				driver.close();
			}			
		}
		else
			System.out.println("URL is wrong");
		
		//driver.close();
	}
}

