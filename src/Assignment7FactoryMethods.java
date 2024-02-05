import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7FactoryMethods extends ReusableCode {
	
	public static void main(String[] args) {
		
		ReusableCode r=new ReusableCode();
		r.ChromeBrowser();
		r.OpenDWS();
		
		String givenTitle="Demo Web Shop";
		String actualTitle= driver.getTitle();
		
		r.verifyTitle(givenTitle, actualTitle);
		driver.findElement(By.linkText("Register")).click();
		
		String givenRegTitle="Demo Web Shop. Register";
		String actualRegTitle= driver.getTitle();
		
		r.verifyTitle(givenRegTitle, actualRegTitle);
		
		r.Register();
		r.CloseBrowser();
	}

}
