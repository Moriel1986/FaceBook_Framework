package Automation_suite;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class FlightClubBaseClass {
	public static WebDriver driver;
	
	@BeforeMethod
	public void start_config()
	{
		System.setProperty("webdriver.gecko.driver","C:/Users/Demoriel Purnell/workspace_python/drivers/geckodriver.exe");
		driver= new FirefoxDriver(); 
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.get("https://www.flightclub.com");
	}
		
		
	@AfterMethod
	public void end_config()
	{
		driver.quit();
	}
}
