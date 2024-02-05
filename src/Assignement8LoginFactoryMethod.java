import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Assignement8LoginFactoryMethod extends ReusableCode {
	
	public static void main(String[] args) {
		
		ReusableCode r= new ReusableCode();
		r.ChromeBrowser();
		r.OpenDWS();
		
		WebElement DemoPageWebElement = driver.findElement(By.cssSelector("h2[class='topic-html-content-header']"));
		
		r.verifyURLWebelement(DemoPageWebElement,driver);
		
		driver.findElement(By.linkText("Log in")).click();
		WebElement LoginPageWebElement = driver.findElement(By.cssSelector("div[class='page-title']"));
		r.verifyURLWebelement(LoginPageWebElement,driver);
		
		r.Login();
		r.CloseBrowser();
	}

}
