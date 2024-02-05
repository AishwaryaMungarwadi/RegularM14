import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gettile {
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		String expected_title = "Google";
		System.out.println(driver.getTitle());
		String actual_title=driver.getTitle();
		
		TitleCompare t=new TitleCompare();
		t.compare(actual_title, expected_title);
		
		driver.navigate().to("https://www.facebook.com/");
	//	String current_title =driver.getTitle();
		
		driver.get("https://www.amazon.in/");
		String current_title =driver.getTitle();
		
		driver.navigate().back();
		driver.navigate().forward();
		//String given_title="Facebook – log in or sign up";
		String given_title="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		
		if(given_title.contains(current_title))
		{
			System.out.println("You are in amazon_india page");
		}
		else
		{
			System.out.println("You are in facebook page");
		}
		driver.navigate().back();
		//driver.close();
	
	}
}	
	class TitleCompare
	{
		public void compare(String actual_title,String expected_title)
		{
		if (actual_title.equals(expected_title))
		{
			System.out.println("Title is same");
		}
		else
		{
			System.out.println("Title is not same");
		}
		}
		//driver.close();
		
	}
	
	


