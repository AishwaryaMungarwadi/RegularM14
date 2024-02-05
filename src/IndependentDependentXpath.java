import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IndependentDependentXpath {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.xpath("(//li[@class='inactive']) [5]")).click();
				
		System.out.println(driver.findElement(By.xpath("//a[text()='3rd Album']/../../div[3]/div[1]/span")).getText());
		
		System.out.println(driver.findElement(By.xpath("(//a[text()='Music 2'])[1]/../following-sibling::div[3]/div[1]/span")).getText());
		
		System.out.println(driver.findElement(By.xpath("(//a[text()='Music 2'])[2]/../following-sibling::div[3]/div[1]/span")).getText());
		
		//System.out.println(driver.findElement(By.xpath("//a[text()='14.1-inch Laptop']/parent::h2/parent::div/child::div[3]/child::div[1]/child::span")).getText());
		
		//System.out.println(driver.findElement(By.xpath("//a[text()='14.1-inch Laptop']/../following-sibling::div[3]/child::div[1]/span")).getText());
	}
}
