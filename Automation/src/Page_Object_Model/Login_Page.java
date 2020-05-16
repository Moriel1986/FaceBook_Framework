package Page_Object_Model;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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
	
	public void Fill_Create_A_New_Account_Form(String xpath_value, String first_name, String last_name, String email, String pass) throws InterruptedException 
	{
		Actions action = new Actions(driver);
		action.click(driver.findElement(By.xpath(xpath_value)))
		.sendKeys(first_name + Keys.TAB)
		.sendKeys(last_name + Keys.TAB)
		.sendKeys(email + Keys.TAB)
		.sendKeys(pass).build().perform();
	}
	
	
	
	
		
}
