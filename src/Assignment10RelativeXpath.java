import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment10RelativeXpath {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		String[] name= {"Aishwarya","aishwarya24.m@gmail.com","Amezon","abc@gmail.com"};
		
		if(driver.findElement(By.xpath("//h2[@class='topic-html-content-header']")).isDisplayed())
		{
			System.out.println("Demo web page is verified");
			driver.findElement(By.xpath("(//input[@value='Add to cart'])[1]")).click();
			Thread.sleep(1000);
			if(driver.findElement(By.xpath("//h1[@ itemprop='name']")).isEnabled())
			{
				System.out.println("Gift card page is verified");
				/*driver.findElement(By.xpath("//input[@id='giftcard_2_RecipientName']")).sendKeys("Aishwarya");
				driver.findElement(By.xpath("//input[@id='giftcard_2_RecipientEmail']")).sendKeys("aishwarya24.m@gmail.com");
				driver.findElement(By.xpath("//input[@class='sender-name']")).sendKeys("Amezon");
				driver.findElement(By.xpath("//input[@class='sender-email']")).sendKeys("abc@gmail.com");*/
				
				
				List<WebElement> options = driver.findElements(By.xpath("//div[@class='giftcard']/div/input"));
				int i=0;
				for (WebElement web : options) {
					web.sendKeys(name[i++]);
					Thread.sleep(1000);
					
				}
				
				
				driver.findElement(By.xpath("//textarea[@class='message']")).sendKeys("Hello");
				driver.findElement(By.xpath("//input[@class='qty-input']")).clear();
				driver.findElement(By.xpath("//input[@class='qty-input']")).sendKeys("3");
				driver.findElement(By.xpath("//input[@id='add-to-cart-button-2']")).click();
				driver.findElement(By.xpath("(//span[@class='cart-label'])[1]")).click();
				if(driver.findElement(By.xpath("//div[@class='page-title']")).isEnabled())
				{
					System.out.println("Shopping cart page verified");
					driver.findElement(By.xpath("//input[@name='removefromcart']")).click();
					driver.findElement(By.xpath("//input[@name='updatecart']")).click();
					driver.close();
				}
				else
				{
					System.out.println("Shopping cart page is not verified");
				}
				
			}
			else
			{
				System.out.println("Gift card page is not verfied");
			}
		}
		else
		{
			System.out.println("Demo web page is not verified");
		}
	}
}
