package week5.day2.assignment;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ExcelValues extends W3school {
	
	@BeforeTest
	public void setValues()
	{
		filename="W3school";

	}
	
	@Test(dataProvider="fetchdata")
	public  void runWExcelValues(String fname,String mail,String address,String city,String state,String zip,String cvv,String creditcardnumber,String nameoncard)
	{
		
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.id("cname")).sendKeys(nameoncard);
		driver.findElement(By.id("ccnum")).sendKeys(creditcardnumber);
		driver.findElement(By.id("expmonth")).sendKeys("Oct");
		driver.findElement(By.id("cvv")).sendKeys(cvv);
		driver.findElement(By.id("expyear")).sendKeys("2018");
		driver.findElement(By.id("fname")).sendKeys(fname);
		driver.findElement(By.id("email")).sendKeys(mail);
		driver.findElement(By.id("adr")).sendKeys(address);
		driver.findElement(By.id("city")).sendKeys(city);
		driver.findElement(By.id("zip")).sendKeys(zip);
		driver.findElement(By.id("state")).sendKeys(state);
		driver.findElement(By.xpath("//input[@class='btn']")).click();
		
	}

}
