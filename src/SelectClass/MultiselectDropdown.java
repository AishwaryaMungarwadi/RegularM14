package SelectClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiselectDropdown {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///Users/aishwaryapts/Downloads/demo-1.html");
		
		WebElement multi_select = driver.findElement(By.xpath("//select[@id='multiple_cars']"));
		
		Select ref=new Select(multi_select);
		
		ref.selectByIndex(1);
		Thread.sleep(1000);
		ref.selectByValue("jgr");
		Thread.sleep(1000);
		ref.selectByVisibleText("Honda");
		
		List<WebElement> options = ref.getOptions();
		
		for (WebElement web : options) {
			
			web.click();
			System.out.println(web.getText());
		}
		
		ref.deselectAll();
	}

}
