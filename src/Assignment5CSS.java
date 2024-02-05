import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5CSS {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		String givenUrl="https://demowebshop.tricentis.com/";
		String actualUrl=driver.getCurrentUrl();
		
		if(givenUrl.contains(actualUrl))
		{
			System.out.println("URL is Same");
			driver.findElement(By.linkText("Register")).click();
			String givenTitle="Demo Web Shop. Register";
			String actualTitle=driver.getTitle();
			if(givenTitle.contains(actualTitle))
			{
				System.out.println("Title is same");
				driver.findElement(By.cssSelector("input[id='gender-female']")).click();
				driver.findElement(By.cssSelector("input[name='FirstName']")).sendKeys("Aishwarya");
				driver.findElement(By.cssSelector("input[id='LastName']")).sendKeys("M");
				driver.findElement(By.cssSelector("input[name='Email']")).sendKeys("aishwarya24@gmail.com");
				driver.findElement(By.cssSelector("input[name='Password']")).sendKeys("Abc@1234");
				driver.findElement(By.cssSelector("input[name='ConfirmPassword']")).sendKeys("Abc@1234");
				driver.findElement(By.cssSelector("input[id='register-button']")).click();
				Thread.sleep(2000);
				driver.close();
			}
			else
			{
				System.out.println("Title is wrong");
				Thread.sleep(2000);
				driver.close();
			}	
		}
		else
			System.out.println("URL is not same");
	}
}
