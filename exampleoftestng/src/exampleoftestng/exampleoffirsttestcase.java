package exampleoftestng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class exampleoffirsttestcase {
	WebDriver driver;
	
	@SuppressWarnings("deprecation")
	@BeforeTest
	public void OpenBrowser()  {
		
		System.setProperty("WebDriver.Chrome.Driver","C:\\Local D\\Testing All\\Drivers & Jars\\chromedriver_win32");
		this.driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("http://beyondtherapydev.inventsoftlabs.com/authentication/signin");
		System.out.println("The chrome browser is opening successfully");
		
	}
	
	@Test(priority =1)
	public void loginpage() throws InterruptedException {
		
		
		WebElement Orgcode= driver.findElement(By.id("mat-input-0"));
		Orgcode.sendKeys("mlee");
		
		
		WebElement username=driver.findElement(By.id("fname"));
		username.sendKeys("marcus");
		
	
		WebElement password=driver.findElement(By.id("pass"));
		password.sendKeys("test1234");
		
		
		WebElement loginbutton=driver.findElement(By.xpath("/html/body/app-root/app-signin/div/div/div/form/div[5]/button"));
		loginbutton.click();
	
	}	
	
	@AfterTest
	public void CloseBrowser() {
		driver.close();
	}
}
