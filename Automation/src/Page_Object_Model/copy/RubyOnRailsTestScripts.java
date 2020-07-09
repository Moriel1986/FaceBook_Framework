package Page_Object_Model.copy;
import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;


public class RubyOnRailsTestScripts extends BrowserFactory_RubyOnRails
{ 
	RubyOnRails_Home_page RubyPage;
    File file;
  
	
	
	@Test(groups={"Regression"}, priority=1)
	public void VerifyRubyOnRailsLink() throws InterruptedException 
	{
		file = new File(System.getProperty("user.dir")+ "//src//config//config.properties");
		BrowserFactory_RubyOnRails BF = new BrowserFactory_RubyOnRails();
		BF.initialconfig();
		RubyOnRails_Home_page RubyTest = PageFactory.initElements(driver, RubyOnRails_Home_page.class);
		RubyTest.Click_RubyOnRailsLink();
		String title = driver.getTitle();
		BF.Print(title);
		BF.sleep(6000);
		Assert.assertTrue(title.contains(ReadProperty("RubyOnRailsLinkTitle")));
		if(title == driver.getTitle())
		{
			BF.Print("Test Successful");
		}
		else 
		{
			BF.Print("Test Unsuccessful");
		}
		
	}
	
	@Test(groups={"Regression"}, priority=2)
	public void TopLanguages_Ruby_Link()
	{
		file = new File(System.getProperty("user.dir")+ "//src//config//config.properties");
		BrowserFactory_RubyOnRails BF = new BrowserFactory_RubyOnRails();
		BF.initialconfig();
		RubyOnRails_Home_page RubyTest = PageFactory.initElements(driver, RubyOnRails_Home_page.class);
		RubyTest.TopLanguages_Ruby();
		boolean isEnabled = driver.findElement(By.xpath("//div[@class='TableObject-item TableObject-item--primary v-align-top']")).isEnabled();
		boolean isDisplayed = driver.findElement(By.xpath("//div[@class='TableObject-item TableObject-item--primary v-align-top']")).isDisplayed();
		if(isEnabled)
		{
			BF.Print("Element Enabled Successful");
		}
		else 
		{
			BF.Print("Element Enabled Unsuccessful");
		}
		
		if(isDisplayed)
		{
			BF.Print("Element Displayed Successful");
		}
		else 
		{
			BF.Print("Element Displayed Unsuccessful");
		}
	
	}
	
	@Test(groups={"Regression"}, priority=3)
	public void FindARepositorySearch()
	{
		file = new File(System.getProperty("user.dir")+ "//src//config//config.properties");
		BrowserFactory_RubyOnRails BF = new BrowserFactory_RubyOnRails();
		BF.initialconfig();
		RubyOnRails_Home_page RubyTest = PageFactory.initElements(driver, RubyOnRails_Home_page.class);
		RubyTest.Ruby_Find_a_repository_inputField("webpacker");
		boolean isEnabled = driver.findElement(By.xpath("//div[@class='TableObject-item TableObject-item--primary v-align-top']")).isEnabled();
		boolean isDisplayed = driver.findElement(By.xpath("//div[@class='TableObject-item TableObject-item--primary v-align-top']")).isDisplayed();
		if(isEnabled)
		{
			BF.Print("Element Enabled Successful");
		}
		else 
		{
			BF.Print("Element Enabled Unsuccessful");
		}
		
		if(isDisplayed)
		{
			BF.Print("Element Displayed Successful");
		}
		else 
		{
			BF.Print("Element Displayed Unsuccessful");
		}
	
		
	}
	
	@Test(groups={"Regression"}, priority=4)
	public void VerifyRubyOnRailsImage()
	{
		file = new File(System.getProperty("user.dir")+ "//src//config//config.properties");
		BrowserFactory_RubyOnRails BF = new BrowserFactory_RubyOnRails();
		BF.initialconfig();
		RubyOnRails_Home_page RubyTest = PageFactory.initElements(driver, RubyOnRails_Home_page.class);
		RubyTest.Verify_RubyOnRailsImage();
		boolean isEnabled = driver.findElement(By.xpath("//img[@class='TableObject-item avatar flex-shrink-0']")).isEnabled();
		boolean isDisplayed = driver.findElement(By.xpath("//img[@class='TableObject-item avatar flex-shrink-0']")).isDisplayed();
		if(isEnabled)
		{
			BF.Print("Element Enabled Successful");
		}
		else 
		{
			BF.Print("Element Enabled Unsuccessful");
		}
		
		if(isDisplayed)
		{
			BF.Print("Element Displayed Successful");
		}
		else 
		{
			BF.Print("Element Displayed Unsuccessful");
		}
		
	}
		
	
}

