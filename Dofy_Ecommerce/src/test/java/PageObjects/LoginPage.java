package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

	public LoginPage(WebDriver driver) {
		super(driver);
		
	}
	
	
	//Elements..........................>
	@FindBy(id = "mat-input-0")
	WebElement Orgcode;
	
	@FindBy(id = "fname")
	WebElement Username;
	
	
	@FindBy(id = "pass")
	WebElement Password;
	
	@FindBy(xpath = "/html/body/app-root/app-signin/div/div/div/form/div[5]/button")
	WebElement LoginBtn;
	
	//Actions..............................>
	public void sendorgcode(String ocode) {
		Orgcode.sendKeys(ocode);
	}
	public void sendusername(String uname) {
		Username.sendKeys(uname);
	}
	public void sendpassword(String pwrd) {
		Password.sendKeys(pwrd);
	}
	public void clkloginbtn() {
		LoginBtn.click();
	}
	
	
}
