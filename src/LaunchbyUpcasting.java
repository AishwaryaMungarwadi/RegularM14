import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchbyUpcasting {
	
	public static void main(String[] args) {
		
		String s ="https://www.qspiders.com/";
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().window().minimize();
		driver.get("https://www.qspiders.com/");
		String s1=driver.getCurrentUrl();
		//System.out.println(driver.getCurrentUrl());
		
		if (s.equals(s1))
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
