package DataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import AppachePOI.BaseClass;

public class DataProviderWithExcel extends BaseClass{

	@DataProvider(name="login")
	public Object[][] sender() throws EncryptedDocumentException, IOException
	{
		Object [][] obj=new Object[2][2];
		File file = new File("");
		FileInputStream fs = new FileInputStream(file);
		Workbook wbk = WorkbookFactory.create(fs);
		Sheet sheet = wbk.getSheet("Sheet1");
		obj[0][0]=sheet.getRow(0).getCell(0).toString();
		obj[0][1]=sheet.getRow(0).getCell(1).toString();
		obj[1][0]=sheet.getRow(1).getCell(0).toString();
		obj[1][1]=sheet.getRow(1).getCell(1).toString();
		
		
		return obj;
		
	}
	
	@Test(dataProvider="login")
	public void receiver(String email,String password)
	{
		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.id("RememberMe")).click();
		driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
	}
}
