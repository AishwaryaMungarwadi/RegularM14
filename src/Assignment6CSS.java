import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment6CSS {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		String givenUrl="https://demowebshop.tricentis.com/";
		String actualUrl=driver.getCurrentUrl();
		if(givenUrl.contains(actualUrl))
		{
			System.out.println("URL is Same");
			driver.findElement(By.linkText("Log in")).click();
			String givenTitle="Demo Web Shop. Login";
			String actualTitle=driver.getTitle();
			
			if(givenTitle.contains(actualTitle))
			{
				System.out.println("Title is same");
				driver.findElement(By.cssSelector("input[id='Email']")).sendKeys("aishwarya24.m@gmail.com");
				driver.findElement(By.cssSelector("input[name='Password']")).sendKeys("Abc@1234");
				driver.findElement(By.cssSelector("input[id='RememberMe']")).click();
				driver.findElement(By.cssSelector("input[value='Log in']")).click();
				Thread.sleep(2000);
				driver.close();
			}
			else
			{
				System.out.println("Title is not same");
				Thread.sleep(2000);
				driver.close();
			}
		}
		else
			System.out.println("URL is not same");
	}
	
}
