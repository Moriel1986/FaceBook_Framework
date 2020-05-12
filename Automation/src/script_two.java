
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class script_two {
WebDriver driver;
	
	
	@Test(priority=1)
	public void launchChromeBrowser() 
	{
		System.setProperty("webdriver.gecko.driver","C:/Users/Demoriel Purnell/workspace_python/drivers/geckodriver.exe");
		driver= new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		String getTitle = driver.getTitle();
		
		System.out.println(getTitle);
		
		System.out.println("Test Passed");
	}
	
	
	@Test(priority=2)
	public void loginAccount() throws InterruptedException 
	{
		Thread.sleep(5000);
		
		WebElement closePopUp = driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
		closePopUp.click();
		
		Thread.sleep(2000);
		
		WebElement search = driver.findElement(By.xpath("//input[@class='LM6RPg']"));
		search.sendKeys("Selenium Book");
		
		Thread.sleep(4000);
		
		WebElement searchButtonClick = driver.findElement(By.xpath("//button[@class='vh79eN']"));
		searchButtonClick.click();
		
		Thread.sleep(3000);
		
		WebElement shipping = driver.findElement(By.xpath("//a[@href='/pages/shipping']"));
		shipping.click();
		
		Thread.sleep(8000);
		
		driver.navigate().back();
		
		Thread.sleep(2000);
		
		WebElement selectBook = driver.findElement(By.xpath("//a[@title='Selenium Testing Tools Cookbook']"));
		selectBook.click();
		
		//SitchFrames or Windows
		
		String ParentWindowHandle = driver.getWindowHandle();
		System.out.println("ParentWindowHandle" + ParentWindowHandle);
		
		
		Thread.sleep(7000);
		
		for(String childTab:driver.getWindowHandles()) {
			driver.switchTo().window(childTab);
			
		}
		
		System.out.println(driver.getTitle());
		
		WebElement checkPin = driver.findElement(By.xpath("//span[@class='_2aK_gu']"));
		checkPin.click();
		
		Thread.sleep(4000);
		
		WebElement checkPin2 = driver.findElement(By.xpath("//span[@class='_2aK_gu']"));
		checkPin2.click();
		
		Thread.sleep(3000);
		
		WebElement addToCart = driver.findElement(By.xpath("//button[@class='_2AkmmA _2Npkh4 _2MWPVK']"));
		addToCart.click();
		
		Thread.sleep(3000);
		
		WebElement placeOrder = driver.findElement(By.xpath("//button[@class='_2AkmmA _14O7kc _7UHT_c']"));
		placeOrder.click();
		
		Thread.sleep(3000);
		
		WebElement enterEmail = driver.findElement(By.xpath("//input[@type='text']"));
		enterEmail.sendKeys("Demoriel1986@hotmail.com");
		
		Thread.sleep(7000);
		
		WebElement continueButtonCheckOut = driver.findElement(By.xpath("//button[@class='_2AkmmA _1poQZq _7UHT_c']"));
		continueButtonCheckOut.click();
		
		Thread.sleep(7000);
		
		WebElement enterPassword = driver.findElement(By.xpath("//input[@type='password']"));
		enterPassword.sendKeys("Kobeisthebest81");
		
		Thread.sleep(3000);
		
		WebElement loginButton2 = driver.findElement(By.xpath("//button[@class='_2AkmmA _1poQZq _7UHT_c']"));
		loginButton2.click();
		
		
		
		
		
	}
	
	
	@Test(priority=3)
	public void logoutAccount() throws InterruptedException 
	{
		
		
		System.out.println("checkout completed");
		
	}
}
