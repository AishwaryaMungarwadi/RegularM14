import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Refresh {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		//String currentUrl=driver.getCurrentUrl();
		
		driver.navigate().to("https://www.redbus.in/");
		driver.navigate().back();
		String currentUrl=driver.getCurrentUrl();
		Thread.sleep(2000);
		String givenUrl="https://demowebshop.tricentis.com/";
		driver.navigate().refresh();
		Verifyurl v=new Verifyurl();
		v.verification(currentUrl,givenUrl);
		driver.close();
		
		Calculator c=new Calculator();
		c.add();
		
	}
}

class Verifyurl
{
	public void verification(String currentUrl,String givenUrl)
	{
		if(givenUrl.contains(currentUrl))
		{
			System.out.println("You are in demo");
		}
		else
			System.out.println("You are in red bus");
	}
}
