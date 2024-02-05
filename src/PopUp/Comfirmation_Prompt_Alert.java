package PopUp;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Comfirmation_Prompt_Alert {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		driver.findElement(By.xpath("//a[text()='Alert with OK ']")).click();
		driver.findElement(By.xpath("//button[@onclick='alertbox()']")).click();
		Thread.sleep(1000);
		Alert a = driver.switchTo().alert();
		a.accept();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
		driver.findElement(By.xpath("//button[@onclick='confirmbox()']")).click();
		Thread.sleep(1000);
		a.dismiss();
		//a.accept();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[text()='Alert with Textbox ']")).click();
		driver.findElement(By.xpath("//button[@onclick='promptbox()']")).click();
		Thread.sleep(1000);
		
		Alert b = driver.switchTo().alert();
		System.out.println(b.getText());
		String given_text="Aishwarya Mungarwadi";
		b.sendKeys(given_text);
		Thread.sleep(1000);
		b.accept();
		
		Thread.sleep(1000);
		driver.close();
	}

}
