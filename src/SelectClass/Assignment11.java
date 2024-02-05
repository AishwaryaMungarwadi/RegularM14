package SelectClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment11 {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		WebElement demoWebElement = driver.findElement(By.xpath("//h2[@class='topic-html-content-header']"));
		
		if(demoWebElement.isDisplayed())
		{
			System.out.println("You are in demo web home page");
			
			driver.findElement(By.xpath("//ul[@class='top-menu']/li[1]/a")).click();
		
			WebElement bookWebElement = driver.findElement(By.xpath("//div[@class='page-title']"));
			if(bookWebElement.isDisplayed())
			{	
				WebElement sort_by = driver.findElement(By.xpath("//select[@id='products-orderby']"));
				Select s1=new Select(sort_by);
				s1.selectByVisibleText("Price: High to Low");
				
				Thread.sleep(5000);
				
				//int j=0;
				WebElement sort_by_all_values = driver.findElement(By.xpath("//select[@id='products-orderby']"));
				Select s2=new Select(sort_by_all_values);
				
				List<WebElement> allValues = s2.getOptions();
				
				for (WebElement web : allValues) {
					System.out.println(web.getText());
					/*s2.selectByIndex(j++);
					sort_by_all_values = driver.findElement(By.xpath("//select[@id='products-orderby']"));
					s2=new Select(sort_by_all_values);*/
					
				}	
				
				
				WebElement display = driver.findElement(By.xpath("//select[@id='products-pagesize']"));
				Select s3=new Select(display);
				s3.selectByIndex(2);
				
				WebElement viewAs = driver.findElement(By.xpath("//select[@id='products-viewmode']"));
				Select s4=new Select(viewAs);
				s4.selectByIndex(1);
				
				Thread.sleep(1000);
				
				WebElement sort_by_index = driver.findElement(By.xpath("//select[@id='products-orderby']"));
				Select s5=new Select(sort_by_index);
				
				int j=0;
				List<WebElement> options = s5.getOptions();
				
				for (WebElement web : options) {
					
					s5.selectByIndex(j++);
					sort_by_index = driver.findElement(By.xpath("//select[@id='products-orderby']"));
					s5=new Select(sort_by_index);
					
				}
				
			/*	s5.selectByIndex(0);
				Thread.sleep(1000);
				
				sort_by_index = driver.findElement(By.xpath("//select[@id='products-orderby']"));
				s5=new Select(sort_by_index);
				s5.selectByIndex(1);
				
				sort_by_index = driver.findElement(By.xpath("//select[@id='products-orderby']"));
				s5=new Select(sort_by_index);
				s5.selectByIndex(2);
				
				sort_by_index = driver.findElement(By.xpath("//select[@id='products-orderby']"));
				s5=new Select(sort_by_index);
				s5.selectByIndex(3);
				
				sort_by_index = driver.findElement(By.xpath("//select[@id='products-orderby']"));
				s5=new Select(sort_by_index);
				s5.selectByIndex(4);
				
				sort_by_index = driver.findElement(By.xpath("//select[@id='products-orderby']"));
				s5=new Select(sort_by_index);
				s5.selectByIndex(5);
				*/
				
				String name="Price: High to Low";
				
				WebElement sort = driver.findElement(By.xpath("//select[@name='products-orderby']"));
				Select s6=new Select(sort);
				List<WebElement> alloptions = s6.getOptions();
				int i=0;
				
				for (WebElement web : alloptions) {
					if(web.getText().contains(name))
					{
						System.out.println("");
						System.out.println("Name matched");
						System.out.println("Index at which it is located is " +i);
					}
					else
					{
						i++;
					}
				}
				driver.close();
				
			}
			else
			{
				System.out.println("You are not in books page");
				driver.close();
			}
		}
		else
			System.out.println("You are not in demo web home page ");
	}

}
