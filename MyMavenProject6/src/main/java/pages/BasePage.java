package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage {
	
	protected WebDriver driver;
	
	public BasePage(WebDriver driver){
		
		this.driver=driver;
		
	}
	
	By signin_by = By.xpath("//a[@class='login']");
	
	public SigninPage signin(){
		driver.findElement(signin_by).click();
	return new SigninPage(driver);
	
	}
	
}
