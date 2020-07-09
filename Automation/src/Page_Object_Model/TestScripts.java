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
	Home_page_FB HPage;
    File file;
  
	
	
	@Test(groups={"Regression"}, priority=1)
	public void login() throws InterruptedException 
	{
		file = new File(System.getProperty("user.dir")+ "//src//config//config.properties");
		BrowserFactory2 BF = new BrowserFactory2();
		BF.initialconfig();
		Login_Page FBTest = PageFactory.initElements(driver, Login_Page.class);
		FBTest.set_username(ReadProperty("username"));
		FBTest.set_password(ReadProperty("password"));
		FBTest.click_login();
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
		FBTest.Fill_Create_A_New_Account_Form("//input[@name='firstname']", 
		"Demoriel", "Purnell", "demoriel24@comcast.net", "052686", "862505");
		FBTest.Login_FB_DropDown("May", "26", "1986");
		
		
	}
	
	@Test(groups={"Regression"}, priority=3)
	public void check_FBIcon_button() throws InterruptedException 
	{
		file = new File(System.getProperty("user.dir")+ "//src//config//config.properties");
		BrowserFactory2 BF = new BrowserFactory2();
		BF.initialconfig();
		Login_Page FBTest = PageFactory.initElements(driver, Login_Page.class);
		Home_page_FB FBTest2 = PageFactory.initElements(driver, Home_page_FB.class);
		FBTest.set_username(ReadProperty("username"));
		FBTest.set_password(ReadProperty("password"));
		FBTest.click_login();
		FBTest2.FBIconClick();
		String title = driver.getTitle();
		BF.Print(title);
		Assert.assertTrue(title.contains(ReadProperty("FBProfileTitle2")));
	}
	
	
	@Test(groups={"Regression"}, priority=4)
	public void check_FBIProfile_button() throws InterruptedException 
	{
		file = new File(System.getProperty("user.dir")+ "//src//config//config.properties");
		BrowserFactory2 BF = new BrowserFactory2();
		BF.initialconfig();
		Login_Page FBTest = PageFactory.initElements(driver, Login_Page.class);
		Home_page_FB FBTest2 = PageFactory.initElements(driver, Home_page_FB.class);
		FBTest.set_username(ReadProperty("username"));
		FBTest.set_password(ReadProperty("password"));
		FBTest.click_login();
		FBTest2.FBProfileButtonClick("Darren Purnell");
		String title = driver.getTitle();
		BF.Print(title);
		Assert.assertTrue(title.contains("Facebook"));
	}
	
//	@Test(groups={"Regression"}, priority=5)
//	public void checkFBHomebutton() throws InterruptedException 
//	{
//		file = new File(System.getProperty("user.dir")+ "//src//config//config.properties");
//		BrowserFactory2 BF = new BrowserFactory2();
//		BF.initialconfig();
//		Login_Page FBTest = PageFactory.initElements(driver, Login_Page.class);
//		Home_page_FB FBTest2 = PageFactory.initElements(driver, Home_page_FB.class);
//		FBTest.set_username(ReadProperty("username"));
//		FBTest.set_password(ReadProperty("password"));
//		FBTest.click_login();
//		FBTest2.HomeButton();
//		String title = driver.getTitle();
//		BF.Print(title);
//		Assert.assertTrue(title.contains("Facebook"));
//	}
//	
//	@Test(groups={"Regression"}, priority=6)
//	public void checkFBCreatebutton() throws InterruptedException 
//	{
//		file = new File(System.getProperty("user.dir")+ "//src//config//config.properties");
//		BrowserFactory2 BF = new BrowserFactory2();
//		BF.initialconfig();
//		Login_Page FBTest = PageFactory.initElements(driver, Login_Page.class);
//		Home_page_FB FBTest2 = PageFactory.initElements(driver, Home_page_FB.class);
//		FBTest.set_username(ReadProperty("username"));
//		FBTest.set_password(ReadProperty("password"));
//		FBTest.click_login();
//		FBTest2.CreateButton();
//		String title = driver.getTitle();
//		BF.Print(title);
//		Assert.assertTrue(title.contains("Facebook"));
//     }
//	
//	@Test(groups={"Regression"}, priority=7)
//	public void FriendRequestbutton() throws InterruptedException 
//	{
//		file = new File(System.getProperty("user.dir")+ "//src//config//config.properties");
//		BrowserFactory2 BF = new BrowserFactory2();
//		BF.initialconfig();
//		Login_Page FBTest = PageFactory.initElements(driver, Login_Page.class);
//		Home_page_FB FBTest2 = PageFactory.initElements(driver, Home_page_FB.class);
//		FBTest.set_username(ReadProperty("username"));
//		FBTest.set_password(ReadProperty("password"));
//		FBTest.click_login();
//		FBTest2.FriendRequestButton();
//		String title = driver.getTitle();
//		BF.Print(title);
//		Assert.assertTrue(title.contains("Facebook"));
//	}
//	
//	@Test(groups={"Regression"}, priority=8)
//	public void Messagebutton() throws InterruptedException 
//	{
//		file = new File(System.getProperty("user.dir")+ "//src//config//config.properties");
//		BrowserFactory2 BF = new BrowserFactory2();
//		BF.initialconfig();
//		Login_Page FBTest = PageFactory.initElements(driver, Login_Page.class);
//		Home_page_FB FBTest2 = PageFactory.initElements(driver, Home_page_FB.class);
//		FBTest.set_username(ReadProperty("username"));
//		FBTest.set_password(ReadProperty("password"));
//		FBTest.click_login();
//		FBTest2.MessageButton();
//		String title = driver.getTitle();
//		BF.Print(title);
//		Assert.assertTrue(title.contains("Facebook"));
//	}
//	
//	@Test(groups={"Regression"}, priority=9)
//	public void QuickHelpbutton() throws InterruptedException 
//	{
//		file = new File(System.getProperty("user.dir")+ "//src//config//config.properties");
//		BrowserFactory2 BF = new BrowserFactory2();
//		BF.initialconfig();
//		Login_Page FBTest = PageFactory.initElements(driver, Login_Page.class);
//		Home_page_FB FBTest2 = PageFactory.initElements(driver, Home_page_FB.class);
//		FBTest.set_username(ReadProperty("username"));
//		FBTest.set_password(ReadProperty("password"));
//		FBTest.click_login();
//		FBTest2.QuickHelpButton();
//		String title = driver.getTitle();
//		BF.Print(title);
//		Assert.assertTrue(title.contains("Facebook"));
//	}
//	
//	@Test(groups={"Regression"}, priority=10)
//	public void NotificationButton() throws InterruptedException 
//	{
//		file = new File(System.getProperty("user.dir")+ "//src//config//config.properties");
//		BrowserFactory2 BF = new BrowserFactory2();
//		BF.initialconfig();
//		Login_Page FBTest = PageFactory.initElements(driver, Login_Page.class);
//		Home_page_FB FBTest2 = PageFactory.initElements(driver, Home_page_FB.class);
//		FBTest.set_username(ReadProperty("username"));
//		FBTest.set_password(ReadProperty("password"));
//		FBTest.click_login();
//		FBTest2.NotificationButton();
//		String title = driver.getTitle();
//		BF.Print(title);
//		Assert.assertTrue(title.contains("Facebook"));
//	}
}

