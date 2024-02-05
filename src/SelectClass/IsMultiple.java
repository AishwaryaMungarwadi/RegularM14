package SelectClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsMultiple {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///Users/aishwaryapts/Downloads/demo-1.html");
		
		WebElement single_select = driver.findElement(By.xpath("//select[@id='standard_cars']"));
		
		WebElement multi_select = driver.findElement(By.xpath("//select[@id='multiple_cars']"));
		
		Select s1_single=new Select(single_select);
		Select s2_multi=new Select(multi_select);
		
		if(s2_multi.isMultiple())
		{
			List<WebElement> options = s2_multi.getOptions();
			for (WebElement web : options) {
				web.click();
				Thread.sleep(1000);
			}
			s2_multi.deselectAll();
		}
		else
		{
			List<WebElement> options = s1_single.getOptions();
			
			for (WebElement web : options) {
				web.click();
				Thread.sleep(1000);
			}
			//s1_single.deselectAll();
		}
	}
}
