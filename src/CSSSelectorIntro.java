import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelectorIntro {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.cssSelector("input[value='Search store']")).sendKeys("Mobile");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[value='Search']")).click();
		driver.close();
		
	}
}
