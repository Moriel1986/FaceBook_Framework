package Page_Object_Model;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BrowserFactory2 
{
	
	public static WebDriver driver = null;
	File file;
	FileInputStream fip;
	Properties prop;
	
	
	public void initialconfig() 
	{
		file = new File(System.getProperty("user.dir")+ "//src//config//config.properties");
		try {
			fip = new FileInputStream(file);
			prop = new Properties();
			prop.load(fip);
			} 
		catch (FileNotFoundException e)
		{
			
			System.out.println("FileNotFoundException caught ininitialconfig:" + e.getMessage());
		}
		catch (IOException e) 
		{
			
			e.printStackTrace();
		}		
	}
	
	public String ReadProperty(String key) 
	{
		return prop.getProperty(key);
	}
		
	@BeforeMethod
	public void startTest() 
	{
		initialconfig();
		driverClass();
		max_window();
		navigate_url(ReadProperty("URL"));
		timeout(30);
		pageloadTimeout(30);
	}
	
	@AfterMethod
	public void endTest() throws InterruptedException
	{
		closeBrowser();
	}
		
	public void driverClass() 
	{
		initialconfig();
		System.setProperty("webdriver.gecko.driver",ReadProperty("FFDriverPath"));
		driver= new FirefoxDriver();
	}
		
	public void navigate_url(String url) 
	{
		initialconfig();
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
		
	
	public void Print(String value)
	{
		System.out.println(value);
	}
	
	public static void WaitOnElement(WebDriver driver, int time, String value) 
	{
		WebDriverWait wait = new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(value)));
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
	
	public void Xpath_Locator(String xpath_value)
	{
		
		try
		{
			driver.findElement(By.xpath(xpath_value));
		}
		
		catch(NoSuchElementException e)
		{
			System.out.println(e.getMessage());
			System.out.println("No Element Found");
		}
	}
	

	
	
	///////////////////////////////////////Action Methods///////////////////////////////////////////////////////////////////
	
	public void drag_and_drop(String drag_value, String drop_value) 
	{
		Actions action = new Actions(driver);
		action.dragAndDrop(driver.findElement(By.xpath(drag_value)), driver.findElement(By.xpath(drop_value))).build().perform();
	}
	
//	public void drag_and_drop_with_coordinates(String drag_value, int coord_one, int coord_two) 
//	{
//		Actions action = new Actions(driver);
//		action.dragAndDropBy(source, xOffset, yOffset))action.build().perform();
//	}
	
	public void click_and_hold_and_release(String xpath_click_hold_value, String xpath_release_value) 
	{
		Actions action = new Actions(driver);
		action.clickAndHold(driver.findElement(By.xpath(xpath_click_hold_value))).
		release(driver.findElement(By.xpath(xpath_release_value))).build().perform();
	}
	
	
	public void rightClick(String xpath_value) 
	{
		Actions action = new Actions(driver);
		action.contextClick(driver.findElement(By.xpath(xpath_value))).build().perform();
	}
	
	
	public void click_element(String xpath_value) 
	{
		Actions action = new Actions(driver);
		action.click(driver.findElement(By.xpath(xpath_value))).build().perform();
	}
	
	
	public void Click_On_Element(String xpath_value) 
	{
		driver.findElement(By.xpath(xpath_value)).click();
	}
	
	
	
	public void clear(String xpath_value) 
	{
		(driver.findElement(By.xpath(xpath_value))).clear();
	}
	
	public void doubleClick(String xpath_value) 
	{
		Actions action = new Actions(driver);
		action.doubleClick(driver.findElement(By.xpath(xpath_value))).build().perform();
	}
	
	public void KeyDown(String xpath_value) 
	{
		Actions action = new Actions(driver);
		action.keyDown(Keys.CONTROL).click(driver.findElement(By.xpath(xpath_value))).build().perform();
	}
	
	public void KeyUp(String xpath_value) 
	{
		Actions action = new Actions(driver);
		action.keyUp(Keys.CONTROL).click(driver.findElement(By.xpath(xpath_value))).build().perform();
	}
	
	public void moveToElement(String xpath_value)
	{
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath(xpath_value))).build().perform();
	}
	
	public void EnterButton(String text) 
	{
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ENTER).perform();
	}
	
	public void spaceBarButton(String text) 
	{
		Actions action = new Actions(driver);
		action.sendKeys(Keys.SPACE).perform();
	}
	
	public void tabButton(String text) 
	{
		Actions action = new Actions(driver);
		action.sendKeys(Keys.TAB).perform();
	}
	
//	public void inputText(String xpath_value, String text_value) 
//	{
//		Actions action = new Actions(driver);
//		action.sendKeys(driver.findElement(By.xpath(xpath_value)),Keys.values(text_value));
//	}
	
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
		
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
			BrowserFactory2 B = new BrowserFactory2();
			
			if(browserName.equalsIgnoreCase("firefox"))
			{
				System.setProperty("webdriver.gecko.driver","C:/Users/Demoriel Purnell/workspace_python/drivers/geckodriver.exe");
				driver= new FirefoxDriver();
			}
			else if(browserName.equalsIgnoreCase("chrome")) 
			{
				System.setProperty("webdriver.chrome.driver", "C:/Users/Demoriel Purnell/git/FaceBook_Framework/Automation/Driver/chromedriver.exe");
				driver = new ChromeDriver();		
			}
			else if(browserName.equalsIgnoreCase("IE")) 
			{
				System.setProperty("webdriver.ie.driver","C:/Users/Demoriel Purnell/git/FaceBook_Framework/Automation/Driver\\MicrosoftWebDriver.exe");
				driver = new InternetExplorerDriver();		
			}
			else 
			{
				B.Print("No Driver Available");
			}
			
			return driver;
		}
			
		
	}

