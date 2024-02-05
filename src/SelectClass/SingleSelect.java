package SelectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelect {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://demowebshop.tricentis.com/");
		
		driver.get("file:///Users/aishwaryapts/Downloads/demo-1.html");
		
	//	driver.findElement(By.xpath("(//li[@class='inactive']) [5]")).click();
		WebElement single_select = driver.findElement(By.cssSelector("select[id='standard_cars']"));
		Select s=new Select(single_select);
		s.selectByVisibleText("Jaguar");
		Thread.sleep(1000);
		s.selectByIndex(2);
		Thread.sleep(1000);
		s.selectByValue("toy");
		
	}

}
