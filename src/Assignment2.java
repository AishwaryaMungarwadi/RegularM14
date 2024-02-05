import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		String currentTitle=driver.getTitle();
		driver.navigate().to("https://www.vrlbus.in/");
		driver.navigate().back();
		String givenTitle="Demo Web Shop";
		
		if(givenTitle.contains(currentTitle))
		{
			System.out.println("You are in demo page");
		}
		else
			System.out.println("You are in VRL page");
		
		driver.findElement(By.id("small-searchterms")).sendKeys("Mobile");
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.navigate().forward();
		driver.close();
	}
}
