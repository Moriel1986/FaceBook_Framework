

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login_to_App 
{
	
	WebElement username = null;
	WebElement password = null;
	WebElement click_login = null;
	
	public void set_username(String uname) 
	{
		username = driver.findElement(By.id("email"));
		username.sendKeys(uname);
	}
	
	public void set_password(String pword) 
	{
		password = driver.findElement(By.id("pass"));
		password.sendKeys(pword);
	}
	
	public void click_login() 
	{
		click_login = driver.findElement(By.xpath("//input[@id='u_0_b']"));
		click_login.click();
	}
		
	
	
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
		
		
		Login_to_App login_to_Facebook = new Login_to_App();
		login_to_Facebook.set_username("demoriel24@comcast.net");
		login_to_Facebook.set_password("Kobelastgame60$");
		login_to_Facebook.click_login();
		String title = driver.getTitle();
		System.out.println(title);
		
		if(title == "Facebook")
		{
			System.out.println("Valid Login Successful");
			
		}
		else 
		{
			System.out.println("Valid Login Unsuccessful");
		}
		
		driver.quit();
	}
	
	

}
