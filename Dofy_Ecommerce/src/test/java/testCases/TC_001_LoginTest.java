package testCases;



import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.LoginPage;
import testBase.BaseClass;

public class TC_001_LoginTest extends BaseClass{

	
	@Test
	void test_login() 
	{
		try {
		
		LoginPage LP=new LoginPage(driver);
		LP.sendorgcode("mlee");
		LP.sendusername("marcus");
		LP.sendpassword("test1234");
		LP.clkloginbtn();
		}
		catch(Exception e)
		{
			Assert.fail();
		}
	}
	
	
}
