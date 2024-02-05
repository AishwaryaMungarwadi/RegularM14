import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Register")).click();
		String givenTitle="Demo Web Shop. Register";
		String currentTitle=driver.getTitle();
		
		if(givenTitle.contains(currentTitle))
		{
			System.out.println("You are in Register form....please fill up the form");
			driver.findElement(By.id("gender-female")).click();
			driver.findElement(By.id("FirstName")).sendKeys("Aishwarya");
			driver.findElement(By.id("LastName")).sendKeys("Mungarwadi");
			driver.findElement(By.id("Email")).sendKeys("aishwarya24.m@gmail.com");
			driver.findElement(By.id("Password")).sendKeys("Abc@1234");
			driver.findElement(By.id("ConfirmPassword")).sendKeys("Abc@1234");
			driver.findElement(By.id("register-button")).click();
			driver.close();
		}
		else
			System.out.println("You are in demo web page - home page");
		
	}
}
