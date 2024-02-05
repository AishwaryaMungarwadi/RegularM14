import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		String actualurl=driver.getCurrentUrl();
		String expectedurl="https://www.google.com/";
		
		if(actualurl.equals(expectedurl))
		{
			System.out.println("URL is same");
		}
		else
		{
			System.out.println("URL is not same");
		}
		
		
		driver.close();
		
	}
}
