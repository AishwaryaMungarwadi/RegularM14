import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Testing {
	
	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		//EdgeDriver driver1=new EdgeDriver();
		
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.manage().window().minimize();
		
		driver.quit();
	}
}
