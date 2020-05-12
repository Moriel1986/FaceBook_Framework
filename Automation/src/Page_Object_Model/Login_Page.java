package Page_Object_Model;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_Page
{
	public WebDriver driver;
	
	public Login_Page(WebDriver driver) 
	{
		this.driver = driver;
	}
	
	
	@FindBy(id="email")
	private WebElement username;
	
	@FindBy(name="pass")
	private WebElement password;
	
	@FindBy(xpath="//input[@id='u_0_b']")
	private WebElement loginButton;
	
	public void set_username(String uname) 
	{
		
		username.sendKeys(uname);
	}
	
	public void set_password(String pword) 
	{
		
		password.sendKeys(pword);
	}
	
	public void click_login() 
	{
		
		loginButton.click();
	}
	
	
	
	
		
}
