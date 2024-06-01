package week5.day2.assignment;

import java.io.IOException;
import java.time.Duration;


import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

public class W3school extends ReadExcelW3{

	public ChromeDriver driver ;
	String filename;
	
	@BeforeMethod
	public void preCondition()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/howto/tryit.asp?filename=tryhow_css_checkout_form");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		
	}
	

	@AfterMethod
	public void postCondition()
	{
		driver.close();
	}
	
	@DataProvider(name="fetchdata")
	public String[][] sendData() throws IOException
	{
		return ReadExcelW3.readData(filename);
	}
}
