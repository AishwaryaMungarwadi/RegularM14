import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkedTextLocator {

	public static void main(String[] args) {
		
		String givenUrl="https://demowebshop.tricentis.com/";
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		String currentUrl=driver.getCurrentUrl();
		
		if(givenUrl.contains(currentUrl))
		{
			System.out.println("URL is same");
			driver.findElement(By.linkText("Log in")).click();
			String givenTitle="Demo Web Shop. Login";
			String currentTitle=driver.getTitle();
			
			if(givenTitle.contains(currentTitle))
			{
				System.out.println("You are in login page");
			}
			else
				System.out.println("You are not in login page");
			driver.close();
		}
		else
			System.out.println("URL is not same");
		
		
	}
	
	
}
