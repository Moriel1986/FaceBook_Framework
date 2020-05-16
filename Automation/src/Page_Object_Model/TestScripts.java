package Page_Object_Model;
import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TestScripts extends BrowserFactory2
{ 
	Login_Page page;
    File file;
  
	
	
	@Test(groups={"Regression"}, priority=1)
	public void login() throws InterruptedException 
	{
		file = new File(System.getProperty("user.dir")+ "//src//config//config.properties");
		BrowserFactory2 BF = new BrowserFactory2();
		BF.initialconfig();
		Login_Page FBTest = PageFactory.initElements(driver, Login_Page.class);
		BF.sleep(7);
		FBTest.set_username(ReadProperty("username"));
		FBTest.set_password(ReadProperty("password"));
		FBTest.click_login();
		BF.sleep(7);
		WebElement element = driver.findElement(By.xpath(ReadProperty("FacebookProfileElement")));
		String title = driver.getTitle();
		BF.Print(title);
		Assert.assertTrue(title.contains(ReadProperty("FBProfileTitle2")));
		Assert.assertTrue(element.isDisplayed());
		if(element.isDisplayed())
		{
			BF.Print("Valid Login Successful");
			
		}
	
		else 
		{
			BF.Print("Valid Login Unsuccessful");
		}
	}
		
	@Test(groups={"Regression"}, priority=2)
	public void create_account_form() throws InterruptedException
	{
		file = new File(System.getProperty("user.dir")+ "//src//config//config.properties");
		BrowserFactory2 BF = new BrowserFactory2();
		BF.initialconfig();
		Login_Page FBTest = PageFactory.initElements(driver, Login_Page.class);
		FBTest.Fill_Create_A_New_Account_Form("//div[@class='_4bl7 _m-_ _8fgm']//input[@id='u_0_q']", "Demoriel", "Purnell", "demoriel24@comcast.net", "052686");
	}
		
}

