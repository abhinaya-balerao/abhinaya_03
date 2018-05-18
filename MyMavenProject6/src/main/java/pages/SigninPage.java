package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SigninPage extends BasePage{
	
      By emailId_by = By.xpath("//input[@id='email']");
	By password_by = By.xpath("//input[@id='passwd']");
	By loginBtn_by = By.xpath("//button[@id='SubmitLogin']");

	 
	public SigninPage(WebDriver driver){
		
		super(driver);	
	}
	
	public void loginToAccount(String userName, String password){
		driver.findElement(emailId_by).sendKeys(userName);
		driver.findElement(password_by).sendKeys(password);
		driver.findElement(loginBtn_by).click();

	}


}
