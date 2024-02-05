import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignments_findelements {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		String givenURL="https://demowebshop.tricentis.com/";
		String actualURL=driver.getCurrentUrl();
		
		if(givenURL.contains(actualURL))
		{
			System.out.println("URL is same...please proceed");
			driver.findElement(By.partialLinkText("Digital")).click();
			String givenTitle="Demo Web Shop. Digital downloads";
			String actualTitle=driver.getTitle();
			
			if(givenTitle.contains(actualTitle))
			{
				System.out.println("You are in download page");
				List<WebElement> options = driver.findElements(By.cssSelector("input[value='Add to cart']"));
				for (WebElement webElement : options) {
					webElement.click();
					Thread.sleep(1000);
				}	
				driver.findElement(By.cssSelector("li[id='topcartlink'] a[class='ico-cart']")).click();
				
				WebElement shoppingCart = driver.findElement(By.cssSelector("div[class='page-title']"));
				
				/*String givenCartTitle="Demo Web Shop. Shopping Cart";
				String actualCartTitle=driver.getTitle();
				
				if(givenCartTitle.contains(actualCartTitle))*/
				
				if(shoppingCart.isDisplayed())
				{
					System.out.println("You are in shopping cart page");
					driver.close();
				}
				else
				{
					System.out.println("You are not in shopping cart page");
					driver.close();
				}	
			}
			else
			{
				System.out.println("You are not in download page");
				driver.close();
			}
			
		}
		else
		{
			System.out.println("URL is not same");
			driver.close();
		}
	}
}
