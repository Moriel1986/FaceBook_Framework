package Automation_suite;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;

public class seleniumWrappers 
{
	public static WebDriver driver = null;
	
	
	
	public void open_browser() 
	{
		System.setProperty("webdriver.gecko.driver","C:/Users/Demoriel Purnell/workspace_python/drivers/geckodriver.exe");
		driver= new FirefoxDriver();
	}
	
	public void navigate_url(String url) 
	{
		driver.get(url);
	}
	
	public void closeBrowser() 
	{
		driver.quit();
	}
	
	public void title() 
	{
		driver.getTitle();
	}
	
	public void back() 
	{
		driver.navigate().back();
	}
	
	public void forward() 
	{
		driver.navigate().forward();;
	}
	
	public void refresh() 
	{
		driver.navigate().refresh();	
	}
	
	
	public void current_url() 
	{
		driver.getCurrentUrl();
	}
	
	
	public void max_window() 
	{
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
	}
	
	public void launch(String url)
	{
		driver.get(url);
	}
	
	public void timeout(int waitNum) 
	{
		driver.manage().timeouts().implicitlyWait(waitNum, TimeUnit.SECONDS);
	}
	
	public void pageloadTimeout(int loadTimeNum)
	{
		try{
			driver.manage().timeouts().pageLoadTimeout(loadTimeNum, TimeUnit.SECONDS);
		}
		catch(TimeoutException ex) 
		{
			System.out.println("TimeOut error");
		}
	}
	
	public void sleep(int sleepNum) throws InterruptedException 
	{
		Thread.sleep(sleepNum);
	}
	
	public static void valid_user_name(String locator, String value, String param) 
	{
		if(locator.equals("id")) 
		{
			driver.findElement(By.id(value)).sendKeys(param);
		}
		else if(locator.equals("name"))
		{
			driver.findElement(By.name(value)).sendKeys(param);
		}
		else if(locator.equals("xpath"))
		{
			driver.findElement(By.xpath(value)).sendKeys(param);
		}
		else if(locator.equals("LinkText"))
		{
			driver.findElement(By.linkText(value)).sendKeys(param);
		}
		else if(locator.equals("partialLinkText"))
		{
			driver.findElement(By.partialLinkText(value)).sendKeys(param);
		}
		else if(locator.equals("cssSelector"))
		{
			driver.findElement(By.cssSelector(value)).sendKeys(param);
		}
		else if(locator.equals("tagName"))
		{
			driver.findElement(By.tagName(value)).sendKeys(param);
		}
		else 
		{
			System.out.println("No Locator Available");
		}
		
	}
	
	public static void click_submit(String locator, String value) 
	{
		if(locator.equals("id")) 
		{
			driver.findElement(By.id(value)).click();
		}
		else if(locator.equals("name"))
		{
			driver.findElement(By.name(value)).click();
		}
		else if(locator.equals("xpath"))
		{
			driver.findElement(By.xpath(value)).click();
		}
		else if(locator.equals("LinkText"))
		{
			driver.findElement(By.linkText(value)).click();
		}
		else if(locator.equals("partialLinkText"))
		{
			driver.findElement(By.partialLinkText(value)).click();
		}
		else if(locator.equals("cssSelector"))
		{
			driver.findElement(By.cssSelector(value)).click();
		}
		else if(locator.equals("tagName"))
		{
			driver.findElement(By.tagName(value)).click();
		}
		else 
		{
			System.out.println("No Locator Available");
		}
	}
	
	public static void verify_message(String locator, String value, String param) 
	{
		String expectedMessage = param;
		String actualMessage = null;
		
		if(locator.equals("xpath")) 
		{
			 actualMessage = driver.findElement(By.xpath(value)).getText();
		}
		else if(locator.equals("LinkText"))
		{
			 actualMessage = driver.findElement(By.linkText(value)).getText();
		}
		else if(locator.equals("partialLinkText"))
		{
			 actualMessage = driver.findElement(By.partialLinkText(value)).getText();
		}
		else if(locator.equals("cssSelector"))
		{
			 actualMessage = driver.findElement(By.cssSelector(value)).getText();
		}
		else if(locator.equals("tagName"))
		{
			 actualMessage = driver.findElement(By.tagName(value)).getText();
		}
		else 
		{
			driver.findElement(By.xpath(value)).click();
			Assert.assertEquals(actualMessage, expectedMessage);
		}
		
		
	}
	
	public static WebDriver startBrowser(String browserName, String url)
	{
		if(browserName.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","C:/Users/Demoriel Purnell/workspace_python/drivers/geckodriver.exe");
			driver= new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("chrome")) 
		{
			driver = new ChromeDriver();		
		}
		else if(browserName.equalsIgnoreCase("IE")) 
		{
			driver = new InternetExplorerDriver();		
		}
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		return driver;
	}
	
	
}
