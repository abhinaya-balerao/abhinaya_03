package mainTest;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.LandingPage;
import pages.SigninPage;

public class POM extends BaseTest{
	
	@Test
	public void login(){
		
		LandingPage landin=new LandingPage(driver);
		
		SigninPage signinpage= landin.signin();
		
		signinpage.loginToAccount("abhinaya1306@gmail.com", "rayaan18");
		
	}

}
