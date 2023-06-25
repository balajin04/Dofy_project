package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomePage extends BasePage {

	public  HomePage (WebDriver driver) {
		super(driver);
	}

	@FindBy (xpath = "/html/body/app-root/app-signin/div/div/div/form/div[6]/span/a")
	WebElement signupbtn;
	
	public void clksignupbtn() {
		signupbtn.click();
	}
}
