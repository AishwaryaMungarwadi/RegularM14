package PopUp;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class DisableNotification {

	public static void main(String[] args) {
		ChromeOptions c_option = new ChromeOptions();
		c_option.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(c_option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.easemytrip.com/");
		
		FirefoxOptions f_option = new FirefoxOptions();
		f_option.addArguments("--disable-notifications");
		WebDriver drivers=new FirefoxDriver(f_option);
		drivers.manage().window().maximize();
		drivers.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		drivers.get("https://www.easemytrip.com/");
		
		//not worked this program in mac 
	}
}
