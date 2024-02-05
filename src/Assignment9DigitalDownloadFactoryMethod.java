import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Assignment9DigitalDownloadFactoryMethod extends ReusableCode{
	
	public static void main(String[] args) throws InterruptedException {
		
		ReusableCode r= new ReusableCode();
		r.ChromeBrowser();
		r.OpenDWS();
		
		WebElement DemoPageWebElement = driver.findElement(By.cssSelector("h2[class='topic-html-content-header']"));
		
		r.verifyURLWebelement(DemoPageWebElement,driver);
		
		driver.findElement(By.partialLinkText("Digital")).click();
		
		WebElement DigitalDownloaWebElement = driver.findElement(By.cssSelector("div[class='page-title']"));
		
		r.verifyURLWebelement(DigitalDownloaWebElement, driver);
		r.AddToCart();
		
		driver.findElement(By.linkText("Shopping cart")).click();
		WebElement shoppingCartWebElement = driver.findElement(By.cssSelector("div[class='page-title']"));
		r.verifyURLWebelement(shoppingCartWebElement, driver);
		r.EmptyCart();
		r.CloseBrowser();
	}

}
