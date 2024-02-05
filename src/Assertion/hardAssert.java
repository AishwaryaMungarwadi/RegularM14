package Assertion;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

public class hardAssert {

	@Test
	public void dws()
	{
		String given_url="https://demowebshop.tricentis.com/";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		String current_url=driver.getCurrentUrl();
	//	Assert.assertEquals(current_url,given_url);
	//	Assert.assertNotEquals(current_url,given_url);
		
		SoftAssert soft_assert=new SoftAssert();
	//	soft_assert.assertEquals(current_url,given_url);
		soft_assert.assertNotEquals(current_url, given_url);
		driver.quit();
	}
}
