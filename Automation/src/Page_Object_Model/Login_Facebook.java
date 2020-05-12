package Page_Object_Model;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login_Facebook
{
	public static WebDriver driver = null;
	public static void main(String[] args) 
	{

		System.setProperty("webdriver.gecko.driver","C:/Users/Demoriel Purnell/workspace_python/drivers/geckodriver.exe");
		driver= new FirefoxDriver(); 
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		WebElement username = driver.findElement(By.id("email"));
		WebElement password = driver.findElement(By.id("pass"));
		WebElement click_login = driver.findElement(By.xpath("//input[@id='u_0_b']"));
		
		
		username.sendKeys("Demoriel24@comcast.net");
		password.sendKeys("Kobelastgame60$");
		click_login.click();
		
		username.sendKeys("Demoriel25@comcast.net");
		password.sendKeys("Kobelastgame60#");
		click_login.click();

	}

}
