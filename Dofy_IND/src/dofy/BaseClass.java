package dofy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterTest;

import org.testng.annotations.BeforeTest;

public class BaseClass {

	WebDriver driver;

	@BeforeTest
	@SuppressWarnings("deprecation")
	public void OpenBrowser()  {
			
			System.setProperty("WebDriver.Chrome.Driver","C:\\Local D\\Testing All\\Drivers & Jars\\chromedriver_win32");
			driver = new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			driver.manage().window().maximize();
			//driver.manage().deleteAllCookies();
			driver.get("http://dofy.inventsoftlabs.in/in_en/chennai/home");
			//driver.navigate().refresh();
	}
	
	
	
	
	@AfterTest
	public void CloseBrowser() 
	        {
				driver.close();
			}		

}
