package Page_Object_Model;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

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
	
	public void Fill_Create_A_New_Account_Form(String xpath_value, String first_name, String last_name, String email, String pass, String new_pass) throws InterruptedException 
	{
		Actions action = new Actions(driver);
		action.click(driver.findElement(By.xpath(xpath_value)))
		.sendKeys(first_name + Keys.TAB)
		.sendKeys(last_name + Keys.TAB)
		.sendKeys(email + Keys.TAB)
		.sendKeys(pass + Keys.TAB)
		.sendKeys(new_pass + Keys.TAB).build().perform();
	}
	
	public void Login_FB_DropDown(String visible_month_text, String visible_day_text, String visible_year_text) throws InterruptedException
	{
		WebElement month = driver.findElement(By.id("month"));
		WebElement day = driver.findElement(By.id("day"));
		WebElement year = driver.findElement(By.id("year"));
		Select select_month = new Select(month);
		select_month.selectByVisibleText(visible_month_text);
		Thread.sleep(6);
		Select select_day = new Select(day);
		select_day.selectByVisibleText(visible_day_text);
		Thread.sleep(6);
		Select select_year = new Select(year);
		select_year.selectByVisibleText(visible_year_text);
	}
	
	public void FB_Login_RadioButton_Options() 
	{
		List <WebElement> radio = driver.findElements(By.xpath("//input[@type='radio']"));
		for(int i = 0; i>radio.size(); i++) 
		{
			WebElement local_radio = radio.get(i);
			String value = local_radio.getAttribute("value");
			System.out.println("radio button values are : " + value);
		}
	}
	
	
	
	
		
}
