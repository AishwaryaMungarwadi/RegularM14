package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DWSHomePage {

	DWSHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="small-searchterms")
	WebElement searchText;
	
	@FindBy(xpath = "//input[@type='submit']")
	WebElement searchButton;
	
	public void searchTextMethod(String value)
	{
		searchText.sendKeys(value);
	}
	
	public void searchButtonMethod()
	{
		searchButton.click();
	}
	
}
