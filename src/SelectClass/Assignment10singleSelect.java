package SelectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment10singleSelect {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		String ph_no="1234567890";
		String given_title="Facebook – log in or sign up";
		String actual_title=driver.getTitle();
		
		if(given_title.contains(actual_title))
		{
			System.out.println("You are in facebook page");
			driver.findElement(By.xpath("(//div[@class='_6ltg'])[2]")).click();
			Thread.sleep(1000);
			if(driver.findElement(By.xpath("//div[@class='pvl _52lp _59d-']/child::div[1]")).isEnabled())
			{
				System.out.println("You are in sign up page");
				
				driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Aishwarya");
				driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Mungarwadi");
				
				if(Character.isDigit(ph_no.charAt(0)))
				{
					System.out.println("You are entering mobile number");
					driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys(ph_no);
				}
				else
				{
					System.out.println("You are entering email id");
					driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("abc@gmail.com");
					driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("abc@gmail.com");
				}
			
				driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Abc@1234");
				WebElement date = driver.findElement(By.xpath("//select[@id='day']"));
				Select s_date=new Select(date);
				s_date.selectByVisibleText("24");
				
				WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
				Select s_month=new Select(month);
				s_month.selectByIndex(9);
				
				
				WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
				Select s_year=new Select(year);
				s_year.selectByValue("2018");
				
				driver.findElement(By.xpath("(//span[@class='_5k_2 _5dba'])[1]/input")).click();
				
				driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
				
			}
			else
				System.out.println("You are not in sign up page");
	
		}
		else
			System.out.println("You are not in facebook page");
		
	}

}
