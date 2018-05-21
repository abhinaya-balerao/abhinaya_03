package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import utilities.ConfigurationPage;





public class BaseTest {
	
	public WebDriver driver;
	
	@BeforeSuite
	
	public void loadConfiguration(){
		
		ConfigurationPage.loadConfig();
	}
	
	@BeforeMethod
	
	public void openBrowser(){
		
		String browserName= ConfigurationPage.getBrowser();
		
		switch(browserName.trim().toLowerCase()){
		
		case "chrome":
			
			System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
			driver=new ChromeDriver();
			break;
		 default:
		    	 System.out.println("not a valid browsername"+browserName);
		    	 System.exit(0);
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(ConfigurationPage.getURL());
		
	}
	
	@AfterMethod
	
	public void closeBrowser(){
		
		driver.close();
	
	}

}
