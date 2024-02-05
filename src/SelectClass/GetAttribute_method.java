package SelectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute_method {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		String id_name="small-searchterms";
		WebElement search_element = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		String actual_id = search_element.getAttribute("id");
		if(id_name.equals(actual_id))
		{
			System.out.println("id is matched");
			System.out.println(actual_id);
		}
		else
			System.out.println("id not matched");
		
		driver.close();
	}

}
