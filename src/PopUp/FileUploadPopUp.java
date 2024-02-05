package PopUp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUploadPopUp {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.naukri.com/");
		driver.findElement(By.id("register_Layer")).click();
		Actions action=new Actions(driver);
		action.keyDown(Keys.PAGE_DOWN).build().perform();
		action.keyDown(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='resumeUpload']")).sendKeys("/Users/aishwaryapts/Downloads/Vivaan Mungarwadi_Version 1.pdf");
		Thread.sleep(1000);
		
	}

}
