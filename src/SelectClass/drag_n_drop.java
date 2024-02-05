package SelectClass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class drag_n_drop {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		Actions action=new Actions(driver);
		
		WebElement osolo = driver.findElement(By.id("box1"));
		WebElement stockholm = driver.findElement(By.id("box2"));
		WebElement washington = driver.findElement(By.id("box3"));
		WebElement copenhagen = driver.findElement(By.id("box4"));
		WebElement seoul = driver.findElement(By.id("box5"));
		WebElement rome = driver.findElement(By.id("box6"));
		WebElement madrid = driver.findElement(By.id("box7"));
		
		
		WebElement[] capitals= {rome,madrid,osolo,copenhagen,seoul,stockholm,washington};
		
		List<WebElement> countries = driver.findElements(By.xpath("//div[@class='dragableBoxRight']"));
		int i=0;
		for (WebElement web : countries) {
			
			System.out.println(web.getText());
			action.dragAndDrop(capitals[i++],web).build().perform();
		}
		
	}
}
